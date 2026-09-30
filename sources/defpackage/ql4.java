package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lql4;", "Ls09;", "Lyl4;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class ql4 extends s09 {
    public static final hl4 w = new hl4(1);
    public final zl4 a;
    public final ks9 b;
    public final boolean c;
    public final t69 d;
    public final boolean e;
    public final n26 f;
    public final n26 g;
    public final boolean v;

    public ql4(zl4 zl4Var, ks9 ks9Var, boolean z, t69 t69Var, boolean z2, sl4 sl4Var, n26 n26Var, boolean z3) {
        this.a = zl4Var;
        this.b = ks9Var;
        this.c = z;
        this.d = t69Var;
        this.e = z2;
        this.f = sl4Var;
        this.g = n26Var;
        this.v = z3;
    }

    @Override // defpackage.s09
    public final i09 create() {
        yl4 yl4Var = new yl4(w, this.c, this.d, this.b);
        yl4Var.Y0 = this.a;
        yl4Var.Z0 = this.e;
        yl4Var.a1 = this.f;
        yl4Var.b1 = this.g;
        yl4Var.c1 = this.v;
        return yl4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ql4.class != obj.getClass()) {
            return false;
        }
        ql4 ql4Var = (ql4) obj;
        return pa7.t(this.a, ql4Var.a) && this.b == ql4Var.b && this.c == ql4Var.c && pa7.t(this.d, ql4Var.d) && this.e == ql4Var.e && pa7.t(this.f, ql4Var.f) && pa7.t(this.g, ql4Var.g) && this.v == ql4Var.v;
    }

    public final int hashCode() {
        int iD = ub3.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        t69 t69Var = this.d;
        return Boolean.hashCode(this.v) + ((this.g.hashCode() + ((this.f.hashCode() + ub3.d((iD + (t69Var != null ? t69Var.hashCode() : 0)) * 31, 31, this.e)) * 31)) * 31);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        boolean z;
        boolean z2;
        yl4 yl4Var = (yl4) i09Var;
        zl4 zl4Var = yl4Var.Y0;
        zl4 zl4Var2 = this.a;
        if (pa7.t(zl4Var, zl4Var2)) {
            z = false;
        } else {
            yl4Var.Y0 = zl4Var2;
            z = true;
        }
        boolean z3 = yl4Var.c1;
        boolean z4 = this.v;
        if (z3 != z4) {
            yl4Var.c1 = z4;
            z2 = true;
        } else {
            z2 = z;
        }
        yl4Var.a1 = this.f;
        yl4Var.b1 = this.g;
        yl4Var.Z0 = this.e;
        yl4Var.F1(w, this.c, this.d, this.b, z2);
    }
}
