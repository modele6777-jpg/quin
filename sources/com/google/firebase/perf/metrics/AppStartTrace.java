package com.google.firebase.perf.metrics;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import defpackage.b1f;
import defpackage.bh5;
import defpackage.ct;
import defpackage.dn9;
import defpackage.e4f;
import defpackage.eb0;
import defpackage.f48;
import defpackage.fe;
import defpackage.ff5;
import defpackage.ff8;
import defpackage.fq0;
import defpackage.i8c;
import defpackage.ji2;
import defpackage.n8a;
import defpackage.oye;
import defpackage.tec;
import defpackage.toa;
import defpackage.ur9;
import defpackage.vi2;
import defpackage.w48;
import defpackage.y0f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, w48 {
    public static final oye M0 = new oye();
    public static final long N0 = 60000000;
    public static volatile AppStartTrace O0;
    public static ThreadPoolExecutor P0;
    public n8a G0;
    public final e4f b;
    public final ji2 c;
    public final y0f d;
    public Application e;
    public final oye g;
    public final oye v;
    public boolean a = false;
    public boolean f = false;
    public oye w = null;
    public oye x = null;
    public oye y = null;
    public oye z = null;
    public oye X = null;
    public oye Y = null;
    public oye Z = null;
    public oye E0 = null;
    public oye F0 = null;
    public boolean H0 = false;
    public int I0 = 0;
    public final eb0 J0 = new eb0(this);
    public boolean K0 = false;
    public ff8 L0 = null;

    public AppStartTrace(e4f e4fVar, i8c i8cVar, ji2 ji2Var, ThreadPoolExecutor threadPoolExecutor) {
        oye oyeVar = null;
        this.b = e4fVar;
        this.c = ji2Var;
        P0 = threadPoolExecutor;
        y0f y0fVarH = b1f.H();
        y0fVarH.n("_experiment_app_start_ttid");
        this.d = y0fVarH;
        long startElapsedRealtime = Process.getStartElapsedRealtime();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long micros = timeUnit.toMicros(startElapsedRealtime);
        this.g = new oye((micros - oye.a()) + oye.e(), micros);
        fq0 fq0Var = (fq0) ff5.d().b(fq0.class);
        if (fq0Var != null) {
            long micros2 = timeUnit.toMicros(fq0Var.b);
            oyeVar = new oye((micros2 - oye.a()) + oye.e(), micros2);
        }
        this.v = oyeVar;
    }

    public static boolean c(Application application) {
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = application.getPackageName();
        String strL = tec.l(packageName, ":");
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(strL))) {
                return true;
            }
        }
        return false;
    }

    public final oye a() {
        oye oyeVar = this.v;
        return oyeVar != null ? oyeVar : M0;
    }

    public final oye b() {
        oye oyeVar = this.g;
        return oyeVar != null ? oyeVar : a();
    }

    public final void d(y0f y0fVar) {
        if (this.Z == null || this.E0 == null || this.F0 == null) {
            return;
        }
        P0.execute(new fe(6, this, y0fVar));
        e();
    }

    public final synchronized void e() {
        if (this.a) {
            ProcessLifecycleOwner.w.f.b(this);
            this.e.unregisterActivityLifecycleCallbacks(this);
            this.a = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                ff8 ff8Var = this.L0;
                if (ff8Var == null || ff8Var.b != 1) {
                    this.H0 = true;
                }
            } else if (this.x != null) {
                this.H0 = true;
                this.x = null;
            }
            if (!this.H0 && this.w == null) {
                this.K0 = this.K0 || c(this.e);
                new WeakReference(activity);
                this.w = new oye();
                if (b().c(this.w) > N0) {
                    this.f = true;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        View viewFindViewById;
        if (this.H0 || this.f) {
            return;
        }
        ji2 ji2Var = this.c;
        ji2Var.getClass();
        ur9 ur9VarG = ji2Var.g(vi2.n1());
        if ((ur9VarG.b() ? ((Boolean) ur9VarG.a()).booleanValue() : false) && (viewFindViewById = activity.findViewById(R.id.content)) != null) {
            viewFindViewById.getViewTreeObserver().removeOnDrawListener(this.J0);
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [db0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [db0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [db0] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        View viewFindViewById;
        try {
            if (!this.H0 && !this.f) {
                ji2 ji2Var = this.c;
                ji2Var.getClass();
                ur9 ur9VarG = ji2Var.g(vi2.n1());
                final int i = 0;
                boolean zBooleanValue = ur9VarG.b() ? ((Boolean) ur9VarG.a()).booleanValue() : false;
                if (zBooleanValue && (viewFindViewById = activity.findViewById(R.id.content)) != null) {
                    viewFindViewById.getViewTreeObserver().addOnDrawListener(this.J0);
                    viewFindViewById.getViewTreeObserver().addOnDrawListener(new bh5(viewFindViewById, new Runnable(this) { // from class: db0
                        public final /* synthetic */ AppStartTrace b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2 = i;
                            AppStartTrace appStartTrace = this.b;
                            switch (i2) {
                                case 0:
                                    oye oyeVar = AppStartTrace.M0;
                                    y0f y0fVar = appStartTrace.d;
                                    if (appStartTrace.F0 == null) {
                                        appStartTrace.F0 = new oye();
                                        y0f y0fVarH = b1f.H();
                                        y0fVarH.n("_experiment_onDrawFoQ");
                                        y0fVarH.l(appStartTrace.b().a);
                                        y0fVarH.m(appStartTrace.b().c(appStartTrace.F0));
                                        y0fVar.j((b1f) y0fVarH.h());
                                        if (appStartTrace.g != null) {
                                            y0f y0fVarH2 = b1f.H();
                                            y0fVarH2.n("_experiment_procStart_to_classLoad");
                                            y0fVarH2.l(appStartTrace.b().a);
                                            y0fVarH2.m(appStartTrace.b().c(appStartTrace.a()));
                                            y0fVar.j((b1f) y0fVarH2.h());
                                        }
                                        String str = appStartTrace.K0 ? "true" : "false";
                                        y0fVar.i();
                                        ((b1f) y0fVar.b).G().put("systemDeterminedForeground", str);
                                        y0fVar.k(appStartTrace.I0, "onDrawCount");
                                        m8a m8aVarA = appStartTrace.G0.a();
                                        y0fVar.i();
                                        ((b1f) y0fVar.b).t(m8aVarA);
                                        appStartTrace.d(y0fVar);
                                        break;
                                    }
                                    break;
                                case 1:
                                    oye oyeVar2 = AppStartTrace.M0;
                                    y0f y0fVar2 = appStartTrace.d;
                                    if (appStartTrace.Z == null) {
                                        appStartTrace.Z = new oye();
                                        y0fVar2.l(appStartTrace.b().a);
                                        y0fVar2.m(appStartTrace.b().c(appStartTrace.Z));
                                        appStartTrace.d(y0fVar2);
                                        break;
                                    }
                                    break;
                                case 2:
                                    oye oyeVar3 = AppStartTrace.M0;
                                    y0f y0fVar3 = appStartTrace.d;
                                    if (appStartTrace.E0 == null) {
                                        appStartTrace.E0 = new oye();
                                        y0f y0fVarH3 = b1f.H();
                                        y0fVarH3.n("_experiment_preDrawFoQ");
                                        y0fVarH3.l(appStartTrace.b().a);
                                        y0fVarH3.m(appStartTrace.b().c(appStartTrace.E0));
                                        y0fVar3.j((b1f) y0fVarH3.h());
                                        appStartTrace.d(y0fVar3);
                                        break;
                                    }
                                    break;
                                default:
                                    oye oyeVar4 = AppStartTrace.M0;
                                    y0f y0fVarH4 = b1f.H();
                                    y0fVarH4.n(dl2.APP_START_TRACE_NAME.toString());
                                    y0fVarH4.l(appStartTrace.a().a);
                                    y0fVarH4.m(appStartTrace.a().c(appStartTrace.z));
                                    ArrayList arrayList = new ArrayList(3);
                                    y0f y0fVarH5 = b1f.H();
                                    y0fVarH5.n(dl2.ON_CREATE_TRACE_NAME.toString());
                                    y0fVarH5.l(appStartTrace.a().a);
                                    y0fVarH5.m(appStartTrace.a().c(appStartTrace.w));
                                    arrayList.add((b1f) y0fVarH5.h());
                                    if (appStartTrace.y != null) {
                                        y0f y0fVarH6 = b1f.H();
                                        y0fVarH6.n(dl2.ON_START_TRACE_NAME.toString());
                                        y0fVarH6.l(appStartTrace.w.a);
                                        y0fVarH6.m(appStartTrace.w.c(appStartTrace.y));
                                        arrayList.add((b1f) y0fVarH6.h());
                                        y0f y0fVarH7 = b1f.H();
                                        y0fVarH7.n(dl2.ON_RESUME_TRACE_NAME.toString());
                                        y0fVarH7.l(appStartTrace.y.a);
                                        y0fVarH7.m(appStartTrace.y.c(appStartTrace.z));
                                        arrayList.add((b1f) y0fVarH7.h());
                                    }
                                    y0fVarH4.i();
                                    ((b1f) y0fVarH4.b).s(arrayList);
                                    m8a m8aVarA2 = appStartTrace.G0.a();
                                    y0fVarH4.i();
                                    ((b1f) y0fVarH4.b).t(m8aVarA2);
                                    appStartTrace.b.c((b1f) y0fVarH4.h(), zb0.FOREGROUND_BACKGROUND);
                                    break;
                            }
                        }
                    }));
                    final int i2 = 1;
                    final int i3 = 2;
                    viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new toa(viewFindViewById, new Runnable(this) { // from class: db0
                        public final /* synthetic */ AppStartTrace b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i2;
                            AppStartTrace appStartTrace = this.b;
                            switch (i4) {
                                case 0:
                                    oye oyeVar = AppStartTrace.M0;
                                    y0f y0fVar = appStartTrace.d;
                                    if (appStartTrace.F0 == null) {
                                        appStartTrace.F0 = new oye();
                                        y0f y0fVarH = b1f.H();
                                        y0fVarH.n("_experiment_onDrawFoQ");
                                        y0fVarH.l(appStartTrace.b().a);
                                        y0fVarH.m(appStartTrace.b().c(appStartTrace.F0));
                                        y0fVar.j((b1f) y0fVarH.h());
                                        if (appStartTrace.g != null) {
                                            y0f y0fVarH2 = b1f.H();
                                            y0fVarH2.n("_experiment_procStart_to_classLoad");
                                            y0fVarH2.l(appStartTrace.b().a);
                                            y0fVarH2.m(appStartTrace.b().c(appStartTrace.a()));
                                            y0fVar.j((b1f) y0fVarH2.h());
                                        }
                                        String str = appStartTrace.K0 ? "true" : "false";
                                        y0fVar.i();
                                        ((b1f) y0fVar.b).G().put("systemDeterminedForeground", str);
                                        y0fVar.k(appStartTrace.I0, "onDrawCount");
                                        m8a m8aVarA = appStartTrace.G0.a();
                                        y0fVar.i();
                                        ((b1f) y0fVar.b).t(m8aVarA);
                                        appStartTrace.d(y0fVar);
                                        break;
                                    }
                                    break;
                                case 1:
                                    oye oyeVar2 = AppStartTrace.M0;
                                    y0f y0fVar2 = appStartTrace.d;
                                    if (appStartTrace.Z == null) {
                                        appStartTrace.Z = new oye();
                                        y0fVar2.l(appStartTrace.b().a);
                                        y0fVar2.m(appStartTrace.b().c(appStartTrace.Z));
                                        appStartTrace.d(y0fVar2);
                                        break;
                                    }
                                    break;
                                case 2:
                                    oye oyeVar3 = AppStartTrace.M0;
                                    y0f y0fVar3 = appStartTrace.d;
                                    if (appStartTrace.E0 == null) {
                                        appStartTrace.E0 = new oye();
                                        y0f y0fVarH3 = b1f.H();
                                        y0fVarH3.n("_experiment_preDrawFoQ");
                                        y0fVarH3.l(appStartTrace.b().a);
                                        y0fVarH3.m(appStartTrace.b().c(appStartTrace.E0));
                                        y0fVar3.j((b1f) y0fVarH3.h());
                                        appStartTrace.d(y0fVar3);
                                        break;
                                    }
                                    break;
                                default:
                                    oye oyeVar4 = AppStartTrace.M0;
                                    y0f y0fVarH4 = b1f.H();
                                    y0fVarH4.n(dl2.APP_START_TRACE_NAME.toString());
                                    y0fVarH4.l(appStartTrace.a().a);
                                    y0fVarH4.m(appStartTrace.a().c(appStartTrace.z));
                                    ArrayList arrayList = new ArrayList(3);
                                    y0f y0fVarH5 = b1f.H();
                                    y0fVarH5.n(dl2.ON_CREATE_TRACE_NAME.toString());
                                    y0fVarH5.l(appStartTrace.a().a);
                                    y0fVarH5.m(appStartTrace.a().c(appStartTrace.w));
                                    arrayList.add((b1f) y0fVarH5.h());
                                    if (appStartTrace.y != null) {
                                        y0f y0fVarH6 = b1f.H();
                                        y0fVarH6.n(dl2.ON_START_TRACE_NAME.toString());
                                        y0fVarH6.l(appStartTrace.w.a);
                                        y0fVarH6.m(appStartTrace.w.c(appStartTrace.y));
                                        arrayList.add((b1f) y0fVarH6.h());
                                        y0f y0fVarH7 = b1f.H();
                                        y0fVarH7.n(dl2.ON_RESUME_TRACE_NAME.toString());
                                        y0fVarH7.l(appStartTrace.y.a);
                                        y0fVarH7.m(appStartTrace.y.c(appStartTrace.z));
                                        arrayList.add((b1f) y0fVarH7.h());
                                    }
                                    y0fVarH4.i();
                                    ((b1f) y0fVarH4.b).s(arrayList);
                                    m8a m8aVarA2 = appStartTrace.G0.a();
                                    y0fVarH4.i();
                                    ((b1f) y0fVarH4.b).t(m8aVarA2);
                                    appStartTrace.b.c((b1f) y0fVarH4.h(), zb0.FOREGROUND_BACKGROUND);
                                    break;
                            }
                        }
                    }, new Runnable(this) { // from class: db0
                        public final /* synthetic */ AppStartTrace b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i3;
                            AppStartTrace appStartTrace = this.b;
                            switch (i4) {
                                case 0:
                                    oye oyeVar = AppStartTrace.M0;
                                    y0f y0fVar = appStartTrace.d;
                                    if (appStartTrace.F0 == null) {
                                        appStartTrace.F0 = new oye();
                                        y0f y0fVarH = b1f.H();
                                        y0fVarH.n("_experiment_onDrawFoQ");
                                        y0fVarH.l(appStartTrace.b().a);
                                        y0fVarH.m(appStartTrace.b().c(appStartTrace.F0));
                                        y0fVar.j((b1f) y0fVarH.h());
                                        if (appStartTrace.g != null) {
                                            y0f y0fVarH2 = b1f.H();
                                            y0fVarH2.n("_experiment_procStart_to_classLoad");
                                            y0fVarH2.l(appStartTrace.b().a);
                                            y0fVarH2.m(appStartTrace.b().c(appStartTrace.a()));
                                            y0fVar.j((b1f) y0fVarH2.h());
                                        }
                                        String str = appStartTrace.K0 ? "true" : "false";
                                        y0fVar.i();
                                        ((b1f) y0fVar.b).G().put("systemDeterminedForeground", str);
                                        y0fVar.k(appStartTrace.I0, "onDrawCount");
                                        m8a m8aVarA = appStartTrace.G0.a();
                                        y0fVar.i();
                                        ((b1f) y0fVar.b).t(m8aVarA);
                                        appStartTrace.d(y0fVar);
                                        break;
                                    }
                                    break;
                                case 1:
                                    oye oyeVar2 = AppStartTrace.M0;
                                    y0f y0fVar2 = appStartTrace.d;
                                    if (appStartTrace.Z == null) {
                                        appStartTrace.Z = new oye();
                                        y0fVar2.l(appStartTrace.b().a);
                                        y0fVar2.m(appStartTrace.b().c(appStartTrace.Z));
                                        appStartTrace.d(y0fVar2);
                                        break;
                                    }
                                    break;
                                case 2:
                                    oye oyeVar3 = AppStartTrace.M0;
                                    y0f y0fVar3 = appStartTrace.d;
                                    if (appStartTrace.E0 == null) {
                                        appStartTrace.E0 = new oye();
                                        y0f y0fVarH3 = b1f.H();
                                        y0fVarH3.n("_experiment_preDrawFoQ");
                                        y0fVarH3.l(appStartTrace.b().a);
                                        y0fVarH3.m(appStartTrace.b().c(appStartTrace.E0));
                                        y0fVar3.j((b1f) y0fVarH3.h());
                                        appStartTrace.d(y0fVar3);
                                        break;
                                    }
                                    break;
                                default:
                                    oye oyeVar4 = AppStartTrace.M0;
                                    y0f y0fVarH4 = b1f.H();
                                    y0fVarH4.n(dl2.APP_START_TRACE_NAME.toString());
                                    y0fVarH4.l(appStartTrace.a().a);
                                    y0fVarH4.m(appStartTrace.a().c(appStartTrace.z));
                                    ArrayList arrayList = new ArrayList(3);
                                    y0f y0fVarH5 = b1f.H();
                                    y0fVarH5.n(dl2.ON_CREATE_TRACE_NAME.toString());
                                    y0fVarH5.l(appStartTrace.a().a);
                                    y0fVarH5.m(appStartTrace.a().c(appStartTrace.w));
                                    arrayList.add((b1f) y0fVarH5.h());
                                    if (appStartTrace.y != null) {
                                        y0f y0fVarH6 = b1f.H();
                                        y0fVarH6.n(dl2.ON_START_TRACE_NAME.toString());
                                        y0fVarH6.l(appStartTrace.w.a);
                                        y0fVarH6.m(appStartTrace.w.c(appStartTrace.y));
                                        arrayList.add((b1f) y0fVarH6.h());
                                        y0f y0fVarH7 = b1f.H();
                                        y0fVarH7.n(dl2.ON_RESUME_TRACE_NAME.toString());
                                        y0fVarH7.l(appStartTrace.y.a);
                                        y0fVarH7.m(appStartTrace.y.c(appStartTrace.z));
                                        arrayList.add((b1f) y0fVarH7.h());
                                    }
                                    y0fVarH4.i();
                                    ((b1f) y0fVarH4.b).s(arrayList);
                                    m8a m8aVarA2 = appStartTrace.G0.a();
                                    y0fVarH4.i();
                                    ((b1f) y0fVarH4.b).t(m8aVarA2);
                                    appStartTrace.b.c((b1f) y0fVarH4.h(), zb0.FOREGROUND_BACKGROUND);
                                    break;
                            }
                        }
                    }));
                }
                if (this.z != null) {
                    return;
                }
                new WeakReference(activity);
                this.z = new oye();
                this.G0 = SessionManager.getInstance().perfSession();
                ct.d().a("onResume(): " + activity.getClass().getName() + ": " + a().c(this.z) + " microseconds");
                final int i4 = 3;
                P0.execute(new Runnable(this) { // from class: db0
                    public final /* synthetic */ AppStartTrace b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i5 = i4;
                        AppStartTrace appStartTrace = this.b;
                        switch (i5) {
                            case 0:
                                oye oyeVar = AppStartTrace.M0;
                                y0f y0fVar = appStartTrace.d;
                                if (appStartTrace.F0 == null) {
                                    appStartTrace.F0 = new oye();
                                    y0f y0fVarH = b1f.H();
                                    y0fVarH.n("_experiment_onDrawFoQ");
                                    y0fVarH.l(appStartTrace.b().a);
                                    y0fVarH.m(appStartTrace.b().c(appStartTrace.F0));
                                    y0fVar.j((b1f) y0fVarH.h());
                                    if (appStartTrace.g != null) {
                                        y0f y0fVarH2 = b1f.H();
                                        y0fVarH2.n("_experiment_procStart_to_classLoad");
                                        y0fVarH2.l(appStartTrace.b().a);
                                        y0fVarH2.m(appStartTrace.b().c(appStartTrace.a()));
                                        y0fVar.j((b1f) y0fVarH2.h());
                                    }
                                    String str = appStartTrace.K0 ? "true" : "false";
                                    y0fVar.i();
                                    ((b1f) y0fVar.b).G().put("systemDeterminedForeground", str);
                                    y0fVar.k(appStartTrace.I0, "onDrawCount");
                                    m8a m8aVarA = appStartTrace.G0.a();
                                    y0fVar.i();
                                    ((b1f) y0fVar.b).t(m8aVarA);
                                    appStartTrace.d(y0fVar);
                                    break;
                                }
                                break;
                            case 1:
                                oye oyeVar2 = AppStartTrace.M0;
                                y0f y0fVar2 = appStartTrace.d;
                                if (appStartTrace.Z == null) {
                                    appStartTrace.Z = new oye();
                                    y0fVar2.l(appStartTrace.b().a);
                                    y0fVar2.m(appStartTrace.b().c(appStartTrace.Z));
                                    appStartTrace.d(y0fVar2);
                                    break;
                                }
                                break;
                            case 2:
                                oye oyeVar3 = AppStartTrace.M0;
                                y0f y0fVar3 = appStartTrace.d;
                                if (appStartTrace.E0 == null) {
                                    appStartTrace.E0 = new oye();
                                    y0f y0fVarH3 = b1f.H();
                                    y0fVarH3.n("_experiment_preDrawFoQ");
                                    y0fVarH3.l(appStartTrace.b().a);
                                    y0fVarH3.m(appStartTrace.b().c(appStartTrace.E0));
                                    y0fVar3.j((b1f) y0fVarH3.h());
                                    appStartTrace.d(y0fVar3);
                                    break;
                                }
                                break;
                            default:
                                oye oyeVar4 = AppStartTrace.M0;
                                y0f y0fVarH4 = b1f.H();
                                y0fVarH4.n(dl2.APP_START_TRACE_NAME.toString());
                                y0fVarH4.l(appStartTrace.a().a);
                                y0fVarH4.m(appStartTrace.a().c(appStartTrace.z));
                                ArrayList arrayList = new ArrayList(3);
                                y0f y0fVarH5 = b1f.H();
                                y0fVarH5.n(dl2.ON_CREATE_TRACE_NAME.toString());
                                y0fVarH5.l(appStartTrace.a().a);
                                y0fVarH5.m(appStartTrace.a().c(appStartTrace.w));
                                arrayList.add((b1f) y0fVarH5.h());
                                if (appStartTrace.y != null) {
                                    y0f y0fVarH6 = b1f.H();
                                    y0fVarH6.n(dl2.ON_START_TRACE_NAME.toString());
                                    y0fVarH6.l(appStartTrace.w.a);
                                    y0fVarH6.m(appStartTrace.w.c(appStartTrace.y));
                                    arrayList.add((b1f) y0fVarH6.h());
                                    y0f y0fVarH7 = b1f.H();
                                    y0fVarH7.n(dl2.ON_RESUME_TRACE_NAME.toString());
                                    y0fVarH7.l(appStartTrace.y.a);
                                    y0fVarH7.m(appStartTrace.y.c(appStartTrace.z));
                                    arrayList.add((b1f) y0fVarH7.h());
                                }
                                y0fVarH4.i();
                                ((b1f) y0fVarH4.b).s(arrayList);
                                m8a m8aVarA2 = appStartTrace.G0.a();
                                y0fVarH4.i();
                                ((b1f) y0fVarH4.b).t(m8aVarA2);
                                appStartTrace.b.c((b1f) y0fVarH4.h(), zb0.FOREGROUND_BACKGROUND);
                                break;
                        }
                    }
                });
                if (!zBooleanValue) {
                    e();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        if (!this.H0 && this.y == null && !this.f) {
            this.y = new oye();
        }
    }

    @dn9(f48.ON_STOP)
    public void onAppEnteredBackground() {
        if (this.H0 || this.f || this.Y != null) {
            return;
        }
        this.Y = new oye();
        y0f y0fVarH = b1f.H();
        y0fVarH.n("_experiment_firstBackgrounding");
        y0fVarH.l(b().a);
        y0fVarH.m(b().c(this.Y));
        this.d.j((b1f) y0fVarH.h());
    }

    @dn9(f48.ON_START)
    public void onAppEnteredForeground() {
        if (this.H0 || this.f || this.X != null) {
            return;
        }
        this.X = new oye();
        y0f y0fVarH = b1f.H();
        y0fVarH.n("_experiment_firstForegrounding");
        y0fVarH.l(b().a);
        y0fVarH.m(b().c(this.X));
        this.d.j((b1f) y0fVarH.h());
    }

    public static void setLauncherActivityOnCreateTime(String str) {
    }

    public static void setLauncherActivityOnResumeTime(String str) {
    }

    public static void setLauncherActivityOnStartTime(String str) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
