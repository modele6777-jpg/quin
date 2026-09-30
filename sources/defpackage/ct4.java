package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ct4 extends gbe implements l26 {
    final /* synthetic */ x16 $onAllCardsExploded;
    final /* synthetic */ jx $progress;
    final /* synthetic */ e89 $triggerExplosion$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct4(jx jxVar, x16 x16Var, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$progress = jxVar;
        this.$onAllCardsExploded = x16Var;
        this.$triggerExplosion$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ct4(this.$progress, this.$onAllCardsExploded, this.$triggerExplosion$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        ct4 ct4Var;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            if (((Boolean) this.$triggerExplosion$delegate.getValue()).booleanValue()) {
                jx jxVar = this.$progress;
                Float f = new Float(1.9f);
                x6f x6fVarT = b21.T(1000, 0, null, 6);
                this.label = 1;
                ct4Var = this;
                Object objB = jx.b(jxVar, f, x6fVarT, null, null, ct4Var, 12);
                bw2 bw2Var = bw2.a;
                if (objB == bw2Var) {
                    return bw2Var;
                }
            }
            return wef.a;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        ct4Var = this;
        ct4Var.$onAllCardsExploded.invoke();
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ct4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
