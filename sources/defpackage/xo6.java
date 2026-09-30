package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xo6 extends gbe implements n26 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        xo6 xo6Var = new xo6(3, (xn2) obj3);
        xo6Var.L$0 = (TarotSkinIdentify) obj;
        xo6Var.L$1 = (mfc) obj2;
        return xo6Var.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) this.L$0;
        mfc mfcVar = (mfc) this.L$1;
        if (this.label == 0) {
            jzb.q(obj);
            return new iy9(tarotSkinIdentify, mfcVar);
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
