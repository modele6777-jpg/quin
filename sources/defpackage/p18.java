package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class p18 implements dr8 {
    public final /* synthetic */ int b = 1;
    public final Object c;

    public p18(ge8 ge8Var, x16 x16Var) {
        ge8Var.getClass();
        this.c = new ee8(ge8Var, new j04(1, x16Var));
    }

    @Override // defpackage.dr8
    public Collection a(ez3 ez3Var, a26 a26Var) {
        switch (this.b) {
            case 1:
                ez3Var.getClass();
                Collection collectionI = i(ez3Var, a26Var);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionI) {
                    if (((bm3) obj) instanceof ca1) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                iy9 iy9Var = new iy9(arrayList, arrayList2);
                List list = (List) iy9Var.a();
                List list2 = (List) iy9Var.b();
                list.getClass();
                return s72.Q0(y41.P(list, vic.N0), list2);
            default:
                return i(ez3Var, a26Var);
        }
    }

    @Override // defpackage.dr8
    public Collection b(t99 t99Var, lf9 lf9Var) {
        switch (this.b) {
            case 1:
                t99Var.getClass();
                return y41.P(j(t99Var, lf9Var), vic.L0);
            default:
                return j(t99Var, lf9Var);
        }
    }

    @Override // defpackage.dr8
    public final Set c() {
        return l().c();
    }

    @Override // defpackage.dr8
    public final Set d() {
        return l().d();
    }

    @Override // defpackage.dr8
    public final y22 e(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        lf9Var.getClass();
        return l().e(t99Var, lf9Var);
    }

    @Override // defpackage.dr8
    public Collection f(t99 t99Var, lf9 lf9Var) {
        switch (this.b) {
            case 1:
                t99Var.getClass();
                return y41.P(k(t99Var, lf9Var), vic.M0);
            default:
                return k(t99Var, lf9Var);
        }
    }

    @Override // defpackage.dr8
    public final Set g() {
        return l().g();
    }

    public final dr8 h() {
        if (!(l() instanceof p18)) {
            return l();
        }
        dr8 dr8VarL = l();
        dr8VarL.getClass();
        return ((p18) dr8VarL).h();
    }

    public final Collection i(ez3 ez3Var, a26 a26Var) {
        ez3Var.getClass();
        return l().a(ez3Var, a26Var);
    }

    public final Collection j(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        return l().b(t99Var, lf9Var);
    }

    public final Collection k(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        return l().f(t99Var, lf9Var);
    }

    public final dr8 l() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return (dr8) ((ee8) obj).invoke();
            default:
                return (dr8) obj;
        }
    }

    public p18(dr8 dr8Var) {
        this.c = dr8Var;
    }
}
