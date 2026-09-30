package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.time.YearMonth;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tech.chatmind.api.events.model.PopupAction;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n53 implements n26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ n53(jx jxVar, jx jxVar2, qhe qheVar, TarotSkinIdentify tarotSkinIdentify, u3b u3bVar, h0e h0eVar, h0e h0eVar2, h0e h0eVar3) {
        this.e = jxVar;
        this.b = jxVar2;
        this.f = qheVar;
        this.g = tarotSkinIdentify;
        this.v = u3bVar;
        this.w = h0eVar;
        this.d = h0eVar2;
        this.c = h0eVar3;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        e89 e89Var;
        i8c i8cVar;
        final e89 e89Var2;
        final aw2 aw2Var;
        final a26 a26Var;
        z67 z67Var;
        final char c;
        int i;
        z67 z67Var2;
        a26 a26Var2;
        float f;
        float f2;
        l46 l46Var;
        float f3;
        int i2 = this.a;
        g09 g09Var = g09.a;
        wef wefVar = wef.a;
        i8c i8cVar2 = sf2.a;
        Object obj4 = this.c;
        Object obj5 = this.d;
        Object obj6 = this.w;
        Object obj7 = this.v;
        Object obj8 = this.g;
        Object obj9 = this.f;
        int i3 = 1;
        Object obj10 = this.b;
        Object obj11 = this.e;
        switch (i2) {
            case 0:
                he2 he2Var = hj6.x;
                he2 he2Var2 = hj6.X;
                he2 he2Var3 = hj6.y;
                he2 he2Var4 = hj6.z;
                e63 e63Var = (e63) obj11;
                a26 a26Var3 = (a26) obj10;
                l26 l26Var = (l26) obj7;
                a26 a26Var4 = (a26) obj9;
                a26 a26Var5 = (a26) obj8;
                y72 y72Var = (y72) obj6;
                e89 e89Var3 = (e89) obj5;
                x16 x16Var = (x16) obj4;
                xw9 xw9Var = (xw9) obj;
                l46 l46Var2 = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                lx0 lx0Var = ndb.f;
                xw9Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= l46Var2.g(xw9Var) ? 4 : 2;
                }
                if (l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean zT = pa7.t(e63Var, c63.a);
                    ov7 ov7Var = LayoutNode.h1;
                    if (zT) {
                        l46Var2.f0(411871018);
                        j09 j09VarY = ynb.Y(b.c, xw9Var);
                        xn8 xn8VarC = s21.c(lx0Var, false);
                        int iHashCode = Long.hashCode(l46Var2.T);
                        u8a u8aVarM = l46Var2.m();
                        j09 j09VarJ = m93.J(l46Var2, j09VarY);
                        lf2.q.getClass();
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(he2Var4, l46Var2, xn8VarC);
                        dec.l(he2Var3, l46Var2, u8aVarM);
                        ib8.s(iHashCode, l46Var2, he2Var2, l46Var2);
                        dec.l(he2Var, l46Var2, j09VarJ);
                        jgb.w(null, 0L, 0.0f, l46Var2, 0);
                        l46Var2.r(true);
                        l46Var2.r(false);
                    } else if (e63Var instanceof b63) {
                        l46Var2.f0(411878414);
                        j09 j09VarY2 = ynb.Y(b.c, xw9Var);
                        xn8 xn8VarC2 = s21.c(lx0Var, false);
                        int iHashCode2 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM2 = l46Var2.m();
                        j09 j09VarJ2 = m93.J(l46Var2, j09VarY2);
                        lf2.q.getClass();
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(he2Var4, l46Var2, xn8VarC2);
                        dec.l(he2Var3, l46Var2, u8aVarM2);
                        ib8.s(iHashCode2, l46Var2, he2Var2, l46Var2);
                        dec.l(he2Var, l46Var2, j09VarJ2);
                        cgg.m(x16Var, null, false, null, null, null, n16.b, l46Var2, 805306368, 510);
                        l46Var2.r(true);
                        l46Var2.r(false);
                    } else {
                        if (!(e63Var instanceof d63)) {
                            throw tec.d(411870180, l46Var2, false);
                        }
                        l46Var2.f0(411888059);
                        d63 d63Var = (d63) e63Var;
                        boolean zG = l46Var2.g(e89Var3);
                        Object objR = l46Var2.R();
                        if (zG || objR == i8cVar2) {
                            objR = new pg(e89Var3, 21);
                            l46Var2.p0(objR);
                        }
                        x57.q(d63Var, xw9Var, a26Var3, l26Var, a26Var4, a26Var5, y72Var, (a26) objR, l46Var2, (iIntValue << 3) & 112);
                        l46Var2.r(false);
                    }
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 1:
                aw2 aw2Var2 = (aw2) obj11;
                sdd sddVar = (sdd) obj9;
                a26 a26Var6 = (a26) obj10;
                String str = (String) obj8;
                x16 x16Var2 = (x16) obj4;
                e89 e89Var4 = (e89) obj5;
                e89 e89Var5 = (e89) obj7;
                e89 e89Var6 = (e89) obj6;
                l46 l46Var3 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((oz) obj).getClass();
                if (l46Var3.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Z, l46Var3, 54);
                    int iHashCode3 = Long.hashCode(l46Var3.T);
                    u8a u8aVarM3 = l46Var3.m();
                    j09 j09VarJ3 = m93.J(l46Var3, j09VarC);
                    lf2.q.getClass();
                    l46Var3.j0();
                    if (l46Var3.S) {
                        l46Var3.l(LayoutNode.h1);
                    } else {
                        l46Var3.s0();
                    }
                    dec.l(hj6.z, l46Var3, c92VarA);
                    dec.l(hj6.y, l46Var3, u8aVarM3);
                    dec.l(hj6.X, l46Var3, Integer.valueOf(iHashCode3));
                    dec.k(l46Var3);
                    dec.l(hj6.x, l46Var3, j09VarJ3);
                    boolean z = !((Boolean) e89Var4.getValue()).booleanValue();
                    String strQ = afc.q(R.string.draw_turn_over, l46Var3);
                    boolean zI = l46Var3.i(aw2Var2) | l46Var3.g(sddVar) | l46Var3.i(a26Var6) | l46Var3.g(str);
                    Object objR2 = l46Var3.R();
                    if (zI || objR2 == i8cVar2) {
                        zr2 zr2Var = new zr2(aw2Var2, sddVar, e89Var4, a26Var6, e89Var5, e89Var6, str);
                        l46Var3.p0(zr2Var);
                        objR2 = zr2Var;
                    }
                    ym8.h(null, z, strQ, false, (x16) objR2, l46Var3, 0, 9);
                    j09 j09VarD = b.d(b.c(b.q(0.0f, 380.0f, g09Var, 1), 1.0f), 56.0f);
                    boolean z2 = !((Boolean) e89Var4.getValue()).booleanValue();
                    bx9 bx9Var = v51.a;
                    cgg.m(x16Var2, j09VarD, z2, null, v51.h(((e8b) l46Var3.k(l8b.a)).q, l46Var3), null, bm8.a, l46Var3, 805306416, 488);
                    l46Var3.r(true);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case 2:
                final ted tedVar = (ted) obj11;
                a26 a26Var7 = (a26) obj10;
                String str2 = (String) obj9;
                e89 e89Var7 = (e89) obj5;
                String str3 = (String) obj8;
                String str4 = (String) obj7;
                String str5 = (String) obj6;
                List<PopupAction> list = (List) obj4;
                l46 l46Var4 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (l46Var4.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    Object objR3 = l46Var4.R();
                    if (objR3 == i8cVar2) {
                        objR3 = kv2.f(0, l46Var4);
                    }
                    s69 s69Var = (s69) objR3;
                    sw3 sw3Var = (sw3) l46Var4.k(zg2.h);
                    sz9 sz9Var = (sz9) s69Var;
                    boolean zE = l46Var4.e(sz9Var.j());
                    Object objR4 = l46Var4.R();
                    if (zE || objR4 == i8cVar2) {
                        objR4 = new yi4(sz9Var.j() / sw3Var.getDensity());
                        l46Var4.p0(objR4);
                    }
                    float f4 = ((yi4) objR4).a;
                    Object objR5 = l46Var4.R();
                    if (objR5 == i8cVar2) {
                        objR5 = af1.E(l46Var4);
                        l46Var4.p0(objR5);
                    }
                    aw2 aw2Var3 = (aw2) objR5;
                    j09 j09VarO = tm7.o(ynb.Z(b.r(b.c(g09Var, 1.0f)), 16.0f), ((m82) l46Var4.k(o82.a)).n, a7c.b(16.0f));
                    xn8 xn8VarC3 = s21.c(ndb.b, false);
                    int iHashCode4 = Long.hashCode(l46Var4.T);
                    u8a u8aVarM4 = l46Var4.m();
                    j09 j09VarJ4 = m93.J(l46Var4, j09VarO);
                    lf2.q.getClass();
                    l46Var4.j0();
                    boolean z3 = l46Var4.S;
                    ov7 ov7Var2 = LayoutNode.h1;
                    if (z3) {
                        l46Var4.l(ov7Var2);
                    } else {
                        l46Var4.s0();
                    }
                    he2 he2Var5 = hj6.z;
                    dec.l(he2Var5, l46Var4, xn8VarC3);
                    he2 he2Var6 = hj6.y;
                    dec.l(he2Var6, l46Var4, u8aVarM4);
                    Integer numValueOf = Integer.valueOf(iHashCode4);
                    he2 he2Var7 = hj6.X;
                    dec.l(he2Var7, l46Var4, numValueOf);
                    dec.k(l46Var4);
                    he2 he2Var8 = hj6.x;
                    dec.l(he2Var8, l46Var4, j09VarJ4);
                    j09 j09VarD0 = ynb.d0(0.0f, 9.0f, 9.0f, 0.0f, 9, d31.a.a(g09Var, ndb.d));
                    boolean zI2 = l46Var4.i(aw2Var3) | l46Var4.g(tedVar) | l46Var4.g(a26Var7);
                    Object objR6 = l46Var4.R();
                    if (zI2 || objR6 == i8cVar2) {
                        e89Var = e89Var7;
                        objR6 = new jr(a26Var7, aw2Var3, tedVar, e89Var, 20);
                        l46Var4.p0(objR6);
                    } else {
                        e89Var = e89Var7;
                    }
                    c8b.h(j09VarD0, false, 0L, 0L, null, (x16) objR6, l46Var4, 0, 30);
                    gdc.a(str2, null, oa7.E(b.d(g09Var, f4), a7c.b(16.0f)), an2.g, null, l46Var4, 1572912, 1976);
                    j09 j09VarB0 = ynb.b0(32.0f, 0.0f, g09Var, 2);
                    Object objR7 = l46Var4.R();
                    if (objR7 == i8cVar2) {
                        objR7 = new pr1(s69Var, 7);
                        l46Var4.p0(objR7);
                    }
                    j09 j09VarB1 = ynb.b0(0.0f, 12.0f, ym8.D(j09VarB0, (a26) objR7), 1);
                    i8c i8cVar3 = i8cVar2;
                    c92 c92VarA2 = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Z, l46Var4, 54);
                    int iHashCode5 = Long.hashCode(l46Var4.T);
                    u8a u8aVarM5 = l46Var4.m();
                    j09 j09VarJ5 = m93.J(l46Var4, j09VarB1);
                    l46Var4.j0();
                    if (l46Var4.S) {
                        l46Var4.l(ov7Var2);
                    } else {
                        l46Var4.s0();
                    }
                    dec.l(he2Var5, l46Var4, c92VarA2);
                    dec.l(he2Var6, l46Var4, u8aVarM5);
                    ib8.s(iHashCode5, l46Var4, he2Var7, l46Var4);
                    dec.l(he2Var8, l46Var4, j09VarJ5);
                    gdc.a(str3, null, b.l(g09Var, 128.0f), null, null, l46Var4, 432, 2040);
                    pr4 pr4Var = r9f.a;
                    nte.b(str4, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var4.k(pr4Var)).f, l46Var4, 0, 0, 131070);
                    nte.b(str5, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var4.k(pr4Var)).j, l46Var4, 0, 0, 131070);
                    l46Var4.f0(-1543462228);
                    for (final PopupAction popupAction : list) {
                        if (e39.a[popupAction.getType().ordinal()] == 1) {
                            l46Var4.f0(1228749744);
                            j09 j09VarC2 = b.c(g09Var, 1.0f);
                            boolean zI3 = l46Var4.i(aw2Var3) | l46Var4.g(tedVar) | l46Var4.g(a26Var7) | l46Var4.i(popupAction);
                            Object objR8 = l46Var4.R();
                            i8cVar = i8cVar3;
                            if (zI3 || objR8 == i8cVar) {
                                final int i4 = 0;
                                final aw2 aw2Var4 = aw2Var3;
                                final a26 a26Var8 = a26Var7;
                                e89Var2 = e89Var;
                                objR8 = new x16() { // from class: a39
                                    @Override // defpackage.x16
                                    public final Object invoke() {
                                        int i5 = i4;
                                        wef wefVar2 = wef.a;
                                        e89 e89Var8 = e89Var2;
                                        ted tedVar2 = tedVar;
                                        aw2 aw2Var5 = aw2Var4;
                                        PopupAction popupAction2 = popupAction;
                                        a26 a26Var9 = a26Var8;
                                        switch (i5) {
                                            case 0:
                                                ynb.V(aw2Var5, null, null, new c39(tedVar2, e89Var8, null), 3);
                                                a26Var9.d(popupAction2.getType());
                                                break;
                                            default:
                                                ynb.V(aw2Var5, null, null, new c39(tedVar2, e89Var8, null), 3);
                                                a26Var9.d(popupAction2.getType());
                                                break;
                                        }
                                        return wefVar2;
                                    }
                                };
                                l46Var4.p0(objR8);
                            } else {
                                e89Var2 = e89Var;
                            }
                            cgg.m((x16) objR8, j09VarC2, false, null, null, null, af1.b0(-778260282, new b39(popupAction, 0), l46Var4), l46Var4, 805306416, 508);
                            l46Var4.r(false);
                            aw2Var = aw2Var3;
                            a26Var = a26Var7;
                        } else {
                            i8cVar = i8cVar3;
                            e89Var2 = e89Var;
                            l46Var4.f0(1229078747);
                            j09 j09VarB = b.b(0.0f, 56.0f, b.c(g09Var, 1.0f), 1);
                            String strU = z5c.u(popupAction.getText());
                            boolean zI4 = l46Var4.i(aw2Var3) | l46Var4.g(tedVar) | l46Var4.g(a26Var7) | l46Var4.i(popupAction);
                            Object objR9 = l46Var4.R();
                            if (zI4 || objR9 == i8cVar) {
                                final int i5 = 1;
                                aw2Var = aw2Var3;
                                a26Var = a26Var7;
                                objR9 = new x16() { // from class: a39
                                    @Override // defpackage.x16
                                    public final Object invoke() {
                                        int i6 = i5;
                                        wef wefVar2 = wef.a;
                                        e89 e89Var8 = e89Var2;
                                        ted tedVar2 = tedVar;
                                        aw2 aw2Var5 = aw2Var;
                                        PopupAction popupAction2 = popupAction;
                                        a26 a26Var9 = a26Var;
                                        switch (i6) {
                                            case 0:
                                                ynb.V(aw2Var5, null, null, new c39(tedVar2, e89Var8, null), 3);
                                                a26Var9.d(popupAction2.getType());
                                                break;
                                            default:
                                                ynb.V(aw2Var5, null, null, new c39(tedVar2, e89Var8, null), 3);
                                                a26Var9.d(popupAction2.getType());
                                                break;
                                        }
                                        return wefVar2;
                                    }
                                };
                                l46Var4.p0(objR9);
                            } else {
                                aw2Var = aw2Var3;
                                a26Var = a26Var7;
                            }
                            c8b.i(j09VarB, strU, null, null, 0L, 0.0f, false, null, null, false, null, null, (x16) objR9, l46Var4, 6, 0, 4092);
                            l46Var4.r(false);
                        }
                        i8cVar3 = i8cVar;
                        a26Var7 = a26Var;
                        aw2Var3 = aw2Var;
                        e89Var = e89Var2;
                    }
                    tec.s(l46Var4, false, true, true);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            case 3:
                List list2 = (List) obj11;
                final ma8 ma8Var = (ma8) obj8;
                final ma8 ma8Var2 = (ma8) obj7;
                final a26 a26Var9 = (a26) obj10;
                final String[] strArr = (String[]) obj6;
                final Map map = (Map) obj5;
                final a26 a26Var10 = (a26) obj9;
                final lsd lsdVar = (lsd) obj4;
                u7c u7cVar = (u7c) obj;
                l46 l46Var5 = (l46) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                u7cVar.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= l46Var5.g(u7cVar) ? 4 : 2;
                }
                if (!l46Var5.W(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    l46Var5.Z();
                    return wefVar;
                }
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    final char cCharValue = ((Character) it.next()).charValue();
                    if (cCharValue == 'M') {
                        int i6 = i3;
                        z67Var = new z67(i6, ma8Var2.j() == ma8Var.j() ? ok8.x(ma8Var.g()) : 12, i6);
                    } else if (cCharValue != 'y') {
                        int i7 = i3;
                        z67Var = new z67(i7, (ma8Var2.j() == ma8Var.j() && ma8Var2.g() == ma8Var.g()) ? ma8Var.c() : YearMonth.of(ma8Var2.j(), ok8.x(ma8Var2.g())).lengthOfMonth(), i7);
                    } else {
                        z67Var = new z67(1900, ma8Var.j(), i3);
                    }
                    int iC = cCharValue != 'M' ? cCharValue != 'y' ? ma8Var2.c() : ma8Var2.j() : ok8.x(ma8Var2.g());
                    boolean zG2 = l46Var5.g(a26Var9) | l46Var5.c(cCharValue) | l46Var5.i(ma8Var2) | l46Var5.i(ma8Var);
                    Object objR10 = l46Var5.R();
                    if (zG2 || objR10 == i8cVar2) {
                        objR10 = new a26() { // from class: j3g
                            @Override // defpackage.a26
                            public final Object d(Object obj12) {
                                int iIntValue5 = ((Integer) obj12).intValue();
                                char c2 = cCharValue;
                                ma8 ma8Var3 = ma8Var2;
                                int iJ = c2 == 'y' ? iIntValue5 : ma8Var3.j();
                                int iX = c2 == 'M' ? iIntValue5 : ok8.x(ma8Var3.g());
                                if (c2 != 'd') {
                                    iIntValue5 = ma8Var3.c();
                                }
                                int iLengthOfMonth = YearMonth.of(iJ, iX).lengthOfMonth();
                                if (iIntValue5 > iLengthOfMonth) {
                                    iIntValue5 = iLengthOfMonth;
                                }
                                ma8 ma8Var4 = new ma8(iJ, iX, iIntValue5);
                                ma8 ma8Var5 = ma8Var;
                                if (ma8Var4.compareTo(ma8Var5) > 0) {
                                    ma8Var4 = ma8Var5;
                                }
                                a26Var9.d(ma8Var4);
                                return wef.a;
                            }
                        };
                        l46Var5.p0(objR10);
                    }
                    final a26 a26Var11 = (a26) objR10;
                    String[] strArr2 = cCharValue == 'M' ? strArr : null;
                    mue mueVar = pue.a;
                    mue mueVarA = mue.a(pue.c(l46Var5), 0L, w6c.l(22), null, null, 0L, null, 0, w6c.l(28), null, null, 16646141);
                    ma8 ma8Var3 = ma8Var;
                    String[] strArr3 = strArr2;
                    u7c u7cVar2 = u7cVar;
                    a26 a26Var12 = a26Var9;
                    j09 j09VarA = androidx.compose.ui.platform.b.a(ynb.b0(4.0f, 0.0f, u7cVar.a(g09Var, cCharValue == 'M' ? 1.8f : 1.0f, true), 2), "birthday-wheel-" + cCharValue);
                    boolean zI5 = l46Var5.i(map) | l46Var5.c(cCharValue) | l46Var5.i(strArr) | l46Var5.e(iC) | l46Var5.i(z67Var) | l46Var5.g(a26Var11);
                    Object objR11 = l46Var5.R();
                    if (zI5 || objR11 == i8cVar2) {
                        final int i8 = iC;
                        final z67 z67Var3 = z67Var;
                        objR11 = new a26() { // from class: k3g
                            @Override // defpackage.a26
                            public final Object d(Object obj12) {
                                String strValueOf;
                                hxc hxcVar = (hxc) obj12;
                                hxcVar.getClass();
                                char c2 = cCharValue;
                                Object objB = bm8.B(map, Character.valueOf(c2));
                                objB.getClass();
                                exc.f(hxcVar, (String) objB);
                                int i9 = i8;
                                if (c2 == 'M') {
                                    strValueOf = strArr[i9 - 1];
                                    strValueOf.getClass();
                                } else {
                                    strValueOf = String.valueOf(i9);
                                }
                                gxc gxcVar = cxc.b;
                                wn7 wn7Var = exc.a[0];
                                gxcVar.getClass();
                                hxcVar.c(gxcVar, strValueOf);
                                float f5 = i9;
                                z67 z67Var4 = z67Var3;
                                b62 b62Var = new b62(z67Var4.a, z67Var4.b);
                                int iP0 = s72.p0(z67Var4) - 2;
                                exc.l(hxcVar, new rwa(f5, iP0 >= 0 ? iP0 : 0, b62Var));
                                hxcVar.c(swc.i, new f6(null, new p0g(a26Var11, z67Var4)));
                                return wef.a;
                            }
                        };
                        c = cCharValue;
                        i = i8;
                        z67Var2 = z67Var3;
                        a26Var2 = a26Var11;
                        l46Var5.p0(objR11);
                    } else {
                        i = iC;
                        c = cCharValue;
                        z67Var2 = z67Var;
                        a26Var2 = a26Var11;
                    }
                    j09 j09VarB2 = vwc.b(j09VarA, false, (a26) objR11);
                    boolean zC = l46Var5.c(c) | l46Var5.g(a26Var10);
                    Object objR12 = l46Var5.R();
                    if (zC || objR12 == i8cVar2) {
                        objR12 = new a26() { // from class: l3g
                            @Override // defpackage.a26
                            public final Object d(Object obj12) {
                                Boolean bool = (Boolean) obj12;
                                bool.getClass();
                                Character chValueOf = Character.valueOf(c);
                                lsd lsdVar2 = lsdVar;
                                lsdVar2.put(chValueOf, bool);
                                rrd rrdVar = lsdVar2.d;
                                boolean z4 = false;
                                if (!rrdVar.a.isEmpty()) {
                                    Iterator it2 = rrdVar.iterator();
                                    while (((b1e) it2).hasNext()) {
                                        if (((Boolean) ((b1e) it2).next()).booleanValue()) {
                                            z4 = true;
                                            break;
                                        }
                                    }
                                }
                                a26Var10.d(Boolean.valueOf(z4));
                                return wef.a;
                            }
                        };
                        l46Var5.p0(objR12);
                    }
                    xxb.k(i, z67Var2, a26Var2, j09VarB2, strArr3, null, 35.0f, 0, 213.0f, mueVarA, (a26) objR12, l46Var5, 102236160, 160);
                    ma8Var = ma8Var3;
                    it = it;
                    u7cVar = u7cVar2;
                    wefVar = wefVar;
                    a26Var9 = a26Var12;
                    i3 = 1;
                }
                return wefVar;
            default:
                jx jxVar = (jx) obj11;
                jx jxVar2 = (jx) obj10;
                qhe qheVar = (qhe) obj9;
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj8;
                u3b u3bVar = (u3b) obj7;
                h0e h0eVar = (h0e) obj6;
                h0e h0eVar2 = (h0e) obj5;
                h0e h0eVar3 = (h0e) obj4;
                e31 e31Var = (e31) obj;
                l46 l46Var6 = (l46) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                e31Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= l46Var6.g(e31Var) ? 4 : 2;
                }
                if (l46Var6.W(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    float fD = e31Var.d();
                    float fC = e31Var.c();
                    float f5 = fD / 338.0f;
                    float fFloatValue = ((Number) jxVar.e()).floatValue();
                    float f6 = 1.0f - fFloatValue;
                    s21.a(tm7.n(e31Var.b(g09Var), new b68(t72.I(new y72(abg.R(h4g.c, ((y72) h0eVar.getValue()).a, fFloatValue)), new y72(abg.R(h4g.d, ((y72) h0eVar2.getValue()).a, fFloatValue))), null, 0L, 9187343241974906880L), null, 6), l46Var6, 0);
                    float fFloatValue2 = 1.0f - (((Number) jxVar2.e()).floatValue() * 1.6f);
                    if (fFloatValue2 < 0.0f) {
                        fFloatValue2 = 0.0f;
                    }
                    float f7 = fFloatValue2 * f6;
                    if (f7 > 0.0f) {
                        l46Var6.f0(76691639);
                        j09 j09VarB3 = e31Var.b(g09Var);
                        boolean zD = l46Var6.d(f7);
                        Object objR13 = l46Var6.R();
                        if (zD || objR13 == i8cVar2) {
                            objR13 = new uc2(13, f7);
                            l46Var6.p0(objR13);
                        }
                        j09 j09VarX = bzd.x(j09VarB3, (a26) objR13);
                        f = fD;
                        h4g.b(f, f5, 0, l46Var6, j09VarX);
                        l46Var6.r(false);
                    } else {
                        f = fD;
                        l46Var6.f0(76857892);
                        l46Var6.r(false);
                    }
                    float fN = mh3.n(((Number) jxVar2.e()).floatValue(), 0.0f, 1.0f) * f6;
                    if (fN > 0.0f) {
                        l46Var6.f0(77063763);
                        float fFloatValue3 = ((Number) jxVar2.e()).floatValue();
                        j09 j09VarB4 = e31Var.b(g09Var);
                        boolean zD2 = l46Var6.d(fN);
                        Object objR14 = l46Var6.R();
                        if (zD2 || objR14 == i8cVar2) {
                            objR14 = new uc2(14, fN);
                            l46Var6.p0(objR14);
                        }
                        f2 = f;
                        h4g.c(fFloatValue3, f2, fC, f5, bzd.x(j09VarB4, (a26) objR14), l46Var6, 0);
                        f3 = f5;
                        l46Var = l46Var6;
                        l46Var.r(false);
                    } else {
                        f2 = f;
                        l46Var = l46Var6;
                        f3 = f5;
                        l46Var.f0(77295364);
                        l46Var.r(false);
                    }
                    if (fFloatValue > 0.0f) {
                        l46Var.f0(77409785);
                        j09 j09VarB5 = e31Var.b(g09Var);
                        boolean zD3 = l46Var.d(fFloatValue);
                        Object objR15 = l46Var.R();
                        if (zD3 || objR15 == i8cVar2) {
                            objR15 = new uc2(15, fFloatValue);
                            l46Var.p0(objR15);
                        }
                        float f8 = f2;
                        h4g.g(qheVar, tarotSkinIdentify, f8, bzd.x(j09VarB5, (a26) objR15), l46Var, 0);
                        String strB = u3bVar.b();
                        long j = ((y72) h0eVar3.getValue()).a;
                        j09 j09VarD1 = ynb.d0(f3 * 44.0f, 0.0f, 0.0f, 0.0f, 14, e31Var.b(g09Var));
                        boolean zD4 = l46Var.d(fFloatValue);
                        Object objR16 = l46Var.R();
                        if (zD4 || objR16 == i8cVar2) {
                            objR16 = new uc2(16, fFloatValue);
                            l46Var.p0(objR16);
                        }
                        float f9 = f3;
                        h4g.d(strB, j, f9, bzd.x(j09VarD1, (a26) objR16), l46Var, 0);
                        String strQ2 = afc.q(r8c.f(qheVar), l46Var);
                        long j2 = ((y72) h0eVar3.getValue()).a;
                        j09 j09VarA2 = e31Var.a(g09Var, ndb.v);
                        boolean zD5 = l46Var.d(fFloatValue);
                        Object objR17 = l46Var.R();
                        if (zD5 || objR17 == i8cVar2) {
                            objR17 = new uc2(17, fFloatValue);
                            l46Var.p0(objR17);
                        }
                        h4g.h(strQ2, j2, f8, f9, bzd.x(j09VarA2, (a26) objR17), l46Var, 0);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(78189156);
                        l46Var.r(false);
                    }
                } else {
                    l46Var6.Z();
                }
                return wefVar;
        }
    }

    public /* synthetic */ n53(aw2 aw2Var, sdd sddVar, a26 a26Var, String str, x16 x16Var, e89 e89Var, e89 e89Var2, e89 e89Var3) {
        this.e = aw2Var;
        this.f = sddVar;
        this.b = a26Var;
        this.g = str;
        this.c = x16Var;
        this.d = e89Var;
        this.v = e89Var2;
        this.w = e89Var3;
    }

    public /* synthetic */ n53(e63 e63Var, a26 a26Var, l26 l26Var, a26 a26Var2, a26 a26Var3, y72 y72Var, e89 e89Var, x16 x16Var) {
        this.e = e63Var;
        this.b = a26Var;
        this.v = l26Var;
        this.f = a26Var2;
        this.g = a26Var3;
        this.w = y72Var;
        this.d = e89Var;
        this.c = x16Var;
    }

    public /* synthetic */ n53(ted tedVar, a26 a26Var, String str, e89 e89Var, String str2, String str3, String str4, List list) {
        this.e = tedVar;
        this.b = a26Var;
        this.f = str;
        this.d = e89Var;
        this.g = str2;
        this.v = str3;
        this.w = str4;
        this.c = list;
    }

    public /* synthetic */ n53(List list, ma8 ma8Var, ma8 ma8Var2, a26 a26Var, String[] strArr, Map map, a26 a26Var2, lsd lsdVar) {
        this.e = list;
        this.g = ma8Var;
        this.v = ma8Var2;
        this.b = a26Var;
        this.w = strArr;
        this.d = map;
        this.f = a26Var2;
        this.c = lsdVar;
    }
}
