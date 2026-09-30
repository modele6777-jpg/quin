package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xd2 implements n26 {
    public final /* synthetic */ int a;

    public /* synthetic */ xd2(int i) {
        this.a = i;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        l46 l46Var;
        wef wefVar;
        int i = this.a;
        ov7 ov7Var = LayoutNode.h1;
        g09 g09Var = g09.a;
        wef wefVar2 = wef.a;
        switch (i) {
            case 0:
                l46 l46Var2 = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var2.Z();
                } else {
                    nte.b(afc.q(R.string.friend_coupon_retry, l46Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var2, 0, 0, 262142);
                }
                break;
            case 1:
                l46 l46Var3 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var3.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var3.Z();
                } else {
                    String strQ = afc.q(R.string.friend_coupon_grant_later, l46Var3);
                    mue mueVar = pue.a;
                    nte.b(strQ, null, ((e8b) l46Var3.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.b(l46Var3), l46Var3, 0, 0, 131066);
                }
                break;
            case 2:
                l46 l46Var4 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (!l46Var4.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    l46Var4.Z();
                } else {
                    nte.b(afc.q(R.string.gift_card_load_failed, l46Var4), ynb.Z(g09Var, 8.0f), ((m82) l46Var4.k(o82.a)).w, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var4, 48, 0, 262136);
                }
                break;
            case 3:
                l46 l46Var5 = (l46) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (!l46Var5.W(1 & iIntValue4, (iIntValue4 & 17) != 16)) {
                    l46Var5.Z();
                } else {
                    pa6.n(0, l46Var5);
                }
                break;
            case 4:
                l46 l46Var6 = (l46) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (!l46Var6.W(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    l46Var6.Z();
                } else {
                    nte.b(afc.q(R.string.gift_card_issuance_delayed, l46Var6), ynb.Z(g09Var, 8.0f), ((e8b) l46Var6.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var6, 48, 0, 262136);
                }
                break;
            case 5:
                l46 l46Var7 = (l46) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (!l46Var7.W(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    l46Var7.Z();
                } else {
                    j09 j09VarD0 = ynb.d0(0.0f, 0.0f, 0.0f, 12.0f, 7, b.c(g09Var, 1.0f));
                    c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Z, l46Var7, 54);
                    int iHashCode = Long.hashCode(l46Var7.T);
                    u8a u8aVarM = l46Var7.m();
                    j09 j09VarJ = m93.J(l46Var7, j09VarD0);
                    lf2.q.getClass();
                    l46Var7.j0();
                    if (l46Var7.S) {
                        l46Var7.l(ov7Var);
                    } else {
                        l46Var7.s0();
                    }
                    dec.l(hj6.z, l46Var7, c92VarA);
                    dec.l(hj6.y, l46Var7, u8aVarM);
                    dec.l(hj6.X, l46Var7, Integer.valueOf(iHashCode));
                    dec.k(l46Var7);
                    dec.l(hj6.x, l46Var7, j09VarJ);
                    String strQ2 = afc.q(R.string.gift_card_ready_title, l46Var7);
                    pr4 pr4Var = l8b.a;
                    long j = ((e8b) l46Var7.k(pr4Var)).q;
                    mue mueVar2 = pue.a;
                    nte.b(strQ2, b.c(g09Var, 1.0f), j, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mue.a(pue.n(l46Var7), 0L, 0L, null, cr5.c, 0L, null, 0, 0L, null, null, 16777183), l46Var7, 48, 0, 130040);
                    String strQ3 = afc.q(R.string.gift_card_ready_subtitle, l46Var7);
                    long j2 = ((e8b) l46Var7.k(pr4Var)).r;
                    mue mueVar3 = oue.a;
                    nte.b(strQ3, b.c(g09Var, 1.0f), j2, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var7), l46Var7, 48, 0, 130040);
                    l46Var7.r(true);
                }
                break;
            case 6:
                l46 l46Var8 = (l46) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var8.W(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    l46Var8.Z();
                } else {
                    s21.a(b.l(g09Var, 48.0f), l46Var8, 6);
                }
                break;
            case 7:
                l46 l46Var9 = (l46) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (!l46Var9.W(1 & iIntValue8, (iIntValue8 & 17) != 16)) {
                    l46Var9.Z();
                } else {
                    al6.e(0, l46Var9);
                }
                break;
            case 8:
                l46 l46Var10 = (l46) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var10.W(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    l46Var10.Z();
                }
                break;
            case 9:
                l46 l46Var11 = (l46) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (!l46Var11.W(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    l46Var11.Z();
                }
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                l46 l46Var12 = (l46) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (!l46Var12.W(1 & iIntValue11, (iIntValue11 & 17) != 16)) {
                    l46Var12.Z();
                } else {
                    dj6.q(afc.q(R.string.home_new_feature_title, l46Var12), l46Var12, 0);
                }
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                l46 l46Var13 = (l46) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (!l46Var13.W(1 & iIntValue12, (iIntValue12 & 17) != 16)) {
                    l46Var13.Z();
                } else {
                    dj6.q(afc.q(R.string.scene_reading_section_title, l46Var13), l46Var13, 0);
                }
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                l46 l46Var14 = (l46) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (!l46Var14.W(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    l46Var14.Z();
                } else {
                    no6.p(48, l46Var14, ynb.c0(g09Var, wn6.a, 18.0f, 20.0f, 10.0f), afc.q(R.string.home_new_feature_title, l46Var14));
                }
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                l46 l46Var15 = (l46) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (!l46Var15.W(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    l46Var15.Z();
                } else {
                    no6.p(48, l46Var15, ynb.c0(g09Var, wn6.a, 22.0f, 20.0f, 10.0f), afc.q(R.string.scene_reading_section_title, l46Var15));
                }
                break;
            case 14:
                c31 c31Var = (c31) obj;
                l46 l46Var16 = (l46) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                c31Var.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= l46Var16.g(c31Var) ? 4 : 2;
                }
                if (!l46Var16.W(1 & iIntValue15, (iIntValue15 & 19) != 18)) {
                    l46Var16.Z();
                } else {
                    no6.t(no6.v(c31Var), l46Var16, 0);
                }
                break;
            case 15:
                c31 c31Var2 = (c31) obj;
                l46 l46Var17 = (l46) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                c31Var2.getClass();
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= l46Var17.g(c31Var2) ? 4 : 2;
                }
                if (!l46Var17.W(1 & iIntValue16, (iIntValue16 & 19) != 18)) {
                    l46Var17.Z();
                } else {
                    no6.q(no6.v(c31Var2), l46Var17, 0);
                }
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                c31 c31Var3 = (c31) obj;
                l46 l46Var18 = (l46) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                c31Var3.getClass();
                if ((iIntValue17 & 6) == 0) {
                    iIntValue17 |= l46Var18.g(c31Var3) ? 4 : 2;
                }
                if (!l46Var18.W(1 & iIntValue17, (iIntValue17 & 19) != 18)) {
                    l46Var18.Z();
                } else {
                    no6.t(no6.v(c31Var3), l46Var18, 0);
                }
                break;
            case 17:
                c31 c31Var4 = (c31) obj;
                l46 l46Var19 = (l46) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                c31Var4.getClass();
                if ((iIntValue18 & 6) == 0) {
                    iIntValue18 |= l46Var19.g(c31Var4) ? 4 : 2;
                }
                if (!l46Var19.W(1 & iIntValue18, (iIntValue18 & 19) != 18)) {
                    l46Var19.Z();
                } else {
                    no6.q(no6.v(c31Var4), l46Var19, 0);
                }
                break;
            case 18:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                l46 l46Var20 = (l46) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                if ((iIntValue19 & 6) == 0) {
                    iIntValue19 |= l46Var20.h(zBooleanValue) ? 4 : 2;
                }
                if (!l46Var20.W(iIntValue19 & 1, (iIntValue19 & 19) != 18)) {
                    l46Var20.Z();
                } else if (!zBooleanValue) {
                    l46Var20.f0(-1413821031);
                    l46Var20.r(false);
                } else {
                    l46Var20.f0(-1413848900);
                    fu6.b(0, 1, 0L, l46Var20);
                    l46Var20.r(false);
                }
                break;
            case 19:
                String str = (String) obj;
                l46 l46Var21 = (l46) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                if ((iIntValue20 & 6) == 0) {
                    iIntValue20 |= l46Var21.g(str) ? 4 : 2;
                }
                if (!l46Var21.W(1 & iIntValue20, (iIntValue20 & 19) != 18)) {
                    l46Var21.Z();
                } else {
                    if (str == null) {
                        l46Var21.f0(-444909634);
                        l46Var21.r(false);
                        wefVar = null;
                        l46Var = l46Var21;
                    } else {
                        l46Var21.f0(-444909633);
                        nte.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new mue(((m82) l46Var21.k(o82.a)).w, w6c.l(14), null, null, null, 0L, 0L, 3, 0, w6c.l(20), null, null, 16613372), l46Var21, 0, 0, 131070);
                        l46Var = l46Var21;
                        l46Var.r(false);
                        wefVar = wefVar2;
                    }
                    if (wefVar != null) {
                        l46Var.f0(-1399825417);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-1399816551);
                        tec.u(g09Var, 16.0f, l46Var, false);
                    }
                }
                break;
            case 20:
                l46 l46Var22 = (l46) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (!l46Var22.W(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    l46Var22.Z();
                }
                break;
            case 21:
                l46 l46Var23 = (l46) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var23.W(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    l46Var23.Z();
                } else {
                    nte.b(afc.q(R.string.main_privacy_learn_more, l46Var23), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var23, 0, 0, 262142);
                }
                break;
            case 22:
                l46 l46Var24 = (l46) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var24.W(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    l46Var24.Z();
                } else {
                    nte.b(afc.q(R.string.main_privacy_not_send, l46Var24), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var24, 0, 0, 262142);
                }
                break;
            case 23:
                l46 l46Var25 = (l46) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var25.W(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    l46Var25.Z();
                } else {
                    nte.b(afc.q(R.string.main_privacy_not_send, l46Var25), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var25, 0, 0, 262142);
                }
                break;
            case 24:
                l46 l46Var26 = (l46) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var26.W(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    l46Var26.Z();
                } else {
                    nte.b(afc.q(R.string.activity_popup_claim, l46Var26), null, 0L, w6c.l(19), ar5.x, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var26, 1597440, 0, 262062);
                }
                break;
            case 25:
                l46 l46Var27 = (l46) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var27.W(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    l46Var27.Z();
                } else {
                    nte.b(afc.q(R.string.activity_popup_claim, l46Var27), null, 0L, w6c.l(19), ar5.y, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var27, 1597440, 0, 262062);
                }
                break;
            case 26:
                xw9 xw9Var = (xw9) obj;
                l46 l46Var28 = (l46) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                xw9Var.getClass();
                if ((iIntValue27 & 6) == 0) {
                    iIntValue27 |= l46Var28.g(xw9Var) ? 4 : 2;
                }
                if (!l46Var28.W(iIntValue27 & 1, (iIntValue27 & 19) != 18)) {
                    l46Var28.Z();
                } else {
                    j09 j09VarD1 = ynb.d0(0.0f, 8.0f, 0.0f, 0.0f, 13, ynb.Y(b.c, xw9Var));
                    c92 c92VarA2 = a92.a(new uc0(8.0f, false, new jv2(2, ndb.y)), ndb.Z, l46Var28, 54);
                    int iHashCode2 = Long.hashCode(l46Var28.T);
                    u8a u8aVarM2 = l46Var28.m();
                    j09 j09VarJ2 = m93.J(l46Var28, j09VarD1);
                    lf2.q.getClass();
                    l46Var28.j0();
                    if (l46Var28.S) {
                        l46Var28.l(ov7Var);
                    } else {
                        l46Var28.s0();
                    }
                    dec.l(hj6.z, l46Var28, c92VarA2);
                    dec.l(hj6.y, l46Var28, u8aVarM2);
                    dec.l(hj6.X, l46Var28, Integer.valueOf(iHashCode2));
                    dec.k(l46Var28);
                    dec.l(hj6.x, l46Var28, j09VarJ2);
                    j09 j09VarB0 = ynb.b0(24.0f, 0.0f, b.c(g09Var, 1.0f), 2);
                    String strQ4 = afc.q(R.string.annual_monthly_pattern_title, l46Var28);
                    mue mueVar4 = pue.a;
                    mue mueVarP = pue.p(l46Var28);
                    cq5 cq5Var = cr5.c;
                    pr4 pr4Var2 = l8b.a;
                    nte.b(strQ4, j09VarB0, ((e8b) l46Var28.k(pr4Var2)).s, 0L, null, cq5Var, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarP, l46Var28, 48, 0, 129912);
                    nte.c(af1.z(R.string.annual_monthly_pattern_subtitle, l46Var28, mue.a(pue.n(l46Var28), ((e8b) l46Var28.k(pr4Var2)).u, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214).a), ynb.b0(24.0f, 0.0f, b.c(g09Var, 1.0f), 2), ((e8b) l46Var28.k(pr4Var2)).q, 0L, ar5.y, null, 0L, new jme(3), 0L, 0, false, 0, 0, null, null, pue.n(l46Var28), l46Var28, 1572912, 0, 261048);
                    feg.j(od4.A(R.drawable.img_annual_12_spread, 0, l46Var28), null, kv2.e(g09Var, 20.0f, l46Var28, g09Var, 1.0f), null, an2.d, 0.0f, null, l46Var28, 25016, 104);
                    l46Var28.r(true);
                }
                break;
            case 27:
                l46 l46Var29 = (l46) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var29.W(iIntValue28 & 1, (iIntValue28 & 17) != 16)) {
                    l46Var29.Z();
                } else {
                    String strQ5 = afc.q(R.string.notification_permission_tp_later, l46Var29);
                    mue mueVar5 = pue.a;
                    nte.b(strQ5, null, ((e8b) l46Var29.k(l8b.a)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.b(l46Var29), l46Var29, 0, 0, 131066);
                }
                break;
            case 28:
                l46 l46Var30 = (l46) obj2;
                int iIntValue29 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var30.W(iIntValue29 & 1, (iIntValue29 & 17) != 16)) {
                    l46Var30.Z();
                } else {
                    String strQ6 = afc.q(R.string.notification_permission_tp_later, l46Var30);
                    mue mueVar6 = pue.a;
                    nte.b(strQ6, null, ((e8b) l46Var30.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.a(l46Var30), l46Var30, 0, 0, 131066);
                }
                break;
            default:
                l46 l46Var31 = (l46) obj2;
                int iIntValue30 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var31.W(iIntValue30 & 1, (iIntValue30 & 17) != 16)) {
                    l46Var31.Z();
                } else {
                    s21.a(b.l(g09Var, 48.0f), l46Var31, 6);
                }
                break;
        }
        return wefVar2;
    }
}
