package defpackage;

import tech.chatmind.api.giftcard.GiftCardItem;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n96 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s76 b;
    public final /* synthetic */ e89 c;

    public /* synthetic */ n96(s76 s76Var, e89 e89Var, int i) {
        this.a = i;
        this.b = s76Var;
        this.c = e89Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        e89 e89Var = this.c;
        final s76 s76Var = this.b;
        GiftCardItem giftCardItem = (GiftCardItem) obj;
        switch (i) {
            case 0:
                giftCardItem.getClass();
                final int i2 = 0;
                if (qa6.a(giftCardItem, new x16() { // from class: m96
                    @Override // defpackage.x16
                    public final Object invoke() {
                        int i3 = i2;
                        wef wefVar2 = wef.a;
                        s76 s76Var2 = s76Var;
                        switch (i3) {
                            case 0:
                                db6.b1("share_gift_card", cb6.a, new ya6(s76Var2, 0));
                                break;
                            default:
                                db6.b1("share_gift_card", cb6.a, new ya6(s76Var2, 0));
                                break;
                        }
                        return wefVar2;
                    }
                }) != null) {
                    e89Var.setValue(giftCardItem);
                }
                break;
            default:
                giftCardItem.getClass();
                final int i3 = 1;
                if (qa6.a(giftCardItem, new x16() { // from class: m96
                    @Override // defpackage.x16
                    public final Object invoke() {
                        int i4 = i3;
                        wef wefVar2 = wef.a;
                        s76 s76Var2 = s76Var;
                        switch (i4) {
                            case 0:
                                db6.b1("share_gift_card", cb6.a, new ya6(s76Var2, 0));
                                break;
                            default:
                                db6.b1("share_gift_card", cb6.a, new ya6(s76Var2, 0));
                                break;
                        }
                        return wefVar2;
                    }
                }) != null) {
                    e89Var.setValue(giftCardItem);
                }
                break;
        }
        return wefVar;
    }
}
