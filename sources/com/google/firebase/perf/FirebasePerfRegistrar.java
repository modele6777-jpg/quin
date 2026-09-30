package com.google.firebase.perf;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import defpackage.bqb;
import defpackage.cg5;
import defpackage.dg5;
import defpackage.e4f;
import defpackage.ff5;
import defpackage.ff8;
import defpackage.fq0;
import defpackage.gb0;
import defpackage.hc2;
import defpackage.i8c;
import defpackage.ji2;
import defpackage.jy4;
import defpackage.jzb;
import defpackage.kb2;
import defpackage.kb6;
import defpackage.lb2;
import defpackage.m6c;
import defpackage.mjg;
import defpackage.of5;
import defpackage.pd4;
import defpackage.qi4;
import defpackage.ssg;
import defpackage.szc;
import defpackage.wwg;
import defpackage.xb2;
import defpackage.xq3;
import defpackage.xw3;
import defpackage.y25;
import defpackage.y3b;
import defpackage.y3f;
import defpackage.yaf;
import defpackage.yf5;
import defpackage.yx4;
import defpackage.z7f;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* JADX INFO: Access modifiers changed from: private */
    public static yf5 lambda$getComponents$0(y3b y3bVar, xb2 xb2Var) {
        AppStartTrace appStartTrace;
        int i;
        ff8 ff8Var;
        ff5 ff5Var = (ff5) xb2Var.a(ff5.class);
        fq0 fq0Var = (fq0) xb2Var.e(fq0.class).get();
        Executor executor = (Executor) xb2Var.r(y3bVar);
        yf5 yf5Var = new yf5();
        ff5Var.a();
        Context context = ff5Var.a;
        ji2 ji2VarE = ji2.e();
        ji2VarE.getClass();
        ji2.d.a = jzb.l(context);
        ji2VarE.c.c(context);
        gb0 gb0VarA = gb0.a();
        synchronized (gb0VarA) {
            if (!gb0VarA.Z) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(gb0VarA);
                    gb0VarA.Z = true;
                }
            }
        }
        dg5 dg5Var = new dg5();
        synchronized (gb0VarA.g) {
            gb0VarA.g.add(dg5Var);
        }
        if (fq0Var != null) {
            if (AppStartTrace.O0 != null) {
                appStartTrace = AppStartTrace.O0;
            } else {
                e4f e4fVar = e4f.H0;
                i8c i8cVar = new i8c(18);
                if (AppStartTrace.O0 == null) {
                    synchronized (AppStartTrace.class) {
                        try {
                            if (AppStartTrace.O0 == null) {
                                AppStartTrace.O0 = new AppStartTrace(e4fVar, i8cVar, ji2.e(), new ThreadPoolExecutor(0, 1, 10 + AppStartTrace.N0, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                appStartTrace = AppStartTrace.O0;
            }
            synchronized (appStartTrace) {
                if (!appStartTrace.a) {
                    ProcessLifecycleOwner.w.f.a(appStartTrace);
                    Context applicationContext2 = context.getApplicationContext();
                    if (applicationContext2 instanceof Application) {
                        ((Application) applicationContext2).registerActivityLifecycleCallbacks(appStartTrace);
                        appStartTrace.K0 = appStartTrace.K0 || AppStartTrace.c((Application) applicationContext2);
                        int i2 = Build.VERSION.SDK_INT;
                        int i3 = 2;
                        if (((ActivityManager) ((Application) applicationContext2).getSystemService("activity")) == null) {
                            ff8Var = new ff8(i3, i3);
                        } else {
                            try {
                                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                                i = runningAppProcessInfo.importance;
                            } catch (Throwable unused) {
                                i = -1;
                            }
                            if (i2 >= 34) {
                                ff8Var = new ff8(i == 100 ? 1 : 2, i3);
                            } else {
                                ff8Var = new ff8(i3, i3);
                            }
                        }
                        appStartTrace.L0 = ff8Var;
                        appStartTrace.a = true;
                        appStartTrace.e = (Application) applicationContext2;
                    }
                }
            }
            if (Build.VERSION.SDK_INT < 34) {
                executor.execute(new wwg(5, appStartTrace));
            }
        }
        SessionManager.getInstance().initializeGaugeCollection();
        return yf5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static cg5 providesFirebasePerformance(xb2 xb2Var) {
        xb2Var.a(yf5.class);
        szc szcVar = new szc((ff5) xb2Var.a(ff5.class), (of5) xb2Var.a(of5.class), xb2Var.e(bqb.class), xb2Var.e(y3f.class), 16);
        int i = 17;
        return (cg5) ((qi4) qi4.a(new hc2(new mjg(szcVar), new m6c(i, szcVar), new ssg(i, szcVar), new kb6(15, szcVar), new jy4(szcVar), new yx4(szcVar), new y25(2, szcVar), 5))).get();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<lb2> getComponents() {
        y3b y3bVar = new y3b(yaf.class, Executor.class);
        kb2 kb2VarB = lb2.b(cg5.class);
        kb2VarB.a = LIBRARY_NAME;
        kb2VarB.a(xw3.c(ff5.class));
        kb2VarB.a(new xw3(1, 1, bqb.class));
        kb2VarB.a(xw3.c(of5.class));
        kb2VarB.a(new xw3(1, 1, y3f.class));
        kb2VarB.a(xw3.c(yf5.class));
        kb2VarB.f = new pd4(27);
        lb2 lb2VarB = kb2VarB.b();
        kb2 kb2VarB2 = lb2.b(yf5.class);
        kb2VarB2.a = EARLY_LIBRARY_NAME;
        kb2VarB2.a(xw3.c(ff5.class));
        kb2VarB2.a(xw3.a(fq0.class));
        kb2VarB2.a(new xw3(y3bVar, 1, 0));
        kb2VarB2.c(2);
        kb2VarB2.f = new xq3(y3bVar, 2);
        return Arrays.asList(lb2VarB, kb2VarB2.b(), z7f.B(LIBRARY_NAME, "22.0.6"));
    }
}
