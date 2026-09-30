package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class z07 implements vd3, mxe, gu2 {
    public final y07 a;
    public final a17 b;

    public z07(y07 y07Var, a17 a17Var) {
        this.a = y07Var;
        this.b = a17Var;
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

    @Override // defpackage.gu2
    public final Object copy() {
        return new z07(this.a.copy(), this.b.copy());
    }

    @Override // defpackage.mxe
    public final void e(Integer num) {
        this.b.b = num;
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

    @Override // defpackage.cdg
    public final Integer y() {
        return this.a.a.b;
    }

    @Override // defpackage.vd3
    public final void z(Integer num) {
        this.a.c = num;
    }
}
