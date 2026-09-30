package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kt1 extends gbe implements l26 {
    final /* synthetic */ TarotSkinIdentify $skin;
    int label;
    final /* synthetic */ nt1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt1(nt1 nt1Var, TarotSkinIdentify tarotSkinIdentify, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = nt1Var;
        this.$skin = tarotSkinIdentify;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new kt1(this.this$0, this.$skin, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            gd8 gd8Var = this.this$0.d;
            String strName = this.$skin.getKey().name();
            this.label = 1;
            Object objM = gd8Var.m(strName, this);
            bw2 bw2Var = bw2.a;
            if (objM == bw2Var) {
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

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((kt1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
