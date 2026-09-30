package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bg3 implements vd3, mxe, ypf, gu2 {
    public final y07 a;
    public final a17 b;
    public final c17 c;
    public String d;

    public /* synthetic */ bg3() {
        this(new y07(), new a17(), new c17(null, null, null, null), null);
    }

    @Override // defpackage.mxe
    public final void A(Integer num) {
        this.b.a = num;
    }

    @Override // defpackage.mxe
    public final Integer B() {
        return this.b.a;
    }

    @Override // defpackage.mxe
    public final Integer C() {
        return this.b.e;
    }

    @Override // defpackage.ypf
    public final Boolean D() {
        return this.c.a;
    }

    @Override // defpackage.mxe
    public final void E(Integer num) {
        this.b.e = num;
    }

    @Override // defpackage.vd3
    public final void F(Integer num) {
        this.a.d = num;
    }

    @Override // defpackage.mxe
    public final void a(rh3 rh3Var) {
        this.b.a(rh3Var);
    }

    @Override // defpackage.mxe
    public final ak b() {
        return this.b.c;
    }

    @Override // defpackage.ypf
    public final Integer c() {
        return this.c.d;
    }

    @Override // defpackage.gu2
    public final Object copy() {
        y07 y07VarCopy = this.a.copy();
        a17 a17VarC = this.b.copy();
        c17 c17Var = this.c;
        return new bg3(y07VarCopy, a17VarC, new c17(c17Var.a, c17Var.b, c17Var.c, c17Var.d), this.d);
    }

    @Override // defpackage.ypf
    public final void d(Integer num) {
        this.c.d = num;
    }

    @Override // defpackage.mxe
    public final void e(Integer num) {
        this.b.b = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bg3)) {
            return false;
        }
        bg3 bg3Var = (bg3) obj;
        return pa7.t(bg3Var.a, this.a) && pa7.t(bg3Var.b, this.b) && pa7.t(bg3Var.c, this.c) && pa7.t(bg3Var.d, this.d);
    }

    @Override // defpackage.mxe
    public final void f(Integer num) {
        this.b.f = num;
    }

    @Override // defpackage.cdg
    public final void g(Integer num) {
        this.a.a.b = num;
    }

    @Override // defpackage.mxe
    public final Integer h() {
        return this.b.d;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ this.b.hashCode()) ^ this.c.hashCode();
        String str = this.d;
        return (str != null ? str.hashCode() : 0) ^ iHashCode;
    }

    @Override // defpackage.ypf
    public final void i(Integer num) {
        this.c.c = num;
    }

    @Override // defpackage.ypf
    public final void j(Integer num) {
        this.c.b = num;
    }

    @Override // defpackage.mxe
    public final void k(Integer num) {
        this.b.d = num;
    }

    @Override // defpackage.cdg
    public final Integer l() {
        return this.a.a.a;
    }

    @Override // defpackage.vd3
    public final Integer m() {
        return this.a.c;
    }

    @Override // defpackage.mxe
    public final rh3 n() {
        return this.b.n();
    }

    @Override // defpackage.mxe
    public final Integer o() {
        return this.b.f;
    }

    @Override // defpackage.ypf
    public final void p(Boolean bool) {
        this.c.a = bool;
    }

    @Override // defpackage.mxe
    public final Integer q() {
        return this.b.b;
    }

    @Override // defpackage.vd3
    public final Integer r() {
        return this.a.b;
    }

    @Override // defpackage.vd3
    public final void s(Integer num) {
        this.a.b = num;
    }

    @Override // defpackage.mxe
    public final void t(ak akVar) {
        this.b.c = akVar;
    }

    @Override // defpackage.vd3
    public final Integer u() {
        return this.a.d;
    }

    @Override // defpackage.cdg
    public final void v(Integer num) {
        this.a.a.a = num;
    }

    @Override // defpackage.ypf
    public final Integer w() {
        return this.c.b;
    }

    @Override // defpackage.ypf
    public final Integer x() {
        return this.c.c;
    }

    @Override // defpackage.cdg
    public final Integer y() {
        return this.a.a.b;
    }

    @Override // defpackage.vd3
    public final void z(Integer num) {
        this.a.c = num;
    }

    public bg3(y07 y07Var, a17 a17Var, c17 c17Var, String str) {
        this.a = y07Var;
        this.b = a17Var;
        this.c = c17Var;
        this.d = str;
    }
}
