package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m08 implements k08 {
    public final mx3 a;
    public final /* synthetic */ j18 b;
    public final /* synthetic */ boolean c;

    public m08(j18 j18Var, boolean z) {
        this.b = j18Var;
        this.c = z;
        this.a = zrd.b(new te3(j18Var, 3));
    }

    @Override // defpackage.k08
    public final int a() {
        j18 j18Var = this.b;
        return (int) (j18Var.h().p == ks9.a ? j18Var.h().i() & 4294967295L : j18Var.h().i() >> 32);
    }

    @Override // defpackage.k08
    public final float b() {
        j18 j18Var = this.b;
        return (j18Var.e.b.j() * 500) + j18Var.e.c.j();
    }

    @Override // defpackage.k08
    public final int c() {
        j18 j18Var = this.b;
        return (-j18Var.h().m) + j18Var.h().q;
    }

    @Override // defpackage.k08
    public final float d() {
        j18 j18Var = this.b;
        int iJ = j18Var.e.b.j();
        int iJ2 = j18Var.e.c.j();
        return j18Var.d() ? (iJ * 500) + iJ2 + 100.0f : (iJ * 500) + iJ2;
    }

    @Override // defpackage.k08
    public final p72 e() {
        boolean z = this.c;
        mx3 mx3Var = this.a;
        return z ? new p72(((Number) mx3Var.getValue()).intValue(), 1) : new p72(1, ((Number) mx3Var.getValue()).intValue());
    }

    @Override // defpackage.k08
    public final Object f(int i, q08 q08Var) {
        vea veaVar = j18.y;
        Object objJ = this.b.j(i, 0, q08Var);
        return objJ == bw2.a ? objJ : wef.a;
    }
}
