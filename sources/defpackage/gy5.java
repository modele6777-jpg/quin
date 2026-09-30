package defpackage;

import androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks;
import com.google.firebase.perf.metrics.Trace;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gy5 extends FragmentManager$FragmentLifecycleCallbacks {
    public static final ct f = ct.d();
    public final WeakHashMap a = new WeakHashMap();
    public final i8c b;
    public final e4f c;
    public final gb0 d;
    public final xy5 e;

    public gy5(i8c i8cVar, e4f e4fVar, gb0 gb0Var, xy5 xy5Var) {
        this.b = i8cVar;
        this.c = e4fVar;
        this.d = gb0Var;
        this.e = xy5Var;
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void e(zx5 zx5Var, kx5 kx5Var) {
        ur9 ur9Var;
        Object[] objArr = {kx5Var.getClass().getSimpleName()};
        ct ctVar = f;
        ctVar.b("FragmentMonitor %s.onFragmentPaused ", objArr);
        WeakHashMap weakHashMap = this.a;
        if (!weakHashMap.containsKey(kx5Var)) {
            ctVar.g("FragmentMonitor: missed a fragment trace from %s", kx5Var.getClass().getSimpleName());
            return;
        }
        Trace trace = (Trace) weakHashMap.get(kx5Var);
        weakHashMap.remove(kx5Var);
        xy5 xy5Var = this.e;
        HashMap map = xy5Var.c;
        ct ctVar2 = xy5.e;
        if (!xy5Var.d) {
            ctVar2.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            ur9Var = new ur9();
        } else if (map.containsKey(kx5Var)) {
            wy5 wy5Var = (wy5) map.remove(kx5Var);
            ur9 ur9VarA = xy5Var.a();
            if (ur9VarA.b()) {
                wy5 wy5Var2 = (wy5) ur9VarA.a();
                ur9Var = new ur9(new wy5(wy5Var2.a - wy5Var.a, wy5Var2.b - wy5Var.b, wy5Var2.c - wy5Var.c));
            } else {
                ctVar2.b("stopFragment(%s): snapshot() failed", kx5Var.getClass().getSimpleName());
                ur9Var = new ur9();
            }
        } else {
            ctVar2.b("Sub-recording associated with key %s was not started or does not exist", kx5Var.getClass().getSimpleName());
            ur9Var = new ur9();
        }
        if (!ur9Var.b()) {
            ctVar.g("onFragmentPaused: recorder failed to trace %s", kx5Var.getClass().getSimpleName());
        } else {
            wfc.a(trace, (wy5) ur9Var.a());
            trace.stop();
        }
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void f(zx5 zx5Var, kx5 kx5Var) {
        f.b("FragmentMonitor %s.onFragmentResumed", kx5Var.getClass().getSimpleName());
        Trace trace = new Trace("_st_".concat(kx5Var.getClass().getSimpleName()), this.c, this.b, this.d);
        trace.start();
        kx5 kx5Var2 = kx5Var.L0;
        trace.putAttribute("Parent_fragment", kx5Var2 == null ? "No parent" : kx5Var2.getClass().getSimpleName());
        mx5 mx5Var = kx5Var.J0;
        if ((mx5Var == null ? null : (nx5) mx5Var.G0) != null) {
            trace.putAttribute("Hosting_activity", (mx5Var != null ? (nx5) mx5Var.G0 : null).getClass().getSimpleName());
        }
        this.a.put(kx5Var, trace);
        xy5 xy5Var = this.e;
        HashMap map = xy5Var.c;
        ct ctVar = xy5.e;
        if (!xy5Var.d) {
            ctVar.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        if (map.containsKey(kx5Var)) {
            ctVar.b("Cannot start sub-recording because one is already ongoing with the key %s", kx5Var.getClass().getSimpleName());
            return;
        }
        ur9 ur9VarA = xy5Var.a();
        if (ur9VarA.b()) {
            map.put(kx5Var, (wy5) ur9VarA.a());
        } else {
            ctVar.b("startFragment(%s): snapshot() failed", kx5Var.getClass().getSimpleName());
        }
    }
}
