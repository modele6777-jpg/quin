package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import tech.chatmind.api.giftcard.GiftCardItem;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xb implements l26 {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xb(j09 j09Var, long j, int i, a26 a26Var, int i2) {
        this.b = j09Var;
        this.c = j;
        this.d = i;
        this.e = a26Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        wef wefVar = wef.a;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                lc.h(this.b, this.c, (x16) obj3, (l46) obj, iP);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(7);
                bm8.g(this.b, this.c, this.d, (a26) obj3, (l46) obj, iP2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(i2 | 1);
                feg.g((GiftCardItem) obj3, this.c, this.b, (l46) obj, iP3);
                break;
            default:
                ((Integer) obj2).intValue();
                int iP4 = k99.P(i2 | 1);
                a6c.a((TarotSkinIdentify) obj3, this.b, this.c, (l46) obj, iP4);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ xb(j09 j09Var, long j, x16 x16Var, int i) {
        this.b = j09Var;
        this.c = j;
        this.e = x16Var;
        this.d = i;
    }

    public /* synthetic */ xb(TarotSkinIdentify tarotSkinIdentify, j09 j09Var, long j, int i) {
        this.e = tarotSkinIdentify;
        this.b = j09Var;
        this.c = j;
        this.d = i;
    }

    public /* synthetic */ xb(GiftCardItem giftCardItem, long j, j09 j09Var, int i) {
        this.e = giftCardItem;
        this.c = j;
        this.b = j09Var;
        this.d = i;
    }
}
