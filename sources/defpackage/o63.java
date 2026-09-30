package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o63 extends gbe implements a26 {
    final /* synthetic */ TarotSkinIdentify $skin;
    final /* synthetic */ d63 $success;
    int label;
    final /* synthetic */ y63 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o63(xn2 xn2Var, d63 d63Var, y63 y63Var, TarotSkinIdentify tarotSkinIdentify) {
        super(1, xn2Var);
        this.this$0 = y63Var;
        this.$success = d63Var;
        this.$skin = tarotSkinIdentify;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new o63((xn2) obj, this.$success, this.this$0, this.$skin).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            gd8 gd8Var = this.this$0.e;
            String str = this.$success.a;
            String strName = this.$skin.getKey().name();
            this.label = 1;
            Object objO = gd8Var.o(str, strName, this);
            bw2 bw2Var = bw2.a;
            if (objO == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }
}
