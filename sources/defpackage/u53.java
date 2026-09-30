package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class u53 extends gbe implements l26 {
    final /* synthetic */ List<cod> $items;
    final /* synthetic */ a26 $onVisualSkinChanged;
    final /* synthetic */ yx9 $pagerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u53(xn2 xn2Var, a26 a26Var, yx9 yx9Var, List list) {
        super(2, xn2Var);
        this.$items = list;
        this.$pagerState = yx9Var;
        this.$onVisualSkinChanged = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        List<cod> list = this.$items;
        return new u53(xn2Var, this.$onVisualSkinChanged, this.$pagerState, list);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        TarotSkinIdentify tarotSkinIdentify;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        cod codVar = (cod) s72.y0(((sz9) this.$pagerState.d.c).j(), this.$items);
        if (codVar != null && (tarotSkinIdentify = codVar.a) != null) {
            this.$onVisualSkinChanged.d(tarotSkinIdentify);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        u53 u53Var = (u53) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        u53Var.r(wefVar);
        return wefVar;
    }
}
