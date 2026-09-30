package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Loj6;", "Ls09;", "Lqj6;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class oj6 extends s09 {
    public final mue a;
    public final int b;
    public final int c;

    public oj6(mue mueVar, int i, int i2) {
        this.a = mueVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.s09
    public final i09 create() {
        qj6 qj6Var = new qj6();
        qj6Var.Z = this.a;
        qj6Var.E0 = this.b;
        qj6Var.F0 = this.c;
        qj6Var.H0 = -1;
        qj6Var.I0 = -1;
        return qj6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj6)) {
            return false;
        }
        oj6 oj6Var = (oj6) obj;
        return pa7.t(this.a, oj6Var.a) && this.b == oj6Var.b && this.c == oj6Var.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        qj6 qj6Var = (qj6) i09Var;
        mue mueVar = qj6Var.Z;
        mue mueVar2 = this.a;
        boolean zT = pa7.t(mueVar, mueVar2);
        int i = this.b;
        int i2 = this.c;
        if (zT && qj6Var.E0 == i && qj6Var.F0 == i2) {
            return;
        }
        qj6Var.Z = mueVar2;
        qj6Var.E0 = i;
        qj6Var.F0 = i2;
        qj6Var.J0 = a6c.k(mueVar2, vd0.s0(qj6Var).P0);
        qj6Var.G0 = true;
        rs0.F(qj6Var);
    }
}
