package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.SpreadRecommendationResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gvd {
    static {
        new SpreadRecommendationResult("ai-spread-1", t72.I(new PatternData("Past", "Past influences"), new PatternData("Present", "Current situation"), new PatternData("Future", "Future outcome")), "Basic Reading", "A 3-card spread is ideal for your question about relationships. It reveals the past influences, current dynamics, and future potential of your situation.", true, 1);
        ArrayList arrayList = new ArrayList(7);
        int i = 0;
        while (i < 7) {
            i++;
            arrayList.add(new PatternData(tec.e(i, "Position "), tec.e(i, "Description ")));
        }
        new SpreadRecommendationResult("ai-spread-2", arrayList, "Advanced Reading", "A 7-card spread provides deeper insight into your relationship question, covering hidden influences, advice, and long-term outcomes.", false, 2);
    }

    public static final void a(j09 j09Var, l46 l46Var, int i) {
        l46Var.h0(2081332415);
        int i2 = i | (l46Var.g(j09Var) ? 4 : 2);
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            pr4 pr4Var = l8b.a;
            j09 j09VarA0 = ynb.a0(tm7.o(j09Var, we6.c(((e8b) l46Var.k(pr4Var)).j, ((e8b) l46Var.k(pr4Var)).u, l46Var), a7c.c(0.0f, we6.d(0.0f, 16.0f, l46Var), 0.0f, we6.d(10.0f, 16.0f, l46Var))), we6.d(8.0f, 16.0f, l46Var), we6.d(1.5f, 3.0f, l46Var));
            String strQ = afc.q(R.string.spread_recommended, l46Var);
            mue mueVar = pue.a;
            nte.b(strQ, j09VarA0, ((e8b) l46Var.k(pr4Var)).v, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, we6.e(l46Var) ? pue.h(l46Var) : pue.j(l46Var), l46Var, 0, 0, 131064);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new do6(i, 11, j09Var);
        }
    }

    public static final void b(final SpreadRecommendationResult spreadRecommendationResult, final boolean z, final boolean z2, final x16 x16Var, final j09 j09Var, final boolean z3, l46 l46Var, final int i) {
        int i2;
        boolean z4;
        x16 x16Var2;
        y6c y6cVarB;
        boolean z5;
        long j;
        spreadRecommendationResult.getClass();
        x16Var.getClass();
        l46Var.h0(-965186035);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var.g(spreadRecommendationResult) : l46Var.i(spreadRecommendationResult) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z4 = z;
            i2 |= l46Var.h(z4) ? 32 : 16;
        } else {
            z4 = z;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            x16Var2 = x16Var;
            i2 |= l46Var.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        } else {
            x16Var2 = x16Var;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.g(j09Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var.h(z3) ? 131072 : 65536;
        }
        if (l46Var.W(i2 & 1, (74899 & i2) != 74898)) {
            pr4 pr4Var = l8b.a;
            final boolean zF = k8b.f((e8b) l46Var.k(pr4Var));
            if (zF) {
                l46Var.f0(169166067);
                y6cVarB = eze.a(l46Var).a.j;
                l46Var.r(false);
            } else {
                l46Var.f0(169166470);
                l46Var.r(false);
                y6cVarB = a7c.b(20.0f);
            }
            j09 j09VarC = b.c(j09Var, 1.0f);
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = ib8.e(l46Var);
            }
            j09 j09VarB = androidx.compose.foundation.b.b(j09VarC, (t69) objR, null, false, null, x16Var2, 28);
            j09 j09VarW = g09.a;
            if (z2 && !zF) {
                l46Var.f0(949478879);
                long j2 = ((e8b) l46Var.k(pr4Var)).u;
                j09VarW = db6.w(rrb.h(j09VarW, y6cVarB, new n4d(12.0f, y72.b(j2, 0.25f), 0.0f, 0L, 60)), 1.0f, j2, y6cVarB);
                l46Var.r(false);
            } else if (z2 && zF) {
                l46Var.f0(949752392);
                j09VarW = db6.w(j09VarW, 1.0f, ((e8b) l46Var.k(pr4Var)).q, y6cVarB);
                l46Var.r(false);
            } else {
                l46Var.f0(169187093);
                l46Var.r(false);
            }
            j09 j09VarD = j09VarB.D(j09VarW);
            long j3 = ((e8b) l46Var.k(pr4Var)).c;
            if (z2) {
                l46Var.f0(169192310);
                j = ((e8b) l46Var.k(pr4Var)).c;
                z5 = false;
            } else {
                z5 = false;
                l46Var.f0(169193024);
                j = ((e8b) l46Var.k(pr4Var)).f;
            }
            l46Var.r(z5);
            if (!we6.e(l46Var)) {
                j3 = j;
            }
            final boolean z6 = z4;
            bzd.d(j09VarD, y6cVarB, z5c.p(j3, 0L, l46Var, 24576, 14), null, null, af1.b0(1671517567, new n26() { // from class: evd
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    boolean z7;
                    j09 j09VarN;
                    Object obj4;
                    boolean z8;
                    long jB;
                    l46 l46Var2 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((d92) obj).getClass();
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                        FillElement fillElement = b.c;
                        boolean z9 = z2;
                        g09 g09Var = g09.a;
                        if (!z9 || zF) {
                            z7 = false;
                            l46Var2.f0(10625511);
                            l46Var2.r(false);
                            j09VarN = g09Var;
                        } else {
                            l46Var2.f0(329120368);
                            long j4 = ((e8b) l46Var2.k(l8b.a)).u;
                            j09VarN = tm7.n(g09Var, gec.O(new iy9[]{new iy9(Float.valueOf(0.399f), new y72(y72.b(j4, 0.0f))), new iy9(Float.valueOf(1.0f), new y72(y72.b(j4, 0.1f)))}, 0.0f, 0.0f, 14), null, 6);
                            z7 = false;
                            l46Var2.r(false);
                        }
                        j09 j09VarD2 = fillElement.D(j09VarN);
                        xn8 xn8VarC = s21.c(ndb.b, z7);
                        int iHashCode = Long.hashCode(l46Var2.T);
                        u8a u8aVarM = l46Var2.m();
                        j09 j09VarJ = m93.J(l46Var2, j09VarD2);
                        lf2.q.getClass();
                        l46Var2.j0();
                        boolean z10 = l46Var2.S;
                        ov7 ov7Var = LayoutNode.h1;
                        if (z10) {
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
                        j09 j09VarZ = ynb.Z(fillElement, 24.0f);
                        uc0 uc0Var = new uc0(12.0f, true, new qc0(0));
                        jx0 jx0Var = ndb.Y;
                        c92 c92VarA = a92.a(uc0Var, jx0Var, l46Var2, 6);
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
                        t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(0)), ndb.z, l46Var2, 54);
                        int iHashCode3 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM3 = l46Var2.m();
                        j09 j09VarJ3 = m93.J(l46Var2, g09Var);
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(he2Var, l46Var2, t7cVarA);
                        dec.l(he2Var2, l46Var2, u8aVarM3);
                        ib8.s(iHashCode3, l46Var2, he2Var3, l46Var2);
                        dec.l(he2Var4, l46Var2, j09VarJ3);
                        x16 x16Var3 = x16Var;
                        boolean zG = l46Var2.g(x16Var3);
                        Object objR2 = l46Var2.R();
                        if (zG || objR2 == sf2.a) {
                            obj4 = objR2;
                            lnc lncVar = new lnc(4, x16Var3);
                            l46Var2.p0(lncVar);
                            obj4 = lncVar;
                        }
                        obj4 = objR2;
                        qk2.i(z9, null, false, 0.0f, null, (a26) obj4, l46Var2, 0, 30);
                        int i3 = z6 ? R.string.spread_basic : R.string.spread_advanced;
                        SpreadRecommendationResult spreadRecommendationResult2 = spreadRecommendationResult;
                        String strR = afc.r(i3, new Object[]{Integer.valueOf(spreadRecommendationResult2.getPatternData().size())}, l46Var2);
                        mue mueVar = pue.a;
                        mue mueVarA = mue.a(pue.a(l46Var2), 0L, 0L, null, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, 0, 0L, null, null, 16777183);
                        if (z9) {
                            l46Var2.f0(1795075212);
                            jB = l8b.a(l46Var2);
                            z8 = false;
                        } else {
                            z8 = false;
                            l46Var2.f0(1795076045);
                            jB = l8b.b(l46Var2);
                        }
                        l46Var2.r(z8);
                        boolean z11 = z8;
                        nte.b(strR, null, jB, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarA, l46Var2, 0, 0, 131066);
                        l46Var2.r(true);
                        n16.h(spreadRecommendationResult2.getPatternData().size(), 0, null, false, null, cn1.g, l46Var2, 199728, 20);
                        nte.b(afc.q(R.string.spread_analysis, l46Var2), null, l8b.a(l46Var2), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.d(l46Var2), l46Var2, 0, 0, 131066);
                        nte.b(spreadRecommendationResult2.getRecommendSpreadReasonTitle(), null, l8b.b(l46Var2), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.b(l46Var2), l46Var2, 0, 0, 131066);
                        j09 j09VarD0 = mh3.d0(new jw7(1.0f, true), mh3.T(l46Var2), z11, 14);
                        c92 c92VarA2 = a92.a(xc0.c, jx0Var, l46Var2, z11 ? 1 : 0);
                        int iHashCode4 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM4 = l46Var2.m();
                        j09 j09VarJ4 = m93.J(l46Var2, j09VarD0);
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(he2Var, l46Var2, c92VarA2);
                        dec.l(he2Var2, l46Var2, u8aVarM4);
                        ib8.s(iHashCode4, l46Var2, he2Var3, l46Var2);
                        dec.l(he2Var4, l46Var2, j09VarJ4);
                        nte.b(spreadRecommendationResult2.getRecommendSpreadReasonDescription(), null, l8b.d(l46Var2), 0L, null, null, 0L, null, null, w6c.l(20), 0, false, 0, 0, null, pue.e(l46Var2), l46Var2, 0, 48, 129018);
                        l46Var2.r(true);
                        if (z3) {
                            l46Var2.f0(-1295907261);
                            gvd.c(spreadRecommendationResult2.getUsageCount(), z11 ? 1 : 0, l46Var2, null);
                            l46Var2.r(z11);
                        } else {
                            l46Var2.f0(-1295841913);
                            l46Var2.r(z11);
                        }
                        l46Var2.r(true);
                        if (spreadRecommendationResult2.isSuggested()) {
                            l46Var2.f0(-1640444626);
                            gvd.a(d31.a.a(g09Var, ndb.d), l46Var2, z11 ? 1 : 0);
                            l46Var2.r(z11);
                        } else {
                            l46Var2.f0(-1640368707);
                            l46Var2.r(z11);
                        }
                        l46Var2.r(true);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 196608, 24);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: fvd
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gvd.b(spreadRecommendationResult, z, z2, x16Var, j09Var, z3, (l46) obj, k99.P(i | 1));
                    return wef.a;
                }
            };
        }
    }

    public static final void c(int i, int i2, l46 l46Var, j09 j09Var) {
        j09 j09Var2;
        j09 j09VarA0;
        l46 l46Var2 = l46Var;
        l46Var2.h0(994299041);
        int i3 = (l46Var2.e(i) ? 4 : 2) | i2 | 48;
        if (l46Var2.W(i3 & 1, (i3 & 19) != 18)) {
            pr4 pr4Var = l8b.a;
            boolean zF = k8b.f((e8b) l46Var2.k(pr4Var));
            g09 g09Var = g09.a;
            if (zF) {
                l46Var2.f0(2038645129);
                l46Var2.r(false);
                j09VarA0 = g09Var;
            } else {
                l46Var2.f0(2038648780);
                j09VarA0 = ynb.a0(tm7.o(g09Var, ((e8b) l46Var2.k(pr4Var)).m, a7c.b(10.0f)), 8.0f, 2.0f);
                l46Var2.r(false);
            }
            xn8 xn8VarC = s21.c(ndb.e, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarA0);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, xn8VarC);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            String strR = afc.r(R.string.spread_reads_cost, new Object[]{Integer.valueOf(i)}, l46Var2);
            mue mueVar = pue.a;
            mue mueVarG = we6.e(l46Var2) ? pue.g(l46Var2) : pue.j(l46Var2);
            long j = ((e8b) l46Var2.k(pr4Var)).s;
            long j2 = ((e8b) l46Var2.k(pr4Var)).r;
            if (!we6.e(l46Var2)) {
                j = j2;
            }
            nte.b(strR, null, j, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarG, l46Var, 0, 0, 131066);
            l46Var2 = l46Var;
            l46Var2.r(true);
            j09Var2 = g09Var;
        } else {
            l46Var2.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new pb(i, j09Var2, i2, 9);
        }
    }
}
