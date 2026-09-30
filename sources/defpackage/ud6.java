package defpackage;

import android.os.Build;
import android.util.Log;
import io.sentry.android.core.b1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ud6 {
    public final bg1 a;
    public final uf1 b;
    public final td6 c;
    public final List d;
    public final s0e e;

    public ud6(qwe qweVar, bg1 bg1Var, uf1 uf1Var, y88 y88Var, List list, sd1 sd1Var) {
        qweVar.getClass();
        y88Var.getClass();
        list.getClass();
        sd1Var.getClass();
        this.a = bg1Var;
        this.b = uf1Var;
        this.d = uf1Var.k;
        Map map = uf1Var.i;
        Map map2 = uf1Var.l;
        ru8 ru8Var = ih1.c;
        Object obj = map.get(ru8Var);
        Boolean bool = Boolean.TRUE;
        if (pa7.t(obj, bool) || pa7.t(map2.get(ru8Var), bool)) {
            Log.i("CXCP", ru8Var + " is set to true, ignoring GraphState3A parameters.");
        }
        wf1 wf1Var = uf1Var.n;
        sd1Var.b.getClass();
        ff8 ff8Var = wf1Var.b;
        Set set = (Set) sd1.c.get(Build.MANUFACTURER);
        int iMax = Math.max((set == null || !set.contains(Build.DEVICE) || Build.VERSION.SDK_INT >= 34) ? 0 : Math.max(0, 10), ff8Var.b);
        lm1 lm1Var = iMax != 0 ? new lm1(iMax) : null;
        td6 td6Var = new td6(bg1Var, map, map2, s72.Q0(list, t72.J(lm1Var)), qd0.k0(new Object[]{y88Var, lm1Var}), qweVar.a, qweVar.h);
        this.c = td6Var;
        if (lm1Var != null) {
            if (lm1Var.c != null) {
                qc0.p("GraphLoop has already been set!");
                throw null;
            }
            lm1Var.c = td6Var;
            td6Var.U(false);
            b1.l("CXCP", "Capture processing has been disabled for " + td6Var + " until " + lm1Var.a + " frames have been completed.");
        }
        this.e = t0e.a(be6.b);
    }

    public final void a(zd6 zd6Var) {
        s0e s0eVar;
        Object value;
        ee6 ee6Var;
        Log.d("CXCP", this + " onGraphError(" + zd6Var + ')');
        do {
            s0eVar = this.e;
            value = s0eVar.getValue();
            ee6Var = (ee6) value;
        } while (!s0eVar.l(value, ((ee6Var instanceof ce6) || (ee6Var instanceof be6)) ? be6.b : zd6Var));
        for (fe6 fe6Var : this.d) {
            fe6Var.getClass();
            fe6Var.a.b(fe6Var.a(), zd6Var);
        }
    }

    public final void b(vd6 vd6Var) {
        Log.d("CXCP", this + " onGraphStarted");
        ae6 ae6Var = ae6.b;
        this.e.m(ae6Var);
        this.c.W(vd6Var);
        for (fe6 fe6Var : this.d) {
            fe6Var.a.b(fe6Var.a(), ae6Var);
        }
    }

    public final void c() {
        Log.d("CXCP", this + " onGraphStopped");
        s0e s0eVar = this.e;
        be6 be6Var = be6.b;
        s0eVar.m(be6Var);
        this.c.W(null);
        for (fe6 fe6Var : this.d) {
            fe6Var.a.b(fe6Var.a(), be6Var);
        }
    }

    public final void d(ctb ctbVar) {
        td6 td6Var = this.c;
        synchronized (td6Var.v) {
            try {
                ctb ctbVar2 = td6Var.y;
                td6Var.y = ctbVar;
                if (ctbVar2 != null || ctbVar != null) {
                    tva tvaVar = td6Var.g;
                    if (ctbVar != null) {
                        tvaVar.c(new jd6(ctbVar));
                    } else {
                        tvaVar.c(fd6.d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (ctbVar == null) {
            int size = td6Var.d.size();
            for (int i = 0; i < size; i++) {
                ((nd6) td6Var.d.get(i)).c();
            }
        }
    }

    public final boolean e(Map map) {
        map.getClass();
        td6 td6Var = this.c;
        if (td6Var.l() != null) {
            return td6Var.g.c(new ld6(map));
        }
        qc0.p("Cannot submit parameters without an active repeating request!");
        return false;
    }

    public final void f(LinkedHashMap linkedHashMap) {
        td6 td6Var = this.c;
        synchronized (td6Var.v) {
            td6Var.g.c(new id6(td6Var.z, linkedHashMap));
        }
    }

    public final String toString() {
        return "GraphProcessor(cameraGraph: " + this.a + ')';
    }
}
