package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class de2 implements l26 {
    public final /* synthetic */ int a;

    public /* synthetic */ de2(int i) {
        this.a = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        ov7 ov7Var = LayoutNode.h1;
        g09 g09Var = g09.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    gu6.b(od4.A(R.drawable.ic_share, 0, l46Var), null, null, 0L, l46Var, 56, 12);
                }
                break;
            case 1:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    gu6.b(od4.A(R.drawable.ic_share, 0, l46Var2), afc.q(R.string.share_button, l46Var2), null, 0L, l46Var2, 8, 12);
                }
                break;
            case 2:
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    l46Var3.Z();
                }
                break;
            case 3:
                l46 l46Var4 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!l46Var4.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    l46Var4.Z();
                } else {
                    gu6.b(od4.A(R.drawable.ic_remove_circle_red, 0, l46Var4), null, b.l(g09Var, 28.0f), y72.k, l46Var4, 3512, 0);
                }
                break;
            case 4:
                l46 l46Var5 = (l46) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!l46Var5.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    l46Var5.Z();
                } else {
                    lmg.I(null, 5, 5, 0.0f, 0.0f, 0L, l46Var5, 432, 57);
                }
                break;
            case 5:
                l46 l46Var6 = (l46) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!l46Var6.W(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    l46Var6.Z();
                } else {
                    c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Z, l46Var6, 54);
                    int iHashCode = Long.hashCode(l46Var6.T);
                    u8a u8aVarM = l46Var6.m();
                    j09 j09VarJ = m93.J(l46Var6, g09Var);
                    lf2.q.getClass();
                    l46Var6.j0();
                    if (l46Var6.S) {
                        l46Var6.l(ov7Var);
                    } else {
                        l46Var6.s0();
                    }
                    dec.l(hj6.z, l46Var6, c92VarA);
                    dec.l(hj6.y, l46Var6, u8aVarM);
                    dec.l(hj6.X, l46Var6, Integer.valueOf(iHashCode));
                    dec.k(l46Var6);
                    dec.l(hj6.x, l46Var6, j09VarJ);
                    String strQ = afc.q(R.string.personality_interrupt_tips, l46Var6);
                    mue mueVar = oue.a;
                    mue mueVarC = pue.c(l46Var6);
                    pr4 pr4Var = o82.a;
                    nte.b(strQ, null, ((m82) l46Var6.k(pr4Var)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarC, l46Var6, 0, 0, 131066);
                    String strQ2 = afc.q(R.string.personality_interrupt_flow_tips, l46Var6);
                    mue mueVar2 = pue.a;
                    nte.b(strQ2, null, y72.b(((m82) l46Var6.k(pr4Var)).q, 0.48f), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.j(l46Var6), l46Var6, 0, 0, 131066);
                    feg.j(od4.A(R.drawable.ic_interrupt_tips, 0, l46Var6), null, b.c(g09Var, 1.0f), null, an2.d, 0.0f, null, l46Var6, 25016, 104);
                    l46Var6.r(true);
                }
                break;
            case 6:
                l46 l46Var7 = (l46) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!l46Var7.W(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    l46Var7.Z();
                } else {
                    xo1.f(0.0f, 0.0f, 3, 3, 54, 0L, 0L, l46Var7, null);
                }
                break;
            case 7:
                l46 l46Var8 = (l46) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!l46Var8.W(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    l46Var8.Z();
                } else {
                    nte.b(afc.q(R.string.quick_decision_title, l46Var8), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var8, 0, 0, 262142);
                }
                break;
            case 8:
                l46 l46Var9 = (l46) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!l46Var9.W(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    l46Var9.Z();
                } else {
                    axa.a(2.0f, 0.0f, 0, 390, 58, 0L, 0L, l46Var9, b.l(g09Var, 18.0f));
                }
                break;
            case 9:
                l46 l46Var10 = (l46) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (!l46Var10.W(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    l46Var10.Z();
                } else {
                    gu6.b(od4.A(R.drawable.snackbar_close, 0, l46Var10), null, null, y72.b(((m82) l46Var10.k(o82.a)).q, 0.68f), l46Var10, 56, 4);
                }
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                l46 l46Var11 = (l46) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (!l46Var11.W(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    l46Var11.Z();
                } else {
                    nte.b(afc.q(R.string.rating_description, l46Var11), null, 0L, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, null, l46Var11, 0, 0, 261118);
                }
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                l46 l46Var12 = (l46) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (!l46Var12.W(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    l46Var12.Z();
                } else {
                    nte.b(afc.q(R.string.reading_feedback_submit, l46Var12), null, 0L, 0L, jgb.S(l46Var12), null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, null, l46Var12, 0, 0, 261054);
                }
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                l46 l46Var13 = (l46) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (!l46Var13.W(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    l46Var13.Z();
                } else {
                    nte.b(afc.q(R.string.review_reward_prompt_message, l46Var13), null, 0L, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, null, l46Var13, 0, 0, 261118);
                }
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                l46 l46Var14 = (l46) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (!l46Var14.W(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    l46Var14.Z();
                } else {
                    jgb.B(null, l46Var14, 0);
                }
                break;
            case 14:
                l46 l46Var15 = (l46) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (!l46Var15.W(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    l46Var15.Z();
                } else {
                    gu6.a(t72.C(), null, null, 0L, l46Var15, 48, 12);
                }
                break;
            case 15:
                l46 l46Var16 = (l46) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (!l46Var16.W(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    l46Var16.Z();
                } else {
                    y11.a.a(null, 0.0f, 0.0f, null, 0L, l46Var16, 196608);
                }
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                l46 l46Var17 = (l46) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (!l46Var17.W(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    l46Var17.Z();
                } else {
                    c92 c92VarA2 = a92.a(xc0.c, ndb.Z, l46Var17, 48);
                    int iHashCode2 = Long.hashCode(l46Var17.T);
                    u8a u8aVarM2 = l46Var17.m();
                    j09 j09VarJ2 = m93.J(l46Var17, g09Var);
                    lf2.q.getClass();
                    l46Var17.j0();
                    if (l46Var17.S) {
                        l46Var17.l(ov7Var);
                    } else {
                        l46Var17.s0();
                    }
                    dec.l(hj6.z, l46Var17, c92VarA2);
                    dec.l(hj6.y, l46Var17, u8aVarM2);
                    dec.l(hj6.X, l46Var17, Integer.valueOf(iHashCode2));
                    dec.k(l46Var17);
                    dec.l(hj6.x, l46Var17, j09VarJ2);
                    mue mueVar3 = pue.a;
                    nte.b("圣杯", null, bx5.d(l46Var17), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.e(l46Var17), l46Var17, 6, 0, 131066);
                    o5c.f(l46Var17, b.d(g09Var, 4.0f));
                    mue mueVarN = pue.n(l46Var17);
                    pr4 pr4Var2 = l8b.a;
                    nte.b("从圣杯牌组抽牌（水元素）", null, ((e8b) l46Var17.k(pr4Var2)).q, 0L, null, cr5.c, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarN, l46Var17, 6, 0, 130938);
                    o5c.f(l46Var17, b.d(g09Var, 8.0f));
                    nte.b("圣杯牌代表情感状态", null, ((e8b) l46Var17.k(pr4Var2)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.e(l46Var17), l46Var17, 6, 0, 131066);
                    l46Var17.r(true);
                }
                break;
            case 17:
                l46 l46Var18 = (l46) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (!l46Var18.W(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    l46Var18.Z();
                } else {
                    gu6.a(t72.C(), null, null, 0L, l46Var18, 48, 12);
                }
                break;
            case 18:
                l46 l46Var19 = (l46) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (!l46Var19.W(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    l46Var19.Z();
                } else {
                    nte.b(afc.q(R.string.settings_account, l46Var19), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var19, 0, 0, 262142);
                }
                break;
            case 19:
                l46 l46Var20 = (l46) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (!l46Var20.W(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    l46Var20.Z();
                } else {
                    String strQ3 = afc.q(R.string.my_tarot_entry_title, l46Var20);
                    mue mueVar4 = pue.a;
                    nte.b(strQ3, null, ((e8b) l46Var20.k(l8b.a)).q, 0L, null, ((y8b) l46Var20.k(x8b.a)).a, 0L, null, null, 0L, 0, false, 0, 0, null, pue.p(l46Var20), l46Var20, 0, 0, 130938);
                }
                break;
            case 20:
                l46 l46Var21 = (l46) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (!l46Var21.W(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    l46Var21.Z();
                }
                break;
            case 21:
                l46 l46Var22 = (l46) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (!l46Var22.W(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    l46Var22.Z();
                }
                break;
            case 22:
                l46 l46Var23 = (l46) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                if (!l46Var23.W(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    l46Var23.Z();
                }
                break;
            case 23:
                l46 l46Var24 = (l46) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                if (!l46Var24.W(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    l46Var24.Z();
                }
                break;
            case 24:
                l46 l46Var25 = (l46) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                if (!l46Var25.W(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    l46Var25.Z();
                } else {
                    gu6.a(z7f.F(), null, b.l(g09Var, 20.0f), ((e8b) l46Var25.k(l8b.a)).s, l46Var25, 432, 0);
                }
                break;
            case 25:
                l46 l46Var26 = (l46) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                if (!l46Var26.W(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    l46Var26.Z();
                }
                break;
            case 26:
                l46 l46Var27 = (l46) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                if (!l46Var27.W(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    l46Var27.Z();
                } else {
                    String strQ4 = afc.q(R.string.skin_paywall_tab1, l46Var27);
                    mue mueVar5 = pue.a;
                    nte.b(strQ4, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.b(l46Var27), l46Var27, 0, 0, 131070);
                }
                break;
            case 27:
                l46 l46Var28 = (l46) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                if (!l46Var28.W(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    l46Var28.Z();
                } else {
                    nte.b(afc.q(R.string.spread_select_title, l46Var28), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var28, 0, 0, 262142);
                }
                break;
            case 28:
                l46 l46Var29 = (l46) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                if (!l46Var29.W(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    l46Var29.Z();
                } else {
                    v70.a(qk2.z, null, null, null, 0.0f, null, fdc.v(y72.j, 0L, 0L, 0L, l46Var29, 62), l46Var29, 6, 190);
                }
                break;
            default:
                l46 l46Var30 = (l46) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                if (!l46Var30.W(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    l46Var30.Z();
                } else {
                    xo1.f(0.0f, 0.0f, 2, 3, 54, 0L, 0L, l46Var30, null);
                }
                break;
        }
        return wefVar;
    }
}
