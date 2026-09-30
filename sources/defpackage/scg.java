package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class scg extends eg2 {
    public final fu0 k;

    public scg(fu0 fu0Var) {
        this.k = fu0Var;
    }

    public void A() {
        z();
    }

    @Override // defpackage.fu0
    public final gye f() {
        return this.k.f();
    }

    @Override // defpackage.fu0
    public final op8 g() {
        return this.k.g();
    }

    @Override // defpackage.fu0
    public final boolean h() {
        return this.k.h();
    }

    @Override // defpackage.fu0
    public final void k(lp3 lp3Var) {
        this.j = pqf.n(null);
        A();
    }

    @Override // defpackage.eg2
    public final zp8 s(Object obj, zp8 zp8Var) {
        return x(zp8Var);
    }

    @Override // defpackage.eg2
    public final long t(long j, Object obj) {
        return j;
    }

    @Override // defpackage.eg2
    public final int u(int i, Object obj) {
        return i;
    }

    @Override // defpackage.eg2
    public final void v(Object obj, fu0 fu0Var, gye gyeVar) {
        y(gyeVar);
    }

    public abstract void y(gye gyeVar);

    public final void z() {
        w(null, this.k);
    }

    public zp8 x(zp8 zp8Var) {
        return zp8Var;
    }
}
