package defpackage;

import ai.askquin.ui.dailycard.DailyCardEntry;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p50 implements o26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p50(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        j09 j09VarD0;
        int i2;
        String str;
        Object objB;
        String str2;
        DailyCardEntry dailyCardEntry;
        e3b e3bVar;
        int i3;
        j09 j09VarD1;
        int i4 = this.a;
        sc0 sc0Var = xc0.c;
        g09 g09Var = g09.a;
        ov7 ov7Var = LayoutNode.h1;
        int i5 = 2;
        i8c i8cVar = sf2.a;
        wef wefVar = wef.a;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i4) {
            case 0:
                String str3 = (String) obj6;
                dd2 dd2Var = (dd2) obj5;
                ((Integer) obj).getClass();
                a26 a26Var = (a26) obj2;
                l46 l46Var = (l46) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                a26Var.getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= l46Var.i(a26Var) ? 32 : 16;
                }
                int i6 = iIntValue;
                if (l46Var.W(i6 & 1, (i6 & 145) != 144)) {
                    Object objR = l46Var.R();
                    if (objR == i8cVar) {
                        objR = kv2.f(0, l46Var);
                    }
                    s69 s69Var = (s69) objR;
                    boolean zS = g21.S(l46Var);
                    boolean zBooleanValue = ((Boolean) l46Var.k(sad.a)).booleanValue();
                    j09 j09VarB0 = ynb.b0(58.0f, 0.0f, zBooleanValue ? g09Var : b.c, 2);
                    if (zBooleanValue) {
                        l46Var.f0(-763010634);
                        i = 0;
                        l46Var.r(false);
                        j09VarD0 = g09Var;
                    } else {
                        i = 0;
                        l46Var.f0(-763009869);
                        j09VarD0 = mh3.d0(g09Var, mh3.T(l46Var), false, 14);
                        l46Var.r(false);
                    }
                    j09 j09VarD = j09VarB0.D(j09VarD0);
                    c92 c92VarA = a92.a(sc0Var, ndb.Y, l46Var, i);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarD);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, c92VarA);
                    dec.l(hj6.y, l46Var, u8aVarM);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ);
                    o5c.f(l46Var, b.d(g09Var, 24.0f));
                    Object objR2 = l46Var.R();
                    if (objR2 == i8cVar) {
                        i2 = 0;
                        objR2 = new q50(s69Var, i2);
                        l46Var.p0(objR2);
                    } else {
                        i2 = 0;
                    }
                    dj6.k((x16) objR2, af1.b0(1230974546, new j50(str3, zS, a26Var, s69Var, dd2Var, 1), l46Var), l46Var, 54, i2);
                    tec.u(g09Var, 20.0f, l46Var, true);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 1:
                c4c c4cVar = (c4c) obj6;
                z5c z5cVar = (z5c) obj5;
                l46 l46Var2 = (l46) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((sw3) obj).getClass();
                ((String) obj2).getClass();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 129) != 128)) {
                    tm7.e(c4cVar, ((jf0) z5cVar).l, l46Var2, 0);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 2:
                ka9 ka9Var = (ka9) obj6;
                dba dbaVar = (dba) obj5;
                da9 da9Var = (da9) obj2;
                l46 l46Var3 = (l46) obj3;
                ((Integer) obj4).getClass();
                ((ly) obj).getClass();
                da9Var.getClass();
                nfc nfcVarB = kr7.b(l46Var3);
                boolean zG = l46Var3.g(nfcVarB) | l46Var3.g(null);
                Object objR3 = l46Var3.R();
                if (zG || objR3 == i8cVar) {
                    str = null;
                    objB = nfcVarB.b(job.a.b(e3b.class), null, null);
                    l46Var3.p0(objB);
                } else {
                    objB = objR3;
                    str = null;
                }
                e3b e3bVar2 = (e3b) objB;
                String str4 = da9Var.f;
                String strR = urg.r(((die) l46Var3.k(snd.a)).a);
                boolean zG2 = l46Var3.g(da9Var) | l46Var3.g(ka9Var);
                Object objR4 = l46Var3.R();
                if (zG2 || objR4 == i8cVar) {
                    ya9 ya9Var = da9Var.b.c;
                    String str5 = ya9Var != null ? (String) ya9Var.b.f : str;
                    if (str5 == null) {
                        qc0.p("Required value was null.");
                        return str;
                    }
                    objR4 = (DailyCardEntry) vfh.S(ka9Var.b(str5), job.a.b(DailyCardEntry.class));
                    l46Var3.p0(objR4);
                }
                DailyCardEntry dailyCardEntry2 = (DailyCardEntry) objR4;
                Object[] objArr = {dailyCardEntry2.getTargetDate()};
                boolean zG3 = l46Var3.g(dailyCardEntry2) | l46Var3.i(e3bVar2);
                Object objR5 = l46Var3.R();
                if (zG3 || objR5 == i8cVar) {
                    objR5 = new ad1(26, dailyCardEntry2, e3bVar2);
                    l46Var3.p0(objR5);
                }
                boolean zBooleanValue2 = ((Boolean) vfh.I(objArr, (x16) objR5, l46Var3, 0)).booleanValue();
                boolean zG4 = l46Var3.g(dailyCardEntry2);
                Object objR6 = l46Var3.R();
                if (zG4 || objR6 == i8cVar) {
                    objR6 = new ot1(9, dailyCardEntry2);
                    l46Var3.p0(objR6);
                }
                dec.b("page_view", (a26) objR6, l46Var3, 6);
                boolean zG5 = l46Var3.g(str4) | l46Var3.g(strR) | l46Var3.g(dailyCardEntry2) | l46Var3.i(e3bVar2);
                Object objR7 = l46Var3.R();
                if (zG5 || objR7 == i8cVar) {
                    objR7 = new q93(str4, strR, dailyCardEntry2, e3bVar2, null);
                    str2 = strR;
                    dailyCardEntry = dailyCardEntry2;
                    e3bVar = e3bVar2;
                    l46Var3.p0(objR7);
                } else {
                    e3bVar = e3bVar2;
                    str2 = strR;
                    dailyCardEntry = dailyCardEntry2;
                }
                af1.p(str4, str2, (l26) objR7, l46Var3);
                boolean zG6 = l46Var3.g(str4) | l46Var3.g(dbaVar);
                Object objR8 = l46Var3.R();
                if (zG6 || objR8 == i8cVar) {
                    objR8 = new n93(str4, dbaVar, 0);
                    l46Var3.p0(objR8);
                }
                x16 x16Var = (x16) objR8;
                dd2 dd2VarB0 = af1.b0(-202707162, new m(22, x16Var), l46Var3);
                boolean zG7 = l46Var3.g(dailyCardEntry) | l46Var3.i(e3bVar) | l46Var3.g(str4) | l46Var3.i(ka9Var) | l46Var3.h(zBooleanValue2) | l46Var3.g(x16Var);
                Object objR9 = l46Var3.R();
                if (zG7 || objR9 == i8cVar) {
                    i43 i43Var = new i43(dailyCardEntry, e3bVar, str4, ka9Var, zBooleanValue2, x16Var);
                    l46Var3.p0(i43Var);
                    objR9 = i43Var;
                }
                x16 x16Var2 = (x16) objR9;
                boolean zG8 = l46Var3.g(str4);
                Object objR10 = l46Var3.R();
                if (zG8 || objR10 == i8cVar) {
                    objR10 = new t8(str4, i5);
                    l46Var3.p0(objR10);
                }
                x16 x16Var3 = (x16) objR10;
                boolean zG9 = l46Var3.g(str4);
                Object objR11 = l46Var3.R();
                if (zG9 || objR11 == i8cVar) {
                    objR11 = new t8(str4, 3);
                    l46Var3.p0(objR11);
                }
                x16 x16Var4 = (x16) objR11;
                boolean zG10 = l46Var3.g(str4);
                Object objR12 = l46Var3.R();
                if (zG10 || objR12 == i8cVar) {
                    objR12 = new t8(str4, 4);
                    l46Var3.p0(objR12);
                }
                hcc.b(dd2VarB0, x16Var, x16Var2, x16Var3, x16Var4, (x16) objR12, false, l46Var3, 1572870);
                return wefVar;
            case 3:
                x16 x16Var5 = (x16) obj6;
                xw9 xw9Var = (xw9) obj5;
                oh4 oh4Var = (oh4) obj2;
                l46 l46Var4 = (l46) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((ly) obj).getClass();
                oh4Var.getClass();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= (iIntValue3 & 64) == 0 ? l46Var4.g(oh4Var) : l46Var4.i(oh4Var) ? 32 : 16;
                }
                if (!l46Var4.W(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                    l46Var4.Z();
                } else if (oh4Var instanceof lh4) {
                    l46Var4.f0(893973396);
                    boolean zG11 = l46Var4.g(x16Var5);
                    Object objR13 = l46Var4.R();
                    if (zG11 || objR13 == i8cVar) {
                        objR13 = new kh4(x16Var5, null);
                        l46Var4.p0(objR13);
                    }
                    af1.o((l26) objR13, l46Var4, wefVar);
                    l46Var4.r(false);
                } else if (oh4Var.equals(mh4.b)) {
                    l46Var4.f0(894088809);
                    FillElement fillElement = b.c;
                    xn8 xn8VarC = s21.c(ndb.f, false);
                    int iHashCode2 = Long.hashCode(l46Var4.T);
                    u8a u8aVarM2 = l46Var4.m();
                    j09 j09VarJ2 = m93.J(l46Var4, fillElement);
                    lf2.q.getClass();
                    l46Var4.j0();
                    if (l46Var4.S) {
                        l46Var4.l(ov7Var);
                    } else {
                        l46Var4.s0();
                    }
                    dec.l(hj6.z, l46Var4, xn8VarC);
                    dec.l(hj6.y, l46Var4, u8aVarM2);
                    dec.l(hj6.X, l46Var4, Integer.valueOf(iHashCode2));
                    dec.k(l46Var4);
                    dec.l(hj6.x, l46Var4, j09VarJ2);
                    jgb.w(null, 0L, 0.0f, l46Var4, 0);
                    l46Var4.r(true);
                    l46Var4.r(false);
                } else {
                    if (!(oh4Var instanceof nh4)) {
                        throw tec.d(-1495184273, l46Var4, false);
                    }
                    l46Var4.f0(894313807);
                    bm8.d(mh3.d0(ynb.b0(20.0f, 0.0f, ynb.Y(b.c, xw9Var), 2), mh3.T(l46Var4), false, 14), (nh4) oh4Var, l46Var4, iIntValue3 & 112);
                    l46Var4.r(false);
                }
                return wefVar;
            case 4:
                List list = (List) obj6;
                a26 a26Var2 = (a26) obj5;
                int iIntValue4 = ((Integer) obj2).intValue();
                l46 l46Var5 = (l46) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                ((ly) obj).getClass();
                if ((iIntValue5 & 48) == 0) {
                    iIntValue5 |= l46Var5.e(iIntValue4) ? 32 : 16;
                }
                if (l46Var5.W(iIntValue5 & 1, (iIntValue5 & 145) != 144)) {
                    wm6 wm6Var = (wm6) list.get(iIntValue4 % list.size());
                    FillElement fillElement2 = b.b;
                    boolean zG12 = l46Var5.g(a26Var2) | l46Var5.i(wm6Var);
                    Object objR14 = l46Var5.R();
                    if (zG12 || objR14 == i8cVar) {
                        objR14 = new jt3(16, a26Var2, wm6Var);
                        l46Var5.p0(objR14);
                    }
                    k99.e(fillElement2, wm6Var, (x16) objR14, l46Var5, 6);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
            case 5:
                c4c c4cVar2 = (c4c) obj6;
                a26[] a26VarArr = (a26[]) obj5;
                int iIntValue6 = ((Integer) obj).intValue();
                Integer num = (Integer) obj2;
                int iIntValue7 = num.intValue();
                l46 l46Var6 = (l46) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i3 = iIntValue8 | (l46Var6.e(iIntValue6) ? 4 : 2);
                } else {
                    i3 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i3 |= l46Var6.e(iIntValue7) ? 32 : 16;
                }
                if (l46Var6.W(i3 & 1, (i3 & 147) != 146)) {
                    b4c.b(c4cVar2, (String) a26VarArr[iIntValue6 % a26VarArr.length].d(num), null, null, 0, false, 0, l46Var6, 0);
                } else {
                    l46Var6.Z();
                }
                return wefVar;
            case 6:
                q7b q7bVar = (q7b) obj6;
                cb9 cb9Var = (cb9) obj5;
                l46 l46Var7 = (l46) obj3;
                ib8.u((Integer) obj4, (ly) obj, (da9) obj2);
                Object objR15 = l46Var7.R();
                if (objR15 == i8cVar) {
                    objR15 = new zea(28);
                    l46Var7.p0(objR15);
                }
                dec.b("page_view", (a26) objR15, l46Var7, 390);
                jr2 jr2Var = q7bVar.b;
                boolean zI = l46Var7.i(cb9Var);
                Object objR16 = l46Var7.R();
                if (zI || objR16 == i8cVar) {
                    objR16 = new n7b(cb9Var, 11);
                    l46Var7.p0(objR16);
                }
                x16 x16Var6 = (x16) objR16;
                boolean zI2 = l46Var7.i(cb9Var);
                Object objR17 = l46Var7.R();
                if (zI2 || objR17 == i8cVar) {
                    objR17 = new mr2(cb9Var, 6);
                    l46Var7.p0(objR17);
                }
                al6.b(jr2Var, x16Var6, (a26) objR17, l46Var7, 0);
                return wefVar;
            default:
                wrc wrcVar = (wrc) obj6;
                fpc fpcVar = (fpc) obj5;
                ((Integer) obj).getClass();
                a26 a26Var3 = (a26) obj2;
                l46 l46Var8 = (l46) obj3;
                int iIntValue9 = ((Integer) obj4).intValue();
                a26Var3.getClass();
                if ((iIntValue9 & 48) == 0) {
                    iIntValue9 |= l46Var8.i(a26Var3) ? 32 : 16;
                }
                if (l46Var8.W(iIntValue9 & 1, (iIntValue9 & 145) != 144)) {
                    Object objR18 = l46Var8.R();
                    if (objR18 == i8cVar) {
                        objR18 = kv2.f(0, l46Var8);
                    }
                    s69 s69Var2 = (s69) objR18;
                    boolean zS2 = g21.S(l46Var8);
                    boolean zBooleanValue3 = ((Boolean) l46Var8.k(sad.a)).booleanValue();
                    j09 j09VarB1 = ynb.b0(58.0f, 0.0f, zBooleanValue3 ? g09Var : b.c, 2);
                    if (zBooleanValue3) {
                        l46Var8.f0(-377397754);
                        l46Var8.r(false);
                        j09VarD1 = g09Var;
                    } else {
                        l46Var8.f0(-377396989);
                        j09VarD1 = mh3.d0(g09Var, mh3.T(l46Var8), false, 14);
                        l46Var8.r(false);
                    }
                    j09 j09VarD2 = j09VarB1.D(j09VarD1);
                    c92 c92VarA2 = a92.a(sc0Var, ndb.Y, l46Var8, 0);
                    int iHashCode3 = Long.hashCode(l46Var8.T);
                    u8a u8aVarM3 = l46Var8.m();
                    j09 j09VarJ3 = m93.J(l46Var8, j09VarD2);
                    lf2.q.getClass();
                    l46Var8.j0();
                    if (l46Var8.S) {
                        l46Var8.l(ov7Var);
                    } else {
                        l46Var8.s0();
                    }
                    dec.l(hj6.z, l46Var8, c92VarA2);
                    dec.l(hj6.y, l46Var8, u8aVarM3);
                    dec.l(hj6.X, l46Var8, Integer.valueOf(iHashCode3));
                    dec.k(l46Var8);
                    dec.l(hj6.x, l46Var8, j09VarJ3);
                    o5c.f(l46Var8, b.d(g09Var, 24.0f));
                    Object objR19 = l46Var8.R();
                    if (objR19 == i8cVar) {
                        objR19 = new q50(s69Var2, 7);
                        l46Var8.p0(objR19);
                    }
                    dj6.k((x16) objR19, af1.b0(1319341530, new qrc(zS2, a26Var3, s69Var2, wrcVar, fpcVar, 1), l46Var8), l46Var8, 54, 0);
                    tec.u(g09Var, 20.0f, l46Var8, true);
                } else {
                    l46Var8.Z();
                }
                return wefVar;
        }
    }
}
