package defpackage;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c92 implements xn8, p7c {
    public final wc0 a;
    public final xi b;

    public c92(wc0 wc0Var, xi xiVar) {
        this.a = wc0Var;
        this.b = xiVar;
    }

    @Override // defpackage.xn8
    public final int a(ga7 ga7Var, List list, int i) {
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
                int iMin2 = Math.min(tn8Var.b(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, tn8Var.q(iMin2));
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
                iMax = Math.max(iMax, tn8Var2.q(iRound != Integer.MAX_VALUE ? Math.round(iRound * fS2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.xn8
    public final yn8 b(zn8 zn8Var, List list, long j) {
        return q7c.q(this, kl2.i(j), kl2.j(j), kl2.g(j), kl2.h(j), zn8Var.D0(this.a.f()), zn8Var, list, new cea[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.xn8
    public final int c(ga7 ga7Var, List list, int i) {
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
                int iMin2 = Math.min(tn8Var.b(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, tn8Var.n(iMin2));
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
                iMax = Math.max(iMax, tn8Var2.n(iRound != Integer.MAX_VALUE ? Math.round(iRound * fS2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.xn8
    public final int d(ga7 ga7Var, List list, int i) {
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
            int iB = tn8Var.b(i);
            if (fS == 0.0f) {
                i2 += iB;
            } else if (fS > 0.0f) {
                f += fS;
                iMax = Math.max(iMax, Math.round(iB / fS));
            }
        }
        return ((list.size() - 1) * iD0) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.xn8
    public final int e(ga7 ga7Var, List list, int i) {
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
            int iV = tn8Var.V(i);
            if (fS == 0.0f) {
                i2 += iV;
            } else if (fS > 0.0f) {
                f += fS;
                iMax = Math.max(iMax, Math.round(iV / fS));
            }
        }
        return ((list.size() - 1) * iD0) + Math.round(iMax * f) + i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c92)) {
            return false;
        }
        c92 c92Var = (c92) obj;
        return this.a.equals(c92Var.a) && pa7.t(this.b, c92Var.b);
    }

    @Override // defpackage.p7c
    public final void f(int i, int[] iArr, int[] iArr2, zn8 zn8Var) {
        this.a.w(zn8Var, i, iArr, iArr2);
    }

    @Override // defpackage.p7c
    public final long g(int i, int i2, int i3, boolean z) {
        return !z ? ll2.a(0, i3, i, i2) : pa7.R(0, i3, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p7c
    public final yn8 h(cea[] ceaVarArr, zn8 zn8Var, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        return zn8Var.n0(i2, i, qu4.a, new b92((Serializable) ceaVarArr, (Object) this, i2, (Object) zn8Var, (Object) iArr, 0));
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.p7c
    public final int i(cea ceaVar) {
        return ceaVar.a;
    }

    @Override // defpackage.p7c
    public final int j(cea ceaVar) {
        return ceaVar.b;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ")";
    }
}
