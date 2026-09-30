package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u21 implements xn8 {
    public final yi a;
    public final boolean b;

    public u21(yi yiVar, boolean z) {
        this.a = yiVar;
        this.b = z;
    }

    @Override // defpackage.xn8
    public final yn8 b(zn8 zn8Var, List list, long j) {
        int iJ;
        int i;
        cea ceaVarV;
        boolean zIsEmpty = list.isEmpty();
        qu4 qu4Var = qu4.a;
        if (zIsEmpty) {
            return zn8Var.n0(kl2.j(j), kl2.i(j), qu4Var, new wu0(7));
        }
        long j2 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            tn8 tn8Var = (tn8) list.get(0);
            Object objE = tn8Var.E();
            r21 r21Var = objE instanceof r21 ? (r21) objE : null;
            if (r21Var != null ? r21Var.E0 : false) {
                iJ = kl2.j(j);
                i = kl2.i(j);
                int iJ2 = kl2.j(j);
                int i2 = kl2.i(j);
                if (!((i2 >= 0) & (iJ2 >= 0))) {
                    k37.a("width and height must be >= 0");
                }
                ceaVarV = tn8Var.v(ll2.h(iJ2, iJ2, i2, i2));
            } else {
                ceaVarV = tn8Var.v(j2);
                iJ = Math.max(kl2.j(j), ceaVarV.a);
                i = Math.max(kl2.i(j), ceaVarV.b);
            }
            int i3 = i;
            int i4 = iJ;
            return zn8Var.n0(i4, i3, qu4Var, new t21(ceaVarV, tn8Var, zn8Var, i4, i3, this));
        }
        cea[] ceaVarArr = new cea[list.size()];
        kmb kmbVar = new kmb();
        kmbVar.element = kl2.j(j);
        kmb kmbVar2 = new kmb();
        kmbVar2.element = kl2.i(j);
        int size = list.size();
        boolean z = false;
        for (int i5 = 0; i5 < size; i5++) {
            tn8 tn8Var2 = (tn8) list.get(i5);
            Object objE2 = tn8Var2.E();
            r21 r21Var2 = objE2 instanceof r21 ? (r21) objE2 : null;
            if (r21Var2 != null ? r21Var2.E0 : false) {
                z = true;
            } else {
                cea ceaVarV2 = tn8Var2.v(j2);
                ceaVarArr[i5] = ceaVarV2;
                kmbVar.element = Math.max(kmbVar.element, ceaVarV2.a);
                kmbVar2.element = Math.max(kmbVar2.element, ceaVarV2.b);
            }
        }
        if (z) {
            int i6 = kmbVar.element;
            int i7 = i6 != Integer.MAX_VALUE ? i6 : 0;
            int i8 = kmbVar2.element;
            long jA = ll2.a(i7, i6, i8 != Integer.MAX_VALUE ? i8 : 0, i8);
            int size2 = list.size();
            for (int i9 = 0; i9 < size2; i9++) {
                tn8 tn8Var3 = (tn8) list.get(i9);
                Object objE3 = tn8Var3.E();
                r21 r21Var3 = objE3 instanceof r21 ? (r21) objE3 : null;
                if (r21Var3 != null ? r21Var3.E0 : false) {
                    ceaVarArr[i9] = tn8Var3.v(jA);
                }
            }
        }
        return zn8Var.n0(kmbVar.element, kmbVar2.element, qu4Var, new k11(ceaVarArr, list, zn8Var, kmbVar, kmbVar2, this, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u21)) {
            return false;
        }
        u21 u21Var = (u21) obj;
        return pa7.t(this.a, u21Var.a) && this.b == u21Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ")";
    }
}
