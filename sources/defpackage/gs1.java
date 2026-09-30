package defpackage;

import ai.askquin.ui.draw.photo.homepage.CardLayoutConfig;
import ai.askquin.ui.draw.photo.homepage.CardPositionConfig;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gs1 {
    public static final xh7 a = rs0.d(new wu0(20));

    public static final void a(int i, int i2, a26 a26Var, l46 l46Var) {
        l46Var.h0(1068588698);
        int i3 = (l46Var.e(i) ? 4 : 2) | i2;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            nae.a(null, ((s5d) l46Var.k(u5d.a)).c, 0L, 0L, 1.0f, 0.0f, null, af1.b0(1956985759, new xr1(i, a26Var), l46Var), l46Var, 12607488, 109);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new xr1(i, i2, 1, a26Var);
        }
    }

    public static final void b(x16 x16Var, l46 l46Var, int i) {
        s69 s69Var;
        e89 e89Var;
        s69 s69Var2;
        e89 e89Var2;
        e89 e89Var3;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1562200297);
        int i2 = i | (l46Var2.i(x16Var) ? 4 : 2);
        if (l46Var2.W(i2 & 1, (i2 & 3) != 2)) {
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = kv2.f(3, l46Var2);
            }
            s69 s69Var3 = (s69) objR;
            Object objR2 = l46Var2.R();
            if (objR2 == i8cVar) {
                objR2 = q1c.f(jr1.a(3));
                l46Var2.p0(objR2);
            }
            e89 e89Var4 = (e89) objR2;
            Object objR3 = l46Var2.R();
            if (objR3 == i8cVar) {
                objR3 = kv2.f(0, l46Var2);
            }
            s69 s69Var4 = (s69) objR3;
            Object objR4 = l46Var2.R();
            if (objR4 == i8cVar) {
                CardLayoutConfig cardLayoutConfig = (CardLayoutConfig) e89Var4.getValue();
                xh7 xh7Var = a;
                xh7Var.getClass();
                objR4 = q1c.f(xh7Var.d(CardLayoutConfig.Companion.serializer(), cardLayoutConfig));
                l46Var2.p0(objR4);
            }
            e89 e89Var5 = (e89) objR4;
            Object objR5 = l46Var2.R();
            if (objR5 == i8cVar) {
                objR5 = q1c.f(null);
                l46Var2.p0(objR5);
            }
            e89 e89Var6 = (e89) objR5;
            Context context = (Context) l46Var2.k(uq.b);
            FillElement fillElement = b.c;
            j09 j09VarO = tm7.o(fillElement, ((m82) l46Var2.k(o82.a)).n, g21.f);
            jx0 jx0Var = ndb.Y;
            c92 c92VarA = a92.a(xc0.c, jx0Var, l46Var2, 0);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarO);
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
            dec.l(he2Var, l46Var2, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            pa7.a(null, 0L, 0L, null, y41.a, null, false, false, x16Var, l46Var, ((i2 << 24) & 234881024) | 24576, 239);
            j09 j09VarZ = ynb.Z(mh3.L(mh3.d0(fillElement, mh3.T(l46Var), false, 14)), 16.0f);
            c92 c92VarA2 = a92.a(new uc0(16.0f, true, new qc0(0)), jx0Var, l46Var, 6);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarZ);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, c92VarA2);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            sz9 sz9Var = (sz9) s69Var3;
            int iJ = sz9Var.j();
            Object objR6 = l46Var.R();
            if (objR6 == i8cVar) {
                s69Var2 = s69Var4;
                e89Var3 = e89Var6;
                kf kfVar = new kf(4, e89Var4, s69Var3, s69Var2, e89Var5, e89Var3);
                e89Var = e89Var4;
                s69Var = s69Var3;
                e89Var2 = e89Var5;
                l46Var.p0(kfVar);
                objR6 = kfVar;
            } else {
                s69Var = s69Var3;
                e89Var = e89Var4;
                s69Var2 = s69Var4;
                e89Var2 = e89Var5;
                e89Var3 = e89Var6;
            }
            a(iJ, 48, (a26) objR6, l46Var);
            int iJ2 = sz9Var.j();
            sz9 sz9Var2 = (sz9) s69Var2;
            int iJ3 = sz9Var2.j();
            Object objR7 = l46Var.R();
            if (objR7 == i8cVar) {
                objR7 = new pr1(s69Var2, 0);
                l46Var.p0(objR7);
            }
            e(iJ2, iJ3, (a26) objR7, l46Var, 384);
            float containerWidth = ((CardLayoutConfig) e89Var.getValue()).getContainerWidth();
            float containerHeight = ((CardLayoutConfig) e89Var.getValue()).getContainerHeight();
            Object objR8 = l46Var.R();
            if (objR8 == i8cVar) {
                objR8 = new ur1(e89Var, e89Var2, 0);
                l46Var.p0(objR8);
            }
            d(containerWidth, containerHeight, (l26) objR8, l46Var, 384);
            h((CardLayoutConfig) e89Var.getValue(), sz9Var2.j(), l46Var, CardLayoutConfig.$stable);
            if (sz9Var2.j() < ((CardLayoutConfig) e89Var.getValue()).getPositions().size()) {
                l46Var.f0(-1187348702);
                CardPositionConfig cardPositionConfig = ((CardLayoutConfig) e89Var.getValue()).getPositions().get(sz9Var2.j());
                int iJ4 = sz9Var2.j();
                Object objR9 = l46Var.R();
                if (objR9 == i8cVar) {
                    objR9 = new w6(e89Var, s69Var2, e89Var2, 16);
                    l46Var.p0(objR9);
                }
                c(cardPositionConfig, iJ4, (a26) objR9, l46Var, CardPositionConfig.$stable | 384);
                l46Var.r(false);
            } else {
                l46Var.f0(-1186897993);
                l46Var.r(false);
            }
            String str = (String) e89Var2.getValue();
            String str2 = (String) e89Var3.getValue();
            Object objR10 = l46Var.R();
            if (objR10 == i8cVar) {
                wg wgVar = new wg(e89Var2, s69Var, e89Var, e89Var3, 2);
                l46Var.p0(wgVar);
                objR10 = wgVar;
            }
            g(str, str2, (a26) objR10, l46Var, 384);
            boolean zI = l46Var.i(context);
            Object objR11 = l46Var.R();
            if (zI || objR11 == i8cVar) {
                objR11 = new wr1(context, e89Var2, 0);
                l46Var.p0(objR11);
            }
            g09 g09Var = g09.a;
            l46Var2 = l46Var;
            cgg.a((x16) objR11, b.c(g09Var, 1.0f), false, null, null, null, null, null, y41.b, l46Var2, 805306416, 508);
            o5c.f(l46Var2, b.d(g09Var, 32.0f));
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new m(i, 10, x16Var);
        }
    }

    public static final void c(CardPositionConfig cardPositionConfig, int i, a26 a26Var, l46 l46Var, int i2) {
        int i3;
        l46Var.h0(-924539329);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? l46Var.g(cardPositionConfig) : l46Var.i(cardPositionConfig) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            nae.a(null, ((s5d) l46Var.k(u5d.a)).c, 0L, 0L, 1.0f, 0.0f, null, af1.b0(1363463876, new gc(i, cardPositionConfig, a26Var, 8), l46Var), l46Var, 12607488, 109);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new or1(cardPositionConfig, i, a26Var, i2, 0);
        }
    }

    public static final void d(float f, float f2, l26 l26Var, l46 l46Var, int i) {
        l46Var.h0(-548028087);
        int i2 = i | (l46Var.d(f) ? 4 : 2) | (l46Var.d(f2) ? 32 : 16);
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            nae.a(null, ((s5d) l46Var.k(u5d.a)).c, 0L, 0L, 1.0f, 0.0f, null, af1.b0(453767566, new kr1(f, f2, l26Var), l46Var), l46Var, 12607488, 109);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new kr1(f, f2, l26Var, i);
        }
    }

    public static final void e(int i, int i2, a26 a26Var, l46 l46Var, int i3) {
        l46Var.h0(1947021069);
        int i4 = i3 | (l46Var.e(i) ? 4 : 2) | (l46Var.e(i2) ? 32 : 16);
        if (l46Var.W(i4 & 1, (i4 & 147) != 146)) {
            nae.a(null, ((s5d) l46Var.k(u5d.a)).c, 0L, 0L, 1.0f, 0.0f, null, af1.b0(-1335462830, new lr1(i2, i, a26Var), l46Var), l46Var, 12607488, 109);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new lr1(i, i2, i3, a26Var);
        }
    }

    public static final void f(String str, float f, a26 a26Var, j09 j09Var, l46 l46Var, int i) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1339645881);
        int i2 = i | (l46Var2.d(f) ? 32 : 16) | (l46Var2.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.g(j09Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var2.W(i2 & 1, (i2 & 1171) != 1170)) {
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = new use(String.valueOf((int) f), 2);
                l46Var2.p0(objR);
            }
            use useVar = (use) objR;
            Float fValueOf = Float.valueOf(f);
            boolean z = (i2 & 112) == 32;
            Object objR2 = l46Var2.R();
            if (z || objR2 == i8cVar) {
                objR2 = new yr1(useVar, f, null);
                l46Var2.p0(objR2);
            }
            af1.o((l26) objR2, l46Var2, fValueOf);
            boolean z2 = (i2 & 896) == 256;
            Object objR3 = l46Var2.R();
            if (z2 || objR3 == i8cVar) {
                objR3 = new as1(null, a26Var, useVar);
                l46Var2.p0(objR3);
            }
            af1.o((l26) objR3, l46Var2, useVar);
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var2, 0);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09Var);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, c92VarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            mue mueVar = ((p9f) l46Var2.k(r9f.a)).o;
            pr4 pr4Var = o82.a;
            nte.b(str, null, y72.b(((m82) l46Var2.k(pr4Var)).q, 0.7f), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVar, l46Var2, 6, 0, 131066);
            g09 g09Var = g09.a;
            tv0.b(useVar, ynb.a0(db6.w(kv2.e(g09Var, 4.0f, l46Var2, g09Var, 1.0f), 1.0f, ((m82) l46Var2.k(pr4Var)).A, a7c.b(4.0f)), 12.0f, 8.0f), false, null, mue.a((mue) l46Var2.k(nte.a), ((m82) l46Var2.k(pr4Var)).q, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), new wo7(3, 0, 123), null, gec.x, null, null, new dtd(((m82) l46Var2.k(pr4Var)).a), null, null, l46Var2, 102236166, 0, 30364);
            l46Var2 = l46Var2;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new vr1(str, f, a26Var, j09Var, i);
        }
    }

    public static final void g(String str, String str2, a26 a26Var, l46 l46Var, int i) {
        l46Var.h0(-341793080);
        int i2 = i | (l46Var.g(str) ? 4 : 2) | (l46Var.g(str2) ? 32 : 16);
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = new use(str, 2);
                l46Var.p0(objR);
            }
            use useVar = (use) objR;
            boolean z = (i2 & 14) == 4;
            Object objR2 = l46Var.R();
            if (z || objR2 == i8cVar) {
                objR2 = new bs1(useVar, str, null);
                l46Var.p0(objR2);
            }
            af1.o((l26) objR2, l46Var, str);
            Object objR3 = l46Var.R();
            if (objR3 == i8cVar) {
                objR3 = new ds1(null, a26Var, useVar);
                l46Var.p0(objR3);
            }
            af1.o((l26) objR3, l46Var, useVar);
            nae.a(null, ((s5d) l46Var.k(u5d.a)).c, 0L, 0L, 1.0f, 0.0f, null, af1.b0(-1004232861, new h8(11, useVar, str2), l46Var), l46Var, 12607488, 109);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new x6(str, str2, false, a26Var, i, 10);
        }
    }

    public static final void h(final CardLayoutConfig cardLayoutConfig, final int i, l46 l46Var, int i2) {
        int i3;
        l46Var.h0(303491639);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? l46Var.g(cardLayoutConfig) : l46Var.i(cardLayoutConfig) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.e(i) ? 32 : 16;
        }
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            final float f = ((yi4) i7h.D(new yi4(cardLayoutConfig.getContainerWidth()), new yi4(360.0f))).a;
            final float containerWidth = f / cardLayoutConfig.getContainerWidth();
            final float containerHeight = cardLayoutConfig.getContainerHeight() * containerWidth;
            bzd.d(b.c(g09.a, 1.0f), null, z5c.p(abg.d(4279900718L), 0L, l46Var, 24582, 14), null, null, af1.b0(1373050665, new n26() { // from class: mr1
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    l46 l46Var2 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((d92) obj).getClass();
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                        g09 g09Var = g09.a;
                        j09 j09VarZ = ynb.Z(b.c(g09Var, 1.0f), 16.0f);
                        xn8 xn8VarC = s21.c(ndb.f, false);
                        int iHashCode = Long.hashCode(l46Var2.T);
                        u8a u8aVarM = l46Var2.m();
                        j09 j09VarJ = m93.J(l46Var2, j09VarZ);
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
                        dec.l(he2Var, l46Var2, xn8VarC);
                        he2 he2Var2 = hj6.y;
                        dec.l(he2Var2, l46Var2, u8aVarM);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        he2 he2Var3 = hj6.X;
                        dec.l(he2Var3, l46Var2, numValueOf);
                        dec.k(l46Var2);
                        he2 he2Var4 = hj6.x;
                        dec.l(he2Var4, l46Var2, j09VarJ);
                        float f2 = f;
                        j09 j09VarP = b.p(g09Var, f2);
                        float f3 = containerHeight;
                        j09 j09VarW = db6.w(b.d(j09VarP, f3), 1.0f, y72.b(y72.c, 0.3f), a7c.b(4.0f));
                        xn8 xn8VarC2 = s21.c(ndb.b, false);
                        int iHashCode2 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM2 = l46Var2.m();
                        j09 j09VarJ2 = m93.J(l46Var2, j09VarW);
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(he2Var, l46Var2, xn8VarC2);
                        dec.l(he2Var2, l46Var2, u8aVarM2);
                        ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                        dec.l(he2Var4, l46Var2, j09VarJ2);
                        CardLayoutConfig cardLayoutConfig2 = cardLayoutConfig;
                        n16.h(cardLayoutConfig2.getCardCount(), i, b.c, false, cardLayoutConfig2, y41.c, l46Var2, (CardLayoutConfig.$stable << 12) | 196992, 8);
                        l46Var2.r(true);
                        l46Var2.r(true);
                        nte.b(String.format(kv2.h((int) f2, (int) f3, "Preview: ", " x ", " dp (scale: %.2f)"), Arrays.copyOf(new Object[]{Float.valueOf(containerWidth)}, 1)), ynb.d0(16.0f, 0.0f, 0.0f, 8.0f, 6, g09Var), y72.b(y72.e, 0.6f), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var2.k(r9f.a)).o, l46Var2, 432, 0, 131064);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 196614, 26);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new nr1(cardLayoutConfig, i, i2, 0);
        }
    }

    public static final void i(Integer num, a26 a26Var, l46 l46Var, int i) {
        String strValueOf;
        l46Var.h0(1405059129);
        int i2 = i | (l46Var.g(num) ? 4 : 2) | (l46Var.i(a26Var) ? 32 : 16);
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                if (num == null || (strValueOf = String.valueOf(num.intValue())) == null) {
                    strValueOf = "";
                }
                objR = new use(strValueOf, 2);
                l46Var.p0(objR);
            }
            use useVar = (use) objR;
            boolean z = (i2 & 14) == 4;
            Object objR2 = l46Var.R();
            if (z || objR2 == i8cVar) {
                objR2 = new es1(useVar, num, null);
                l46Var.p0(objR2);
            }
            af1.o((l26) objR2, l46Var, num);
            boolean z2 = (i2 & 112) == 32;
            Object objR3 = l46Var.R();
            if (z2 || objR3 == i8cVar) {
                objR3 = new fs1(null, a26Var, useVar);
                l46Var.p0(objR3);
            }
            af1.o((l26) objR3, l46Var, useVar);
            j09 j09VarC = b.c(g09.a, 1.0f);
            pr4 pr4Var = o82.a;
            tv0.b(useVar, ynb.a0(db6.w(j09VarC, 1.0f, ((m82) l46Var.k(pr4Var)).A, a7c.b(4.0f)), 12.0f, 8.0f), false, null, mue.a((mue) l46Var.k(nte.a), ((m82) l46Var.k(pr4Var)).q, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), new wo7(3, 0, 123), null, gec.x, null, null, new dtd(((m82) l46Var.k(pr4Var)).a), new m6c(8, useVar), null, l46Var, 102236166, 0, 22172);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new h8(num, a26Var, i, 12);
        }
    }

    public static final void j(float f, a26 a26Var, b62 b62Var, a26 a26Var2, l46 l46Var, int i) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1848911740);
        int i2 = i | (l46Var2.d(f) ? 32 : 16) | (l46Var2.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.g(b62Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var2.W(i2 & 1, (i2 & 9363) != 9362)) {
            j09 j09VarC = b.c(g09.a, 1.0f);
            t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(0)), ndb.z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarC);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, t7cVarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            l46Var2.f0(-362807718);
            l46Var2.r(false);
            if (0.7f <= 0.0d) {
                g37.a("invalid weight; must be greater than zero");
            }
            float f2 = 0.7f;
            if (0.7f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            }
            epd.a(f, a26Var, new jw7(f2, true), false, b62Var, 0, null, null, l46Var2, ((i2 >> 3) & 126) | ((i2 << 3) & 57344), 488);
            String str = (String) a26Var2.d(Float.valueOf(f));
            mue mueVar = ((p9f) l46Var2.k(r9f.a)).l;
            if (0.3f <= 0.0d) {
                g37.a("invalid weight; must be greater than zero");
            }
            nte.b(str, new jw7(0.3f <= Float.MAX_VALUE ? 0.3f : Float.MAX_VALUE, true), 0L, 0L, null, null, 0L, null, new jme(6), 0L, 0, false, 0, 0, null, mueVar, l46Var, 0, 0, 130044);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new vr1(f, a26Var, b62Var, a26Var2, i);
        }
    }
}
