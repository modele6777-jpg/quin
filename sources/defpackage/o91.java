package defpackage;

import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.dailycard.o;
import ai.askquin.ui.draw.model.DrawCardSaves;
import ai.askquin.ui.explore.model.DailyCardBasicInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.b;
import java.time.LocalDate;
import java.util.List;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o91 implements o26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o91(a26 a26Var, lm2 lm2Var, a26 a26Var2, dd2 dd2Var) {
        this.a = 0;
        this.b = a26Var;
        this.d = lm2Var;
        this.c = a26Var2;
        this.e = dd2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v28, types: [int] */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v40 */
    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        gd7 gd7Var;
        int i2;
        boolean z2;
        Object obj5;
        ?? r7;
        int i3 = this.a;
        ov7 ov7Var = LayoutNode.h1;
        i8c i8cVar = sf2.a;
        wef wefVar = wef.a;
        Object obj6 = this.e;
        Object obj7 = this.b;
        Object obj8 = this.d;
        Object obj9 = this.c;
        int i4 = 1;
        switch (i3) {
            case 0:
                a26 a26Var = (a26) obj7;
                lm2 lm2Var = (lm2) obj8;
                a26 a26Var2 = (a26) obj9;
                dd2 dd2Var = (dd2) obj6;
                mx7 mx7Var = (mx7) obj;
                Integer num = (Integer) obj2;
                int iIntValue = num.intValue();
                l46 l46Var = (l46) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                mx7Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (l46Var.g(mx7Var) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= l46Var.e(iIntValue) ? 32 : 16;
                }
                boolean z3 = false;
                if (l46Var.W(i & 1, (i & 147) != 146)) {
                    m91 m91Var = (m91) a26Var.d(num);
                    int iOrdinal = lm2Var.ordinal();
                    if (iOrdinal == 0) {
                        z = false;
                    } else {
                        if (iOrdinal != 1) {
                            ap.c();
                            return null;
                        }
                        z = true;
                    }
                    e89 e89VarI = q1c.i(a26Var2, l46Var);
                    boolean zG = l46Var.g(m91Var.b());
                    Object objR = l46Var.R();
                    if (zG || objR == i8cVar) {
                        objR = new gd7((a26) e89VarI.getValue());
                        l46Var.p0(objR);
                    }
                    gd7 gd7Var2 = (gd7) objR;
                    boolean zG2 = l46Var.g(gd7Var2);
                    Object objR2 = l46Var.R();
                    if (zG2 || objR2 == i8cVar) {
                        gd7Var = gd7Var2;
                        objR2 = new w(1, gd7Var, gd7.class, "onItemRootPlaced", "onItemRootPlaced(Landroidx/compose/ui/layout/LayoutCoordinates;)V", 0, 14);
                        l46Var.p0(objR2);
                    } else {
                        gd7Var = gd7Var2;
                    }
                    j09 j09VarE = ok8.E(g09.a, (a26) ((ym7) objR2));
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarE);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, xn8VarC);
                    dec.l(hj6.y, l46Var, u8aVarM);
                    dec.h(l46Var, Integer.valueOf(iHashCode));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ);
                    kj0.c.C(mx7Var, m91Var, af1.b0(791318209, new p91(z3, mx7Var, z, m91Var, gd7Var, dd2Var), l46Var), l46Var, Integer.valueOf((i & 14) | 384));
                    l46Var.r(true);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 1:
                x6d x6dVar = (x6d) obj7;
                d53 d53Var = (d53) obj9;
                DailyCardBasicInfo dailyCardBasicInfo = (DailyCardBasicInfo) obj8;
                e3b e3bVar = (e3b) obj6;
                int iIntValue3 = ((Integer) obj).intValue();
                a26 a26Var3 = (a26) obj2;
                l46 l46Var2 = (l46) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                a26Var3.getClass();
                if ((iIntValue4 & 6) == 0) {
                    i2 = (l46Var2.e(iIntValue3) ? 4 : 2) | iIntValue4;
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= l46Var2.i(a26Var3) ? 32 : 16;
                }
                if (l46Var2.W(i2 & 1, (i2 & 147) != 146)) {
                    e8d e8dVar = (e8d) x6dVar.c.get(iIntValue3);
                    DailyCardBasicInfo dailyCardBasicInfo2 = d53Var.b.a;
                    String date = dailyCardBasicInfo.getDate();
                    LocalDate localDate = e3b.a(e3bVar).toLocalDate();
                    localDate.getClass();
                    b53.e(dailyCardBasicInfo2, o.b(date, localDate).equals("tomorrow"), e8dVar, true, a26Var3, l46Var2, DailyCardBasicInfo.$stable | 3072 | (57344 & (i2 << 9)));
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 2:
                List list = (List) obj7;
                cs3 cs3Var = (cs3) obj9;
                TarotCardChoice tarotCardChoice = (TarotCardChoice) obj8;
                aw2 aw2Var = (aw2) obj6;
                int iIntValue5 = ((Integer) obj2).intValue();
                l46 l46Var3 = (l46) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                ((rx9) obj).getClass();
                if ((iIntValue6 & 48) == 0) {
                    iIntValue6 |= l46Var3.e(iIntValue5) ? 32 : 16;
                }
                if (!l46Var3.W(iIntValue6 & 1, (iIntValue6 & 145) != 144)) {
                    l46Var3.Z();
                    return wefVar;
                }
                cod codVar = (cod) list.get(iIntValue5);
                hzc hzcVar = cs3Var.d;
                float fN = 1.0f - (mh3.n(Math.abs(((qz9) hzcVar.d).j() + (((sz9) hzcVar.c).j() - iIntValue5)), 0.0f, 1.0f) * 0.23809522f);
                j09 j09VarA = b.a(androidx.compose.foundation.layout.b.c, "daily_card_skin_picker_card_" + iIntValue5);
                xn8 xn8VarC2 = s21.c(ndb.f, false);
                int iHashCode2 = Long.hashCode(l46Var3.T);
                u8a u8aVarM2 = l46Var3.m();
                j09 j09VarJ2 = m93.J(l46Var3, j09VarA);
                lf2.q.getClass();
                l46Var3.j0();
                if (l46Var3.S) {
                    l46Var3.l(ov7Var);
                } else {
                    l46Var3.s0();
                }
                dec.l(hj6.z, l46Var3, xn8VarC2);
                dec.l(hj6.y, l46Var3, u8aVarM2);
                dec.l(hj6.X, l46Var3, Integer.valueOf(iHashCode2));
                dec.k(l46Var3);
                dec.l(hj6.x, l46Var3, j09VarJ2);
                boolean zD = l46Var3.d(fN);
                Object objR3 = l46Var3.R();
                Object obj10 = objR3;
                if (zD || objR3 == i8cVar) {
                    uc2 uc2Var = new uc2(1, fN);
                    l46Var3.p0(uc2Var);
                    obj10 = uc2Var;
                }
                j09 j09VarC = g09.a;
                j09 j09VarX = bzd.x(j09VarC, (a26) obj10);
                if (iIntValue5 == ((sz9) hzcVar.c).j()) {
                    l46Var3.f0(-1766633511);
                    l46Var3.r(false);
                    r7 = 0;
                } else {
                    l46Var3.f0(-1766582733);
                    boolean zI = l46Var3.i(aw2Var) | l46Var3.g(cs3Var) | ((iIntValue6 & 112) == 32);
                    Object objR4 = l46Var3.R();
                    if (zI || objR4 == i8cVar) {
                        z2 = false;
                        m53 m53Var = new m53(aw2Var, (Object) cs3Var, iIntValue5, (int) (false ? 1 : 0));
                        l46Var3.p0(m53Var);
                        obj5 = m53Var;
                    } else {
                        z2 = false;
                        obj5 = objR4;
                    }
                    j09VarC = androidx.compose.foundation.b.c(j09VarC, false, null, null, (x16) obj5, 15);
                    l46Var3.r(z2);
                    r7 = z2;
                }
                x57.j(codVar, tarotCardChoice, j09VarX.D(j09VarC), l46Var3, r7);
                l46Var3.r(true);
                return wefVar;
            case 3:
                sdd sddVar = (sdd) obj7;
                List list2 = (List) obj9;
                List list3 = (List) obj8;
                x16 x16Var = (x16) obj6;
                ly lyVar = (ly) obj;
                l46 l46Var4 = (l46) obj3;
                int iIntValue7 = ((Integer) obj4).intValue();
                lyVar.getClass();
                ((wef) obj2).getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= (iIntValue7 & 8) == 0 ? l46Var4.g(lyVar) : l46Var4.i(lyVar) ? 4 : 2;
                }
                if (l46Var4.W(iIntValue7 & 1, (iIntValue7 & 131) != 130)) {
                    tm7.j(sddVar, null, null, lyVar, list2, list3, ynb.r(0.0f, 0.0f, 0.0f, 132.0f, 7), true, false, ym8.a, x16Var, l46Var4, ((iIntValue7 << 9) & 7168) | 819462144, 0, 131);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            default:
                r0 r0Var = (r0) obj9;
                ka9 ka9Var = (ka9) obj8;
                a26 a26Var4 = (a26) obj7;
                fo4 fo4Var = (fo4) obj6;
                l46 l46Var5 = (l46) obj3;
                ((Integer) obj4).getClass();
                ((ly) obj).getClass();
                ((da9) obj2).getClass();
                int i5 = r0.j2;
                DrawCardSaves drawCardSavesC = bp4.c(r0Var, ka9Var, l46Var5);
                if (drawCardSavesC != null) {
                    pwf pwfVarA = qd8.a(l46Var5);
                    if (pwfVarA == null) {
                        qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return null;
                    }
                    ol3 ol3Var = (ol3) z5c.G(job.a.b(ol3.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var5), null);
                    Object objR5 = l46Var5.R();
                    if (objR5 == i8cVar) {
                        objR5 = af1.E(l46Var5);
                        l46Var5.p0(objR5);
                    }
                    aw2 aw2Var2 = (aw2) objR5;
                    Object objR6 = l46Var5.R();
                    if (objR6 == i8cVar) {
                        objR6 = q1c.f(null);
                        l46Var5.p0(objR6);
                    }
                    e89 e89Var = (e89) objR6;
                    boolean zI2 = l46Var5.i(r0Var);
                    Object objR7 = l46Var5.R();
                    if (zI2 || objR7 == i8cVar) {
                        objR7 = new so4(r0Var, null);
                        l46Var5.p0(objR7);
                    }
                    af1.o((l26) objR7, l46Var5, wefVar);
                    boolean zI3 = l46Var5.i(ka9Var);
                    Object objR8 = l46Var5.R();
                    if (zI3 || objR8 == i8cVar) {
                        objR8 = new a40(ka9Var, 22);
                        l46Var5.p0(objR8);
                    }
                    x16 x16Var2 = (x16) objR8;
                    boolean zI4 = l46Var5.i(aw2Var2) | l46Var5.i(r0Var) | l46Var5.i(ka9Var);
                    Object objR9 = l46Var5.R();
                    if (zI4 || objR9 == i8cVar) {
                        objR9 = new j8(aw2Var2, r0Var, ka9Var, 27);
                        l46Var5.p0(objR9);
                    }
                    x16 x16Var3 = (x16) objR9;
                    boolean zI5 = l46Var5.i(drawCardSavesC);
                    Object objR10 = l46Var5.R();
                    if (zI5 || objR10 == i8cVar) {
                        objR10 = new jt3(13, drawCardSavesC, e89Var);
                        l46Var5.p0(objR10);
                    }
                    zk3.d(ol3Var, r0Var, x16Var2, x16Var3, a26Var4, (x16) objR10, l46Var5, 72);
                    DrawCardSaves drawCardSaves = (DrawCardSaves) e89Var.getValue();
                    Object objR11 = l46Var5.R();
                    if (objR11 == i8cVar) {
                        objR11 = new ok3(e89Var, 14);
                        l46Var5.p0(objR11);
                    }
                    x16 x16Var4 = (x16) objR11;
                    boolean zI6 = l46Var5.i(r0Var) | l46Var5.i(fo4Var);
                    Object objR12 = l46Var5.R();
                    if (zI6 || objR12 == i8cVar) {
                        objR12 = new lo4(r0Var, fo4Var, i4);
                        l46Var5.p0(objR12);
                    }
                    bp4.a(drawCardSaves, false, x16Var4, (a26) objR12, l46Var5, DrawCardSaves.$stable | 384, 2);
                }
                return wefVar;
        }
    }

    public /* synthetic */ o91(r0 r0Var, ka9 ka9Var, a26 a26Var, fo4 fo4Var) {
        this.a = 4;
        this.c = r0Var;
        this.d = ka9Var;
        this.b = a26Var;
        this.e = fo4Var;
    }

    public /* synthetic */ o91(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
