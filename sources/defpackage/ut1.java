package defpackage;

import ai.askquin.ui.router.GiftCardPerspective;
import tech.chatmind.api.giftcard.GiftCardItem;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ut1 implements a26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ut1(boolean z, boolean z2, GiftCardItem giftCardItem, GiftCardPerspective giftCardPerspective, l26 l26Var) {
        this.b = z;
        this.c = z2;
        this.d = giftCardItem;
        this.e = giftCardPerspective;
        this.f = l26Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        Float f;
        int i = this.a;
        wef wefVar = wef.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        boolean z = this.c;
        boolean z2 = this.b;
        switch (i) {
            case 0:
                tt1 tt1Var = (tt1) obj3;
                String str = (String) obj2;
                bv7 bv7Var = (bv7) obj;
                bv7Var.getClass();
                ((bv7[]) obj4)[0] = bv7Var;
                if (z2 && pa7.t(tt1Var.a(), str) && bv7Var.h()) {
                    hkb hkbVarB = vt1.b(bv7Var, z);
                    String strA = tt1Var.a();
                    if (strA != null) {
                        ou1 ou1Var = (ou1) tt1Var.c.get(strA);
                        tt1Var.e.setValue(Float.valueOf((ou1Var == null || (f = ou1Var.b) == null) ? 0.0f : f.floatValue()));
                        tt1Var.g.setValue(null);
                        tt1Var.d.setValue(hkbVarB);
                        tt1Var.b(false);
                    }
                }
                break;
            default:
                GiftCardItem giftCardItem = (GiftCardItem) obj4;
                GiftCardPerspective giftCardPerspective = (GiftCardPerspective) obj3;
                l26 l26Var = (l26) obj2;
                v08 v08Var = (v08) obj;
                v08Var.getClass();
                int i2 = 3;
                if (z2) {
                    v08.W(v08Var, null, lmg.i, 3);
                }
                v08.W(v08Var, null, new dd2(new zk(giftCardItem, z, i2), true, 703590926), 3);
                if (z) {
                    v08.W(v08Var, null, new dd2(new w7(23, giftCardItem, giftCardPerspective), true, 1452564448), 3);
                }
                String redeemCode = giftCardItem.getRedeemCode();
                if (redeemCode != null) {
                    if (v4e.Q(redeemCode)) {
                        redeemCode = null;
                    }
                    if (redeemCode != null) {
                        v08.W(v08Var, null, new dd2(new j41(redeemCode, l26Var, giftCardItem, 9), true, -978864914), 3);
                    }
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ ut1(bv7[] bv7VarArr, boolean z, tt1 tt1Var, String str, boolean z2) {
        this.d = bv7VarArr;
        this.b = z;
        this.e = tt1Var;
        this.f = str;
        this.c = z2;
    }
}
