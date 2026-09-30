package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fc9 {
    public ia9 a;
    public boolean b;

    public abstract ua9 a();

    public final ia9 b() {
        ia9 ia9Var = this.a;
        if (ia9Var != null) {
            return ia9Var;
        }
        qc0.p("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public void d(List list, pb9 pb9Var) {
        ue5 ue5Var = new ue5(new ve5(fyc.x(new td0(1, list), new p59(2, this, pb9Var)), false, new fnc(23)));
        while (ue5Var.hasNext()) {
            b().f((da9) ue5Var.next());
        }
    }

    public void e(da9 da9Var, boolean z) {
        List list = (List) b().e.a.getValue();
        if (!list.contains(da9Var)) {
            ho7.u("popBackStack was called with ", da9Var, " which does not exist in back stack ", list);
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        da9 da9Var2 = null;
        while (f()) {
            da9Var2 = (da9) listIterator.previous();
            if (pa7.t(da9Var2, da9Var)) {
                break;
            }
        }
        if (da9Var2 != null) {
            b().d(da9Var2, z);
        }
    }

    public boolean f() {
        return true;
    }

    public ua9 c(ua9 ua9Var) {
        return ua9Var;
    }
}
