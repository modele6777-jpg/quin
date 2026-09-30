package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n18 extends cm3 {
    public static final /* synthetic */ wn7[] w = {new aya(n18.class, "fragments", "getFragments()Ljava/util/List;", 0), new aya(n18.class, "empty", "getEmpty()Z", 0)};
    public final x09 d;
    public final dx5 e;
    public final ee8 f;
    public final ee8 g;
    public final p18 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public n18(x09 x09Var, dx5 dx5Var, ge8 ge8Var) {
        ge8Var.getClass();
        g10 g10Var = hj6.c;
        ex5 ex5Var = dx5Var.a;
        super(g10Var, ex5Var.c() ? ex5.e : ex5Var.g());
        this.d = x09Var;
        this.e = dx5Var;
        this.f = new ee8(ge8Var, new m18(this, 0));
        this.g = new ee8(ge8Var, new m18(this, 1));
        this.v = new p18(ge8Var, new m18(this, 2));
    }

    @Override // defpackage.bm3
    public final Object D(fm3 fm3Var, Object obj) {
        return fm3Var.n(this, obj);
    }

    public final boolean equals(Object obj) {
        n18 n18Var = obj instanceof n18 ? (n18) obj : null;
        return n18Var != null && pa7.t(this.e, n18Var.e) && pa7.t(this.d, n18Var.d);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    @Override // defpackage.bm3
    public final bm3 k() {
        dx5 dx5Var = this.e;
        if (dx5Var.a.c()) {
            return null;
        }
        return this.d.W(dx5Var.b());
    }
}
