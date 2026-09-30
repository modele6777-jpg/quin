package io.sentry.android.core.internal.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.adjust.sdk.Constants;
import io.sentry.android.core.o0;
import io.sentry.q5;
import io.sentry.z0;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i {
    public static final Charset g = Charset.forName(Constants.ENCODING);
    public final Context a;
    public final o0 b;
    public final z0 c;
    public final String[] d;
    public final String[] e;
    public final Runtime f;

    public i(Context context, z0 z0Var, o0 o0Var) {
        Runtime runtime = Runtime.getRuntime();
        this.a = context;
        io.sentry.util.b.r(o0Var, "The BuildInfoProvider is required.");
        this.b = o0Var;
        io.sentry.util.b.r(z0Var, "The Logger is required.");
        this.c = z0Var;
        this.d = new String[]{"/sbin/su", "/data/local/xbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/bin/su", "/system/app/Superuser.apk", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"};
        this.e = new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"};
        io.sentry.util.b.r(runtime, "The Runtime is required.");
        this.f = runtime;
    }

    /* JADX INFO: Removed unreachable split cross block B:64:0x00c1 */
    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    public final boolean a() {
        boolean z;
        this.b.getClass();
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return true;
        }
        String[] strArr = this.d;
        int length = strArr.length;
        int i = 0;
        while (true) {
            z0 z0Var = this.c;
            if (i >= length) {
                Process process = null;
                try {
                    try {
                        try {
                            Process processExec = this.f.exec(new String[]{"/system/xbin/which", "su"});
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream(), g));
                            try {
                                z = bufferedReader.readLine() != null;
                                bufferedReader.close();
                                processExec.destroy();
                            } catch (Throwable th) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            z0Var.d(q5.DEBUG, "Error when trying to check if SU exists.", th3);
                            if (0 != 0) {
                                process.destroy();
                            }
                            z = false;
                        }
                    } catch (IOException unused) {
                        z0Var.i(q5.DEBUG, "SU isn't found on this Device.", new Object[0]);
                        if (0 != 0) {
                            process.destroy();
                        }
                        z = false;
                    }
                    if (z) {
                        return true;
                    }
                    io.sentry.util.b.r(z0Var, "The ILogger object is required.");
                    PackageManager packageManager = this.a.getPackageManager();
                    if (packageManager != null) {
                        for (String str2 : this.e) {
                            try {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    packageManager.getPackageInfo(str2, PackageManager.PackageInfoFlags.of(0L));
                                    return true;
                                }
                                packageManager.getPackageInfo(str2, 0);
                                return true;
                            } catch (PackageManager.NameNotFoundException unused2) {
                            }
                        }
                    }
                    return false;
                } catch (Throwable th4) {
                    if (0 != 0) {
                        process.destroy();
                    }
                    throw th4;
                }
            }
            String str3 = strArr[i];
            try {
                if (new File(str3).exists()) {
                    return true;
                }
                i++;
            } catch (RuntimeException e) {
                z0Var.c(q5.ERROR, e, "Error when trying to check if root file %s exists.", str3);
            }
        }
    }
}
