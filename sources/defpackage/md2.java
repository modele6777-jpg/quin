package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class md2 implements l26 {
    public final /* synthetic */ int a;

    public /* synthetic */ md2(int i) {
        this.a = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        ov7 ov7Var = LayoutNode.h1;
        g09 g09Var = g09.a;
        i8c i8cVar = sf2.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    j74.Z(0, l46Var);
                    j74.S(null, l46Var, 0);
                    j74.f(null, l46Var, 0);
                }
                break;
            case 1:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    j74.U(null, l46Var2, 0);
                }
                break;
            case 2:
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    l46Var3.Z();
                } else {
                    j74.g(0, l46Var3);
                }
                break;
            case 3:
                l46 l46Var4 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!l46Var4.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    l46Var4.Z();
                } else {
                    Object objR = l46Var4.R();
                    if (objR == i8cVar) {
                        objR = new r02(19);
                        l46Var4.p0(objR);
                    }
                    j74.n("开启", (x16) objR, l46Var4, 54);
                    Object objR2 = l46Var4.R();
                    if (objR2 == i8cVar) {
                        objR2 = new r02(20);
                        l46Var4.p0(objR2);
                    }
                    j74.n("清除", (x16) objR2, l46Var4, 54);
                }
                break;
            case 4:
                l46 l46Var5 = (l46) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!l46Var5.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    l46Var5.Z();
                } else {
                    nte.b("http://192.168.1.100:8080", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var5, 6, 0, 262142);
                }
                break;
            case 5:
                l46 l46Var6 = (l46) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!l46Var6.W(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    l46Var6.Z();
                } else {
                    Object objR3 = l46Var6.R();
                    if (objR3 == i8cVar) {
                        objR3 = new r02(21);
                        l46Var6.p0(objR3);
                    }
                    j74.n("清除", (x16) objR3, l46Var6, 54);
                }
                break;
            case 6:
                l46 l46Var7 = (l46) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!l46Var7.W(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    l46Var7.Z();
                } else {
                    Object objR4 = l46Var7.R();
                    if (objR4 == i8cVar) {
                        objR4 = new r02(25);
                        l46Var7.p0(objR4);
                    }
                    j74.n("设为老用户", (x16) objR4, l46Var7, 54);
                    Object objR5 = l46Var7.R();
                    if (objR5 == i8cVar) {
                        objR5 = new r02(26);
                        l46Var7.p0(objR5);
                    }
                    j74.n("设为新用户", (x16) objR5, l46Var7, 54);
                    Object objR6 = l46Var7.R();
                    if (objR6 == i8cVar) {
                        objR6 = new r02(27);
                        l46Var7.p0(objR6);
                    }
                    j74.n("Reset detect", (x16) objR6, l46Var7, 54);
                }
                break;
            case 7:
                l46 l46Var8 = (l46) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!l46Var8.W(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    l46Var8.Z();
                } else {
                    Object objR7 = l46Var8.R();
                    if (objR7 == i8cVar) {
                        objR7 = new r02(24);
                        l46Var8.p0(objR7);
                    }
                    j74.n("Reset", (x16) objR7, l46Var8, 54);
                }
                break;
            case 8:
                l46 l46Var9 = (l46) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!l46Var9.W(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    l46Var9.Z();
                } else {
                    Object objR8 = l46Var9.R();
                    if (objR8 == i8cVar) {
                        objR8 = new r02(23);
                        l46Var9.p0(objR8);
                    }
                    j74.n("Reset", (x16) objR8, l46Var9, 54);
                }
                break;
            case 9:
                l46 l46Var10 = (l46) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (!l46Var10.W(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    l46Var10.Z();
                } else {
                    Object objR9 = l46Var10.R();
                    if (objR9 == i8cVar) {
                        objR9 = new r02(22);
                        l46Var10.p0(objR9);
                    }
                    j74.n("打开（仅预览）", (x16) objR9, l46Var10, 54);
                }
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                l46 l46Var11 = (l46) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (!l46Var11.W(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    l46Var11.Z();
                } else {
                    nte.b("Enter your test url", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var11, 6, 0, 262142);
                }
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                l46 l46Var12 = (l46) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (!l46Var12.W(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    l46Var12.Z();
                } else {
                    gu6.a(t72.C(), null, null, 0L, l46Var12, 48, 12);
                }
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                l46 l46Var13 = (l46) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (!l46Var13.W(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    l46Var13.Z();
                } else {
                    gu6.a(t72.C(), null, null, 0L, l46Var13, 48, 12);
                }
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                l46 l46Var14 = (l46) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (!l46Var14.W(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    l46Var14.Z();
                } else {
                    jgb.q(0, 1, l46Var14, null, afc.q(R.string.here_is_your_deck, l46Var14));
                }
                break;
            case 14:
                l46 l46Var15 = (l46) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (!l46Var15.W(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    l46Var15.Z();
                } else {
                    gu6.b(od4.A(R.drawable.ic_close, 0, l46Var15), "", null, 0L, l46Var15, 56, 12);
                }
                break;
            case 15:
                l46 l46Var16 = (l46) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (!l46Var16.W(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    l46Var16.Z();
                } else {
                    jgb.q(0, 1, l46Var16, null, afc.q(R.string.drawn_cards_share_title, l46Var16));
                }
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                l46 l46Var17 = (l46) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (!l46Var17.W(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    l46Var17.Z();
                } else {
                    nte.b(afc.q(R.string.settings_faq, l46Var17), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var17, 0, 0, 262142);
                }
                break;
            case 17:
                l46 l46Var18 = (l46) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (!l46Var18.W(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    l46Var18.Z();
                } else {
                    jgb.B(null, l46Var18, 0);
                }
                break;
            case 18:
                l46 l46Var19 = (l46) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (!l46Var19.W(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    l46Var19.Z();
                } else {
                    gx6 gx6VarB = afc.a;
                    if (gx6VarB == null) {
                        fx6 fx6Var = new fx6("Filled.Schedule", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = msf.a;
                        long j = y72.b;
                        dtd dtdVar = new dtd(j);
                        s71 s71Var = new s71(1);
                        s71Var.p(11.99f, 2.0f);
                        s71Var.i(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                        s71Var.r(4.47f, 10.0f, 9.99f, 10.0f);
                        s71Var.i(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
                        s71Var.q(17.52f, 2.0f, 11.99f, 2.0f);
                        s71Var.h();
                        s71Var.p(12.0f, 20.0f);
                        s71Var.j(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
                        s71Var.r(3.58f, -8.0f, 8.0f, -8.0f);
                        s71Var.r(8.0f, 3.58f, 8.0f, 8.0f);
                        s71Var.r(-3.58f, 8.0f, -8.0f, 8.0f);
                        s71Var.h();
                        fx6.a(fx6Var, s71Var.b, dtdVar, 1.0f, 1.0f, 2, 1.0f);
                        dtd dtdVar2 = new dtd(j);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new p1a(12.5f, 7.0f));
                        arrayList.add(new n1a(11.0f));
                        arrayList.add(new b2a(6.0f));
                        arrayList.add(new w1a(5.25f, 3.15f));
                        arrayList.add(new w1a(0.75f, -1.23f));
                        arrayList.add(new w1a(-4.5f, -2.67f));
                        arrayList.add(l1a.c);
                        fx6.a(fx6Var, arrayList, dtdVar2, 1.0f, 1.0f, 2, 1.0f);
                        gx6VarB = fx6Var.b();
                        afc.a = gx6VarB;
                    }
                    gu6.a(gx6VarB, afc.q(R.string.seasonal_history_open, l46Var19), null, ((e8b) l46Var19.k(l8b.a)).q, l46Var19, 0, 4);
                }
                break;
            case 19:
                l46 l46Var20 = (l46) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (!l46Var20.W(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    l46Var20.Z();
                } else {
                    gu6.b(od4.A(R.drawable.ic_share, 0, l46Var20), afc.q(R.string.four_seasons_intro_topbar_share, l46Var20), null, ((e8b) l46Var20.k(l8b.a)).q, l46Var20, 8, 4);
                }
                break;
            case 20:
                l46 l46Var21 = (l46) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (!l46Var21.W(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    l46Var21.Z();
                } else {
                    nte.b(afc.q(R.string.friend_coupon_title, l46Var21), null, 0L, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, l46Var21, 0, 24960, 241662);
                }
                break;
            case 21:
                l46 l46Var22 = (l46) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (!l46Var22.W(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    l46Var22.Z();
                } else {
                    gu6.a(t72.C(), null, b.l(g09Var, 20.0f), 0L, l46Var22, 432, 8);
                }
                break;
            case 22:
                l46 l46Var23 = (l46) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                if (!l46Var23.W(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    l46Var23.Z();
                } else {
                    String strQ = afc.q(R.string.friend_coupon_how_title, l46Var23);
                    mue mueVar = pue.a;
                    mue mueVarF = pue.f(l46Var23);
                    pr4 pr4Var = l8b.a;
                    nte.b(strQ, null, ((e8b) l46Var23.k(pr4Var)).t, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarF, l46Var23, 0, 0, 131066);
                    c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var23, 0);
                    int iHashCode = Long.hashCode(l46Var23.T);
                    u8a u8aVarM = l46Var23.m();
                    j09 j09VarJ = m93.J(l46Var23, g09Var);
                    lf2.q.getClass();
                    l46Var23.j0();
                    if (l46Var23.S) {
                        l46Var23.l(ov7Var);
                    } else {
                        l46Var23.s0();
                    }
                    dec.l(hj6.z, l46Var23, c92VarA);
                    dec.l(hj6.y, l46Var23, u8aVarM);
                    dec.l(hj6.X, l46Var23, Integer.valueOf(iHashCode));
                    dec.k(l46Var23);
                    dec.l(hj6.x, l46Var23, j09VarJ);
                    eb3.n(afc.q(R.string.friend_coupon_how_monthly, l46Var23), afc.q(R.string.friend_coupon_how_monthly_detail, l46Var23), l46Var23, 0);
                    oa7.d(null, 0.5f, ((e8b) l46Var23.k(pr4Var)).A, l46Var23, 48, 1);
                    eb3.n(afc.q(R.string.friend_coupon_how_annual, l46Var23), afc.q(R.string.friend_coupon_how_annual_detail, l46Var23), l46Var23, 0);
                    l46Var23.r(true);
                }
                break;
            case 23:
                l46 l46Var24 = (l46) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                if (!l46Var24.W(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    l46Var24.Z();
                } else {
                    feg.j(od4.A(R.drawable.bg_widget_onboarding_popup, 0, l46Var24), null, b.c, ndb.c, an2.a, 0.0f, null, l46Var24, 28088, 96);
                }
                break;
            case 24:
                l46 l46Var25 = (l46) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                if (!l46Var25.W(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    l46Var25.Z();
                } else {
                    j09 j09VarO = tm7.o(b.l(g09Var, 20.0f), abg.c(527857280), a7c.a);
                    xn8 xn8VarC = s21.c(ndb.f, false);
                    int iHashCode2 = Long.hashCode(l46Var25.T);
                    u8a u8aVarM2 = l46Var25.m();
                    j09 j09VarJ2 = m93.J(l46Var25, j09VarO);
                    lf2.q.getClass();
                    l46Var25.j0();
                    if (l46Var25.S) {
                        l46Var25.l(ov7Var);
                    } else {
                        l46Var25.s0();
                    }
                    dec.l(hj6.z, l46Var25, xn8VarC);
                    dec.l(hj6.y, l46Var25, u8aVarM2);
                    dec.l(hj6.X, l46Var25, Integer.valueOf(iHashCode2));
                    dec.k(l46Var25);
                    dec.l(hj6.x, l46Var25, j09VarJ2);
                    gu6.a(ok8.v(), afc.q(R.string.gift_card_close, l46Var25), b.l(g09Var, 16.0f), 0L, l46Var25, 384, 8);
                    l46Var25.r(true);
                }
                break;
            case 25:
                l46 l46Var26 = (l46) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                if (!l46Var26.W(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    l46Var26.Z();
                } else {
                    nte.b(afc.q(R.string.gift_card_title, l46Var26), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var26, 0, 0, 262142);
                }
                break;
            case 26:
                l46 l46Var27 = (l46) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                if (!l46Var27.W(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    l46Var27.Z();
                } else {
                    gu6.b(od4.A(R.drawable.settings_gift_card, 0, l46Var27), afc.q(R.string.gift_card_my_cards, l46Var27), b.l(g09Var, 24.0f), ((e8b) l46Var27.k(l8b.a)).q, l46Var27, 392, 0);
                }
                break;
            case 27:
                l46 l46Var28 = (l46) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                if (!l46Var28.W(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    l46Var28.Z();
                } else {
                    String strQ2 = afc.q(R.string.gift_card_generation_failed_message, l46Var28);
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    long j2 = ((e8b) l46Var28.k(l8b.a)).r;
                    mue mueVar2 = oue.a;
                    nte.b(strQ2, j09VarC, j2, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var28), l46Var28, 48, 0, 130040);
                }
                break;
            case 28:
                l46 l46Var29 = (l46) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                if (!l46Var29.W(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    l46Var29.Z();
                } else {
                    nte.b(afc.q(R.string.gift_card_my_cards, l46Var29), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var29, 0, 0, 262142);
                }
                break;
            default:
                l46 l46Var30 = (l46) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                if (!l46Var30.W(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    l46Var30.Z();
                } else {
                    nte.b(afc.q(R.string.all_history_title, l46Var30), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var30, 0, 0, 262142);
                }
                break;
        }
        return wefVar;
    }
}
