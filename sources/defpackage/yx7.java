package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yx7 extends lw9 {
    public static final /* synthetic */ wn7[] Y = {new aya(yx7.class, "binaryClasses", "getBinaryClasses$org_jetbrains_kotlin_descriptors_jvm()Ljava/util/Map;", 0), new aya(yx7.class, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0)};
    public final h10 X;
    public final pnb v;
    public final szc w;
    public final ee8 x;
    public final zk7 y;
    public final zd8 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public yx7(szc szcVar, pnb pnbVar) {
        mf7 mf7Var = (mf7) szcVar.b;
        super(mf7Var.h, pnbVar.a);
        this.v = pnbVar;
        szc szcVarQ = if9.q(szcVar, this, null, 6);
        this.w = szcVarQ;
        mf7Var.d.c().c.getClass();
        fv8 fv8Var = fv8.g;
        mf7 mf7Var2 = (mf7) szcVarQ.b;
        ge8 ge8Var = mf7Var2.a;
        this.x = new ee8(ge8Var, new xx7(this, 0));
        this.y = new zk7(szcVarQ, pnbVar, this);
        this.z = new zd8(ge8Var, new xx7(this, 1));
        this.X = mf7Var2.m.b ? hj6.c : kn2.V(szcVarQ, pnbVar);
        ge8Var.a(new xx7(this, 2));
    }

    @Override // defpackage.kw9
    public final dr8 F() {
        return this.y;
    }

    @Override // defpackage.lw9, defpackage.em3, defpackage.dm3
    public final ntd e() {
        return new vd9(24, this);
    }

    @Override // defpackage.m4, defpackage.f00
    public final h10 getAnnotations() {
        return this.X;
    }

    @Override // defpackage.lw9, defpackage.cm3, defpackage.m4
    public final String toString() {
        return "Lazy Java package fragment: " + this.f + " of module " + ((mf7) this.w.b).h;
    }
}
