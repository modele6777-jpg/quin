package defpackage;

import tech.chatmind.api.giftcard.GiftCardItem;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class na6 extends gbe implements l26 {
    final /* synthetic */ a26 $onIssued;
    final /* synthetic */ h0e $state$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na6(a26 a26Var, h0e h0eVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$onIssued = a26Var;
        this.$state$delegate = h0eVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new na6(this.$onIssued, this.$state$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        String cardId;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        h0e h0eVar = this.$state$delegate;
        m8b m8bVar = pa6.a;
        GiftCardItem giftCardItem = ((f96) h0eVar.getValue()).f;
        if (giftCardItem != null && (cardId = giftCardItem.getCardId()) != null) {
            String str = v4e.Q(cardId) ? null : cardId;
            if (str != null) {
                this.$onIssued.d(str);
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        na6 na6Var = (na6) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        na6Var.r(wefVar);
        return wefVar;
    }
}
