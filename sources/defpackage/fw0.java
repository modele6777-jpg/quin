package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fw0 implements l26 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ fw0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        ov7 ov7Var = LayoutNode.h1;
        i8c i8cVar = sf2.a;
        g09 g09Var = g09.a;
        wef wefVar = wef.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Number) obj2).intValue();
                String str = (String) obj4;
                if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zG = l46Var.g(str);
                    Object objR = l46Var.R();
                    if (zG || objR == i8cVar) {
                        objR = new ia(str, 4);
                        l46Var.p0(objR);
                    }
                    j09 j09VarB = vwc.b(g09Var, false, (a26) objR);
                    dd2 dd2Var = (dd2) obj3;
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iW = an1.w(l46Var);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarB);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, xn8VarC);
                    dec.l(hj6.y, l46Var, u8aVarM);
                    he2 he2Var = hj6.X;
                    if (l46Var.S || !pa7.t(l46Var.R(), Integer.valueOf(iW))) {
                        tec.r(iW, l46Var, iW, he2Var);
                    }
                    dec.l(hj6.x, l46Var, j09VarJ);
                    tec.q(0, dd2Var, l46Var, true);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 1:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    j09 j09VarY = ynb.Y(b.a(g09Var, v51.c, v51.d), (xw9) obj4);
                    n26 n26Var = (n26) obj3;
                    t7c t7cVarA = s7c.a(xc0.e, ndb.z, l46Var2, 54);
                    int iW2 = an1.w(l46Var2);
                    u8a u8aVarM2 = l46Var2.m();
                    j09 j09VarJ2 = m93.J(l46Var2, j09VarY);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(hj6.z, l46Var2, t7cVarA);
                    dec.l(hj6.y, l46Var2, u8aVarM2);
                    he2 he2Var2 = hj6.X;
                    if (l46Var2.S || !pa7.t(l46Var2.R(), Integer.valueOf(iW2))) {
                        tec.r(iW2, l46Var2, iW2, he2Var2);
                    }
                    dec.l(hj6.x, l46Var2, j09VarJ2);
                    n26Var.m(v7c.a, l46Var2, 6);
                    l46Var2.r(true);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 2:
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                String str2 = (String) obj3;
                if (l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    String str3 = (String) obj4;
                    boolean zG2 = l46Var3.g(str3) | l46Var3.g(str2);
                    String str4 = (String) obj4;
                    Object objR2 = l46Var3.R();
                    if (zG2 || objR2 == i8cVar) {
                        objR2 = new z53(str4, str2, 1);
                        l46Var3.p0(objR2);
                    }
                    nte.b(str3, vwc.b(g09Var, false, (a26) objR2), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var3, 0, 0, 262140);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case 3:
                l46 l46Var4 = (l46) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                wf3 wf3Var = (wf3) obj4;
                if (l46Var4.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    j09 j09VarY2 = ynb.Y(g09Var, vf3.a);
                    int iA = ((xf3) wf3Var).a();
                    boolean zG3 = l46Var4.g(wf3Var);
                    Object objR3 = l46Var4.R();
                    if (zG3 || objR3 == i8cVar) {
                        objR3 = new cf3(wf3Var, 0);
                        l46Var4.p0(objR3);
                    }
                    vf3.f(j09VarY2, iA, (a26) objR3, (ke3) obj3, l46Var4, 6);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            case 4:
                l46 l46Var5 = (l46) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (l46Var5.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    gu6.a((gx6) obj3, (String) obj4, null, 0L, l46Var5, 0, 12);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
            case 5:
                String str5 = (String) obj4;
                l46 l46Var6 = (l46) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (l46Var6.W(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zG4 = l46Var6.g(str5);
                    Object objR4 = l46Var6.R();
                    if (zG4 || objR4 == i8cVar) {
                        objR4 = new ia(str5, 10);
                        l46Var6.p0(objR4);
                    }
                    nte.b(str5, vwc.b(g09Var, false, (a26) objR4), ((ke3) obj3).f, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var6, 0, 0, 262136);
                } else {
                    l46Var6.Z();
                }
                return wefVar;
            case 6:
                return Boolean.valueOf(pa7.t((bm3) obj, (ca1) obj4) && pa7.t((bm3) obj2, (ca1) obj3));
            case 7:
                l46 l46Var7 = (l46) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && l46Var7.F()) {
                    l46Var7.Z();
                } else {
                    ((p84) obj4).g.m((da9) obj3, l46Var7, 0);
                }
                return wefVar;
            case 8:
                l46 l46Var8 = (l46) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (l46Var8.W(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    rxg.r(((q78) obj4).b, cn1.G0, (dd2) obj3, l46Var8, 48);
                } else {
                    l46Var8.Z();
                }
                return wefVar;
            case 9:
                l46 l46Var9 = (l46) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (l46Var9.W(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    nte.a(((p9f) obj4).j, (dd2) obj3, l46Var9, 0);
                } else {
                    l46Var9.Z();
                }
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                l46 l46Var10 = (l46) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && l46Var10.F()) {
                    l46Var10.Z();
                } else {
                    tq.k((qcc) obj4, (dd2) obj3, l46Var10, 0);
                }
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                l46 l46Var11 = (l46) obj;
                da9 da9Var = (da9) obj4;
                if ((((Number) obj2).intValue() & 3) == 2 && l46Var11.F()) {
                    l46Var11.Z();
                } else {
                    ua9 ua9Var = da9Var.b;
                    ua9Var.getClass();
                    ((re2) ua9Var).f.t((ly) obj3, da9Var, l46Var11, 0);
                }
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                l46 l46Var12 = (l46) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                if (l46Var12.W(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    dd2 dd2Var2 = (dd2) obj3;
                    wdc wdcVar = (wdc) obj4;
                    xn8 xn8VarC2 = s21.c(ndb.b, false);
                    int iW3 = an1.w(l46Var12);
                    u8a u8aVarM3 = l46Var12.m();
                    j09 j09VarJ3 = m93.J(l46Var12, g09Var);
                    lf2.q.getClass();
                    l46Var12.j0();
                    if (l46Var12.S) {
                        l46Var12.l(ov7Var);
                    } else {
                        l46Var12.s0();
                    }
                    dec.l(hj6.z, l46Var12, xn8VarC2);
                    dec.l(hj6.y, l46Var12, u8aVarM3);
                    he2 he2Var3 = hj6.X;
                    if (l46Var12.S || !pa7.t(l46Var12.R(), Integer.valueOf(iW3))) {
                        tec.r(iW3, l46Var12, iW3, he2Var3);
                    }
                    dec.l(hj6.x, l46Var12, j09VarJ3);
                    dd2Var2.m(wdcVar, l46Var12, 6);
                    l46Var12.r(true);
                } else {
                    l46Var12.Z();
                }
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                l46 l46Var13 = (l46) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                if (l46Var13.W(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    fqd fqdVar = (fqd) obj4;
                    fqdVar.getClass();
                    ((dd2) obj3).m(fqdVar, l46Var13, 0);
                } else {
                    l46Var13.Z();
                }
                return wefVar;
            case 14:
                l46 l46Var14 = (l46) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                if (l46Var14.W(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ((dd2) obj3).m((ArrayList) obj4, l46Var14, 0);
                } else {
                    l46Var14.Z();
                }
                return wefVar;
            case 15:
                l46 l46Var15 = (l46) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                if (l46Var15.W(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    ((n26) obj4).m((kpe) obj3, l46Var15, 6);
                } else {
                    l46Var15.Z();
                }
                return wefVar;
            default:
                l46 l46Var16 = (l46) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                if (l46Var16.W(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    e89 e89Var = (e89) obj4;
                    Object objR5 = l46Var16.R();
                    if (objR5 == i8cVar) {
                        objR5 = new w77(e89Var, 17);
                        l46Var16.p0(objR5);
                    }
                    j09 j09VarW = nk8.w(g09Var, (a26) objR5);
                    dd2 dd2Var3 = (dd2) obj3;
                    xn8 xn8VarC3 = s21.c(ndb.b, false);
                    int iW4 = an1.w(l46Var16);
                    u8a u8aVarM4 = l46Var16.m();
                    j09 j09VarJ4 = m93.J(l46Var16, j09VarW);
                    lf2.q.getClass();
                    l46Var16.j0();
                    if (l46Var16.S) {
                        l46Var16.l(ov7Var);
                    } else {
                        l46Var16.s0();
                    }
                    dec.l(hj6.z, l46Var16, xn8VarC3);
                    dec.l(hj6.y, l46Var16, u8aVarM4);
                    he2 he2Var4 = hj6.X;
                    if (l46Var16.S || !pa7.t(l46Var16.R(), Integer.valueOf(iW4))) {
                        tec.r(iW4, l46Var16, iW4, he2Var4);
                    }
                    dec.l(hj6.x, l46Var16, j09VarJ4);
                    tec.q(0, dd2Var3, l46Var16, true);
                } else {
                    l46Var16.Z();
                }
                return wefVar;
        }
    }

    public /* synthetic */ fw0(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
