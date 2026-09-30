package defpackage;

import tech.chatmind.api.giftcard.GiftCardStatus;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t76 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ GiftCardStatus b;

    public /* synthetic */ t76(GiftCardStatus giftCardStatus, int i, int i2) {
        this.a = i2;
        this.b = giftCardStatus;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        GiftCardStatus giftCardStatus = this.b;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                x76.a(giftCardStatus, l46Var, k99.P(1));
                break;
            case 1:
                x76.a(giftCardStatus, l46Var, k99.P(1));
                break;
            case 2:
                x76.e(giftCardStatus, l46Var, k99.P(1));
                break;
            default:
                x76.e(giftCardStatus, l46Var, k99.P(1));
                break;
        }
        return wefVar;
    }
}
