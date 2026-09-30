package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nbg {
    public final w5c a;
    public final ax3 b = new ax3(8);

    public nbg(w5c w5cVar) {
        this.a = w5cVar;
    }

    public final void a(q8c q8cVar, kd0 kd0Var) {
        gd0 gd0Var = (gd0) kd0Var.keySet();
        kd0 kd0Var2 = gd0Var.a;
        if (kd0Var2.isEmpty()) {
            return;
        }
        if (kd0Var.c > 999) {
            i7h.J(kd0Var, new mbg(this, q8cVar, 0));
            return;
        }
        StringBuilder sbO = ub3.o("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        hfc.c(kd0Var2.c, sbO);
        sbO.append(")");
        x8c x8cVarW0 = q8cVar.W0(sbO.toString());
        Iterator it = gd0Var.iterator();
        int i = 1;
        while (true) {
            fd0 fd0Var = (fd0) it;
            if (!fd0Var.hasNext()) {
                try {
                    break;
                } catch (Throwable th) {
                    x8cVarW0.close();
                    throw th;
                }
            }
            x8cVarW0.Q(i, (String) fd0Var.next());
            i++;
        }
        x8cVarW0.getClass();
        int iG = z8c.g(x8cVarW0, "work_spec_id");
        if (iG == -1) {
            x8cVarW0.close();
            return;
        }
        while (x8cVarW0.R0()) {
            List list = (List) kd0Var.get(x8cVarW0.t0(iG));
            if (list != null) {
                byte[] blob = x8cVarW0.getBlob(0);
                bb3 bb3Var = bb3.b;
                list.add(bm8.w(blob));
            }
        }
        x8cVarW0.close();
    }

    public final void b(q8c q8cVar, kd0 kd0Var) {
        gd0 gd0Var = (gd0) kd0Var.keySet();
        kd0 kd0Var2 = gd0Var.a;
        if (kd0Var2.isEmpty()) {
            return;
        }
        if (kd0Var.c > 999) {
            i7h.J(kd0Var, new mbg(this, q8cVar, 1));
            return;
        }
        StringBuilder sbO = ub3.o("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        hfc.c(kd0Var2.c, sbO);
        sbO.append(")");
        x8c x8cVarW0 = q8cVar.W0(sbO.toString());
        Iterator it = gd0Var.iterator();
        int i = 1;
        while (true) {
            fd0 fd0Var = (fd0) it;
            if (!fd0Var.hasNext()) {
                try {
                    break;
                } catch (Throwable th) {
                    x8cVarW0.close();
                    throw th;
                }
            }
            x8cVarW0.Q(i, (String) fd0Var.next());
            i++;
        }
        x8cVarW0.getClass();
        int iG = z8c.g(x8cVarW0, "work_spec_id");
        if (iG == -1) {
            x8cVarW0.close();
            return;
        }
        while (x8cVarW0.R0()) {
            List list = (List) kd0Var.get(x8cVarW0.t0(iG));
            if (list != null) {
                list.add(x8cVarW0.t0(0));
            }
        }
        x8cVarW0.close();
    }

    public final vag c(String str) {
        str.getClass();
        return (vag) urg.I(this.a, true, false, new alc(str, 20));
    }

    public final lbg d(String str) {
        str.getClass();
        return (lbg) urg.I(this.a, true, false, new alc(str, 19));
    }

    public final void e(long j, String str) {
        str.getClass();
        ((Number) urg.I(this.a, false, true, new v0c(1, j, str))).intValue();
    }

    public final void f(int i, String str) {
        str.getClass();
        urg.I(this.a, false, true, new lce(str, i, 2));
    }

    public final void g(long j, String str) {
        str.getClass();
        urg.I(this.a, false, true, new v0c(2, j, str));
    }

    public final void h(vag vagVar, String str) {
        str.getClass();
        ((Number) urg.I(this.a, false, true, new p0g(7, vagVar, str))).intValue();
    }

    public final void i(int i, String str) {
        str.getClass();
        urg.I(this.a, false, true, new lce(i, str));
    }
}
