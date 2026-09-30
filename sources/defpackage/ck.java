package defpackage;

import ai.askquin.R;
import ai.askquin.ui.annual.model.AnnualActionFor;
import ai.askquin.ui.divination.OverviewItem;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ck implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ck(yic yicVar, x16 x16Var, boolean z, x16 x16Var2) {
        this.a = 10;
        this.d = yicVar;
        this.b = x16Var;
        this.c = z;
        this.e = x16Var2;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        l46 l46Var;
        long j;
        int i = this.a;
        g09 g09Var = g09.a;
        ov7 ov7Var = LayoutNode.h1;
        int i2 = 4;
        i8c i8cVar = sf2.a;
        boolean z = this.c;
        wef wefVar = wef.a;
        Object obj4 = this.e;
        Object obj5 = this.b;
        Object obj6 = this.d;
        int i3 = 1;
        switch (i) {
            case 0:
                ik ikVar = (ik) obj6;
                a26 a26Var = (a26) obj5;
                a26 a26Var2 = (a26) obj4;
                xw9 xw9Var = (xw9) obj;
                l46 l46Var2 = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                xw9Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= l46Var2.g(xw9Var) ? 4 : 2;
                }
                if (l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                    bzd.l(null, this.c, 0L, null, null, af1.b0(685094035, new sz7(ikVar, xw9Var, a26Var, a26Var2, 2), l46Var2), l46Var2, 1572864, 61);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 1:
                w10 w10Var = (w10) obj6;
                AnnualActionFor annualActionFor = (AnnualActionFor) obj4;
                a26 a26Var3 = (a26) obj5;
                int i4 = 4;
                xw9 xw9Var2 = (xw9) obj;
                l46 l46Var3 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                xw9Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    if (!l46Var3.g(xw9Var2)) {
                        i4 = 2;
                    }
                    iIntValue2 |= i4;
                }
                if (l46Var3.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    ded.a(null, af1.b0(-1065267833, new cl(w10Var, xw9Var2, annualActionFor, a26Var3, this.c, 1), l46Var3), l46Var3, 48, 1);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case 2:
                xw9 xw9Var3 = (xw9) obj6;
                a26 a26Var4 = (a26) obj5;
                a26 a26Var5 = (a26) obj4;
                sdd sddVar = (sdd) obj;
                int i5 = 4;
                l46 l46Var4 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                sddVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    if (!l46Var4.g(sddVar)) {
                        i5 = 2;
                    }
                    iIntValue3 |= i5;
                }
                if (l46Var4.W(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    FillElement fillElement = b.c;
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int i6 = iIntValue3;
                    int iHashCode = Long.hashCode(l46Var4.T);
                    u8a u8aVarM = l46Var4.m();
                    j09 j09VarJ = m93.J(l46Var4, fillElement);
                    lf2.q.getClass();
                    l46Var4.j0();
                    if (l46Var4.S) {
                        l46Var4.l(ov7Var);
                    } else {
                        l46Var4.s0();
                    }
                    dec.l(hj6.z, l46Var4, xn8VarC);
                    dec.l(hj6.y, l46Var4, u8aVarM);
                    dec.l(hj6.X, l46Var4, Integer.valueOf(iHashCode));
                    dec.k(l46Var4);
                    dec.l(hj6.x, l46Var4, j09VarJ);
                    jgb.l(0, l46Var4);
                    boolean zI = l46Var4.i(a26Var4);
                    Object objR = l46Var4.R();
                    if (zI || objR == i8cVar) {
                        objR = new g33(null, a26Var4);
                        l46Var4.p0(objR);
                    }
                    l26 l26Var = (l26) objR;
                    boolean zG = l46Var4.g(a26Var5);
                    Object objR2 = l46Var4.R();
                    if (zG || objR2 == i8cVar) {
                        objR2 = new k50(a26Var5, 1);
                        l46Var4.p0(objR2);
                    }
                    y8c.d(sddVar, fillElement, xw9Var3, 0.0f, null, l26Var, (l26) objR2, af1.b0(1264884866, new ci1(z, 3), l46Var4), l46Var4, (i6 & 14) | 12582960, 12);
                    l46Var4.r(true);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            case 3:
                he2 he2Var = hj6.x;
                he2 he2Var2 = hj6.X;
                he2 he2Var3 = hj6.y;
                he2 he2Var4 = hj6.z;
                e63 e63Var = (e63) obj6;
                xw9 xw9Var4 = (xw9) obj4;
                a26 a26Var6 = (a26) obj5;
                l46 l46Var5 = (l46) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                lx0 lx0Var = ndb.f;
                ((c31) obj).getClass();
                if (!l46Var5.W(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    l46Var5.Z();
                } else if (pa7.t(e63Var, c63.a)) {
                    l46Var5.f0(-1126350799);
                    j09 j09VarY = ynb.Y(b.c, xw9Var4);
                    xn8 xn8VarC2 = s21.c(lx0Var, false);
                    int iHashCode2 = Long.hashCode(l46Var5.T);
                    u8a u8aVarM2 = l46Var5.m();
                    j09 j09VarJ2 = m93.J(l46Var5, j09VarY);
                    lf2.q.getClass();
                    l46Var5.j0();
                    if (l46Var5.S) {
                        l46Var5.l(ov7Var);
                    } else {
                        l46Var5.s0();
                    }
                    dec.l(he2Var4, l46Var5, xn8VarC2);
                    dec.l(he2Var3, l46Var5, u8aVarM2);
                    ib8.s(iHashCode2, l46Var5, he2Var2, l46Var5);
                    dec.l(he2Var, l46Var5, j09VarJ2);
                    jgb.w(null, 0L, 0.0f, l46Var5, 0);
                    l46Var5.r(true);
                    l46Var5.r(false);
                } else if (e63Var instanceof d63) {
                    l46Var5.f0(-1126061414);
                    rfc.n(false, l46Var5, 0, 3);
                    dj6.j((d63) e63Var, this.c, xw9Var4, a26Var6, l46Var5, 0);
                    l46Var5.r(false);
                } else {
                    if (!(e63Var instanceof b63)) {
                        throw tec.d(1903327882, l46Var5, false);
                    }
                    l46Var5.f0(-1125780306);
                    j09 j09VarY2 = ynb.Y(b.c, xw9Var4);
                    xn8 xn8VarC3 = s21.c(lx0Var, false);
                    int iHashCode3 = Long.hashCode(l46Var5.T);
                    u8a u8aVarM3 = l46Var5.m();
                    j09 j09VarJ3 = m93.J(l46Var5, j09VarY2);
                    lf2.q.getClass();
                    l46Var5.j0();
                    if (l46Var5.S) {
                        l46Var5.l(ov7Var);
                    } else {
                        l46Var5.s0();
                    }
                    dec.l(he2Var4, l46Var5, xn8VarC3);
                    dec.l(he2Var3, l46Var5, u8aVarM3);
                    ib8.s(iHashCode3, l46Var5, he2Var2, l46Var5);
                    dec.l(he2Var, l46Var5, j09VarJ3);
                    Object objR3 = l46Var5.R();
                    if (objR3 == i8cVar) {
                        objR3 = new os2(12);
                        l46Var5.p0(objR3);
                    }
                    cgg.m((x16) objR3, null, false, null, null, null, qn4.c, l46Var5, 805306374, 510);
                    l46Var5.r(true);
                    l46Var5.r(false);
                }
                return wefVar;
            case 4:
                List list = (List) obj6;
                e89 e89Var = (e89) obj5;
                e89 e89Var2 = (e89) obj4;
                d92 d92Var = (d92) obj;
                l46 l46Var6 = (l46) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                d92Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= l46Var6.g(d92Var) ? 4 : 2;
                }
                if (l46Var6.W(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    float f = z ? 16.0f : 8.0f;
                    g09 g09Var2 = g09.a;
                    h7d.h(0, 0, l46Var6, ((e92) d92Var).b(ynb.d0(0.0f, 16.0f, 0.0f, f, 5, g09Var2), ndb.Z));
                    dd2 dd2VarB0 = af1.b0(997198037, new x6(list, e89Var, e89Var2, 28), l46Var6);
                    if (z) {
                        l46Var6.f0(949586338);
                        y6c y6cVarB = a7c.b(40.0f);
                        j09 j09VarC = b.c(g09Var2, 1.0f);
                        pr4 pr4Var = l8b.a;
                        j09 j09VarW = db6.w(tm7.o(j09VarC, ((e8b) l46Var6.k(pr4Var)).a, y6cVarB), 10.0f, ((e8b) l46Var6.k(pr4Var)).A, y6cVarB);
                        xn8 xn8VarC4 = s21.c(ndb.b, false);
                        int iHashCode4 = Long.hashCode(l46Var6.T);
                        u8a u8aVarM4 = l46Var6.m();
                        j09 j09VarJ4 = m93.J(l46Var6, j09VarW);
                        lf2.q.getClass();
                        l46Var6.j0();
                        if (l46Var6.S) {
                            l46Var6.l(ov7Var);
                        } else {
                            l46Var6.s0();
                        }
                        dec.l(hj6.z, l46Var6, xn8VarC4);
                        dec.l(hj6.y, l46Var6, u8aVarM4);
                        dec.l(hj6.X, l46Var6, Integer.valueOf(iHashCode4));
                        dec.k(l46Var6);
                        dec.l(hj6.x, l46Var6, j09VarJ4);
                        dd2VarB0.z(l46Var6, 6);
                        l46Var6.r(true);
                        l46Var6.r(false);
                        l46Var = l46Var6;
                    } else {
                        l46Var6.f0(949866051);
                        h7d.a(b.c(g09Var2, 1.0f), 0.0f, af1.b0(-219956312, new ec(dd2VarB0, 8), l46Var6), l46Var6, 390, 2);
                        l46Var = l46Var6;
                        l46Var.r(false);
                    }
                    j09 j09VarD0 = ynb.d0(0.0f, 16.0f, 0.0f, 20.0f, 5, b.c(g09Var2, 1.0f));
                    if (z) {
                        l46Var.f0(-1354822988);
                        j = ((e8b) l46Var.k(l8b.a)).q;
                    } else {
                        l46Var.f0(-1354822116);
                        j = ((e8b) l46Var.k(l8b.a)).w;
                    }
                    l46Var.r(false);
                    h7d.g(j09VarD0, j, R.string.share_footer_long_press_qr, "draw_result", 0.0f, l46Var, 3078, 16);
                } else {
                    l46Var6.Z();
                }
                return wefVar;
            case 5:
                List list2 = (List) obj6;
                a26 a26Var7 = (a26) obj5;
                x16 x16Var = (x16) obj4;
                l46 l46Var7 = (l46) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (l46Var7.W(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    db6.i(0, x16Var, a26Var7, l46Var7, null, list2, this.c);
                } else {
                    l46Var7.Z();
                }
                return wefVar;
            case 6:
                wf3 wf3Var = (wf3) obj6;
                a26 a26Var8 = (a26) obj5;
                e89 e89Var3 = (e89) obj4;
                l46 l46Var8 = (l46) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (l46Var8.W(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    j09 j09VarF = b.f(56.0f, 0.0f, mh3.N(ynb.d0(0.0f, 0.0f, 0.0f, 16.0f, 7, ynb.b0(32.0f, 0.0f, b.c(g09Var, 1.0f), 2))), 2);
                    String strQ = afc.q(R.string.text_next_step, l46Var8);
                    boolean z2 = (z || ((Boolean) e89Var3.getValue()).booleanValue() || ((xf3) wf3Var).b() == null) ? false : true;
                    boolean zG2 = l46Var8.g(wf3Var) | l46Var8.g(a26Var8);
                    Object objR4 = l46Var8.R();
                    if (zG2 || objR4 == i8cVar) {
                        objR4 = new z7(wf3Var, a26Var8, i3);
                        l46Var8.p0(objR4);
                    }
                    c8b.i(j09VarF, strQ, null, null, 0L, 0.0f, z2, null, null, false, null, null, (x16) objR4, l46Var8, 0, 0, 4028);
                } else {
                    l46Var8.Z();
                }
                return wefVar;
            case 7:
                bx9 bx9Var = (bx9) obj6;
                OverviewItem.ServerMessageItem serverMessageItem = (OverviewItem.ServerMessageItem) obj4;
                a26 a26Var9 = (a26) obj5;
                l46 l46Var9 = (l46) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (l46Var9.W(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    jgb.C(null, this.c, bx9Var, af1.b0(-220971978, new s19(5, serverMessageItem, a26Var9), l46Var9), l46Var9, 3072, 1);
                } else {
                    l46Var9.Z();
                }
                return wefVar;
            case 8:
                x16 x16Var2 = (x16) obj6;
                upc upcVar = (upc) obj5;
                x16 x16Var3 = (x16) obj4;
                l46 l46Var10 = (l46) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (l46Var10.W(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    xdc.a(null, af1.b0(-1566964802, new fkc(i3, x16Var2), l46Var10), null, null, null, 0, y72.j, 0L, null, af1.b0(1441206153, new sg(upcVar, x16Var3, z, 7), l46Var10), l46Var10, 806879280, 445);
                } else {
                    l46Var10.Z();
                }
                return wefVar;
            case 9:
                SolarTerm solarTerm = (SolarTerm) obj6;
                fpc fpcVar = (fpc) obj5;
                e89 e89Var4 = (e89) obj4;
                l46 l46Var11 = (l46) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var11.W(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    boolean zH = l46Var11.h(z) | l46Var11.e(solarTerm.ordinal());
                    Object objR5 = l46Var11.R();
                    if (zH || objR5 == i8cVar) {
                        objR5 = new kt5(z, solarTerm, e89Var4, 1);
                        l46Var11.p0(objR5);
                    }
                    bm8.h((x16) objR5, null, fpcVar != null, null, null, y7h.g, l46Var11, 1572864, 58);
                } else {
                    l46Var11.Z();
                }
                return wefVar;
            default:
                yic yicVar = (yic) obj6;
                x16 x16Var4 = (x16) obj5;
                x16 x16Var5 = (x16) obj4;
                l46 l46Var12 = (l46) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (l46Var12.W(1 & iIntValue11, (iIntValue11 & 17) != 16)) {
                    l46Var12.f0(-709164554);
                    c4d c4dVar = c4d.e;
                    boolean zI2 = l46Var12.i(yicVar) | l46Var12.g(x16Var4);
                    Object objR6 = l46Var12.R();
                    if (zI2 || objR6 == i8cVar) {
                        objR6 = new ykc(i2, x16Var4, yicVar);
                        l46Var12.p0(objR6);
                    }
                    b4d.f(null, c4dVar, null, null, (x16) objR6, l46Var12, 48, 29);
                    jgb.t(0, 0, l46Var12, ynb.b0(we6.e(l46Var12) ? 0.0f : 24.0f, 0.0f, g09Var, 2));
                    l46Var12.r(false);
                    if (z) {
                        l46Var12.f0(-708653209);
                        c4d c4dVar2 = c4d.d;
                        boolean zG3 = l46Var12.g(x16Var5);
                        Object objR7 = l46Var12.R();
                        if (zG3 || objR7 == i8cVar) {
                            objR7 = new yca(10, x16Var5);
                            l46Var12.p0(objR7);
                        }
                        b4d.f(null, c4dVar2, null, null, (x16) objR7, l46Var12, 48, 29);
                        jgb.t(0, 0, l46Var12, ynb.b0(we6.e(l46Var12) ? 0.0f : 24.0f, 0.0f, g09Var, 2));
                        l46Var12.r(false);
                    } else {
                        l46Var12.f0(-708296678);
                        l46Var12.r(false);
                    }
                } else {
                    l46Var12.Z();
                }
                return wefVar;
        }
    }

    public /* synthetic */ ck(e63 e63Var, xw9 xw9Var, boolean z, a26 a26Var) {
        this.a = 3;
        this.d = e63Var;
        this.e = xw9Var;
        this.c = z;
        this.b = a26Var;
    }

    public /* synthetic */ ck(w10 w10Var, AnnualActionFor annualActionFor, a26 a26Var, boolean z) {
        this.a = 1;
        this.d = w10Var;
        this.e = annualActionFor;
        this.b = a26Var;
        this.c = z;
    }

    public /* synthetic */ ck(Object obj, Object obj2, m26 m26Var, boolean z, int i) {
        this.a = i;
        this.d = obj;
        this.b = obj2;
        this.e = m26Var;
        this.c = z;
    }

    public /* synthetic */ ck(List list, boolean z, a26 a26Var, x16 x16Var) {
        this.a = 5;
        this.d = list;
        this.c = z;
        this.b = a26Var;
        this.e = x16Var;
    }

    public /* synthetic */ ck(boolean z, bx9 bx9Var, OverviewItem.ServerMessageItem serverMessageItem, a26 a26Var) {
        this.a = 7;
        this.c = z;
        this.d = bx9Var;
        this.e = serverMessageItem;
        this.b = a26Var;
    }

    public /* synthetic */ ck(boolean z, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = z;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
    }
}
