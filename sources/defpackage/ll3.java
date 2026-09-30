package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ll3 extends gbe implements p26 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.p26
    public final Object C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        ll3 ll3Var = new ll3(5, (xn2) obj5);
        ll3Var.L$0 = (TarotSkinIdentify) obj;
        ll3Var.L$1 = (TarotSkinIdentify) obj2;
        ll3Var.L$2 = (hw8) obj3;
        ll3Var.Z$0 = zBooleanValue;
        return ll3Var.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) this.L$0;
        TarotSkinIdentify tarotSkinIdentify2 = (TarotSkinIdentify) this.L$1;
        hw8 hw8Var = (hw8) this.L$2;
        boolean z = this.Z$0;
        if (this.label == 0) {
            jzb.q(obj);
            return new ck3(tarotSkinIdentify, tarotSkinIdentify2, hw8Var, z);
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
