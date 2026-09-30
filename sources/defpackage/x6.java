package defpackage;

import ai.askquin.R;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.navhost.ClarifyingCardDrawingRoute;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.List;
import tech.chatmind.api.ArcanaGroup;
import tech.chatmind.api.Gender;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x6 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x6(x16 x16Var, oh4 oh4Var, x16 x16Var2) {
        this.a = 25;
        this.b = x16Var;
        this.c = oh4Var;
        this.d = x16Var2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ycc yccVarA;
        int i = this.a;
        int i2 = 25;
        int i3 = 22;
        int i4 = 15;
        g09 g09Var = g09.a;
        i8c i8cVar = sf2.a;
        int i5 = 3;
        int i6 = 2;
        boolean z = false;
        final int i7 = 1;
        wef wefVar = wef.a;
        Object obj3 = this.b;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                b21.i((x48) obj5, (a26) obj4, (x16) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 1:
                ((Integer) obj2).getClass();
                cn1.b((Gender) obj5, (x16) obj3, (x9) obj4, (l46) obj, k99.P(513));
                return wefVar;
            case 2:
                ((Integer) obj2).getClass();
                x8.a((x9) obj5, (x16) obj3, (a26) obj4, (l46) obj, k99.P(9));
                return wefVar;
            case 3:
                ((Integer) obj2).getClass();
                dj6.f((gh) obj5, (a26) obj4, (x16) obj3, (l46) obj, k99.P(9));
                return wefVar;
            case 4:
                j09 j09Var = (j09) obj5;
                e89 e89Var = (e89) obj4;
                dd2 dd2Var = (dd2) obj3;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i8 = 1;
                if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objR = l46Var.R();
                    if (objR == i8cVar) {
                        objR = new pg(e89Var, i8);
                        l46Var.p0(objR);
                    }
                    j09 j09VarW = nk8.w(j09Var, (a26) objR);
                    xn8 xn8VarC = s21.c(ndb.b, true);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarW);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, xn8VarC);
                    dec.l(hj6.y, l46Var, u8aVarM);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ);
                    tec.q(0, dd2Var, l46Var, true);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 5:
                ((Integer) obj2).getClass();
                nk8.c((ArcanaGroup) obj5, (a26) obj4, (j09) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 6:
                o4c o4cVar = (o4c) obj5;
                j09 j09Var2 = (j09) obj4;
                n26 n26Var = (n26) obj3;
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    q4c.a(o4cVar, af1.b0(-1594352936, new w7(8, j09Var2, n26Var), l46Var2), l46Var2, 384);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 7:
                ((Integer) obj2).getClass();
                y41.a((String) obj5, (a26) obj4, (x16) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 8:
                ((Integer) obj2).getClass();
                af1.c((a26) obj4, (a26) obj5, (x16) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 9:
                fy9 fy9Var = (fy9) obj5;
                sdd sddVar = (sdd) obj4;
                e89 e89Var2 = (e89) obj3;
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    FillElement fillElement = b.c;
                    c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var3, 48);
                    int iHashCode2 = Long.hashCode(l46Var3.T);
                    u8a u8aVarM2 = l46Var3.m();
                    j09 j09VarJ2 = m93.J(l46Var3, fillElement);
                    lf2.q.getClass();
                    l46Var3.j0();
                    boolean z2 = l46Var3.S;
                    ov7 ov7Var = LayoutNode.h1;
                    if (z2) {
                        l46Var3.l(ov7Var);
                    } else {
                        l46Var3.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var3, c92VarA);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var3, u8aVarM2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var3, numValueOf);
                    dec.k(l46Var3);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var3, j09VarJ2);
                    rs0.e(0, l46Var3, null, afc.q(R.string.onboarding_tarot_ceremony_title, l46Var3));
                    o5c.f(l46Var3, b.d(g09Var, 8.0f));
                    j09 j09VarB0 = ynb.b0(24.0f, 0.0f, g09Var, 2);
                    String strQ = afc.q(R.string.onboarding_tarot_ceremony_subtitle, l46Var3);
                    mue mueVar = pue.a;
                    nte.b(strQ, j09VarB0, ((e8b) l46Var3.k(l8b.a)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var3), l46Var3, 48, 0, 130040);
                    jw7 jw7Var = new jw7(1.0f, true);
                    xn8 xn8VarC2 = s21.c(ndb.b, false);
                    int iHashCode3 = Long.hashCode(l46Var3.T);
                    u8a u8aVarM3 = l46Var3.m();
                    j09 j09VarJ3 = m93.J(l46Var3, jw7Var);
                    l46Var3.j0();
                    if (l46Var3.S) {
                        l46Var3.l(ov7Var);
                    } else {
                        l46Var3.s0();
                    }
                    dec.l(he2Var, l46Var3, xn8VarC2);
                    dec.l(he2Var2, l46Var3, u8aVarM3);
                    ib8.s(iHashCode3, l46Var3, he2Var3, l46Var3);
                    dec.l(he2Var4, l46Var3, j09VarJ3);
                    switch (((qp1) e89Var2.getValue()).ordinal()) {
                        case 0:
                        case 1:
                            l46Var3.f0(-676164874);
                            l46Var3.r(false);
                            break;
                        case 2:
                        case 3:
                            l46Var3.f0(-676160577);
                            j09 j09VarA = androidx.compose.ui.platform.b.a(fillElement, "onboarding-card-shuffle");
                            Object objR2 = l46Var3.R();
                            if (objR2 == i8cVar) {
                                objR2 = new i8(e89Var2, 15);
                                l46Var3.p0(objR2);
                            }
                            x16 x16Var = (x16) objR2;
                            Object objR3 = l46Var3.R();
                            if (objR3 == i8cVar) {
                                objR3 = new i8(e89Var2, 16);
                                l46Var3.p0(objR3);
                            }
                            p8c.i(j09VarA, null, null, 1, 0, false, false, fy9Var, false, null, x16Var, null, null, false, (x16) objR3, l46Var3, 16780294, 24582, 15222);
                            l46Var3.r(false);
                            break;
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            l46Var3.f0(-676130079);
                            j09 j09VarA2 = androidx.compose.ui.platform.b.a(fillElement, "onboarding-card-wheel");
                            Object objR4 = l46Var3.R();
                            if (objR4 == i8cVar) {
                                objR4 = new i8(e89Var2, 17);
                                l46Var3.p0(objR4);
                            }
                            x16 x16Var2 = (x16) objR4;
                            Object objR5 = l46Var3.R();
                            if (objR5 == i8cVar) {
                                objR5 = new i8(e89Var2, 18);
                                l46Var3.p0(objR5);
                            }
                            y8c.a(sddVar, j09VarA2, null, 0.0f, fy9Var, x16Var2, (x16) objR5, l46Var3, 1802288);
                            l46Var3.r(false);
                            break;
                        default:
                            throw tec.d(-676167416, l46Var3, false);
                    }
                    l46Var3.r(true);
                    l46Var3.r(true);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((Integer) obj2).getClass();
                gs1.g((String) obj5, (String) obj3, (a26) obj4, (l46) obj, k99.P(385));
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((Integer) obj2).getClass();
                kj0.K((j09) obj5, (fy9) obj4, (String) obj3, (l46) obj, k99.P(65));
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((Integer) obj2).getClass();
                zg2.a((Owner) obj5, (pw) obj4, (dd2) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                x4d x4dVar = (x4d) obj5;
                a26 a26Var = (a26) obj4;
                gd4 gd4Var = (gd4) obj3;
                l46 l46Var4 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (l46Var4.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    j09 j09VarB = b.b(0.0f, 40.0f, g09Var, 1);
                    bx9 bx9Var = new bx9(12.0f, 3.0f, 12.0f, 3.0f);
                    bx9 bx9Var2 = v51.a;
                    pr4 pr4Var = l8b.a;
                    u51 u51VarA = v51.a(((e8b) l46Var4.k(pr4Var)).m, ((e8b) l46Var4.k(pr4Var)).q, 0L, 0L, l46Var4, 12);
                    boolean zG = l46Var4.g(a26Var) | l46Var4.i(gd4Var);
                    Object objR6 = l46Var4.R();
                    if (zG || objR6 == i8cVar) {
                        objR6 = new ad1(9, a26Var, gd4Var);
                        l46Var4.p0(objR6);
                    }
                    c8b.k(j09VarB, false, x4dVar, u51VarA, null, bx9Var, false, (x16) objR6, kn2.a, l46Var4, 100859910, 82);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            case 14:
                p3c p3cVar = (p3c) obj5;
                Context context = (Context) obj4;
                e89 e89Var3 = (e89) obj3;
                l46 l46Var5 = (l46) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (l46Var5.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zI = l46Var5.i(p3cVar) | l46Var5.i(context);
                    Object objR7 = l46Var5.R();
                    if (zI || objR7 == i8cVar) {
                        objR7 = new ad1(21, p3cVar, context);
                        l46Var5.p0(objR7);
                    }
                    x16 x16Var3 = (x16) objR7;
                    boolean zI2 = l46Var5.i(p3cVar);
                    Object objR8 = l46Var5.R();
                    if (zI2 || objR8 == i8cVar) {
                        objR8 = new hl(0, p3cVar, p3c.class, "dismissReviewRewardSnackbar", "dismissReviewRewardSnackbar()V", 0, 24);
                        l46Var5.p0(objR8);
                    }
                    x16 x16Var4 = (x16) ((ym7) objR8);
                    boolean zG2 = l46Var5.g(e89Var3);
                    Object objR9 = l46Var5.R();
                    if (zG2 || objR9 == i8cVar) {
                        objR9 = new pg(e89Var3, 19);
                        l46Var5.p0(objR9);
                    }
                    v2c.c(x16Var3, x16Var4, nk8.w(g09Var, (a26) objR9), l46Var5, 384, 0);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
            case 15:
                ((Integer) obj2).getClass();
                lmg.G((j09) obj5, (cre) obj4, (dd2) obj3, (l46) obj, k99.P(385));
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((Integer) obj2).getClass();
                x57.p((String) obj5, (l26) obj3, (a26) obj4, (l46) obj, k99.P(1));
                return wefVar;
            case 17:
                List list = (List) obj5;
                d63 d63Var = (d63) obj4;
                cs3 cs3Var = (cs3) obj3;
                l46 l46Var6 = (l46) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!l46Var6.W(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                    l46Var6.Z();
                } else if (list.isEmpty()) {
                    l46Var6.f0(-723099162);
                    l46Var6.r(false);
                } else {
                    l46Var6.f0(-723255805);
                    x57.k(list, d63Var.c, cs3Var, null, l46Var6, 0);
                    l46Var6.r(false);
                }
                return wefVar;
            case 18:
                cod codVar = (cod) obj5;
                y72 y72Var = (y72) obj3;
                a26 a26Var2 = (a26) obj4;
                l46 l46Var7 = (l46) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!l46Var7.W(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    l46Var7.Z();
                } else if (codVar == null) {
                    l46Var7.f0(329777520);
                    l46Var7.r(false);
                } else {
                    l46Var7.f0(329777521);
                    boolean zG3 = l46Var7.g(a26Var2) | l46Var7.g(codVar);
                    Object objR10 = l46Var7.R();
                    if (zG3 || objR10 == i8cVar) {
                        objR10 = new ad1(i2, a26Var2, codVar);
                        l46Var7.p0(objR10);
                    }
                    x57.l(codVar, y72Var, (x16) objR10, androidx.compose.ui.platform.b.a(ynb.b0(24.0f, 0.0f, b.c(g09Var, 1.0f), 2), "daily_card_skin_picker_info"), l46Var7, 3072);
                    l46Var7.r(false);
                }
                return wefVar;
            case 19:
                ((Integer) obj2).getClass();
                x57.j((cod) obj5, (TarotCardChoice) obj4, (j09) obj3, (l46) obj, k99.P(1));
                return wefVar;
            case 20:
                gh6 gh6Var = (gh6) obj5;
                a26 a26Var3 = (a26) obj4;
                Float f = (Float) obj;
                float fFloatValue = f.floatValue();
                ((Float) obj2).getClass();
                qz9 qz9Var = (qz9) ((n69) obj3);
                if ((((float) Math.floor((double) (qz9Var.j() / 90.0f))) == ((float) Math.floor((double) (fFloatValue / 90.0f))) ? (byte) 1 : (byte) 0) == 0) {
                    gh6Var.a();
                }
                qz9Var.k(fFloatValue);
                a26Var3.d(f);
                return wefVar;
            case 21:
                Context context2 = (Context) obj5;
                mma mmaVar = (mma) obj4;
                ka9 ka9Var = (ka9) obj3;
                l46 l46Var8 = (l46) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (l46Var8.W(1 & iIntValue8, (iIntValue8 & 3) != 2)) {
                    Object objR11 = l46Var8.R();
                    if (objR11 == i8cVar) {
                        objR11 = new vg3(27);
                        l46Var8.p0(objR11);
                    }
                    j74.n("重置", (x16) objR11, l46Var8, 54);
                    boolean zI3 = l46Var8.i(context2);
                    Object objR12 = l46Var8.R();
                    if (zI3 || objR12 == i8cVar) {
                        objR12 = new u8(context2, i4);
                        l46Var8.p0(objR12);
                    }
                    j74.n("重置半拉框配额", (x16) objR12, l46Var8, 6);
                    boolean zI4 = l46Var8.i(mmaVar) | l46Var8.i(ka9Var);
                    Object objR13 = l46Var8.R();
                    if (zI4 || objR13 == i8cVar) {
                        objR13 = new k14(mmaVar, ka9Var, 2);
                        l46Var8.p0(objR13);
                    }
                    j74.n("弹窗", (x16) objR13, l46Var8, 6);
                    boolean zI5 = l46Var8.i(ka9Var);
                    Object objR14 = l46Var8.R();
                    if (zI5 || objR14 == i8cVar) {
                        objR14 = new a40(ka9Var, 14);
                        l46Var8.p0(objR14);
                    }
                    j74.n("教程页", (x16) objR14, l46Var8, 6);
                    boolean zI6 = l46Var8.i(ka9Var);
                    Object objR15 = l46Var8.R();
                    if (zI6 || objR15 == i8cVar) {
                        objR15 = new a40(ka9Var, i4);
                        l46Var8.p0(objR15);
                    }
                    j74.n("今日半拉框", (x16) objR15, l46Var8, 6);
                    boolean zI7 = l46Var8.i(ka9Var);
                    Object objR16 = l46Var8.R();
                    if (zI7 || objR16 == i8cVar) {
                        objR16 = new a40(ka9Var, 16);
                        l46Var8.p0(objR16);
                    }
                    j74.n("快决半拉框", (x16) objR16, l46Var8, 6);
                    boolean zI8 = l46Var8.i(ka9Var);
                    Object objR17 = l46Var8.R();
                    if (zI8 || objR17 == i8cVar) {
                        objR17 = new a40(ka9Var, 17);
                        l46Var8.p0(objR17);
                    }
                    j74.n("重测今日半拉框", (x16) objR17, l46Var8, 6);
                } else {
                    l46Var8.Z();
                }
                return wefVar;
            case 22:
                aw2 aw2Var = (aw2) obj5;
                nb4 nb4Var = (nb4) obj4;
                s7 s7Var = (s7) obj3;
                l46 l46Var9 = (l46) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (l46Var9.W(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    boolean zI9 = l46Var9.i(aw2Var) | l46Var9.i(nb4Var) | l46Var9.i(s7Var);
                    Object objR18 = l46Var9.R();
                    if (zI9 || objR18 == i8cVar) {
                        objR18 = new j8(aw2Var, nb4Var, s7Var, i2);
                        l46Var9.p0(objR18);
                    }
                    j74.n("插入", (x16) objR18, l46Var9, 6);
                } else {
                    l46Var9.Z();
                }
                return wefVar;
            case 23:
                Context context3 = (Context) obj5;
                aw2 aw2Var2 = (aw2) obj4;
                nb4 nb4Var2 = (nb4) obj3;
                l46 l46Var10 = (l46) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (l46Var10.W(1 & iIntValue10, (iIntValue10 & 3) != 2)) {
                    boolean zI10 = l46Var10.i(context3);
                    Object objR19 = l46Var10.R();
                    if (zI10 || objR19 == i8cVar) {
                        objR19 = new u8(context3, i3);
                        l46Var10.p0(objR19);
                    }
                    j74.n("Trigger", (x16) objR19, l46Var10, 6);
                    boolean zI11 = l46Var10.i(aw2Var2) | l46Var10.i(nb4Var2);
                    Object objR20 = l46Var10.R();
                    if (zI11 || objR20 == i8cVar) {
                        objR20 = new q14(aw2Var2, nb4Var2, z ? 1 : 0);
                        l46Var10.p0(objR20);
                    }
                    j74.n("Reset flag", (x16) objR20, l46Var10, 6);
                } else {
                    l46Var10.Z();
                }
                return wefVar;
            case 24:
                final aw2 aw2Var3 = (aw2) obj5;
                final xof xofVar = (xof) obj4;
                final kmd kmdVar = (kmd) obj3;
                l46 l46Var11 = (l46) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (l46Var11.W(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    boolean zI12 = l46Var11.i(aw2Var3) | l46Var11.i(xofVar) | l46Var11.i(kmdVar);
                    Object objR21 = l46Var11.R();
                    if (zI12 || objR21 == i8cVar) {
                        final int i9 = z ? 1 : 0;
                        objR21 = new x16() { // from class: c14
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i10 = i9;
                                wef wefVar2 = wef.a;
                                kmd kmdVar2 = kmdVar;
                                xof xofVar2 = xofVar;
                                aw2 aw2Var4 = aw2Var3;
                                switch (i10) {
                                    case 0:
                                        ynb.V(aw2Var4, null, null, new x54(xofVar2, kmdVar2, null), 3);
                                        break;
                                    default:
                                        ynb.V(aw2Var4, null, null, new z54(xofVar2, kmdVar2, null), 3);
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var11.p0(objR21);
                    }
                    j74.n("Fable", (x16) objR21, l46Var11, 6);
                    boolean zI13 = l46Var11.i(aw2Var3) | l46Var11.i(xofVar) | l46Var11.i(kmdVar);
                    Object objR22 = l46Var11.R();
                    if (zI13 || objR22 == i8cVar) {
                        objR22 = new x16() { // from class: c14
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i10 = i7;
                                wef wefVar2 = wef.a;
                                kmd kmdVar2 = kmdVar;
                                xof xofVar2 = xofVar;
                                aw2 aw2Var4 = aw2Var3;
                                switch (i10) {
                                    case 0:
                                        ynb.V(aw2Var4, null, null, new x54(xofVar2, kmdVar2, null), 3);
                                        break;
                                    default:
                                        ynb.V(aw2Var4, null, null, new z54(xofVar2, kmdVar2, null), 3);
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var11.p0(objR22);
                    }
                    j74.n("Midnight", (x16) objR22, l46Var11, 6);
                    boolean zI14 = l46Var11.i(aw2Var3) | l46Var11.i(xofVar);
                    Object objR23 = l46Var11.R();
                    if (zI14 || objR23 == i8cVar) {
                        objR23 = new jt3(i6, aw2Var3, xofVar);
                        l46Var11.p0(objR23);
                    }
                    j74.n("清除皮肤", (x16) objR23, l46Var11, 6);
                } else {
                    l46Var11.Z();
                }
                return wefVar;
            case 25:
                x16 x16Var5 = (x16) obj3;
                oh4 oh4Var = (oh4) obj5;
                x16 x16Var6 = (x16) obj4;
                l46 l46Var12 = (l46) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (l46Var12.W(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    dd2 dd2VarB0 = af1.b0(-1186972857, new i1(22, oh4Var), l46Var12);
                    dd2 dd2VarB1 = af1.b0(-17444866, new ih4(x16Var6, oh4Var), l46Var12);
                    boolean zG4 = l46Var12.g(x16Var5);
                    Object objR24 = l46Var12.R();
                    if (zG4 || objR24 == i8cVar) {
                        objR24 = new c20(13, x16Var5);
                        l46Var12.p0(objR24);
                    }
                    pa7.d(null, 0L, 0L, null, dd2VarB0, dd2VarB1, false, (x16) objR24, l46Var12, 221184, 79);
                } else {
                    l46Var12.Z();
                }
                return wefVar;
            case 26:
                List list2 = (List) obj5;
                List list3 = (List) obj4;
                x16 x16Var7 = (x16) obj3;
                l46 l46Var13 = (l46) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (l46Var13.W(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    ded.a(null, af1.b0(-1259215738, new j41(list2, list3, x16Var7, i5), l46Var13), l46Var13, 48, 1);
                } else {
                    l46Var13.Z();
                }
                return wefVar;
            case 27:
                ClarifyingCardDrawingRoute clarifyingCardDrawingRoute = (ClarifyingCardDrawingRoute) obj4;
                ka9 ka9Var2 = (ka9) obj3;
                TarotCardChoice tarotCardChoice = (TarotCardChoice) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                tarotCardChoice.getClass();
                if (((r0) obj5).O1(clarifyingCardDrawingRoute.getRequestMessageId(), tarotCardChoice, iIntValue14)) {
                    da9 da9VarC = ka9Var2.c();
                    if (da9VarC != null && (yccVarA = da9VarC.a()) != null) {
                        yccVarA.d("clarifying_card_return_request_id", clarifyingCardDrawingRoute.getRequestMessageId());
                    }
                    ka9Var2.g();
                }
                return wefVar;
            case 28:
                List list4 = (List) obj5;
                e89 e89Var4 = (e89) obj4;
                e89 e89Var5 = (e89) obj3;
                l46 l46Var14 = (l46) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (l46Var14.W(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    boolean zG5 = l46Var14.g(e89Var4) | l46Var14.g(e89Var5);
                    Object objR25 = l46Var14.R();
                    if (zG5 || objR25 == i8cVar) {
                        objR25 = new ur1(e89Var4, e89Var5, i7);
                        l46Var14.p0(objR25);
                    }
                    g21.g(list4, (l26) objR25, l46Var14, 0);
                } else {
                    l46Var14.Z();
                }
                return wefVar;
            default:
                ((Integer) obj2).getClass();
                k99.e((j09) obj5, (wm6) obj4, (x16) obj3, (l46) obj, k99.P(7));
                return wefVar;
        }
    }

    public /* synthetic */ x6(int i, Object obj, Object obj2, Object obj3, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    public /* synthetic */ x6(a26 a26Var, a26 a26Var2, x16 x16Var, int i) {
        this.a = 8;
        this.d = a26Var;
        this.c = a26Var2;
        this.b = x16Var;
    }

    public /* synthetic */ x6(cod codVar, y72 y72Var, a26 a26Var) {
        this.a = 18;
        this.c = codVar;
        this.b = y72Var;
        this.d = a26Var;
    }

    public /* synthetic */ x6(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    public /* synthetic */ x6(Object obj, Object obj2, boolean z, Object obj3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }
}
