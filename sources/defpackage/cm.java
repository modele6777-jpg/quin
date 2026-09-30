package defpackage;

import ai.askquin.data.QuotaBlockReason;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.annual.model.AnnualActionFor;
import ai.askquin.ui.conversation.dialogue.NewReadingState;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.model.DrawCardSaves;
import ai.askquin.ui.draw.navhost.ClarifyingCardDrawingRoute;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.List;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cm implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ cm(j09 j09Var, dd2 dd2Var, dd2 dd2Var2, x16 x16Var, dd2 dd2Var3, int i) {
        this.a = 17;
        this.c = j09Var;
        this.d = dd2Var;
        this.e = dd2Var2;
        this.b = x16Var;
        this.f = dd2Var3;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        sc0 sc0Var = xc0.c;
        ov7 ov7Var = LayoutNode.h1;
        int i2 = 7;
        i8c i8cVar = sf2.a;
        Object obj3 = this.d;
        wef wefVar = wef.a;
        Object obj4 = this.f;
        Object obj5 = this.c;
        Object obj6 = this.e;
        Object obj7 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ym8.a((j09) obj5, (String) obj3, (x16) obj7, (x16) obj6, (x16) obj4, (l46) obj, k99.P(1));
                return wefVar;
            case 1:
                tn4 tn4Var = (tn4) obj5;
                egd egdVar = (egd) obj3;
                rcf rcfVar = (rcf) obj6;
                AnnualActionFor annualActionFor = (AnnualActionFor) obj4;
                x16 x16Var = (x16) obj7;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int iOrdinal = tn4Var.ordinal();
                    if (iOrdinal == 0) {
                        l46Var.f0(-996556040);
                        boolean zI = l46Var.i(rcfVar);
                        Object objR = l46Var.R();
                        if (zI || objR == i8cVar) {
                            objR = new hl(0, rcfVar, rcf.class, "onShuffleComplete", "onShuffleComplete()V", 0, 3);
                            l46Var.p0(objR);
                        }
                        rs0.k(egdVar, (x16) ((ym7) objR), null, false, l46Var, 0, 12);
                        l46Var.r(false);
                    } else if (iOrdinal == 1) {
                        l46Var.f0(-996392608);
                        boolean z2 = !rcfVar.f.isEmpty();
                        boolean zK = rcfVar.k();
                        boolean zI2 = l46Var.i(rcfVar);
                        Object objR2 = l46Var.R();
                        if (zI2 || objR2 == i8cVar) {
                            objR2 = new hl(0, rcfVar, rcf.class, "onPatternDrawClick", "onPatternDrawClick()V", 0, 4);
                            l46Var.p0(objR2);
                        }
                        qn4.b(z2, annualActionFor, zK, (x16) ((ym7) objR2), x16Var, l46Var, 0);
                        l46Var.r(false);
                    } else {
                        if (iOrdinal != 2) {
                            throw tec.d(-1001979060, l46Var, false);
                        }
                        l46Var.f0(-996085956);
                        l46Var.r(false);
                    }
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 2:
                ((Integer) obj2).getClass();
                qn4.a((AnnualActionFor) obj3, (j09) obj5, (rcf) obj6, (egd) obj4, (x16) obj7, (l46) obj, k99.P(513));
                return wefVar;
            case 3:
                x16 x16Var2 = (x16) obj7;
                en0 en0Var = (en0) obj5;
                String str = (String) obj3;
                x16 x16Var3 = (x16) obj6;
                x16 x16Var4 = (x16) obj4;
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    FillElement fillElement = b.c;
                    c92 c92VarA = a92.a(sc0Var, ndb.Y, l46Var2, 0);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, fillElement);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(hj6.z, l46Var2, c92VarA);
                    dec.l(hj6.y, l46Var2, u8aVarM);
                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                    dec.k(l46Var2);
                    dec.l(hj6.x, l46Var2, j09VarJ);
                    pa7.a(null, 0L, 0L, null, tq.b, null, false, false, x16Var2, l46Var2, 24576, 239);
                    if (en0Var.e) {
                        l46Var2.f0(-102085089);
                        hkg.G(en0Var, str, x16Var3, x16Var4, l46Var2, en0.i);
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(-102134534);
                        hkg.K(0, l46Var2);
                        l46Var2.r(false);
                    }
                    l46Var2.r(true);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 4:
                ((Integer) obj2).getClass();
                uq1.m((TarotCardType) obj6, (String) obj3, (TarotSkinIdentify) obj4, (x16) obj7, (j09) obj5, (l46) obj, k99.P(1));
                return wefVar;
            case 5:
                ((Integer) obj2).getClass();
                xj3.h((pl3) obj3, (y72) obj4, (x16) obj7, (x16) obj6, (j09) obj5, (l46) obj, k99.P(1));
                return wefVar;
            case 6:
                ((Integer) obj2).getClass();
                rxg.c((TarotSkinIdentify) obj3, (List) obj7, (jx7) obj6, (l26) obj4, (j09) obj5, (l46) obj, k99.P(1));
                return wefVar;
            case 7:
                x16 x16Var5 = (x16) obj7;
                x16 x16Var6 = (x16) obj6;
                x16 x16Var7 = (x16) obj4;
                a26 a26Var = (a26) obj5;
                ka9 ka9Var = (ka9) obj3;
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    j74.j(x16Var5, l46Var3, 0);
                    j74.B(x16Var6, l46Var3, 0);
                    j74.u(x16Var7, l46Var3, 0);
                    j74.i(a26Var, l46Var3, 0);
                    j74.z(ka9Var, l46Var3, 0);
                    j74.h(null, l46Var3, 0);
                    j74.c0(null, l46Var3, 0);
                    j74.P(ka9Var, null, l46Var3, 0);
                    j74.A(null, l46Var3, 0);
                    j74.f0(null, l46Var3, 0);
                    j74.G(ka9Var, l46Var3, 0);
                    j74.E(ka9Var, l46Var3, 0);
                    j74.e0(ka9Var, l46Var3, 0);
                    j74.D(ka9Var, l46Var3, 0);
                    j74.M(0, l46Var3);
                    j74.O(0, l46Var3);
                    j74.V(0, l46Var3);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case 8:
                String str2 = (String) obj3;
                e89 e89Var = (e89) obj5;
                String str3 = (String) obj7;
                dd2 dd2Var = (dd2) obj6;
                String str4 = (String) obj4;
                l46 l46Var4 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (l46Var4.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    g09 g09Var = g09.a;
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    c92 c92VarA2 = a92.a(sc0Var, ndb.Y, l46Var4, 0);
                    int iHashCode2 = Long.hashCode(l46Var4.T);
                    u8a u8aVarM2 = l46Var4.m();
                    j09 j09VarJ2 = m93.J(l46Var4, j09VarC);
                    lf2.q.getClass();
                    l46Var4.j0();
                    if (l46Var4.S) {
                        l46Var4.l(ov7Var);
                    } else {
                        l46Var4.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var4, c92VarA2);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var4, u8aVarM2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var4, numValueOf);
                    dec.k(l46Var4);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var4, j09VarJ2);
                    j09 j09VarF = b.f(48.0f, 0.0f, b.c(g09Var, 1.0f), 2);
                    i5c i5cVar = new i5c(0);
                    boolean zG = l46Var4.g(e89Var);
                    Object objR3 = l46Var4.R();
                    if (zG || objR3 == i8cVar) {
                        objR3 = new ok3(e89Var, 7);
                        l46Var4.p0(objR3);
                    }
                    j09 j09VarC2 = androidx.compose.foundation.b.c(j09VarF, false, str2, i5cVar, (x16) objR3, 9);
                    boolean zG2 = l46Var4.g(str3);
                    Object objR4 = l46Var4.R();
                    if (zG2 || objR4 == i8cVar) {
                        objR4 = new ia(str3, 15);
                        l46Var4.p0(objR4);
                    }
                    j09 j09VarA0 = ynb.a0(vwc.b(j09VarC2, false, (a26) objR4), 16.0f, 12.0f);
                    t7c t7cVarA = s7c.a(xc0.g, ndb.z, l46Var4, 54);
                    int iHashCode3 = Long.hashCode(l46Var4.T);
                    u8a u8aVarM3 = l46Var4.m();
                    j09 j09VarJ3 = m93.J(l46Var4, j09VarA0);
                    l46Var4.j0();
                    if (l46Var4.S) {
                        l46Var4.l(ov7Var);
                    } else {
                        l46Var4.s0();
                    }
                    dec.l(he2Var, l46Var4, t7cVarA);
                    dec.l(he2Var2, l46Var4, u8aVarM3);
                    ib8.s(iHashCode3, l46Var4, he2Var3, l46Var4);
                    dec.l(he2Var4, l46Var4, j09VarJ3);
                    mue mueVar = ((p9f) l46Var4.k(r9f.a)).i;
                    pr4 pr4Var = o82.a;
                    nte.b(str4, new jw7(1.0f, true), ((m82) l46Var4.k(pr4Var)).a, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVar, l46Var4, 0, 0, 131064);
                    gu6.a(((Boolean) e89Var.getValue()).booleanValue() ? z5c.x() : if9.x(), null, null, ((m82) l46Var4.k(pr4Var)).a, l46Var4, 48, 4);
                    l46Var4.r(true);
                    if (((Boolean) e89Var.getValue()).booleanValue()) {
                        l46Var4.f0(255264944);
                        z = false;
                        dd2Var.z(l46Var4, 0);
                    } else {
                        z = false;
                        l46Var4.f0(-676712677);
                    }
                    l46Var4.r(z);
                    l46Var4.r(true);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            case 9:
                r12 r12Var = (r12) obj5;
                r0 r0Var = (r0) obj3;
                ClarifyingCardDrawingRoute clarifyingCardDrawingRoute = (ClarifyingCardDrawingRoute) obj7;
                ka9 ka9Var2 = (ka9) obj6;
                w12 w12Var = (w12) obj4;
                l46 l46Var5 = (l46) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (l46Var5.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zI3 = l46Var5.i(r0Var) | l46Var5.i(clarifyingCardDrawingRoute) | l46Var5.i(ka9Var2);
                    Object objR5 = l46Var5.R();
                    if (zI3 || objR5 == i8cVar) {
                        objR5 = new x6(r0Var, clarifyingCardDrawingRoute, ka9Var2, 27);
                        l46Var5.p0(objR5);
                    }
                    l26 l26Var = (l26) objR5;
                    boolean zI4 = l46Var5.i(r12Var) | l46Var5.i(w12Var) | l46Var5.i(r0Var) | l46Var5.i(clarifyingCardDrawingRoute) | l46Var5.i(ka9Var2);
                    Object objR6 = l46Var5.R();
                    if (zI4 || objR6 == i8cVar) {
                        m8 m8Var = new m8(r12Var, w12Var, r0Var, clarifyingCardDrawingRoute, ka9Var2, 11);
                        l46Var5.p0(m8Var);
                        objR6 = m8Var;
                    }
                    eb3.a(r12Var, l26Var, (x16) objR6, l46Var5, 8);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                soa soaVar = (soa) obj5;
                r0 r0Var2 = (r0) obj3;
                fo4 fo4Var = (fo4) obj7;
                DrawCardSaves drawCardSaves = (DrawCardSaves) obj6;
                ka9 ka9Var3 = (ka9) obj4;
                l46 l46Var6 = (l46) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (l46Var6.W(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zF0 = r0Var2.f0();
                    String strG = r0Var2.G();
                    boolean z3 = !r0Var2.m0();
                    az1 az1VarC = r0Var2.C();
                    boolean zI5 = l46Var6.i(fo4Var) | l46Var6.i(drawCardSaves);
                    Object objR7 = l46Var6.R();
                    if (zI5 || objR7 == i8cVar) {
                        objR7 = new o14(13, fo4Var, drawCardSaves);
                        l46Var6.p0(objR7);
                    }
                    l26 l26Var2 = (l26) objR7;
                    boolean zI6 = l46Var6.i(ka9Var3);
                    Object objR8 = l46Var6.R();
                    if (zI6 || objR8 == i8cVar) {
                        objR8 = new a40(ka9Var3, 24);
                        l46Var6.p0(objR8);
                    }
                    int i3 = soa.H0;
                    x57.w(soaVar, zF0, strG, z3, az1VarC, l26Var2, (x16) objR8, l46Var6, 8);
                } else {
                    l46Var6.Z();
                }
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((Integer) obj2).getClass();
                abg.h((String) obj3, (NewReadingState) obj6, (QuotaBlockReason) obj4, (x16) obj7, (j09) obj5, (l46) obj, k99.P(1));
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((Integer) obj2).getClass();
                ok8.d((a56) obj5, (a26) obj3, (x16) obj7, (x16) obj6, (x16) obj4, (l46) obj, k99.P(1));
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((Integer) obj2).getClass();
                vd0.u((j09) obj5, (String) obj3, (String) obj6, (String) obj4, (x16) obj7, (l46) obj, k99.P(7));
                return wefVar;
            case 14:
                ((Integer) obj2).getClass();
                b87.b((String) obj3, (String) obj5, (a26) obj4, (x16) obj7, (x16) obj6, (l46) obj, k99.P(1));
                return wefVar;
            case 15:
                ((Integer) obj2).getClass();
                rxg.m((l26) obj5, (l26) obj3, (dd2) obj7, (l26) obj6, (l26) obj4, (l46) obj, k99.P(385));
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((Integer) obj2).getClass();
                kj0.y((String) obj3, (x16) obj7, (x16) obj6, (x16) obj4, (x16) obj5, (l46) obj, k99.P(1));
                return wefVar;
            case 17:
                ((Integer) obj2).getClass();
                oa7.h((j09) obj5, (dd2) obj3, (dd2) obj6, (x16) obj7, (dd2) obj4, (l46) obj, k99.P(25009));
                return wefVar;
            case 18:
                j09 j09Var = (j09) obj5;
                e89 e89Var2 = (e89) obj3;
                dd2 dd2Var2 = (dd2) obj6;
                ev0 ev0Var = (ev0) obj4;
                x16 x16Var8 = (x16) obj7;
                l46 l46Var7 = (l46) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (l46Var7.W(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    Object objR9 = l46Var7.R();
                    if (objR9 == i8cVar) {
                        objR9 = new w77(e89Var2, i2);
                        l46Var7.p0(objR9);
                    }
                    j09 j09VarW = nk8.w(j09Var, (a26) objR9);
                    xn8 xn8VarC = s21.c(ndb.b, true);
                    int iHashCode4 = Long.hashCode(l46Var7.T);
                    u8a u8aVarM4 = l46Var7.m();
                    j09 j09VarJ4 = m93.J(l46Var7, j09VarW);
                    lf2.q.getClass();
                    l46Var7.j0();
                    if (l46Var7.S) {
                        l46Var7.l(ov7Var);
                    } else {
                        l46Var7.s0();
                    }
                    dec.l(hj6.z, l46Var7, xn8VarC);
                    dec.l(hj6.y, l46Var7, u8aVarM4);
                    dec.l(hj6.X, l46Var7, Integer.valueOf(iHashCode4));
                    dec.k(l46Var7);
                    dec.l(hj6.x, l46Var7, j09VarJ4);
                    dd2Var2.z(l46Var7, 0);
                    ev0Var.b(x16Var8, l46Var7, 6);
                    l46Var7.r(true);
                } else {
                    l46Var7.Z();
                }
                return wefVar;
            case 19:
                cb9 cb9Var = (cb9) obj5;
                q7b q7bVar = (q7b) obj7;
                j4a j4aVar = (j4a) obj6;
                tt1 tt1Var = (tt1) obj4;
                l46 l46Var8 = (l46) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (l46Var8.W(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    j09 j09VarO = tm7.o(b.c, ((e8b) l46Var8.k(l8b.a)).a, g21.f);
                    boolean zG3 = l46Var8.g(q7bVar) | l46Var8.i(cb9Var) | l46Var8.i(j4aVar);
                    Object objR10 = l46Var8.R();
                    if (zG3 || objR10 == i8cVar) {
                        objR10 = new bv9(q7bVar, cb9Var, j4aVar, 4);
                        l46Var8.p0(objR10);
                    }
                    an1.g(cb9Var, this.d, j09VarO, null, null, null, null, null, null, (a26) objR10, l46Var8, 0, 2040);
                    vpf.b(tt1Var, l46Var8, 6);
                } else {
                    l46Var8.Z();
                }
                return wefVar;
            case 20:
                ((Integer) obj2).getClass();
                y7h.i((kpb) obj5, (a26) obj3, (x16) obj7, (x16) obj6, (x16) obj4, (l46) obj, k99.P(1));
                return wefVar;
            case 21:
                ((Integer) obj2).getClass();
                t4c.b((l26) obj5, (o26) obj3, (l26) obj7, (o26) obj6, (dd2) obj4, (l46) obj, k99.P(27697));
                return wefVar;
            case 22:
                ((Integer) obj2).getClass();
                jlc.d((List) obj5, (erc) obj6, (String) obj3, (x16) obj7, (a26) obj4, (l46) obj, k99.P(3073));
                return wefVar;
            case 23:
                ((Integer) obj2).getClass();
                vlc.d((zlc) obj3, (ii6) obj6, (x16) obj7, (a26) obj4, (j09) obj5, (l46) obj, k99.P(24577));
                return wefVar;
            case 24:
                ((Integer) obj2).getClass();
                arb.d((pu1) obj5, (a26) obj3, (x16) obj7, (x16) obj6, (x16) obj4, (l46) obj, k99.P(1));
                return wefVar;
            case 25:
                ((Integer) obj2).getClass();
                mxb.d((ma8) obj3, (ma8) obj7, (a26) obj6, (a26) obj4, (j09) obj5, (l46) obj, k99.P(3073));
                return wefVar;
            default:
                ((Integer) obj2).getClass();
                h4g.m((qhe) obj7, (TarotSkinIdentify) obj6, (String) obj3, (j09) obj5, (String) obj4, (l46) obj, k99.P(3073));
                return wefVar;
        }
    }

    public /* synthetic */ cm(pl3 pl3Var, y72 y72Var, x16 x16Var, x16 x16Var2, j09 j09Var, int i) {
        this.a = 5;
        this.d = pl3Var;
        this.f = y72Var;
        this.b = x16Var;
        this.e = x16Var2;
        this.c = j09Var;
    }

    public /* synthetic */ cm(x16 x16Var, en0 en0Var, String str, x16 x16Var2, x16 x16Var3) {
        this.a = 3;
        this.b = x16Var;
        this.c = en0Var;
        this.d = str;
        this.e = x16Var2;
        this.f = x16Var3;
    }

    public /* synthetic */ cm(x16 x16Var, x16 x16Var2, x16 x16Var3, a26 a26Var, ka9 ka9Var) {
        this.a = 7;
        this.b = x16Var;
        this.e = x16Var2;
        this.f = x16Var3;
        this.c = a26Var;
        this.d = ka9Var;
    }

    public /* synthetic */ cm(int i, x16 x16Var, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = x16Var;
    }

    public /* synthetic */ cm(j09 j09Var, String str, String str2, String str3, x16 x16Var, int i) {
        this.a = 13;
        this.c = j09Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.b = x16Var;
    }

    public /* synthetic */ cm(zlc zlcVar, ii6 ii6Var, x16 x16Var, a26 a26Var, j09 j09Var, int i) {
        this.a = 23;
        this.d = zlcVar;
        this.e = ii6Var;
        this.b = x16Var;
        this.f = a26Var;
        this.c = j09Var;
    }

    public /* synthetic */ cm(qhe qheVar, TarotSkinIdentify tarotSkinIdentify, String str, j09 j09Var, String str2, int i) {
        this.a = 26;
        this.b = qheVar;
        this.e = tarotSkinIdentify;
        this.d = str;
        this.c = j09Var;
        this.f = str2;
    }

    public /* synthetic */ cm(AnnualActionFor annualActionFor, j09 j09Var, rcf rcfVar, egd egdVar, x16 x16Var, int i) {
        this.a = 2;
        this.d = annualActionFor;
        this.c = j09Var;
        this.e = rcfVar;
        this.f = egdVar;
        this.b = x16Var;
    }

    public /* synthetic */ cm(Object obj, Object obj2, m26 m26Var, m26 m26Var2, m26 m26Var3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = m26Var;
        this.e = m26Var2;
        this.f = m26Var3;
    }

    public /* synthetic */ cm(Object obj, Object obj2, Object obj3, m26 m26Var, Object obj4, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.f = m26Var;
        this.c = obj4;
    }

    public /* synthetic */ cm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ cm(String str, e89 e89Var, String str2, dd2 dd2Var, String str3) {
        this.a = 8;
        this.d = str;
        this.c = e89Var;
        this.b = str2;
        this.e = dd2Var;
        this.f = str3;
    }

    public /* synthetic */ cm(String str, NewReadingState newReadingState, QuotaBlockReason quotaBlockReason, x16 x16Var, j09 j09Var, int i) {
        this.a = 11;
        this.d = str;
        this.e = newReadingState;
        this.f = quotaBlockReason;
        this.b = x16Var;
        this.c = j09Var;
    }

    public /* synthetic */ cm(String str, String str2, a26 a26Var, x16 x16Var, x16 x16Var2, int i) {
        this.a = 14;
        this.d = str;
        this.c = str2;
        this.f = a26Var;
        this.b = x16Var;
        this.e = x16Var2;
    }

    public /* synthetic */ cm(List list, erc ercVar, String str, x16 x16Var, a26 a26Var, int i) {
        this.a = 22;
        this.c = list;
        this.e = ercVar;
        this.d = str;
        this.b = x16Var;
        this.f = a26Var;
    }

    public /* synthetic */ cm(TarotCardType tarotCardType, String str, TarotSkinIdentify tarotSkinIdentify, x16 x16Var, j09 j09Var, int i) {
        this.a = 4;
        this.e = tarotCardType;
        this.d = str;
        this.f = tarotSkinIdentify;
        this.b = x16Var;
        this.c = j09Var;
    }
}
