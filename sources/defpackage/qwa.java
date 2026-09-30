package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qwa {
    public static final qxb a = new qxb();
    public static final Object b = new Object();
    public static jy4 c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? q6.q(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static jy4 b() {
        jy4 jy4Var = new jy4(20);
        c = jy4Var;
        a.k(jy4Var);
        return c;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x002e  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    public static void c(Context context, boolean z) {
        int i;
        boolean z2;
        int i2;
        File file;
        boolean z3;
        File file2;
        long length;
        boolean z4;
        File file3;
        pwa pwaVarA;
        pwa pwaVar;
        int i3;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z || c == null) {
            synchronized (b) {
                if (z) {
                    i = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 28) {
                        file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length2 = file.length();
                        if (file.exists()) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        length = file2.length();
                        if (file2.exists()) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        long jA = a(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            pwaVarA = pwa.a(file3);
                        } else {
                            pwaVarA = null;
                        }
                        if (pwaVarA == null) {
                            if (!z2) {
                                i = 327680;
                            } else if (z3) {
                                i = 1;
                            } else if (z4) {
                                i = 2;
                            }
                        } else if (!z2) {
                            i = 327680;
                        } else if (z3) {
                            i = 1;
                        } else if (z4) {
                            i = 2;
                        }
                        if (z) {
                            i = 2;
                        }
                        if (pwaVarA != null) {
                            i = 3;
                        }
                        pwaVar = new pwa(jA, 1, i, length);
                        if (pwaVarA != null) {
                            pwaVar.b(file3);
                        } else {
                            pwaVar.b(file3);
                        }
                        b();
                        return;
                    }
                    b();
                    return;
                }
                if (c != null) {
                    return;
                }
                i = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        if (assetFileDescriptorOpenFd.getLength() > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        assetFileDescriptorOpenFd.close();
                        i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 28 && i2 != 30) {
                            file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                            long length3 = file.length();
                            if (file.exists() || length3 <= 0) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                            length = file2.length();
                            if (file2.exists() || length <= 0) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            try {
                                long jA2 = a(context);
                                file3 = new File(context.getFilesDir(), "profileInstalled");
                                if (file3.exists()) {
                                    try {
                                        pwaVarA = pwa.a(file3);
                                    } catch (IOException unused) {
                                        b();
                                        return;
                                    }
                                } else {
                                    pwaVarA = null;
                                }
                                if (pwaVarA == null && pwaVarA.c == jA2 && (i3 = pwaVarA.b) != 2) {
                                    i = i3;
                                } else if (!z2) {
                                    i = 327680;
                                } else if (z3) {
                                    i = 1;
                                } else if (z4) {
                                    i = 2;
                                }
                                if (z && z4 && i != 1) {
                                    i = 2;
                                }
                                if (pwaVarA != null && pwaVarA.b == 2 && i == 1 && length3 < pwaVarA.d) {
                                    i = 3;
                                }
                                pwaVar = new pwa(jA2, 1, i, length);
                                if (pwaVarA != null || !pwaVarA.equals(pwaVar)) {
                                    try {
                                        pwaVar.b(file3);
                                    } catch (IOException unused2) {
                                    }
                                }
                                b();
                                return;
                            } catch (PackageManager.NameNotFoundException unused3) {
                                b();
                                return;
                            }
                        }
                        b();
                        return;
                    } catch (Throwable th) {
                        if (assetFileDescriptorOpenFd == null) {
                            throw th;
                        }
                        try {
                            assetFileDescriptorOpenFd.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException unused4) {
                    z2 = false;
                }
                throw th;
            }
        }
    }
}
