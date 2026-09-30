package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class em6 extends gbe implements l26 {
    final /* synthetic */ xm6 $guideConditions;
    final /* synthetic */ an6 $guideCoordinator;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em6(an6 an6Var, xm6 xm6Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$guideCoordinator = an6Var;
        this.$guideConditions = xm6Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new em6(this.$guideCoordinator, this.$guideConditions, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        ym6 ym6Var;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        an6 an6Var = this.$guideCoordinator;
        xm6 xm6Var = this.$guideConditions;
        an6Var.getClass();
        xm6Var.getClass();
        boolean z = xm6Var.e;
        if (z) {
            an6Var.f = true;
        }
        if (xm6Var.a && xm6Var.c && xm6Var.d && !z && !xm6Var.f) {
            if (!xm6Var.b) {
                ym6Var = new ym6(bn6.b, an6Var.f ? 1200L : 0L);
            } else if (xm6Var.g) {
                ym6Var = new ym6(bn6.c, an6Var.g ? 1200L : 0L);
            } else {
                ym6Var = new ym6();
            }
        } else {
            ym6Var = new ym6();
        }
        if (!ym6Var.equals(an6Var.d)) {
            an6Var.d = ym6Var;
            lyd lydVar = an6Var.e;
            if (lydVar != null) {
                lydVar.h(null);
            }
            s0e s0eVar = an6Var.b;
            bn6 bn6Var = bn6.a;
            s0eVar.n(null, bn6Var);
            if (ym6Var.a != bn6Var) {
                an6Var.e = ynb.V(an6Var.a, null, null, new zm6(ym6Var, an6Var, null), 3);
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        em6 em6Var = (em6) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        em6Var.r(wefVar);
        return wefVar;
    }
}
