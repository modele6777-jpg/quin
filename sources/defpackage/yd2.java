package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yd2 implements l26 {
    public final /* synthetic */ int a;

    public /* synthetic */ yd2(int i) {
        this.a = i;
    }

    private final Object a(Object obj, Object obj2) {
        l46 l46Var = (l46) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            nte.b(afc.q(R.string.no_subscription_desc, l46Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jgb.W(l46Var), l46Var, 0, 0, 131070);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object e(Object obj, Object obj2) {
        l46 l46Var = (l46) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            t7c t7cVarA = s7c.a(new uc0(4.0f, true, new qc0(0)), ndb.z, l46Var, 54);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var, g09Var);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, t7cVarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            gu6.b(od4.A(R.drawable.ic_paywall_gift_1, 0, l46Var), null, b.l(g09Var, 14.0f), 0L, l46Var, 440, 8);
            nte.b(afc.q(R.string.paywall_footer_post_for_premium, l46Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 0, 0, 262142);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object f(Object obj, Object obj2) {
        l46 l46Var = (l46) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            t7c t7cVarA = s7c.a(new uc0(4.0f, true, new qc0(0)), ndb.z, l46Var, 54);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var, g09Var);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, t7cVarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            gu6.b(od4.A(R.drawable.ic_paywall_gift_2, 0, l46Var), null, b.l(g09Var, 14.0f), 0L, l46Var, 440, 8);
            nte.b(afc.q(R.string.paywall_footer_invite_friends, l46Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 0, 0, 262142);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object g(Object obj, Object obj2) {
        l46 l46Var = (l46) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            nte.b(afc.q(R.string.personality_unfinished_test_content, l46Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 0, 0, 262142);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object h(Object obj, Object obj2) {
        l46 l46Var = (l46) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            String strQ = afc.q(R.string.personality_test_title, l46Var);
            mue mueVar = pue.a;
            nte.b(strQ, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.q(l46Var), 0L, w6c.l(17), ar5.d, null, 0L, null, 0, 0L, null, null, 16777209), l46Var, 0, 0, 131070);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        ov7 ov7Var = LayoutNode.h1;
        int i2 = R.string.invitation_recipient_hint;
        g09 g09Var = g09.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g09 g09Var2 = g09.a;
                    j09 j09VarD0 = ynb.d0(16.0f, 0.0f, 0.0f, 0.0f, 14, g09Var2);
                    t7c t7cVarA = s7c.a(new uc0(12.0f, true, new qc0(0)), ndb.z, l46Var, 54);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarD0);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, t7cVarA);
                    dec.l(hj6.y, l46Var, u8aVarM);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ);
                    feg.j(od4.A(R.drawable.logo_quin_large, 0, l46Var), null, b.d(g09Var2, 64.0f), null, null, 0.0f, new xz0(g21.S(l46Var) ? y72.b : y72.e, 5), l46Var, 440, 56);
                    l46Var.r(true);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 1:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    gu6.b(od4.A(R.drawable.ic_all_history, 0, l46Var2), afc.q(R.string.all_history_title, l46Var2), b.l(g09Var, 28.0f), ((e8b) l46Var2.k(l8b.a)).q, l46Var2, 392, 0);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 2:
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    gu6.b(od4.A(R.drawable.ic_account, 0, l46Var3), afc.q(R.string.account_title, l46Var3), b.l(oa7.E(g09Var, a7c.a), 28.0f), ((e8b) l46Var3.k(l8b.a)).q, l46Var3, 8, 0);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case 3:
                l46 l46Var4 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (l46Var4.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    nte.b(afc.q(R.string.in_app_message_title, l46Var4), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var4, 0, 0, 262142);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            case 4:
                l46 l46Var5 = (l46) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!l46Var5.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    l46Var5.Z();
                    return wefVar;
                }
                j09 j09VarB0 = ynb.b0(0.0f, 24.0f, g09Var, 1);
                lx0 lx0Var = ndb.b;
                xn8 xn8VarC = s21.c(lx0Var, false);
                int iHashCode2 = Long.hashCode(l46Var5.T);
                u8a u8aVarM2 = l46Var5.m();
                j09 j09VarJ2 = m93.J(l46Var5, j09VarB0);
                lf2.q.getClass();
                l46Var5.j0();
                if (l46Var5.S) {
                    l46Var5.l(ov7Var);
                } else {
                    l46Var5.s0();
                }
                he2 he2Var = hj6.z;
                dec.l(he2Var, l46Var5, xn8VarC);
                he2 he2Var2 = hj6.y;
                dec.l(he2Var2, l46Var5, u8aVarM2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                he2 he2Var3 = hj6.X;
                dec.l(he2Var3, l46Var5, numValueOf);
                dec.k(l46Var5);
                he2 he2Var4 = hj6.x;
                dec.l(he2Var4, l46Var5, j09VarJ2);
                c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var5, 0);
                int iHashCode3 = Long.hashCode(l46Var5.T);
                u8a u8aVarM3 = l46Var5.m();
                j09 j09VarJ3 = m93.J(l46Var5, g09Var);
                l46Var5.j0();
                if (l46Var5.S) {
                    l46Var5.l(ov7Var);
                } else {
                    l46Var5.s0();
                }
                dec.l(he2Var, l46Var5, c92VarA);
                dec.l(he2Var2, l46Var5, u8aVarM3);
                ib8.s(iHashCode3, l46Var5, he2Var3, l46Var5);
                dec.l(he2Var4, l46Var5, j09VarJ3);
                o5c.f(l46Var5, b.d(g09Var, 13.0f));
                xn8 xn8VarC2 = s21.c(lx0Var, false);
                int iHashCode4 = Long.hashCode(l46Var5.T);
                u8a u8aVarM4 = l46Var5.m();
                j09 j09VarJ4 = m93.J(l46Var5, g09Var);
                l46Var5.j0();
                if (l46Var5.S) {
                    l46Var5.l(ov7Var);
                } else {
                    l46Var5.s0();
                }
                dec.l(he2Var, l46Var5, xn8VarC2);
                dec.l(he2Var2, l46Var5, u8aVarM4);
                ib8.s(iHashCode4, l46Var5, he2Var3, l46Var5);
                dec.l(he2Var4, l46Var5, j09VarJ4);
                feg.j(od4.A(R.drawable.share, 0, l46Var5), null, tm7.N(0.0f, -24.0f, b.c(g09Var, 1.0f), 1), null, an2.d, 0.0f, null, l46Var5, 25016, 104);
                lx0 lx0Var2 = ndb.c;
                d31 d31Var = d31.a;
                j09 j09VarA = d31Var.a(g09Var, lx0Var2);
                String strJ = ub3.j(afc.q(R.string.invitation_title_line_1, l46Var5), "\n", afc.q(R.string.invitation_title_line_2_prefix, l46Var5));
                String strQ = afc.q(R.string.invitation_title_highlight, l46Var5);
                String strQ2 = afc.q(R.string.invitation_title_line_2_suffix, l46Var5);
                xtd xtdVar = new xtd(abg.d(4294368340L), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534);
                i00 i00Var = new i00();
                i00Var.f(strJ);
                int iK = i00Var.k(xtdVar);
                try {
                    i00Var.f(strQ);
                    i00Var.h(iK);
                    i00Var.f(strQ2);
                    nte.c(i00Var.l(), j09VarA, y72.b(((m82) l46Var5.k(o82.a)).o, 0.88f), w6c.l(36), null, cr5.a(l46Var5), 0L, new jme(3), w6c.l(48), 0, false, 0, 0, null, null, null, l46Var5, 24576, 48, 521064);
                    ib8.t(l46Var5, true, g09Var, 12.0f, l46Var5);
                    l46Var5.r(true);
                    kj0.L(d31Var.a(g09Var, ndb.w), l46Var5, 0);
                    l46Var5.r(true);
                    return wefVar;
                } catch (Throwable th) {
                    i00Var.h(iK);
                    throw th;
                }
            case 5:
                l46 l46Var6 = (l46) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (l46Var6.W(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    gx6 gx6VarB = mh3.L;
                    if (gx6VarB == null) {
                        fx6 fx6Var = new fx6("DialogClose", 36.0f, 36.0f, 36.0f, 36.0f, 0L, 0, false, 224);
                        dtd dtdVar = new dtd(abg.d(4294967295L));
                        s71 s71Var = new s71(1);
                        s71Var.p(18.0f, 35.9395f);
                        s71Var.i(15.5859f, 35.9395f, 13.3125f, 35.4766f, 11.1797f, 34.5508f);
                        s71Var.i(9.0586f, 33.6367f, 7.1836f, 32.3711f, 5.5547f, 30.7539f);
                        s71Var.i(3.9375f, 29.125f, 2.666f, 27.25f, 1.7402f, 25.1289f);
                        s71Var.i(0.8262f, 22.9961f, 0.3691f, 20.7227f, 0.3691f, 18.3086f);
                        s71Var.i(0.3691f, 15.8945f, 0.8262f, 13.627f, 1.7402f, 11.5059f);
                        s71Var.i(2.666f, 9.373f, 3.9375f, 7.4981f, 5.5547f, 5.8809f);
                        s71Var.i(7.1719f, 4.2519f, 9.041f, 2.9805f, 11.1621f, 2.0664f);
                        s71Var.i(13.2949f, 1.1406f, 15.5684f, 0.6777f, 17.9824f, 0.6777f);
                        s71Var.i(20.3965f, 0.6777f, 22.6699f, 1.1406f, 24.8027f, 2.0664f);
                        s71Var.i(26.9355f, 2.9805f, 28.8105f, 4.2519f, 30.4277f, 5.8809f);
                        s71Var.i(32.0449f, 7.4981f, 33.3164f, 9.373f, 34.2422f, 11.5059f);
                        s71Var.i(35.168f, 13.627f, 35.6309f, 15.8945f, 35.6309f, 18.3086f);
                        s71Var.i(35.6309f, 20.7227f, 35.168f, 22.9961f, 34.2422f, 25.1289f);
                        s71Var.i(33.3164f, 27.25f, 32.0449f, 29.125f, 30.4277f, 30.7539f);
                        s71Var.i(28.8105f, 32.3711f, 26.9355f, 33.6367f, 24.8027f, 34.5508f);
                        s71Var.i(22.6816f, 35.4766f, 20.4141f, 35.9395f, 18.0f, 35.9395f);
                        s71Var.h();
                        s71Var.p(18.0f, 33.6719f);
                        s71Var.i(20.1211f, 33.6719f, 22.1074f, 33.2734f, 23.959f, 32.4766f);
                        s71Var.i(25.8223f, 31.6797f, 27.457f, 30.5781f, 28.8633f, 29.1719f);
                        s71Var.i(30.2812f, 27.7656f, 31.3828f, 26.1367f, 32.168f, 24.2852f);
                        s71Var.i(32.9648f, 22.4219f, 33.3633f, 20.4297f, 33.3633f, 18.3086f);
                        s71Var.i(33.3633f, 16.1875f, 32.9648f, 14.2012f, 32.168f, 12.3496f);
                        s71Var.i(31.3711f, 10.4863f, 30.2695f, 8.8516f, 28.8633f, 7.4453f);
                        s71Var.i(27.457f, 6.0273f, 25.8223f, 4.9258f, 23.959f, 4.1406f);
                        s71Var.i(22.1074f, 3.3438f, 20.1152f, 2.9453f, 17.9824f, 2.9453f);
                        s71Var.i(15.8613f, 2.9453f, 13.8691f, 3.3438f, 12.0059f, 4.1406f);
                        s71Var.i(10.1543f, 4.9258f, 8.5254f, 6.0273f, 7.1191f, 7.4453f);
                        s71Var.i(5.7246f, 8.8516f, 4.6289f, 10.4863f, 3.832f, 12.3496f);
                        s71Var.i(3.0469f, 14.2012f, 2.6543f, 16.1875f, 2.6543f, 18.3086f);
                        s71Var.i(2.6543f, 20.4297f, 3.0469f, 22.4219f, 3.832f, 24.2852f);
                        s71Var.i(4.6289f, 26.1367f, 5.7305f, 27.7656f, 7.1367f, 29.1719f);
                        s71Var.i(8.543f, 30.5781f, 10.1719f, 31.6797f, 12.0234f, 32.4766f);
                        s71Var.i(13.875f, 33.2734f, 15.8672f, 33.6719f, 18.0f, 33.6719f);
                        s71Var.h();
                        s71Var.p(11.8477f, 25.5684f);
                        s71Var.i(11.5547f, 25.5684f, 11.2969f, 25.4629f, 11.0742f, 25.252f);
                        s71Var.i(10.8633f, 25.0293f, 10.7578f, 24.7656f, 10.7578f, 24.4609f);
                        s71Var.i(10.7578f, 24.1562f, 10.8691f, 23.8984f, 11.0918f, 23.6875f);
                        s71Var.n(16.4355f, 18.3262f);
                        s71Var.n(11.0918f, 12.9648f);
                        s71Var.i(10.8691f, 12.7539f, 10.7578f, 12.4961f, 10.7578f, 12.1914f);
                        s71Var.i(10.7578f, 11.8867f, 10.8633f, 11.6348f, 11.0742f, 11.4355f);
                        s71Var.i(11.2969f, 11.2246f, 11.5547f, 11.1191f, 11.8477f, 11.1191f);
                        s71Var.i(12.1641f, 11.1191f, 12.4336f, 11.2305f, 12.6562f, 11.4531f);
                        s71Var.n(17.9824f, 16.7969f);
                        s71Var.n(23.3613f, 11.4531f);
                        s71Var.i(23.5957f, 11.207f, 23.8535f, 11.084f, 24.1348f, 11.084f);
                        s71Var.i(24.4512f, 11.084f, 24.7148f, 11.1895f, 24.9258f, 11.4004f);
                        s71Var.i(25.1367f, 11.6113f, 25.2422f, 11.8691f, 25.2422f, 12.1738f);
                        s71Var.i(25.2422f, 12.4785f, 25.1309f, 12.7422f, 24.9082f, 12.9648f);
                        s71Var.n(19.5469f, 18.3262f);
                        s71Var.n(24.8906f, 23.6699f);
                        s71Var.i(25.1133f, 23.8926f, 25.2246f, 24.1562f, 25.2246f, 24.4609f);
                        s71Var.i(25.2246f, 24.7656f, 25.1191f, 25.0293f, 24.9082f, 25.252f);
                        s71Var.i(24.6973f, 25.4629f, 24.4395f, 25.5684f, 24.1348f, 25.5684f);
                        s71Var.i(23.8301f, 25.5684f, 23.5605f, 25.4453f, 23.3262f, 25.1992f);
                        s71Var.n(17.9824f, 19.873f);
                        s71Var.n(12.6738f, 25.1992f);
                        s71Var.i(12.4512f, 25.4453f, 12.1758f, 25.5684f, 11.8477f, 25.5684f);
                        s71Var.h();
                        fx6.a(fx6Var, s71Var.b, dtdVar, 1.0f, 0.0f, 0, 4.0f);
                        gx6VarB = fx6Var.b();
                        mh3.L = gx6VarB;
                    }
                    gu6.a(gx6VarB, null, null, 0L, l46Var6, 48, 12);
                } else {
                    l46Var6.Z();
                }
                return wefVar;
            case 6:
                l46 l46Var7 = (l46) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (l46Var7.W(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ca2.a.getClass();
                    if (ca2.c) {
                        i2 = R.string.invitation_recipient_hint_global;
                    }
                    nte.b(afc.q(i2, l46Var7), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var7, 0, 0, 262142);
                } else {
                    l46Var7.Z();
                }
                return wefVar;
            case 7:
                l46 l46Var8 = (l46) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (l46Var8.W(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ca2.a.getClass();
                    if (ca2.c) {
                        i2 = R.string.invitation_recipient_hint_global;
                    }
                    nte.b(afc.q(i2, l46Var8), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var8, 0, 0, 262142);
                } else {
                    l46Var8.Z();
                }
                return wefVar;
            case 8:
                l46 l46Var9 = (l46) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!l46Var9.W(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    l46Var9.Z();
                }
                return wefVar;
            case 9:
                l46 l46Var10 = (l46) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (!l46Var10.W(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    l46Var10.Z();
                }
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                l46 l46Var11 = (l46) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (!l46Var11.W(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    l46Var11.Z();
                }
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                l46 l46Var12 = (l46) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (l46Var12.W(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    s21.a(b.b, l46Var12, 6);
                } else {
                    l46Var12.Z();
                }
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                l46 l46Var13 = (l46) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (!l46Var13.W(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    l46Var13.Z();
                }
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                l46 l46Var14 = (l46) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (l46Var14.W(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    nte.b(afc.q(R.string.skin_history_subtitle, l46Var14), null, 0L, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, null, l46Var14, 0, 0, 261118);
                } else {
                    l46Var14.Z();
                }
                return wefVar;
            case 14:
                l46 l46Var15 = (l46) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (l46Var15.W(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    nte.b(afc.q(R.string.mixed_storage_body, l46Var15), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var15, 0, 0, 262142);
                } else {
                    l46Var15.Z();
                }
                return wefVar;
            case 15:
                l46 l46Var16 = (l46) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (l46Var16.W(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    gu6.a(t72.C(), null, null, 0L, l46Var16, 48, 12);
                } else {
                    l46Var16.Z();
                }
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                l46 l46Var17 = (l46) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (l46Var17.W(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    gu6.a(t72.C(), null, null, 0L, l46Var17, 48, 12);
                } else {
                    l46Var17.Z();
                }
                return wefVar;
            case 17:
                l46 l46Var18 = (l46) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (l46Var18.W(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    gu6.a(t72.C(), null, null, 0L, l46Var18, 48, 12);
                } else {
                    l46Var18.Z();
                }
                return wefVar;
            case 18:
                l46 l46Var19 = (l46) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (l46Var19.W(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    nte.b(afc.q(R.string.notification_settings_title, l46Var19), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var19, 0, 0, 262142);
                } else {
                    l46Var19.Z();
                }
                return wefVar;
            case 19:
                l46 l46Var20 = (l46) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (l46Var20.W(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    ca2.a.getClass();
                    boolean z = ca2.c;
                    xp9 xp9Var = xp9.Birthday;
                    wp9 wp9VarB = z ? xp9Var.b() : xp9Var.a();
                    boolean z2 = ca2.c;
                    int i3 = wp9VarB.a;
                    int i4 = wp9VarB.b;
                    if (z2) {
                        l46Var20.f0(693301517);
                    } else {
                        l46Var20.f0(22362767);
                        xo1.f(0.0f, 0.0f, i3, i4, 0, 0L, 0L, l46Var20, null);
                    }
                    l46Var20.r(false);
                } else {
                    l46Var20.Z();
                }
                return wefVar;
            case 20:
                l46 l46Var21 = (l46) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (l46Var21.W(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    nte.b(afc.q(R.string.account_profile_edit_update_failed, l46Var21), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var21, 0, 0, 262142);
                } else {
                    l46Var21.Z();
                }
                return wefVar;
            case 21:
                l46 l46Var22 = (l46) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (l46Var22.W(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    gx6 gx6VarB2 = t72.r;
                    if (gx6VarB2 == null) {
                        fx6 fx6Var2 = new fx6("Filled.MoreVert", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i5 = msf.a;
                        dtd dtdVar2 = new dtd(y72.b);
                        s71 s71Var2 = new s71(1);
                        s71Var2.p(12.0f, 8.0f);
                        s71Var2.j(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        s71Var2.r(-0.9f, -2.0f, -2.0f, -2.0f);
                        s71Var2.r(-2.0f, 0.9f, -2.0f, 2.0f);
                        s71Var2.r(0.9f, 2.0f, 2.0f, 2.0f);
                        s71Var2.h();
                        s71Var2.p(12.0f, 10.0f);
                        s71Var2.j(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        s71Var2.r(0.9f, 2.0f, 2.0f, 2.0f);
                        s71Var2.r(2.0f, -0.9f, 2.0f, -2.0f);
                        s71Var2.r(-0.9f, -2.0f, -2.0f, -2.0f);
                        s71Var2.h();
                        s71Var2.p(12.0f, 16.0f);
                        s71Var2.j(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        s71Var2.r(0.9f, 2.0f, 2.0f, 2.0f);
                        s71Var2.r(2.0f, -0.9f, 2.0f, -2.0f);
                        s71Var2.r(-0.9f, -2.0f, -2.0f, -2.0f);
                        s71Var2.h();
                        fx6.a(fx6Var2, s71Var2.b, dtdVar2, 1.0f, 1.0f, 2, 1.0f);
                        gx6VarB2 = fx6Var2.b();
                        t72.r = gx6VarB2;
                    }
                    gu6.a(gx6VarB2, null, null, 0L, l46Var22, 48, 12);
                } else {
                    l46Var22.Z();
                }
                return wefVar;
            case 22:
                l46 l46Var23 = (l46) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                if (l46Var23.W(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    jgb.B(null, l46Var23, 0);
                } else {
                    l46Var23.Z();
                }
                return wefVar;
            case 23:
                l46 l46Var24 = (l46) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                if (l46Var24.W(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    tm7.k(false, null, new k00("Three-Card Spread"), null, l46Var24, 438, 8);
                } else {
                    l46Var24.Z();
                }
                return wefVar;
            case 24:
                return a(obj, obj2);
            case 25:
                return e(obj, obj2);
            case 26:
                return f(obj, obj2);
            case 27:
                return g(obj, obj2);
            case 28:
                return h(obj, obj2);
            default:
                l46 l46Var25 = (l46) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                if (l46Var25.W(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    gu6.b(od4.A(R.drawable.ic_all_history, 0, l46Var25), null, null, 0L, l46Var25, 56, 12);
                } else {
                    l46Var25.Z();
                }
                return wefVar;
        }
    }
}
