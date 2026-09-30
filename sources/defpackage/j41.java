package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.navhost.CameraPreviewRoute;
import ai.askquin.ui.draw.navhost.EmptyPhotoPatternRoute;
import ai.askquin.ui.feedback.FeedbackReason;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.giftcard.GiftCardItem;
import tech.chatmind.api.giftcard.GiftCardSku;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j41 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j41(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        x16 x16Var = (x16) this.b;
        use useVar = (use) this.c;
        x16 x16Var2 = (x16) this.d;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c31) obj).getClass();
        int i = 1;
        if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
            xdc.a(b.c, af1.b0(161426497, new fi4(15, x16Var), l46Var), af1.b0(-1534596862, new gf9(useVar, x16Var, x16Var2), l46Var), null, null, 0, y72.j, 0L, null, af1.b0(1251433804, new rb5(useVar, i), l46Var), l46Var, 806879670, 440);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        wp9 wp9Var = (wp9) this.b;
        ghc ghcVar = (ghc) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        xw9 xw9Var = (xw9) obj;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        xw9Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= l46Var.g(xw9Var) ? 4 : 2;
        }
        if (l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
            j09 j09VarD0 = ynb.d0(0.0f, 0.0f, 0.0f, 32.0f, 7, ynb.Y(b.c, xw9Var));
            boolean z = wp9Var.c;
            g09 g09Var = g09.a;
            j09 j09VarD = j09VarD0.D(z ? g09Var : mh3.d0(g09Var, ghcVar, false, 14));
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var, 48);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarD);
            lf2.q.getClass();
            l46Var.j0();
            boolean z2 = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z2) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var, numValueOf);
            dec.k(l46Var);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var, j09VarJ);
            rs0.e(0, l46Var, null, ks0.h(16.0f, R.string.onboarding_overview_title, l46Var, l46Var, g09Var));
            j09 j09VarG = k8b.g(ynb.d0(0.0f, 48.0f, 0.0f, 0.0f, 13, g09Var), new g20(22, wp9Var), l46Var, 6);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarG);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, xn8VarC);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            jgb.C(null, false, null, x57.k, l46Var, 3072, 7);
            l46Var.r(true);
            k99.f(48, l46Var, b.c(g09Var, 1.0f), arrayList);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        mfc mfcVar = (mfc) this.b;
        List list = (List) this.c;
        a26 a26Var = (a26) this.d;
        xw9 xw9Var = (xw9) obj;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        xw9Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= l46Var.g(xw9Var) ? 4 : 2;
        }
        if (l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
            j09 j09VarB0 = ynb.b0(24.0f, 0.0f, ynb.Y(b.c, xw9Var), 2);
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var, 48);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarB0);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            rs0.e(0, l46Var, null, ks0.h(16.0f, R.string.onboarding_theme_choose_title, l46Var, l46Var, g09.a));
            if (1.0f <= 0.0d) {
                g37.a("invalid weight; must be greater than zero");
            }
            o5c.f(l46Var, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            q7c.i(null, mfcVar, list, a26Var, l46Var, 0, 1);
            if (4.0f <= 0.0d) {
                g37.a("invalid weight; must be greater than zero");
            }
            o5c.f(l46Var, new jw7(4.0f <= Float.MAX_VALUE ? 4.0f : Float.MAX_VALUE, true));
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        k00 k00Var = (k00) this.b;
        k00 k00Var2 = (k00) this.c;
        k00 k00Var3 = (k00) this.d;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((oz) obj).getClass();
        if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
            j09 j09VarB0 = ynb.b0(24.0f, 0.0f, b.c(g09.a, 1.0f), 2);
            c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Z, l46Var, 54);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarB0);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            if (k00Var == null || v4e.Q(k00Var)) {
                k00Var = null;
            }
            if (k00Var == null) {
                l46Var.f0(621048234);
                l46Var.r(false);
                i = 3;
                z = false;
            } else {
                l46Var.f0(621048235);
                mue mueVar = pue.a;
                mue mueVarP = pue.p(l46Var);
                yp5 yp5Var = ((y8b) l46Var.k(x8b.a)).a;
                z = false;
                k00 k00Var4 = k00Var;
                i = 3;
                nte.c(k00Var4, null, ((e8b) l46Var.k(l8b.a)).r, 0L, ar5.e, yp5Var, 0L, new jme(3), 0L, 0, false, 0, 0, null, null, mueVarP, l46Var, 1572864, 0, 260922);
                l46Var = l46Var;
                l46Var.r(false);
            }
            if (v4e.Q(k00Var2)) {
                l46Var.f0(621576320);
                l46Var.r(z);
            } else {
                l46Var.f0(621361769);
                mue mueVar2 = pue.a;
                l46 l46Var2 = l46Var;
                nte.c(k00Var2, null, ((e8b) l46Var.k(l8b.a)).u, 0L, null, ((y8b) l46Var.k(x8b.a)).a, 0L, new jme(i), 0L, 0, false, 0, 0, null, null, pue.n(l46Var), l46Var2, 0, 0, 260986);
                l46Var = l46Var2;
                l46Var.r(z);
            }
            if (k00Var3 == null || v4e.Q(k00Var3)) {
                k00Var3 = null;
            }
            if (k00Var3 == null) {
                l46Var.f0(621622726);
                l46Var.r(z);
            } else {
                l46Var.f0(621622727);
                mue mueVar3 = pue.a;
                l46 l46Var3 = l46Var;
                nte.c(k00Var3, null, ((e8b) l46Var.k(l8b.a)).r, 0L, null, null, 0L, new jme(i), 0L, 0, false, 0, 0, null, null, pue.e(l46Var), l46Var3, 0, 0, 261114);
                l46Var = l46Var3;
                l46Var.r(z);
            }
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        u6b u6bVar = (u6b) this.b;
        x16 x16Var = (x16) this.c;
        l26 l26Var = (l26) this.d;
        xw9 xw9Var = (xw9) obj;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        xw9Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= l46Var.g(xw9Var) ? 4 : 2;
        }
        if (l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
            rs0.f(null, false, af1.b0(-2088966809, new sz7(u6bVar, xw9Var, x16Var, l26Var, 12), l46Var), l46Var, 384, 3);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        String str = (String) this.b;
        TarotCardChoice tarotCardChoice = (TarotCardChoice) this.c;
        h0e h0eVar = (h0e) this.d;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((oz) obj).getClass();
        if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
            g09 g09Var = g09.a;
            j09 j09VarD0 = ynb.d0(0.0f, 8.0f, 0.0f, 0.0f, 13, g09Var);
            c92 c92VarA = a92.a(new uc0(2.0f, true, new qc0(0)), ndb.Z, l46Var, 54);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarD0);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            String str2 = (str == null || v4e.Q(str)) ? null : str;
            if (str2 == null) {
                l46Var.f0(1345035576);
                l46Var.r(false);
            } else {
                l46Var.f0(1345035577);
                cgg.b(b.p(g09Var, ((yi4) h0eVar.getValue()).a), str2, true, null, null, l46Var, 384, 24);
                l46Var.r(false);
            }
            cgg.c(b.p(g09Var, ((yi4) h0eVar.getValue()).a), tarotCardChoice, l46Var, 0, 0);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        dsb dsbVar = (dsb) this.b;
        ghc ghcVar = (ghc) this.c;
        x16 x16Var = (x16) this.d;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c31) obj).getClass();
        boolean zW = l46Var.W(iIntValue & 1, (iIntValue & 17) != 16);
        wef wefVar = wef.a;
        if (!zW) {
            l46Var.Z();
            return wefVar;
        }
        if (dsbVar == null) {
            return wefVar;
        }
        g09 g09Var = g09.a;
        j09 j09VarD0 = mh3.d0(g09Var, ghcVar, false, 14);
        c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var, 48);
        int iHashCode = Long.hashCode(l46Var.T);
        u8a u8aVarM = l46Var.m();
        j09 j09VarJ = m93.J(l46Var, j09VarD0);
        lf2.q.getClass();
        l46Var.j0();
        boolean z = l46Var.S;
        ov7 ov7Var = LayoutNode.h1;
        if (z) {
            l46Var.l(ov7Var);
        } else {
            l46Var.s0();
        }
        he2 he2Var = hj6.z;
        dec.l(he2Var, l46Var, c92VarA);
        he2 he2Var2 = hj6.y;
        dec.l(he2Var2, l46Var, u8aVarM);
        Integer numValueOf = Integer.valueOf(iHashCode);
        he2 he2Var3 = hj6.X;
        dec.l(he2Var3, l46Var, numValueOf);
        dec.k(l46Var);
        he2 he2Var4 = hj6.x;
        dec.l(he2Var4, l46Var, j09VarJ);
        xn8 xn8VarC = s21.c(ndb.b, false);
        int iHashCode2 = Long.hashCode(l46Var.T);
        u8a u8aVarM2 = l46Var.m();
        j09 j09VarJ2 = m93.J(l46Var, g09Var);
        l46Var.j0();
        if (l46Var.S) {
            l46Var.l(ov7Var);
        } else {
            l46Var.s0();
        }
        dec.l(he2Var, l46Var, xn8VarC);
        dec.l(he2Var2, l46Var, u8aVarM2);
        ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
        dec.l(he2Var4, l46Var, j09VarJ2);
        j09 j09VarC = b.c(g09Var, 1.0f);
        lx0 lx0Var = ndb.w;
        feg.j(od4.A(R.drawable.bg_personality, 0, l46Var), null, pa7.p(b.d(d31.a.a(j09VarC, lx0Var), 300.0f), 0.5f), lx0Var, an2.a, 0.0f, null, l46Var, 27704, 96);
        c92 c92VarA2 = a92.a(new uc0(24.0f, true, new qc0(0)), ndb.Y, l46Var, 6);
        int iHashCode3 = Long.hashCode(l46Var.T);
        u8a u8aVarM3 = l46Var.m();
        j09 j09VarJ3 = m93.J(l46Var, g09Var);
        l46Var.j0();
        if (l46Var.S) {
            l46Var.l(ov7Var);
        } else {
            l46Var.s0();
        }
        dec.l(he2Var, l46Var, c92VarA2);
        dec.l(he2Var2, l46Var, u8aVarM3);
        ib8.s(iHashCode3, l46Var, he2Var3, l46Var);
        dec.l(he2Var4, l46Var, j09VarJ3);
        WeakHashMap weakHashMap = m8g.w;
        ksb.d(null, g21.W(m93.q(q7c.k(l46Var).f, l46Var), ynb.r(0.0f, 64.0f, 0.0f, 0.0f, 13), l46Var), dsbVar, l46Var, 0, 1);
        c8b.i(b.d(ynb.b0(24.0f, 0.0f, b.c(g09Var, 1.0f), 2), 56.0f), afc.q(R.string.share_button, l46Var), null, null, 0L, 0.0f, false, null, null, false, null, null, x16Var, l46Var, 6, 0, 4092);
        o5c.f(l46Var, od4.I(q7c.k(l46Var).e));
        l46Var.r(true);
        l46Var.r(true);
        l46Var.r(true);
        return wefVar;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        x16 x16Var = (x16) this.b;
        x16 x16Var2 = (x16) this.c;
        x16 x16Var3 = (x16) this.d;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c31) obj).getClass();
        if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
            j09 j09VarC = b.c(g09.a, 1.0f);
            t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(0)), ndb.z, l46Var, 54);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarC);
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
            xxb.g(0, x16Var, l46Var, null, afc.q(R.string.text_prev_step, l46Var));
            o5c.f(l46Var, new jw7(1.0f, true));
            xxb.g(0, x16Var2, l46Var, null, afc.q(R.string.seasonal_skip, l46Var));
            xxb.f(48, x16Var3, l46Var, null, afc.q(R.string.seasonal_start_draw, l46Var), true);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        fpc fpcVar = (fpc) this.b;
        ii6 ii6Var = (ii6) this.c;
        x16 x16Var = (x16) this.d;
        xw9 xw9Var = (xw9) obj;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        xw9Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= l46Var.g(xw9Var) ? 4 : 2;
        }
        if (l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
            j09 j09VarA0 = ynb.a0(mh3.d0(ynb.Y(b.c, xw9Var), mh3.T(l46Var), false, 14), 20.0f, 16.0f);
            c92 c92VarA = a92.a(new uc0(16.0f, true, new qc0(0)), ndb.Z, l46Var, 54);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarA0);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            if (fpcVar != null) {
                l46Var.f0(-408122353);
                String str = fpcVar.a;
                g09 g09Var = g09.a;
                q7c.c(str, b.c(g09Var, 1.0f), ii6Var, l46Var, 48, 0);
                rrb.b(fpcVar.b, b.c(g09Var, 1.0f), ii6Var, l46Var, 48, 0);
                q7c.b(fpcVar.c, b.c(g09Var, 1.0f), ii6Var, l46Var, 48, 0);
                j09 j09VarC = b.c(g09Var, 1.0f);
                bx9 bx9Var = v51.a;
                pr4 pr4Var = l8b.a;
                c8b.k(j09VarC, false, null, v51.a(((e8b) l46Var.k(pr4Var)).m, ((e8b) l46Var.k(pr4Var)).q, 0L, 0L, l46Var, 12), null, ynb.q(0.0f, 16.0f, 1), false, x16Var, jgb.k, l46Var, 100859910, 86);
                l46Var = l46Var;
                l46Var.r(false);
            } else {
                l46Var.f0(-407222857);
                l46Var.r(false);
            }
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        k4d k4dVar = (k4d) this.b;
        dc9 dc9Var = (dc9) this.c;
        h0e h0eVar = (h0e) this.d;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((u7c) obj).getClass();
        int i = 1;
        if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
            boolean zI = l46Var.i(k4dVar) | l46Var.i(dc9Var);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                objR = new ykc(5, k4dVar, dc9Var);
                l46Var.p0(objR);
            }
            bm8.h((x16) objR, null, false, null, null, af1.b0(695105032, new mo2(i, h0eVar), l46Var), l46Var, 1572864, 62);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        dc9 dc9Var = (dc9) this.b;
        Context context = (Context) this.c;
        t7 t7Var = (t7) this.d;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d92) obj).getClass();
        if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
            c4d c4dVar = c4d.a;
            dd2 dd2VarB0 = af1.b0(-425063522, new wf8(26, t7Var), l46Var);
            boolean zI = l46Var.i(dc9Var);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zI || objR == i8cVar) {
                objR = new l8(dc9Var, 11);
                l46Var.p0(objR);
            }
            b4d.f(null, c4dVar, null, dd2VarB0, (x16) objR, l46Var, 24624, 13);
            float f = we6.e(l46Var) ? 0.0f : 24.0f;
            g09 g09Var = g09.a;
            jgb.t(0, 0, l46Var, ynb.b0(f, 0.0f, g09Var, 2));
            c4d c4dVar2 = c4d.b;
            boolean zI2 = l46Var.i(dc9Var);
            Object objR2 = l46Var.R();
            if (zI2 || objR2 == i8cVar) {
                objR2 = new l8(dc9Var, 12);
                l46Var.p0(objR2);
            }
            b4d.f(null, c4dVar2, null, null, (x16) objR2, l46Var, 48, 29);
            ca2.a.getClass();
            String str = ca2.d;
            Set set = r1c.a;
            str.getClass();
            if (r1c.a.contains(str)) {
                l46Var.f0(-1283348857);
                jgb.t(0, 0, l46Var, ynb.b0(we6.e(l46Var) ? 0.0f : 24.0f, 0.0f, g09Var, 2));
                c4d c4dVar3 = c4d.c;
                boolean zI3 = l46Var.i(context);
                Object objR3 = l46Var.R();
                if (zI3 || objR3 == i8cVar) {
                    objR3 = new y3d(context, 4);
                    l46Var.p0(objR3);
                }
                b4d.f(null, c4dVar3, null, null, (x16) objR3, l46Var, 48, 29);
                l46Var.r(false);
            } else {
                l46Var.f0(-1283163384);
                l46Var.r(false);
            }
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        w6d w6dVar = (w6d) this.b;
        x16 x16Var = (x16) this.c;
        x16 x16Var2 = (x16) this.d;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d92) obj).getClass();
        if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
            g09 g09Var = g09.a;
            j09 j09VarA0 = ynb.a0(g09Var, 32.0f, 24.0f);
            c92 c92VarA = a92.a(new uc0(24.0f, true, new qc0(0)), ndb.Y, l46Var, 6);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarA0);
            lf2.q.getClass();
            l46Var.j0();
            boolean z = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var, numValueOf);
            dec.k(l46Var);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var, j09VarJ);
            a26 a26VarP = y8c.p(w6dVar, x16Var, l46Var, 0);
            j09 j09VarD = b.d(b.c(g09Var, 1.0f), 56.0f);
            t7c t7cVarA = s7c.a(xc0.g, ndb.y, l46Var, 6);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarD);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, t7cVarA);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            d8c.f(a26VarP, l46Var, 6);
            l46Var.r(true);
            pr4 pr4Var = nte.a;
            mue mueVar = oue.a;
            mh3.a(pr4Var.a(pue.b(l46Var)), af1.b0(-534557029, new vz6(a26VarP, x16Var2), l46Var), l46Var, 56);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:156:0x0544  */
    /* JADX WARN: Code duplicated, block: B:159:0x0550  */
    /* JADX WARN: Code duplicated, block: B:160:0x0553  */
    /* JADX WARN: Code duplicated, block: B:163:0x0575  */
    /* JADX WARN: Code duplicated, block: B:164:0x057c  */
    /* JADX WARN: Code duplicated, block: B:166:0x0580  */
    /* JADX WARN: Code duplicated, block: B:167:0x0583  */
    /* JADX WARN: Code duplicated, block: B:171:0x0591  */
    /* JADX WARN: Code duplicated, block: B:175:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:178:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:179:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:182:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:183:0x0626  */
    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        i8c i8cVar;
        float f;
        GiftCardSku giftCardSku;
        n07 n07Var;
        String strY;
        boolean z;
        boolean zG;
        Object objR;
        float f2;
        int i = this.a;
        ov7 ov7Var = LayoutNode.h1;
        g09 g09Var = g09.a;
        i8c i8cVar2 = sf2.a;
        wef wefVar = wef.a;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        final int i2 = 1;
        switch (i) {
            case 0:
                r41 r41Var = (r41) obj5;
                ytc ytcVar = (ytc) obj4;
                if (obj6 != t41.l) {
                    vpf.q(r41Var.b, obj6, ytcVar.a);
                }
                return wefVar;
            case 1:
                fh4 fh4Var = (fh4) obj6;
                final x16 x16Var = (x16) obj5;
                final s69 s69Var = (s69) obj4;
                final xw9 xw9Var = (xw9) obj;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                xw9Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= l46Var.g(xw9Var) ? 4 : 2;
                }
                if (l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                    final int i3 = 0;
                    kn2.c(fh4Var, null, null, null, null, null, af1.b0(-1250034727, new o26() { // from class: tg4
                        @Override // defpackage.o26
                        public final Object t(Object obj7, Object obj8, Object obj9, Object obj10) {
                            int i4 = i3;
                            ov7 ov7Var2 = LayoutNode.h1;
                            wef wefVar2 = wef.a;
                            i8c i8cVar3 = sf2.a;
                            s69 s69Var2 = s69Var;
                            xw9 xw9Var2 = xw9Var;
                            x16 x16Var2 = x16Var;
                            switch (i4) {
                                case 0:
                                    fh4 fh4Var2 = (fh4) obj8;
                                    l46 l46Var2 = (l46) obj9;
                                    int iIntValue2 = ((Integer) obj10).intValue();
                                    ((ly) obj7).getClass();
                                    fh4Var2.getClass();
                                    if ((iIntValue2 & 48) == 0) {
                                        iIntValue2 |= (iIntValue2 & 64) == 0 ? l46Var2.g(fh4Var2) : l46Var2.i(fh4Var2) ? 32 : 16;
                                    }
                                    if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                        l46Var2.Z();
                                    } else if (fh4Var2 instanceof ch4) {
                                        l46Var2.f0(1876959632);
                                        boolean zG2 = l46Var2.g(x16Var2);
                                        Object objR2 = l46Var2.R();
                                        if (zG2 || objR2 == i8cVar3) {
                                            objR2 = new bh4(x16Var2, null);
                                            l46Var2.p0(objR2);
                                        }
                                        af1.o((l26) objR2, l46Var2, wefVar2);
                                        l46Var2.r(false);
                                    } else if (fh4Var2.equals(dh4.b)) {
                                        l46Var2.f0(1877099039);
                                        FillElement fillElement = b.c;
                                        xn8 xn8VarC = s21.c(ndb.f, false);
                                        int iHashCode = Long.hashCode(l46Var2.T);
                                        u8a u8aVarM = l46Var2.m();
                                        j09 j09VarJ = m93.J(l46Var2, fillElement);
                                        lf2.q.getClass();
                                        l46Var2.j0();
                                        if (l46Var2.S) {
                                            l46Var2.l(ov7Var2);
                                        } else {
                                            l46Var2.s0();
                                        }
                                        dec.l(hj6.z, l46Var2, xn8VarC);
                                        dec.l(hj6.y, l46Var2, u8aVarM);
                                        dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                                        dec.k(l46Var2);
                                        dec.l(hj6.x, l46Var2, j09VarJ);
                                        jgb.w(null, 0L, 0.0f, l46Var2, 0);
                                        l46Var2.r(true);
                                        l46Var2.r(false);
                                    } else {
                                        if (!(fh4Var2 instanceof eh4)) {
                                            throw tec.d(1307471693, l46Var2, false);
                                        }
                                        l46Var2.f0(1877324936);
                                        j09 j09VarD0 = mh3.d0(ynb.b0(20.0f, 0.0f, ynb.Y(b.c, xw9Var2), 2), mh3.T(l46Var2), false, 14);
                                        eh4 eh4Var = (eh4) fh4Var2;
                                        boolean zG3 = l46Var2.g(s69Var2);
                                        Object objR3 = l46Var2.R();
                                        if (zG3 || objR3 == i8cVar3) {
                                            objR3 = new pr1(s69Var2, 3);
                                            l46Var2.p0(objR3);
                                        }
                                        if9.e(j09VarD0, eh4Var, false, 0, (a26) objR3, l46Var2, 64 | (iIntValue2 & 112), 12);
                                        l46Var2.r(false);
                                    }
                                    return wefVar2;
                                default:
                                    a29 a29Var = (a29) obj8;
                                    l46 l46Var3 = (l46) obj9;
                                    int iIntValue3 = ((Integer) obj10).intValue();
                                    ((ly) obj7).getClass();
                                    a29Var.getClass();
                                    if ((iIntValue3 & 48) == 0) {
                                        iIntValue3 |= (iIntValue3 & 64) == 0 ? l46Var3.g(a29Var) : l46Var3.i(a29Var) ? 32 : 16;
                                    }
                                    int i5 = iIntValue3;
                                    if (!l46Var3.W(i5 & 1, (i5 & 145) != 144)) {
                                        l46Var3.Z();
                                    } else if (a29Var instanceof x19) {
                                        l46Var3.f0(2044419474);
                                        boolean zG4 = l46Var3.g(x16Var2);
                                        Object objR4 = l46Var3.R();
                                        if (zG4 || objR4 == i8cVar3) {
                                            objR4 = new w19(x16Var2, null);
                                            l46Var3.p0(objR4);
                                        }
                                        af1.o((l26) objR4, l46Var3, wefVar2);
                                        l46Var3.r(false);
                                    } else if (a29Var.equals(y19.b)) {
                                        l46Var3.f0(2044534887);
                                        FillElement fillElement2 = b.c;
                                        xn8 xn8VarC2 = s21.c(ndb.f, false);
                                        int iHashCode2 = Long.hashCode(l46Var3.T);
                                        u8a u8aVarM2 = l46Var3.m();
                                        j09 j09VarJ2 = m93.J(l46Var3, fillElement2);
                                        lf2.q.getClass();
                                        l46Var3.j0();
                                        if (l46Var3.S) {
                                            l46Var3.l(ov7Var2);
                                        } else {
                                            l46Var3.s0();
                                        }
                                        dec.l(hj6.z, l46Var3, xn8VarC2);
                                        dec.l(hj6.y, l46Var3, u8aVarM2);
                                        dec.l(hj6.X, l46Var3, Integer.valueOf(iHashCode2));
                                        dec.k(l46Var3);
                                        dec.l(hj6.x, l46Var3, j09VarJ2);
                                        jgb.w(null, 0L, 0.0f, l46Var3, 0);
                                        l46Var3.r(true);
                                        l46Var3.r(false);
                                    } else {
                                        if (!(a29Var instanceof z19)) {
                                            throw tec.d(897231599, l46Var3, false);
                                        }
                                        l46Var3.f0(2044761807);
                                        j09 j09VarD1 = mh3.d0(ynb.b0(20.0f, 0.0f, ynb.Y(b.c, xw9Var2), 2), mh3.T(l46Var3), false, 14);
                                        z19 z19Var = (z19) a29Var;
                                        boolean zG5 = l46Var3.g(s69Var2);
                                        Object objR5 = l46Var3.R();
                                        if (zG5 || objR5 == i8cVar3) {
                                            objR5 = new pr1(s69Var2, 6);
                                            l46Var3.p0(objR5);
                                        }
                                        k99.i(j09VarD1, z19Var, false, 0, (a26) objR5, l46Var3, 64 | (i5 & 112), 12);
                                        l46Var3.r(false);
                                    }
                                    return wefVar2;
                            }
                        }
                    }, l46Var), l46Var, 1572872, 62);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 2:
                final a26 a26Var = (a26) obj6;
                final s69 s69Var2 = (s69) obj5;
                fh4 fh4Var2 = (fh4) obj4;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zG2 = l46Var2.g(a26Var) | l46Var2.g(s69Var2);
                    Object objR2 = l46Var2.R();
                    if (zG2 || objR2 == i8cVar2) {
                        final int i4 = 0;
                        objR2 = new x16() { // from class: ug4
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i5 = i4;
                                wef wefVar2 = wef.a;
                                s69 s69Var3 = s69Var2;
                                a26 a26Var2 = a26Var;
                                switch (i5) {
                                    case 0:
                                        a26Var2.d(Integer.valueOf(((sz9) s69Var3).j()));
                                        break;
                                    default:
                                        a26Var2.d(Integer.valueOf(((sz9) s69Var3).j()));
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var2.p0(objR2);
                    }
                    bm8.h((x16) objR2, null, fh4Var2 instanceof eh4, null, null, nk8.c, l46Var2, 1572864, 58);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 3:
                List list = (List) obj6;
                List list2 = (List) obj5;
                x16 x16Var2 = (x16) obj4;
                sdd sddVar = (sdd) obj;
                l46 l46Var3 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                sddVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= l46Var3.g(sddVar) ? 4 : 2;
                }
                boolean zW = l46Var3.W(iIntValue3 & 1, (iIntValue3 & 19) != 18);
                wef wefVar2 = wef.a;
                if (zW) {
                    kn2.c(wefVar2, null, null, null, "saved_draw_result", null, af1.b0(-7415581, new o91(sddVar, list, list2, x16Var2, 3), l46Var3), l46Var3, 1597446, 46);
                } else {
                    l46Var3.Z();
                }
                return wefVar2;
            case 4:
                final ka9 ka9Var = (ka9) obj5;
                final a26 a26Var2 = (a26) obj4;
                l46 l46Var4 = (l46) obj2;
                ((Integer) obj3).getClass();
                ((da9) obj).getClass();
                int i5 = r0.j2;
                if (bp4.c((r0) obj6, ka9Var, l46Var4) != null) {
                    long j = y72.j;
                    boolean zI = l46Var4.i(ka9Var) | l46Var4.g(a26Var2);
                    Object objR3 = l46Var4.R();
                    if (zI || objR3 == i8cVar2) {
                        final int i6 = 0;
                        objR3 = new x16() { // from class: no4
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i7 = i6;
                                wef wefVar3 = wef.a;
                                a26 a26Var3 = a26Var2;
                                ka9 ka9Var2 = ka9Var;
                                switch (i7) {
                                    case 0:
                                        ka9Var2.d(new hy0(a26Var3, 8), EmptyPhotoPatternRoute.INSTANCE);
                                        break;
                                    default:
                                        ka9.e(ka9Var2, CameraPreviewRoute.INSTANCE, cn1.I(new hy0(a26Var3, 7)), 4);
                                        break;
                                }
                                return wefVar3;
                            }
                        };
                        l46Var4.p0(objR3);
                    }
                    x16 x16Var3 = (x16) objR3;
                    boolean zI2 = l46Var4.i(ka9Var) | l46Var4.g(a26Var2);
                    Object objR4 = l46Var4.R();
                    if (zI2 || objR4 == i8cVar2) {
                        final int i7 = 1;
                        objR4 = new x16() { // from class: no4
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i8 = i7;
                                wef wefVar3 = wef.a;
                                a26 a26Var3 = a26Var2;
                                ka9 ka9Var2 = ka9Var;
                                switch (i8) {
                                    case 0:
                                        ka9Var2.d(new hy0(a26Var3, 8), EmptyPhotoPatternRoute.INSTANCE);
                                        break;
                                    default:
                                        ka9.e(ka9Var2, CameraPreviewRoute.INSTANCE, cn1.I(new hy0(a26Var3, 7)), 4);
                                        break;
                                }
                                return wefVar3;
                            }
                        };
                        l46Var4.p0(objR4);
                    }
                    x16 x16Var4 = (x16) objR4;
                    boolean zI3 = l46Var4.i(ka9Var);
                    Object objR5 = l46Var4.R();
                    if (zI3 || objR5 == i8cVar2) {
                        objR5 = new a40(ka9Var, 23);
                        l46Var4.p0(objR5);
                    }
                    pa7.o(null, j, x16Var3, x16Var4, (x16) objR5, l46Var4, 48, 1);
                }
                return wefVar;
            case 5:
                jaa jaaVar = (jaa) obj6;
                x16 x16Var5 = (x16) obj5;
                x16 x16Var6 = (x16) obj4;
                l46 l46Var5 = (l46) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (l46Var5.W(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    t7c t7cVarA = s7c.a(xc0.a, ndb.y, l46Var5, 0);
                    int iHashCode = Long.hashCode(l46Var5.T);
                    u8a u8aVarM = l46Var5.m();
                    j09 j09VarJ = m93.J(l46Var5, g09Var);
                    lf2.q.getClass();
                    l46Var5.j0();
                    if (l46Var5.S) {
                        l46Var5.l(ov7Var);
                    } else {
                        l46Var5.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var5, t7cVarA);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var5, u8aVarM);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var5, numValueOf);
                    dec.k(l46Var5);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var5, j09VarJ);
                    feg.j(od4.A(R.drawable.img_personality_card, 0, l46Var5), null, dj6.w(b.b, 1.0f), null, an2.c, 0.0f, null, l46Var5, 25016, 104);
                    j09 j09VarD0 = ynb.d0(16.0f, 0.0f, 12.0f, 0.0f, 10, ynb.b0(0.0f, 14.5f, b.c, 1));
                    uc0 uc0Var = new uc0(4.0f, true, new qc0(0));
                    jx0 jx0Var = ndb.Y;
                    c92 c92VarA = a92.a(uc0Var, jx0Var, l46Var5, 6);
                    int iHashCode2 = Long.hashCode(l46Var5.T);
                    u8a u8aVarM2 = l46Var5.m();
                    j09 j09VarJ2 = m93.J(l46Var5, j09VarD0);
                    l46Var5.j0();
                    if (l46Var5.S) {
                        l46Var5.l(ov7Var);
                    } else {
                        l46Var5.s0();
                    }
                    dec.l(he2Var, l46Var5, c92VarA);
                    dec.l(he2Var2, l46Var5, u8aVarM2);
                    ib8.s(iHashCode2, l46Var5, he2Var3, l46Var5);
                    dec.l(he2Var4, l46Var5, j09VarJ2);
                    String str = jaaVar.b;
                    mue mueVar = pue.a;
                    nte.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.q(l46Var5), 0L, 0L, ar5.e, ((y8b) l46Var5.k(x8b.a)).a, 0L, null, 0, 0L, null, null, 16777179), l46Var5, 0, 0, 131070);
                    String str2 = jaaVar.c;
                    mue mueVarJ = pue.j(l46Var5);
                    pr4 pr4Var = o82.a;
                    nte.b(str2, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(mueVarJ, y72.b(((m82) l46Var5.k(pr4Var)).q, 0.64f), 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), l46Var5, 0, 0, 131070);
                    o5c.f(l46Var5, new jw7(1.0f, true));
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    t7c t7cVarA2 = s7c.a(new uc0(2.0f, true, new jv2(3, jx0Var)), ndb.z, l46Var5, 54);
                    int iHashCode3 = Long.hashCode(l46Var5.T);
                    u8a u8aVarM3 = l46Var5.m();
                    j09 j09VarJ3 = m93.J(l46Var5, j09VarC);
                    l46Var5.j0();
                    if (l46Var5.S) {
                        l46Var5.l(ov7Var);
                    } else {
                        l46Var5.s0();
                    }
                    dec.l(he2Var, l46Var5, t7cVarA2);
                    dec.l(he2Var2, l46Var5, u8aVarM3);
                    ib8.s(iHashCode3, l46Var5, he2Var3, l46Var5);
                    dec.l(he2Var4, l46Var5, j09VarJ3);
                    gu6.b(od4.A(R.drawable.ic_all_history, 0, l46Var5), null, b.l(g09Var, 12.0f), y72.b(((m82) l46Var5.k(pr4Var)).q, 0.32f), l46Var5, 440, 0);
                    nte.b(jaaVar.d, null, 0L, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mue.a(pue.j(l46Var5), y72.b(((m82) l46Var5.k(pr4Var)).q, 0.32f), 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), l46Var5, 0, 0, 130046);
                    o5c.f(l46Var5, b.b(32.0f, 0.0f, new jw7(1.0f, true), 2));
                    j09 j09VarD = b.d(g09Var, 24.0f);
                    y6c y6cVarB = a7c.b(8.0f);
                    bx9 bx9Var = new bx9(12.0f, 2.0f, 12.0f, 2.0f);
                    boolean zI4 = l46Var5.i(jaaVar) | l46Var5.g(x16Var5) | l46Var5.g(x16Var6);
                    Object objR6 = l46Var5.R();
                    if (zI4 || objR6 == i8cVar2) {
                        objR6 = new n25((Object) jaaVar, (Object) x16Var5, (Object) x16Var6, 0);
                        l46Var5.p0(objR6);
                    }
                    cgg.k((x16) objR6, j09VarD, false, y6cVarB, null, null, bx9Var, af1.b0(553203936, new g20(10, jaaVar), l46Var5), l46Var5, 805306416, 372);
                    tec.s(l46Var5, true, true, true);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
            case 6:
                Context context = (Context) obj6;
                x16 x16Var7 = (x16) obj5;
                e89 e89Var = (e89) obj4;
                xw9 xw9Var2 = (xw9) obj;
                l46 l46Var6 = (l46) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                xw9Var2.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= l46Var6.g(xw9Var2) ? 4 : 2;
                }
                if (l46Var6.W(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    boolean zF = k8b.f((e8b) l46Var6.k(l8b.a));
                    j09 j09VarY = ynb.Y(b.c, xw9Var2);
                    String str3 = zF ? "&theme=dark" : null;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String strD = vd8.d();
                    String strM = tec.m("https://quin.love", strD.equals("en") ? "" : "/".concat(strD), "/q?lang=", vd8.d(), "&ap=android&av=5.23.0");
                    if (str3.length() != 0) {
                        strM = ib8.j(strM, "?", str3);
                    }
                    String str4 = strM;
                    boolean zI5 = l46Var6.i(context);
                    Object objR7 = l46Var6.R();
                    if (zI5 || objR7 == i8cVar2) {
                        objR7 = new t95(context, e89Var, 0);
                        l46Var6.p0(objR7);
                    }
                    a26 a26Var3 = (a26) objR7;
                    Object objR8 = l46Var6.R();
                    if (objR8 == i8cVar2) {
                        objR8 = new pg(e89Var, 27);
                        l46Var6.p0(objR8);
                    }
                    qk2.p(str4, j09VarY, a26Var3, (a26) objR8, null, x16Var7, l46Var6, 3072, 48);
                } else {
                    l46Var6.Z();
                }
                return wefVar;
            case 7:
                h0e h0eVar = (h0e) obj6;
                jsd jsdVar = (jsd) obj5;
                aw2 aw2Var = (aw2) obj4;
                l46 l46Var7 = (l46) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((en5) obj).getClass();
                if (l46Var7.W(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    for (FeedbackReason feedbackReason : (List) h0eVar.getValue()) {
                        boolean zContains = jsdVar.contains(feedbackReason);
                        boolean zE = l46Var7.e(feedbackReason.ordinal()) | l46Var7.i(aw2Var);
                        Object objR9 = l46Var7.R();
                        if (zE || objR9 == i8cVar2) {
                            objR9 = new n25(jsdVar, feedbackReason, aw2Var, i2);
                            l46Var7.p0(objR9);
                        }
                        x16 x16Var8 = (x16) objR9;
                        dd2 dd2VarB0 = af1.b0(2058101578, new i1(23, feedbackReason), l46Var7);
                        pr4 pr4Var2 = o82.a;
                        long jB = y72.b(((m82) l46Var7.k(pr4Var2)).a, 0.2f);
                        long j2 = ((m82) l46Var7.k(pr4Var2)).a;
                        long j3 = y72.k;
                        auc aucVarE = mh3.E((m82) l46Var7.k(pr4Var2));
                        long j4 = j3 != 16 ? j3 : aucVarE.a;
                        long j5 = j3 != 16 ? j3 : aucVarE.b;
                        long j6 = j3 != 16 ? j3 : aucVarE.c;
                        long j7 = j3 != 16 ? j3 : aucVarE.d;
                        long j8 = j3 != 16 ? j3 : aucVarE.e;
                        long j9 = j3 != 16 ? j3 : aucVarE.f;
                        long j10 = j3 != 16 ? j3 : aucVarE.g;
                        long j11 = j3 != 16 ? j3 : aucVarE.h;
                        if (jB == r14) {
                            jB = aucVarE.i;
                        }
                        long j12 = jB;
                        long j13 = j3 != 16 ? j3 : aucVarE.j;
                        if (j2 == 16) {
                            j2 = aucVarE.k;
                        }
                        long j14 = j2;
                        long j15 = j3 != 16 ? j3 : aucVarE.l;
                        if (j3 == 16) {
                            j3 = aucVarE.m;
                        }
                        kz1.b(zContains, x16Var8, dd2VarB0, null, false, null, new auc(j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j3), null, null, l46Var7, 384);
                    }
                } else {
                    l46Var7.Z();
                }
                return wefVar;
            case 8:
                f96 f96Var = (f96) obj6;
                v86 v86Var = (v86) obj5;
                a26 a26Var4 = (a26) obj4;
                l46 l46Var8 = (l46) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (l46Var8.W(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    c92 c92VarA2 = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Y, l46Var8, 6);
                    int iHashCode4 = Long.hashCode(l46Var8.T);
                    u8a u8aVarM4 = l46Var8.m();
                    g09 g09Var2 = g09.a;
                    j09 j09VarJ4 = m93.J(l46Var8, g09Var2);
                    lf2.q.getClass();
                    l46Var8.j0();
                    if (l46Var8.S) {
                        l46Var8.l(ov7Var);
                    } else {
                        l46Var8.s0();
                    }
                    he2 he2Var5 = hj6.z;
                    dec.l(he2Var5, l46Var8, c92VarA2);
                    he2 he2Var6 = hj6.y;
                    dec.l(he2Var6, l46Var8, u8aVarM4);
                    Integer numValueOf2 = Integer.valueOf(iHashCode4);
                    he2 he2Var7 = hj6.X;
                    dec.l(he2Var7, l46Var8, numValueOf2);
                    dec.k(l46Var8);
                    he2 he2Var8 = hj6.x;
                    dec.l(he2Var8, l46Var8, j09VarJ4);
                    String strQ = afc.q(R.string.gift_card_select_title, l46Var8);
                    pr4 pr4Var3 = l8b.a;
                    long j16 = ((e8b) l46Var8.k(pr4Var3)).t;
                    mue mueVar2 = oue.a;
                    nte.b(strQ, ynb.d0(24.0f, 2.0f, 0.0f, 0.0f, 12, g09Var2), j16, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.f(l46Var8), l46Var8, 48, 0, 131064);
                    t7c t7cVarA3 = s7c.a(new uc0(8.0f, true, new qc0(0)), ndb.y, l46Var8, 6);
                    int iHashCode5 = Long.hashCode(l46Var8.T);
                    u8a u8aVarM5 = l46Var8.m();
                    j09 j09VarJ5 = m93.J(l46Var8, g09Var2);
                    l46Var8.j0();
                    if (l46Var8.S) {
                        l46Var8.l(ov7Var);
                    } else {
                        l46Var8.s0();
                    }
                    dec.l(he2Var5, l46Var8, t7cVarA3);
                    dec.l(he2Var6, l46Var8, u8aVarM5);
                    ib8.s(iHashCode5, l46Var8, he2Var7, l46Var8);
                    dec.l(he2Var8, l46Var8, j09VarJ5);
                    GiftCardSku giftCardSku2 = GiftCardSku.OneMonth;
                    Map map = f96Var.d;
                    e96 e96Var = f96Var.e;
                    GiftCardSku giftCardSku3 = f96Var.a;
                    n07 n07Var2 = (n07) map.get(giftCardSku2);
                    String strY2 = n07Var2 != null ? n07Var2.y() : null;
                    boolean z2 = giftCardSku3 == giftCardSku2;
                    boolean z3 = e96Var instanceof b96;
                    boolean zG3 = l46Var8.g(a26Var4);
                    Object objR10 = l46Var8.R();
                    if (zG3) {
                        i8cVar = i8cVar2;
                    } else {
                        i8cVar = i8cVar2;
                        if (objR10 == i8cVar) {
                        }
                        x16 x16Var9 = (x16) objR10;
                        if (1.0f <= 0.0d) {
                            g37.a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f = Float.MAX_VALUE;
                        } else {
                            f = 1.0f;
                        }
                        pa6.r(giftCardSku2, strY2, z2, z3, v86Var, x16Var9, androidx.compose.ui.platform.b.a(new jw7(f, true), "gift_card_month_sku"), l46Var8, 6);
                        giftCardSku = GiftCardSku.OneYear;
                        n07Var = (n07) f96Var.d.get(giftCardSku);
                        if (n07Var != null) {
                            strY = n07Var.y();
                        } else {
                            strY = null;
                        }
                        if (giftCardSku3 == giftCardSku) {
                            z = true;
                        } else {
                            z = false;
                        }
                        zG = l46Var8.g(a26Var4);
                        objR = l46Var8.R();
                        if (zG || objR == i8cVar) {
                            objR = new zh1(a26Var4, 19);
                            l46Var8.p0(objR);
                        }
                        x16 x16Var10 = (x16) objR;
                        if (1.0f <= 0.0d) {
                            g37.a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f2 = Float.MAX_VALUE;
                        } else {
                            f2 = 1.0f;
                        }
                        pa6.r(giftCardSku, strY, z, z3, v86Var, x16Var10, androidx.compose.ui.platform.b.a(new jw7(f2, true), "gift_card_year_sku"), l46Var8, 6);
                        l46Var8.r(true);
                        if (giftCardSku3 == giftCardSku) {
                            l46Var8.f0(1082607916);
                            nte.b(afc.q(R.string.gift_card_annual_benefit, l46Var8), androidx.compose.ui.platform.b.a(ynb.d0(24.0f, 4.0f, 0.0f, 0.0f, 12, g09Var2), "gift_card_annual_benefit"), ((e8b) l46Var8.k(pr4Var3)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var8), l46Var8, 48, 0, 131064);
                            l46Var8.r(false);
                        } else {
                            l46Var8.f0(1082974553);
                            l46Var8.r(false);
                        }
                        l46Var8.r(true);
                    }
                    objR10 = new zh1(a26Var4, 18);
                    l46Var8.p0(objR10);
                    x16 x16Var11 = (x16) objR10;
                    if (1.0f <= 0.0d) {
                        g37.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    } else {
                        f = 1.0f;
                    }
                    pa6.r(giftCardSku2, strY2, z2, z3, v86Var, x16Var11, androidx.compose.ui.platform.b.a(new jw7(f, true), "gift_card_month_sku"), l46Var8, 6);
                    giftCardSku = GiftCardSku.OneYear;
                    n07Var = (n07) f96Var.d.get(giftCardSku);
                    if (n07Var != null) {
                        strY = n07Var.y();
                    } else {
                        strY = null;
                    }
                    if (giftCardSku3 == giftCardSku) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zG = l46Var8.g(a26Var4);
                    objR = l46Var8.R();
                    if (zG) {
                        objR = new zh1(a26Var4, 19);
                        l46Var8.p0(objR);
                    } else {
                        objR = new zh1(a26Var4, 19);
                        l46Var8.p0(objR);
                    }
                    x16 x16Var12 = (x16) objR;
                    if (1.0f <= 0.0d) {
                        g37.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f2 = Float.MAX_VALUE;
                    } else {
                        f2 = 1.0f;
                    }
                    pa6.r(giftCardSku, strY, z, z3, v86Var, x16Var12, androidx.compose.ui.platform.b.a(new jw7(f2, true), "gift_card_year_sku"), l46Var8, 6);
                    l46Var8.r(true);
                    if (giftCardSku3 == giftCardSku) {
                        l46Var8.f0(1082607916);
                        nte.b(afc.q(R.string.gift_card_annual_benefit, l46Var8), androidx.compose.ui.platform.b.a(ynb.d0(24.0f, 4.0f, 0.0f, 0.0f, 12, g09Var2), "gift_card_annual_benefit"), ((e8b) l46Var8.k(pr4Var3)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var8), l46Var8, 48, 0, 131064);
                        l46Var8.r(false);
                    } else {
                        l46Var8.f0(1082974553);
                        l46Var8.r(false);
                    }
                    l46Var8.r(true);
                } else {
                    l46Var8.Z();
                }
                return wefVar;
            case 9:
                String str5 = (String) obj6;
                l26 l26Var = (l26) obj5;
                GiftCardItem giftCardItem = (GiftCardItem) obj4;
                l46 l46Var9 = (l46) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (l46Var9.W(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    boolean zG4 = l46Var9.g(l26Var) | l46Var9.g(str5) | l46Var9.i(giftCardItem);
                    Object objR11 = l46Var9.R();
                    if (zG4 || objR11 == i8cVar2) {
                        objR11 = new n25(l26Var, str5, giftCardItem, 5);
                        l46Var9.p0(objR11);
                    }
                    pa6.q(str5, (x16) objR11, l46Var9, 0);
                } else {
                    l46Var9.Z();
                }
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                he2 he2Var9 = hj6.x;
                he2 he2Var10 = hj6.X;
                he2 he2Var11 = hj6.y;
                he2 he2Var12 = hj6.z;
                g07 g07Var = (g07) obj6;
                j18 j18Var = (j18) obj5;
                a26 a26Var5 = (a26) obj4;
                xw9 xw9Var3 = (xw9) obj;
                l46 l46Var10 = (l46) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                lx0 lx0Var = ndb.f;
                xw9Var3.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= l46Var10.g(xw9Var3) ? 4 : 2;
                }
                if (!l46Var10.W(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    l46Var10.Z();
                } else if (pa7.t(g07Var, d07.a)) {
                    l46Var10.f0(-848085011);
                    j09 j09VarY2 = ynb.Y(b.c, xw9Var3);
                    xn8 xn8VarC = s21.c(lx0Var, false);
                    int iHashCode6 = Long.hashCode(l46Var10.T);
                    u8a u8aVarM6 = l46Var10.m();
                    j09 j09VarJ6 = m93.J(l46Var10, j09VarY2);
                    lf2.q.getClass();
                    l46Var10.j0();
                    if (l46Var10.S) {
                        l46Var10.l(ov7Var);
                    } else {
                        l46Var10.s0();
                    }
                    dec.l(he2Var12, l46Var10, xn8VarC);
                    dec.l(he2Var11, l46Var10, u8aVarM6);
                    ib8.s(iHashCode6, l46Var10, he2Var10, l46Var10);
                    dec.l(he2Var9, l46Var10, j09VarJ6);
                    c92 c92VarA3 = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Z, l46Var10, 54);
                    int iHashCode7 = Long.hashCode(l46Var10.T);
                    u8a u8aVarM7 = l46Var10.m();
                    j09 j09VarJ7 = m93.J(l46Var10, g09Var);
                    l46Var10.j0();
                    if (l46Var10.S) {
                        l46Var10.l(ov7Var);
                    } else {
                        l46Var10.s0();
                    }
                    dec.l(he2Var12, l46Var10, c92VarA3);
                    dec.l(he2Var11, l46Var10, u8aVarM7);
                    ib8.s(iHashCode7, l46Var10, he2Var10, l46Var10);
                    dec.l(he2Var9, l46Var10, j09VarJ7);
                    gu6.b(od4.A(R.drawable.ic_no_messages, 0, l46Var10), null, b.l(g09Var, 48.0f), 0L, l46Var10, 440, 8);
                    String strQ2 = afc.q(R.string.in_app_message_no_message, l46Var10);
                    mue mueVar3 = oue.a;
                    nte.b(strQ2, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.e(l46Var10), l46Var10, 0, 0, 131070);
                    tec.s(l46Var10, true, true, false);
                } else if (pa7.t(g07Var, e07.a)) {
                    l46Var10.f0(-847375390);
                    j09 j09VarY3 = ynb.Y(b.c, xw9Var3);
                    xn8 xn8VarC2 = s21.c(lx0Var, false);
                    int iHashCode8 = Long.hashCode(l46Var10.T);
                    u8a u8aVarM8 = l46Var10.m();
                    j09 j09VarJ8 = m93.J(l46Var10, j09VarY3);
                    lf2.q.getClass();
                    l46Var10.j0();
                    if (l46Var10.S) {
                        l46Var10.l(ov7Var);
                    } else {
                        l46Var10.s0();
                    }
                    dec.l(he2Var12, l46Var10, xn8VarC2);
                    dec.l(he2Var11, l46Var10, u8aVarM8);
                    ib8.s(iHashCode8, l46Var10, he2Var10, l46Var10);
                    dec.l(he2Var9, l46Var10, j09VarJ8);
                    axa.a(0.0f, 0.0f, 0, 0, 63, 0L, 0L, l46Var10, null);
                    l46Var10.r(true);
                    l46Var10.r(false);
                } else {
                    if (!(g07Var instanceof f07)) {
                        throw tec.d(-2105568351, l46Var10, false);
                    }
                    l46Var10.f0(-847096979);
                    j09 j09VarY4 = ynb.Y(b.c, xw9Var3);
                    bx9 bx9Var2 = new bx9(24.0f, 16.0f, 24.0f, 16.0f);
                    uc0 uc0Var2 = new uc0(32.0f, true, new qc0(0));
                    boolean zI6 = l46Var10.i(g07Var) | l46Var10.g(a26Var5);
                    Object objR12 = l46Var10.R();
                    if (zI6 || objR12 == i8cVar2) {
                        objR12 = new so5(14, g07Var, a26Var5);
                        l46Var10.p0(objR12);
                    }
                    af1.s(j09VarY4, j18Var, bx9Var2, uc0Var2, null, null, false, null, (a26) objR12, l46Var10, 24576, 488);
                    l46Var10.r(false);
                }
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                a29 a29Var = (a29) obj6;
                final x16 x16Var13 = (x16) obj5;
                final s69 s69Var3 = (s69) obj4;
                final xw9 xw9Var4 = (xw9) obj;
                l46 l46Var11 = (l46) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                xw9Var4.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= l46Var11.g(xw9Var4) ? 4 : 2;
                }
                if (l46Var11.W(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    kn2.c(a29Var, null, null, null, null, null, af1.b0(-740964975, new o26() { // from class: tg4
                        @Override // defpackage.o26
                        public final Object t(Object obj7, Object obj8, Object obj9, Object obj10) {
                            int i8 = i2;
                            ov7 ov7Var2 = LayoutNode.h1;
                            wef wefVar3 = wef.a;
                            i8c i8cVar3 = sf2.a;
                            s69 s69Var4 = s69Var3;
                            xw9 xw9Var5 = xw9Var4;
                            x16 x16Var14 = x16Var13;
                            switch (i8) {
                                case 0:
                                    fh4 fh4Var3 = (fh4) obj8;
                                    l46 l46Var12 = (l46) obj9;
                                    int iIntValue11 = ((Integer) obj10).intValue();
                                    ((ly) obj7).getClass();
                                    fh4Var3.getClass();
                                    if ((iIntValue11 & 48) == 0) {
                                        iIntValue11 |= (iIntValue11 & 64) == 0 ? l46Var12.g(fh4Var3) : l46Var12.i(fh4Var3) ? 32 : 16;
                                    }
                                    if (!l46Var12.W(iIntValue11 & 1, (iIntValue11 & 145) != 144)) {
                                        l46Var12.Z();
                                    } else if (fh4Var3 instanceof ch4) {
                                        l46Var12.f0(1876959632);
                                        boolean zG5 = l46Var12.g(x16Var14);
                                        Object objR13 = l46Var12.R();
                                        if (zG5 || objR13 == i8cVar3) {
                                            objR13 = new bh4(x16Var14, null);
                                            l46Var12.p0(objR13);
                                        }
                                        af1.o((l26) objR13, l46Var12, wefVar3);
                                        l46Var12.r(false);
                                    } else if (fh4Var3.equals(dh4.b)) {
                                        l46Var12.f0(1877099039);
                                        FillElement fillElement = b.c;
                                        xn8 xn8VarC3 = s21.c(ndb.f, false);
                                        int iHashCode9 = Long.hashCode(l46Var12.T);
                                        u8a u8aVarM9 = l46Var12.m();
                                        j09 j09VarJ9 = m93.J(l46Var12, fillElement);
                                        lf2.q.getClass();
                                        l46Var12.j0();
                                        if (l46Var12.S) {
                                            l46Var12.l(ov7Var2);
                                        } else {
                                            l46Var12.s0();
                                        }
                                        dec.l(hj6.z, l46Var12, xn8VarC3);
                                        dec.l(hj6.y, l46Var12, u8aVarM9);
                                        dec.l(hj6.X, l46Var12, Integer.valueOf(iHashCode9));
                                        dec.k(l46Var12);
                                        dec.l(hj6.x, l46Var12, j09VarJ9);
                                        jgb.w(null, 0L, 0.0f, l46Var12, 0);
                                        l46Var12.r(true);
                                        l46Var12.r(false);
                                    } else {
                                        if (!(fh4Var3 instanceof eh4)) {
                                            throw tec.d(1307471693, l46Var12, false);
                                        }
                                        l46Var12.f0(1877324936);
                                        j09 j09VarD1 = mh3.d0(ynb.b0(20.0f, 0.0f, ynb.Y(b.c, xw9Var5), 2), mh3.T(l46Var12), false, 14);
                                        eh4 eh4Var = (eh4) fh4Var3;
                                        boolean zG6 = l46Var12.g(s69Var4);
                                        Object objR14 = l46Var12.R();
                                        if (zG6 || objR14 == i8cVar3) {
                                            objR14 = new pr1(s69Var4, 3);
                                            l46Var12.p0(objR14);
                                        }
                                        if9.e(j09VarD1, eh4Var, false, 0, (a26) objR14, l46Var12, 64 | (iIntValue11 & 112), 12);
                                        l46Var12.r(false);
                                    }
                                    return wefVar3;
                                default:
                                    a29 a29Var2 = (a29) obj8;
                                    l46 l46Var13 = (l46) obj9;
                                    int iIntValue12 = ((Integer) obj10).intValue();
                                    ((ly) obj7).getClass();
                                    a29Var2.getClass();
                                    if ((iIntValue12 & 48) == 0) {
                                        iIntValue12 |= (iIntValue12 & 64) == 0 ? l46Var13.g(a29Var2) : l46Var13.i(a29Var2) ? 32 : 16;
                                    }
                                    int i9 = iIntValue12;
                                    if (!l46Var13.W(i9 & 1, (i9 & 145) != 144)) {
                                        l46Var13.Z();
                                    } else if (a29Var2 instanceof x19) {
                                        l46Var13.f0(2044419474);
                                        boolean zG7 = l46Var13.g(x16Var14);
                                        Object objR15 = l46Var13.R();
                                        if (zG7 || objR15 == i8cVar3) {
                                            objR15 = new w19(x16Var14, null);
                                            l46Var13.p0(objR15);
                                        }
                                        af1.o((l26) objR15, l46Var13, wefVar3);
                                        l46Var13.r(false);
                                    } else if (a29Var2.equals(y19.b)) {
                                        l46Var13.f0(2044534887);
                                        FillElement fillElement2 = b.c;
                                        xn8 xn8VarC4 = s21.c(ndb.f, false);
                                        int iHashCode10 = Long.hashCode(l46Var13.T);
                                        u8a u8aVarM10 = l46Var13.m();
                                        j09 j09VarJ10 = m93.J(l46Var13, fillElement2);
                                        lf2.q.getClass();
                                        l46Var13.j0();
                                        if (l46Var13.S) {
                                            l46Var13.l(ov7Var2);
                                        } else {
                                            l46Var13.s0();
                                        }
                                        dec.l(hj6.z, l46Var13, xn8VarC4);
                                        dec.l(hj6.y, l46Var13, u8aVarM10);
                                        dec.l(hj6.X, l46Var13, Integer.valueOf(iHashCode10));
                                        dec.k(l46Var13);
                                        dec.l(hj6.x, l46Var13, j09VarJ10);
                                        jgb.w(null, 0L, 0.0f, l46Var13, 0);
                                        l46Var13.r(true);
                                        l46Var13.r(false);
                                    } else {
                                        if (!(a29Var2 instanceof z19)) {
                                            throw tec.d(897231599, l46Var13, false);
                                        }
                                        l46Var13.f0(2044761807);
                                        j09 j09VarD2 = mh3.d0(ynb.b0(20.0f, 0.0f, ynb.Y(b.c, xw9Var5), 2), mh3.T(l46Var13), false, 14);
                                        z19 z19Var = (z19) a29Var2;
                                        boolean zG8 = l46Var13.g(s69Var4);
                                        Object objR16 = l46Var13.R();
                                        if (zG8 || objR16 == i8cVar3) {
                                            objR16 = new pr1(s69Var4, 6);
                                            l46Var13.p0(objR16);
                                        }
                                        k99.i(j09VarD2, z19Var, false, 0, (a26) objR16, l46Var13, 64 | (i9 & 112), 12);
                                        l46Var13.r(false);
                                    }
                                    return wefVar3;
                            }
                        }
                    }, l46Var11), l46Var11, 1572872, 62);
                } else {
                    l46Var11.Z();
                }
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                final a26 a26Var6 = (a26) obj6;
                final s69 s69Var4 = (s69) obj5;
                a29 a29Var2 = (a29) obj4;
                l46 l46Var12 = (l46) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (l46Var12.W(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    boolean zG5 = l46Var12.g(a26Var6) | l46Var12.g(s69Var4);
                    Object objR13 = l46Var12.R();
                    if (zG5 || objR13 == i8cVar2) {
                        objR13 = new x16() { // from class: ug4
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i8 = i2;
                                wef wefVar3 = wef.a;
                                s69 s69Var5 = s69Var4;
                                a26 a26Var7 = a26Var6;
                                switch (i8) {
                                    case 0:
                                        a26Var7.d(Integer.valueOf(((sz9) s69Var5).j()));
                                        break;
                                    default:
                                        a26Var7.d(Integer.valueOf(((sz9) s69Var5).j()));
                                        break;
                                }
                                return wefVar3;
                            }
                        };
                        l46Var12.p0(objR13);
                    }
                    bm8.h((x16) objR13, null, a29Var2 instanceof z19, null, null, kn2.c, l46Var12, 1572864, 58);
                } else {
                    l46Var12.Z();
                }
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return a(obj, obj2, obj3);
            case 14:
                return e(obj, obj2, obj3);
            case 15:
                return f(obj, obj2, obj3);
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return g(obj, obj2, obj3);
            case 17:
                return h(obj, obj2, obj3);
            case 18:
                return i(obj, obj2, obj3);
            case 19:
                return j(obj, obj2, obj3);
            case 20:
                return k(obj, obj2, obj3);
            case 21:
                return l(obj, obj2, obj3);
            case 22:
                return n(obj, obj2, obj3);
            case 23:
                return o(obj, obj2, obj3);
            case 24:
                return p(obj, obj2, obj3);
            default:
                qhe qheVar = (qhe) obj6;
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj5;
                h0e h0eVar2 = (h0e) obj4;
                e31 e31Var = (e31) obj;
                l46 l46Var13 = (l46) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                e31Var.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= l46Var13.g(e31Var) ? 4 : 2;
                }
                if (l46Var13.W(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    float fD = e31Var.d() / 338.0f;
                    h4g.g(qheVar, tarotSkinIdentify, e31Var.d(), e31Var.b(g09Var), l46Var13, 0);
                    h4g.d("Yes", ((y72) h0eVar2.getValue()).a, fD, ynb.d0(fD * 44.0f, 0.0f, 0.0f, 0.0f, 14, e31Var.b(g09Var)), l46Var13, 0);
                    h4g.h(afc.q(r8c.f(qheVar), l46Var13), ((y72) h0eVar2.getValue()).a, e31Var.d(), fD, e31Var.a(g09Var, ndb.v), l46Var13, 0);
                } else {
                    l46Var13.Z();
                }
                return wefVar;
        }
    }
}
