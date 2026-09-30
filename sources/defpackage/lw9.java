package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class lw9 extends em3 implements kw9 {
    public final dx5 f;
    public final String g;

    /* JADX WARN: Illegal instructions before constructor call */
    public lw9(w09 w09Var, dx5 dx5Var) {
        w09Var.getClass();
        dx5Var.getClass();
        g10 g10Var = hj6.c;
        ex5 ex5Var = dx5Var.a;
        super(w09Var, g10Var, ex5Var.c() ? ex5.e : ex5Var.g(), ntd.T);
        this.f = dx5Var;
        this.g = "package " + dx5Var + " of " + w09Var;
    }

    @Override // defpackage.bm3
    public final Object D(fm3 fm3Var, Object obj) {
        return fm3Var.x(this, obj);
    }

    @Override // defpackage.em3, defpackage.bm3
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public final w09 k() {
        bm3 bm3VarK = super.k();
        bm3VarK.getClass();
        return (w09) bm3VarK;
    }

    @Override // defpackage.em3, defpackage.dm3
    public ntd e() {
        return ntd.T;
    }

    @Override // defpackage.cm3, defpackage.m4
    public String toString() {
        return this.g;
    }
}
