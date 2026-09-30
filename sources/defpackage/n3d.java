package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import android.net.Uri;
import android.text.TextUtils;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.File;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: loaded from: classes.dex */
public abstract class n3d {
    public static final void a(j09 j09Var, final mmd mmdVar, float f, boolean z, x16 x16Var, l46 l46Var, int i) {
        j09 j09Var2;
        float f2;
        long j;
        mmdVar.getClass();
        TarotSkinIdentify tarotSkinIdentify = mmdVar.a;
        x16Var.getClass();
        l46Var.h0(806445786);
        int i2 = i | 6 | (l46Var.g(mmdVar) ? 32 : 16) | 384 | (l46Var.i(x16Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (l46Var.W(i2 & 1, (i2 & 9363) != 9362)) {
            final mld mldVarQ = hfc.q(tarotSkinIdentify);
            boolean z2 = z && tarotSkinIdentify.getIsModianCollab();
            Integer numI = mldVarQ.i();
            Integer num = (numI == null || !z2) ? null : numI;
            y6c y6cVar = eze.a(l46Var).a.i;
            pr4 pr4Var = l8b.a;
            if (k8b.e((e8b) l46Var.k(pr4Var))) {
                l46Var.f0(1900305347);
                j = ((e8b) l46Var.k(pr4Var)).c;
                l46Var.r(false);
            } else {
                l46Var.f0(1900306021);
                l46Var.r(false);
                j = y72.j;
            }
            final boolean z3 = z2;
            final float f3 = 1.0f;
            final Integer num2 = num;
            j09Var2 = g09.a;
            bzd.c(x16Var, j09Var2, false, y6cVar, z5c.p(j, 0L, l46Var, 24576, 14), null, af1.b0(-1477193329, new n26() { // from class: rnd
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    String strY;
                    boolean z4;
                    String strB;
                    l46 l46Var2 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((d92) obj).getClass();
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                        xn8 xn8VarC = s21.c(ndb.b, false);
                        int iHashCode = Long.hashCode(l46Var2.T);
                        u8a u8aVarM = l46Var2.m();
                        g09 g09Var = g09.a;
                        j09 j09VarJ = m93.J(l46Var2, g09Var);
                        lf2.q.getClass();
                        l46Var2.j0();
                        boolean z5 = l46Var2.S;
                        ov7 ov7Var = LayoutNode.h1;
                        if (z5) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        he2 he2Var = hj6.z;
                        dec.l(he2Var, l46Var2, xn8VarC);
                        he2 he2Var2 = hj6.y;
                        dec.l(he2Var2, l46Var2, u8aVarM);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        he2 he2Var3 = hj6.X;
                        dec.l(he2Var3, l46Var2, numValueOf);
                        dec.k(l46Var2);
                        he2 he2Var4 = hj6.x;
                        dec.l(he2Var4, l46Var2, j09VarJ);
                        mld mldVar = mldVarQ;
                        bzd.b(Integer.valueOf(((old) s72.F0(mldVar.a(l46Var2))).a), null, (aw6) l46Var2.k(n72.a), dj6.w(k8b.h(k8b.g(g09Var, new agb(3), l46Var2, 6), new agb(4), l46Var2, 0), f3), an2.a, null, l46Var2, 12582960, 0, 3952);
                        if (z3) {
                            l46Var2.f0(-1664365881);
                            hy9.b(ynb.Z(d31.a.a(g09Var, ndb.d), we6.e(l46Var2) ? 40.0f : 24.0f), l46Var2, 0);
                            l46Var2.r(false);
                        } else {
                            l46Var2.f0(-1664052595);
                            l46Var2.r(false);
                        }
                        l46Var2.r(true);
                        j09 j09VarD0 = ynb.d0(0.0f, 12.0f, 0.0f, 20.0f, 5, ynb.b0(24.0f, 0.0f, g09Var, 2));
                        jx0 jx0Var = ndb.Y;
                        c92 c92VarA = a92.a(xc0.c, jx0Var, l46Var2, 0);
                        int iHashCode2 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM2 = l46Var2.m();
                        j09 j09VarJ2 = m93.J(l46Var2, j09VarD0);
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(he2Var, l46Var2, c92VarA);
                        dec.l(he2Var2, l46Var2, u8aVarM2);
                        ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                        dec.l(he2Var4, l46Var2, j09VarJ2);
                        Integer num3 = num2;
                        c92 c92VarA2 = a92.a(new uc0(num3 != null ? 4.0f : 8.0f, true, new qc0(0)), jx0Var, l46Var2, 0);
                        int iHashCode3 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM3 = l46Var2.m();
                        j09 j09VarJ3 = m93.J(l46Var2, g09Var);
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(he2Var, l46Var2, c92VarA2);
                        dec.l(he2Var2, l46Var2, u8aVarM3);
                        ib8.s(iHashCode3, l46Var2, he2Var3, l46Var2);
                        dec.l(he2Var4, l46Var2, j09VarJ3);
                        String strQ = afc.q(mldVar.m(), l46Var2);
                        mue mueVar = pue.a;
                        nte.b(strQ, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.o(l46Var2), 0L, 0L, ar5.d, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, 0, 0L, null, null, 16777179), l46Var2, 0, 0, 131070);
                        if (num3 == null) {
                            l46Var2.f0(1668229732);
                        } else {
                            l46Var2.f0(1668229733);
                            hy9.d(num3.intValue(), 0, l46Var2, null);
                        }
                        l46Var2.r(false);
                        nte.b(afc.q(mldVar.l(), l46Var2), null, ((e8b) l46Var2.k(l8b.a)).t, 0L, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, oue.a, l46Var2, 0, 24960, 110586);
                        l46 l46Var3 = l46Var2;
                        ib8.t(l46Var3, true, g09Var, 12.0f, l46Var3);
                        mmd mmdVar2 = mmdVar;
                        boolean z6 = mmdVar2.c;
                        n07 n07Var = mmdVar2.b;
                        if (z6) {
                            l46Var3.f0(609124380);
                            afc.a(null, l46Var3, 0);
                            l46Var3.r(false);
                            z4 = true;
                        } else {
                            l46Var3.f0(609201694);
                            j09 j09VarU0 = kj0.u0(b.b(100.0f, 0.0f, g09Var, 2), n07Var == null, ((s5d) l46Var3.k(u5d.a)).b, vd0.u0(l46Var3));
                            t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(0)), ndb.X, l46Var3, 54);
                            int iHashCode4 = Long.hashCode(l46Var3.T);
                            u8a u8aVarM4 = l46Var3.m();
                            j09 j09VarJ4 = m93.J(l46Var3, j09VarU0);
                            l46Var3.j0();
                            if (l46Var3.S) {
                                l46Var3.l(ov7Var);
                            } else {
                                l46Var3.s0();
                            }
                            dec.l(he2Var, l46Var3, t7cVarA);
                            dec.l(he2Var2, l46Var3, u8aVarM4);
                            ib8.s(iHashCode4, l46Var3, he2Var3, l46Var3);
                            dec.l(he2Var4, l46Var3, j09VarJ4);
                            if (n07Var == null || (strY = n07Var.y()) == null) {
                                strY = "";
                            }
                            long jL = w6c.l(24);
                            ar5 ar5Var = ar5.e;
                            nte.b(strY, g09Var, 0L, jL, ar5Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var3, 1597488, 0, 262060);
                            nte.b((n07Var == null || (strB = n07Var.b()) == null) ? "" : strB, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a((mue) l46Var3.k(nte.a), y72.b(((m82) l46Var3.k(o82.a)).q, 0.48f), w6c.l(13), ar5Var, null, 0L, null, 0, 0L, null, null, 16773112), l46Var3, 0, 0, 131070);
                            l46Var3 = l46Var3;
                            z4 = true;
                            l46Var3.r(true);
                            l46Var3.r(false);
                        }
                        l46Var3.r(z4);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, ((i2 >> 12) & 14) | 100663344);
            f2 = 1.0f;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            f2 = f;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new goc(j09Var2, mmdVar, f2, z, x16Var, i);
        }
    }

    public static final void b(int i, int i2, l46 l46Var, j09 j09Var, String str) {
        int i3;
        str.getClass();
        l46Var.h0(-999423011);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= l46Var.g(str) ? 32 : 16;
        }
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                j09Var = g09.a;
            }
            gu8.a((i3 & 112) | (i3 & 14) | 384, af1.b0(-1356262098, new y01(k8b.f((e8b) l46Var.k(l8b.a)), str, 9), l46Var), l46Var, j09Var, str);
        } else {
            l46Var.Z();
        }
        j09 j09Var2 = j09Var;
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new mc2(j09Var2, str, i, i2, 5);
        }
    }

    public static final void c(j09 j09Var, t2g t2gVar, LocalDate localDate, List list, x16 x16Var, a26 a26Var, l46 l46Var, int i) {
        j09 j09Var2;
        l46 l46Var2 = l46Var;
        t2gVar.getClass();
        localDate.getClass();
        a26Var.getClass();
        l46Var2.h0(-1205460472);
        int i2 = i | 6 | (l46Var2.g(t2gVar) ? 32 : 16) | (l46Var2.i(localDate) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.g(list) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var2.i(x16Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var2.i(a26Var) ? 131072 : 65536);
        if (l46Var2.W(i2 & 1, (74899 & i2) != 74898)) {
            t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var2, g09Var);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, t7cVarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            vd0.G(new jw7(1.0f, true), t2gVar, false, false, ynb.q(0.0f, 8.0f, 1), af1.b0(1631295560, new p93(localDate, list, a26Var, 8), l46Var2), l46Var2, (i2 & 112) | 1769472);
            oa7.n(b.p(ynb.d0(0.0f, 0.0f, 8.0f, 0.0f, 11, b.d(g09Var, 48.0f)), 0.0f), 0.0f, g82.a(l46Var), l46Var, 6, 2);
            j09 j09VarE = oa7.E(b.b(44.0f, 0.0f, g09Var, 2), a7c.b(8.0f));
            boolean z2 = (i2 & 57344) == 16384;
            Object objR = l46Var.R();
            if (z2 || objR == sf2.a) {
                objR = new yca(19, x16Var);
                l46Var.p0(objR);
            }
            j09 j09VarC = androidx.compose.foundation.b.c(j09VarE, false, null, null, (x16) objR, 15);
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var, 48);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarC);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, c92VarA);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            String strQ = afc.q(R.string.text_uncollapsed, l46Var);
            long jL = w6c.l(12);
            pr4 pr4Var = o82.a;
            nte.b(strQ, null, ((m82) l46Var.k(pr4Var)).s, jL, ar5.c, null, w6c.k(0.07d), null, new jme(3), 0L, 0, false, 1, 0, null, null, l46Var, 102260736, 24576, 244394);
            j09 j09VarW = dj6.w(b.d(ynb.a0(g09Var, 8.0f, 4.0f), 24.0f), 1.5f);
            long j = ((e8b) l46Var.k(l8b.a)).m;
            pr4 pr4Var2 = u5d.a;
            j09 j09VarW2 = db6.w(tm7.o(j09VarW, j, ((s5d) l46Var.k(pr4Var2)).c), 0.0f, g82.a(l46Var), ((s5d) l46Var.k(pr4Var2)).c);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode3 = Long.hashCode(l46Var.T);
            u8a u8aVarM3 = l46Var.m();
            j09 j09VarJ3 = m93.J(l46Var, j09VarW2);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, xn8VarC);
            dec.l(he2Var2, l46Var, u8aVarM3);
            ib8.s(iHashCode3, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ3);
            gu6.a(if9.x(), null, g09Var, ((m82) l46Var.k(pr4Var)).s, l46Var, 432, 0);
            l46Var2 = l46Var;
            tec.s(l46Var2, true, true, true);
            j09Var2 = g09Var;
        } else {
            l46Var2.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new iq1(j09Var2, t2gVar, localDate, list, x16Var, a26Var, i);
        }
    }

    public static final String d(SolarTerm solarTerm, String str) {
        String str2;
        solarTerm.getClass();
        int i = oic.a[solarTerm.ordinal()];
        if (i == 1) {
            str2 = "SR_CF";
        } else if (i == 2) {
            str2 = "SR_XZ";
        } else if (i == 3) {
            str2 = "SR_QF";
        } else if (i == 4) {
            str2 = "SR_DZ";
        } else {
            if (i != 5) {
                ap.c();
                return null;
            }
            str2 = null;
        }
        if (str2 != null) {
            return ib8.j(str2, "_", str);
        }
        return null;
    }

    public static final String e(int i, SolarTerm solarTerm) {
        String str;
        solarTerm.getClass();
        int i2 = oic.a[solarTerm.ordinal()];
        if (i2 == 1) {
            str = "spring_equinox";
        } else if (i2 == 2) {
            str = "summer_solstice";
        } else if (i2 == 3) {
            str = "autumn_equinox";
        } else if (i2 == 4) {
            str = "winter_solstice";
        } else {
            if (i2 != 5) {
                ap.c();
                return null;
            }
            str = null;
        }
        if (str != null) {
            if (i <= 0) {
                str = null;
            }
            if (str != null) {
                return i + "_" + str;
            }
        }
        return null;
    }

    public static final void f(rxb rxbVar, float f, long j) {
        float fCeil = 0.0f;
        if (!yi4.b(f, Float.NaN)) {
            fCeil = yi4.b(f, 0.0f) ? 1.0f : (float) Math.ceil(f * rxbVar.a);
        }
        rxbVar.e((byte) 8, rxbVar.z, rxbVar.X);
        a6e a6eVar = rxbVar.c;
        if (a6eVar != null) {
            a6eVar.a |= 256;
            a6eVar.k = fCeil;
        }
        rxbVar.e((byte) 35, rxbVar.z, rxbVar.X);
        vz vzVar = rxbVar.z;
        vz vzVar2 = rxbVar.X;
        ggf ggfVar = ggf.a;
        if (vzVar == ggfVar) {
            if ((rxbVar.y & 1) != 0) {
                q69 q69Var = rxbVar.g;
                if (q69Var == null || (vzVar = (vz) q69Var.b(50)) == null) {
                    vzVar = sxb.a;
                }
            } else {
                vzVar = null;
            }
        }
        if (vzVar2 == ggfVar) {
            if ((rxbVar.y & 1) != 0) {
                q69 q69Var2 = rxbVar.v;
                if (q69Var2 == null || (vzVar2 = (vz) q69Var2.b(50)) == null) {
                    vzVar2 = sxb.a;
                }
            } else {
                vzVar2 = null;
            }
        }
        rxbVar.y = (vzVar == null || vzVar2 == null) ? rxbVar.y & (-2) : rxbVar.y | 1;
        rxbVar.g(50, vzVar, vzVar2);
        a6e a6eVar2 = rxbVar.c;
        if (a6eVar2 != null) {
            a6eVar2.d(j);
        }
    }

    public static final void g(use useVar) {
        une uneVarH = useVar.h();
        try {
            uneVarH.c(0, uneVarH.c.length(), "");
            xdc.s(uneVarH);
            useVar.a(uneVarH);
        } finally {
            useVar.c();
        }
    }

    public static final List h(eue eueVar, p89 p89Var) {
        if (p89Var != null && p89Var.c != 0) {
            return s72.j1(p89Var.f());
        }
        if (eueVar != null) {
            long j = eueVar.a;
            if (!eue.d(j)) {
                return t72.H(new j00(new xtd(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, mne.c, null, 61439), eue.g(j), eue.f(j)));
            }
        }
        return pu4.a;
    }

    public static final i4f i(i09 i09Var, Object obj) {
        wo0 wo0Var;
        if (!i09Var.a.Y) {
            i37.c("visitAncestors called on an unattached node");
        }
        i09 i09Var2 = i09Var.a.e;
        LayoutNode layoutNodeS0 = vd0.s0(i09Var);
        while (layoutNodeS0 != null) {
            if ((((i09) layoutNodeS0.V0.g).d & 262144) != 0) {
                while (i09Var2 != null) {
                    if ((i09Var2.c & 262144) != 0) {
                        i09 i09VarM0 = i09Var2;
                        p89 p89Var = null;
                        while (i09VarM0 != null) {
                            if (i09VarM0 instanceof i4f) {
                                i4f i4fVar = (i4f) i09VarM0;
                                if (obj.equals(i4fVar.q())) {
                                    return i4fVar;
                                }
                            }
                            if ((i09VarM0.c & 262144) != 0 && (i09VarM0 instanceof sv3)) {
                                int i = 0;
                                for (i09 i09Var3 = ((sv3) i09VarM0).E0; i09Var3 != null; i09Var3 = i09Var3.f) {
                                    if ((i09Var3.c & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            i09VarM0 = i09Var3;
                                        } else {
                                            if (p89Var == null) {
                                                p89Var = new p89(0, new i09[16]);
                                            }
                                            if (i09VarM0 != null) {
                                                p89Var.b(i09VarM0);
                                                i09VarM0 = null;
                                            }
                                            p89Var.b(i09Var3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            i09VarM0 = vd0.m0(p89Var);
                        }
                    }
                    i09Var2 = i09Var2.e;
                }
            }
            layoutNodeS0 = layoutNodeS0.F();
            i09Var2 = (layoutNodeS0 == null || (wo0Var = layoutNodeS0.V0) == null) ? null : (zde) wo0Var.f;
        }
        return null;
    }

    public static final xse j(une uneVar) {
        nue nueVar = uneVar.d;
        if (nueVar != null) {
            return new xse(new nue(nueVar, false), uneVar.c.length());
        }
        return null;
    }

    public static LinkedHashSet k(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(bm8.F(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && pa7.t(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set l(Set set, Iterable iterable) {
        Collection<?> collectionH0 = x72.h0(iterable);
        if (collectionH0.isEmpty()) {
            return s72.o1(set);
        }
        if (!(collectionH0 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionH0);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionH0).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static LinkedHashSet m(Set set, Iterable iterable) {
        int size;
        set.getClass();
        iterable.getClass();
        Integer numValueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        if (numValueOf != null) {
            size = set.size() + numValueOf.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(bm8.F(size));
        linkedHashSet.addAll(set);
        x72.g0(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static LinkedHashSet n(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(bm8.F(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static final use o(String str, l46 l46Var, int i) {
        if ((i & 1) != 0) {
            str = "";
        }
        int length = str.length();
        long jB = u3c.b(length, length);
        Object[] objArr = new Object[0];
        qfc qfcVar = qfc.g;
        boolean zG = l46Var.g(str) | l46Var.f(jB);
        Object objR = l46Var.R();
        if (zG || objR == sf2.a) {
            objR = new dw(str, jB, 3);
            l46Var.p0(objR);
        }
        return (use) vfh.J(objArr, qfcVar, (x16) objR, l46Var, 48);
    }

    public static Set p(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        setSingleton.getClass();
        return setSingleton;
    }

    public static final void q(use useVar, String str) {
        une uneVarH = useVar.h();
        try {
            uneVarH.c(0, uneVarH.c.length(), str);
            xdc.s(uneVarH);
            useVar.a(uneVarH);
        } finally {
            useVar.c();
        }
    }

    public static final void r(rxb rxbVar, float f) {
        rxbVar.e((byte) 9, rxbVar.z, rxbVar.X);
        a6e a6eVar = rxbVar.c;
        if (a6eVar != null) {
            a6eVar.C(rxbVar.a * f);
        }
        rxbVar.e((byte) 10, rxbVar.z, rxbVar.X);
        a6e a6eVar2 = rxbVar.c;
        if (a6eVar2 != null) {
            a6eVar2.x(f * rxbVar.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [a26] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [i09] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [i09] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [p89] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [p89] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static final void s(rv3 rv3Var, Object obj, a26 a26Var) {
        wo0 wo0Var;
        if (!((i09) rv3Var).a.Y) {
            i37.c("visitAncestors called on an unattached node");
        }
        i09 i09Var = ((i09) rv3Var).a.e;
        LayoutNode layoutNodeS0 = vd0.s0(rv3Var);
        while (layoutNodeS0 != null) {
            if ((((i09) layoutNodeS0.V0.g).d & 262144) != 0) {
                while (i09Var != null) {
                    if ((i09Var.c & 262144) != 0) {
                        ?? M0 = i09Var;
                        ?? p89Var = 0;
                        while (M0 != 0) {
                            if (M0 instanceof i4f) {
                                i4f i4fVar = (i4f) M0;
                                if (!(obj.equals(i4fVar.q()) ? ((Boolean) a26Var.d(i4fVar)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((M0.c & 262144) != 0 && (M0 instanceof sv3)) {
                                i09 i09Var2 = ((sv3) M0).E0;
                                int i = 0;
                                while (i09Var2 != null) {
                                    if ((i09Var2.c & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            M0 = M0;
                                            p89Var = p89Var;
                                            p89Var = p89Var;
                                            M0 = i09Var2;
                                        } else {
                                            if (p89Var == 0) {
                                                p89Var = new p89(0, new i09[16]);
                                            }
                                            if (M0 != 0) {
                                                p89Var.b(M0);
                                                M0 = 0;
                                            }
                                            p89Var.b(i09Var2);
                                        }
                                    } else {
                                        M0 = M0;
                                        p89Var = p89Var;
                                    }
                                    i09Var2 = i09Var2.f;
                                    M0 = M0;
                                    p89Var = p89Var;
                                }
                                if (i == 1) {
                                    M0 = M0;
                                    p89Var = p89Var;
                                } else {
                                    M0 = M0;
                                    p89Var = p89Var;
                                }
                            }
                            M0 = vd0.m0(p89Var);
                        }
                    }
                    i09Var = i09Var.e;
                }
            }
            layoutNodeS0 = layoutNodeS0.F();
            i09Var = (layoutNodeS0 == null || (wo0Var = layoutNodeS0.V0) == null) ? null : (zde) wo0Var.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [i4f, java.lang.Object, rv3] */
    /* JADX WARN: Type inference failed for: r12v0, types: [a26] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [i09] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [i09] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [p89] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [p89] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final void t(i4f i4fVar, a26 a26Var) {
        wo0 wo0Var;
        i09 i09Var = (i09) i4fVar;
        if (!i09Var.a.Y) {
            i37.c("visitAncestors called on an unattached node");
        }
        i09 i09Var2 = i09Var.a.e;
        LayoutNode layoutNodeS0 = vd0.s0(i4fVar);
        while (layoutNodeS0 != null) {
            if ((((i09) layoutNodeS0.V0.g).d & 262144) != 0) {
                while (i09Var2 != null) {
                    if ((i09Var2.c & 262144) != 0) {
                        ?? M0 = i09Var2;
                        ?? p89Var = 0;
                        while (M0 != 0) {
                            boolean zBooleanValue = true;
                            if (M0 instanceof i4f) {
                                i4f i4fVar2 = (i4f) M0;
                                if (pa7.t(i4fVar.q(), i4fVar2.q()) && i4fVar.getClass() == i4fVar2.getClass()) {
                                    zBooleanValue = ((Boolean) a26Var.d(i4fVar2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else if ((M0.c & 262144) != 0 && (M0 instanceof sv3)) {
                                i09 i09Var3 = ((sv3) M0).E0;
                                int i = 0;
                                while (i09Var3 != null) {
                                    if ((i09Var3.c & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            M0 = M0;
                                            p89Var = p89Var;
                                            p89Var = p89Var;
                                            M0 = i09Var3;
                                        } else {
                                            if (p89Var == 0) {
                                                p89Var = new p89(0, new i09[16]);
                                            }
                                            if (M0 != 0) {
                                                p89Var.b(M0);
                                                M0 = 0;
                                            }
                                            p89Var.b(i09Var3);
                                        }
                                    } else {
                                        M0 = M0;
                                        p89Var = p89Var;
                                    }
                                    i09Var3 = i09Var3.f;
                                    M0 = M0;
                                    p89Var = p89Var;
                                }
                                if (i == 1) {
                                    M0 = M0;
                                    p89Var = p89Var;
                                } else {
                                    M0 = M0;
                                    p89Var = p89Var;
                                }
                            }
                            M0 = vd0.m0(p89Var);
                        }
                    }
                    i09Var2 = i09Var2.e;
                }
            }
            layoutNodeS0 = layoutNodeS0.F();
            i09Var2 = (layoutNodeS0 == null || (wo0Var = layoutNodeS0.V0) == null) ? null : (zde) wo0Var.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [a26] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [i09] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [i09] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [p89] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [p89] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public static final void u(i09 i09Var, String str, a26 a26Var) {
        if (!i09Var.a.Y) {
            i37.c("visitSubtreeIf called on an unattached node");
        }
        p89 p89Var = new p89(0, new i09[16]);
        i09 i09Var2 = i09Var.a;
        i09 i09Var3 = i09Var2.f;
        if (i09Var3 == null) {
            vd0.H(p89Var, i09Var2);
        } else {
            p89Var.b(i09Var3);
        }
        while (true) {
            int i = p89Var.c;
            if (i == 0) {
                return;
            }
            i09 i09Var4 = (i09) p89Var.k(i - 1);
            if ((i09Var4.d & 262144) != 0) {
                i09 i09Var5 = i09Var4;
                while (true) {
                    if (i09Var5 != null && i09Var5.Y) {
                        if ((i09Var5.c & 262144) != 0) {
                            ?? M0 = i09Var5;
                            ?? p89Var2 = 0;
                            while (M0 != 0) {
                                if (M0 instanceof i4f) {
                                    i4f i4fVar = (i4f) M0;
                                    h4f h4fVar = str.equals(i4fVar.q()) ? (h4f) a26Var.d(i4fVar) : h4f.a;
                                    if (h4fVar != h4f.c) {
                                        if (h4fVar == h4f.b) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((M0.c & 262144) != 0 && (M0 instanceof sv3)) {
                                    i09 i09Var6 = ((sv3) M0).E0;
                                    int i2 = 0;
                                    M0 = M0;
                                    p89Var2 = p89Var2;
                                    while (i09Var6 != null) {
                                        if ((i09Var6.c & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                p89Var2 = p89Var2;
                                                M0 = i09Var6;
                                            } else {
                                                if (p89Var2 == 0) {
                                                    p89Var2 = new p89(0, new i09[16]);
                                                }
                                                if (M0 != 0) {
                                                    p89Var2.b(M0);
                                                    M0 = 0;
                                                }
                                                p89Var2.b(i09Var6);
                                            }
                                        }
                                        i09Var6 = i09Var6.f;
                                        M0 = M0;
                                        p89Var2 = p89Var2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M0 = vd0.m0(p89Var2);
                            }
                        }
                        i09Var5 = i09Var5.f;
                    }
                }
            }
            vd0.H(p89Var, i09Var4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [i4f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [a26] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [i09] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [i09] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [p89] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [p89] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final void v(i4f i4fVar, a26 a26Var) {
        i09 i09Var = (i09) i4fVar;
        if (!i09Var.a.Y) {
            i37.c("visitSubtreeIf called on an unattached node");
        }
        p89 p89Var = new p89(0, new i09[16]);
        i09 i09Var2 = i09Var.a;
        i09 i09Var3 = i09Var2.f;
        if (i09Var3 == null) {
            vd0.H(p89Var, i09Var2);
        } else {
            p89Var.b(i09Var3);
        }
        while (true) {
            int i = p89Var.c;
            if (i == 0) {
                return;
            }
            i09 i09Var4 = (i09) p89Var.k(i - 1);
            if ((i09Var4.d & 262144) != 0) {
                i09 i09Var5 = i09Var4;
                while (true) {
                    if (i09Var5 != null && i09Var5.Y) {
                        if ((i09Var5.c & 262144) != 0) {
                            ?? M0 = i09Var5;
                            ?? p89Var2 = 0;
                            while (M0 != 0) {
                                if (M0 instanceof i4f) {
                                    i4f i4fVar2 = (i4f) M0;
                                    h4f h4fVar = (pa7.t(i4fVar.q(), i4fVar2.q()) && i4fVar.getClass() == i4fVar2.getClass()) ? (h4f) a26Var.d(i4fVar2) : h4f.a;
                                    if (h4fVar != h4f.c) {
                                        if (h4fVar == h4f.b) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((M0.c & 262144) != 0 && (M0 instanceof sv3)) {
                                    i09 i09Var6 = ((sv3) M0).E0;
                                    int i2 = 0;
                                    M0 = M0;
                                    p89Var2 = p89Var2;
                                    while (i09Var6 != null) {
                                        if ((i09Var6.c & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                p89Var2 = p89Var2;
                                                M0 = i09Var6;
                                            } else {
                                                if (p89Var2 == 0) {
                                                    p89Var2 = new p89(0, new i09[16]);
                                                }
                                                if (M0 != 0) {
                                                    p89Var2.b(M0);
                                                    M0 = 0;
                                                }
                                                p89Var2.b(i09Var6);
                                            }
                                        }
                                        i09Var6 = i09Var6.f;
                                        M0 = M0;
                                        p89Var2 = p89Var2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M0 = vd0.m0(p89Var2);
                            }
                        }
                        i09Var5 = i09Var5.f;
                    }
                }
            }
            vd0.H(p89Var, i09Var4);
        }
    }

    public static final File w(Uri uri) throws geh {
        if (!uri.getScheme().equals("file")) {
            throw new geh("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new geh("Did not expect uri to have query");
        }
        if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        }
        throw new geh("Did not expect uri to have authority");
    }
}
