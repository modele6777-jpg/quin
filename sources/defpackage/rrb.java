package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rrb {
    public static final void a(final dd2 dd2Var, l26 l26Var, l26 l26Var2, mue mueVar, final long j, long j2, l46 l46Var, final int i) {
        l26 l26Var3;
        l26 l26Var4;
        mue mueVar2;
        long j3;
        boolean z;
        int i2;
        boolean z2;
        l46Var.h0(-931325388);
        int i3 = i | (l46Var.i(dd2Var) ? 4 : 2) | (l46Var.i(l26Var) ? 32 : 16) | (l46Var.i(l26Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(mueVar) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.f(j) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.f(j2) ? 131072 : 65536);
        if (l46Var.W(i3 & 1, (74899 & i3) != 74898)) {
            float f = l26Var2 == null ? 8.0f : 0.0f;
            g09 g09Var = g09.a;
            j09 j09VarD0 = ynb.d0(16.0f, 0.0f, f, 0.0f, 10, g09Var);
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = new mr(11);
                l46Var.p0(objR);
            }
            xn8 xn8Var = (xn8) objR;
            int iW = an1.w(l46Var);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarD0);
            lf2.q.getClass();
            l46Var.j0();
            boolean z3 = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z3) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var, xn8Var);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var, u8aVarM);
            he2 he2Var3 = hj6.X;
            if (l46Var.S || !pa7.t(l46Var.R(), Integer.valueOf(iW))) {
                tec.r(iW, l46Var, iW, he2Var3);
            }
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var, j09VarJ);
            j09 j09VarB0 = ynb.b0(0.0f, 6.0f, vfh.E(g09Var, "text"), 1);
            lx0 lx0Var = ndb.b;
            xn8 xn8VarC = s21.c(lx0Var, false);
            int iW2 = an1.w(l46Var);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarB0);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, xn8VarC);
            dec.l(he2Var2, l46Var, u8aVarM2);
            if (l46Var.S || !pa7.t(l46Var.R(), Integer.valueOf(iW2))) {
                tec.r(iW2, l46Var, iW2, he2Var3);
            }
            dec.l(he2Var4, l46Var, j09VarJ2);
            tec.q(i3 & 14, dd2Var, l46Var, true);
            if (l26Var != null) {
                l46Var.f0(-1014168049);
                j09 j09VarE = vfh.E(g09Var, "action");
                xn8 xn8VarC2 = s21.c(lx0Var, false);
                int iW3 = an1.w(l46Var);
                u8a u8aVarM3 = l46Var.m();
                j09 j09VarJ3 = m93.J(l46Var, j09VarE);
                l46Var.j0();
                i2 = 8;
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var, l46Var, xn8VarC2);
                dec.l(he2Var2, l46Var, u8aVarM3);
                if (l46Var.S || !pa7.t(l46Var.R(), Integer.valueOf(iW3))) {
                    tec.r(iW3, l46Var, iW3, he2Var3);
                }
                dec.l(he2Var4, l46Var, j09VarJ3);
                mueVar2 = mueVar;
                l26Var3 = l26Var;
                mh3.b(new e1b[]{ib8.f(j, em2.a), nte.a.a(mueVar2)}, l26Var3, l46Var, 8 | (i3 & 112));
                l46Var.r(true);
                z = false;
                l46Var.r(false);
            } else {
                l26Var3 = l26Var;
                mueVar2 = mueVar;
                z = false;
                i2 = 8;
                l46Var.f0(-1013852841);
                l46Var.r(false);
            }
            if (l26Var2 != null) {
                l46Var.f0(-1013804481);
                j09 j09VarE2 = vfh.E(g09Var, "dismissAction");
                xn8 xn8VarC3 = s21.c(lx0Var, z);
                int iW4 = an1.w(l46Var);
                u8a u8aVarM4 = l46Var.m();
                j09 j09VarJ4 = m93.J(l46Var, j09VarE2);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var, l46Var, xn8VarC3);
                dec.l(he2Var2, l46Var, u8aVarM4);
                if (l46Var.S || !pa7.t(l46Var.R(), Integer.valueOf(iW4))) {
                    tec.r(iW4, l46Var, iW4, he2Var3);
                }
                dec.l(he2Var4, l46Var, j09VarJ4);
                j3 = j2;
                int i4 = i2 | ((i3 >> 3) & 112);
                l26Var4 = l26Var2;
                mh3.a(ib8.f(j3, em2.a), l26Var4, l46Var, i4);
                z2 = true;
                l46Var.r(true);
                l46Var.r(false);
            } else {
                l26Var4 = l26Var2;
                j3 = j2;
                z2 = true;
                l46Var.f0(-1013535401);
                l46Var.r(z);
            }
            l46Var.r(z2);
        } else {
            l26Var3 = l26Var;
            l26Var4 = l26Var2;
            mueVar2 = mueVar;
            j3 = j2;
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            final long j4 = j3;
            final mue mueVar3 = mueVar2;
            final l26 l26Var5 = l26Var4;
            final l26 l26Var6 = l26Var3;
            ojbVarV.d = new l26(l26Var6, l26Var5, mueVar3, j, j4, i) { // from class: pqd
                public final /* synthetic */ l26 b;
                public final /* synthetic */ l26 c;
                public final /* synthetic */ mue d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(1);
                    rrb.a(this.a, this.b, this.c, this.d, this.e, this.f, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void b(List list, j09 j09Var, ii6 ii6Var, l46 l46Var, int i, int i2) {
        ii6 ii6Var2;
        int i3;
        j09 j09Var2;
        ii6 ii6Var3;
        l46Var.h0(-746952778);
        int i4 = i | (l46Var.g(list) ? 4 : 2);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            ii6Var2 = ii6Var;
        } else {
            ii6Var2 = ii6Var;
            i3 = i4 | (l46Var.g(ii6Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        }
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            ii6 ii6Var4 = i5 != 0 ? null : ii6Var2;
            int iF = bm8.F(t72.u(list, 10));
            if (iF < 16) {
                iF = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF);
            for (Object obj : list) {
                linkedHashMap.put(((djc) obj).a, obj);
            }
            long j = ((e8b) l46Var.k(l8b.a)).B;
            j09Var2 = j09Var;
            j09 j09VarZ = ynb.Z(q6c.j(j09Var2, ii6Var4, l46Var), 20.0f);
            lx0 lx0Var = ndb.f;
            xn8 xn8VarC = s21.c(lx0Var, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarZ);
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
            dec.l(he2Var, l46Var, xn8VarC);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var, numValueOf);
            dec.k(l46Var);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var, j09VarJ);
            g09 g09Var = g09.a;
            j09 j09VarM = b.m(g09Var, 280.0f, 322.0f);
            boolean zF = l46Var.f(j);
            Object objR = l46Var.R();
            if (zF || objR == sf2.a) {
                objR = new ac(j, 15);
                l46Var.p0(objR);
            }
            j09 j09VarS = b21.s(j09VarM, (a26) objR);
            xn8 xn8VarC2 = s21.c(lx0Var, false);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarS);
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
            djc djcVar = (djc) linkedHashMap.get(kkc.a);
            d31 d31Var = d31.a;
            c(djcVar, d31Var.a(g09Var, lx0Var), l46Var, 8);
            c((djc) linkedHashMap.get(kkc.e), tm7.N(0.0f, -110.0f, d31Var.a(g09Var, lx0Var), 1), l46Var, 8);
            c((djc) linkedHashMap.get(kkc.c), tm7.N(0.0f, 110.0f, d31Var.a(g09Var, lx0Var), 1), l46Var, 8);
            c((djc) linkedHashMap.get(kkc.b), tm7.N(-104.0f, 0.0f, d31Var.a(g09Var, lx0Var), 2), l46Var, 8);
            c((djc) linkedHashMap.get(kkc.d), tm7.N(104.0f, 0.0f, d31Var.a(g09Var, lx0Var), 2), l46Var, 8);
            l46Var.r(true);
            l46Var.r(true);
            ii6Var3 = ii6Var4;
        } else {
            j09Var2 = j09Var;
            l46Var.Z();
            ii6Var3 = ii6Var2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ejc(list, j09Var2, ii6Var3, i, i2, 0);
        }
    }

    public static final void c(djc djcVar, j09 j09Var, l46 l46Var, int i) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(316605027);
        int i2 = (l46Var2.i(djcVar) ? 4 : 2) | i | (l46Var2.g(j09Var) ? 32 : 16);
        int i3 = 0;
        if (l46Var2.W(i2 & 1, (i2 & 19) != 18)) {
            j09 j09VarP = b.p(j09Var, 72.0f);
            c92 c92VarA = a92.a(new uc0(4.0f, true, new qc0(i3)), ndb.Z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarP);
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
            g09 g09Var = g09.a;
            if (djcVar != null) {
                l46Var2.f0(-1729131056);
                o7c.d(b.p(g09Var, 48.0f), djcVar.b, null, false, null, 4.0f, null, false, l46Var, 199686, 212);
                l46Var2 = l46Var;
                l46Var2.r(false);
            } else {
                l46Var2.f0(-1728790738);
                o5c.f(l46Var2, b.d(b.p(g09Var, 48.0f), 84.0f));
                l46Var2.r(false);
            }
            String str = djcVar != null ? djcVar.c : null;
            if (str == null) {
                str = "";
            }
            if (v4e.Q(str)) {
                l46Var2.f0(-1728414615);
                l46Var2.r(false);
            } else {
                l46Var2.f0(-1728628918);
                sie sieVar = djcVar != null ? new sie(djcVar.b.b) : null;
                boolean z = sieVar != null && sieVar.a == 0;
                mue mueVar = pue.a;
                jrb.b(str, z, mue.a(pue.j(l46Var2), ((e8b) l46Var2.k(l8b.a)).t, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), null, null, l46Var2, 0, 24);
                l46Var2.r(false);
            }
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fjc(djcVar, j09Var, i, i3);
        }
    }

    public static final void d(final j09 j09Var, final l26 l26Var, final l26 l26Var2, final x4d x4dVar, final long j, final long j2, long j3, long j4, final dd2 dd2Var, l46 l46Var, final int i, final int i2) {
        int i3;
        l26 l26Var3;
        l26 l26Var4;
        x4d x4dVar2;
        long jD;
        long jD2;
        final long j5;
        final long j6;
        l46Var.h0(-1218779924);
        if ((i & 6) == 0) {
            i3 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            l26Var3 = l26Var;
            i3 |= l46Var.i(l26Var3) ? 32 : 16;
        } else {
            l26Var3 = l26Var;
        }
        if ((i & 384) == 0) {
            l26Var4 = l26Var2;
            i3 |= l46Var.i(l26Var4) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        } else {
            l26Var4 = l26Var2;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= l46Var.h(false) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            x4dVar2 = x4dVar;
            i3 |= l46Var.g(x4dVar2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        } else {
            x4dVar2 = x4dVar;
        }
        if ((196608 & i) == 0) {
            i3 |= l46Var.f(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= l46Var.f(j2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                jD = j3;
                int i4 = l46Var.f(jD) ? 8388608 : 4194304;
                i3 |= i4;
            } else {
                jD = j3;
            }
            i3 |= i4;
        } else {
            jD = j3;
        }
        if ((100663296 & i) == 0) {
            jD2 = j4;
            i3 |= ((i2 & 256) == 0 && l46Var.f(jD2)) ? 67108864 : 33554432;
        } else {
            jD2 = j4;
        }
        if ((805306368 & i) == 0) {
            i3 |= l46Var.i(dd2Var) ? 536870912 : 268435456;
        }
        if (l46Var.W(i3 & 1, (i3 & 306783379) != 306783378)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                    jD = o82.d(bm8.H, l46Var);
                    i3 &= -29360129;
                }
                if ((i2 & 256) != 0) {
                    jD2 = o82.d(bm8.K, l46Var);
                    i3 &= -234881025;
                }
            } else {
                l46Var.Z();
                if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                    i3 &= -29360129;
                }
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                }
            }
            long j7 = jD2;
            long j8 = jD;
            l46Var.s();
            float f = bm8.J;
            dd2 dd2VarB0 = af1.b0(-1343524879, new sqd(l26Var3, dd2Var, l26Var4, j8, j7), l46Var);
            int i5 = (i3 & 14) | 12779520;
            int i6 = i3 >> 9;
            nae.a(j09Var, x4dVar2, j, j2, 0.0f, f, null, dd2VarB0, l46Var, i5 | (i6 & 112) | (i6 & 896) | (i6 & 7168), 80);
            j5 = j8;
            j6 = j7;
        } else {
            l46Var.Z();
            j5 = jD;
            j6 = jD2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: oqd
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(i | 1);
                    rrb.d(j09Var, l26Var, l26Var2, x4dVar, j, j2, j5, j6, dd2Var, (l46) obj, iP, i2);
                    return wef.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(int i, a26 a26Var, l46 l46Var, j09 j09Var) {
        j09 j09Var2;
        l46 l46Var2;
        Object obj;
        i8c i8cVar;
        a26 a26Var2 = a26Var;
        l46 l46Var3 = l46Var;
        a26Var2.getClass();
        l46Var3.h0(-1542397780);
        int i2 = i | (l46Var3.i(a26Var2) ? 4 : 2) | 48;
        int i3 = 0;
        if (l46Var3.W(i2 & 1, (i2 & 19) != 18)) {
            List listI = t72.I(afc.q(R.string.seasonal_suggested_q1, l46Var3), afc.q(R.string.seasonal_suggested_q2, l46Var3), afc.q(R.string.seasonal_suggested_q3, l46Var3), afc.q(R.string.seasonal_suggested_q4, l46Var3), afc.q(R.string.seasonal_suggested_q5, l46Var3), afc.q(R.string.seasonal_suggested_q6, l46Var3), afc.q(R.string.seasonal_suggested_q7, l46Var3), afc.q(R.string.seasonal_suggested_q8, l46Var3), afc.q(R.string.seasonal_suggested_q9, l46Var3), afc.q(R.string.seasonal_suggested_q10, l46Var3), afc.q(R.string.seasonal_suggested_q11, l46Var3), afc.q(R.string.seasonal_suggested_q12, l46Var3), afc.q(R.string.seasonal_suggested_q13, l46Var3), afc.q(R.string.seasonal_suggested_q14, l46Var3), afc.q(R.string.seasonal_suggested_q15, l46Var3));
            int size = (listI.size() + 2) / 3;
            Object[] objArr = new Object[0];
            Object objR = l46Var3.R();
            i8c i8cVar2 = sf2.a;
            if (objR == i8cVar2) {
                obj = objR;
                ond ondVar = new ond(15);
                l46Var3.p0(ondVar);
                obj = ondVar;
            }
            obj = objR;
            s69 s69Var = (s69) vfh.I(objArr, (x16) obj, l46Var3, 48);
            sz9 sz9Var = (sz9) s69Var;
            boolean zE = l46Var3.e(sz9Var.j()) | l46Var3.g(listI);
            Object objR2 = l46Var3.R();
            Object obj2 = objR2;
            if (zE || objR2 == i8cVar2) {
                int iJ = (sz9Var.j() % size) * 3;
                z67 z67VarC0 = mh3.c0(0, 3);
                ArrayList arrayList = new ArrayList();
                Iterator it = z67VarC0.iterator();
                while (((y67) it).c) {
                    String str = (String) s72.y0(((q67) it).nextInt() + iJ, listI);
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                l46Var3.p0(arrayList);
                obj2 = arrayList;
            }
            List list = (List) obj2;
            g09 g09Var = g09.a;
            j09 j09VarC = b.c(g09Var, 1.0f);
            uc0 uc0Var = new uc0(16.0f, true, new qc0(i3));
            jx0 jx0Var = ndb.Y;
            c92 c92VarA = a92.a(uc0Var, jx0Var, l46Var3, 6);
            int iHashCode = Long.hashCode(l46Var3.T);
            u8a u8aVarM = l46Var3.m();
            j09 j09VarJ = m93.J(l46Var3, j09VarC);
            lf2.q.getClass();
            l46Var3.j0();
            boolean z = l46Var3.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var3.l(ov7Var);
            } else {
                l46Var3.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var3, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var3, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var3, numValueOf);
            dec.k(l46Var3);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var3, j09VarJ);
            j09 j09VarC2 = b.c(g09Var, 1.0f);
            t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var3, 48);
            int iHashCode2 = Long.hashCode(l46Var3.T);
            u8a u8aVarM2 = l46Var3.m();
            j09 j09VarJ2 = m93.J(l46Var3, j09VarC2);
            l46Var3.j0();
            if (l46Var3.S) {
                l46Var3.l(ov7Var);
            } else {
                l46Var3.s0();
            }
            dec.l(he2Var, l46Var3, t7cVarA);
            dec.l(he2Var2, l46Var3, u8aVarM2);
            ib8.s(iHashCode2, l46Var3, he2Var3, l46Var3);
            dec.l(he2Var4, l46Var3, j09VarJ2);
            String strQ = afc.q(R.string.seasonal_suggested_title, l46Var3);
            mue mueVar = pue.a;
            i8c i8cVar3 = i8cVar2;
            int i4 = 6;
            nte.b(strQ, ynb.d0(20.0f, 0.0f, 0.0f, 0.0f, 14, new jw7(1.0f, true)), bx5.b(l46Var3).a, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.d(l46Var3), 0L, 0L, null, null, 0L, null, 0, 0L, null, new y58(v58.b, 16, 0), 15728639), l46Var, 0, 0, 131064);
            l46 l46Var4 = l46Var;
            g21.r(af1.b0(855954287, new z8d(7, s69Var), l46Var4), l46Var4, 6);
            l46Var4.r(true);
            g09 g09Var2 = g09Var;
            float f = 1.0f;
            j09 j09VarC3 = b.c(g09Var2, 1.0f);
            byte b = 0;
            c92 c92VarA2 = a92.a(new uc0(12.0f, true, new qc0(b)), jx0Var, l46Var4, 6);
            int iHashCode3 = Long.hashCode(l46Var4.T);
            u8a u8aVarM3 = l46Var4.m();
            j09 j09VarJ3 = m93.J(l46Var4, j09VarC3);
            l46Var4.j0();
            if (l46Var4.S) {
                l46Var4.l(ov7Var);
            } else {
                l46Var4.s0();
            }
            dec.l(he2Var, l46Var4, c92VarA2);
            dec.l(he2Var2, l46Var4, u8aVarM3);
            ib8.s(iHashCode3, l46Var4, he2Var3, l46Var4);
            Iterator itS = kv2.s(l46Var4, j09VarJ3, he2Var4, 1723986475, list);
            while (itS.hasNext()) {
                String str2 = (String) itS.next();
                int i5 = ((i2 & 14) == 4 ? (byte) 1 : b) | (l46Var4.g(str2) ? 1 : 0);
                Object objR3 = l46Var4.R();
                if (i5 == 0) {
                    i8cVar = i8cVar3;
                    if (objR3 == i8cVar) {
                    }
                    i8cVar3 = i8cVar;
                    nae.c((x16) objR3, b.c(g09Var2, f), false, a7c.b(20.0f), ((e8b) l46Var4.k(l8b.a)).f, 0L, 0.0f, 0.0f, x57.b(bx5.f(l46Var4), 0.5f), null, af1.b0(1757709499, new knc(str2, 2, b), l46Var4), l46Var4, 48, 740);
                    b = b;
                    g09Var2 = g09Var2;
                    f = f;
                    i4 = 6;
                } else {
                    i8cVar = i8cVar3;
                }
                objR3 = new n43(i4, a26Var, str2);
                l46Var4.p0(objR3);
                i8cVar3 = i8cVar;
                nae.c((x16) objR3, b.c(g09Var2, f), false, a7c.b(20.0f), ((e8b) l46Var4.k(l8b.a)).f, 0L, 0.0f, 0.0f, x57.b(bx5.f(l46Var4), 0.5f), null, af1.b0(1757709499, new knc(str2, 2, b), l46Var4), l46Var4, 48, 740);
                b = b;
                g09Var2 = g09Var2;
                f = f;
                i4 = 6;
            }
            a26Var2 = a26Var;
            tec.s(l46Var4, b, true, true);
            j09Var2 = g09Var2;
            l46Var2 = l46Var4;
        } else {
            l46Var3.Z();
            j09Var2 = j09Var;
            l46Var2 = l46Var3;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new sl0(i, a26Var2, j09Var2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0183  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a7 A[LOOP:0: B:102:0x01a1->B:104:0x01a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:109:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:112:0x022a  */
    /* JADX WARN: Code duplicated, block: B:115:0x023a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0163 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x012f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:68:0x010b  */
    /* JADX WARN: Code duplicated, block: B:71:0x011d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0132 A[LOOP:2: B:69:0x0117->B:74:0x0132, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x013a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0142  */
    /* JADX WARN: Code duplicated, block: B:82:0x014a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0154  */
    /* JADX WARN: Code duplicated, block: B:87:0x015a  */
    /* JADX WARN: Code duplicated, block: B:89:0x015e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0175  */
    /* JADX WARN: Code duplicated, block: B:95:0x0177  */
    /* JADX WARN: Code duplicated, block: B:98:0x017e A[ADDED_TO_REGION] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [l4c] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public static final void f(c4c c4cVar, m4c m4cVar, j09 j09Var, a26 a26Var, boolean z, int i, int i2, l46 l46Var, int i3, int i4) {
        j09 j09Var2;
        int i5;
        a26 a26Var2;
        int i6;
        int i7;
        boolean z2;
        ?? r5;
        int i8;
        int i9;
        a26 a26Var3;
        ojb ojbVarV;
        j09 j09Var3;
        i8c i8cVar;
        n4c n4cVar;
        int i10;
        boolean z3;
        boolean zG;
        Object objR;
        i00 i00Var;
        int i11;
        int i12;
        String str;
        String strY;
        Object obj;
        Object obj2;
        ?? r0;
        Object objA;
        Iterator it;
        Object next;
        Iterator it2;
        k00 k00Var;
        boolean z4;
        Object objR2;
        int i13;
        LinkedHashMap linkedHashMap;
        ue5 ue5Var;
        Map map;
        Object objR3;
        l46 l46Var2 = l46Var;
        m4cVar.getClass();
        Map map2 = m4cVar.b;
        l46Var2.h0(659990650);
        int i14 = (i3 & 6) == 0 ? (l46Var2.g(c4cVar) ? 4 : 2) | i3 : i3;
        int i15 = 16;
        if ((i3 & 48) == 0) {
            i14 |= l46Var2.g(m4cVar) ? 32 : 16;
        }
        int i16 = i4 & 2;
        if (i16 == 0) {
            if ((i3 & 384) == 0) {
                j09Var2 = j09Var;
                i14 |= l46Var2.g(j09Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i5 = i4 & 4;
            if (i5 != 0) {
                if ((i3 & 3072) == 0) {
                    a26Var2 = a26Var;
                    if (l46Var2.i(a26Var2)) {
                        i6 = 2048;
                    } else {
                        i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i14 |= i6;
                }
                i7 = 1794048 | i14;
                if ((599187 & i7) != 599186) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var2.W(i7 & 1, z2)) {
                    if (i16 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var2;
                    }
                    i8cVar = sf2.a;
                    if (i5 != 0) {
                        objR3 = l46Var2.R();
                        if (objR3 == i8cVar) {
                            objR3 = new ule(i15);
                            l46Var2.p0(objR3);
                        }
                        a26Var2 = (a26) objR3;
                    }
                    n4cVar = q4c.b(c4cVar, l46Var2).h;
                    long jC = b4c.c(c4cVar, l46Var2);
                    i10 = i7 & 112;
                    if (i10 == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zG = z3 | l46Var2.g(n4cVar) | l46Var2.f(jC);
                    objR = l46Var2.R();
                    if (zG || objR == i8cVar) {
                        if (n4cVar == null) {
                            n4cVar = n4c.i;
                        }
                        n4c n4cVarA = n4cVar.a();
                        i00Var = new i00();
                        k00 k00Var2 = m4cVar.a;
                        i00Var.d(k00Var2);
                        for (j00 j00Var : k00Var2.b(k00Var2.b.length(), l4c.b)) {
                            String str2 = l4c.b;
                            Object obj3 = j00Var.a;
                            i11 = j00Var.c;
                            i12 = j00Var.b;
                            str = (String) obj3;
                            str.getClass();
                            strY = v4e.Y("format:", str);
                            obj = null;
                            if (strY == str) {
                                it = ((List) l4c.c.getValue()).iterator();
                                while (it.hasNext()) {
                                    next = it.next();
                                    it2 = it;
                                    if (pa7.t(((l4c) next).a, str)) {
                                        obj = next;
                                        break;
                                    }
                                    it = it2;
                                }
                                obj = (l4c) obj;
                            } else {
                                obj2 = map2.get(strY);
                                if (obj2 instanceof l4c) {
                                    obj = (l4c) obj2;
                                }
                            }
                            r0 = obj;
                            if (r0 == 0 && (objA = r0.a(n4cVarA)) != null) {
                                if (objA instanceof xtd) {
                                    i00Var.b((xtd) objA, i12, i11);
                                } else if (objA instanceof k68) {
                                    i00Var.a((k68) objA, i12, i11);
                                }
                            }
                        }
                        objR = i00Var.l();
                        l46Var2.p0(objR);
                    }
                    k00Var = (k00) objR;
                    if (i10 == 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objR2 = l46Var2.R();
                    if (!z4 || objR2 == i8cVar) {
                        i13 = 1;
                        ve5 ve5VarY = fyc.y(s72.m0(map2.entrySet()), new a4c(i13));
                        linkedHashMap = new LinkedHashMap();
                        ue5Var = new ue5(ve5VarY);
                        while (ue5Var.hasNext()) {
                            iy9 iy9Var = (iy9) ue5Var.next();
                            linkedHashMap.put(iy9Var.a(), iy9Var.b());
                        }
                        objR2 = bm8.K(linkedHashMap);
                        l46Var2.p0(objR2);
                    } else {
                        i13 = 1;
                    }
                    map = (Map) objR2;
                    if (map.isEmpty()) {
                        l46Var2.f0(-578200116);
                        b4c.a(c4cVar, k00Var, j09Var3, a26Var2, null, l46Var2, (i7 & 8078) | ((i7 >> 3) & 57344) | (458752 & (i7 << 3)) | (3670016 & i7), 64);
                        j09Var2 = j09Var3;
                        l46Var2.r(false);
                        l46Var2 = l46Var2;
                    } else {
                        j09Var2 = j09Var3;
                        a26 a26Var4 = a26Var2;
                        l46Var2.f0(-577999298);
                        a26Var2 = a26Var4;
                        l46Var2 = l46Var2;
                        nk8.d(j09Var2, null, af1.b0(-457052428, new sz7(map, c4cVar, k00Var, a26Var4, 18), l46Var2), l46Var2, ((i7 >> 6) & 14) | 3072, 6);
                        l46Var2.r(false);
                    }
                    i9 = Integer.MAX_VALUE;
                    int i17 = i13;
                    i8 = i17 == true ? 1 : 0;
                    r5 = i17;
                } else {
                    l46Var2.Z();
                    r5 = z;
                    i8 = i;
                    i9 = i2;
                }
                a26Var3 = a26Var2;
                ojbVarV = l46Var2.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new rjd(c4cVar, m4cVar, j09Var2, a26Var3, (boolean) r5, i8, i9, i3, i4);
                }
            }
            i14 |= 3072;
            a26Var2 = a26Var;
            i7 = 1794048 | i14;
            if ((599187 & i7) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var2.W(i7 & 1, z2)) {
                if (i16 != 0) {
                    j09Var3 = g09.a;
                } else {
                    j09Var3 = j09Var2;
                }
                i8cVar = sf2.a;
                if (i5 != 0) {
                    objR3 = l46Var2.R();
                    if (objR3 == i8cVar) {
                        objR3 = new ule(i15);
                        l46Var2.p0(objR3);
                    }
                    a26Var2 = (a26) objR3;
                }
                n4cVar = q4c.b(c4cVar, l46Var2).h;
                long jC2 = b4c.c(c4cVar, l46Var2);
                i10 = i7 & 112;
                if (i10 == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zG = z3 | l46Var2.g(n4cVar) | l46Var2.f(jC2);
                objR = l46Var2.R();
                if (zG) {
                    if (n4cVar == null) {
                        n4cVar = n4c.i;
                    }
                    n4c n4cVarA2 = n4cVar.a();
                    i00Var = new i00();
                    k00 k00Var3 = m4cVar.a;
                    i00Var.d(k00Var3);
                    while (r10.hasNext()) {
                        String str3 = l4c.b;
                        Object obj4 = j00Var.a;
                        i11 = j00Var.c;
                        i12 = j00Var.b;
                        str = (String) obj4;
                        str.getClass();
                        strY = v4e.Y("format:", str);
                        obj = null;
                        if (strY == str) {
                            it = ((List) l4c.c.getValue()).iterator();
                            while (it.hasNext()) {
                                next = it.next();
                                it2 = it;
                                if (pa7.t(((l4c) next).a, str)) {
                                    obj = next;
                                    break;
                                }
                                it = it2;
                            }
                            obj = (l4c) obj;
                        } else {
                            obj2 = map2.get(strY);
                            if (obj2 instanceof l4c) {
                                obj = (l4c) obj2;
                            }
                        }
                        r0 = obj;
                        if (r0 == 0) {
                            if (objA instanceof xtd) {
                                i00Var.b((xtd) objA, i12, i11);
                            } else if (objA instanceof k68) {
                                i00Var.a((k68) objA, i12, i11);
                            }
                        }
                    }
                    objR = i00Var.l();
                    l46Var2.p0(objR);
                } else {
                    if (n4cVar == null) {
                        n4cVar = n4c.i;
                    }
                    n4c n4cVarA3 = n4cVar.a();
                    i00Var = new i00();
                    k00 k00Var4 = m4cVar.a;
                    i00Var.d(k00Var4);
                    while (r10.hasNext()) {
                        String str4 = l4c.b;
                        Object obj5 = j00Var.a;
                        i11 = j00Var.c;
                        i12 = j00Var.b;
                        str = (String) obj5;
                        str.getClass();
                        strY = v4e.Y("format:", str);
                        obj = null;
                        if (strY == str) {
                            it = ((List) l4c.c.getValue()).iterator();
                            while (it.hasNext()) {
                                next = it.next();
                                it2 = it;
                                if (pa7.t(((l4c) next).a, str)) {
                                    obj = next;
                                    break;
                                }
                                it = it2;
                            }
                            obj = (l4c) obj;
                        } else {
                            obj2 = map2.get(strY);
                            if (obj2 instanceof l4c) {
                                obj = (l4c) obj2;
                            }
                        }
                        r0 = obj;
                        if (r0 == 0) {
                            if (objA instanceof xtd) {
                                i00Var.b((xtd) objA, i12, i11);
                            } else if (objA instanceof k68) {
                                i00Var.a((k68) objA, i12, i11);
                            }
                        }
                    }
                    objR = i00Var.l();
                    l46Var2.p0(objR);
                }
                k00Var = (k00) objR;
                if (i10 == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objR2 = l46Var2.R();
                if (z4) {
                    i13 = 1;
                    ve5 ve5VarY2 = fyc.y(s72.m0(map2.entrySet()), new a4c(i13));
                    linkedHashMap = new LinkedHashMap();
                    ue5Var = new ue5(ve5VarY2);
                    while (ue5Var.hasNext()) {
                        iy9 iy9Var2 = (iy9) ue5Var.next();
                        linkedHashMap.put(iy9Var2.a(), iy9Var2.b());
                    }
                    objR2 = bm8.K(linkedHashMap);
                    l46Var2.p0(objR2);
                } else {
                    i13 = 1;
                    ve5 ve5VarY3 = fyc.y(s72.m0(map2.entrySet()), new a4c(i13));
                    linkedHashMap = new LinkedHashMap();
                    ue5Var = new ue5(ve5VarY3);
                    while (ue5Var.hasNext()) {
                        iy9 iy9Var3 = (iy9) ue5Var.next();
                        linkedHashMap.put(iy9Var3.a(), iy9Var3.b());
                    }
                    objR2 = bm8.K(linkedHashMap);
                    l46Var2.p0(objR2);
                }
                map = (Map) objR2;
                if (map.isEmpty()) {
                    l46Var2.f0(-578200116);
                    b4c.a(c4cVar, k00Var, j09Var3, a26Var2, null, l46Var2, (i7 & 8078) | ((i7 >> 3) & 57344) | (458752 & (i7 << 3)) | (3670016 & i7), 64);
                    j09Var2 = j09Var3;
                    l46Var2.r(false);
                    l46Var2 = l46Var2;
                } else {
                    j09Var2 = j09Var3;
                    a26 a26Var5 = a26Var2;
                    l46Var2.f0(-577999298);
                    a26Var2 = a26Var5;
                    l46Var2 = l46Var2;
                    nk8.d(j09Var2, null, af1.b0(-457052428, new sz7(map, c4cVar, k00Var, a26Var5, 18), l46Var2), l46Var2, ((i7 >> 6) & 14) | 3072, 6);
                    l46Var2.r(false);
                }
                i9 = Integer.MAX_VALUE;
                int i18 = i13;
                i8 = i18 == true ? 1 : 0;
                r5 = i18;
            } else {
                l46Var2.Z();
                r5 = z;
                i8 = i;
                i9 = i2;
            }
            a26Var3 = a26Var2;
            ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new rjd(c4cVar, m4cVar, j09Var2, a26Var3, (boolean) r5, i8, i9, i3, i4);
            }
        }
        i14 |= 384;
        j09Var2 = j09Var;
        i5 = i4 & 4;
        if (i5 != 0) {
            if ((i3 & 3072) == 0) {
                a26Var2 = a26Var;
                if (l46Var2.i(a26Var2)) {
                    i6 = 2048;
                } else {
                    i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i14 |= i6;
            }
            i7 = 1794048 | i14;
            if ((599187 & i7) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var2.W(i7 & 1, z2)) {
                if (i16 != 0) {
                    j09Var3 = g09.a;
                } else {
                    j09Var3 = j09Var2;
                }
                i8cVar = sf2.a;
                if (i5 != 0) {
                    objR3 = l46Var2.R();
                    if (objR3 == i8cVar) {
                        objR3 = new ule(i15);
                        l46Var2.p0(objR3);
                    }
                    a26Var2 = (a26) objR3;
                }
                n4cVar = q4c.b(c4cVar, l46Var2).h;
                long jC3 = b4c.c(c4cVar, l46Var2);
                i10 = i7 & 112;
                if (i10 == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zG = z3 | l46Var2.g(n4cVar) | l46Var2.f(jC3);
                objR = l46Var2.R();
                if (zG) {
                    if (n4cVar == null) {
                        n4cVar = n4c.i;
                    }
                    n4c n4cVarA4 = n4cVar.a();
                    i00Var = new i00();
                    k00 k00Var5 = m4cVar.a;
                    i00Var.d(k00Var5);
                    while (r10.hasNext()) {
                        String str5 = l4c.b;
                        Object obj6 = j00Var.a;
                        i11 = j00Var.c;
                        i12 = j00Var.b;
                        str = (String) obj6;
                        str.getClass();
                        strY = v4e.Y("format:", str);
                        obj = null;
                        if (strY == str) {
                            it = ((List) l4c.c.getValue()).iterator();
                            while (it.hasNext()) {
                                next = it.next();
                                it2 = it;
                                if (pa7.t(((l4c) next).a, str)) {
                                    obj = next;
                                    break;
                                }
                                it = it2;
                            }
                            obj = (l4c) obj;
                        } else {
                            obj2 = map2.get(strY);
                            if (obj2 instanceof l4c) {
                                obj = (l4c) obj2;
                            }
                        }
                        r0 = obj;
                        if (r0 == 0) {
                            if (objA instanceof xtd) {
                                i00Var.b((xtd) objA, i12, i11);
                            } else if (objA instanceof k68) {
                                i00Var.a((k68) objA, i12, i11);
                            }
                        }
                    }
                    objR = i00Var.l();
                    l46Var2.p0(objR);
                } else {
                    if (n4cVar == null) {
                        n4cVar = n4c.i;
                    }
                    n4c n4cVarA5 = n4cVar.a();
                    i00Var = new i00();
                    k00 k00Var6 = m4cVar.a;
                    i00Var.d(k00Var6);
                    while (r10.hasNext()) {
                        String str6 = l4c.b;
                        Object obj7 = j00Var.a;
                        i11 = j00Var.c;
                        i12 = j00Var.b;
                        str = (String) obj7;
                        str.getClass();
                        strY = v4e.Y("format:", str);
                        obj = null;
                        if (strY == str) {
                            it = ((List) l4c.c.getValue()).iterator();
                            while (it.hasNext()) {
                                next = it.next();
                                it2 = it;
                                if (pa7.t(((l4c) next).a, str)) {
                                    obj = next;
                                    break;
                                }
                                it = it2;
                            }
                            obj = (l4c) obj;
                        } else {
                            obj2 = map2.get(strY);
                            if (obj2 instanceof l4c) {
                                obj = (l4c) obj2;
                            }
                        }
                        r0 = obj;
                        if (r0 == 0) {
                            if (objA instanceof xtd) {
                                i00Var.b((xtd) objA, i12, i11);
                            } else if (objA instanceof k68) {
                                i00Var.a((k68) objA, i12, i11);
                            }
                        }
                    }
                    objR = i00Var.l();
                    l46Var2.p0(objR);
                }
                k00Var = (k00) objR;
                if (i10 == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objR2 = l46Var2.R();
                if (z4) {
                    i13 = 1;
                    ve5 ve5VarY4 = fyc.y(s72.m0(map2.entrySet()), new a4c(i13));
                    linkedHashMap = new LinkedHashMap();
                    ue5Var = new ue5(ve5VarY4);
                    while (ue5Var.hasNext()) {
                        iy9 iy9Var4 = (iy9) ue5Var.next();
                        linkedHashMap.put(iy9Var4.a(), iy9Var4.b());
                    }
                    objR2 = bm8.K(linkedHashMap);
                    l46Var2.p0(objR2);
                } else {
                    i13 = 1;
                    ve5 ve5VarY5 = fyc.y(s72.m0(map2.entrySet()), new a4c(i13));
                    linkedHashMap = new LinkedHashMap();
                    ue5Var = new ue5(ve5VarY5);
                    while (ue5Var.hasNext()) {
                        iy9 iy9Var5 = (iy9) ue5Var.next();
                        linkedHashMap.put(iy9Var5.a(), iy9Var5.b());
                    }
                    objR2 = bm8.K(linkedHashMap);
                    l46Var2.p0(objR2);
                }
                map = (Map) objR2;
                if (map.isEmpty()) {
                    l46Var2.f0(-578200116);
                    b4c.a(c4cVar, k00Var, j09Var3, a26Var2, null, l46Var2, (i7 & 8078) | ((i7 >> 3) & 57344) | (458752 & (i7 << 3)) | (3670016 & i7), 64);
                    j09Var2 = j09Var3;
                    l46Var2.r(false);
                    l46Var2 = l46Var2;
                } else {
                    j09Var2 = j09Var3;
                    a26 a26Var6 = a26Var2;
                    l46Var2.f0(-577999298);
                    a26Var2 = a26Var6;
                    l46Var2 = l46Var2;
                    nk8.d(j09Var2, null, af1.b0(-457052428, new sz7(map, c4cVar, k00Var, a26Var6, 18), l46Var2), l46Var2, ((i7 >> 6) & 14) | 3072, 6);
                    l46Var2.r(false);
                }
                i9 = Integer.MAX_VALUE;
                int i19 = i13;
                i8 = i19 == true ? 1 : 0;
                r5 = i19;
            } else {
                l46Var2.Z();
                r5 = z;
                i8 = i;
                i9 = i2;
            }
            a26Var3 = a26Var2;
            ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new rjd(c4cVar, m4cVar, j09Var2, a26Var3, (boolean) r5, i8, i9, i3, i4);
            }
        }
        i14 |= 3072;
        a26Var2 = a26Var;
        i7 = 1794048 | i14;
        if ((599187 & i7) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (l46Var2.W(i7 & 1, z2)) {
            if (i16 != 0) {
                j09Var3 = g09.a;
            } else {
                j09Var3 = j09Var2;
            }
            i8cVar = sf2.a;
            if (i5 != 0) {
                objR3 = l46Var2.R();
                if (objR3 == i8cVar) {
                    objR3 = new ule(i15);
                    l46Var2.p0(objR3);
                }
                a26Var2 = (a26) objR3;
            }
            n4cVar = q4c.b(c4cVar, l46Var2).h;
            long jC4 = b4c.c(c4cVar, l46Var2);
            i10 = i7 & 112;
            if (i10 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            zG = z3 | l46Var2.g(n4cVar) | l46Var2.f(jC4);
            objR = l46Var2.R();
            if (zG) {
                if (n4cVar == null) {
                    n4cVar = n4c.i;
                }
                n4c n4cVarA6 = n4cVar.a();
                i00Var = new i00();
                k00 k00Var7 = m4cVar.a;
                i00Var.d(k00Var7);
                while (r10.hasNext()) {
                    String str7 = l4c.b;
                    Object obj8 = j00Var.a;
                    i11 = j00Var.c;
                    i12 = j00Var.b;
                    str = (String) obj8;
                    str.getClass();
                    strY = v4e.Y("format:", str);
                    obj = null;
                    if (strY == str) {
                        it = ((List) l4c.c.getValue()).iterator();
                        while (it.hasNext()) {
                            next = it.next();
                            it2 = it;
                            if (pa7.t(((l4c) next).a, str)) {
                                obj = next;
                                break;
                            }
                            it = it2;
                        }
                        obj = (l4c) obj;
                    } else {
                        obj2 = map2.get(strY);
                        if (obj2 instanceof l4c) {
                            obj = (l4c) obj2;
                        }
                    }
                    r0 = obj;
                    if (r0 == 0) {
                        if (objA instanceof xtd) {
                            i00Var.b((xtd) objA, i12, i11);
                        } else if (objA instanceof k68) {
                            i00Var.a((k68) objA, i12, i11);
                        }
                    }
                }
                objR = i00Var.l();
                l46Var2.p0(objR);
            } else {
                if (n4cVar == null) {
                    n4cVar = n4c.i;
                }
                n4c n4cVarA7 = n4cVar.a();
                i00Var = new i00();
                k00 k00Var8 = m4cVar.a;
                i00Var.d(k00Var8);
                while (r10.hasNext()) {
                    String str8 = l4c.b;
                    Object obj9 = j00Var.a;
                    i11 = j00Var.c;
                    i12 = j00Var.b;
                    str = (String) obj9;
                    str.getClass();
                    strY = v4e.Y("format:", str);
                    obj = null;
                    if (strY == str) {
                        it = ((List) l4c.c.getValue()).iterator();
                        while (it.hasNext()) {
                            next = it.next();
                            it2 = it;
                            if (pa7.t(((l4c) next).a, str)) {
                                obj = next;
                                break;
                            }
                            it = it2;
                        }
                        obj = (l4c) obj;
                    } else {
                        obj2 = map2.get(strY);
                        if (obj2 instanceof l4c) {
                            obj = (l4c) obj2;
                        }
                    }
                    r0 = obj;
                    if (r0 == 0) {
                        if (objA instanceof xtd) {
                            i00Var.b((xtd) objA, i12, i11);
                        } else if (objA instanceof k68) {
                            i00Var.a((k68) objA, i12, i11);
                        }
                    }
                }
                objR = i00Var.l();
                l46Var2.p0(objR);
            }
            k00Var = (k00) objR;
            if (i10 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            objR2 = l46Var2.R();
            if (z4) {
                i13 = 1;
                ve5 ve5VarY6 = fyc.y(s72.m0(map2.entrySet()), new a4c(i13));
                linkedHashMap = new LinkedHashMap();
                ue5Var = new ue5(ve5VarY6);
                while (ue5Var.hasNext()) {
                    iy9 iy9Var6 = (iy9) ue5Var.next();
                    linkedHashMap.put(iy9Var6.a(), iy9Var6.b());
                }
                objR2 = bm8.K(linkedHashMap);
                l46Var2.p0(objR2);
            } else {
                i13 = 1;
                ve5 ve5VarY7 = fyc.y(s72.m0(map2.entrySet()), new a4c(i13));
                linkedHashMap = new LinkedHashMap();
                ue5Var = new ue5(ve5VarY7);
                while (ue5Var.hasNext()) {
                    iy9 iy9Var7 = (iy9) ue5Var.next();
                    linkedHashMap.put(iy9Var7.a(), iy9Var7.b());
                }
                objR2 = bm8.K(linkedHashMap);
                l46Var2.p0(objR2);
            }
            map = (Map) objR2;
            if (map.isEmpty()) {
                l46Var2.f0(-578200116);
                b4c.a(c4cVar, k00Var, j09Var3, a26Var2, null, l46Var2, (i7 & 8078) | ((i7 >> 3) & 57344) | (458752 & (i7 << 3)) | (3670016 & i7), 64);
                j09Var2 = j09Var3;
                l46Var2.r(false);
                l46Var2 = l46Var2;
            } else {
                j09Var2 = j09Var3;
                a26 a26Var7 = a26Var2;
                l46Var2.f0(-577999298);
                a26Var2 = a26Var7;
                l46Var2 = l46Var2;
                nk8.d(j09Var2, null, af1.b0(-457052428, new sz7(map, c4cVar, k00Var, a26Var7, 18), l46Var2), l46Var2, ((i7 >> 6) & 14) | 3072, 6);
                l46Var2.r(false);
            }
            i9 = Integer.MAX_VALUE;
            int i110 = i13;
            i8 = i110 == true ? 1 : 0;
            r5 = i110;
        } else {
            l46Var2.Z();
            r5 = z;
            i8 = i;
            i9 = i2;
        }
        a26Var3 = a26Var2;
        ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rjd(c4cVar, m4cVar, j09Var2, a26Var3, (boolean) r5, i8, i9, i3, i4);
        }
    }

    public static final void g(x16 x16Var, x2g x2gVar, l46 l46Var, int i) {
        x16Var.getClass();
        l46Var.h0(-476732770);
        int i2 = (l46Var.i(x16Var) ? 4 : 2) | i | 48;
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            o8b o8bVarS = vtb.s(l46Var);
            x2g x2gVar2 = x2g.a;
            d3g d3gVarT = vtb.t(x2gVar2, l46Var);
            e89 e89VarI = q1c.i(x16Var, l46Var);
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                xfc xfcVar = new xfc(e89VarI, 16);
                x6f x6fVar = ap9.a;
                bq9 bq9Var = new bq9(new fn6(22, xfcVar));
                l46Var.p0(bq9Var);
                objR = bq9Var;
            }
            o7c.b(af1.b0(-1808335693, new o7b(d3gVarT, o8bVarS, (bq9) objR, 21), l46Var), l46Var, 6);
            x2gVar = x2gVar2;
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p4c(x16Var, x2gVar, i, 25);
        }
    }

    public static final j09 h(j09 j09Var, y6c y6cVar, n4d n4dVar) {
        return j09Var.D(new fjd(y6cVar, n4dVar));
    }

    public static final int i(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final j09 j(j09 j09Var, x4d x4dVar, n4d n4dVar) {
        return j09Var.D(new jjd(x4dVar, n4dVar));
    }

    public static final Object[] k(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        qd0.d0(0, i, 6, objArr, objArr2);
        qd0.Z(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static boolean l(byte b) {
        return b > -65;
    }

    public static final Object[] m(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        qd0.d0(0, i, 6, objArr, objArr2);
        qd0.Z(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] n(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        qd0.d0(0, i, 6, objArr, objArr2);
        qd0.Z(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object o(h48 h48Var, g48 g48Var, l26 l26Var, gbe gbeVar) {
        Object objO;
        if (g48Var != g48.b) {
            return (((a58) h48Var).i != g48.a && (objO = jgb.O(new qrb(h48Var, g48Var, l26Var, null), gbeVar)) == bw2.a) ? objO : wef.a;
        }
        qc0.j("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        return null;
    }

    public static final Object p(x48 x48Var, g48 g48Var, l26 l26Var, gbe gbeVar) {
        Object objO = o(x48Var.k(), g48Var, l26Var, gbeVar);
        return objO == bw2.a ? objO : wef.a;
    }

    public static j09 q(j09 j09Var, float f, x4d x4dVar, long j, long j2, int i) {
        boolean z = true;
        if ((i & 4) != 0 && yi4.a(f, 0.0f) <= 0) {
            z = false;
        }
        return (yi4.a(f, 0.0f) > 0 || z) ? j09Var.D(new p4d(f, x4dVar, z, (i & 8) != 0 ? oe6.a : j, (i & 16) != 0 ? oe6.a : j2)) : j09Var;
    }

    public static String r(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(t(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(t(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String s(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        sb.append("\\n");
                        break;
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        sb.append("\\v");
                        break;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        sb.append("\\f");
                        break;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        sb.append("\\r");
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                        } else {
                            sb.append((char) b);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String t(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strM = ib8.m(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb = new StringBuilder(strM.length() + 8 + name2.length() + 1);
            ub3.v(sb, "<", strM, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }
}
