package defpackage;

import ai.askquin.R;
import ai.askquin.ui.annual.c;
import ai.askquin.ui.conversation.FailReason;
import ai.askquin.ui.draw.model.DrawCardSaves;
import ai.askquin.ui.router.GiftCardPerspective;
import android.content.Context;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.b;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import net.xmind.donut.gp.BillingSession;
import net.xmind.donut.gp.GooglePay;
import tech.chatmind.api.AdditionalInfoAudio;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.giftcard.GiftCardItem;
import tech.chatmind.api.giftcard.GiftCardSku;
import tech.chatmind.api.giftcard.GiftCardStatus;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o14 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o14(orc orcVar, ka9 ka9Var) {
        this.a = 3;
        this.c = orcVar;
        this.b = ka9Var;
    }

    private final Object a(Object obj, Object obj2) {
        iy9 iy9Var;
        iy9 iy9Var2;
        GiftCardPerspective giftCardPerspective = (GiftCardPerspective) this.b;
        GiftCardItem giftCardItem = (GiftCardItem) this.c;
        l46 l46Var = (l46) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i = 0;
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var, g09Var);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            pa6.h(432, af1.b0(-1754073215, new la6(giftCardItem, i), l46Var), l46Var, ynb.b0(24.0f, 0.0f, g09Var, 2), afc.q(R.string.gift_card_status, l46Var));
            if (giftCardPerspective == GiftCardPerspective.Received) {
                l46Var.f0(1815552876);
                String fromNickname = giftCardItem.getFromNickname();
                if (fromNickname == null || v4e.Q(fromNickname)) {
                    fromNickname = null;
                }
                if (fromNickname == null) {
                    l46Var.f0(1815552875);
                    l46Var.r(false);
                    iy9Var = null;
                } else {
                    l46Var.f0(1815552876);
                    iy9Var = new iy9(afc.q(R.string.gift_card_giver, l46Var), fromNickname);
                    l46Var.r(false);
                }
                l46Var.r(false);
            } else {
                l46Var.f0(1815619340);
                l46Var.r(false);
                iy9Var = null;
            }
            int i2 = oa6.a[giftCardPerspective.ordinal()];
            if (i2 == 1) {
                l46Var.f0(1815789747);
                String purchasedAt = giftCardItem.getPurchasedAt();
                if (purchasedAt == null || v4e.Q(purchasedAt)) {
                    purchasedAt = null;
                }
                if (purchasedAt == null) {
                    l46Var.f0(1815789746);
                    l46Var.r(false);
                    iy9Var2 = null;
                } else {
                    l46Var.f0(1815789747);
                    String strQ = afc.q(R.string.gift_card_purchase_time, l46Var);
                    wn7[] wn7VarArr = x76.a;
                    String strReplace = v4e.m0(10, purchasedAt).replace('-', '.');
                    strReplace.getClass();
                    iy9Var2 = new iy9(strQ, strReplace);
                    l46Var.r(false);
                }
                l46Var.r(false);
            } else {
                if (i2 != 2) {
                    throw tec.d(335665093, l46Var, false);
                }
                l46Var.f0(335673672);
                if (giftCardItem.getStatus() == GiftCardStatus.Pending) {
                    l46Var.f0(335675632);
                    iy9Var2 = new iy9(afc.q(R.string.gift_card_expiry_time, l46Var), afc.q(R.string.gift_card_pending_until, l46Var));
                    l46Var.r(false);
                } else {
                    String expireAt = giftCardItem.getExpireAt();
                    if (expireAt == null || v4e.Q(expireAt)) {
                        l46Var.f0(1816312189);
                        l46Var.r(false);
                        iy9Var2 = null;
                    } else {
                        l46Var.f0(1816180781);
                        String expireAt2 = giftCardItem.getExpireAt();
                        if (expireAt2 == null) {
                            l46Var.f0(1816180780);
                            l46Var.r(false);
                            iy9Var2 = null;
                        } else {
                            l46Var.f0(1816180781);
                            String strQ2 = afc.q(R.string.gift_card_expiry_time, l46Var);
                            wn7[] wn7VarArr2 = x76.a;
                            String strReplace2 = v4e.m0(10, expireAt2).replace('-', '.');
                            strReplace2.getClass();
                            iy9Var2 = new iy9(strQ2, strReplace2);
                            l46Var.r(false);
                        }
                        l46Var.r(false);
                    }
                }
                l46Var.r(false);
            }
            l46Var.f0(335687825);
            for (iy9 iy9Var3 : (ArrayList) qd0.k0(new iy9[]{iy9Var2, iy9Var})) {
                String str = (String) iy9Var3.a();
                String str2 = (String) iy9Var3.b();
                jgb.t(6, 0, l46Var, b.a(ynb.b0(24.0f, 0.0f, g09Var, 2), "gift_card_detail_info_divider"));
                pa6.h(432, af1.b0(-1693613594, new o8(str2, 18), l46Var), l46Var, ynb.b0(24.0f, 0.0f, g09Var, 2), str);
            }
            l46Var.r(false);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        yv5 yv5Var;
        int i;
        int i2;
        String strR;
        int i3 = this.a;
        int i4 = 5;
        i8c i8cVar = sf2.a;
        int i5 = 7;
        int i6 = 6;
        final int i7 = 2;
        final int i8 = 3;
        wef wefVar = wef.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i3) {
            case 0:
                ka9 ka9Var = (ka9) obj4;
                q9b q9bVar = (q9b) obj3;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zI = l46Var.i(ka9Var);
                    Object objR = l46Var.R();
                    if (zI || objR == i8cVar) {
                        objR = new a40(ka9Var, 4);
                        l46Var.p0(objR);
                    }
                    j74.n("打开", (x16) objR, l46Var, 6);
                    boolean zI2 = l46Var.i(q9bVar);
                    Object objR2 = l46Var.R();
                    if (zI2 || objR2 == i8cVar) {
                        objR2 = new fn0(q9bVar, i7);
                        l46Var.p0(objR2);
                    }
                    j74.n("Mock count=0", (x16) objR2, l46Var, 6);
                    Object objR3 = l46Var.R();
                    if (objR3 == i8cVar) {
                        objR3 = new vg3(16);
                        l46Var.p0(objR3);
                    }
                    j74.n("Reset daily", (x16) objR3, l46Var, 54);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 1:
                ka9 ka9Var2 = (ka9) obj4;
                mma mmaVar = (mma) obj3;
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objR4 = l46Var2.R();
                    if (objR4 == i8cVar) {
                        objR4 = new vg3(23);
                        l46Var2.p0(objR4);
                    }
                    j74.n("重置", (x16) objR4, l46Var2, 54);
                    boolean zI3 = l46Var2.i(ka9Var2);
                    Object objR5 = l46Var2.R();
                    if (zI3 || objR5 == i8cVar) {
                        objR5 = new a40(ka9Var2, 8);
                        l46Var2.p0(objR5);
                    }
                    j74.n("打开", (x16) objR5, l46Var2, 6);
                    boolean zI4 = l46Var2.i(mmaVar) | l46Var2.i(ka9Var2);
                    Object objR6 = l46Var2.R();
                    if (zI4 || objR6 == i8cVar) {
                        objR6 = new k14(mmaVar, ka9Var2, 1);
                        l46Var2.p0(objR6);
                    }
                    j74.n("弹窗", (x16) objR6, l46Var2, 6);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 2:
                use useVar = (use) obj4;
                Context context = (Context) obj3;
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    bx9 bx9VarQ = ynb.q(0.0f, 0.0f, 3);
                    boolean zG = l46Var3.g(useVar) | l46Var3.i(context);
                    Object objR7 = l46Var3.R();
                    if (zG || objR7 == i8cVar) {
                        objR7 = new jt3(i8, useVar, context);
                        l46Var3.p0(objR7);
                    }
                    cgg.a((x16) objR7, null, false, null, null, null, null, bx9VarQ, tm7.r, l46Var3, 817889280, 382);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case 3:
                orc orcVar = (orc) obj3;
                ka9 ka9Var3 = (ka9) obj4;
                l46 l46Var4 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (l46Var4.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zI5 = l46Var4.i(orcVar) | l46Var4.i(ka9Var3);
                    Object objR8 = l46Var4.R();
                    if (zI5 || objR8 == i8cVar) {
                        objR8 = new jt3(1, orcVar, ka9Var3);
                        l46Var4.p0(objR8);
                    }
                    j74.n("Open", (x16) objR8, l46Var4, 6);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            case 4:
                aw2 aw2Var = (aw2) obj4;
                c cVar = (c) obj3;
                l46 l46Var5 = (l46) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (l46Var5.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zI6 = l46Var5.i(aw2Var) | l46Var5.i(cVar);
                    Object objR9 = l46Var5.R();
                    if (zI6 || objR9 == i8cVar) {
                        objR9 = new jt3(i6, aw2Var, cVar);
                        l46Var5.p0(objR9);
                    }
                    j74.n("清除", (x16) objR9, l46Var5, 6);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
            case 5:
                mma mmaVar2 = (mma) obj4;
                gd8 gd8Var = (gd8) obj3;
                l46 l46Var6 = (l46) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (l46Var6.W(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zI7 = l46Var6.i(mmaVar2);
                    Object objR10 = l46Var6.R();
                    if (zI7 || objR10 == i8cVar) {
                        objR10 = new qo2(mmaVar2, 4);
                        l46Var6.p0(objR10);
                    }
                    j74.n("TP1", (x16) objR10, l46Var6, 6);
                    boolean zI8 = l46Var6.i(mmaVar2);
                    Object objR11 = l46Var6.R();
                    if (zI8 || objR11 == i8cVar) {
                        objR11 = new qo2(mmaVar2, i4);
                        l46Var6.p0(objR11);
                    }
                    j74.n("TP2", (x16) objR11, l46Var6, 6);
                    boolean zI9 = l46Var6.i(mmaVar2);
                    Object objR12 = l46Var6.R();
                    if (zI9 || objR12 == i8cVar) {
                        objR12 = new qo2(mmaVar2, i6);
                        l46Var6.p0(objR12);
                    }
                    j74.n("TP3", (x16) objR12, l46Var6, 6);
                    boolean zI10 = l46Var6.i(mmaVar2);
                    Object objR13 = l46Var6.R();
                    if (zI10 || objR13 == i8cVar) {
                        objR13 = new qo2(mmaVar2, i5);
                        l46Var6.p0(objR13);
                    }
                    j74.n("TP4", (x16) objR13, l46Var6, 6);
                    Object objR14 = l46Var6.R();
                    if (objR14 == i8cVar) {
                        objR14 = new vg3(18);
                        l46Var6.p0(objR14);
                    }
                    j74.n("Reset TP", (x16) objR14, l46Var6, 54);
                    boolean zI11 = l46Var6.i(gd8Var);
                    Object objR15 = l46Var6.R();
                    if (zI11 || objR15 == i8cVar) {
                        objR15 = new e14(gd8Var, false ? 1 : 0);
                        l46Var6.p0(objR15);
                    }
                    j74.n("Reset TP data", (x16) objR15, l46Var6, 6);
                    boolean zI12 = l46Var6.i(gd8Var);
                    Object objR16 = l46Var6.R();
                    if (zI12 || objR16 == i8cVar) {
                        objR16 = new e14(gd8Var, 1);
                        l46Var6.p0(objR16);
                    }
                    j74.n("Mock div x3", (x16) objR16, l46Var6, 6);
                    boolean zI13 = l46Var6.i(gd8Var);
                    Object objR17 = l46Var6.R();
                    if (zI13 || objR17 == i8cVar) {
                        objR17 = new e14(gd8Var, i7);
                        l46Var6.p0(objR17);
                    }
                    j74.n("Mock daily x3", (x16) objR17, l46Var6, 6);
                } else {
                    l46Var6.Z();
                }
                return wefVar;
            case 6:
                Context context2 = (Context) obj4;
                final gpf gpfVar = (gpf) obj3;
                l46 l46Var7 = (l46) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (l46Var7.W(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zI14 = l46Var7.i(context2) | l46Var7.i(gpfVar);
                    Object objR18 = l46Var7.R();
                    if (zI14 || objR18 == i8cVar) {
                        objR18 = new jt3(i4, context2, gpfVar);
                        l46Var7.p0(objR18);
                    }
                    j74.n("Pull from server", (x16) objR18, l46Var7, 6);
                    boolean zI15 = l46Var7.i(gpfVar);
                    Object objR19 = l46Var7.R();
                    if (zI15 || objR19 == i8cVar) {
                        final int i9 = false ? 1 : 0;
                        objR19 = new x16() { // from class: n14
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i10 = i9;
                                wef wefVar2 = wef.a;
                                gpf gpfVar2 = gpfVar;
                                switch (i10) {
                                    case 0:
                                        ynb.V(lw2.a, null, null, new v44(gpfVar2, null), 3);
                                        break;
                                    default:
                                        ynb.V(lw2.a, null, null, new x44(gpfVar2, null), 3);
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var7.p0(objR19);
                    }
                    j74.n("Server: opt-in all", (x16) objR19, l46Var7, 6);
                    boolean zI16 = l46Var7.i(gpfVar);
                    Object objR20 = l46Var7.R();
                    if (zI16 || objR20 == i8cVar) {
                        final int i10 = 1;
                        objR20 = new x16() { // from class: n14
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i11 = i10;
                                wef wefVar2 = wef.a;
                                gpf gpfVar2 = gpfVar;
                                switch (i11) {
                                    case 0:
                                        ynb.V(lw2.a, null, null, new v44(gpfVar2, null), 3);
                                        break;
                                    default:
                                        ynb.V(lw2.a, null, null, new x44(gpfVar2, null), 3);
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var7.p0(objR20);
                    }
                    j74.n("Server: opt-out all", (x16) objR20, l46Var7, 6);
                } else {
                    l46Var7.Z();
                }
                return wefVar;
            case 7:
                Context context3 = (Context) obj4;
                e89 e89Var = (e89) obj3;
                l46 l46Var8 = (l46) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                int i11 = 1;
                if (l46Var8.W(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    boolean zI17 = l46Var8.i(context3);
                    Object objR21 = l46Var8.R();
                    if (zI17 || objR21 == i8cVar) {
                        objR21 = new wr1(context3, e89Var, i11);
                        l46Var8.p0(objR21);
                    }
                    j74.n("发送下一条", (x16) objR21, l46Var8, 6);
                    boolean zI18 = l46Var8.i(context3);
                    Object objR22 = l46Var8.R();
                    if (zI18 || objR22 == i8cVar) {
                        objR22 = new u8(context3, 8);
                        l46Var8.p0(objR22);
                    }
                    j74.n("循环全部", (x16) objR22, l46Var8, 6);
                } else {
                    l46Var8.Z();
                }
                return wefVar;
            case 8:
                eab eabVar = (eab) obj4;
                fab fabVar = (fab) obj3;
                l46 l46Var9 = (l46) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (l46Var9.W(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    boolean zI19 = l46Var9.i(eabVar);
                    Object objR23 = l46Var9.R();
                    if (zI19 || objR23 == i8cVar) {
                        objR23 = new d14(eabVar, 14);
                        l46Var9.p0(objR23);
                    }
                    j74.n("日限额已达", (x16) objR23, l46Var9, 6);
                    boolean zI20 = l46Var9.i(eabVar);
                    Object objR24 = l46Var9.R();
                    if (zI20 || objR24 == i8cVar) {
                        objR24 = new d14(eabVar, 15);
                        l46Var9.p0(objR24);
                    }
                    j74.n("日限额·Usage先用+仍有次数", (x16) objR24, l46Var9, 6);
                    boolean zI21 = l46Var9.i(eabVar);
                    Object objR25 = l46Var9.R();
                    if (zI21 || objR25 == i8cVar) {
                        objR25 = new d14(eabVar, 16);
                        l46Var9.p0(objR25);
                    }
                    j74.n("订阅过期·补给·日限额", (x16) objR25, l46Var9, 6);
                    boolean zI22 = l46Var9.i(eabVar);
                    Object objR26 = l46Var9.R();
                    if (zI22 || objR26 == i8cVar) {
                        objR26 = new d14(eabVar, 17);
                        l46Var9.p0(objR26);
                    }
                    j74.n("日限额·Global", (x16) objR26, l46Var9, 6);
                    boolean zI23 = l46Var9.i(eabVar);
                    Object objR27 = l46Var9.R();
                    if (zI23 || objR27 == i8cVar) {
                        objR27 = new d14(eabVar, 18);
                        l46Var9.p0(objR27);
                    }
                    j74.n("月额度已用完", (x16) objR27, l46Var9, 6);
                    boolean zI24 = l46Var9.i(eabVar);
                    Object objR28 = l46Var9.R();
                    if (zI24 || objR28 == i8cVar) {
                        objR28 = new d14(eabVar, 19);
                        l46Var9.p0(objR28);
                    }
                    j74.n("月额度用完·活动赠送2次", (x16) objR28, l46Var9, 6);
                    boolean zI25 = l46Var9.i(eabVar);
                    Object objR29 = l46Var9.R();
                    if (zI25 || objR29 == i8cVar) {
                        objR29 = new d14(eabVar, 20);
                        l46Var9.p0(objR29);
                    }
                    j74.n("月额度用完·活动1次+补给1次", (x16) objR29, l46Var9, 6);
                    boolean zI26 = l46Var9.i(eabVar);
                    Object objR30 = l46Var9.R();
                    if (zI26 || objR30 == i8cVar) {
                        objR30 = new d14(eabVar, 21);
                        l46Var9.p0(objR30);
                    }
                    j74.n("最后一月·到期时间", (x16) objR30, l46Var9, 6);
                    Object objR31 = l46Var9.R();
                    if (objR31 == i8cVar) {
                        objR31 = new vg3(24);
                        l46Var9.p0(objR31);
                    }
                    j74.n("重置首次追问提醒", (x16) objR31, l46Var9, 54);
                    boolean zI27 = l46Var9.i(eabVar) | l46Var9.i(fabVar);
                    Object objR32 = l46Var9.R();
                    if (zI27 || objR32 == i8cVar) {
                        objR32 = new jt3(4, eabVar, fabVar);
                        l46Var9.p0(objR32);
                    }
                    j74.n("清除", (x16) objR32, l46Var9, 6);
                } else {
                    l46Var9.Z();
                }
                return wefVar;
            case 9:
                final aw2 aw2Var2 = (aw2) obj4;
                final Context context4 = (Context) obj3;
                l46 l46Var10 = (l46) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (l46Var10.W(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    boolean zI28 = l46Var10.i(aw2Var2) | l46Var10.i(context4);
                    Object objR33 = l46Var10.R();
                    if (zI28 || objR33 == i8cVar) {
                        final int i12 = false ? 1 : 0;
                        objR33 = new x16() { // from class: g14
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i13 = i12;
                                wef wefVar2 = wef.a;
                                Context context5 = context4;
                                aw2 aw2Var3 = aw2Var2;
                                switch (i13) {
                                    case 0:
                                        ynb.V(aw2Var3, null, null, new k34(context5, null), 3);
                                        break;
                                    default:
                                        ynb.V(aw2Var3, null, null, new l34(context5, null), 3);
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var10.p0(objR33);
                    }
                    j74.n("立即发送", (x16) objR33, l46Var10, 6);
                    boolean zI29 = l46Var10.i(aw2Var2) | l46Var10.i(context4);
                    Object objR34 = l46Var10.R();
                    if (zI29 || objR34 == i8cVar) {
                        final int i13 = 1;
                        objR34 = new x16() { // from class: g14
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i14 = i13;
                                wef wefVar2 = wef.a;
                                Context context5 = context4;
                                aw2 aw2Var3 = aw2Var2;
                                switch (i14) {
                                    case 0:
                                        ynb.V(aw2Var3, null, null, new k34(context5, null), 3);
                                        break;
                                    default:
                                        ynb.V(aw2Var3, null, null, new l34(context5, null), 3);
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var10.p0(objR34);
                    }
                    j74.n("开启提醒并排程", (x16) objR34, l46Var10, 6);
                    Object objR35 = l46Var10.R();
                    if (objR35 == i8cVar) {
                        objR35 = new vg3(22);
                        l46Var10.p0(objR35);
                    }
                    j74.n("重置今日popup", (x16) objR35, l46Var10, 54);
                } else {
                    l46Var10.Z();
                }
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((Integer) obj2).getClass();
                j74.r((String) obj4, (dd2) obj3, (l46) obj, k99.P(391));
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                final t7 t7Var = (t7) obj4;
                final k2c k2cVar = (k2c) obj3;
                l46 l46Var11 = (l46) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (l46Var11.W(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    boolean zI30 = l46Var11.i(t7Var) | l46Var11.i(k2cVar);
                    Object objR36 = l46Var11.R();
                    if (zI30 || objR36 == i8cVar) {
                        final int i14 = false ? 1 : 0;
                        objR36 = new x16() { // from class: y04
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i15 = i14;
                                wef wefVar2 = wef.a;
                                t7 t7Var2 = t7Var;
                                switch (i15) {
                                    case 0:
                                        j74.W(t7Var2, new gl(2, k2cVar, k2c.class, "stageStoreReturnPendingForQa", "stageStoreReturnPendingForQa(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 6), new to3(6));
                                        break;
                                    case 1:
                                        j74.W(t7Var2, new gl(2, k2cVar, k2c.class, "stageSnackbarExposureForQa", "stageSnackbarExposureForQa(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 7), new to3(5));
                                        break;
                                    case 2:
                                        j74.W(t7Var2, new gl(2, k2cVar, k2c.class, "loadAccountStateForQa", "loadAccountStateForQa(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 8), r54.a);
                                        break;
                                    default:
                                        j74.W(t7Var2, new gl(2, k2cVar, k2c.class, "resetAccountStateForQa", "resetAccountStateForQa(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 9), new to3(4));
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var11.p0(objR36);
                    }
                    j74.n("商店返回待展示", (x16) objR36, l46Var11, 6);
                    boolean zI31 = l46Var11.i(t7Var) | l46Var11.i(k2cVar);
                    Object objR37 = l46Var11.R();
                    if (zI31 || objR37 == i8cVar) {
                        final int i15 = 1;
                        objR37 = new x16() { // from class: y04
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i16 = i15;
                                wef wefVar2 = wef.a;
                                t7 t7Var2 = t7Var;
                                switch (i16) {
                                    case 0:
                                        j74.W(t7Var2, new gl(2, k2cVar, k2c.class, "stageStoreReturnPendingForQa", "stageStoreReturnPendingForQa(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 6), new to3(6));
                                        break;
                                    case 1:
                                        j74.W(t7Var2, new gl(2, k2cVar, k2c.class, "stageSnackbarExposureForQa", "stageSnackbarExposureForQa(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 7), new to3(5));
                                        break;
                                    case 2:
                                        j74.W(t7Var2, new gl(2, k2cVar, k2c.class, "loadAccountStateForQa", "loadAccountStateForQa(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 8), r54.a);
                                        break;
                                    default:
                                        j74.W(t7Var2, new gl(2, k2cVar, k2c.class, "resetAccountStateForQa", "resetAccountStateForQa(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 9), new to3(4));
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var11.p0(objR37);
                    }
                    j74.n("Snackbar 已领取曝光", (x16) objR37, l46Var11, 6);
                    boolean zI32 = l46Var11.i(t7Var) | l46Var11.i(k2cVar);
                    Object objR38 = l46Var11.R();
                    if (zI32 || objR38 == i8cVar) {
                        objR38 = new x16() { // from class: y04
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i16 = i7;
                                wef wefVar2 = wef.a;
                                t7 t7Var2 = t7Var;
                                switch (i16) {
                                    case 0:
                                        j74.W(t7Var2, new gl(2, k2cVar, k2c.class, "stageStoreReturnPendingForQa", "stageStoreReturnPendingForQa(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 6), new to3(6));
                                        break;
                                    case 1:
                                        j74.W(t7Var2, new gl(2, k2cVar, k2c.class, "stageSnackbarExposureForQa", "stageSnackbarExposureForQa(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 7), new to3(5));
                                        break;
                                    case 2:
                                        j74.W(t7Var2, new gl(2, k2cVar, k2c.class, "loadAccountStateForQa", "loadAccountStateForQa(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 8), r54.a);
                                        break;
                                    default:
                                        j74.W(t7Var2, new gl(2, k2cVar, k2c.class, "resetAccountStateForQa", "resetAccountStateForQa(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 9), new to3(4));
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var11.p0(objR38);
                    }
                    j74.n("状态", (x16) objR38, l46Var11, 6);
                    boolean zI33 = l46Var11.i(t7Var) | l46Var11.i(k2cVar);
                    Object objR39 = l46Var11.R();
                    if (zI33 || objR39 == i8cVar) {
                        objR39 = new x16() { // from class: y04
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i16 = i8;
                                wef wefVar2 = wef.a;
                                t7 t7Var2 = t7Var;
                                switch (i16) {
                                    case 0:
                                        j74.W(t7Var2, new gl(2, k2cVar, k2c.class, "stageStoreReturnPendingForQa", "stageStoreReturnPendingForQa(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 6), new to3(6));
                                        break;
                                    case 1:
                                        j74.W(t7Var2, new gl(2, k2cVar, k2c.class, "stageSnackbarExposureForQa", "stageSnackbarExposureForQa(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 7), new to3(5));
                                        break;
                                    case 2:
                                        j74.W(t7Var2, new gl(2, k2cVar, k2c.class, "loadAccountStateForQa", "loadAccountStateForQa(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 8), r54.a);
                                        break;
                                    default:
                                        j74.W(t7Var2, new gl(2, k2cVar, k2c.class, "resetAccountStateForQa", "resetAccountStateForQa(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 9), new to3(4));
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var11.p0(objR39);
                    }
                    j74.n("重置", (x16) objR39, l46Var11, 6);
                } else {
                    l46Var11.Z();
                }
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((Integer) obj2).getClass();
                od4.h((List) obj4, (Collection) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                dr2 dr2Var = (dr2) ((fo4) obj4);
                dr2Var.getClass();
                ynb.V(hwf.a(dr2Var.a.c), null, null, new cr2(dr2Var, (DrawCardSaves) obj3, (String) obj, (AdditionalInfoAudio) obj2, null), 3);
                return wefVar;
            case 14:
                ((Integer) obj2).getClass();
                g21.g((List) obj4, (l26) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 15:
                ((Integer) obj2).getClass();
                ga5.b((tr2) obj4, (FailReason) obj3, (l46) obj, k99.P(9));
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((Integer) obj2).getClass();
                y41.c((ob5) obj4, (j09) obj3, (l46) obj, k99.P(49));
                return wefVar;
            case 17:
                ((Integer) obj2).getClass();
                ap5.d((TarotCardChoice) obj4, (x16) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 18:
                ((Integer) obj2).getClass();
                vfh.d((j09) obj4, (List) obj3, (l46) obj, k99.P(7));
                return wefVar;
            case 19:
                ((Integer) obj2).getClass();
                kj0.e((mic) obj4, (j09) obj3, (l46) obj, k99.P(49));
                return wefVar;
            case 20:
                mic micVar = (mic) obj4;
                dd2 dd2Var = (dd2) obj3;
                l46 l46Var12 = (l46) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (l46Var12.W(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    pr4 pr4Var = bx5.c;
                    int iOrdinal = micVar.ordinal();
                    if (iOrdinal == 0) {
                        yv5Var = bx5.a;
                    } else {
                        if (iOrdinal != 1) {
                            ap.c();
                            return null;
                        }
                        yv5Var = bx5.b;
                    }
                    mh3.a(pr4Var.a(yv5Var), dd2Var, l46Var12, 8);
                } else {
                    l46Var12.Z();
                }
                return wefVar;
            case 21:
                ((Integer) obj2).getClass();
                qn4.m((x16) obj4, (a16) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 22:
                ((Integer) obj2).getClass();
                dj6.p((l06) obj4, (j09) obj3, (l46) obj, k99.P(49));
                return wefVar;
            case 23:
                e49 e49Var = (e49) obj4;
                l46 l46Var13 = (l46) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (l46Var13.W(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    e49Var.a.m(obj3, l46Var13, 0);
                } else {
                    l46Var13.Z();
                }
                return wefVar;
            case 24:
                bw bwVar = (bw) obj4;
                opd opdVar = (opd) obj3;
                int iIntValue14 = ((Integer) obj).intValue();
                if (obj2 instanceof ue2) {
                    ((p89) bwVar.f).b((ue2) obj2);
                } else if (!(obj2 instanceof f0c)) {
                    if (obj2 instanceof p46) {
                        ynb.f0(opdVar, iIntValue14, obj2);
                        bwVar.i((p46) obj2);
                    } else if (obj2 instanceof ojb) {
                        ynb.f0(opdVar, iIntValue14, obj2);
                        ((ojb) obj2).c();
                    }
                }
                return wefVar;
            case 25:
                GiftCardItem giftCardItem = (GiftCardItem) obj4;
                wa6 wa6Var = (wa6) obj3;
                l46 l46Var14 = (l46) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (l46Var14.W(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    g09 g09Var = g09.a;
                    j09 j09VarZ = ynb.Z(g09Var, 24.0f);
                    t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var14, 48);
                    int iHashCode = Long.hashCode(l46Var14.T);
                    u8a u8aVarM = l46Var14.m();
                    j09 j09VarJ = m93.J(l46Var14, j09VarZ);
                    lf2.q.getClass();
                    l46Var14.j0();
                    boolean z = l46Var14.S;
                    ov7 ov7Var = LayoutNode.h1;
                    if (z) {
                        l46Var14.l(ov7Var);
                    } else {
                        l46Var14.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var14, t7cVarA);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var14, u8aVarM);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var14, numValueOf);
                    dec.k(l46Var14);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var14, j09VarJ);
                    jw7 jw7Var = new jw7(1.0f, true);
                    c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Y, l46Var14, 6);
                    int iHashCode2 = Long.hashCode(l46Var14.T);
                    u8a u8aVarM2 = l46Var14.m();
                    j09 j09VarJ2 = m93.J(l46Var14, jw7Var);
                    l46Var14.j0();
                    if (l46Var14.S) {
                        l46Var14.l(ov7Var);
                    } else {
                        l46Var14.s0();
                    }
                    dec.l(he2Var, l46Var14, c92VarA);
                    dec.l(he2Var2, l46Var14, u8aVarM2);
                    ib8.s(iHashCode2, l46Var14, he2Var3, l46Var14);
                    dec.l(he2Var4, l46Var14, j09VarJ2);
                    if (giftCardItem.getSku() == GiftCardSku.OneYear) {
                        i = 1403467846;
                        i2 = R.string.gift_card_one_year;
                    } else {
                        i = 1403542277;
                        i2 = R.string.gift_card_one_month;
                    }
                    String strI = tec.i(l46Var14, i, i2, l46Var14, false);
                    pr4 pr4Var2 = l8b.a;
                    long j = ((e8b) l46Var14.k(pr4Var2)).q;
                    mue mueVar = oue.a;
                    nte.b(strI, b.a(g09Var, "gift_card_list_title"), j, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.b(l46Var14), l46Var14, 48, 0, 131064);
                    int iOrdinal2 = wa6Var.ordinal();
                    if (iOrdinal2 == 0) {
                        l46Var14.f0(1403918462);
                        String purchasedAt = giftCardItem.getPurchasedAt();
                        if (purchasedAt == null || v4e.Q(purchasedAt)) {
                            purchasedAt = null;
                        }
                        if (purchasedAt == null) {
                            l46Var14.f0(1403918461);
                            l46Var14.r(false);
                            strR = null;
                        } else {
                            l46Var14.f0(1403918462);
                            String strReplace = v4e.m0(10, purchasedAt).replace('-', '/');
                            strReplace.getClass();
                            strR = afc.r(R.string.gift_card_bought_on, new Object[]{strReplace}, l46Var14);
                            l46Var14.r(false);
                        }
                        l46Var14.r(false);
                    } else {
                        if (iOrdinal2 != 1) {
                            throw tec.d(-231810148, l46Var14, false);
                        }
                        l46Var14.f0(-231803121);
                        if (giftCardItem.getStatus() == GiftCardStatus.Pending) {
                            strR = tec.i(l46Var14, -231801049, R.string.gift_card_pending_until, l46Var14, false);
                        } else {
                            String expireAt = giftCardItem.getExpireAt();
                            if (expireAt == null || v4e.Q(expireAt)) {
                                l46Var14.f0(1404352678);
                                l46Var14.r(false);
                                strR = null;
                            } else {
                                l46Var14.f0(1404213520);
                                String expireAt2 = giftCardItem.getExpireAt();
                                if (expireAt2 == null) {
                                    l46Var14.f0(1404213519);
                                    l46Var14.r(false);
                                    strR = null;
                                } else {
                                    l46Var14.f0(1404213520);
                                    String strReplace2 = v4e.m0(10, expireAt2).replace('-', '/');
                                    strReplace2.getClass();
                                    strR = afc.r(R.string.gift_card_valid_until, new Object[]{strReplace2}, l46Var14);
                                    l46Var14.r(false);
                                }
                                l46Var14.r(false);
                            }
                        }
                        l46Var14.r(false);
                    }
                    String str = strR;
                    if (str != null) {
                        l46Var14.f0(1404427668);
                        nte.b(str, b.a(g09Var, "gift_card_list_date"), ((e8b) l46Var14.k(pr4Var2)).t, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var14), l46Var14, 48, 0, 131064);
                        l46Var14.r(false);
                    } else {
                        l46Var14.f0(1404644203);
                        l46Var14.r(false);
                    }
                    l46Var14.r(true);
                    x76.e(giftCardItem.getStatus(), l46Var14, 0);
                    gu6.a(bm8.z(), null, b.a(androidx.compose.foundation.layout.b.l(ynb.d0(8.0f, 0.0f, 0.0f, 0.0f, 14, g09Var), 24.0f), "gift_card_list_chevron"), ((e8b) l46Var14.k(pr4Var2)).z, l46Var14, 432, 0);
                    l46Var14.r(true);
                } else {
                    l46Var14.Z();
                }
                return wefVar;
            case 26:
                ((Integer) obj2).getClass();
                pa6.k((x16) obj4, (l26) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 27:
                return a(obj, obj2);
            case 28:
                GooglePay googlePay = (GooglePay) obj4;
                BillingSession billingSession = (BillingSession) obj3;
                List list = (List) obj;
                l26 l26Var = (l26) obj2;
                int i16 = GooglePay.g;
                list.getClass();
                l26Var.getClass();
                if (googlePay.e.b(billingSession)) {
                    ox0 ox0Var = billingSession.a;
                    kb6 kb6Var = new kb6(26);
                    ArrayList<d4b> arrayList = new ArrayList(t72.u(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add((d4b) ((iy9) it.next()).e());
                    }
                    if (arrayList.isEmpty()) {
                        qc0.j("Product list cannot be empty.");
                    } else {
                        HashSet hashSet = new HashSet();
                        for (d4b d4bVar : arrayList) {
                            if (!"play_pass_subs".equals(d4bVar.b)) {
                                hashSet.add(d4bVar.b);
                            }
                        }
                        if (hashSet.size() <= 1) {
                            mtg mtgVarM = mtg.m(arrayList);
                            kb6Var.b = mtgVarM;
                            if (mtgVarM != null) {
                                ox0Var.c(new kd9(kb6Var), new gi2(googlePay, billingSession, l26Var, i4));
                            } else {
                                qc0.j("Product list must be set to a non empty list.");
                            }
                        } else {
                            qc0.j("All products should be of the same product type.");
                        }
                    }
                    return null;
                }
                return wefVar;
            default:
                cn6 cn6Var = (cn6) obj4;
                a26 a26Var = (a26) obj3;
                l46 l46Var15 = (l46) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (l46Var15.W(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    ma8 ma8VarW = feg.W(cn6Var.d);
                    boolean zG2 = l46Var15.g(a26Var) | l46Var15.g(cn6Var);
                    Object objR40 = l46Var15.R();
                    if (zG2 || objR40 == i8cVar) {
                        objR40 = new jf6(i8, a26Var, cn6Var);
                        l46Var15.p0(objR40);
                    }
                    od4.f(null, ma8VarW, (x16) objR40, null, l46Var15, 0);
                } else {
                    l46Var15.Z();
                }
                return wefVar;
        }
    }

    public /* synthetic */ o14(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ o14(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
