package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lzz0;", "Ls09;", "La01;", "ui"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class zz0 extends s09 {
    public final y6c a;
    public final a26 b;

    public zz0(y6c y6cVar, a26 a26Var) {
        this.a = y6cVar;
        this.b = a26Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        a01 a01Var = new a01();
        a01Var.H0 = this.a;
        a01Var.I0 = this.b;
        a01Var.K0 = y72.b;
        a01Var.L0 = 1.0f;
        a01Var.M0 = 3;
        return a01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz0)) {
            return false;
        }
        zz0 zz0Var = (zz0) obj;
        return this.a.equals(zz0Var.a) && this.b == zz0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        a01 a01Var = (a01) i09Var;
        y6c y6cVar = a01Var.H0;
        y6c y6cVar2 = this.a;
        if (!pa7.t(y6cVar, y6cVar2)) {
            a01Var.H0 = y6cVar2;
            a01Var.l1();
        }
        a26 a26Var = a01Var.I0;
        a26 a26Var2 = this.b;
        if (a26Var != a26Var2) {
            a01Var.I0 = a26Var2;
            a01Var.G0 = false;
            qn4.G(a01Var);
        }
    }
}
