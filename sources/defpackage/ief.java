package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ief {
    public static final long a = abg.c(184549375);
    public static final long b = abg.c(352321535);

    public static final void a(j09 j09Var, int i, int i2, n26 n26Var, a26 a26Var, l46 l46Var, int i3) {
        int i4;
        l46 l46Var2;
        a26 a26Var2;
        y6c y6cVar;
        int i5 = i;
        l46 l46Var3 = l46Var;
        he2 he2Var = hj6.x;
        he2 he2Var2 = hj6.X;
        he2 he2Var3 = hj6.y;
        he2 he2Var4 = hj6.z;
        l46Var3.h0(1030919131);
        if ((i3 & 6) == 0) {
            i4 = (l46Var3.g(j09Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= l46Var3.e(i5) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= l46Var3.e(i2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i3 & 3072) == 0) {
            i4 |= l46Var3.i(n26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i3 & 24576) == 0) {
            i4 |= l46Var3.i(a26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (l46Var3.W(i4 & 1, (i4 & 9363) != 9362)) {
            y6c y6cVarB = a7c.b(40.0f);
            j09 j09VarZ = ynb.Z(tm7.o(b.d(j09Var, 32.0f), ((e8b) l46Var3.k(l8b.a)).m, y6cVarB), 2.0f);
            t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var3, 48);
            int iHashCode = Long.hashCode(l46Var3.T);
            u8a u8aVarM = l46Var3.m();
            j09 j09VarJ = m93.J(l46Var3, j09VarZ);
            lf2.q.getClass();
            l46Var3.j0();
            boolean z = l46Var3.S;
            y6c y6cVar2 = y6cVarB;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var3.l(ov7Var);
            } else {
                l46Var3.s0();
            }
            dec.l(he2Var4, l46Var3, t7cVarA);
            dec.l(he2Var3, l46Var3, u8aVarM);
            dec.l(he2Var2, l46Var3, Integer.valueOf(iHashCode));
            dec.k(l46Var3);
            dec.l(he2Var, l46Var3, j09VarJ);
            l46Var3.f0(299894363);
            int i6 = 0;
            while (i6 < i5) {
                boolean z2 = i6 == i2;
                j09 j09VarD = new jw7(1.0f, true).D(b.b);
                j09 j09VarO = g09.a;
                if (z2) {
                    l46Var3.f0(213402130);
                    y6cVar = y6cVar2;
                    j09VarO = tm7.o(rrb.q(rrb.q(j09VarO, 3.0f, y6cVar2, abg.c(1291845632), abg.c(1291845632), 4), 8.0f, y6cVar2, abg.c(637534208), abg.c(637534208), 4), ((e8b) l46Var3.k(l8b.a)).d, y6cVar);
                    l46Var3.r(false);
                } else {
                    y6cVar = y6cVar2;
                    l46Var3.f0(213533229);
                    l46Var3.r(false);
                }
                j09 j09VarE = oa7.E(j09VarD.D(j09VarO), y6cVar);
                i5c i5cVar = new i5c(4);
                boolean zE = ((57344 & i4) == 16384) | l46Var3.e(i6);
                Object objR = l46Var3.R();
                if (zE || objR == sf2.a) {
                    objR = new rr1(i6, 13, a26Var);
                    l46Var3.p0(objR);
                }
                j09 j09VarW = n16.W(j09VarE, z2, false, i5cVar, (x16) objR, 10);
                xn8 xn8VarC = s21.c(ndb.f, false);
                y6c y6cVar3 = y6cVar;
                int iHashCode2 = Long.hashCode(l46Var3.T);
                u8a u8aVarM2 = l46Var3.m();
                j09 j09VarJ2 = m93.J(l46Var3, j09VarW);
                lf2.q.getClass();
                l46Var3.j0();
                if (l46Var3.S) {
                    l46Var3.l(ov7Var);
                } else {
                    l46Var3.s0();
                }
                dec.l(he2Var4, l46Var3, xn8VarC);
                dec.l(he2Var3, l46Var3, u8aVarM2);
                dec.l(he2Var2, l46Var3, Integer.valueOf(iHashCode2));
                dec.k(l46Var3);
                dec.l(he2Var, l46Var3, j09VarJ2);
                l46 l46Var4 = l46Var3;
                nte.b((String) n26Var.m(Integer.valueOf(i6), l46Var3, Integer.valueOf((i4 >> 6) & 112)), null, 0L, w6c.l(15), ar5.c, null, 0L, null, null, w6c.l(22), 0, false, 1, 0, null, null, l46Var4, 1597440, 24624, 243630);
                l46Var4.r(true);
                i6++;
                i5 = i;
                he2Var = he2Var;
                l46Var3 = l46Var4;
                y6cVar2 = y6cVar3;
                he2Var2 = he2Var2;
                he2Var3 = he2Var3;
                ov7Var = ov7Var;
                he2Var4 = he2Var4;
                i4 = i4;
            }
            a26Var2 = a26Var;
            l46Var2 = l46Var3;
            l46Var2.r(false);
            l46Var2.r(true);
        } else {
            l46Var2 = l46Var3;
            a26Var2 = a26Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new lx1(j09Var, i, i2, n26Var, a26Var2, i3);
        }
    }

    public static final void b(j09 j09Var, boolean z, oad oadVar, l46 l46Var, int i) {
        long j;
        boolean z2;
        l46 l46Var2 = l46Var;
        j09Var.getClass();
        l46Var2.h0(1956360858);
        int i2 = i | (l46Var2.g(j09Var) ? 4 : 2) | (l46Var2.h(z) ? 32 : 16) | (l46Var2.g(oadVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var2.W(i2 & 1, (i2 & 147) != 146)) {
            g09 g09Var = g09.a;
            j09 j09VarD = b.c(g09Var, 1.0f).D(j09Var);
            if (z) {
                l46Var2.f0(-1132883291);
                l46Var2.r(false);
                j = y72.j;
            } else {
                l46Var2.f0(-1132882521);
                j = ((e8b) l46Var2.k(l8b.a)).e;
                l46Var2.r(false);
            }
            j09 j09VarO = tm7.o(j09VarD, j, g21.f);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarO);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z3 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z3) {
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
            lad ladVar = oadVar instanceof lad ? (lad) oadVar : null;
            x16 x16Var = ladVar != null ? ladVar.a : null;
            if (x16Var == null) {
                l46Var2.f0(-1070623815);
                axa.a(0.0f, 0.0f, 0, 0, 63, 0L, 0L, l46Var2, null);
                l46Var2.r(false);
                z2 = true;
            } else {
                l46Var2.f0(-1070565597);
                j09 j09VarZ = ynb.Z(g09Var, 24.0f);
                c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
                int iHashCode2 = Long.hashCode(l46Var2.T);
                u8a u8aVarM2 = l46Var2.m();
                j09 j09VarJ2 = m93.J(l46Var2, j09VarZ);
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
                z2 = true;
                nte.b(afc.q(R.string.share_failed, l46Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 0, 0, 262142);
                bm8.h(x16Var, null, false, null, null, ym8.d, l46Var, 1572864, 62);
                l46Var2 = l46Var;
                l46Var2.r(true);
                l46Var2.r(false);
            }
            l46Var2.r(z2);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new kg(j09Var, z, oadVar, i, 16);
        }
    }

    public static final void c(int i, l46 l46Var) {
        l46Var.h0(1326911800);
        if (l46Var.W(i & 1, i != 0)) {
            g09 g09Var = g09.a;
            j09 j09VarD = b.d(b.c(g09Var, 1.0f), 24.0f);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarD);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            s21.a(tm7.o(oa7.E(b.d(b.p(g09Var, 36.0f), 5.0f), a7c.a), y72.b(((e8b) l46Var.k(l8b.a)).s, 0.4f), g21.f), l46Var, 0);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cwe(i, 3);
        }
    }

    public static final void d(j09 j09Var, x6d x6dVar, int i, n26 n26Var, List list, boolean z, boolean z2, a26 a26Var, x16 x16Var, a26 a26Var2, l46 l46Var, int i2) {
        int i3;
        int i4;
        int i5;
        l46 l46Var2 = l46Var;
        x6dVar.getClass();
        List list2 = x6dVar.c;
        a26Var.getClass();
        x16Var.getClass();
        a26Var2.getClass();
        l46Var2.h0(-1475963961);
        int i6 = i2 | (l46Var2.g(j09Var) ? 4 : 2) | (l46Var2.i(x6dVar) ? 32 : 16) | (l46Var2.e(i) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.i(n26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var2.g(list) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var2.h(z) ? 131072 : 65536) | (l46Var2.h(z2) ? 1048576 : 524288) | (l46Var2.i(a26Var) ? 8388608 : 4194304) | (l46Var2.i(x16Var) ? 67108864 : 33554432) | (l46Var2.i(a26Var2) ? 536870912 : 268435456);
        if (l46Var2.W(i6 & 1, (306783379 & i6) != 306783378)) {
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var2, 0);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09Var);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z3 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z3) {
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
            oa7.d(null, 0.5f, ((e8b) l46Var2.k(l8b.a)).A, l46Var2, 48, 1);
            l46Var2 = l46Var2;
            g09 g09Var = g09.a;
            j09 j09VarD0 = ynb.d0(0.0f, 24.0f, 0.0f, 24.0f, 5, mh3.N(b.c(g09Var, 1.0f)));
            c92 c92VarA2 = a92.a(new uc0(24.0f, true, new qc0(0)), ndb.Z, l46Var2, 54);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarD0);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, c92VarA2);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            if (list2.size() > 1) {
                l46Var2.f0(-1179409106);
                int i7 = i6 >> 6;
                i4 = i6;
                f(b.p(g09Var, 84.0f * list2.size()), list2.size(), i, z, n26Var, a26Var, l46Var2, (i6 & 896) | (i7 & 7168) | ((i6 << 3) & 57344) | (i7 & 458752));
                i3 = i;
                l46Var2.r(false);
            } else {
                i3 = i;
                i4 = i6;
                l46Var2.f0(-1179108313);
                l46Var2.r(false);
            }
            int iOrdinal = ((e8d) list2.get(i3)).ordinal();
            if (iOrdinal == 0) {
                i5 = R.string.share_save_screenshot;
            } else if (iOrdinal == 1) {
                i5 = R.string.share_save_card;
            } else {
                if (iOrdinal != 2) {
                    ap.c();
                    return;
                }
                i5 = R.string.share_save_long;
            }
            String strQ = afc.q(i5, l46Var2);
            int i8 = ((i4 >> 9) & 112) | ((i4 >> 12) & 896);
            int i9 = i4 >> 15;
            d8c.l(strQ, list, z2, x16Var, a26Var2, null, l46Var2, i8 | (i9 & 7168) | (i9 & 57344));
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            i3 = i;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new x3d(j09Var, x6dVar, i3, n26Var, list, z, z2, a26Var, x16Var, a26Var2, i2);
        }
    }

    public static final void e(j09 j09Var, cv6 cv6Var, l46 l46Var, int i) {
        l46Var.h0(1679728550);
        int i2 = (l46Var.g(j09Var) ? 4 : 2) | i | (l46Var.g(cv6Var) ? 32 : 16);
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            pr4 pr4Var = l8b.a;
            long j = ((e8b) l46Var.k(pr4Var)).e;
            y02 y02Var = g21.f;
            j09 j09VarO = tm7.o(j09Var, j, y02Var);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarO);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            g09 g09Var = g09.a;
            d31 d31Var = d31.a;
            if (cv6Var == null) {
                l46Var.f0(1868098252);
                l46Var.r(false);
            } else {
                l46Var.f0(1868098253);
                feg.k(cv6Var, null, d31Var.b(g09Var), an2.a, 0, l46Var, 24624, 232);
                l46Var.r(false);
            }
            s21.a(tm7.o(d31Var.b(g09Var), ((e8b) l46Var.k(pr4Var)).o, y02Var), l46Var, 0);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p4c(j09Var, cv6Var, i, 21);
        }
    }

    public static final void f(j09 j09Var, int i, int i2, boolean z, n26 n26Var, a26 a26Var, l46 l46Var, int i3) {
        int i4;
        l46 l46Var2 = l46Var;
        a26Var.getClass();
        l46Var2.h0(-742403151);
        if ((i3 & 6) == 0) {
            i4 = (l46Var2.g(j09Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= l46Var2.e(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= l46Var2.e(i2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i3 & 3072) == 0) {
            i4 |= l46Var2.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i3 & 24576) == 0) {
            i4 |= l46Var2.i(n26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i3) == 0) {
            i4 |= l46Var2.i(a26Var) ? 131072 : 65536;
        }
        if (!l46Var2.W(i4 & 1, (74899 & i4) != 74898)) {
            l46Var2.Z();
        } else if (z) {
            l46Var2.f0(-2145452667);
            int i5 = i4 & 1022;
            int i6 = i4 >> 3;
            a(j09Var, i, i2, n26Var, a26Var, l46Var2, i5 | (i6 & 7168) | (i6 & 57344));
            l46Var2.r(false);
        } else {
            l46Var2.f0(-2145275161);
            scc.b(j09Var, i, false, n26Var, null, i2, a26Var, l46Var2, (57344 & i4) | (i4 & 14) | 3072 | (i4 & 112) | ((i4 << 12) & 3670016) | ((i4 << 6) & 29360128), 36);
            l46Var2 = l46Var2;
            l46Var2.r(false);
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new bb4(j09Var, i, i2, z, n26Var, a26Var, i3);
        }
    }

    public static final void g(final j09 j09Var, final x6d x6dVar, final cs3 cs3Var, final pad padVar, final pad padVar2, final Integer num, final boolean z, final boolean z2, final j09 j09Var2, final boolean z3, final boolean z4, final a26 a26Var, final dd2 dd2Var, l46 l46Var, final int i) {
        x6dVar.getClass();
        a26Var.getClass();
        l46Var.h0(1577675244);
        int i2 = i | (l46Var.g(j09Var) ? 4 : 2) | (l46Var.i(x6dVar) ? 32 : 16) | (l46Var.g(cs3Var) ? 256 : 128) | (l46Var.g(num) ? 131072 : 65536) | (l46Var.h(z) ? 1048576 : 524288) | (l46Var.h(z2) ? 8388608 : 4194304) | (l46Var.g(j09Var2) ? 67108864 : 33554432) | (l46Var.h(z3) ? 536870912 : 268435456);
        if (l46Var.W(i2 & 1, ((306783379 & i2) == 306783378 && ((((l46Var.h(z4) ? (char) 4 : (char) 2) | (l46Var.i(a26Var) ? ' ' : (char) 16)) | (l46Var.i(dd2Var) ? (char) 256 : (char) 128)) & 147) == 146) ? false : true)) {
            nk8.d(j09Var, null, af1.b0(1338154050, new n26() { // from class: cef
                /* JADX WARN: Code duplicated, block: B:30:0x00ff  */
                /* JADX WARN: Code duplicated, block: B:42:0x0130  */
                /* JADX WARN: Code duplicated, block: B:44:0x0134  */
                /* JADX WARN: Code duplicated, block: B:45:0x0137  */
                /* JADX WARN: Code duplicated, block: B:57:0x01e0  */
                /* JADX WARN: Code duplicated, block: B:60:0x01ff  */
                /* JADX WARN: Code duplicated, block: B:61:0x0202  */
                /* JADX WARN: Code duplicated, block: B:64:0x0209  */
                /* JADX WARN: Code duplicated, block: B:65:0x0215  */
                /* JADX WARN: Code duplicated, block: B:68:0x0257  */
                /* JADX WARN: Code duplicated, block: B:69:0x025b  */
                /* JADX WARN: Code duplicated, block: B:72:0x02b5  */
                /* JADX WARN: Code duplicated, block: B:73:0x02b9  */
                /* JADX WARN: Code duplicated, block: B:78:0x0117 A[SYNTHETIC] */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v13 */
                /* JADX WARN: Type inference failed for: r4v14, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r4v22 */
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    float f;
                    kad kadVar;
                    y6c y6cVarB;
                    final x4d x4dVar;
                    Iterator it;
                    boolean z5;
                    final pad padVar3;
                    Integer num2;
                    Object next;
                    Integer num3;
                    Integer num4;
                    boolean z6;
                    g09 g09Var;
                    boolean z7;
                    kad kadVar2;
                    float f2;
                    ?? r4;
                    float f3;
                    l46 l46Var2;
                    j09 j09Var3;
                    long j;
                    boolean z8;
                    ov7 ov7Var;
                    y02 y02Var = g21.f;
                    e31 e31Var = (e31) obj;
                    l46 l46Var3 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    e31Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= l46Var3.g(e31Var) ? 4 : 2;
                    }
                    if (l46Var3.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                        final x6d x6dVar2 = x6dVar;
                        xad xadVar = x6dVar2.a;
                        List list = x6dVar2.c;
                        xad xadVar2 = xad.GiftCard;
                        if (xadVar == xadVar2) {
                            float f4 = ((yi4) mh3.l(new yi4(e31Var.d()), new yi4(0.0f))).a;
                            f = 10.0f;
                            float f5 = ((yi4) mh3.l(new yi4(24.0f), new yi4(0.0f))).a;
                            kadVar = new kad(((yi4) mh3.l(new yi4(f4 - (2.0f * f5)), new yi4(0.0f))).a, 0.0f, 0.0f, f5);
                        } else {
                            f = 10.0f;
                            float f6 = ((yi4) mh3.l(new yi4(e31Var.d()), new yi4(0.0f))).a / 16.0f;
                            float f7 = f6 * 1.0f;
                            float f8 = 2.0f * f6;
                            kadVar = new kad(f6 * 10.0f, f7, f8, f7 + f8);
                        }
                        kad kadVar3 = kadVar;
                        float f9 = ((yi4) mh3.l(new yi4(e31Var.c() - 36.0f), new yi4(0.0f))).a;
                        xad xadVar3 = x6dVar2.a;
                        final boolean z9 = z2;
                        if (xadVar3 == xadVar2) {
                            y6cVarB = a7c.b(f);
                        } else {
                            if (z9) {
                                x4dVar = y02Var;
                            } else {
                                y6cVarB = a7c.b(12.0f);
                            }
                            cs3 cs3Var2 = cs3Var;
                            final int iO = cs3Var2.o();
                            it = t72.B(list).iterator();
                            do {
                                z5 = ((y67) it).c;
                                padVar3 = padVar;
                                num2 = null;
                                if (z5) {
                                    next = null;
                                    break;
                                }
                                next = ((q67) it).next();
                            } while (padVar3.d(((Number) next).intValue()));
                            num3 = (Integer) next;
                            num4 = num;
                            pad padVar4 = padVar2;
                            if (num4 != null && !padVar4.d(num4.intValue())) {
                                num2 = num4;
                            }
                            if (num2 != null) {
                                num3 = num2;
                            }
                            if (num2 == null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            g09Var = g09.a;
                            z7 = z3;
                            float f10 = kadVar3.a;
                            if (z7 || num3 == null) {
                                kadVar2 = kadVar3;
                                f2 = f9;
                                r4 = 0;
                                f3 = 1.0f;
                                l46Var3.f0(-936776960);
                                l46Var3.r(false);
                                l46Var2 = l46Var3;
                            } else {
                                l46Var3.f0(-938144463);
                                l46Var3.d0(1770852835, l46Var3.I(Boolean.valueOf(z6), num3));
                                pad padVar5 = z6 ? padVar3 : padVar4;
                                j09 j09VarA = e31Var.a(b.p(g09Var, f10), ndb.c);
                                j09VarA.getClass();
                                j09 j09VarT = b21.t(vwc.a(j09VarA, new k8f(9)), new k8f(10));
                                Object objR = l46Var3.R();
                                if (objR == sf2.a) {
                                    objR = new mie(24);
                                    l46Var3.p0(objR);
                                }
                                f2 = f9;
                                kadVar2 = kadVar3;
                                f3 = 1.0f;
                                fdc.e(f2, false, false, (x16) objR, j09VarT, null, af1.b0(2143215063, new p91(padVar5, num3, z6, a26Var, z4, dd2Var), l46Var3), l46Var3, 1576368, 32);
                                l46 l46Var4 = l46Var3;
                                r4 = 0;
                                l46Var4.r(false);
                                l46Var4.r(false);
                                l46Var2 = l46Var4;
                            }
                            j09 j09VarB = e31Var.b(g09Var);
                            if (z9 != 0) {
                                j09Var3 = j09Var2;
                            } else {
                                j09Var3 = g09Var;
                            }
                            j09 j09VarD = j09VarB.D(j09Var3);
                            if (z9 != 0) {
                                l46Var2.f0(1770901859);
                                l46Var2.r(r4);
                                j = ief.a;
                            } else {
                                l46Var2.f0(1770903311);
                                j = ((e8b) l46Var2.k(l8b.a)).e;
                                l46Var2.r(r4);
                            }
                            s21.a(tm7.o(j09VarD, j, y02Var), l46Var2, r4);
                            j09 j09VarB2 = e31Var.b(g09Var);
                            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var2, r4);
                            int iHashCode = Long.hashCode(l46Var2.T);
                            u8a u8aVarM = l46Var2.m();
                            j09 j09VarJ = m93.J(l46Var2, j09VarB2);
                            lf2.q.getClass();
                            l46Var2.j0();
                            z8 = l46Var2.S;
                            ov7Var = LayoutNode.h1;
                            if (z8) {
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
                            ief.c(0, l46Var2);
                            j09 j09VarD0 = ynb.d0(0.0f, 12.0f, 0.0f, 0.0f, 13, b.c(g09Var, f3).D(new jw7(f3, true)));
                            xn8 xn8VarC = s21.c(ndb.b, false);
                            int iHashCode2 = Long.hashCode(l46Var2.T);
                            u8a u8aVarM2 = l46Var2.m();
                            j09 j09VarJ2 = m93.J(l46Var2, j09VarD0);
                            l46Var2.j0();
                            if (l46Var2.S) {
                                l46Var2.l(ov7Var);
                            } else {
                                l46Var2.s0();
                            }
                            dec.l(he2Var, l46Var2, xn8VarC);
                            dec.l(he2Var2, l46Var2, u8aVarM2);
                            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                            dec.l(he2Var4, l46Var2, j09VarJ2);
                            kad kadVar4 = kadVar2;
                            final float f11 = f2;
                            cn1.h(kadVar4.b, list.size() - 1, 1572912, 16000, ndb.y, af1.b0(1712702719, new o26() { // from class: hef
                                @Override // defpackage.o26
                                public final Object t(Object obj4, Object obj5, Object obj6, Object obj7) {
                                    Integer num5 = (Integer) obj5;
                                    final int iIntValue2 = num5.intValue();
                                    l46 l46Var5 = (l46) obj6;
                                    int iIntValue3 = ((Integer) obj7).intValue();
                                    ((rx9) obj4).getClass();
                                    if ((iIntValue3 & 48) == 0) {
                                        iIntValue3 |= l46Var5.e(iIntValue2) ? 32 : 16;
                                    }
                                    final int i3 = 1;
                                    if (l46Var5.W(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                                        boolean z10 = iIntValue2 == iO;
                                        final pad padVar6 = padVar3;
                                        int i4 = padVar6.i(iIntValue2);
                                        int i5 = iIntValue3 & 112;
                                        int i6 = i5 ^ 48;
                                        boolean zG = l46Var5.g(padVar6) | ((i6 > 32 && l46Var5.e(iIntValue2)) || (iIntValue3 & 48) == 32) | l46Var5.e(i4);
                                        Object objR2 = l46Var5.R();
                                        g8d g8dVar = null;
                                        i8c i8cVar = sf2.a;
                                        if (zG || objR2 == i8cVar) {
                                            objR2 = new xta(i4 > 0 ? padVar6.a.a(num5) : null);
                                            l46Var5.p0(objR2);
                                        }
                                        ks ksVar = ((xta) objR2).b;
                                        boolean zG2 = ((i6 > 32 && l46Var5.e(iIntValue2)) || (iIntValue3 & 48) == 32) | l46Var5.g(padVar6) | l46Var5.e(padVar6.i(iIntValue2));
                                        Object objR3 = l46Var5.R();
                                        if (zG2 || objR3 == i8cVar) {
                                            g8d g8dVar2 = (g8d) padVar6.e.get(num5);
                                            if (g8dVar2 != null) {
                                                g8dVar2.b();
                                                g8dVar = g8dVar2;
                                            }
                                            objR3 = new zta(g8dVar);
                                            l46Var5.p0(objR3);
                                        }
                                        g8d g8dVar3 = ((zta) objR3).a;
                                        boolean z11 = z10;
                                        final float f12 = f11;
                                        x4d x4dVar2 = x4dVar;
                                        if (g8dVar3 != null) {
                                            l46Var5.f0(-1084337029);
                                            e8d e8dVar = (e8d) x6dVar2.c.get(iIntValue2);
                                            boolean zE = padVar6.e(iIntValue2);
                                            boolean zG3 = (i5 == 32) | l46Var5.g(padVar6);
                                            Object objR4 = l46Var5.R();
                                            if (zG3 || objR4 == i8cVar) {
                                                objR4 = new x16() { // from class: def
                                                    @Override // defpackage.x16
                                                    public final Object invoke() {
                                                        int i7 = i3;
                                                        wef wefVar = wef.a;
                                                        int i8 = iIntValue2;
                                                        pad padVar7 = padVar6;
                                                        switch (i7) {
                                                            case 0:
                                                                padVar7.h(i8);
                                                                break;
                                                            case 1:
                                                                padVar7.h(i8);
                                                                break;
                                                            default:
                                                                padVar7.h(i8);
                                                                break;
                                                        }
                                                        return wefVar;
                                                    }
                                                };
                                                l46Var5.p0(objR4);
                                            }
                                            jcc.b(g8dVar3, e8dVar, f12, zE, z11, x4dVar2, (x16) objR4, null, null, null, l46Var5, 8);
                                            l46Var5.r(false);
                                        } else {
                                            final int i7 = 0;
                                            if (ksVar != null) {
                                                l46Var5.f0(-1083886165);
                                                boolean z12 = true;
                                                boolean zE2 = padVar6.e(iIntValue2);
                                                boolean zG4 = l46Var5.g(padVar6);
                                                if (i5 != 32) {
                                                    z12 = false;
                                                }
                                                boolean z13 = zG4 | z12;
                                                Object objR5 = l46Var5.R();
                                                if (z13 || objR5 == i8cVar) {
                                                    final int i8 = 2;
                                                    objR5 = new x16() { // from class: def
                                                        @Override // defpackage.x16
                                                        public final Object invoke() {
                                                            int i9 = i8;
                                                            wef wefVar = wef.a;
                                                            int i10 = iIntValue2;
                                                            pad padVar7 = padVar6;
                                                            switch (i9) {
                                                                case 0:
                                                                    padVar7.h(i10);
                                                                    break;
                                                                case 1:
                                                                    padVar7.h(i10);
                                                                    break;
                                                                default:
                                                                    padVar7.h(i10);
                                                                    break;
                                                            }
                                                            return wefVar;
                                                        }
                                                    };
                                                    l46Var5.p0(objR5);
                                                }
                                                fdc.d(ksVar, f12, zE2, z11, x4dVar2, (x16) objR5, null, null, l46Var5, 0, 192);
                                                l46Var5.r(false);
                                            } else {
                                                boolean z14 = true;
                                                l46Var5.f0(-1083500959);
                                                boolean zE3 = padVar6.e(iIntValue2);
                                                boolean zG5 = l46Var5.g(padVar6);
                                                if (i5 != 32) {
                                                    z14 = false;
                                                }
                                                boolean z15 = zG5 | z14;
                                                Object objR6 = l46Var5.R();
                                                if (z15 || objR6 == i8cVar) {
                                                    objR6 = new x16() { // from class: def
                                                        @Override // defpackage.x16
                                                        public final Object invoke() {
                                                            int i9 = i7;
                                                            wef wefVar = wef.a;
                                                            int i10 = iIntValue2;
                                                            pad padVar7 = padVar6;
                                                            switch (i9) {
                                                                case 0:
                                                                    padVar7.h(i10);
                                                                    break;
                                                                case 1:
                                                                    padVar7.h(i10);
                                                                    break;
                                                                default:
                                                                    padVar7.h(i10);
                                                                    break;
                                                            }
                                                            return wefVar;
                                                        }
                                                    };
                                                    l46Var5.p0(objR6);
                                                }
                                                final boolean z16 = z9;
                                                fdc.e(f12, zE3, z11, (x16) objR6, null, null, af1.b0(670440060, new l26() { // from class: eef
                                                    @Override // defpackage.l26
                                                    public final Object z(Object obj8, Object obj9) {
                                                        l46 l46Var6 = (l46) obj8;
                                                        int iIntValue4 = ((Integer) obj9).intValue();
                                                        if (l46Var6.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                            j09 j09VarD2 = b.d(g09.a, f12);
                                                            oad oadVar = (oad) l46Var6.k(vgb.b);
                                                            if (oadVar == null) {
                                                                oadVar = (oad) padVar6.c.get(Integer.valueOf(iIntValue2));
                                                            }
                                                            ief.b(j09VarD2, z16, oadVar, l46Var6, 0);
                                                        } else {
                                                            l46Var6.Z();
                                                        }
                                                        return wef.a;
                                                    }
                                                }, l46Var5), l46Var5, 1572864, 48);
                                                l46Var5.r(false);
                                            }
                                        }
                                    } else {
                                        l46Var5.Z();
                                    }
                                    return wef.a;
                                }
                            }, l46Var2), l46Var2, b.c, null, null, ynb.q(kadVar4.d, 0.0f, 2), new ex9(f10), cs3Var2, null, null, z);
                            l46Var2.r(true);
                            l46Var2.r(true);
                        }
                        x4dVar = y6cVarB;
                        cs3 cs3Var3 = cs3Var;
                        final int iO2 = cs3Var3.o();
                        it = t72.B(list).iterator();
                        do {
                            z5 = ((y67) it).c;
                            padVar3 = padVar;
                            num2 = null;
                            if (z5) {
                                next = null;
                                break;
                            }
                            next = ((q67) it).next();
                        } while (padVar3.d(((Number) next).intValue()));
                        num3 = (Integer) next;
                        num4 = num;
                        pad padVar6 = padVar2;
                        if (num4 != null) {
                            num2 = num4;
                        }
                        if (num2 != null) {
                            num3 = num2;
                        }
                        if (num2 == null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        g09Var = g09.a;
                        z7 = z3;
                        float f12 = kadVar3.a;
                        if (z7) {
                            kadVar2 = kadVar3;
                            f2 = f9;
                            r4 = 0;
                            f3 = 1.0f;
                            l46Var3.f0(-936776960);
                            l46Var3.r(false);
                            l46Var2 = l46Var3;
                        } else {
                            kadVar2 = kadVar3;
                            f2 = f9;
                            r4 = 0;
                            f3 = 1.0f;
                            l46Var3.f0(-936776960);
                            l46Var3.r(false);
                            l46Var2 = l46Var3;
                        }
                        j09 j09VarB3 = e31Var.b(g09Var);
                        if (z9 != 0) {
                            j09Var3 = j09Var2;
                        } else {
                            j09Var3 = g09Var;
                        }
                        j09 j09VarD2 = j09VarB3.D(j09Var3);
                        if (z9 != 0) {
                            l46Var2.f0(1770901859);
                            l46Var2.r(r4);
                            j = ief.a;
                        } else {
                            l46Var2.f0(1770903311);
                            j = ((e8b) l46Var2.k(l8b.a)).e;
                            l46Var2.r(r4);
                        }
                        s21.a(tm7.o(j09VarD2, j, y02Var), l46Var2, r4);
                        j09 j09VarB4 = e31Var.b(g09Var);
                        c92 c92VarA2 = a92.a(xc0.c, ndb.Y, l46Var2, r4);
                        int iHashCode3 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM3 = l46Var2.m();
                        j09 j09VarJ3 = m93.J(l46Var2, j09VarB4);
                        lf2.q.getClass();
                        l46Var2.j0();
                        z8 = l46Var2.S;
                        ov7Var = LayoutNode.h1;
                        if (z8) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        he2 he2Var5 = hj6.z;
                        dec.l(he2Var5, l46Var2, c92VarA2);
                        he2 he2Var6 = hj6.y;
                        dec.l(he2Var6, l46Var2, u8aVarM3);
                        Integer numValueOf2 = Integer.valueOf(iHashCode3);
                        he2 he2Var7 = hj6.X;
                        dec.l(he2Var7, l46Var2, numValueOf2);
                        dec.k(l46Var2);
                        he2 he2Var8 = hj6.x;
                        dec.l(he2Var8, l46Var2, j09VarJ3);
                        ief.c(0, l46Var2);
                        j09 j09VarD1 = ynb.d0(0.0f, 12.0f, 0.0f, 0.0f, 13, b.c(g09Var, f3).D(new jw7(f3, true)));
                        xn8 xn8VarC2 = s21.c(ndb.b, false);
                        int iHashCode4 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM4 = l46Var2.m();
                        j09 j09VarJ4 = m93.J(l46Var2, j09VarD1);
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(he2Var5, l46Var2, xn8VarC2);
                        dec.l(he2Var6, l46Var2, u8aVarM4);
                        ib8.s(iHashCode4, l46Var2, he2Var7, l46Var2);
                        dec.l(he2Var8, l46Var2, j09VarJ4);
                        kad kadVar5 = kadVar2;
                        final float f13 = f2;
                        cn1.h(kadVar5.b, list.size() - 1, 1572912, 16000, ndb.y, af1.b0(1712702719, new o26() { // from class: hef
                            @Override // defpackage.o26
                            public final Object t(Object obj4, Object obj5, Object obj6, Object obj7) {
                                Integer num5 = (Integer) obj5;
                                final int iIntValue2 = num5.intValue();
                                l46 l46Var5 = (l46) obj6;
                                int iIntValue3 = ((Integer) obj7).intValue();
                                ((rx9) obj4).getClass();
                                if ((iIntValue3 & 48) == 0) {
                                    iIntValue3 |= l46Var5.e(iIntValue2) ? 32 : 16;
                                }
                                final int i3 = 1;
                                if (l46Var5.W(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                                    boolean z10 = iIntValue2 == iO2;
                                    final pad padVar7 = padVar3;
                                    int i4 = padVar7.i(iIntValue2);
                                    int i5 = iIntValue3 & 112;
                                    int i6 = i5 ^ 48;
                                    boolean zG = l46Var5.g(padVar7) | ((i6 > 32 && l46Var5.e(iIntValue2)) || (iIntValue3 & 48) == 32) | l46Var5.e(i4);
                                    Object objR2 = l46Var5.R();
                                    g8d g8dVar = null;
                                    i8c i8cVar = sf2.a;
                                    if (zG || objR2 == i8cVar) {
                                        objR2 = new xta(i4 > 0 ? padVar7.a.a(num5) : null);
                                        l46Var5.p0(objR2);
                                    }
                                    ks ksVar = ((xta) objR2).b;
                                    boolean zG2 = ((i6 > 32 && l46Var5.e(iIntValue2)) || (iIntValue3 & 48) == 32) | l46Var5.g(padVar7) | l46Var5.e(padVar7.i(iIntValue2));
                                    Object objR3 = l46Var5.R();
                                    if (zG2 || objR3 == i8cVar) {
                                        g8d g8dVar2 = (g8d) padVar7.e.get(num5);
                                        if (g8dVar2 != null) {
                                            g8dVar2.b();
                                            g8dVar = g8dVar2;
                                        }
                                        objR3 = new zta(g8dVar);
                                        l46Var5.p0(objR3);
                                    }
                                    g8d g8dVar3 = ((zta) objR3).a;
                                    boolean z11 = z10;
                                    final float f14 = f13;
                                    x4d x4dVar2 = x4dVar;
                                    if (g8dVar3 != null) {
                                        l46Var5.f0(-1084337029);
                                        e8d e8dVar = (e8d) x6dVar2.c.get(iIntValue2);
                                        boolean zE = padVar7.e(iIntValue2);
                                        boolean zG3 = (i5 == 32) | l46Var5.g(padVar7);
                                        Object objR4 = l46Var5.R();
                                        if (zG3 || objR4 == i8cVar) {
                                            objR4 = new x16() { // from class: def
                                                @Override // defpackage.x16
                                                public final Object invoke() {
                                                    int i9 = i3;
                                                    wef wefVar = wef.a;
                                                    int i10 = iIntValue2;
                                                    pad padVar8 = padVar7;
                                                    switch (i9) {
                                                        case 0:
                                                            padVar8.h(i10);
                                                            break;
                                                        case 1:
                                                            padVar8.h(i10);
                                                            break;
                                                        default:
                                                            padVar8.h(i10);
                                                            break;
                                                    }
                                                    return wefVar;
                                                }
                                            };
                                            l46Var5.p0(objR4);
                                        }
                                        jcc.b(g8dVar3, e8dVar, f14, zE, z11, x4dVar2, (x16) objR4, null, null, null, l46Var5, 8);
                                        l46Var5.r(false);
                                    } else {
                                        final int i7 = 0;
                                        if (ksVar != null) {
                                            l46Var5.f0(-1083886165);
                                            boolean z12 = true;
                                            boolean zE2 = padVar7.e(iIntValue2);
                                            boolean zG4 = l46Var5.g(padVar7);
                                            if (i5 != 32) {
                                                z12 = false;
                                            }
                                            boolean z13 = zG4 | z12;
                                            Object objR5 = l46Var5.R();
                                            if (z13 || objR5 == i8cVar) {
                                                final int i8 = 2;
                                                objR5 = new x16() { // from class: def
                                                    @Override // defpackage.x16
                                                    public final Object invoke() {
                                                        int i9 = i8;
                                                        wef wefVar = wef.a;
                                                        int i10 = iIntValue2;
                                                        pad padVar8 = padVar7;
                                                        switch (i9) {
                                                            case 0:
                                                                padVar8.h(i10);
                                                                break;
                                                            case 1:
                                                                padVar8.h(i10);
                                                                break;
                                                            default:
                                                                padVar8.h(i10);
                                                                break;
                                                        }
                                                        return wefVar;
                                                    }
                                                };
                                                l46Var5.p0(objR5);
                                            }
                                            fdc.d(ksVar, f14, zE2, z11, x4dVar2, (x16) objR5, null, null, l46Var5, 0, 192);
                                            l46Var5.r(false);
                                        } else {
                                            boolean z14 = true;
                                            l46Var5.f0(-1083500959);
                                            boolean zE3 = padVar7.e(iIntValue2);
                                            boolean zG5 = l46Var5.g(padVar7);
                                            if (i5 != 32) {
                                                z14 = false;
                                            }
                                            boolean z15 = zG5 | z14;
                                            Object objR6 = l46Var5.R();
                                            if (z15 || objR6 == i8cVar) {
                                                objR6 = new x16() { // from class: def
                                                    @Override // defpackage.x16
                                                    public final Object invoke() {
                                                        int i9 = i7;
                                                        wef wefVar = wef.a;
                                                        int i10 = iIntValue2;
                                                        pad padVar8 = padVar7;
                                                        switch (i9) {
                                                            case 0:
                                                                padVar8.h(i10);
                                                                break;
                                                            case 1:
                                                                padVar8.h(i10);
                                                                break;
                                                            default:
                                                                padVar8.h(i10);
                                                                break;
                                                        }
                                                        return wefVar;
                                                    }
                                                };
                                                l46Var5.p0(objR6);
                                            }
                                            final boolean z16 = z9;
                                            fdc.e(f14, zE3, z11, (x16) objR6, null, null, af1.b0(670440060, new l26() { // from class: eef
                                                @Override // defpackage.l26
                                                public final Object z(Object obj8, Object obj9) {
                                                    l46 l46Var6 = (l46) obj8;
                                                    int iIntValue4 = ((Integer) obj9).intValue();
                                                    if (l46Var6.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                        j09 j09VarD3 = b.d(g09.a, f14);
                                                        oad oadVar = (oad) l46Var6.k(vgb.b);
                                                        if (oadVar == null) {
                                                            oadVar = (oad) padVar7.c.get(Integer.valueOf(iIntValue2));
                                                        }
                                                        ief.b(j09VarD3, z16, oadVar, l46Var6, 0);
                                                    } else {
                                                        l46Var6.Z();
                                                    }
                                                    return wef.a;
                                                }
                                            }, l46Var5), l46Var5, 1572864, 48);
                                            l46Var5.r(false);
                                        }
                                    }
                                } else {
                                    l46Var5.Z();
                                }
                                return wef.a;
                            }
                        }, l46Var2), l46Var2, b.c, null, null, ynb.q(kadVar5.d, 0.0f, 2), new ex9(f12), cs3Var3, null, null, z);
                        l46Var2.r(true);
                        l46Var2.r(true);
                    } else {
                        l46Var3.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, (i2 & 14) | 3072, 6);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(x6dVar, cs3Var, padVar, padVar2, num, z, z2, j09Var2, z3, z4, a26Var, dd2Var, i) { // from class: gef
                public final /* synthetic */ dd2 X;
                public final /* synthetic */ x6d b;
                public final /* synthetic */ cs3 c;
                public final /* synthetic */ pad d;
                public final /* synthetic */ pad e;
                public final /* synthetic */ Integer f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ j09 w;
                public final /* synthetic */ boolean x;
                public final /* synthetic */ boolean y;
                public final /* synthetic */ a26 z;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(27713);
                    ief.g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, this.z, this.X, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }
}
