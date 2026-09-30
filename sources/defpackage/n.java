package defpackage;

import ai.askquin.R;
import android.content.pm.PackageManager;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x16 b;

    public /* synthetic */ n(int i, x16 x16Var) {
        this.a = i;
        this.b = x16Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) throws PackageManager.NameNotFoundException {
        boolean z;
        t69 t69Var;
        Object obj4;
        Object obj5;
        Object obj6;
        int i = this.a;
        ov7 ov7Var = LayoutNode.h1;
        i8c i8cVar = sf2.a;
        x16 x16Var = this.b;
        g09 g09Var = g09.a;
        wef wefVar = wef.a;
        boolean z2 = true;
        switch (i) {
            case 0:
                s.b(x16Var, (xw9) obj, (l46) obj2, ((Integer) obj3).intValue());
                return wefVar;
            case 1:
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((oz) obj).getClass();
                if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    c8b.d(ynb.d0(0.0f, 16.0f, 0.0f, 0.0f, 13, g09.a), afc.q(R.string.additional_info_skip_next, l46Var), null, false, new bx9(20.0f, 10.0f, 20.0f, 10.0f), this.b, l46Var, 24582, 12);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 2:
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    bm8.h(this.b, null, false, null, null, urg.c, l46Var2, 1572864, 62);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 3:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                l46 l46Var3 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= l46Var3.h(zBooleanValue) ? 4 : 2;
                }
                if (l46Var3.W(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    j09 j09VarL = b.l(g09Var, 56.0f);
                    long j = ((e8b) l46Var3.k(l8b.a)).z;
                    y02 y02Var = g21.f;
                    j09 j09VarW = db6.w(j09VarL, 1.0f, j, y02Var);
                    bx9 bx9Var = v51.a;
                    cgg.a(this.b, j09VarW, zBooleanValue, y02Var, z7f.X(l46Var3), null, null, new bx9(0.0f, 0.0f, 0.0f, 0.0f), cn1.c, l46Var3, ((iIntValue3 << 6) & 896) | 817892352, 352);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case 4:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                l46 l46Var4 = (l46) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= l46Var4.h(zBooleanValue2) ? 4 : 2;
                }
                if (l46Var4.W(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    boolean zS = g21.S(l46Var4);
                    boolean z3 = !zS;
                    if ((((iIntValue4 & 14) ^ 6) <= 4 || !l46Var4.h(zBooleanValue2)) && (iIntValue4 & 6) != 4) {
                        z2 = false;
                    }
                    boolean zH = l46Var4.h(z3) | z2;
                    Object objR = l46Var4.R();
                    if (zH || objR == i8cVar) {
                        if (zBooleanValue2) {
                            z = zS;
                            objR = new b68(t72.I(new y72(abg.d(4289396730L)), new y72(abg.c(95092730)), new y72(abg.d(4289396730L))), null, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L));
                        } else {
                            z = zS;
                            objR = new dtd(!z ? abg.c(452984831) : y72.e);
                        }
                        l46Var4.p0(objR);
                    } else {
                        z = zS;
                    }
                    b41 b41Var = (b41) objR;
                    long jC = !z ? abg.c(872415231) : abg.d(3002792698L);
                    bx9 bx9Var2 = v51.a;
                    pr4 pr4Var = l8b.a;
                    u51 u51VarA = v51.a(((e8b) l46Var4.k(pr4Var)).u, y72.e, jC, ((e8b) l46Var4.k(pr4Var)).t, l46Var4, 0);
                    j09 j09VarH = iqf.h(b.l(g09Var, 48.0f), abg.c(335544320), 4.0f, 12.0f, r4d.a, 2);
                    y6c y6cVar = a7c.a;
                    cgg.a(this.b, db6.x(j09VarH, 1.0f, b41Var, y6cVar), zBooleanValue2, y6cVar, u51VarA, null, null, new bx9(0.0f, 0.0f, 0.0f, 0.0f), xo1.b, l46Var4, ((iIntValue4 << 6) & 896) | 817889280, 352);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            case 5:
                l46 l46Var5 = (l46) obj2;
                ((Integer) obj3).getClass();
                l46Var5.f0(-756081143);
                r17 r17Var = (r17) l46Var5.k(o17.a);
                if (r17Var != null) {
                    l46Var5.f0(-1604682242);
                    l46Var5.r(false);
                    t69Var = null;
                } else {
                    l46Var5.f0(-1604549624);
                    Object objR2 = l46Var5.R();
                    if (objR2 == i8cVar) {
                        objR2 = ib8.e(l46Var5);
                    }
                    t69Var = (t69) objR2;
                    l46Var5.r(false);
                }
                j09 j09VarA = androidx.compose.foundation.b.a(g09.a, t69Var, r17Var, true, null, this.b);
                l46Var5.r(false);
                return j09VarA;
            case 6:
                l46 l46Var6 = (l46) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (l46Var6.W(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    nte.b(afc.q(R.string.chat_content_error_network, l46Var6), ynb.Z(g09Var, 16.0f), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var6, 48, 0, 262140);
                    ynb.c(afc.q(R.string.button_retry, l46Var6), x16Var, l46Var6, 0);
                } else {
                    l46Var6.Z();
                }
                return wefVar;
            case 7:
                l46 l46Var7 = (l46) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var7.W(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    bm8.h(this.b, androidx.compose.ui.platform.b.a(g09Var, "gift_card_my_cards_action"), false, null, null, lmg.c, l46Var7, 1572912, 60);
                } else {
                    l46Var7.Z();
                }
                return wefVar;
            case 8:
                l46 l46Var8 = (l46) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (l46Var8.W(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    m93.m(0, x16Var, l46Var8, tm7.o(oa7.E(dj6.w(b.c(g09Var, 1.0f), 1.0f), ((s5d) l46Var8.k(u5d.a)).e), eze.a(l46Var8).e.a.a, g21.f));
                } else {
                    l46Var8.Z();
                }
                return wefVar;
            case 9:
                l46 l46Var9 = (l46) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (l46Var9.W(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    a08 a08Var = (a08) l46Var9.k(tda.a);
                    boolean zG = l46Var9.g(a08Var);
                    Object objR3 = l46Var9.R();
                    if (zG || objR3 == i8cVar) {
                        obj4 = objR3;
                        rn6 rn6Var = new rn6(a08Var, 0);
                        l46Var9.p0(rn6Var);
                        obj4 = rn6Var;
                    }
                    af1.g(wefVar, (a26) obj4, l46Var9);
                    c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var9, 0);
                    int iHashCode = Long.hashCode(l46Var9.T);
                    u8a u8aVarM = l46Var9.m();
                    j09 j09VarJ = m93.J(l46Var9, g09Var);
                    lf2.q.getClass();
                    l46Var9.j0();
                    if (l46Var9.S) {
                        l46Var9.l(ov7Var);
                    } else {
                        l46Var9.s0();
                    }
                    dec.l(hj6.z, l46Var9, c92VarA);
                    dec.l(hj6.y, l46Var9, u8aVarM);
                    dec.l(hj6.X, l46Var9, Integer.valueOf(iHashCode));
                    dec.k(l46Var9);
                    dec.l(hj6.x, l46Var9, j09VarJ);
                    ok8.i(6, x16Var, l46Var9, b.c(g09Var, 1.0f));
                    oa7.d(null, 0.5f, ((e8b) l46Var9.k(l8b.a)).A, l46Var9, 48, 1);
                    l46Var9.r(true);
                } else {
                    l46Var9.Z();
                }
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                l46 l46Var10 = (l46) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (l46Var10.W(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    a08 a08Var2 = (a08) l46Var10.k(tda.a);
                    boolean zG2 = l46Var10.g(a08Var2);
                    Object objR4 = l46Var10.R();
                    if (zG2 || objR4 == i8cVar) {
                        obj5 = objR4;
                        rn6 rn6Var2 = new rn6(a08Var2, 1);
                        l46Var10.p0(rn6Var2);
                        obj5 = rn6Var2;
                    }
                    af1.g(a08Var2, (a26) obj5, l46Var10);
                    ok8.h(6, x16Var, l46Var10, b.c(g09Var, 1.0f));
                } else {
                    l46Var10.Z();
                }
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                l46 l46Var11 = (l46) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var11.W(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    l46Var11.Z();
                } else if (x16Var == null) {
                    l46Var11.f0(1322489989);
                    l46Var11.r(false);
                } else {
                    l46Var11.f0(1322489990);
                    gh6 gh6VarW0 = kj0.w0(l46Var11);
                    boolean zI = l46Var11.i(gh6VarW0) | l46Var11.g(x16Var);
                    Object objR5 = l46Var11.R();
                    if (zI || objR5 == i8cVar) {
                        obj6 = objR5;
                        sj2 sj2Var = new sj2(gh6VarW0, x16Var, 4);
                        l46Var11.p0(sj2Var);
                        obj6 = sj2Var;
                    }
                    bm8.h((x16) obj6, null, false, null, null, bm8.b, l46Var11, 1572864, 62);
                    l46Var11.r(false);
                }
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                l46 l46Var12 = (l46) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((oz) obj).getClass();
                if (l46Var12.W(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    j09 j09VarB0 = ynb.b0(16.0f, 0.0f, b.f(48.0f, 0.0f, androidx.compose.foundation.b.c(oa7.E(g09Var, a7c.b(24.0f)), false, null, null, this.b, 15), 2), 2);
                    xn8 xn8VarC = s21.c(ndb.f, false);
                    int iHashCode2 = Long.hashCode(l46Var12.T);
                    u8a u8aVarM2 = l46Var12.m();
                    j09 j09VarJ2 = m93.J(l46Var12, j09VarB0);
                    lf2.q.getClass();
                    l46Var12.j0();
                    if (l46Var12.S) {
                        l46Var12.l(ov7Var);
                    } else {
                        l46Var12.s0();
                    }
                    dec.l(hj6.z, l46Var12, xn8VarC);
                    dec.l(hj6.y, l46Var12, u8aVarM2);
                    dec.l(hj6.X, l46Var12, Integer.valueOf(iHashCode2));
                    dec.k(l46Var12);
                    dec.l(hj6.x, l46Var12, j09VarJ2);
                    String strQ = afc.q(R.string.seasonal_reading_prev, l46Var12);
                    mue mueVar = pue.a;
                    nte.b(strQ, null, ((e8b) l46Var12.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, pue.b(l46Var12), l46Var12, 0, 24576, 114682);
                    l46Var12.r(true);
                } else {
                    l46Var12.Z();
                }
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                l46 l46Var13 = (l46) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (l46Var13.W(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    kx0 kx0Var = ndb.z;
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    t7c t7cVarA = s7c.a(xc0.a, kx0Var, l46Var13, 48);
                    int iHashCode3 = Long.hashCode(l46Var13.T);
                    u8a u8aVarM3 = l46Var13.m();
                    j09 j09VarJ3 = m93.J(l46Var13, j09VarC);
                    lf2.q.getClass();
                    l46Var13.j0();
                    if (l46Var13.S) {
                        l46Var13.l(ov7Var);
                    } else {
                        l46Var13.s0();
                    }
                    dec.l(hj6.z, l46Var13, t7cVarA);
                    dec.l(hj6.y, l46Var13, u8aVarM3);
                    dec.l(hj6.X, l46Var13, Integer.valueOf(iHashCode3));
                    dec.k(l46Var13);
                    dec.l(hj6.x, l46Var13, j09VarJ3);
                    nte.b(afc.q(R.string.template_introduce, l46Var13), ynb.Z(g09Var, 8.0f).D(new jw7(1.0f, true)), y72.b(((m82) l46Var13.k(o82.a)).q, 0.64f), w6c.l(14), ar5.d, null, 0L, null, null, w6c.l(22), 0, false, 0, 0, null, null, l46Var13, 1597440, 48, 260008);
                    cgg.m(this.b, null, false, null, null, null, x57.l, l46Var13, 805306368, 510);
                    l46Var13.r(true);
                } else {
                    l46Var13.Z();
                }
                return wefVar;
            case 14:
                mx7 mx7Var = (mx7) obj;
                l46 l46Var14 = (l46) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                mx7Var.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= l46Var14.g(mx7Var) ? 4 : 2;
                }
                if (l46Var14.W(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    j09 j09VarA2 = mx7.a(mx7Var, b.c(g09Var, 1.0f));
                    t7c t7cVarA2 = s7c.a(xc0.e, ndb.y, l46Var14, 6);
                    int iHashCode4 = Long.hashCode(l46Var14.T);
                    u8a u8aVarM4 = l46Var14.m();
                    j09 j09VarJ4 = m93.J(l46Var14, j09VarA2);
                    lf2.q.getClass();
                    l46Var14.j0();
                    if (l46Var14.S) {
                        l46Var14.l(ov7Var);
                    } else {
                        l46Var14.s0();
                    }
                    dec.l(hj6.z, l46Var14, t7cVarA2);
                    dec.l(hj6.y, l46Var14, u8aVarM4);
                    dec.l(hj6.X, l46Var14, Integer.valueOf(iHashCode4));
                    dec.k(l46Var14);
                    dec.l(hj6.x, l46Var14, j09VarJ4);
                    g21.r(af1.b0(-1750073630, new fkc(5, x16Var), l46Var14), l46Var14, 6);
                    l46Var14.r(true);
                } else {
                    l46Var14.Z();
                }
                return wefVar;
            default:
                zn8 zn8Var = (zn8) obj;
                tn8 tn8Var = (tn8) obj2;
                kl2 kl2Var = (kl2) obj3;
                float f = ((yi4) x16Var.invoke()).a;
                cea ceaVarV = tn8Var.v(kl2.a(kl2Var.a, 0, 0, ll2.f(yi4.b(f, Float.NaN) ? 0 : zn8Var.D0(f), kl2Var.a), 0, 11));
                return zn8Var.n0(ceaVarV.a, ceaVarV.b, qu4.a, new l1(ceaVarV, 19));
        }
    }
}
