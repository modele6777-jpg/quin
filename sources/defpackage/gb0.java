package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gb0 implements Application.ActivityLifecycleCallbacks {
    public static final ct F0 = ct.d();
    public static volatile gb0 G0;
    public boolean E0;
    public oye X;
    public zb0 Y;
    public boolean Z;
    public final WeakHashMap a;
    public final WeakHashMap b;
    public final WeakHashMap c;
    public final WeakHashMap d;
    public final HashMap e;
    public final HashSet f;
    public final HashSet g;
    public final AtomicInteger v;
    public final e4f w;
    public final ji2 x;
    public final i8c y;
    public oye z;

    public gb0(e4f e4fVar, i8c i8cVar) {
        ji2 ji2VarE = ji2.e();
        ct ctVar = xy5.e;
        this.a = new WeakHashMap();
        this.b = new WeakHashMap();
        this.c = new WeakHashMap();
        this.d = new WeakHashMap();
        this.e = new HashMap();
        this.f = new HashSet();
        this.g = new HashSet();
        this.v = new AtomicInteger(0);
        this.Y = zb0.BACKGROUND;
        this.Z = false;
        this.E0 = true;
        this.w = e4fVar;
        this.y = i8cVar;
        this.x = ji2VarE;
    }

    public static gb0 a() {
        if (G0 == null) {
            synchronized (gb0.class) {
                try {
                    if (G0 == null) {
                        G0 = new gb0(e4f.H0, new i8c(18));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return G0;
    }

    public final void b(String str) {
        synchronized (this.e) {
            try {
                Long l = (Long) this.e.get(str);
                HashMap map = this.e;
                if (l == null) {
                    map.put(str, 1L);
                } else {
                    map.put(str, Long.valueOf(l.longValue() + 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.g) {
            try {
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    if (((dg5) it.next()) != null) {
                        try {
                            ct ctVar = cg5.b;
                        } catch (IllegalStateException e) {
                            dg5.a.g("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Activity activity) {
        ur9 ur9Var;
        WeakHashMap weakHashMap = this.d;
        Trace trace = (Trace) weakHashMap.get(activity);
        if (trace == null) {
            return;
        }
        weakHashMap.remove(activity);
        xy5 xy5Var = (xy5) this.b.get(activity);
        FrameMetricsAggregator frameMetricsAggregator = xy5Var.b;
        HashMap map = xy5Var.c;
        ct ctVar = xy5.e;
        if (xy5Var.d) {
            if (!map.isEmpty()) {
                ctVar.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
                map.clear();
            }
            ur9 ur9VarA = xy5Var.a();
            try {
                frameMetricsAggregator.b(xy5Var.a);
            } catch (IllegalArgumentException | NullPointerException e) {
                if ((e instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                    throw e;
                }
                ctVar.g("View not hardware accelerated. Unable to collect FrameMetrics. %s", e.toString());
                ur9VarA = new ur9();
            }
            veh vehVar = frameMetricsAggregator.a;
            Object obj = vehVar.c;
            vehVar.c = new SparseIntArray[9];
            xy5Var.d = false;
            ur9Var = ur9VarA;
        } else {
            ctVar.a("Cannot stop because no recording was started");
            ur9Var = new ur9();
        }
        if (ur9Var.b()) {
            wfc.a(trace, (wy5) ur9Var.a());
            trace.stop();
        } else {
            F0.g("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        }
    }

    public final void e(String str, oye oyeVar, oye oyeVar2) {
        if (this.x.n()) {
            y0f y0fVarH = b1f.H();
            y0fVarH.n(str);
            y0fVarH.l(oyeVar.a);
            y0fVarH.m(oyeVar.c(oyeVar2));
            m8a m8aVarA = SessionManager.getInstance().perfSession().a();
            y0fVarH.i();
            ((b1f) y0fVarH.b).t(m8aVarA);
            int andSet = this.v.getAndSet(0);
            synchronized (this.e) {
                try {
                    HashMap map = this.e;
                    y0fVarH.i();
                    ((b1f) y0fVarH.b).F().putAll(map);
                    if (andSet != 0) {
                        y0fVarH.k(andSet, cl2.TRACE_STARTED_NOT_STOPPED.toString());
                    }
                    this.e.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.w.c((b1f) y0fVarH.h(), zb0.FOREGROUND_BACKGROUND);
        }
    }

    public final void f(Activity activity) {
        if (this.x.n()) {
            xy5 xy5Var = new xy5(activity);
            this.b.put(activity, xy5Var);
            if (activity instanceof nx5) {
                gy5 gy5Var = new gy5(this.y, this.w, this, xy5Var);
                this.c.put(activity, gy5Var);
                w84 w84Var = ((nx5) activity).q().o;
                w84Var.getClass();
                ((CopyOnWriteArrayList) w84Var.c).add(new qx5(gy5Var));
            }
        }
    }

    public final void g(zb0 zb0Var) {
        this.Y = zb0Var;
        synchronized (this.f) {
            try {
                Iterator it = this.f.iterator();
                while (it.hasNext()) {
                    fb0 fb0Var = (fb0) ((WeakReference) it.next()).get();
                    if (fb0Var != null) {
                        fb0Var.onUpdateAppState(this.Y);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        f(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.b.remove(activity);
        if (this.c.containsKey(activity)) {
            zx5 zx5VarQ = ((nx5) activity).q();
            FragmentManager$FragmentLifecycleCallbacks fragmentManager$FragmentLifecycleCallbacks = (FragmentManager$FragmentLifecycleCallbacks) this.c.remove(activity);
            w84 w84Var = zx5VarQ.o;
            w84Var.getClass();
            fragmentManager$FragmentLifecycleCallbacks.getClass();
            synchronized (((CopyOnWriteArrayList) w84Var.c)) {
                int size = ((CopyOnWriteArrayList) w84Var.c).size();
                for (int i = 0; i < size; i++) {
                    if (((qx5) ((CopyOnWriteArrayList) w84Var.c).get(i)).a == fragmentManager$FragmentLifecycleCallbacks) {
                        ((CopyOnWriteArrayList) w84Var.c).remove(i);
                        break;
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.a.isEmpty()) {
                this.z = new oye();
                this.a.put(activity, Boolean.TRUE);
                if (this.E0) {
                    g(zb0.FOREGROUND);
                    c();
                    this.E0 = false;
                } else {
                    e(dl2.BACKGROUND_TRACE_NAME.toString(), this.X, this.z);
                    g(zb0.FOREGROUND);
                }
            } else {
                this.a.put(activity, Boolean.TRUE);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        try {
            if (this.x.n()) {
                if (!this.b.containsKey(activity)) {
                    f(activity);
                }
                xy5 xy5Var = (xy5) this.b.get(activity);
                Activity activity2 = xy5Var.a;
                if (xy5Var.d) {
                    xy5.e.b("FrameMetricsAggregator is already recording %s", activity2.getClass().getSimpleName());
                } else {
                    xy5Var.b.a(activity2);
                    xy5Var.d = true;
                }
                Trace trace = new Trace("_st_".concat(activity.getClass().getSimpleName()), this.w, this.y, this);
                trace.start();
                this.d.put(activity, trace);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        d(activity);
        if (this.a.containsKey(activity)) {
            this.a.remove(activity);
            if (this.a.isEmpty()) {
                this.X = new oye();
                e(dl2.FOREGROUND_TRACE_NAME.toString(), this.z, this.X);
                g(zb0.BACKGROUND);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
