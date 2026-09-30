package defpackage;

import tech.chatmind.api.giftcard.GiftCardDraftRequest;
import tech.chatmind.api.giftcard.GiftCardSku;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class w96 extends gbe implements a26 {
    final /* synthetic */ String $blessing;
    final /* synthetic */ String $nickname;
    final /* synthetic */ GiftCardSku $sku;
    int label;
    final /* synthetic */ ea6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w96(ea6 ea6Var, GiftCardSku giftCardSku, String str, String str2, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = ea6Var;
        this.$sku = giftCardSku;
        this.$nickname = str;
        this.$blessing = str2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new w96(this.this$0, this.$sku, this.$nickname, this.$blessing, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        String str;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        r76 r76Var = this.this$0.a;
        GiftCardSku giftCardSku = this.$sku;
        giftCardSku.getClass();
        int i2 = fa6.a[giftCardSku.ordinal()];
        if (i2 == 1) {
            str = "1month";
        } else if (i2 == 2) {
            str = "1year";
        } else {
            if (i2 != 3) {
                ap.c();
                return null;
            }
            str = "";
        }
        GiftCardDraftRequest giftCardDraftRequest = new GiftCardDraftRequest(str, t72.c0(this.$nickname), t72.c0(this.$blessing));
        this.label = 1;
        Object objC = r76Var.c(giftCardDraftRequest, this);
        bw2 bw2Var = bw2.a;
        return objC == bw2Var ? bw2Var : objC;
    }
}
