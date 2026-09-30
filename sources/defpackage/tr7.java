package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tr7 extends gu7 implements a26 {
    final /* synthetic */ bx6 $imageStore;
    final /* synthetic */ e89 $particles;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr7(e89 e89Var, bx6 bx6Var) {
        super(1);
        this.$particles = e89Var;
        this.$imageStore = bx6Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        sn4 sn4Var = (sn4) obj;
        sn4Var.getClass();
        Iterable<r0a> iterable = (Iterable) this.$particles.getValue();
        bx6 bx6Var = this.$imageStore;
        for (r0a r0aVar : iterable) {
            ta0 ta0VarV0 = sn4Var.v0();
            long jZ = ta0VarV0.z();
            ta0VarV0.p().g();
            vd9 vd9Var = (vd9) ta0VarV0.c;
            float f = r0aVar.f;
            float f2 = r0aVar.b;
            float f3 = (r0aVar.c / 2.0f) + r0aVar.a;
            vd9Var.F(ynb.p(f3, (r0aVar.d / 2.0f) + f2), f);
            vd9Var.G(r0aVar.g, 1.0f, ynb.p(f3, f2));
            bp.g(r0aVar.h, sn4Var, r0aVar, bx6Var);
            ta0VarV0.p().o();
            ta0VarV0.R(jZ);
        }
        return wef.a;
    }
}
