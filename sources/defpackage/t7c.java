package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t7c implements xn8, p7c {
    public final tc0 a;
    public final kx0 b;

    public t7c(tc0 tc0Var, kx0 kx0Var) {
        this.a = tc0Var;
        this.b = kx0Var;
    }

    @Override // defpackage.xn8
    public final int a(ga7 ga7Var, List list, int i) {
        int iD0 = ga7Var.D0(this.a.f());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            tn8 tn8Var = (tn8) list.get(i3);
            float fS = o7c.s(o7c.r(tn8Var));
            int iQ = tn8Var.q(i);
            if (fS == 0.0f) {
                i2 += iQ;
            } else if (fS > 0.0f) {
                f += fS;
                iMax = Math.max(iMax, Math.round(iQ / fS));
            }
        }
        return ((list.size() - 1) * iD0) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.xn8
    public final yn8 b(zn8 zn8Var, List list, long j) {
        return q7c.q(this, kl2.j(j), kl2.i(j), kl2.h(j), kl2.g(j), zn8Var.D0(this.a.f()), zn8Var, list, new cea[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.xn8
    public final int c(ga7 ga7Var, List list, int i) {
        int iD0 = ga7Var.D0(this.a.f());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            tn8 tn8Var = (tn8) list.get(i3);
            float fS = o7c.s(o7c.r(tn8Var));
            int iN = tn8Var.n(i);
            if (fS == 0.0f) {
                i2 += iN;
            } else if (fS > 0.0f) {
                f += fS;
                iMax = Math.max(iMax, Math.round(iN / fS));
            }
        }
        return ((list.size() - 1) * iD0) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.xn8
    public final int d(ga7 ga7Var, List list, int i) {
        int iD0 = ga7Var.D0(this.a.f());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iD0, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            tn8 tn8Var = (tn8) list.get(i2);
            float fS = o7c.s(o7c.r(tn8Var));
            if (fS == 0.0f) {
                int iMin2 = Math.min(tn8Var.q(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, tn8Var.b(iMin2));
            } else if (fS > 0.0f) {
                f += fS;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            tn8 tn8Var2 = (tn8) list.get(i3);
            float fS2 = o7c.s(o7c.r(tn8Var2));
            if (fS2 > 0.0f) {
                iMax = Math.max(iMax, tn8Var2.b(iRound != Integer.MAX_VALUE ? Math.round(iRound * fS2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.xn8
    public final int e(ga7 ga7Var, List list, int i) {
        int iD0 = ga7Var.D0(this.a.f());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iD0, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            tn8 tn8Var = (tn8) list.get(i2);
            float fS = o7c.s(o7c.r(tn8Var));
            if (fS == 0.0f) {
                int iMin2 = Math.min(tn8Var.q(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, tn8Var.V(iMin2));
            } else if (fS > 0.0f) {
                f += fS;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            tn8 tn8Var2 = (tn8) list.get(i3);
            float fS2 = o7c.s(o7c.r(tn8Var2));
            if (fS2 > 0.0f) {
                iMax = Math.max(iMax, tn8Var2.V(iRound != Integer.MAX_VALUE ? Math.round(iRound * fS2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7c)) {
            return false;
        }
        t7c t7cVar = (t7c) obj;
        return pa7.t(this.a, t7cVar.a) && pa7.t(this.b, t7cVar.b);
    }

    @Override // defpackage.p7c
    public final void f(int i, int[] iArr, int[] iArr2, zn8 zn8Var) {
        this.a.m(zn8Var, i, iArr, zn8Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.p7c
    public final long g(int i, int i2, int i3, boolean z) {
        return !z ? ll2.a(i, i2, 0, i3) : pa7.S(i, i2, 0, i3);
    }

    @Override // defpackage.p7c
    public final yn8 h(cea[] ceaVarArr, zn8 zn8Var, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        return zn8Var.n0(i, i2, qu4.a, new kx3(ceaVarArr, this, i2, iArr));
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.p7c
    public final int i(cea ceaVar) {
        return ceaVar.b;
    }

    @Override // defpackage.p7c
    public final int j(cea ceaVar) {
        return ceaVar.a;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ")";
    }
}
