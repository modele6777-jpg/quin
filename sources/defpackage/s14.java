package defpackage;

import ai.askquin.ui.router.AppRoute;
import ai.askquin.ui.router.GiftCardPerspective;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s14 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cb9 b;

    public /* synthetic */ s14(cb9 cb9Var) {
        this.a = 1;
        this.b = cb9Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        cb9 cb9Var = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                j74.q(cb9Var, (l46) obj, k99.P(1));
                break;
            case 1:
                String str = (String) obj;
                GiftCardPerspective giftCardPerspective = (GiftCardPerspective) obj2;
                str.getClass();
                giftCardPerspective.getClass();
                ka9.e(cb9Var, new AppRoute.GiftCardDetail(str, giftCardPerspective, false, 4, (rp3) null), null, 6);
                break;
            default:
                ((Integer) obj2).getClass();
                eec.b(cb9Var, (l46) obj, k99.P(1));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ s14(cb9 cb9Var, int i, int i2) {
        this.a = i2;
        this.b = cb9Var;
    }
}
