package defpackage;

import ai.askquin.R;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class os1 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ os1(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    nte.b(afc.r(R.string.photo_pick_number_card, new Object[]{Integer.valueOf(i2)}, l46Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 0, 0, 262142);
                }
                break;
            case 1:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    nte.b(afc.q(i2, l46Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var2, 0, 0, 262142);
                }
                break;
            case 2:
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    l46Var3.Z();
                } else {
                    nte.b(afc.q(i2, l46Var3), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var3, 0, 0, 262142);
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                kj0.s(i2, k99.P(1), (l46) obj);
                break;
            case 4:
                l46 l46Var4 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!l46Var4.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    l46Var4.Z();
                } else {
                    String strQ = afc.q(R.string.friend_coupon_rules_title, l46Var4);
                    mue mueVar = pue.a;
                    nte.b(strQ, null, ((e8b) l46Var4.k(l8b.a)).t, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.f(l46Var4), l46Var4, 0, 0, 131066);
                    eb3.r(afc.q(R.string.friend_coupon_rule_link, l46Var4), l46Var4, 0);
                    eb3.r(afc.q(R.string.friend_coupon_rule_eligibility, l46Var4), l46Var4, 0);
                    eb3.r(afc.r(R.string.friend_coupon_rule_validity, new Object[]{Integer.valueOf(i2)}, l46Var4), l46Var4, 0);
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                eb3.s(i2, k99.P(1), (l46) obj);
                break;
            case 6:
                l46 l46Var5 = (l46) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!l46Var5.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    l46Var5.Z();
                } else {
                    Object objR = l46Var5.R();
                    i8c i8cVar = sf2.a;
                    if (objR == i8cVar) {
                        objR = new nd8(8);
                        l46Var5.p0(objR);
                    }
                    a26 a26Var = (a26) objR;
                    boolean zE = l46Var5.e(i2);
                    Object objR2 = l46Var5.R();
                    if (zE || objR2 == i8cVar) {
                        objR2 = new xp(i2, 15);
                        l46Var5.p0(objR2);
                    }
                    xo1.c(a26Var, null, (a26) objR2, l46Var5, 6, 2);
                }
                break;
            case 7:
                l46 l46Var6 = (l46) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!l46Var6.W(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    l46Var6.Z();
                } else {
                    lmg.I(null, this.b, 4, 0.0f, 0.0f, bx5.b(l46Var6).a, l46Var6, 384, 25);
                }
                break;
            case 8:
                l46 l46Var7 = (l46) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!l46Var7.W(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    l46Var7.Z();
                } else {
                    String strR = afc.r(R.string.friend_coupon_entry_badge, new Object[]{Integer.valueOf(i2)}, l46Var7);
                    long j = we6.e(l46Var7) ? k06.c : ((e8b) l46Var7.k(l8b.a)).u;
                    mue mueVar2 = oue.a;
                    nte.b(strR, ynb.a0(g09.a, 6.0f, 2.0f), j, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var7), l46Var7, 48, 0, 131064);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                o8c.a(i2, k99.P(1), (l46) obj);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ os1(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
    }
}
