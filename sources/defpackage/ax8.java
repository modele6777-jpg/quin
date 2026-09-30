package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ax8 extends gbe implements l26 {
    final /* synthetic */ int $index;
    final /* synthetic */ List<TarotSkinIdentify> $pending;
    final /* synthetic */ TarotSkinIdentify $skin;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ cx8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax8(TarotSkinIdentify tarotSkinIdentify, cx8 cx8Var, int i, List list, xn2 xn2Var) {
        super(2, xn2Var);
        this.$skin = tarotSkinIdentify;
        this.this$0 = cx8Var;
        this.$index = i;
        this.$pending = list;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ax8 ax8Var = new ax8(this.$skin, this.this$0, this.$index, this.$pending, xn2Var);
        ax8Var.L$0 = obj;
        return ax8Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Map map = (Map) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        hmd hmdVar = (hmd) map.get(this.$skin);
        s0e s0eVar = this.this$0.b;
        float size = (this.$index + (hmdVar != null ? hmdVar.b : 0.0f)) / this.$pending.size();
        gmd gmdVar = gmd.c;
        s0eVar.n(null, new sw8(gmdVar, size, 4));
        return Boolean.valueOf((hmdVar != null ? hmdVar.a : null) != gmdVar);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ax8) k((xn2) obj2, (Map) obj)).r(wef.a);
    }
}
