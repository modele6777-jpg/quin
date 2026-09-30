package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class p04 extends o04 {
    public final kw9 g;
    public final hza h;
    public final String i;
    public final dx5 j;

    public p04(kw9 kw9Var, hza hzaVar, u99 u99Var, ay0 ay0Var, yk7 yk7Var, tz3 tz3Var, String str, x16 x16Var) {
        u99Var.getClass();
        ay0Var.getClass();
        tz3Var.getClass();
        b0b b0bVarH = hzaVar.H();
        b0bVarH.getClass();
        bu3 bu3Var = new bu3(b0bVarH);
        otf otfVar = otf.b;
        i0b i0bVarI = hzaVar.I();
        i0bVarI.getClass();
        lp0 lp0Var = new lp0(tz3Var, u99Var, kw9Var, bu3Var, p8c.n(i0bVarI), ay0Var, yk7Var, null, pu4.a);
        List listE = hzaVar.E();
        listE.getClass();
        List listF = hzaVar.F();
        listF.getClass();
        List listG = hzaVar.G();
        listG.getClass();
        super(lp0Var, listE, listF, listG, x16Var);
        this.g = kw9Var;
        this.h = hzaVar;
        this.i = str;
        this.j = ((lw9) kw9Var).f;
    }

    @Override // defpackage.er8, defpackage.dr8
    public final Collection a(ez3 ez3Var, a26 a26Var) {
        ez3Var.getClass();
        List listI = i(ez3Var, a26Var);
        Iterable iterable = ((tz3) this.b.b).k;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            x72.g0(arrayList, ((e22) it.next()).b(this.j));
        }
        return s72.Q0(listI, arrayList);
    }

    @Override // defpackage.o04, defpackage.er8, defpackage.dr8
    public final y22 e(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        lf9Var.getClass();
        ((tz3) this.b.b).i.getClass();
        lf9Var.getClass();
        kw9 kw9Var = this.g;
        kw9Var.getClass();
        t99Var.getClass();
        String str = ((lw9) kw9Var).f.a.a;
        t99Var.b().getClass();
        str.getClass();
        return super.e(t99Var, lf9Var);
    }

    @Override // defpackage.o04
    public final j22 l(t99 t99Var) {
        t99Var.getClass();
        return new j22(this.j, t99Var);
    }

    @Override // defpackage.o04
    public final Set n() {
        return xu4.a;
    }

    @Override // defpackage.o04
    public final Set o() {
        return xu4.a;
    }

    @Override // defpackage.o04
    public final Set p() {
        return xu4.a;
    }

    @Override // defpackage.o04
    public final boolean q(t99 t99Var) {
        t99Var.getClass();
        if (m().contains(t99Var)) {
            return true;
        }
        Iterable iterable = ((tz3) this.b.b).k;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((e22) it.next()).c(this.j, t99Var)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.i;
    }

    @Override // defpackage.o04
    public final void h(ArrayList arrayList, a26 a26Var) {
    }
}
