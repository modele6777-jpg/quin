package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uge extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ TarotSkinIdentify $skin;
    int label;
    final /* synthetic */ wge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uge(wge wgeVar, Context context, TarotSkinIdentify tarotSkinIdentify, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = wgeVar;
        this.$context = context;
        this.$skin = tarotSkinIdentify;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new uge(this.this$0, this.$context, this.$skin, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label == 0) {
            jzb.q(obj);
            return this.this$0.a.z(this.$context, this.$skin);
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((uge) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
