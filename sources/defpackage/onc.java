package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.ArcanaGroup;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class onc {
    public static final List a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;
    public static final float h;
    public static final float i;
    public static final float j;
    public static final float k;
    public static final float l;
    public static final float m;
    public static final float n;
    public static final float o;
    public static final float p;

    static {
        Float fValueOf = Float.valueOf(-1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        iy9 iy9Var = new iy9(fValueOf, fValueOf2);
        Float fValueOf3 = Float.valueOf(1.0f);
        a = t72.I(iy9Var, new iy9(fValueOf2, fValueOf3), new iy9(fValueOf3, fValueOf2), new iy9(fValueOf2, fValueOf), new iy9(fValueOf2, fValueOf2));
        b = 98.0f;
        c = 160.0f;
        d = 12.0f;
        e = 18.0f;
        f = 74.0f;
        g = (74.0f * 7.0f) / 4.0f;
        h = 8.0f;
        i = 8.0f;
        j = 32.0f;
        k = 0.5f;
        l = 4.0f;
        m = 4.0f;
        n = 36.0f;
        o = 20.0f;
        p = 14.0f;
    }

    public static final void a(y6c y6cVar, x16 x16Var, l46 l46Var, int i2) {
        int i3;
        x16 x16Var2 = x16Var;
        l46 l46Var2 = l46Var;
        he2 he2Var = hj6.x;
        he2 he2Var2 = hj6.X;
        he2 he2Var3 = hj6.y;
        he2 he2Var4 = hj6.z;
        lx0 lx0Var = ndb.f;
        l46Var2.h0(-1589512839);
        int i4 = i2 & 6;
        d31 d31Var = d31.a;
        if (i4 == 0) {
            i3 = (l46Var2.g(d31Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var2.g(y6cVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var2.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var2.W(i3 & 1, (i3 & 147) != 146)) {
            pr4 pr4Var = l8b.a;
            boolean zF = k8b.f((e8b) l46Var2.k(pr4Var));
            g09 g09Var = g09.a;
            ov7 ov7Var = LayoutNode.h1;
            float f2 = n;
            if (zF) {
                l46Var2.f0(-1162402578);
                s21.a(tm7.n(oa7.E(d31Var.b(g09Var), y6cVar), gec.O(new iy9[]{new iy9(Float.valueOf(0.6f), new y72(y72.j)), new iy9(Float.valueOf(1.0f), new y72(y72.b(y72.b, 0.5f)))}, 0.0f, 0.0f, 14), null, 6), l46Var2, 0);
                j09 j09VarC = b.c(androidx.compose.foundation.layout.b.l(d31Var.a(g09Var, ndb.x), f2), false, null, null, x16Var, 15);
                xn8 xn8VarC = s21.c(lx0Var, false);
                int iHashCode = Long.hashCode(l46Var2.T);
                u8a u8aVarM = l46Var2.m();
                j09 j09VarJ = m93.J(l46Var2, j09VarC);
                lf2.q.getClass();
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var4, l46Var2, xn8VarC);
                dec.l(he2Var3, l46Var2, u8aVarM);
                dec.l(he2Var2, l46Var2, Integer.valueOf(iHashCode));
                dec.k(l46Var2);
                dec.l(he2Var, l46Var2, j09VarJ);
                gu6.b(od4.A(R.drawable.ic_delete_circle_greyscale, 0, l46Var2), null, androidx.compose.foundation.layout.b.l(g09Var, p), y72.k, l46Var, 3512, 0);
                l46Var2 = l46Var;
                l46Var2.r(true);
                l46Var2.r(false);
                x16Var2 = x16Var;
            } else {
                l46Var2.f0(-1161693546);
                long j2 = ((e8b) l46Var2.k(pr4Var)).v;
                x16Var2 = x16Var;
                j09 j09VarC2 = b.c(androidx.compose.foundation.layout.b.l(d31Var.a(g09Var, ndb.d), f2), false, null, null, x16Var2, 15);
                xn8 xn8VarC2 = s21.c(lx0Var, false);
                int iHashCode2 = Long.hashCode(l46Var2.T);
                u8a u8aVarM2 = l46Var2.m();
                j09 j09VarJ2 = m93.J(l46Var2, j09VarC2);
                lf2.q.getClass();
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var4, l46Var2, xn8VarC2);
                dec.l(he2Var3, l46Var2, u8aVarM2);
                dec.l(he2Var2, l46Var2, Integer.valueOf(iHashCode2));
                dec.k(l46Var2);
                dec.l(he2Var, l46Var2, j09VarJ2);
                j09 j09VarH = iqf.h(androidx.compose.foundation.layout.b.l(g09Var, o), y72.b(y72.b, 0.5f), 0.0f, 12.0f, r4d.a, 6);
                Object objR = l46Var2.R();
                i8c i8cVar = sf2.a;
                if (objR == i8cVar) {
                    objR = new fnc(3);
                    l46Var2.p0(objR);
                }
                j09 j09VarE = oa7.E(bzd.x(j09VarH, (a26) objR), a7c.a);
                boolean zF2 = l46Var2.f(j2);
                Object objR2 = l46Var2.R();
                if (zF2 || objR2 == i8cVar) {
                    objR2 = new ac(j2, 17);
                    l46Var2.p0(objR2);
                }
                s21.a(b21.u(j09VarE, (a26) objR2), l46Var2, 0);
                l46Var2.r(true);
                l46Var2.r(false);
            }
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new k38(y6cVar, x16Var2, i2, 9);
        }
    }

    public static final void b(int i2, ArcanaGroup arcanaGroup, TarotCardChoice tarotCardChoice, x16 x16Var, x16 x16Var2, x16 x16Var3, j09 j09Var, l46 l46Var, int i3) {
        j09 j09Var2;
        g09 g09Var;
        boolean z;
        int i4;
        l46 l46Var2 = l46Var;
        l46Var2.h0(1395541866);
        int i5 = i3 | (l46Var2.e(i2) ? 4 : 2) | (l46Var2.e(arcanaGroup.ordinal()) ? 32 : 16) | (l46Var2.g(tarotCardChoice) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var2.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var2.i(x16Var3) ? 131072 : 65536) | 1572864;
        if (l46Var2.W(i5 & 1, (599187 & i5) != 599186)) {
            float f2 = h;
            y6c y6cVarB = a7c.b(f2);
            lx0 lx0Var = ndb.f;
            xn8 xn8VarC = s21.c(lx0Var, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            g09 g09Var2 = g09.a;
            j09 j09VarJ = m93.J(l46Var2, g09Var2);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z2 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z2) {
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
            float f3 = g;
            i8c i8cVar = sf2.a;
            float f4 = f;
            if (tarotCardChoice != null) {
                l46Var2.f0(1078427431);
                j09 j09VarP = androidx.compose.foundation.layout.b.p(g09Var2, f4);
                pr4 pr4Var = l8b.a;
                j09 j09VarW = db6.w(j09VarP, 0.5f, ((e8b) l46Var2.k(pr4Var)).A, y6cVarB);
                boolean z3 = ((57344 & i5) == 16384) | ((i5 & 7168) == 2048);
                Object objR = l46Var2.R();
                if (z3 || objR == i8cVar) {
                    objR = new u42(3, x16Var2, x16Var);
                    l46Var2.p0(objR);
                }
                o7c.d(ibe.a(j09VarW, tarotCardChoice, (PointerInputEventHandler) objR), q7c.r(tarotCardChoice), null, false, an2.d, f2, null, false, l46Var2, 221184, 204);
                l46Var2 = l46Var2;
                a(y6cVarB, x16Var3, l46Var2, 6 | ((i5 >> 9) & 896));
                String strQ = afc.q(tarotCardChoice.getCard().getTitleRes(), l46Var2);
                boolean zIsReversed = tarotCardChoice.isReversed();
                mue mueVar = pue.a;
                jrb.b(strQ, zIsReversed, mue.a(pue.i(l46Var2), ((e8b) l46Var2.k(pr4Var)).q, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), tm7.N(0.0f, f3 + i, androidx.compose.foundation.layout.b.p(d31.a.a(g09Var2, ndb.c), f4), 1), new co0(w6c.l(8), w6c.l(12), w6c.l(1)), l46Var2, 0, 0);
                l46Var2.r(false);
                g09Var = g09Var2;
                z = true;
            } else {
                l46Var2.f0(1079432482);
                pr4 pr4Var2 = l8b.a;
                long j2 = ((e8b) l46Var2.k(pr4Var2)).z;
                j09 j09VarO = tm7.o(oa7.E(androidx.compose.foundation.layout.b.m(g09Var2, f4, f3), y6cVarB), ((e8b) l46Var2.k(pr4Var2)).m, y6cVarB);
                boolean zF = l46Var2.f(j2);
                Object objR2 = l46Var2.R();
                if (zF || objR2 == i8cVar) {
                    objR2 = new ac(j2, 16);
                    l46Var2.p0(objR2);
                }
                j09 j09VarC = b.c(b21.s(j09VarO, (a26) objR2), false, null, null, x16Var, 15);
                xn8 xn8VarC2 = s21.c(lx0Var, false);
                int iHashCode2 = Long.hashCode(l46Var2.T);
                u8a u8aVarM2 = l46Var2.m();
                j09 j09VarJ2 = m93.J(l46Var2, j09VarC);
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
                c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Z, l46Var2, 54);
                int iHashCode3 = Long.hashCode(l46Var2.T);
                u8a u8aVarM3 = l46Var2.m();
                j09 j09VarJ3 = m93.J(l46Var2, g09Var2);
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var, l46Var2, c92VarA);
                dec.l(he2Var2, l46Var2, u8aVarM3);
                ib8.s(iHashCode3, l46Var2, he2Var3, l46Var2);
                dec.l(he2Var4, l46Var2, j09VarJ3);
                String strValueOf = String.valueOf(i2);
                mue mueVar2 = pue.a;
                g09Var = g09Var2;
                z = true;
                nte.b(strValueOf, null, ((e8b) l46Var2.k(pr4Var2)).q, 0L, null, cr5.f, 0L, null, null, 0L, 0, false, 0, 0, null, pue.o(l46Var2), l46Var, 0, 0, 130938);
                List list = rmc.a;
                arcanaGroup.getClass();
                int i6 = qmc.a[arcanaGroup.ordinal()];
                if (i6 == 1) {
                    i4 = R.string.seasonal_meaning_love;
                } else if (i6 == 2) {
                    i4 = R.string.seasonal_meaning_mind;
                } else if (i6 == 3) {
                    i4 = R.string.seasonal_meaning_action;
                } else if (i6 == 4) {
                    i4 = R.string.seasonal_meaning_reality;
                } else {
                    if (i6 != 5) {
                        ap.c();
                        return;
                    }
                    i4 = R.string.seasonal_meaning_overall;
                }
                nte.b(afc.q(i4, l46Var), null, ((e8b) l46Var.k(pr4Var2)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var), l46Var, 0, 0, 131066);
                l46Var2 = l46Var;
                l46Var2.r(true);
                l46Var2.r(true);
                d(afc.q(rmc.b(arcanaGroup), l46Var2), l46Var2, 6);
                l46Var2.r(false);
            }
            l46Var2.r(z);
            j09Var2 = g09Var;
        } else {
            l46Var2.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new r20(i2, arcanaGroup, tarotCardChoice, x16Var, x16Var2, x16Var3, j09Var2, i3, 5);
        }
    }

    public static final void c(List list, List list2, a26 a26Var, a26 a26Var2, a26 a26Var3, j09 j09Var, xw9 xw9Var, l26 l26Var, l46 l46Var, int i2) {
        l26 l26Var2;
        l46 l46Var2;
        xw9 xw9Var2;
        boolean z;
        List list3 = list;
        List list4 = list2;
        l46 l46Var3 = l46Var;
        he2 he2Var = hj6.x;
        he2 he2Var2 = hj6.X;
        he2 he2Var3 = hj6.y;
        he2 he2Var4 = hj6.z;
        list3.getClass();
        a26Var.getClass();
        a26Var2.getClass();
        a26Var3.getClass();
        l46Var3.h0(-666400189);
        int i3 = i2 | (l46Var3.g(list3) ? 4 : 2) | (l46Var3.g(list4) ? 32 : 16) | (l46Var3.i(a26Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var3.i(a26Var3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var3.g(j09Var) ? 131072 : 65536) | 1572864;
        if (l46Var3.W(i3 & 1, (4793491 & i3) != 4793490)) {
            bx9 bx9VarQ = ynb.q(0.0f, 0.0f, 3);
            List list5 = a;
            int size = list5.size();
            j09 j09VarY = ynb.Y(androidx.compose.foundation.layout.b.c(j09Var, 1.0f), bx9VarQ);
            boolean zE = l46Var3.e(size);
            Object objR = l46Var3.R();
            i8c i8cVar = sf2.a;
            if (zE || objR == i8cVar) {
                objR = new nnc(size, 0);
                l46Var3.p0(objR);
            }
            xn8 xn8Var = (xn8) objR;
            int iHashCode = Long.hashCode(l46Var3.T);
            u8a u8aVarM = l46Var3.m();
            j09 j09VarJ = m93.J(l46Var3, j09VarY);
            lf2.q.getClass();
            l46Var3.j0();
            boolean z2 = l46Var3.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z2) {
                l46Var3.l(ov7Var);
            } else {
                l46Var3.s0();
            }
            dec.l(he2Var4, l46Var3, xn8Var);
            dec.l(he2Var3, l46Var3, u8aVarM);
            dec.l(he2Var2, l46Var3, Integer.valueOf(iHashCode));
            dec.k(l46Var3);
            dec.l(he2Var, l46Var3, j09VarJ);
            l46Var3.f0(-1981546610);
            Iterator it = t72.B(list5).iterator();
            while (((y67) it).c) {
                int iNextInt = ((q67) it).nextInt();
                he2 he2Var5 = he2Var3;
                int i4 = iNextInt + 1;
                ArcanaGroup arcanaGroup = (ArcanaGroup) list3.get(iNextInt);
                TarotCardChoice tarotCardChoice = (TarotCardChoice) s72.y0(iNextInt, list4);
                boolean zE2 = l46Var3.e(iNextInt);
                Object objR2 = l46Var3.R();
                if (zE2 || objR2 == i8cVar) {
                    objR2 = new rr1(iNextInt, 6, a26Var);
                    l46Var3.p0(objR2);
                }
                x16 x16Var = (x16) objR2;
                boolean zE3 = ((i3 & 7168) == 2048) | l46Var3.e(iNextInt);
                Object objR3 = l46Var3.R();
                if (zE3 || objR3 == i8cVar) {
                    objR3 = new rr1(iNextInt, 7, a26Var2);
                    l46Var3.p0(objR3);
                }
                x16 x16Var2 = (x16) objR3;
                boolean zE4 = ((57344 & i3) == 16384) | l46Var3.e(iNextInt);
                Object objR4 = l46Var3.R();
                if (zE4 || objR4 == i8cVar) {
                    objR4 = new rr1(iNextInt, 8, a26Var3);
                    l46Var3.p0(objR4);
                }
                l46 l46Var4 = l46Var3;
                b(i4, arcanaGroup, tarotCardChoice, x16Var, x16Var2, (x16) objR4, null, l46Var4, 0);
                list4 = list2;
                he2Var3 = he2Var5;
                he2Var4 = he2Var4;
                l46Var3 = l46Var4;
                i3 = i3;
                list3 = list;
            }
            he2 he2Var6 = he2Var3;
            l46Var2 = l46Var3;
            he2 he2Var7 = he2Var4;
            l46Var2.r(false);
            if (l26Var != null) {
                l46Var2.f0(-1298093880);
                j09 j09VarC = androidx.compose.foundation.layout.b.c(g09.a, 1.0f);
                xn8 xn8VarC = s21.c(ndb.c, false);
                int iHashCode2 = Long.hashCode(l46Var2.T);
                u8a u8aVarM2 = l46Var2.m();
                j09 j09VarJ2 = m93.J(l46Var2, j09VarC);
                lf2.q.getClass();
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var7, l46Var2, xn8VarC);
                dec.l(he2Var6, l46Var2, u8aVarM2);
                dec.l(he2Var2, l46Var2, Integer.valueOf(iHashCode2));
                dec.k(l46Var2);
                dec.l(he2Var, l46Var2, j09VarJ2);
                l26Var2 = l26Var;
                l26Var2.z(l46Var2, 6);
                z = true;
                l46Var2.r(true);
                l46Var2.r(false);
            } else {
                l26Var2 = l26Var;
                z = true;
                l46Var2.f0(-1297988170);
                l46Var2.r(false);
            }
            l46Var2.r(z);
            xw9Var2 = bx9VarQ;
        } else {
            l26Var2 = l26Var;
            l46Var2 = l46Var3;
            l46Var2.Z();
            xw9Var2 = xw9Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new bq1(list, list2, a26Var, a26Var2, a26Var3, j09Var, xw9Var2, l26Var2, i2);
        }
    }

    public static final void d(String str, l46 l46Var, int i2) {
        l46Var.h0(-1827208855);
        int i3 = (l46Var.g(str) ? 32 : 16) | i2;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            mue mueVar = pue.a;
            vd0.e(str, tm7.N(0.0f, g + i, androidx.compose.foundation.layout.b.p(d31.a.a(g09.a, ndb.c), f), 1), mue.a(pue.i(l46Var), ((e8b) l46Var.k(l8b.a)).q, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446), null, 2, false, 1, 0, new co0(w6c.l(8), w6c.l(12), w6c.l(1)), l46Var, ((i3 >> 3) & 14) | 1597440, 424);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new knc(str, i2);
        }
    }
}
