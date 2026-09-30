package defpackage;

import android.app.Activity;
import android.app.Application;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h5g implements Application.ActivityLifecycleCallbacks {
    public static final h5g a = new h5g();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final LinkedHashMap c = new LinkedHashMap();

    public static hs3 a(r4g r4gVar) {
        int iOrdinal = r4gVar.ordinal();
        if (iOrdinal == 0) {
            return xqa.J0;
        }
        if (iOrdinal == 1) {
            return xqa.M0;
        }
        ap.c();
        return null;
    }

    public static hs3 c(r4g r4gVar) {
        int iOrdinal = r4gVar.ordinal();
        if (iOrdinal == 0) {
            return null;
        }
        if (iOrdinal == 1) {
            return xqa.L0;
        }
        ap.c();
        return null;
    }

    public static hs3 d(r4g r4gVar) {
        int iOrdinal = r4gVar.ordinal();
        if (iOrdinal == 0) {
            return xqa.I0;
        }
        if (iOrdinal == 1) {
            return xqa.K0;
        }
        ap.c();
        return null;
    }

    public static hs3 e(r4g r4gVar) {
        int iOrdinal = r4gVar.ordinal();
        if (iOrdinal == 0) {
            return xqa.h0;
        }
        if (iOrdinal == 1) {
            return xqa.i0;
        }
        ap.c();
        return null;
    }

    public static void g(r4g r4gVar, w4g w4gVar, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        qn2 qn2Var = lw2.a;
        js3 js3Var = ga4.a;
        ynb.V(qn2Var, hr3.c, null, new g5g(r4gVar, w4gVar, jCurrentTimeMillis, str, null), 2);
    }

    public final void b(Application application) {
        application.getClass();
        if (b.compareAndSet(false, true)) {
            application.registerActivityLifecycleCallbacks(this);
        }
    }

    public final void f(Context context) {
        Object dzbVar;
        boolean z;
        x1f x1fVar = x1f.a;
        if (!x1f.d()) {
            return;
        }
        try {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            if (appWidgetManager == null) {
                return;
            }
            r4g r4gVar = r4g.TodayFortune;
            List listI = t72.I("ai.askquin.widget.DailyFortuneWidgetReceiver", "ai.askquin.widget.DailyFortuneWidgetWideReceiver");
            if (listI.isEmpty()) {
                z = false;
                break;
            }
            Iterator it = listI.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context.getPackageName(), (String) it.next()));
                appWidgetIds.getClass();
                if (appWidgetIds.length != 0) {
                    z = true;
                    break;
                }
            }
            iy9 iy9Var = new iy9(r4gVar, Boolean.valueOf(z));
            r4g r4gVar2 = r4g.QuickDecision;
            int[] appWidgetIds2 = appWidgetManager.getAppWidgetIds(new ComponentName(context.getPackageName(), "ai.askquin.widget.QuickDecisionWidgetReceiver"));
            appWidgetIds2.getClass();
            for (Map.Entry entry : bm8.H(iy9Var, new iy9(r4gVar2, Boolean.valueOf(!(appWidgetIds2.length == 0)))).entrySet()) {
                r4g r4gVar3 = (r4g) entry.getKey();
                if (((Boolean) entry.getValue()).booleanValue()) {
                    synchronized (this) {
                        r4gVar3.getClass();
                        js3 js3Var = ga4.a;
                        z5c.I(hr3.c, new e5g(r4gVar3, null));
                    }
                } else {
                    synchronized (this) {
                        r4gVar3.getClass();
                        js3 js3Var2 = ga4.a;
                        z5c.I(hr3.c, new z4g(r4gVar3, null));
                    }
                }
            }
            dzbVar = wef.a;
            Throwable thA = ezb.a(dzbVar);
            if (thA != null) {
                hf8.Q.getClass();
                ef8.a("WidgetInstallTracker").h("Failed to reconcile widget configurations", thA);
            }
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        qn2 qn2Var = lw2.a;
        js3 js3Var = ga4.a;
        ynb.V(qn2Var, hr3.c, null, new x4g(activity, null), 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }
}
