package defpackage;

import ai.askquin.R;
import ai.askquin.ui.annual.model.AnnualActionFor;
import ai.askquin.ui.conversation.FailReason;
import ai.askquin.ui.conversation.r0;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.material3.c;
import androidx.compose.ui.node.LayoutNode;
import java.time.LocalDate;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cl implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ cl(egd egdVar, x16 x16Var, x16 x16Var2, boolean z, x16 x16Var3) {
        this.a = 8;
        this.c = egdVar;
        this.d = x16Var;
        this.e = x16Var2;
        this.b = z;
        this.f = x16Var3;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        Object d60Var;
        w10 w10Var;
        l46 l46Var;
        l46 l46Var2;
        l46 l46Var3;
        int i = this.a;
        boolean z = this.b;
        i8c i8cVar = sf2.a;
        int i2 = 6;
        j09 j09VarQ = g09.a;
        wef wefVar = wef.a;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        boolean z2 = false;
        z = false;
        boolean z3 = false;
        switch (i) {
            case 0:
                r0 r0Var = (r0) obj7;
                List list = (List) obj6;
                ale aleVar = (ale) obj5;
                dvd dvdVar = (dvd) obj4;
                l46 l46Var4 = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var4.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var4.Z();
                } else {
                    boolean zN0 = r0Var.n0();
                    suc rucVar = list.isEmpty() ? aleVar != null ? new ruc(aleVar) : null : r0Var.X();
                    boolean zI = l46Var4.i(r0Var);
                    Object objR = l46Var4.R();
                    if (zI || objR == i8cVar) {
                        objR = new dl(r0Var, 0);
                        l46Var4.p0(objR);
                    }
                    a26 a26Var = (a26) objR;
                    boolean zI2 = l46Var4.i(list) | l46Var4.i(r0Var);
                    Object objR2 = l46Var4.R();
                    if (zI2 || objR2 == i8cVar) {
                        objR2 = new l0(i2, list, r0Var);
                        l46Var4.p0(objR2);
                    }
                    z7c.d(null, 0L, dvdVar, zN0, list, this.b, rucVar, a26Var, (a26) objR2, l46Var4, 3072);
                }
                break;
            case 1:
                w10 w10Var2 = (w10) obj7;
                final xw9 xw9Var = (xw9) obj6;
                final AnnualActionFor annualActionFor = (AnnualActionFor) obj5;
                final a26 a26Var2 = (a26) obj4;
                final sdd sddVar = (sdd) obj;
                l46 l46Var5 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                sddVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= l46Var5.g(sddVar) ? 4 : 2;
                }
                int i3 = iIntValue2;
                if (!l46Var5.W(i3 & 1, (i3 & 19) != 18)) {
                    l46Var5.Z();
                } else {
                    boolean z4 = w10Var2.g() == tn4.b;
                    Integer numH = w10Var2.h();
                    boolean zI3 = l46Var5.i(w10Var2);
                    Object objR3 = l46Var5.R();
                    if (zI3 || objR3 == i8cVar) {
                        w10Var = w10Var2;
                        l46Var = l46Var5;
                        d60Var = new d60(1, w10Var, w10.class, "createNewCard", "createNewCard()Ltech/chatmind/api/TarotCardChoice;", 4, 0);
                        l46Var.p0(d60Var);
                    } else {
                        l46Var = l46Var5;
                        d60Var = objR3;
                        w10Var = w10Var2;
                    }
                    a26 a26Var3 = (a26) d60Var;
                    boolean zI4 = l46Var.i(w10Var);
                    Object objR4 = l46Var.R();
                    if (zI4 || objR4 == i8cVar) {
                        gl glVar = new gl(2, w10Var, w10.class, "onCardConfirmed", "onCardConfirmed(Ltech/chatmind/api/TarotCardChoice;I)V", 0, 1);
                        l46Var.p0(glVar);
                        objR4 = glVar;
                    }
                    ym7 ym7Var = (ym7) objR4;
                    boolean zI5 = l46Var.i(w10Var);
                    Object objR5 = l46Var.R();
                    if (zI5 || objR5 == i8cVar) {
                        hl hlVar = new hl(0, w10Var, w10.class, "onCardDiscard", "onCardDiscard()V", 0, 5);
                        l46Var.p0(hlVar);
                        objR5 = hlVar;
                    }
                    x16 x16Var = (x16) ((ym7) objR5);
                    final boolean z5 = this.b;
                    final w10 w10Var3 = w10Var;
                    b21.e(sddVar, null, xw9Var, numH, z4, a26Var3, (l26) ym7Var, x16Var, af1.b0(-1176347305, new o26() { // from class: b60
                        @Override // defpackage.o26
                        public final Object t(Object obj8, Object obj9, Object obj10, Object obj11) {
                            int i4;
                            c31 c31Var = (c31) obj8;
                            ft1 ft1Var = (ft1) obj9;
                            l46 l46Var6 = (l46) obj10;
                            int iIntValue3 = ((Integer) obj11).intValue();
                            c31Var.getClass();
                            if ((iIntValue3 & 6) == 0) {
                                i4 = (l46Var6.g(c31Var) ? 4 : 2) | iIntValue3;
                            } else {
                                i4 = iIntValue3;
                            }
                            if ((iIntValue3 & 48) == 0) {
                                i4 |= l46Var6.g(ft1Var) ? 32 : 16;
                            }
                            int i5 = 1;
                            if (l46Var6.W(i4 & 1, (i4 & 147) != 146)) {
                                egd egdVarU = p8c.u(l46Var6);
                                jgb.l(0, l46Var6);
                                bx9 bx9VarR = ynb.r(0.0f, 0.0f, 0.0f, 148.0f, 7);
                                w10 w10Var4 = w10Var3;
                                AnnualActionFor annualActionFor2 = annualActionFor;
                                dd2 dd2VarB0 = af1.b0(200153587, new kg(w10Var4, annualActionFor2, z5, i5), l46Var6);
                                dd2 dd2Var = y7h.b;
                                Object objR6 = l46Var6.R();
                                i8c i8cVar2 = sf2.a;
                                if (objR6 == i8cVar2) {
                                    objR6 = new p10(16);
                                    l46Var6.p0(objR6);
                                }
                                x16 x16Var2 = (x16) objR6;
                                Object objR7 = l46Var6.R();
                                if (objR7 == i8cVar2) {
                                    objR7 = new p10(17);
                                    l46Var6.p0(objR7);
                                }
                                int i6 = w10.X;
                                sdd sddVar2 = sddVar;
                                xw9 xw9Var2 = xw9Var;
                                hcc.c(sddVar2, w10Var4, egdVarU, 0.0f, xw9Var2, bx9VarR, ft1Var, dd2VarB0, dd2Var, x16Var2, (x16) objR7, true, 0, null, l46Var6, 918749248 | ((i4 << 15) & 3670016), 54, 6148);
                                j09 j09VarD0 = ynb.d0(0.0f, 0.0f, 0.0f, 24.0f, 7, ynb.b0(24.0f, 0.0f, ynb.Y(c31Var.a(g09.a, ndb.w), xw9Var2), 2));
                                a26 a26Var4 = a26Var2;
                                boolean zG = l46Var6.g(a26Var4) | l46Var6.i(w10Var4);
                                Object objR8 = l46Var6.R();
                                if (zG || objR8 == i8cVar2) {
                                    objR8 = new v6(11, a26Var4, w10Var4);
                                    l46Var6.p0(objR8);
                                }
                                qn4.a(annualActionFor2, j09VarD0, w10Var4, egdVarU, (x16) objR8, l46Var6, 512);
                            } else {
                                l46Var6.Z();
                            }
                            return wef.a;
                        }
                    }, l46Var), l46Var, (i3 & 14) | 100663296, 1);
                }
                break;
            case 2:
                t69 t69Var = (t69) obj7;
                a26 a26Var4 = (a26) obj6;
                aw2 aw2Var = (aw2) obj5;
                fo5 fo5Var = (fo5) obj4;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                l46 l46Var6 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= l46Var6.h(zBooleanValue) ? 4 : 2;
                }
                if (!l46Var6.W(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    l46Var6.Z();
                } else {
                    fy9 fy9VarA = od4.A(zBooleanValue ? R.drawable.arrow_fold : R.drawable.arrow_unfold, 0, l46Var6);
                    String str = zBooleanValue ? "Collapse" : "Expand";
                    j09 j09VarE = oa7.E(b.l(j09VarQ, 24.0f), a7c.a);
                    c cVarA = d5c.a(12.0f, 4, 0L, true);
                    boolean z6 = this.b;
                    boolean zH = l46Var6.h(z6) | l46Var6.g(a26Var4) | l46Var6.i(aw2Var) | l46Var6.g(fo5Var);
                    Object objR6 = l46Var6.R();
                    if (zH || objR6 == i8cVar) {
                        objR6 = new by1(z6, a26Var4, aw2Var, fo5Var, 1);
                        l46Var6.p0(objR6);
                    }
                    gu6.b(fy9VarA, str, androidx.compose.foundation.b.b(j09VarE, t69Var, cVarA, false, null, (x16) objR6, 28), y72.k, l46Var6, 3080, 0);
                }
                break;
            case 3:
                r0 r0Var2 = (r0) obj7;
                String str2 = (String) obj6;
                Context context = (Context) obj5;
                e89 e89Var = (e89) obj4;
                l46 l46Var7 = (l46) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var7.W(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    l46Var7.Z();
                } else {
                    if (r0Var2.B()) {
                        l46Var7.f0(-1587059985);
                        boolean zI6 = l46Var7.i(r0Var2);
                        Object objR7 = l46Var7.R();
                        if (zI6 || objR7 == i8cVar) {
                            objR7 = new hl(0, r0Var2, r0.class, "startQuickDraw", "startQuickDraw()V", 0, 18);
                            l46Var7.p0(objR7);
                        }
                        cgg.m((x16) ((ym7) objR7), null, false, null, null, null, mh3.d, l46Var7, 805306368, 510);
                        l46Var2 = l46Var7;
                        l46Var2.r(false);
                    } else {
                        l46Var2 = l46Var7;
                        l46Var2.f0(-1586900459);
                        l46Var2.r(false);
                    }
                    if (!z) {
                        l46Var2.f0(-1586144555);
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(-1586828260);
                        j09 j09VarP = pa7.p(j09VarQ, ((Boolean) e89Var.getValue()).booleanValue() ? 0.0f : 1.0f);
                        boolean zG = l46Var2.g(str2) | l46Var2.i(r0Var2) | l46Var2.i(context);
                        Object objR8 = l46Var2.R();
                        if (zG || objR8 == i8cVar) {
                            objR8 = new js2(str2, r0Var2, context, z2 ? 1 : 0);
                            l46Var2.p0(objR8);
                        }
                        bm8.h((x16) objR8, j09VarP, false, null, null, mh3.e, l46Var2, 1572864, 60);
                        l46Var2.r(false);
                    }
                }
                break;
            case 4:
                String str3 = (String) obj7;
                x16 x16Var2 = (x16) obj6;
                f96 f96Var = (f96) obj5;
                v86 v86Var = (v86) obj4;
                l46 l46Var8 = (l46) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (!l46Var8.W(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    l46Var8.Z();
                } else {
                    e96 e96Var = f96Var.e;
                    pa6.l(str3, x16Var2, this.b, (e96Var instanceof d96) || (e96Var instanceof x86) || (e96Var instanceof z86), v86Var, "gift_card_purchase_button", ynb.c0(mh3.N(b.c(j09VarQ, 1.0f)), 16.0f, 12.0f, 16.0f, 24.0f), l46Var8, 196608);
                }
                break;
            case 5:
                LocalDate localDate = (LocalDate) obj7;
                LocalDate localDate2 = (LocalDate) obj6;
                a26 a26Var5 = (a26) obj5;
                x16 x16Var3 = (x16) obj4;
                l46 l46Var9 = (l46) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (!l46Var9.W(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    l46Var9.Z();
                } else {
                    boolean zIsAfter = localDate.isAfter(localDate2);
                    boolean z7 = this.b;
                    if (z7) {
                        l46Var9.f0(-1061327921);
                        boolean zG2 = l46Var9.g(a26Var5) | l46Var9.i(localDate);
                        Object objR9 = l46Var9.R();
                        if (zG2 || objR9 == i8cVar) {
                            objR9 = new ah3(2, a26Var5, localDate);
                            l46Var9.p0(objR9);
                        }
                        x16Var3 = (x16) objR9;
                        l46Var9.r(false);
                    } else {
                        l46Var9.f0(-1061248499);
                        l46Var9.r(false);
                    }
                    m93.j(localDate, zIsAfter, z7, x16Var3, b.d(androidx.compose.ui.platform.b.a(ynb.Y(b.c(j09VarQ, 1.0f), eze.a(l46Var9).e.c.b), z7 ? "calendar_daily_fortune_completed" : "calendar_daily_fortune_empty"), 120.0f), l46Var9, 0);
                    jgb.p(fbf.Block, l46Var9, 6, 0);
                }
                break;
            case 6:
                FailReason failReason = (FailReason) obj7;
                bx9 bx9Var = (bx9) obj6;
                x16 x16Var4 = (x16) obj5;
                x16 x16Var5 = (x16) obj4;
                l46 l46Var10 = (l46) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (!l46Var10.W(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    l46Var10.Z();
                } else if (failReason != null) {
                    l46Var10.f0(-591047147);
                    ga5.a(ynb.Y(j09VarQ, bx9Var), failReason, this.b, x16Var4, x16Var5, l46Var10, 0);
                    l46Var10.r(false);
                } else {
                    l46Var10.f0(-591047148);
                    l46Var10.r(false);
                }
                break;
            case 7:
                jkc jkcVar = (jkc) obj7;
                mic micVar = (mic) obj6;
                x16 x16Var6 = (x16) obj5;
                a26 a26Var6 = (a26) obj4;
                xw9 xw9Var2 = (xw9) obj;
                l46 l46Var11 = (l46) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                xw9Var2.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= l46Var11.g(xw9Var2) ? 4 : 2;
                }
                if (!l46Var11.W(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    l46Var11.Z();
                } else {
                    ded.a(null, af1.b0(-643096321, new pc2(jkcVar, xw9Var2, micVar, this.b, x16Var6, a26Var6), l46Var11), l46Var11, 48, 1);
                }
                break;
            case 8:
                egd egdVar = (egd) obj7;
                x16 x16Var7 = (x16) obj6;
                x16 x16Var8 = (x16) obj5;
                x16 x16Var9 = (x16) obj4;
                xw9 xw9Var3 = (xw9) obj;
                l46 l46Var12 = (l46) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                xw9Var3.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= l46Var12.g(xw9Var3) ? 4 : 2;
                }
                if (!l46Var12.W(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    l46Var12.Z();
                } else {
                    FillElement fillElement = b.c;
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode = Long.hashCode(l46Var12.T);
                    u8a u8aVarM = l46Var12.m();
                    j09 j09VarJ = m93.J(l46Var12, fillElement);
                    lf2.q.getClass();
                    l46Var12.j0();
                    if (l46Var12.S) {
                        l46Var12.l(LayoutNode.h1);
                    } else {
                        l46Var12.s0();
                    }
                    dec.l(hj6.z, l46Var12, xn8VarC);
                    dec.l(hj6.y, l46Var12, u8aVarM);
                    dec.l(hj6.X, l46Var12, Integer.valueOf(iHashCode));
                    dec.k(l46Var12);
                    dec.l(hj6.x, l46Var12, j09VarJ);
                    jgb.l(0, l46Var12);
                    bx9 bx9VarW = g21.W(xw9Var3, ynb.r(0.0f, 0.0f, 0.0f, 196.0f, 7), l46Var12);
                    boolean z8 = this.b;
                    p8c.i(fillElement, bx9VarW, egdVar, 0, 0, false, false, null, false, null, null, x16Var7, x16Var8, z8, null, l46Var12, 6, 0, 18424);
                    j09 j09VarD0 = ynb.d0(0.0f, 0.0f, 0.0f, 24.0f, 7, ynb.b0(24.0f, 0.0f, ynb.Y(d31.a.a(j09VarQ, ndb.w), xw9Var3), 2));
                    if (egdVar.a() != hgd.a && egdVar.a() != hgd.d) {
                        z3 = true;
                    }
                    rs0.a(384, af1.b0(428886231, new kg(egdVar, x16Var9, z8, 13), l46Var12), l46Var12, j09VarD0, z3);
                    l46Var12.r(true);
                }
                break;
            default:
                Boolean bool = (Boolean) obj7;
                mue mueVar = (mue) obj6;
                String str4 = (String) obj5;
                x16 x16Var10 = (x16) obj4;
                l46 l46Var13 = (l46) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var13.W(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    l46Var13.Z();
                } else {
                    if (bool == null) {
                        l46Var13.f0(1632383439);
                        l46Var13.r(false);
                        l46Var3 = l46Var13;
                    } else {
                        l46Var13.f0(1632383440);
                        j09 j09VarN = tm7.N(-8.0f, 0.0f, j09VarQ, 2);
                        boolean zBooleanValue2 = bool.booleanValue();
                        boolean zG3 = l46Var13.g(x16Var10);
                        Object objR10 = l46Var13.R();
                        if (zG3 || objR10 == i8cVar) {
                            objR10 = new lnc(6, x16Var10);
                            l46Var13.p0(objR10);
                        }
                        qk2.i(zBooleanValue2, j09VarN, false, 20.0f, null, (a26) objR10, l46Var13, 3120, 20);
                        l46Var3 = l46Var13;
                        o5c.f(l46Var3, b.p(j09VarQ, 4.0f));
                        l46Var3.r(false);
                    }
                    if (z) {
                        j09VarQ = b.q(0.0f, 240.0f, j09VarQ, 1);
                    }
                    l46Var3.f0(1632718270);
                    l46Var3.r(false);
                    if (mueVar == null) {
                        l46Var3.f0(1633654099);
                        nte.b(str4, k8b.h(j09VarQ, new agb(12), l46Var3, 0), 0L, w6c.l(15), ar5.b, null, 0L, null, null, 0L, 2, false, 2, 0, null, null, l46Var3, 1597440, 24960, 241580);
                        l46Var3.r(false);
                    } else {
                        l46Var3.f0(1633342797);
                        nte.b(str4, k8b.h(b.c(j09VarQ, 1.0f), new agb(11), l46Var3, 0), 0L, 0L, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, mueVar, l46Var3, 0, 24960, 110588);
                        l46Var3.r(false);
                    }
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ cl(Object obj, Object obj2, Object obj3, Object obj4, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z;
    }

    public /* synthetic */ cl(Object obj, Object obj2, boolean z, Object obj3, Object obj4, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ cl(Object obj, boolean z, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }
}
