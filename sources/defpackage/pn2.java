package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pn2 {
    public static final ln2 a;

    static {
        pr4 pr4Var = pu.a;
        long j = y72.e;
        long j2 = y72.b;
        a = new ln2(j, j2, j2, y72.b(j2, 0.38f), y72.b(j2, 0.38f));
    }

    public static final void a(ln2 ln2Var, j09 j09Var, dd2 dd2Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(-527864079);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(ln2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(j09Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(dd2Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            kx0 kx0Var = nn2.a;
            j09 j09VarD0 = mh3.d0(ynb.b0(0.0f, nn2.d, urg.T(tm7.o(rrb.q(j09Var, 3.0f, a7c.b(4.0f), 0L, 0L, 28), ln2Var.a, g21.f)), 1), mh3.T(l46Var), false, 14);
            int i3 = (i2 << 3) & 7168;
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
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
            ks0.q(((i3 >> 6) & 112) | 6, dd2Var, e92.a, l46Var, true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b8(i, ln2Var, j09Var, dd2Var, 11);
        }
    }

    public static final void b(j09 j09Var, ln2 ln2Var, a26 a26Var, l46 l46Var, int i, int i2) {
        int i3;
        int i4;
        l46Var.h0(-625529233);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (l46Var.g(j09Var) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (l46Var.g(ln2Var) ? 32 : 16);
        }
        int i7 = i4 | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                j09Var = g09.a;
            }
            if (i6 != 0) {
                ln2Var = a;
            }
            a(ln2Var, j09Var, af1.b0(-250345048, new w7(a26Var, ln2Var, 12), l46Var), l46Var, ((i7 << 3) & 112) | ((i7 >> 3) & 14) | 384);
        } else {
            l46Var.Z();
        }
        j09 j09Var2 = j09Var;
        ln2 ln2Var2 = ln2Var;
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b8(j09Var2, ln2Var2, a26Var, i, i2);
        }
    }

    public static final void c(String str, boolean z, ln2 ln2Var, j09 j09Var, n26 n26Var, x16 x16Var, l46 l46Var, int i) {
        int i2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-2001167027);
        if ((i & 6) == 0) {
            i2 = (l46Var2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var2.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var2.g(ln2Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var2.g(j09Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var2.i(n26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var2.i(x16Var) ? 131072 : 65536;
        }
        int i3 = i2;
        int i4 = 0;
        if (l46Var2.W(i3 & 1, (74899 & i3) != 74898)) {
            kx0 kx0Var = nn2.a;
            float f = nn2.c;
            uc0 uc0Var = new uc0(f, true, new qc0(0));
            boolean z2 = ((i3 & 112) == 32) | ((458752 & i3) == 131072);
            Object objR = l46Var2.R();
            if (z2 || objR == sf2.a) {
                objR = new on2(z, x16Var, i4);
                l46Var2.p0(objR);
            }
            j09 j09VarB0 = ynb.b0(f, 0.0f, b.n(b.c(androidx.compose.foundation.b.c(j09Var, z, str, null, (x16) objR, 12), 1.0f), 112.0f, 48.0f, 280.0f, 48.0f), 2);
            t7c t7cVarA = s7c.a(uc0Var, kx0Var, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarB0);
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
            dec.l(he2Var, l46Var2, t7cVarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            if (n26Var == null) {
                l46Var2.f0(-1597947094);
                l46Var2.r(false);
            } else {
                l46Var2.f0(-1597947093);
                float f2 = nn2.e;
                j09 j09VarJ2 = b.j(f2, 0.0f, f2, f2, 2, g09.a);
                xn8 xn8VarC = s21.c(ndb.b, false);
                int iHashCode2 = Long.hashCode(l46Var2.T);
                u8a u8aVarM2 = l46Var2.m();
                j09 j09VarJ3 = m93.J(l46Var2, j09VarJ2);
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var, l46Var2, xn8VarC);
                dec.l(he2Var2, l46Var2, u8aVarM2);
                ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                dec.l(he2Var4, l46Var2, j09VarJ3);
                n26Var.m(new y72(z ? ln2Var.c : ln2Var.e), l46Var2, 0);
                l46Var2.r(true);
                l46Var2.r(false);
            }
            long j = z ? ln2Var.b : ln2Var.d;
            vd0.e(str, new jw7(1.0f, true), new mue(j, nn2.h, nn2.i, null, null, nn2.k, 0L, nn2.b, 0, nn2.j, null, null, 16613240), null, 0, false, 1, 0, null, l46Var2, (i3 & 14) | 1572864, 952);
            l46Var2 = l46Var2;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new tg(str, z, ln2Var, j09Var, n26Var, x16Var, i);
        }
    }
}
