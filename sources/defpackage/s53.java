package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class s53 extends gbe implements l26 {
    final /* synthetic */ TarotSkinIdentify $selectedSkin;
    final /* synthetic */ e89 $visualSkin$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s53(TarotSkinIdentify tarotSkinIdentify, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$selectedSkin = tarotSkinIdentify;
        this.$visualSkin$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new s53(this.$selectedSkin, this.$visualSkin$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        TarotSkinIdentify tarotSkinIdentify = this.$selectedSkin;
        if (tarotSkinIdentify != null) {
            this.$visualSkin$delegate.setValue(tarotSkinIdentify);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        s53 s53Var = (s53) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        s53Var.r(wefVar);
        return wefVar;
    }
}
