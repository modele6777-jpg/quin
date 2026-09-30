package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Looper;
import com.adjust.sdk.sig.r3;
import defpackage.c6c;
import defpackage.ks0;
import defpackage.pk1;
import defpackage.vh2;
import io.sentry.i5;
import io.sentry.q5;
import io.sentry.s5;
import io.sentry.s6;
import io.sentry.t4;
import io.sentry.v4;
import io.sentry.v5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class s0 implements io.sentry.f0 {
    public final Context a;
    public final o0 b;
    public final SentryAndroidOptions c;
    public final Future d;
    public final io.sentry.util.f e = new io.sentry.util.f(new r3(23));

    public s0(Context context, o0 o0Var, SentryAndroidOptions sentryAndroidOptions) {
        Future futureSubmit;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.b = o0Var;
        this.c = sentryAndroidOptions;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new r0());
        try {
            futureSubmit = executorServiceNewSingleThreadExecutor.submit(new vh2(8, this, sentryAndroidOptions));
        } catch (RejectedExecutionException e) {
            sentryAndroidOptions.getLogger().d(q5.WARNING, "Device info caching task rejected.", e);
            futureSubmit = null;
        }
        this.d = futureSubmit;
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    public final void a(v4 v4Var, io.sentry.l0 l0Var) {
        Boolean bool;
        io.sentry.protocol.a aVarE = v4Var.b.e();
        if (aVarE == null) {
            aVarE = new io.sentry.protocol.a();
        }
        aVarE.e = (String) p0.c.a(this.a);
        io.sentry.android.core.performance.h hVarB = io.sentry.android.core.performance.g.c().b(this.c);
        u0 u0Var = null;
        if (hVarB.d()) {
            v5 v5VarB = hVarB.b();
            aVarE.b = v5VarB == null ? null : new Date((long) (v5VarB.a / 1000000.0d));
        }
        if (!io.sentry.util.b.k(l0Var) && aVarE.y == null && (bool = i0.e.d) != null) {
            aVarE.y = Boolean.valueOf(!bool.booleanValue());
        }
        Context context = this.a;
        SentryAndroidOptions sentryAndroidOptions = this.c;
        io.sentry.z0 logger = sentryAndroidOptions.getLogger();
        o0 o0Var = this.b;
        PackageInfo packageInfoD = p0.d(context, logger, o0Var);
        if (packageInfoD != null) {
            String strF = p0.f(packageInfoD, o0Var);
            if (v4Var.z == null) {
                v4Var.z = strF;
            }
            Future future = this.d;
            if (future != null) {
                try {
                    u0Var = (u0) future.get();
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().d(q5.ERROR, "Failed to retrieve device info", th);
                }
            } else {
                sentryAndroidOptions.getLogger().i(q5.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            aVarE.a = packageInfoD.packageName;
            aVarE.f = packageInfoD.versionName;
            aVarE.g = p0.f(packageInfoD, o0Var);
            HashMap map = new HashMap();
            String[] strArr = packageInfoD.requestedPermissions;
            int[] iArr = packageInfoD.requestedPermissionsFlags;
            if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
                for (int i = 0; i < strArr.length; i++) {
                    String str = strArr[i];
                    map.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i] & 2) == 2 ? "granted" : "not_granted");
                }
            }
            aVarE.v = map;
            if (u0Var != null) {
                try {
                    pk1 pk1Var = u0Var.f;
                    if (pk1Var != null) {
                        aVarE.z = Boolean.valueOf(pk1Var.b);
                        String[] strArr2 = (String[]) pk1Var.c;
                        if (strArr2 != null) {
                            aVarE.X = Arrays.asList(strArr2);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        v4Var.b.n(aVarE);
    }

    @Override // io.sentry.f0
    public final s6 b(s6 s6Var, io.sentry.l0 l0Var) {
        boolean zD = d(s6Var, l0Var);
        if (zD) {
            a(s6Var, l0Var);
        }
        c(s6Var, false, zD);
        return s6Var;
    }

    public final void c(v4 v4Var, boolean z, boolean z2) {
        io.sentry.protocol.i0 i0Var = v4Var.w;
        if (i0Var == null) {
            i0Var = new io.sentry.protocol.i0();
            v4Var.w = i0Var;
        }
        if (i0Var.b == null) {
            i0Var.b = z0.a(this.a);
        }
        String str = i0Var.d;
        SentryAndroidOptions sentryAndroidOptions = this.c;
        if (str == null && sentryAndroidOptions.isSendDefaultPii()) {
            i0Var.d = "{{auto}}";
        }
        io.sentry.protocol.e eVar = v4Var.b;
        io.sentry.protocol.h hVarF = eVar.f();
        Future future = this.d;
        if (hVarF == null) {
            if (future != null) {
                try {
                    eVar.p(((u0) future.get()).a(z, z2));
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().d(q5.ERROR, "Failed to retrieve device info", th);
                }
            } else {
                sentryAndroidOptions.getLogger().i(q5.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            io.sentry.protocol.q qVarH = eVar.h();
            if (future != null) {
                try {
                    eVar.s(((u0) future.get()).g);
                } catch (Throwable th2) {
                    sentryAndroidOptions.getLogger().d(q5.ERROR, "Failed to retrieve os system", th2);
                }
            } else {
                sentryAndroidOptions.getLogger().i(q5.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            if (qVarH != null) {
                String str2 = qVarH.a;
                eVar.l(qVarH, (str2 == null || str2.isEmpty()) ? "os_1" : "os_" + str2.trim().toLowerCase(Locale.ROOT));
            }
        }
        if (future == null) {
            sentryAndroidOptions.getLogger().i(q5.ERROR, "Failed to retrieve device info", new Object[0]);
            return;
        }
        try {
            c6c c6cVar = ((u0) future.get()).e;
            if (c6cVar != null) {
                HashMap map = new HashMap();
                map.put("isSideLoaded", String.valueOf(c6cVar.a));
                String str3 = c6cVar.b;
                if (str3 != null) {
                    map.put("installerStore", str3);
                }
                for (Map.Entry entry : map.entrySet()) {
                    v4Var.b((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().d(q5.ERROR, "Error getting side loaded info.", th3);
        }
    }

    public final boolean d(v4 v4Var, io.sentry.l0 l0Var) {
        if (io.sentry.util.b.s(l0Var)) {
            return true;
        }
        this.c.getLogger().i(q5.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", v4Var.a);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    @Override // io.sentry.f0
    public final i5 h(i5 i5Var, io.sentry.l0 l0Var) {
        io.sentry.protocol.c0 c0Var;
        List list;
        boolean z;
        boolean zD = d(i5Var, l0Var);
        if (zD) {
            a(i5Var, l0Var);
            if (i5Var.e() != null) {
                boolean zK = io.sentry.util.b.k(l0Var);
                for (io.sentry.protocol.e0 e0Var : i5Var.e()) {
                    io.sentry.android.core.internal.util.e.a.getClass();
                    Long l = e0Var.a;
                    if (l == null) {
                        z = false;
                    } else if (io.sentry.android.core.internal.util.e.d(Looper.getMainLooper().getThread()) == l.longValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (e0Var.f == null) {
                        e0Var.f = Boolean.valueOf(z);
                    }
                    if (!zK && e0Var.v == null) {
                        e0Var.v = Boolean.valueOf(z);
                    }
                }
            }
        }
        c(i5Var, true, zD);
        ArrayList arrayListD = i5Var.d();
        if (arrayListD != null && arrayListD.size() > 1) {
            io.sentry.protocol.v vVar = (io.sentry.protocol.v) ks0.f(1, arrayListD);
            if ("java.lang".equals(vVar.c) && (c0Var = vVar.e) != null && (list = c0Var.a) != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if ("com.android.internal.os.RuntimeInit$MethodAndArgsCaller".equals(((io.sentry.protocol.a0) it.next()).f)) {
                        Collections.reverse(arrayListD);
                        break;
                    }
                }
            }
        }
        return i5Var;
    }

    @Override // io.sentry.f0
    public final io.sentry.protocol.f0 l(io.sentry.protocol.f0 f0Var, io.sentry.l0 l0Var) {
        boolean zD = d(f0Var, l0Var);
        if (zD) {
            a(f0Var, l0Var);
        }
        c(f0Var, false, zD);
        return f0Var;
    }

    @Override // io.sentry.f0
    public final s5 u(s5 s5Var) {
        SentryAndroidOptions sentryAndroidOptions = this.c;
        try {
            t4 t4Var = t4.STRING;
            s5Var.a("device.brand", new io.sentry.protocol.n(t4Var, (Object) Build.BRAND));
            s5Var.a("device.model", new io.sentry.protocol.n(Build.MODEL, t4Var.apiName()));
            s5Var.a("device.family", new io.sentry.protocol.n(this.e.a(), t4Var.apiName()));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(q5.ERROR, "Failed to retrieve device info", th);
        }
        try {
            t4 t4Var2 = t4.STRING;
            s5Var.a("os.name", new io.sentry.protocol.n(t4Var2, (Object) "Android"));
            s5Var.a("os.version", new io.sentry.protocol.n(Build.VERSION.RELEASE, t4Var2.apiName()));
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().d(q5.ERROR, "Failed to retrieve os system", th2);
        }
        return s5Var;
    }
}
