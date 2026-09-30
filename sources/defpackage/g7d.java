package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g7d extends gbe implements l26 {
    final /* synthetic */ boolean $backgroundReady;
    final /* synthetic */ h0e $currentOnBackgroundReadyChange$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7d(boolean z, h0e h0eVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$backgroundReady = z;
        this.$currentOnBackgroundReadyChange$delegate = h0eVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new g7d(this.$backgroundReady, this.$currentOnBackgroundReadyChange$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        h0e h0eVar = this.$currentOnBackgroundReadyChange$delegate;
        y6c y6cVar = h7d.a;
        ((a26) h0eVar.getValue()).d(Boolean.valueOf(this.$backgroundReady));
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        g7d g7dVar = (g7d) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        g7dVar.r(wefVar);
        return wefVar;
    }
}
