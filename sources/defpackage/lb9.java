package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lb9 extends gbe implements l26 {
    final /* synthetic */ da9 $backStackEntry;
    final /* synthetic */ n3f $transition;
    final /* synthetic */ ltc $transitionState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb9(ltc ltcVar, da9 da9Var, n3f n3fVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$transitionState = ltcVar;
        this.$backStackEntry = da9Var;
        this.$transition = n3fVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        lb9 lb9Var = new lb9(this.$transitionState, this.$backStackEntry, this.$transition, xn2Var);
        lb9Var.L$0 = obj;
        return lb9Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0094 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0095 A[RETURN] */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object objA;
        int i = this.label;
        wef wefVar = wef.a;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return wefVar;
            }
            if (i == 2) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        aw2 aw2Var = (aw2) this.L$0;
        boolean zT = pa7.t(this.$transitionState.c.getValue(), this.$backStackEntry);
        bw2 bw2Var = bw2.a;
        if (zT) {
            long jLongValue = ((Number) this.$transition.m.getValue()).longValue() / 1000000;
            float fJ = this.$transitionState.i.j();
            x6f x6fVarT = b21.T((int) (this.$transitionState.i.j() * jLongValue), 0, null, 6);
            m65 m65Var = new m65(aw2Var, this.$transitionState, this.$backStackEntry, 21);
            this.label = 2;
            if (hkg.S(fJ, 0.0f, x6fVarT, m65Var, this, 4) == bw2Var) {
                return bw2Var;
            }
            return wefVar;
        }
        ltc ltcVar = this.$transitionState;
        da9 da9Var = this.$backStackEntry;
        this.label = 1;
        n3f n3fVar = ltcVar.e;
        if (n3fVar == null || (objA = c99.a(ltcVar.l, new dtc(ltcVar, da9Var, n3fVar, null, null), this)) != bw2Var) {
            objA = wefVar;
        }
        if (objA == bw2Var) {
            return bw2Var;
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((lb9) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
