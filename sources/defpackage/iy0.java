package defpackage;

import ai.askquin.ui.router.GiftCardPerspective;
import tech.chatmind.api.giftcard.GiftCardItem;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iy0 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ iy0(GiftCardItem giftCardItem, GiftCardPerspective giftCardPerspective, v86 v86Var, boolean z, boolean z2, a26 a26Var, l26 l26Var, int i) {
        this.a = 2;
        this.e = giftCardItem;
        this.f = giftCardPerspective;
        this.g = v86Var;
        this.b = z;
        this.c = z2;
        this.w = a26Var;
        this.v = l26Var;
        this.d = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.d;
        Object obj3 = this.w;
        Object obj4 = this.v;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                af1.d(this.b, this.c, (use) obj7, (x16) obj6, (a26) obj3, (x16) obj5, (x16) obj4, (l46) obj, iP);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                vd0.t((j09) obj7, (r91) obj6, this.b, this.c, (xw9) obj5, (lm2) obj4, (dd2) obj3, (l46) obj, iP2);
                break;
            case 2:
                ((Integer) obj2).intValue();
                int iP3 = k99.P(i2 | 1);
                pa6.c((GiftCardItem) obj7, (GiftCardPerspective) obj6, (v86) obj5, this.b, this.c, (a26) obj3, (l26) obj4, (l46) obj, iP3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iP4 = k99.P(i2 | 1);
                pa6.l((String) obj7, (x16) obj6, this.b, this.c, (v86) obj5, (String) obj4, (j09) obj3, (l46) obj, iP4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iP5 = k99.P(i2 | 1);
                bm8.k(this.b, (a26) obj3, (j09) obj7, this.c, (ku6) obj6, (x4d) obj5, (dd2) obj4, (l46) obj, iP5);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP6 = k99.P(i2 | 1);
                arb.e((j09) obj7, (t2g) obj6, this.b, this.c, (xw9) obj5, (dd2) obj4, (a26) obj3, (l46) obj, iP6);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ iy0(Object obj, Object obj2, boolean z, boolean z2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.a = i2;
        this.e = obj;
        this.f = obj2;
        this.b = z;
        this.c = z2;
        this.g = obj3;
        this.v = obj4;
        this.w = obj5;
        this.d = i;
    }

    public /* synthetic */ iy0(boolean z, a26 a26Var, j09 j09Var, boolean z2, ku6 ku6Var, x4d x4dVar, dd2 dd2Var, int i) {
        this.a = 4;
        this.b = z;
        this.w = a26Var;
        this.e = j09Var;
        this.c = z2;
        this.f = ku6Var;
        this.g = x4dVar;
        this.v = dd2Var;
        this.d = i;
    }

    public /* synthetic */ iy0(boolean z, boolean z2, use useVar, x16 x16Var, a26 a26Var, x16 x16Var2, x16 x16Var3, int i) {
        this.a = 0;
        this.b = z;
        this.c = z2;
        this.e = useVar;
        this.f = x16Var;
        this.w = a26Var;
        this.g = x16Var2;
        this.v = x16Var3;
        this.d = i;
    }
}
