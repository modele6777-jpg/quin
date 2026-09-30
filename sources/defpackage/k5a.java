package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k5a {
    static {
        t72.I(new i5a("月卡订阅", "¥18.8/月", "低至 ¥0.31/次", null, null, true, false, null, 440), new i5a("年卡订阅", "¥8.17/月", "低至 ¥0.14/次", "¥98/年", "限时折扣", false, false, null, 456), new i5a("五次占卜", "¥10", "¥2/次", null, null, false, false, null, 504));
        t72.I(new i5a("月卡订阅", "¥18.8/月", "低至 ¥0.31/次", null, null, true, false, null, 440), new i5a("年卡订阅", "¥8.17/月", "低至 ¥0.14/次", "¥98/年", "限时折扣", false, false, null, 456));
    }

    public static final void a(i5a i5aVar, float f, x16 x16Var, l46 l46Var, int i) {
        long j;
        long jD;
        g09 g09Var;
        long j2;
        long j3;
        y6c y6cVar;
        l46 l46Var2;
        float f2;
        j09 j09VarN;
        boolean z;
        Object obj;
        final y6c y6cVar2;
        l46 l46Var3 = l46Var;
        l46Var3.h0(648203615);
        int i2 = i | (l46Var3.g(i5aVar) ? 4 : 2) | (l46Var3.d(f) ? 32 : 16) | (l46Var3.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var3.W(i2 & 1, (i2 & 147) != 146)) {
            pr4 pr4Var = l8b.a;
            boolean zF = k8b.f((e8b) l46Var3.k(pr4Var));
            if (zF) {
                l46Var3.f0(153422436);
                l46Var3.r(false);
                j = y72.e;
            } else {
                l46Var3.f0(153423020);
                j = ((e8b) l46Var3.k(pr4Var)).u;
                l46Var3.r(false);
            }
            final long j4 = j;
            if (zF) {
                l46Var3.f0(153424496);
                l46Var3.r(false);
                jD = abg.d(4280953388L);
            } else {
                l46Var3.f0(153425448);
                jD = ((e8b) l46Var3.k(pr4Var)).c;
                l46Var3.r(false);
            }
            y6c y6cVarB = a7c.b(zF ? 8.0f : 20.0f);
            g09 g09Var2 = g09.a;
            if (zF) {
                l46Var3.f0(461349562);
                boolean z2 = i5aVar.f;
                Object objR = l46Var3.R();
                i8c i8cVar = sf2.a;
                if (objR == i8cVar) {
                    objR = new l89(null);
                    l46Var3.p0(objR);
                }
                l89 l89Var = (l89) objR;
                l89Var.c.b(8, z2);
                boolean zF2 = l46Var3.f(jD) | l46Var3.g(y6cVarB) | l46Var3.f(j4);
                Object objR2 = l46Var3.R();
                if (zF2 || objR2 == i8cVar) {
                    g09Var = g09Var2;
                    y6cVar2 = y6cVarB;
                    final long j5 = jD;
                    obj = new p5e() { // from class: j5a
                        @Override // defpackage.p5e
                        public final void a(rxb rxbVar) {
                            long j6 = j4;
                            rxbVar.getClass();
                            e8b e8bVar = (e8b) rxbVar.s0(l8b.a);
                            rxbVar.b(j5);
                            rxbVar.j(y6cVar2);
                            n3d.f(rxbVar, 0.5f, e8bVar.A);
                            z5e z5eVar = rxbVar.b;
                            z5eVar.getClass();
                            if (z5eVar.N0.c.a(8)) {
                                fxd fxdVar = sxb.a;
                                vz vzVar = rxbVar.z;
                                vz vzVar2 = rxbVar.X;
                                try {
                                    rxbVar.z = fxdVar;
                                    rxbVar.X = fxdVar;
                                    n3d.f(rxbVar, 1.0f, j6);
                                } finally {
                                    rxbVar.z = vzVar;
                                    rxbVar.X = vzVar2;
                                }
                            }
                        }
                    };
                    j2 = j4;
                    l46Var3.p0(obj);
                } else {
                    obj = objR2;
                    g09Var = g09Var2;
                    y6cVar2 = y6cVarB;
                    j2 = j4;
                }
                j09VarN = aic.q(g09Var, l89Var, (p5e) obj);
                l46Var3.r(false);
                l46Var2 = l46Var3;
                y6cVar = y6cVar2;
                f2 = 0.0f;
            } else {
                long j6 = jD;
                g09Var = g09Var2;
                j2 = j4;
                l46Var3.f0(461546846);
                boolean z3 = i5aVar.f;
                if (z3) {
                    l46Var3.f0(153437802);
                    l46Var3.r(false);
                    j3 = j2;
                } else {
                    l46Var3.f0(153438581);
                    long j7 = ((e8b) l46Var3.k(pr4Var)).A;
                    l46Var3.r(false);
                    j3 = j7;
                }
                y6cVar = y6cVarB;
                h0e h0eVarA = qkd.a(j3, null, null, l46Var3, 0, 14);
                h0e h0eVarA2 = vx.a(z3 ? 1.0f : 0.5f, null, null, l46Var, 0, 14);
                l46Var2 = l46Var;
                f2 = 0.0f;
                j09VarN = tm7.n(db6.w(rrb.h(g09Var, y6cVar, new n4d(4.0f, y72.b(j2, ((Number) vx.b(z3 ? 0.25f : 0.0f, null, null, null, l46Var, 0, 30).getValue()).floatValue()), 2.0f, 0L, 56)), ((yi4) h0eVarA2.getValue()).a, ((y72) h0eVarA.getValue()).a, y6cVar), gec.O(new iy9[]{new iy9(Float.valueOf(0.0f), new y72(j6)), new iy9(Float.valueOf(0.4f), new y72(j6)), new iy9(Float.valueOf(1.0f), new y72(abg.r(y72.b(j2, ((Number) vx.b(z3 ? 0.1f : 0.0f, null, null, null, l46Var, 0, 30).getValue()).floatValue()), j6)))}, 0.0f, 0.0f, 14), y6cVar, 4);
                l46Var2.r(false);
            }
            float f3 = i5aVar.g ? 0.5f : 1.0f;
            j09 j09VarC = b.c(oa7.E(androidx.compose.foundation.layout.b.f(156.0f, f2, androidx.compose.foundation.layout.b.p(g09Var, f), 2).D(androidx.compose.foundation.layout.b.b).D(j09VarN), y6cVar), !i5aVar.g, null, null, x16Var, 14);
            lx0 lx0Var = ndb.b;
            xn8 xn8VarC = s21.c(lx0Var, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarC);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z4 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z4) {
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
            j09 j09VarP = pa7.p(ynb.d0(0.0f, 20.0f, 0.0f, 16.0f, 5, ynb.b0(20.0f, 0.0f, g09Var, 2)), f3);
            g09 g09Var3 = g09Var;
            long j8 = j2;
            c92 c92VarA = a92.a(new uc0(16.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarP);
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
            String str = i5aVar.a;
            mue mueVar = pue.a;
            nte.b(str, null, ((e8b) l46Var2.k(pr4Var)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.o(l46Var2), 0L, 0L, null, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, 0, 0L, null, null, 16777183), l46Var, 0, 0, 131066);
            cn1.f(Boolean.valueOf(i5aVar.b.length() == 0), null, null, null, af1.b0(-1022803260, new mq1(i5aVar, j8, 2), l46Var), l46Var, 24576, 14);
            l46Var3 = l46Var;
            l46Var3.r(true);
            String str2 = i5aVar.e;
            if (str2 == null) {
                l46Var3.f0(-491577489);
                l46Var3.r(false);
                z = true;
            } else {
                l46Var3.f0(-491577488);
                j09 j09VarA0 = ynb.a0(tm7.o(pa7.p(d31.a.a(g09Var3, ndb.d), f3), y72.b(j8, 0.2f), a7c.d(0.0f, 0.0f, 20.0f, 7)), 16.0f, 3.5f);
                xn8 xn8VarC2 = s21.c(lx0Var, false);
                int iHashCode3 = Long.hashCode(l46Var3.T);
                u8a u8aVarM3 = l46Var3.m();
                j09 j09VarJ3 = m93.J(l46Var3, j09VarA0);
                l46Var3.j0();
                if (l46Var3.S) {
                    l46Var3.l(ov7Var);
                } else {
                    l46Var3.s0();
                }
                dec.l(he2Var, l46Var3, xn8VarC2);
                dec.l(he2Var2, l46Var3, u8aVarM3);
                ib8.s(iHashCode3, l46Var3, he2Var3, l46Var3);
                dec.l(he2Var4, l46Var3, j09VarJ3);
                nte.b(str2, null, j8, w6c.l(10), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.h(l46Var3), l46Var, 24576, 0, 131050);
                l46Var3 = l46Var;
                z = true;
                l46Var3.r(true);
                l46Var3.r(false);
            }
            l46Var3.r(z);
        } else {
            l46Var3.Z();
        }
        ojb ojbVarV = l46Var3.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fz4(i5aVar, f, x16Var, i, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:35:0x0100  */
    /* JADX WARN: Code duplicated, block: B:36:0x0102  */
    /* JADX WARN: Code duplicated, block: B:41:0x0112  */
    /* JADX WARN: Code duplicated, block: B:51:0x0122 A[SYNTHETIC] */
    public static final void b(int i, a26 a26Var, l46 l46Var, j09 j09Var, List list) {
        float f;
        float f2;
        float f3;
        Iterator itS;
        int i2;
        Object next;
        int i3;
        boolean z;
        boolean zE;
        Object objR;
        a26Var.getClass();
        l46Var.h0(2139999166);
        int i4 = (l46Var.g(list) ? 4 : 2) | i | (l46Var.i(a26Var) ? 32 : 16) | 384;
        if (l46Var.W(i4 & 1, (i4 & 147) != 146)) {
            float f4 = ((Configuration) l46Var.k(uq.a)).screenWidthDp;
            int size = list.size();
            float f5 = f4 - 32.0f;
            if (size <= 2) {
                f2 = f5 - ((size - 1) * 8.0f);
                f3 = size;
            } else {
                if (yi4.a(520.0f, f5) <= 0) {
                    f2 = f5 - 16.0f;
                    f3 = 3.0f;
                } else {
                    f = ((yi4) i7h.D(new yi4(((f5 - 16.0f) - 40.0f) / 2.0f), new yi4(168.0f))).a;
                }
                ghc ghcVarT = mh3.T(l46Var);
                g09 g09Var = g09.a;
                j09 j09VarB0 = ynb.b0(16.0f, 0.0f, urg.F(mh3.K(androidx.compose.foundation.layout.b.c(g09Var, 1.0f), ghcVarT), ia7.b), 2);
                t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(0)), ndb.y, l46Var, 6);
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
                dec.l(hj6.z, l46Var, t7cVarA);
                dec.l(hj6.y, l46Var, u8aVarM);
                dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                dec.k(l46Var);
                itS = kv2.s(l46Var, j09VarJ, hj6.x, -1715466812, list);
                i2 = 0;
                while (itS.hasNext()) {
                    next = itS.next();
                    i3 = i2 + 1;
                    if (i2 >= 0) {
                        t72.Z();
                        throw null;
                    }
                    i5a i5aVar = (i5a) next;
                    if ((i4 & 112) == 32) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zE = z | l46Var.e(i2);
                    objR = l46Var.R();
                    if (zE || objR == sf2.a) {
                        objR = new rr1(i2, 5, a26Var);
                        l46Var.p0(objR);
                    }
                    a(i5aVar, f, (x16) objR, l46Var, 0);
                    i2 = i3;
                }
                l46Var.r(false);
                l46Var.r(true);
                j09Var = g09Var;
            }
            f = f2 / f3;
            ghc ghcVarT2 = mh3.T(l46Var);
            g09 g09Var2 = g09.a;
            j09 j09VarB1 = ynb.b0(16.0f, 0.0f, urg.F(mh3.K(androidx.compose.foundation.layout.b.c(g09Var2, 1.0f), ghcVarT2), ia7.b), 2);
            t7c t7cVarA2 = s7c.a(new uc0(8.0f, true, new qc0(0)), ndb.y, l46Var, 6);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarB1);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, t7cVarA2);
            dec.l(hj6.y, l46Var, u8aVarM2);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode2));
            dec.k(l46Var);
            itS = kv2.s(l46Var, j09VarJ2, hj6.x, -1715466812, list);
            i2 = 0;
            while (itS.hasNext()) {
                next = itS.next();
                i3 = i2 + 1;
                if (i2 >= 0) {
                    t72.Z();
                    throw null;
                }
                i5a i5aVar2 = (i5a) next;
                if ((i4 & 112) == 32) {
                    z = true;
                } else {
                    z = false;
                }
                zE = z | l46Var.e(i2);
                objR = l46Var.R();
                if (zE) {
                    objR = new rr1(i2, 5, a26Var);
                    l46Var.p0(objR);
                } else {
                    objR = new rr1(i2, 5, a26Var);
                    l46Var.p0(objR);
                }
                a(i5aVar2, f, (x16) objR, l46Var, 0);
                i2 = i3;
            }
            l46Var.r(false);
            l46Var.r(true);
            j09Var = g09Var2;
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new bz4(list, a26Var, j09Var, i);
        }
    }
}
