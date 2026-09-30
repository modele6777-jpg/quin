package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s08 implements zy7 {
    public final j18 a;

    public s08(j18 j18Var) {
        this.a = j18Var;
    }

    @Override // defpackage.zy7
    public final int a() {
        return this.a.h().o;
    }

    @Override // defpackage.zy7
    public final int b() {
        return Math.min(a() - 1, ((c18) s72.F0(this.a.h().l)).a);
    }

    @Override // defpackage.zy7
    public final int c() {
        int i;
        j18 j18Var = this.a;
        if (j18Var.h().l.isEmpty()) {
            return 0;
        }
        b18 b18VarH = j18Var.h();
        int i2 = (int) (b18VarH.p == ks9.a ? b18VarH.i() & 4294967295L : b18VarH.i() >> 32);
        int iA = nk8.A(j18Var.h());
        if (iA != 0 && (i = i2 / iA) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.zy7
    public final boolean d() {
        return !this.a.h().l.isEmpty();
    }

    @Override // defpackage.zy7
    public final int e() {
        return Math.max(0, this.a.e.b.j());
    }
}
