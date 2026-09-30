package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kb9 extends gbe implements l26 {
    final /* synthetic */ da9 $backStackEntry;
    final /* synthetic */ ltc $transitionState;
    final /* synthetic */ float $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb9(float f, ltc ltcVar, da9 da9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$value = f;
        this.$transitionState = ltcVar;
        this.$backStackEntry = da9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new kb9(this.$value, this.$transitionState, this.$backStackEntry, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object objA;
        int i = this.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            float f = this.$value;
            if (f > 0.0f) {
                ltc ltcVar = this.$transitionState;
                this.label = 1;
                if (ltcVar.k(f, ltcVar.b.getValue(), this) != bw2Var) {
                }
            }
            return bw2Var;
        }
        if (i != 1) {
            if (i == 2) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (this.$value == 0.0f) {
            ltc ltcVar2 = this.$transitionState;
            da9 da9Var = this.$backStackEntry;
            this.label = 2;
            n3f n3fVar = ltcVar2.e;
            if (n3fVar == null || ((pa7.t(ltcVar2.c.getValue(), da9Var) && pa7.t(ltcVar2.b.getValue(), da9Var)) || (objA = c99.a(ltcVar2.l, new itc(ltcVar2, da9Var, n3fVar, null), this)) != bw2Var)) {
                objA = wefVar;
            }
            if (objA == bw2Var) {
                return bw2Var;
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((kb9) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
