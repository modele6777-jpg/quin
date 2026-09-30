package defpackage;

import ai.askquin.R;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import tech.chatmind.api.giftcard.GiftCardSku;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ed2 implements o26 {
    public final /* synthetic */ int a;

    public /* synthetic */ ed2(int i) {
        this.a = i;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.a;
        i8c i8cVar = sp1.a;
        ov7 ov7Var = LayoutNode.h1;
        int i6 = 3;
        g09 g09Var = g09.a;
        wef wefVar = wef.a;
        switch (i5) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                l46 l46Var = (l46) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((rx9) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= l46Var.e(iIntValue) ? 32 : 16;
                }
                if (!l46Var.W(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    l46Var.Z();
                } else if (iIntValue == 0) {
                    l46Var.f0(2126550590);
                    kn2.l(0, l46Var);
                    l46Var.r(false);
                } else if (iIntValue == 1) {
                    l46Var.f0(2126551550);
                    kn2.m(0, l46Var);
                    l46Var.r(false);
                } else if (iIntValue != 2) {
                    l46Var.f0(1498641746);
                    l46Var.r(false);
                } else {
                    l46Var.f0(2126552510);
                    kn2.n(0, l46Var);
                    l46Var.r(false);
                }
                return wefVar;
            case 1:
                int iIntValue3 = ((Integer) obj).intValue();
                ((Boolean) obj2).getClass();
                l46 l46Var2 = (l46) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= l46Var2.e(iIntValue3) ? 4 : 2;
                }
                if (l46Var2.W(iIntValue4 & 1, (iIntValue4 & 131) != 130)) {
                    xn8 xn8VarC = s21.c(ndb.f, false);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, g09Var);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(hj6.z, l46Var2, xn8VarC);
                    dec.l(hj6.y, l46Var2, u8aVarM);
                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                    dec.k(l46Var2);
                    dec.l(hj6.x, l46Var2, j09VarJ);
                    dt1.a(oa7.E(g09Var, a7c.b(eze.a(l46Var2).a.f)), null, false, null, eze.a(l46Var2).a.f, null, null, null, l46Var2, 0, 238);
                    nte.b(String.valueOf(iIntValue3 + 1), null, y72.e, w6c.l(20), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var2.k(r9f.a)).g, l46Var2, 24960, 0, 131050);
                    l46Var2.r(true);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 2:
                String str = (String) obj2;
                l46 l46Var3 = (l46) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                ((ly) obj).getClass();
                str.getClass();
                if ((iIntValue5 & 48) == 0) {
                    iIntValue5 |= l46Var3.g(str) ? 32 : 16;
                }
                if (l46Var3.W(iIntValue5 & 1, (iIntValue5 & 145) != 144)) {
                    mue mueVar = pue.a;
                    nte.b(str, ynb.b0(24.0f, 0.0f, b.c(g09Var, 1.0f), 2), ((e8b) l46Var3.k(l8b.a)).q, 0L, null, cr5.b(), 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.p(l46Var3), l46Var3, ((iIntValue5 >> 3) & 14) | 48, 0, 129912);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case 3:
                int iIntValue6 = ((Integer) obj2).intValue();
                l46 l46Var4 = (l46) obj3;
                int iIntValue7 = ((Integer) obj4).intValue();
                ((rx9) obj).getClass();
                if ((iIntValue7 & 48) == 0) {
                    iIntValue7 |= l46Var4.e(iIntValue6) ? 32 : 16;
                }
                if (!l46Var4.W(iIntValue7 & 1, (iIntValue7 & 145) != 144)) {
                    l46Var4.Z();
                } else if (iIntValue6 == 0) {
                    l46Var4.f0(1688429772);
                    vd0.E(0, l46Var4);
                    l46Var4.r(false);
                } else if (iIntValue6 != 1) {
                    l46Var4.f0(801767617);
                    l46Var4.r(false);
                } else {
                    l46Var4.f0(1688430701);
                    vd0.F(0, l46Var4);
                    l46Var4.r(false);
                }
                return wefVar;
            case 4:
                GiftCardSku giftCardSku = (GiftCardSku) obj2;
                l46 l46Var5 = (l46) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                ((ly) obj).getClass();
                giftCardSku.getClass();
                if ((iIntValue8 & 48) == 0) {
                    iIntValue8 |= l46Var5.e(giftCardSku.ordinal()) ? 32 : 16;
                }
                if (l46Var5.W(iIntValue8 & 1, (iIntValue8 & 145) != 144)) {
                    gb6 gb6VarG = x76.g(giftCardSku);
                    FillElement fillElement = b.c;
                    j09 j09VarA = androidx.compose.ui.platform.b.a(fillElement, "gift_card_preview_artwork:" + giftCardSku.name());
                    xn8 xn8VarC2 = s21.c(ndb.b, false);
                    int iHashCode2 = Long.hashCode(l46Var5.T);
                    u8a u8aVarM2 = l46Var5.m();
                    j09 j09VarJ2 = m93.J(l46Var5, j09VarA);
                    lf2.q.getClass();
                    l46Var5.j0();
                    if (l46Var5.S) {
                        l46Var5.l(ov7Var);
                    } else {
                        l46Var5.s0();
                    }
                    dec.l(hj6.z, l46Var5, xn8VarC2);
                    dec.l(hj6.y, l46Var5, u8aVarM2);
                    dec.l(hj6.X, l46Var5, Integer.valueOf(iHashCode2));
                    dec.k(l46Var5);
                    dec.l(hj6.x, l46Var5, j09VarJ2);
                    fy9 fy9VarA = od4.A(gb6VarG.a, 0, l46Var5);
                    m8c m8cVar = an2.a;
                    feg.j(fy9VarA, null, fillElement, null, m8cVar, 0.0f, null, l46Var5, 25016, 104);
                    feg.j(od4.A(gb6VarG.b, 0, l46Var5), null, fillElement, null, m8cVar, 0.0f, null, l46Var5, 25016, 104);
                    l46Var5.r(true);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
            case 5:
                GiftCardSku giftCardSku2 = (GiftCardSku) obj2;
                l46 l46Var6 = (l46) obj3;
                int iIntValue9 = ((Integer) obj4).intValue();
                ((ly) obj).getClass();
                giftCardSku2.getClass();
                if ((iIntValue9 & 48) == 0) {
                    iIntValue9 |= l46Var6.e(giftCardSku2.ordinal()) ? 32 : 16;
                }
                if (l46Var6.W(iIntValue9 & 1, (iIntValue9 & 145) != 144)) {
                    if (giftCardSku2 == GiftCardSku.OneYear) {
                        i = -2110845572;
                        i2 = R.string.gift_card_year_preview;
                    } else {
                        i = -2110763205;
                        i2 = R.string.gift_card_month_preview;
                    }
                    String strI = tec.i(l46Var6, i, i2, l46Var6, false);
                    mue mueVar2 = pue.a;
                    nte.b(strI, null, y72.e, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.m(l46Var6), 0L, 0L, null, cr5.c, 0L, null, 0, 0L, null, null, 16777183), l46Var6, 384, 0, 131066);
                } else {
                    l46Var6.Z();
                }
                return wefVar;
            case 6:
                String str2 = (String) obj2;
                l46 l46Var7 = (l46) obj3;
                int iIntValue10 = ((Integer) obj4).intValue();
                ((ly) obj).getClass();
                str2.getClass();
                if ((iIntValue10 & 48) == 0) {
                    iIntValue10 |= l46Var7.g(str2) ? 32 : 16;
                }
                if (l46Var7.W(iIntValue10 & 1, (iIntValue10 & 145) != 144)) {
                    j09 j09VarA2 = androidx.compose.ui.platform.b.a(g09Var, "gift_card_preview_blessing");
                    mue mueVar3 = pue.a;
                    nte.b(str2, j09VarA2, y72.e, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.q(l46Var7), 0L, 0L, null, cr5.c, 0L, null, 0, 0L, null, null, 16777183), l46Var7, ((iIntValue10 >> 3) & 14) | 432, 0, 131064);
                } else {
                    l46Var7.Z();
                }
                return wefVar;
            case 7:
                String str3 = (String) obj2;
                l46 l46Var8 = (l46) obj3;
                int iIntValue11 = ((Integer) obj4).intValue();
                ((ly) obj).getClass();
                if ((iIntValue11 & 48) == 0) {
                    iIntValue11 |= l46Var8.g(str3) ? 32 : 16;
                }
                if (!l46Var8.W(iIntValue11 & 1, (iIntValue11 & 145) != 144)) {
                    l46Var8.Z();
                } else if (str3 != null) {
                    l46Var8.f0(-1066318806);
                    nte.b(str3, null, ((e8b) l46Var8.k(l8b.a)).s, w6c.l(12), null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, null, l46Var8, ((iIntValue11 >> 3) & 14) | 24576, 0, 261098);
                    l46Var8.r(false);
                } else {
                    l46Var8.f0(-1066141610);
                    l46Var8.r(false);
                }
                return wefVar;
            case 8:
                ((Integer) obj4).intValue();
                ((ly) obj).getClass();
                ((da9) obj2).getClass();
                qk2.j(0, (l46) obj3);
                return wefVar;
            case 9:
                mue mueVar4 = (mue) obj;
                l26 l26Var = (l26) obj2;
                l46 l46Var9 = (l46) obj3;
                int iIntValue12 = ((Integer) obj4).intValue();
                mueVar4.getClass();
                l26Var.getClass();
                if ((iIntValue12 & 6) == 0) {
                    i3 = (l46Var9.g(mueVar4) ? 4 : 2) | iIntValue12;
                } else {
                    i3 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i3 |= l46Var9.i(l26Var) ? 32 : 16;
                }
                if (l46Var9.W(i3 & 1, (i3 & 147) != 146)) {
                    nte.a(mueVar4, l26Var, l46Var9, i3 & 126);
                } else {
                    l46Var9.Z();
                }
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                mue mueVar5 = (mue) obj;
                l26 l26Var2 = (l26) obj2;
                l46 l46Var10 = (l46) obj3;
                int iIntValue13 = ((Integer) obj4).intValue();
                mueVar5.getClass();
                l26Var2.getClass();
                if ((iIntValue13 & 6) == 0) {
                    i4 = (l46Var10.g(mueVar5) ? 4 : 2) | iIntValue13;
                } else {
                    i4 = iIntValue13;
                }
                if ((iIntValue13 & 48) == 0) {
                    i4 |= l46Var10.i(l26Var2) ? 32 : 16;
                }
                if (l46Var10.W(i4 & 1, (i4 & 147) != 146)) {
                    mh3.a(b4c.a.a(mueVar5), af1.b0(2071797151, new sb0(i6, l26Var2), l46Var10), l46Var10, 56);
                } else {
                    l46Var10.Z();
                }
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                l46 l46Var11 = (l46) obj3;
                int iIntValue14 = ((Integer) obj4).intValue();
                ((ly) obj).getClass();
                if ((iIntValue14 & 48) == 0) {
                    iIntValue14 |= l46Var11.h(zBooleanValue) ? 32 : 16;
                }
                if (l46Var11.W(iIntValue14 & 1, (iIntValue14 & 145) != 144)) {
                    nte.b(afc.q(zBooleanValue ? R.string.seasonal_reading_view_summary : R.string.seasonal_reading_next, l46Var11), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, l46Var11, 0, 24576, 245758);
                } else {
                    l46Var11.Z();
                }
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                l46 l46Var12 = (l46) obj3;
                int iIntValue15 = ((Integer) obj4).intValue();
                ((ly) obj).getClass();
                if ((iIntValue15 & 48) == 0) {
                    iIntValue15 |= l46Var12.h(zBooleanValue2) ? 32 : 16;
                }
                if (l46Var12.W(iIntValue15 & 1, (iIntValue15 & 145) != 144)) {
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    c92 c92VarA = a92.a(new uc0(16.0f, true, new qc0(0)), ndb.Z, l46Var12, 54);
                    int iHashCode3 = Long.hashCode(l46Var12.T);
                    u8a u8aVarM3 = l46Var12.m();
                    j09 j09VarJ3 = m93.J(l46Var12, j09VarC);
                    lf2.q.getClass();
                    l46Var12.j0();
                    if (l46Var12.S) {
                        l46Var12.l(ov7Var);
                    } else {
                        l46Var12.s0();
                    }
                    dec.l(hj6.z, l46Var12, c92VarA);
                    dec.l(hj6.y, l46Var12, u8aVarM3);
                    dec.l(hj6.X, l46Var12, Integer.valueOf(iHashCode3));
                    dec.k(l46Var12);
                    dec.l(hj6.x, l46Var12, j09VarJ3);
                    int i7 = zBooleanValue2 ? R.string.draw_cut_title : R.string.draw_card_shuffle_title;
                    int i8 = zBooleanValue2 ? R.string.draw_cut_tips : R.string.draw_shuffle_tips;
                    jgb.q(0, 1, l46Var12, null, afc.q(i7, l46Var12));
                    jgb.s(0, 0, 5, l46Var12, null, afc.q(i8, l46Var12));
                    l46Var12.r(true);
                } else {
                    l46Var12.Z();
                }
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((Integer) obj).getClass();
                ((Boolean) obj2).getClass();
                l46 l46Var13 = (l46) obj3;
                int iIntValue16 = ((Integer) obj4).intValue();
                if (l46Var13.W(iIntValue16 & 1, (iIntValue16 & 129) != 128)) {
                    j09 j09VarE = oa7.E(b.c, a7c.b(3.44f));
                    i8cVar.getClass();
                    dt1.a(j09VarE, i8c.o(l46Var13), false, null, 3.44f, null, null, null, l46Var13, 24576, 236);
                } else {
                    l46Var13.Z();
                }
                return wefVar;
            case 14:
                ((Integer) obj).getClass();
                ((Boolean) obj2).getClass();
                l46 l46Var14 = (l46) obj3;
                int iIntValue17 = ((Integer) obj4).intValue();
                if (l46Var14.W(iIntValue17 & 1, (iIntValue17 & 129) != 128)) {
                    dt1.a(oa7.E(b.c, a7c.b(1.03f)), sp1.Light, false, null, 1.03f, null, null, null, l46Var14, 24624, 236);
                } else {
                    l46Var14.Z();
                }
                return wefVar;
            case 15:
                int iIntValue18 = ((Integer) obj2).intValue();
                l46 l46Var15 = (l46) obj3;
                int iIntValue19 = ((Integer) obj4).intValue();
                ((rx9) obj).getClass();
                if ((iIntValue19 & 48) == 0) {
                    iIntValue19 |= l46Var15.e(iIntValue18) ? 32 : 16;
                }
                if (!l46Var15.W(iIntValue19 & 1, (iIntValue19 & 145) != 144)) {
                    l46Var15.Z();
                } else if (iIntValue18 == 0) {
                    l46Var15.f0(-494441229);
                    t4c.m(0, l46Var15);
                    l46Var15.r(false);
                } else {
                    l46Var15.f0(-494439909);
                    t4c.n(0, l46Var15);
                    l46Var15.r(false);
                }
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return new yfa((pv2) obj, (Context) obj2, (tuc) obj3, (sd8) obj4);
            default:
                ((Integer) obj).getClass();
                ((Boolean) obj2).getClass();
                l46 l46Var16 = (l46) obj3;
                int iIntValue20 = ((Integer) obj4).intValue();
                if (l46Var16.W(iIntValue20 & 1, (iIntValue20 & 129) != 128)) {
                    j09 j09VarE2 = oa7.E(b.c, a7c.b(4.0f));
                    i8cVar.getClass();
                    dt1.a(j09VarE2, i8c.o(l46Var16), false, null, 4.0f, null, null, null, l46Var16, 24576, 236);
                } else {
                    l46Var16.Z();
                }
                return wefVar;
        }
    }
}
