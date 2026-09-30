package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kd2 implements n26 {
    public final /* synthetic */ int a;

    public /* synthetic */ kd2(int i) {
        this.a = i;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        g09 g09Var = g09.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else {
                    nte.b(afc.q(R.string.chat_question_skip_change, l46Var), null, 0L, w6c.l(k8b.f((e8b) l46Var.k(l8b.a)) ? 13 : 15), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 0, 0, 262126);
                }
                break;
            case 1:
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                } else {
                    long j = ((e8b) l46Var2.k(l8b.a)).q;
                    String strQ = afc.q(R.string.chat_question_ask_again, l46Var2);
                    mue mueVar = pue.a;
                    nte.b(strQ, null, j, 0L, jgb.S(l46Var2), null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.a(l46Var2), l46Var2, 0, 0, 131002);
                }
                break;
            case 2:
                l46 l46Var3 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    l46Var3.Z();
                } else {
                    j09 j09VarL = b.l(g09Var, 32.0f);
                    fy9 fy9VarA = od4.A(R.drawable.ic_discord, 0, l46Var3);
                    pr4 pr4Var = o82.a;
                    gu6.b(fy9VarA, null, j09VarL, ((m82) l46Var3.k(pr4Var)).n, l46Var3, 440, 0);
                    o5c.f(l46Var3, b.p(g09Var, 12.0f));
                    nte.b(afc.q(R.string.contact_us_join_discord, l46Var3), null, ((m82) l46Var3.k(pr4Var)).n, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tm7.F(l46Var3), l46Var3, 0, 0, 131066);
                }
                break;
            case 3:
                l46 l46Var4 = (l46) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var4.W(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    l46Var4.Z();
                } else {
                    gu6.b(od4.A(R.drawable.ic_facebook, 0, l46Var4), null, b.l(g09Var, 32.0f), 0L, l46Var4, 440, 8);
                    o5c.f(l46Var4, b.p(g09Var, 12.0f));
                    nte.b(afc.q(R.string.contact_us_join_facebook, l46Var4), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tm7.F(l46Var4), l46Var4, 0, 0, 131070);
                }
                break;
            case 4:
                ln2 ln2Var = (ln2) obj;
                l46 l46Var5 = (l46) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= l46Var5.g(ln2Var) ? 4 : 2;
                }
                if (!l46Var5.W(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    l46Var5.Z();
                } else {
                    s21.a(tm7.o(b.d(b.c(ynb.b0(0.0f, nn2.g, g09Var, 1), 1.0f), nn2.f), ln2Var.c, g21.f), l46Var5, 0);
                }
                break;
            case 5:
                l46 l46Var6 = (l46) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (!l46Var6.W(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    l46Var6.Z();
                }
                break;
            case 6:
                l46 l46Var7 = (l46) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var7.W(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    l46Var7.Z();
                } else {
                    nte.b(afc.q(R.string.button_skip, l46Var7), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var7, 0, 0, 262142);
                }
                break;
            case 7:
                l46 l46Var8 = (l46) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var8.W(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    l46Var8.Z();
                } else {
                    nte.b(afc.q(R.string.button_retry, l46Var8), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var8, 0, 0, 262142);
                }
                break;
            case 8:
                l46 l46Var9 = (l46) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var9.W(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    l46Var9.Z();
                } else {
                    nte.b(afc.q(R.string.button_retry, l46Var9), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var9, 0, 0, 262142);
                }
                break;
            case 9:
                l46 l46Var10 = (l46) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var10.W(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    l46Var10.Z();
                }
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                l46 l46Var11 = (l46) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var11.W(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    l46Var11.Z();
                } else {
                    String strQ2 = afc.q(R.string.notification_permission_tp_later, l46Var11);
                    mue mueVar2 = pue.a;
                    nte.b(strQ2, null, ((e8b) l46Var11.k(l8b.a)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.b(l46Var11), l46Var11, 0, 0, 131066);
                }
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                l46 l46Var12 = (l46) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var12.W(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    l46Var12.Z();
                } else {
                    String strQ3 = afc.q(R.string.explore_browse_prev, l46Var12);
                    mue mueVar3 = pue.a;
                    nte.b(strQ3, null, ((e8b) l46Var12.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.b(l46Var12), l46Var12, 0, 0, 131066);
                }
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                l46 l46Var13 = (l46) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var13.W(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    l46Var13.Z();
                } else {
                    String strQ4 = afc.q(R.string.explore_browse_next, l46Var13);
                    mue mueVar4 = pue.a;
                    nte.b(strQ4, null, ((e8b) l46Var13.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.b(l46Var13), l46Var13, 0, 0, 131066);
                }
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                l46 l46Var14 = (l46) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((kpe) obj).getClass();
                if (!l46Var14.W(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    l46Var14.Z();
                } else {
                    nte.b("自定义端点", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var14, 6, 0, 262142);
                }
                break;
            case 14:
                l46 l46Var15 = (l46) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var15.W(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    l46Var15.Z();
                } else {
                    nte.b("应用", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var15, 6, 0, 262142);
                }
                break;
            case 15:
                l46 l46Var16 = (l46) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var16.W(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    l46Var16.Z();
                } else {
                    nte.b("清除", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var16, 6, 0, 262142);
                }
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                l46 l46Var17 = (l46) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var17.W(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    l46Var17.Z();
                } else {
                    nte.b("Open", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var17, 6, 0, 262142);
                }
                break;
            case 17:
                l46 l46Var18 = (l46) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var18.W(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    l46Var18.Z();
                } else {
                    nte.b("Open", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var18, 6, 0, 262142);
                }
                break;
            case 18:
                l46 l46Var19 = (l46) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var19.W(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    l46Var19.Z();
                } else {
                    nte.b("清除", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var19, 6, 0, 262142);
                }
                break;
            case 19:
                l46 l46Var20 = (l46) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var20.W(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    l46Var20.Z();
                } else {
                    long j2 = ((e8b) l46Var20.k(l8b.a)).q;
                    String strQ5 = afc.q(R.string.draw_need_swap_another_one, l46Var20);
                    mue mueVar5 = pue.a;
                    nte.b(strQ5, null, j2, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.a(l46Var20), l46Var20, 0, 0, 131066);
                }
                break;
            case 20:
                l46 l46Var21 = (l46) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var21.W(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    l46Var21.Z();
                } else {
                    nte.b("1. Save Image with EXIF Data", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var21, 6, 0, 262142);
                }
                break;
            case 21:
                l46 l46Var22 = (l46) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var22.W(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    l46Var22.Z();
                } else {
                    nte.b("2. Verify EXIF Data", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var22, 6, 0, 262142);
                }
                break;
            case 22:
                l46 l46Var23 = (l46) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var23.W(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    l46Var23.Z();
                } else {
                    g09 g09Var2 = g09.a;
                    j09 j09VarZ = ynb.Z(g09Var2, 16.0f);
                    c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var23, 0);
                    int iHashCode = Long.hashCode(l46Var23.T);
                    u8a u8aVarM = l46Var23.m();
                    j09 j09VarJ = m93.J(l46Var23, j09VarZ);
                    lf2.q.getClass();
                    l46Var23.j0();
                    if (l46Var23.S) {
                        l46Var23.l(LayoutNode.h1);
                    } else {
                        l46Var23.s0();
                    }
                    dec.l(hj6.z, l46Var23, c92VarA);
                    dec.l(hj6.y, l46Var23, u8aVarM);
                    dec.l(hj6.X, l46Var23, Integer.valueOf(iHashCode));
                    dec.k(l46Var23);
                    dec.l(hj6.x, l46Var23, j09VarJ);
                    pr4 pr4Var2 = r9f.a;
                    nte.b("Manual Verification:", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var23.k(pr4Var2)).h, l46Var23, 6, 0, 131070);
                    nte.b("1. Use ADB to pull the saved image:\n   adb pull /sdcard/Pictures/QuinTest/exif_test_*.jpg\n\n2. Verify EXIF with exiftool:\n   exiftool -AIGC -UserComment exif_test_*.jpg\n\n3. Expected output should contain JSON data with:\n   - conversationId\n   - userUid\n   - modelInfo\n   - deepseekFilingId", ynb.d0(0.0f, 8.0f, 0.0f, 0.0f, 13, g09Var2), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var23.k(pr4Var2)).l, l46Var23, 48, 0, 131068);
                    l46Var23.r(true);
                }
                break;
            case 23:
                l46 l46Var24 = (l46) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var24.W(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    l46Var24.Z();
                } else {
                    nte.b(afc.q(R.string.settings_contact_us, l46Var24), null, 0L, 0L, jgb.S(l46Var24), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var24, 0, 0, 262078);
                }
                break;
            case 24:
                l46 l46Var25 = (l46) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var25.W(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    l46Var25.Z();
                } else {
                    nte.b(afc.q(R.string.settings_contact_us, l46Var25), null, ((m82) l46Var25.k(o82.a)).o, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a((mue) l46Var25.k(nte.a), 0L, w6c.l(17), jgb.S(l46Var25), null, 0L, null, 3, w6c.l(24), null, null, 16613369), l46Var25, 0, 0, 131066);
                }
                break;
            case 25:
                l46 l46Var26 = (l46) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var26.W(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    l46Var26.Z();
                } else {
                    nte.b(afc.q(R.string.button_retry, l46Var26), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a((mue) l46Var26.k(nte.a), 0L, w6c.l(17), jgb.S(l46Var26), null, 0L, null, 3, w6c.l(24), null, null, 16613369), l46Var26, 0, 0, 131070);
                }
                break;
            case 26:
                l46 l46Var27 = (l46) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var27.W(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    l46Var27.Z();
                } else {
                    ap5.a(afc.q(R.string.button_retry, l46Var27), l46Var27, 0);
                }
                break;
            case 27:
                l46 l46Var28 = (l46) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var28.W(iIntValue28 & 1, (iIntValue28 & 17) != 16)) {
                    l46Var28.Z();
                } else {
                    ap5.a(afc.q(R.string.button_retry, l46Var28), l46Var28, 0);
                }
                break;
            case 28:
                l46 l46Var29 = (l46) obj2;
                int iIntValue29 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var29.W(iIntValue29 & 1, (iIntValue29 & 17) != 16)) {
                    l46Var29.Z();
                } else {
                    ap5.a(afc.q(R.string.additional_info_skip, l46Var29), l46Var29, 0);
                }
                break;
            default:
                l46 l46Var30 = (l46) obj2;
                int iIntValue30 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (!l46Var30.W(iIntValue30 & 1, (iIntValue30 & 17) != 16)) {
                    l46Var30.Z();
                }
                break;
        }
        return wefVar;
    }
}
