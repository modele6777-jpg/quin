package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b20 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x16 b;
    public final /* synthetic */ x16 c;

    public /* synthetic */ b20(int i, int i2, x16 x16Var, x16 x16Var2) {
        this.a = i2;
        this.b = x16Var;
        this.c = x16Var2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        sc0 sc0Var = xc0.c;
        d31 d31Var = d31.a;
        ia7 ia7Var = ia7.a;
        g09 g09Var = g09.a;
        ov7 ov7Var = LayoutNode.h1;
        i8c i8cVar = sf2.a;
        int i2 = 2;
        x16 x16Var = this.b;
        x16 x16Var2 = this.c;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                wef wefVar2 = wefVar;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objR = l46Var.R();
                    if (objR == i8cVar) {
                        objR = new d20(2, null);
                        l46Var.p0(objR);
                    }
                    af1.o((l26) objR, l46Var, wefVar2);
                    g09 g09Var2 = g09.a;
                    j09 j09VarO = tm7.o(oa7.E(urg.F(g09Var2, ia7Var), a7c.b(32.0f)), l8b.f(l46Var), g21.f);
                    lx0 lx0Var = ndb.b;
                    xn8 xn8VarC = s21.c(lx0Var, false);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarO);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var, xn8VarC);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var, u8aVarM);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var, numValueOf);
                    dec.k(l46Var);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var, j09VarJ);
                    if (k8b.e((e8b) l46Var.k(l8b.a))) {
                        l46Var.f0(-900357017);
                        feg.j(od4.A(R.drawable.bg_annual_fortune, 0, l46Var), null, d31Var.b(g09Var2), null, an2.a, 0.0f, null, l46Var, 24632, 104);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-900135026);
                        l46Var.r(false);
                    }
                    j09 j09VarD0 = ynb.d0(0.0f, 9.0f, 9.0f, 0.0f, 9, d31Var.a(g09Var2, ndb.d));
                    boolean zG = l46Var.g(x16Var);
                    Object objR2 = l46Var.R();
                    if (zG || objR2 == i8cVar) {
                        objR2 = new c20(0, x16Var);
                        l46Var.p0(objR2);
                    }
                    c8b.h(j09VarD0, false, 0L, 0L, null, (x16) objR2, l46Var, 0, 30);
                    j09 j09VarA0 = ynb.a0(db6.w(d31Var.a(ynb.d0(24.0f, 24.0f, 0.0f, 0.0f, 12, g09Var2), lx0Var), 0.0f, l8b.a(l46Var), a7c.b(12.0f)), 6.0f, 2.0f);
                    xn8 xn8VarC2 = s21.c(lx0Var, false);
                    wefVar2 = wefVar2;
                    int iHashCode2 = Long.hashCode(l46Var.T);
                    u8a u8aVarM2 = l46Var.m();
                    j09 j09VarJ2 = m93.J(l46Var, j09VarA0);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, xn8VarC2);
                    dec.l(he2Var2, l46Var, u8aVarM2);
                    ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ2);
                    String strQ = afc.q(R.string.annual_fortune_member_dialog_tag, l46Var);
                    mue mueVar = pue.a;
                    nte.b(strQ, null, l8b.a(l46Var), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.i(l46Var), l46Var, 0, 0, 131066);
                    l46Var.r(true);
                    j09 j09VarB0 = ynb.b0(0.0f, 32.0f, g09Var2, 1);
                    c92 c92VarA = a92.a(sc0Var, ndb.Z, l46Var, 48);
                    int iHashCode3 = Long.hashCode(l46Var.T);
                    u8a u8aVarM3 = l46Var.m();
                    j09 j09VarJ3 = m93.J(l46Var, j09VarB0);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, c92VarA);
                    dec.l(he2Var2, l46Var, u8aVarM3);
                    ib8.s(iHashCode3, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ3);
                    feg.j(od4.A(R.drawable.annual_fortune_large, 0, l46Var), null, b.l(g09Var2, 168.0f), null, null, 0.0f, null, l46Var, 440, 120);
                    j09 j09VarB1 = ynb.b0(16.0f, 0.0f, g09Var2, 2);
                    String strQ2 = afc.q(R.string.annual_fortune_member_dialog_title, l46Var);
                    mue mueVarN = pue.n(l46Var);
                    long jB = l8b.b(l46Var);
                    ar5 ar5Var = ar5.y;
                    long jK = w6c.k(40.5d);
                    pr4 pr4Var = x8b.a;
                    nte.b(strQ2, j09VarB1, jB, 0L, ar5Var, ((y8b) l46Var.k(pr4Var)).a, 0L, null, new jme(3), jK, 0, false, 0, 0, null, mueVarN, l46Var, 1572912, 48, 127800);
                    o5c.f(l46Var, b.d(g09Var2, 8.0f));
                    l46Var.f0(119558680);
                    i00 i00Var = new i00();
                    i00Var.f(afc.q(R.string.annual_fortune_member_dialog_content_prefix, l46Var));
                    l46Var.f0(119562390);
                    int iK = i00Var.k(new xtd(l8b.a(l46Var), w6c.l(21), ar5Var, null, null, ((y8b) l46Var.k(pr4Var)).a, null, 0L, null, null, null, 0L, null, null, 65496));
                    try {
                        i00Var.f(afc.q(R.string.annual_fortune_member_dialog_content_highlight, l46Var));
                        i00Var.h(iK);
                        l46Var.r(false);
                        k00 k00VarL = i00Var.l();
                        l46Var.r(false);
                        nte.c(k00VarL, null, l8b.b(l46Var), 0L, null, null, 0L, new jme(3), 0L, 0, false, 0, 0, null, null, pue.b(l46Var), l46Var, 0, 0, 261114);
                        j09 j09VarB = b.b(0.0f, 56.0f, ynb.b0(32.0f, 0.0f, kv2.e(g09Var2, 32.0f, l46Var, g09Var2, 1.0f), 2), 1);
                        String strQ3 = afc.q(R.string.annual_fortune_member_dialog_button, l46Var);
                        boolean zG2 = l46Var.g(x16Var2);
                        Object objR3 = l46Var.R();
                        if (zG2 || objR3 == i8cVar) {
                            objR3 = new c20(1, x16Var2);
                            l46Var.p0(objR3);
                        }
                        c8b.i(j09VarB, strQ3, null, null, 0L, 0.0f, false, null, null, false, null, null, (x16) objR3, l46Var, 805306374, 0, 3580);
                        l46Var.r(true);
                        l46Var.r(true);
                    } catch (Throwable th) {
                        i00Var.h(iK);
                        throw th;
                    }
                } else {
                    l46Var.Z();
                }
                return wefVar2;
            case 1:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    pa7.b(null, afc.q(R.string.annual_intro_toolbar_title, l46Var2), false, false, this.b, af1.b0(604416527, new n(i2, x16Var2), l46Var2), l46Var2, 196608, 13);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 2:
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    m93.g(48, x16Var, x16Var2, l46Var3, b.r(mh3.N(ynb.a0(tm7.n(b.c(g09Var, 1.0f), gec.N(0.0f, 14, t72.I(new y72(y72.j), new y72(((e8b) l46Var3.k(l8b.a)).b))), null, 6), 16.0f, 12.0f))));
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case 3:
                l46 l46Var4 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (l46Var4.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    b21.a(afc.q(R.string.annual_view_year_recap, l46Var4), b.f(48.0f, 0.0f, mh3.N(b.c(g09Var, 1.0f)), 2), false, true, this.b, this.c, l46Var4, 24576, 10);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            case 4:
                l46 l46Var5 = (l46) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (l46Var5.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    b21.a(afc.q(R.string.annual_view_domain_detail, l46Var5), b.f(48.0f, 0.0f, mh3.N(b.c(g09Var, 1.0f)), 2), false, true, this.b, this.c, l46Var5, 24576, 10);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
            case 5:
                ((Integer) obj2).getClass();
                g21.m(x16Var, x16Var2, (l46) obj, k99.P(1));
                return wefVar;
            case 6:
                l46 l46Var6 = (l46) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (l46Var6.W(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    b21.g(x16Var, x16Var2, l46Var6, 0);
                } else {
                    l46Var6.Z();
                }
                return wefVar;
            case 7:
                ((Integer) obj2).getClass();
                b21.f(x16Var, x16Var2, (l46) obj, k99.P(1));
                return wefVar;
            case 8:
                ((Integer) obj2).getClass();
                b21.g(x16Var, x16Var2, (l46) obj, k99.P(1));
                return wefVar;
            case 9:
                l46 l46Var7 = (l46) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!l46Var7.W(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    l46Var7.Z();
                    return wefVar;
                }
                Object objR4 = l46Var7.R();
                if (objR4 == i8cVar) {
                    objR4 = new pz5(2, null);
                    l46Var7.p0(objR4);
                }
                af1.o((l26) objR4, l46Var7, wefVar);
                g09 g09Var3 = g09.a;
                j09 j09VarO2 = tm7.o(oa7.E(urg.F(g09Var3, ia7Var), a7c.b(32.0f)), l8b.f(l46Var7), g21.f);
                lx0 lx0Var2 = ndb.b;
                xn8 xn8VarC3 = s21.c(lx0Var2, false);
                int iHashCode4 = Long.hashCode(l46Var7.T);
                u8a u8aVarM4 = l46Var7.m();
                j09 j09VarJ4 = m93.J(l46Var7, j09VarO2);
                lf2.q.getClass();
                l46Var7.j0();
                if (l46Var7.S) {
                    l46Var7.l(ov7Var);
                } else {
                    l46Var7.s0();
                }
                he2 he2Var5 = hj6.z;
                dec.l(he2Var5, l46Var7, xn8VarC3);
                he2 he2Var6 = hj6.y;
                dec.l(he2Var6, l46Var7, u8aVarM4);
                Integer numValueOf2 = Integer.valueOf(iHashCode4);
                he2 he2Var7 = hj6.X;
                dec.l(he2Var7, l46Var7, numValueOf2);
                dec.k(l46Var7);
                he2 he2Var8 = hj6.x;
                dec.l(he2Var8, l46Var7, j09VarJ4);
                pr4 pr4Var2 = l8b.a;
                if (k8b.e((e8b) l46Var7.k(pr4Var2))) {
                    l46Var7.f0(-668453354);
                    feg.j(od4.A(R.drawable.bg_free_count, 0, l46Var7), null, d31Var.b(g09Var3), null, an2.a, 0.0f, null, l46Var7, 24632, 104);
                    l46Var7.r(false);
                } else {
                    l46Var7.f0(-668215987);
                    l46Var7.r(false);
                }
                j09 j09VarD1 = ynb.d0(0.0f, 9.0f, 9.0f, 0.0f, 9, d31Var.a(g09Var3, ndb.d));
                boolean zG3 = l46Var7.g(x16Var);
                Object objR5 = l46Var7.R();
                if (zG3 || objR5 == i8cVar) {
                    objR5 = new c20(24, x16Var);
                    l46Var7.p0(objR5);
                }
                c8b.h(j09VarD1, false, 0L, 0L, null, (x16) objR5, l46Var7, 0, 30);
                j09 j09VarA1 = ynb.a0(db6.w(d31Var.a(ynb.d0(32.0f, 24.0f, 0.0f, 0.0f, 12, g09Var3), lx0Var2), 0.0f, l8b.a(l46Var7), a7c.b(12.0f)), 12.0f, 6.0f);
                xn8 xn8VarC4 = s21.c(lx0Var2, false);
                int iHashCode5 = Long.hashCode(l46Var7.T);
                u8a u8aVarM5 = l46Var7.m();
                j09 j09VarJ5 = m93.J(l46Var7, j09VarA1);
                l46Var7.j0();
                if (l46Var7.S) {
                    l46Var7.l(ov7Var);
                } else {
                    l46Var7.s0();
                }
                dec.l(he2Var5, l46Var7, xn8VarC4);
                dec.l(he2Var6, l46Var7, u8aVarM5);
                ib8.s(iHashCode5, l46Var7, he2Var7, l46Var7);
                dec.l(he2Var8, l46Var7, j09VarJ5);
                String strQ4 = afc.q(R.string.new_user_credit_tag, l46Var7);
                mue mueVar2 = pue.a;
                nte.b(strQ4, null, l8b.a(l46Var7), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.i(l46Var7), l46Var7, 0, 0, 131066);
                l46Var7.r(true);
                j09 j09VarZ = ynb.Z(g09Var3, 32.0f);
                c92 c92VarA2 = a92.a(sc0Var, ndb.Z, l46Var7, 48);
                int iHashCode6 = Long.hashCode(l46Var7.T);
                u8a u8aVarM6 = l46Var7.m();
                j09 j09VarJ6 = m93.J(l46Var7, j09VarZ);
                l46Var7.j0();
                if (l46Var7.S) {
                    l46Var7.l(ov7Var);
                } else {
                    l46Var7.s0();
                }
                dec.l(he2Var5, l46Var7, c92VarA2);
                dec.l(he2Var6, l46Var7, u8aVarM6);
                ib8.s(iHashCode6, l46Var7, he2Var7, l46Var7);
                dec.l(he2Var8, l46Var7, j09VarJ6);
                feg.j(od4.A(k8b.e((e8b) l46Var7.k(pr4Var2)) ? R.drawable.gift : R.drawable.gift_greyscale, 0, l46Var7), null, null, null, null, 0.0f, null, l46Var7, 56, 124);
                String strQ5 = afc.q(R.string.new_user_credit_title, l46Var7);
                mue mueVarN2 = pue.n(l46Var7);
                long jB2 = l8b.b(l46Var7);
                ar5 ar5Var2 = ar5.y;
                nte.b(strQ5, null, jB2, 0L, ar5Var2, ((y8b) l46Var7.k(x8b.a)).a, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarN2, l46Var7, 1572864, 0, 129850);
                hs3 hs3Var = xqa.q0;
                int iIntValue8 = ((Number) z5c.I(nu4.a, new qz5(hs3Var.a, hs3Var.b, null))).intValue();
                l46Var7.f0(1400212358);
                i00 i00Var2 = new i00();
                i00Var2.f(afc.q(R.string.new_user_credit_subtitle_prefix, l46Var7));
                l46Var7.f0(1400215741);
                int iK2 = i00Var2.k(new xtd(l8b.a(l46Var7), w6c.l(21), ar5Var2, null, null, null, null, 0L, null, null, null, 0L, null, null, 65528));
                try {
                    i00Var2.f(afc.r(R.string.new_user_credit_subtitle_highlight, new Object[]{Integer.valueOf(iIntValue8)}, l46Var7));
                    i00Var2.h(iK2);
                    l46Var7.r(false);
                    i00Var2.f(afc.q(R.string.new_user_credit_subtitle_suffix, l46Var7));
                    k00 k00VarL2 = i00Var2.l();
                    l46Var7.r(false);
                    nte.c(k00VarL2, null, l8b.b(l46Var7), 0L, null, null, 0L, new jme(3), 0L, 0, false, 0, 0, null, null, pue.b(l46Var7), l46Var7, 0, 0, 261114);
                    j09 j09VarB2 = b.b(0.0f, 56.0f, kv2.e(g09Var3, 24.0f, l46Var7, g09Var3, 1.0f), 1);
                    String strQ6 = afc.q(R.string.new_user_credit_button, l46Var7);
                    boolean zG4 = l46Var7.g(x16Var2);
                    Object objR6 = l46Var7.R();
                    if (zG4 || objR6 == i8cVar) {
                        objR6 = new c20(25, x16Var2);
                        l46Var7.p0(objR6);
                    }
                    c8b.i(j09VarB2, strQ6, null, null, 0L, 0.0f, false, null, null, false, null, null, (x16) objR6, l46Var7, 6, 0, 4092);
                    nte.b(ks0.h(24.0f, R.string.new_user_credit_description, l46Var7, l46Var7, g09Var3), null, l8b.e(l46Var7), w6c.l(12), null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.g(l46Var7), l46Var7, 24576, 0, 130026);
                    l46Var7.r(true);
                    l46Var7.r(true);
                    return wefVar;
                } catch (Throwable th2) {
                    i00Var2.h(iK2);
                    throw th2;
                }
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                l46 l46Var8 = (l46) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (l46Var8.W(1 & iIntValue9, (iIntValue9 & 3) != 2)) {
                    z7f.c(x16Var, x16Var2, l46Var8, 0);
                } else {
                    l46Var8.Z();
                }
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((Integer) obj2).getClass();
                z7f.c(x16Var, x16Var2, (l46) obj, k99.P(1));
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((Integer) obj2).getClass();
                pa6.g(x16Var, x16Var2, (l46) obj, k99.P(1));
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((Integer) obj2).getClass();
                x57.c(x16Var, x16Var2, (l46) obj, k99.P(1));
                return wefVar;
            case 14:
                ((Integer) obj2).getClass();
                x57.d(x16Var, x16Var2, (l46) obj, k99.P(1));
                return wefVar;
            case 15:
                ((Integer) obj2).getClass();
                t72.n(x16Var, x16Var2, (l46) obj, k99.P(1));
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((Integer) obj2).getClass();
                t72.a(x16Var, x16Var2, (l46) obj, k99.P(1));
                return wefVar;
            case 17:
                ((Integer) obj2).getClass();
                t72.e(x16Var, x16Var2, (l46) obj, k99.P(1));
                return wefVar;
            case 18:
                l46 l46Var9 = (l46) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (l46Var9.W(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    j09 j09VarA2 = ynb.a0(b.c, 24.0f, 32.0f);
                    xn8 xn8VarC5 = s21.c(ndb.w, false);
                    int iHashCode7 = Long.hashCode(l46Var9.T);
                    u8a u8aVarM7 = l46Var9.m();
                    j09 j09VarJ7 = m93.J(l46Var9, j09VarA2);
                    lf2.q.getClass();
                    l46Var9.j0();
                    if (l46Var9.S) {
                        l46Var9.l(ov7Var);
                    } else {
                        l46Var9.s0();
                    }
                    dec.l(hj6.z, l46Var9, xn8VarC5);
                    dec.l(hj6.y, l46Var9, u8aVarM7);
                    dec.l(hj6.X, l46Var9, Integer.valueOf(iHashCode7));
                    dec.k(l46Var9);
                    dec.l(hj6.x, l46Var9, j09VarJ7);
                    boolean zG5 = l46Var9.g(x16Var) | l46Var9.g(x16Var2);
                    Object objR7 = l46Var9.R();
                    if (zG5 || objR7 == i8cVar) {
                        objR7 = new ct5(x16Var, x16Var2, 2);
                        l46Var9.p0(objR7);
                    }
                    rxg.p(0, (x16) objR7, x16Var, l46Var9, null);
                    l46Var9.r(true);
                } else {
                    l46Var9.Z();
                }
                return wefVar;
            case 19:
                ((Integer) obj2).getClass();
                urg.g(x16Var, x16Var2, (l46) obj, k99.P(1));
                return wefVar;
            case 20:
                ((Integer) obj2).getClass();
                if9.i(x16Var, x16Var2, (l46) obj, k99.P(1));
                return wefVar;
            case 21:
                ((Integer) obj2).getClass();
                ynb.o(x16Var, x16Var2, (l46) obj, k99.P(1));
                return wefVar;
            case 22:
                l46 l46Var10 = (l46) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (l46Var10.W(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    j09 j09VarA3 = ynb.a0(b.c, 24.0f, 32.0f);
                    xn8 xn8VarC6 = s21.c(ndb.w, false);
                    int iHashCode8 = Long.hashCode(l46Var10.T);
                    u8a u8aVarM8 = l46Var10.m();
                    j09 j09VarJ8 = m93.J(l46Var10, j09VarA3);
                    lf2.q.getClass();
                    l46Var10.j0();
                    if (l46Var10.S) {
                        l46Var10.l(ov7Var);
                    } else {
                        l46Var10.s0();
                    }
                    dec.l(hj6.z, l46Var10, xn8VarC6);
                    dec.l(hj6.y, l46Var10, u8aVarM8);
                    dec.l(hj6.X, l46Var10, Integer.valueOf(iHashCode8));
                    dec.k(l46Var10);
                    dec.l(hj6.x, l46Var10, j09VarJ8);
                    boolean zG6 = l46Var10.g(x16Var) | l46Var10.g(x16Var2);
                    Object objR8 = l46Var10.R();
                    if (zG6 || objR8 == i8cVar) {
                        objR8 = new ct5(x16Var, x16Var2, 3);
                        l46Var10.p0(objR8);
                    }
                    n16.p(0, (x16) objR8, x16Var, l46Var10, null);
                    l46Var10.r(true);
                } else {
                    l46Var10.Z();
                }
                return wefVar;
            case 23:
                ((Integer) obj2).getClass();
                qn4.r(x16Var, x16Var2, (l46) obj, k99.P(1));
                return wefVar;
            case 24:
                ((Integer) obj2).getClass();
                pa7.l(x16Var, x16Var2, (l46) obj, k99.P(1));
                return wefVar;
            case 25:
                ((Integer) obj2).getClass();
                feg.m(x16Var, x16Var2, (l46) obj, k99.P(1));
                return wefVar;
            case 26:
                ((Integer) obj2).getClass();
                q1c.c(x16Var, x16Var2, (l46) obj, k99.P(1));
                return wefVar;
            case 27:
                l46 l46Var11 = (l46) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (l46Var11.W(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    j09 j09VarD2 = ynb.d0(0.0f, 0.0f, 0.0f, 16.0f, 7, ynb.b0(32.0f, 0.0f, mh3.N(b.c(g09Var, 1.0f)), 2));
                    c92 c92VarA3 = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Z, l46Var11, 54);
                    int iHashCode9 = Long.hashCode(l46Var11.T);
                    u8a u8aVarM9 = l46Var11.m();
                    j09 j09VarJ9 = m93.J(l46Var11, j09VarD2);
                    lf2.q.getClass();
                    l46Var11.j0();
                    if (l46Var11.S) {
                        l46Var11.l(ov7Var);
                    } else {
                        l46Var11.s0();
                    }
                    dec.l(hj6.z, l46Var11, c92VarA3);
                    dec.l(hj6.y, l46Var11, u8aVarM9);
                    dec.l(hj6.X, l46Var11, Integer.valueOf(iHashCode9));
                    dec.k(l46Var11);
                    dec.l(hj6.x, l46Var11, j09VarJ9);
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    String strQ7 = afc.q(R.string.input_spread_info, l46Var11);
                    boolean zG7 = l46Var11.g(x16Var);
                    Object objR9 = l46Var11.R();
                    if (zG7 || objR9 == i8cVar) {
                        objR9 = new yca(11, x16Var);
                        l46Var11.p0(objR9);
                    }
                    ym8.h(j09VarC, false, strQ7, false, (x16) objR9, l46Var11, 6, 10);
                    j09 j09VarC2 = b.c(g09Var, 1.0f);
                    String strQ8 = afc.q(R.string.skip_no_spread, l46Var11);
                    boolean zG8 = l46Var11.g(x16Var2);
                    Object objR10 = l46Var11.R();
                    if (zG8 || objR10 == i8cVar) {
                        objR10 = new yca(12, x16Var2);
                        l46Var11.p0(objR10);
                    }
                    ym8.i(j09VarC2, strQ8, false, (x16) objR10, l46Var11, 6, 4);
                    l46Var11.r(true);
                } else {
                    l46Var11.Z();
                }
                return wefVar;
            default:
                ((Integer) obj2).getClass();
                t4c.j(x16Var, x16Var2, (l46) obj, k99.P(49));
                return wefVar;
        }
    }

    public /* synthetic */ b20(x16 x16Var, x16 x16Var2, int i) {
        this.a = i;
        this.b = x16Var;
        this.c = x16Var2;
    }

    public /* synthetic */ b20(x16 x16Var, x16 x16Var2, boolean z, int i) {
        this.a = i;
        this.b = x16Var;
        this.c = x16Var2;
    }
}
