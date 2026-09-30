package defpackage;

import ai.askquin.R;
import android.content.Context;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x16 b;

    public /* synthetic */ m(int i, int i2, x16 x16Var) {
        this.a = i2;
        this.b = x16Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        i8c i8cVar = sf2.a;
        g09 g09Var = g09.a;
        x16 x16Var = this.b;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pa7.a(null, 0L, 0L, null, z7f.a, null, false, false, this.b, l46Var, 24576, 239);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 1:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    pa7.a(null, 0L, 0L, null, t72.a, null, false, false, this.b, l46Var2, 24576, 239);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 2:
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    pa7.a(null, 0L, 0L, null, vpf.a, null, false, false, this.b, l46Var3, 24576, 239);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case 3:
                l46 l46Var4 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (l46Var4.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    pa7.a(null, 0L, 0L, null, abg.a, null, false, false, this.b, l46Var4, 24576, 239);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            case 4:
                l46 l46Var5 = (l46) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (l46Var5.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    pa7.a(null, 0L, 0L, null, feg.a, null, false, false, this.b, l46Var5, 24576, 239);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
            case 5:
                l46 l46Var6 = (l46) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (l46Var6.W(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    y7h.g(null, afc.q(R.string.personality_test_history, l46Var6), null, 0L, null, this.b, l46Var6, 0, 29);
                } else {
                    l46Var6.Z();
                }
                return wefVar;
            case 6:
                l46 l46Var7 = (l46) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (l46Var7.W(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    pa7.d(null, 0L, 0L, null, null, null, false, this.b, l46Var7, 0, 127);
                } else {
                    l46Var7.Z();
                }
                return wefVar;
            case 7:
                ((Integer) obj2).getClass();
                hkg.I(x16Var, (l46) obj, k99.P(1));
                return wefVar;
            case 8:
                ((Integer) obj2).getClass();
                uq1.c(x16Var, (l46) obj, k99.P(1));
                return wefVar;
            case 9:
                l46 l46Var8 = (l46) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (l46Var8.W(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    pa7.a(null, 0L, 0L, null, g21.b, null, false, false, this.b, l46Var8, 24576, 239);
                } else {
                    l46Var8.Z();
                }
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((Integer) obj2).getClass();
                gs1.b(x16Var, (l46) obj, k99.P(1));
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                l46 l46Var9 = (l46) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (l46Var9.W(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    c8b.k(b.b(0.0f, 56.0f, ynb.d0(0.0f, 0.0f, 0.0f, 16.0f, 7, b.c(g09Var, 1.0f)), 1), false, a7c.b(100.0f), null, null, null, false, this.b, an1.g, l46Var9, 100663302, 122);
                } else {
                    l46Var9.Z();
                }
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                l46 l46Var10 = (l46) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (l46Var10.W(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    c8b.k(b.b(0.0f, 56.0f, ynb.d0(0.0f, 0.0f, 0.0f, 16.0f, 7, b.c(g09Var, 1.0f)), 1), false, a7c.b(100.0f), null, null, null, false, this.b, an1.v, l46Var10, 100663302, 122);
                } else {
                    l46Var10.Z();
                }
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((Integer) obj2).getClass();
                eb3.f(x16Var, (l46) obj, k99.P(1));
                return wefVar;
            case 14:
                l46 l46Var11 = (l46) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (l46Var11.W(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    tq.c(b.c(g09Var, 1.0f), null, false, false, this.b, qk2.x, l46Var11, 196614, 14);
                } else {
                    l46Var11.Z();
                }
                return wefVar;
            case 15:
                l46 l46Var12 = (l46) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (l46Var12.W(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    eb3.f(x16Var, l46Var12, 0);
                } else {
                    l46Var12.Z();
                }
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                l46 l46Var13 = (l46) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (l46Var13.W(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    Context context = (Context) l46Var13.k(uq.b);
                    j09 j09VarF = urg.F(b.c(g09Var, 1.0f), ia7.b);
                    fy9 fy9VarA = od4.A(R.drawable.bg_contact_us, 0, l46Var13);
                    gec gecVar = an2.g;
                    feg.j(fy9VarA, null, j09VarF, null, gecVar, 0.0f, null, l46Var13, 25016, 104);
                    j09 j09VarR = b.r(g09Var);
                    c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var13, 48);
                    int iHashCode = Long.hashCode(l46Var13.T);
                    u8a u8aVarM = l46Var13.m();
                    j09 j09VarJ = m93.J(l46Var13, j09VarR);
                    lf2.q.getClass();
                    l46Var13.j0();
                    boolean z = l46Var13.S;
                    ov7 ov7Var = LayoutNode.h1;
                    if (z) {
                        l46Var13.l(ov7Var);
                    } else {
                        l46Var13.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var13, c92VarA);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var13, u8aVarM);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var13, numValueOf);
                    dec.k(l46Var13);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var13, j09VarJ);
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode2 = Long.hashCode(l46Var13.T);
                    u8a u8aVarM2 = l46Var13.m();
                    j09 j09VarJ2 = m93.J(l46Var13, j09VarC);
                    l46Var13.j0();
                    if (l46Var13.S) {
                        l46Var13.l(ov7Var);
                    } else {
                        l46Var13.s0();
                    }
                    dec.l(he2Var, l46Var13, xn8VarC);
                    dec.l(he2Var2, l46Var13, u8aVarM2);
                    ib8.s(iHashCode2, l46Var13, he2Var3, l46Var13);
                    dec.l(he2Var4, l46Var13, j09VarJ2);
                    feg.j(od4.A(R.drawable.banner_contact_us, 0, l46Var13), null, dj6.w(b.c(g09Var, 1.0f), 1.8937198f), null, an2.d, 0.0f, null, l46Var13, 25016, 104);
                    c8b.h(ynb.d0(0.0f, 9.0f, 9.0f, 0.0f, 9, d31.a.a(g09Var, ndb.d)), false, 0L, 0L, null, this.b, l46Var13, 0, 30);
                    l46Var13.r(true);
                    feg.j(od4.A(R.drawable.logo_quin, 0, l46Var13), null, dj6.w(b.d(g09Var, 42.0f), 2.4444444f), null, gecVar, 0.0f, null, l46Var13, 25016, 104);
                    j09 j09VarB0 = ynb.b0(24.0f, 0.0f, kv2.e(g09Var, 48.0f, l46Var13, g09Var, 1.0f), 2);
                    mue mueVarA = mue.a(new mue(0L, w6c.l(32), ar5.x, null, ((y8b) l46Var13.k(x8b.a)).c, 0L, 0L, 3, 0, w6c.k(38.19d), null, null, 16613337), 0L, 0L, new ar5(568), null, 0L, null, 0, 0L, null, null, 16777211);
                    l46Var13.f0(-1071484116);
                    i00 i00Var = new i00();
                    i00Var.f(afc.q(R.string.contact_us_tips_prefix, l46Var13));
                    i00Var.f(" ");
                    l46Var13.f0(-1071480464);
                    pr4 pr4Var = o82.a;
                    int iK = i00Var.k(new xtd(((m82) l46Var13.k(pr4Var)).a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    try {
                        i00Var.f(afc.q(R.string.contact_us_tips_key_word, l46Var13));
                        i00Var.h(iK);
                        l46Var13.r(false);
                        i00Var.f("\n");
                        i00Var.f(afc.q(R.string.contact_us_tips_suffix, l46Var13));
                        k00 k00VarL = i00Var.l();
                        l46Var13.r(false);
                        nte.c(k00VarL, j09VarB0, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, mueVarA, l46Var13, 48, 0, 262140);
                        j09 j09VarB1 = ynb.b0(24.0f, 0.0f, b.d(kv2.e(g09Var, 48.0f, l46Var13, g09Var, 1.0f), 56.0f), 2);
                        bx9 bx9Var = v51.a;
                        u51 u51VarA = v51.a(((m82) l46Var13.k(pr4Var)).o, 0L, 0L, 0L, l46Var13, 14);
                        boolean zI = l46Var13.i(context);
                        Object objR = l46Var13.R();
                        if (zI || objR == i8cVar) {
                            objR = new u8(context, 3);
                            l46Var13.p0(objR);
                        }
                        cgg.g((x16) objR, j09VarB1, false, null, u51VarA, null, null, m93.a, l46Var13, 805306416);
                        j09 j09VarB2 = ynb.b0(24.0f, 0.0f, b.d(kv2.e(g09Var, 12.0f, l46Var13, g09Var, 1.0f), 56.0f), 2);
                        u51 u51VarA2 = v51.a(abg.d(4279858155L), 0L, 0L, 0L, l46Var13, 14);
                        boolean zI2 = l46Var13.i(context);
                        Object objR2 = l46Var13.R();
                        if (zI2 || objR2 == i8cVar) {
                            objR2 = new u8(context, 4);
                            l46Var13.p0(objR2);
                        }
                        cgg.g((x16) objR2, j09VarB2, false, null, u51VarA2, null, null, m93.b, l46Var13, 805306416);
                        tec.u(g09Var, 50.0f, l46Var13, true);
                    } catch (Throwable th) {
                        i00Var.h(iK);
                        throw th;
                    }
                } else {
                    l46Var13.Z();
                }
                return wefVar;
            case 17:
                l46 l46Var14 = (l46) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (l46Var14.W(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    oa7.c(null, null, false, null, this.b, l46Var14, 384, 11);
                } else {
                    l46Var14.Z();
                }
                return wefVar;
            case 18:
                ((Integer) obj2).getClass();
                x57.o(x16Var, (l46) obj, k99.P(1));
                return wefVar;
            case 19:
                l46 l46Var15 = (l46) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (l46Var15.W(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    oa7.c(null, null, false, null, this.b, l46Var15, 432, 9);
                } else {
                    l46Var15.Z();
                }
                return wefVar;
            case 20:
                ((Integer) obj2).getClass();
                z83.a(x16Var, (l46) obj, k99.P(1));
                return wefVar;
            case 21:
                ((Integer) obj2).getClass();
                z83.l(x16Var, (l46) obj, k99.P(1));
                return wefVar;
            case 22:
                l46 l46Var16 = (l46) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (l46Var16.W(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    oa7.c(null, null, false, null, this.b, l46Var16, 384, 11);
                } else {
                    l46Var16.Z();
                }
                return wefVar;
            case 23:
                ((Integer) obj2).getClass();
                j74.u(x16Var, (l46) obj, k99.P(1));
                return wefVar;
            case 24:
                l46 l46Var17 = (l46) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (l46Var17.W(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    j74.n("Open", x16Var, l46Var17, 6);
                } else {
                    l46Var17.Z();
                }
                return wefVar;
            case 25:
                ((Integer) obj2).getClass();
                j74.B(x16Var, (l46) obj, k99.P(1));
                return wefVar;
            case 26:
                l46 l46Var18 = (l46) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (l46Var18.W(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    j74.n("Open", x16Var, l46Var18, 6);
                } else {
                    l46Var18.Z();
                }
                return wefVar;
            case 27:
                ((Integer) obj2).getClass();
                j74.j(x16Var, (l46) obj, k99.P(1));
                return wefVar;
            case 28:
                l46 l46Var19 = (l46) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (l46Var19.W(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    j74.n("Open", x16Var, l46Var19, 6);
                } else {
                    l46Var19.Z();
                }
                return wefVar;
            default:
                l46 l46Var20 = (l46) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (l46Var20.W(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    boolean zG = l46Var20.g(x16Var);
                    Object objR3 = l46Var20.R();
                    if (zG || objR3 == i8cVar) {
                        objR3 = new c20(14, x16Var);
                        l46Var20.p0(objR3);
                    }
                    pa7.d(null, 0L, 0L, null, null, null, false, (x16) objR3, l46Var20, 0, 127);
                } else {
                    l46Var20.Z();
                }
                return wefVar;
        }
    }

    public /* synthetic */ m(int i, x16 x16Var) {
        this.a = i;
        this.b = x16Var;
    }
}
