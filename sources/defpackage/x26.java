package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class x26 extends j0 {
    public final /* synthetic */ y26 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x26(y26 y26Var) {
        super(y26Var.e);
        this.c = y26Var;
    }

    @Override // defpackage.m5
    public final Collection a() {
        List<j22> listI;
        y26 y26Var = this.c;
        int i = y26Var.v;
        m36 m36Var = y26Var.g;
        i36 i36Var = i36.d;
        if (pa7.t(m36Var, i36Var)) {
            listI = t72.H(y26.z);
        } else if (pa7.t(m36Var, j36.d)) {
            listI = t72.I(y26.X, new j22(tyd.k, i36Var.a(i)));
        } else {
            l36 l36Var = l36.d;
            if (pa7.t(m36Var, l36Var)) {
                listI = t72.H(y26.z);
            } else {
                if (!pa7.t(m36Var, k36.d)) {
                    int i2 = dg.a;
                    qc0.p("should not be called");
                    return null;
                }
                listI = t72.I(y26.X, new j22(tyd.f, l36Var.a(i)));
            }
        }
        w09 w09VarK = ((lw9) y26Var.f).k();
        ArrayList arrayList = new ArrayList(t72.u(listI, 10));
        for (j22 j22Var : listI) {
            u09 u09VarP = od4.p(w09VarK, j22Var);
            if (u09VarP == null) {
                cva.w(j22Var, " not found", "Built-in class ");
                return null;
            }
            List listD1 = s72.d1(u09VarP.h().getParameters().size(), y26Var.y);
            ArrayList arrayList2 = new ArrayList(t72.u(listD1, 10));
            Iterator it = listD1.iterator();
            while (it.hasNext()) {
                arrayList2.add(new dzd(((c8f) it.next()).S()));
            }
            e7f.b.getClass();
            arrayList.add(rxg.S(e7f.c, u09VarP, arrayList2));
        }
        return s72.j1(arrayList);
    }

    @Override // defpackage.m5
    public final m8c c() {
        return m8c.e;
    }

    @Override // defpackage.j7f
    public final List getParameters() {
        return this.c.y;
    }

    @Override // defpackage.j0
    /* JADX INFO: renamed from: j */
    public final u09 m() {
        return this.c;
    }

    @Override // defpackage.j0, defpackage.j7f
    public final y22 m() {
        return this.c;
    }

    @Override // defpackage.j7f
    public final boolean t() {
        return true;
    }

    public final String toString() {
        return this.c.toString();
    }
}
