package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.ShareSummaryContent;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p6d {
    public static final float a = 393.0f - (24.0f * 4.0f);

    static {
        t72.I(new TarotCardChoice(TarotCardType.SIX_OF_CUPS, false, "过去"), new TarotCardChoice(TarotCardType.STRENGTH, true, "现在"), new TarotCardChoice(TarotCardType.THE_FOOL, false, "你的想法"), new TarotCardChoice(TarotCardType.THE_EMPEROR, true, "外在环境"), new TarotCardChoice(TarotCardType.TEN_OF_SWORDS, false, "阻碍"), new TarotCardChoice(TarotCardType.THE_LOVERS, false, "助力"));
    }

    public static final void a(cv6 cv6Var, l46 l46Var, int i) {
        int i2;
        cv6 cv6Var2;
        l46 l46Var2;
        l46Var.h0(-704867117);
        int i3 = i & 6;
        d31 d31Var = d31.a;
        if (i3 == 0) {
            i2 = (l46Var.g(d31Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? l46Var.g(cv6Var) : l46Var.i(cv6Var) ? 32 : 16;
        }
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            cv6Var2 = cv6Var;
            l46Var2 = l46Var;
            feg.k(cv6Var2, null, eec.s(d31Var.b(g09.a), 1.65f, 1.65f), an2.a, 2, l46Var2, ((i2 >> 3) & 14) | 24624, 104);
        } else {
            cv6Var2 = cv6Var;
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new st5(cv6Var2, i, 9);
        }
    }

    public static final void b(cv6 cv6Var, Float f, l46 l46Var, int i) {
        int i2;
        boolean z;
        l46Var.h0(-1444297533);
        int i3 = i & 6;
        d31 d31Var = d31.a;
        if (i3 == 0) {
            i2 = (l46Var.g(d31Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? l46Var.g(cv6Var) : l46Var.i(cv6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.g(f) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            y6c y6cVar = h7d.a;
            int i4 = y72.l;
            long jF = gec.F(f != null ? f.floatValue() : 258.0f, 0.45f, 0.2f, 0.7f, 16);
            long jB = y72.b(jF, 1.0f);
            g09 g09Var = g09.a;
            j09 j09VarB = d31Var.b(g09Var);
            y02 y02Var = g21.f;
            j09 j09VarO = tm7.o(j09VarB, jB, y02Var);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarO);
            lf2.q.getClass();
            l46Var.j0();
            boolean z2 = l46Var.S;
            x16 x16Var = LayoutNode.h1;
            if (z2) {
                l46Var.l(x16Var);
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
            if (cv6Var != null) {
                l46Var.f0(488401302);
                a(cv6Var, l46Var, (i2 & 112) | 6);
                j09 j09VarO2 = tm7.o(d31Var.b(g09Var), y72.b(jF, 0.9f), y02Var);
                z = false;
                s21.a(j09VarO2, l46Var, 0);
                l46Var.r(false);
            } else {
                z = false;
                l46Var.f0(488650201);
                l46Var.r(false);
            }
            j09 j09VarM = tm7.M(b.m(g09Var, 168.0f, 252.0f), -25.0f, -41.0f);
            xn8 xn8VarC2 = s21.c(ndb.f, z);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarM);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(x16Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, xn8VarC2);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            feg.j(od4.A(R.drawable.bg_share_question_mark, 0, l46Var), null, ynb.Z(b.c, 40.0f), null, an2.b, 0.0f, null, l46Var, 25016, 104);
            l46Var.r(true);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new k38(cv6Var, f, i, 10);
        }
    }

    public static final void c(String str, List list, TarotSkinIdentify tarotSkinIdentify, cv6 cv6Var, Float f, ShareSummaryContent shareSummaryContent, l46 l46Var, int i) {
        int i2;
        l46Var.h0(1785658746);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(d31.a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? l46Var.g(list) : l46Var.i(list) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.e(tarotSkinIdentify.ordinal()) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? l46Var.g(cv6Var) : l46Var.i(cv6Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var.g(f) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? l46Var.g(shareSummaryContent) : l46Var.i(shareSummaryContent) ? 1048576 : 524288;
        }
        if (l46Var.W(i2 & 1, (599187 & i2) != 599186)) {
            int i3 = i2 >> 9;
            b(cv6Var, f, l46Var, (i2 & 14) | (i3 & 112) | (i3 & 896));
            int i4 = i2 >> 3;
            i(str, list, tarotSkinIdentify, shareSummaryContent, false, l46Var, (i4 & 896) | (i4 & 14) | 24576 | (i4 & 112) | (ShareSummaryContent.$stable << 9) | (i3 & 7168));
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new r20(str, list, tarotSkinIdentify, cv6Var, f, shareSummaryContent, i, 6);
        }
    }

    public static final void d(String str, List list, TarotSkinIdentify tarotSkinIdentify, ShareSummaryContent shareSummaryContent, l46 l46Var, int i) {
        int i2;
        l46Var.h0(770570392);
        int i3 = i & 6;
        d31 d31Var = d31.a;
        if (i3 == 0) {
            i2 = (l46Var.g(d31Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? l46Var.g(list) : l46Var.i(list) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.e(tarotSkinIdentify.ordinal()) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? l46Var.g(shareSummaryContent) : l46Var.i(shareSummaryContent) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (l46Var.W(i2 & 1, (i2 & 9363) != 9362)) {
            g09 g09Var = g09.a;
            j09 j09VarO = tm7.o(d31Var.b(g09Var), ((e8b) l46Var.k(l8b.a)).a, g21.f);
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
            feg.j(od4.A(R.drawable.bg_share_question_mark, 0, l46Var), null, tm7.M(b.m(g09Var, 83.0f, 124.0f), 20.0f, 24.0f), null, an2.b, 0.0f, null, l46Var, 25016, 104);
            l46Var.r(true);
            int i4 = i2 >> 3;
            i(str, list, tarotSkinIdentify, shareSummaryContent, true, l46Var, (i4 & 14) | 24576 | (i4 & 112) | (i4 & 896) | (ShareSummaryContent.$stable << 9) | (i4 & 7168));
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rb(i, 16, str, list, tarotSkinIdentify, shareSummaryContent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [int] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14, types: [xn2] */
    /* JADX WARN: Type inference failed for: r33v0, types: [java.lang.Object, l46] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v7, types: [boolean, int] */
    public static final void e(j09 j09Var, boolean z, boolean z2, a26 a26Var, String str, List list, List list2, ShareSummaryContent shareSummaryContent, l46 l46Var, int i) {
        int i2;
        TarotSkinIdentify tarotSkinIdentifyC;
        boolean z3;
        s69 s69Var;
        ks ksVar;
        z3g z3gVarC;
        ?? r6;
        l46Var.h0(1761558369);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.g(str) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= (i & 262144) == 0 ? l46Var.g(list) : l46Var.i(list) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (i & 2097152) == 0 ? l46Var.g(list2) : l46Var.i(list2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= (16777216 & i) == 0 ? l46Var.g(shareSummaryContent) : l46Var.i(shareSummaryContent) ? 8388608 : 4194304;
        }
        if (l46Var.W(i2 & 1, (4793491 & i2) != 4793490)) {
            boolean zBooleanValue = ((Boolean) l46Var.k(sad.b)).booleanValue();
            int iIntValue = ((Number) l46Var.k(sad.c)).intValue();
            boolean zF = k8b.f((e8b) l46Var.k(l8b.a));
            boolean z4 = ((3670016 & i2) == 1048576 || ((i2 & 2097152) != 0 && l46Var.g(list2))) | ((458752 & i2) == 131072 || ((i2 & 262144) != 0 && l46Var.g(list)));
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (z4 || objR == obj) {
                objR = s72.Q0(list, s72.c1(list2, 3));
                l46Var.p0(objR);
            }
            List list3 = (List) objR;
            TarotCardChoice tarotCardChoice = (TarotCardChoice) s72.H0(list3);
            TarotSkinIdentify tarotSkinIdentify = ((die) l46Var.k(snd.a)).a;
            MixedDeckSnapshot mixedDeckSnapshot = (MixedDeckSnapshot) l46Var.k(snd.b);
            if (tarotCardChoice == null) {
                l46Var.f0(-1619347701);
                l46Var.r(false);
                tarotSkinIdentifyC = null;
            } else {
                l46Var.f0(-1619347700);
                tarotSkinIdentifyC = snd.c(tarotCardChoice.getCard().getCardKey(), tarotSkinIdentify, l46Var, 0);
                l46Var.r(false);
            }
            boolean zE = l46Var.e(tarotSkinIdentify.ordinal()) | l46Var.g(list3) | l46Var.h(zF) | l46Var.g(mixedDeckSnapshot);
            Object objR2 = l46Var.R();
            if (zE || objR2 == obj) {
                z3 = false;
                objR2 = kv2.f(0, l46Var);
            } else {
                z3 = false;
            }
            s69 s69Var2 = (s69) objR2;
            if (zF || tarotCardChoice == null || tarotSkinIdentifyC == null) {
                s69Var = s69Var2;
                zF = zF;
                ksVar = null;
                l46Var.f0(-1618943181);
                l46Var.r(z3);
                z3gVarC = null;
                r6 = z3;
            } else {
                l46Var.f0(-1619098522);
                qhe qheVarR = q7c.r(tarotCardChoice);
                boolean zG = l46Var.g(s69Var2);
                Object objR3 = l46Var.R();
                if (zG || objR3 == obj) {
                    objR3 = new q50(s69Var2, 8);
                    l46Var.p0(objR3);
                }
                x16 x16Var = (x16) objR3;
                s69Var = s69Var2;
                r6 = 0;
                ksVar = null;
                z3gVarC = l6g.c(qheVarR, tarotSkinIdentifyC, x16Var, l46Var, 0, 0);
                l46Var.r(false);
            }
            boolean zG2 = l46Var.g(z3gVarC != null ? z3gVarC.a : ksVar);
            Object objR4 = l46Var.R();
            if (zG2 || objR4 == obj) {
                objR4 = q1c.f(ksVar);
                l46Var.p0(objR4);
            }
            e89 e89Var = (e89) objR4;
            ks ksVar2 = z3gVarC != null ? z3gVarC.a : ksVar;
            boolean zG3 = l46Var.g(e89Var) | l46Var.i(z3gVarC);
            Object objR5 = l46Var.R();
            if (zG3 || objR5 == obj) {
                objR5 = new l6d(z3gVarC, e89Var, ksVar);
                l46Var.p0(objR5);
            }
            af1.o((l26) objR5, l46Var, ksVar2);
            boolean z5 = zF;
            dd2 dd2VarB0 = af1.b0(1408230080, new j6d(s69Var, j09Var, zBooleanValue, z, sad.a(list3.size() + ((zF || tarotCardChoice == null) ? r6 : 1), ((sz9) s69Var).j(), l46Var, r6), z3gVarC, iIntValue, z2, a26Var, e89Var, z5, str, list3, tarotSkinIdentify, shareSummaryContent), l46Var);
            if (z5) {
                l46Var.f0(-1617064178);
                dd2VarB0.z(l46Var, 6);
                l46Var.r(r6);
            } else {
                l46Var.f0(-1617038107);
                o7c.a(true, null, dd2VarB0, l46Var, 390, 2);
                l46Var.r(r6);
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new jc2(j09Var, z, z2, a26Var, str, list, list2, shareSummaryContent, i);
        }
    }

    public static final void f(int i, a26 a26Var, l46 l46Var, j09 j09Var, boolean z) {
        int i2;
        int i3;
        j09 j09VarD0;
        boolean z2;
        boolean z3;
        l46Var.h0(2035206385);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            e89 e89VarI = q1c.i(a26Var, l46Var);
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            lbd lbdVar = (lbd) z5c.G(job.a.b(lbd.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
            boolean zI = l46Var.i(lbdVar);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zI || objR == obj) {
                objR = new m6d(lbdVar, null);
                l46Var.p0(objR);
            }
            af1.o((l26) objR, l46Var, wef.a);
            a26 a26Var2 = (a26) l46Var.k(sad.d);
            Boolean boolValueOf = Boolean.valueOf(z);
            abd abdVar = (abd) lbdVar.v.getValue();
            int i4 = i2 & 112;
            boolean zG = (i4 == 32) | l46Var.g(a26Var2) | l46Var.i(lbdVar);
            Object objR2 = l46Var.R();
            if (zG || objR2 == obj) {
                objR2 = new n6d(z, a26Var2, lbdVar, null);
                l46Var.p0(objR2);
            }
            af1.q(boolValueOf, abdVar, a26Var2, (l26) objR2, l46Var);
            Boolean boolValueOf2 = Boolean.valueOf(z);
            boolean zG2 = (i4 == 32) | l46Var.g(a26Var2);
            Object objR3 = l46Var.R();
            if (zG2 || objR3 == obj) {
                objR3 = new f7b(1, a26Var2, z);
                l46Var.p0(objR3);
            }
            af1.h(boolValueOf2, a26Var2, (a26) objR3, l46Var);
            boolean z4 = z || ((Boolean) l46Var.k(sad.a)).booleanValue();
            g09 g09Var = g09.a;
            j09 j09VarB0 = ynb.b0(z ? 0.0f : 58.0f, 0.0f, j09Var.D(z4 ? g09Var : b.c), 2);
            if (z4) {
                l46Var.f0(1623263321);
                i3 = 0;
                l46Var.r(false);
                j09VarD0 = g09Var;
            } else {
                i3 = 0;
                l46Var.f0(1623264342);
                j09VarD0 = mh3.d0(g09Var, mh3.T(l46Var), false, 14);
                l46Var.r(false);
            }
            j09 j09VarD = j09VarB0.D(j09VarD0);
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, i3);
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
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            if (z) {
                z2 = false;
                l46Var.f0(-275062681);
            } else {
                ib8.r(40.0f, 822410073, l46Var, l46Var, g09Var);
                z2 = false;
            }
            l46Var.r(z2);
            g21.s(393.0f, af1.b0(-1668850589, new o50(j09Var, lbdVar, z, e89VarI, 20), l46Var), l46Var, 54);
            if (z) {
                z3 = false;
                l46Var.f0(-274516089);
            } else {
                ib8.r(40.0f, 822427705, l46Var, l46Var, g09Var);
                z3 = false;
            }
            l46Var.r(z3);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qm4(j09Var, z, a26Var, i, 1);
        }
    }

    public static final void g(TarotCardChoice tarotCardChoice, final float f, final TarotSkinIdentify tarotSkinIdentify, final boolean z, final s6d s6dVar, l46 l46Var, final int i) {
        final TarotCardChoice tarotCardChoice2;
        int i2;
        j09 j09VarS;
        l46Var.h0(120330679);
        if ((i & 6) == 0) {
            tarotCardChoice2 = tarotCardChoice;
            i2 = (l46Var.g(tarotCardChoice2) ? 4 : 2) | i;
        } else {
            tarotCardChoice2 = tarotCardChoice;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.e(tarotSkinIdentify.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? l46Var.g(s6dVar) : l46Var.i(s6dVar) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (l46Var.W(i2 & 1, (i2 & 9363) != 9362)) {
            TarotSkinIdentify tarotSkinIdentifyC = snd.c(tarotCardChoice2.getCard().getCardKey(), tarotSkinIdentify, l46Var, 0);
            float f2 = (z ? 0.041666668f : 0.08928572f) * f;
            y6c y6cVarB = a7c.b(f2);
            boolean z2 = s6dVar instanceof q6d;
            g09 g09Var = g09.a;
            if (z2) {
                l46Var.f0(-326322785);
                l46Var.r(false);
                j09VarS = g09Var;
            } else {
                if (!(s6dVar instanceof r6d)) {
                    throw tec.d(-326324003, l46Var, false);
                }
                l46Var.f0(-326320814);
                boolean zD = ((57344 & i2) == 16384 || ((i2 & 32768) != 0 && l46Var.i(s6dVar))) | l46Var.d(f2);
                Object objR = l46Var.R();
                if (zD || objR == sf2.a) {
                    objR = new tc2(s6dVar, f2, 3);
                    l46Var.p0(objR);
                }
                j09VarS = b21.s(g09Var, (a26) objR);
                l46Var.r(false);
            }
            j09 j09VarE = oa7.E(dj6.w(b.p(g09Var, f), snd.b(tarotSkinIdentifyC, l46Var, 0)).D(j09VarS), y6cVarB);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarE);
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
            FillElement fillElement = b.c;
            o7c.d(fillElement, q7c.r(tarotCardChoice2), tarotSkinIdentifyC, false, an2.c, 0.0f, null, false, l46Var, 221190, 200);
            if (z2) {
                l46Var.f0(-1837018332);
                s21.a(db6.w(fillElement, 0.5f, ((q6d) s6dVar).a, y6cVarB), l46Var, 0);
                l46Var.r(false);
            } else {
                l46Var.f0(-1836894363);
                l46Var.r(false);
            }
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: i6d
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p6d.g(tarotCardChoice2, f, tarotSkinIdentify, z, s6dVar, (l46) obj, k99.P(i | 1));
                    return wef.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [boolean, int] */
    public static final void h(int i, l46 l46Var) {
        l46 l46Var2;
        List listI;
        ?? r4;
        j09 j09VarD0;
        l46 l46Var3 = l46Var;
        he2 he2Var = hj6.x;
        he2 he2Var2 = hj6.X;
        he2 he2Var3 = hj6.y;
        he2 he2Var4 = hj6.z;
        l46Var3.h0(-1427096811);
        if (l46Var3.W(i & 1, i != 0)) {
            String str = (String) l46Var3.k(vgb.c);
            if (str != null) {
                l46Var3.f0(1240277864);
                listI = v4e.U(afc.q(R.string.share_reading_card_qr_tips, l46Var3));
                l46Var3.r(false);
            } else {
                l46Var3.f0(1240354496);
                listI = t72.I(afc.q(R.string.share_footer_long_press_qr, l46Var3), afc.q(R.string.share_footer_download_quin, l46Var3));
                l46Var3.r(false);
            }
            b1b b1bVar = zg2.h;
            int iD0 = ((sw3) l46Var3.k(b1bVar)).D0(44.5f);
            boolean zG = l46Var3.g(str) | l46Var3.e(iD0);
            Object objR = l46Var3.R();
            if (zG || objR == sf2.a) {
                objR = str != null ? vgb.a(iD0, str) : null;
                l46Var3.p0(objR);
            }
            cv6 cv6Var = (cv6) objR;
            yi4 yi4Var = cv6Var != null ? new yi4(((sw3) l46Var3.k(b1bVar)).Z(((ks) cv6Var).a.getWidth())) : null;
            float f = yi4Var != null ? yi4Var.a : 44.5f;
            y6c y6cVarB = a7c.b(4.0f);
            g09 g09Var = g09.a;
            j09 j09VarC = b.c(g09Var, 1.0f);
            c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Y, l46Var3, 6);
            int iHashCode = Long.hashCode(l46Var3.T);
            u8a u8aVarM = l46Var3.m();
            j09 j09VarJ = m93.J(l46Var3, j09VarC);
            lf2.q.getClass();
            l46Var3.j0();
            boolean z = l46Var3.S;
            x16 x16Var = LayoutNode.h1;
            if (z) {
                l46Var3.l(x16Var);
            } else {
                l46Var3.s0();
            }
            dec.l(he2Var4, l46Var3, c92VarA);
            dec.l(he2Var3, l46Var3, u8aVarM);
            ib8.s(iHashCode, l46Var3, he2Var2, l46Var3);
            he2 he2Var5 = he2Var;
            dec.l(he2Var5, l46Var3, j09VarJ);
            List list = listI;
            h7d.b(6, ((e8b) l46Var3.k(l8b.a)).A, l46Var3, b.d(b.c(g09Var, 1.0f), 16.0f));
            j09 j09VarC2 = b.c(g09Var, 1.0f);
            t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var3, 48);
            int iHashCode2 = Long.hashCode(l46Var3.T);
            u8a u8aVarM2 = l46Var3.m();
            j09 j09VarJ2 = m93.J(l46Var3, j09VarC2);
            l46Var3.j0();
            if (l46Var3.S) {
                l46Var3.l(x16Var);
            } else {
                l46Var3.s0();
            }
            dec.l(he2Var4, l46Var3, t7cVarA);
            dec.l(he2Var3, l46Var3, u8aVarM2);
            ib8.s(iHashCode2, l46Var3, he2Var2, l46Var3);
            dec.l(he2Var5, l46Var3, j09VarJ2);
            float f2 = f;
            float f3 = 1.0f;
            feg.j(od4.A(R.drawable.share_top_logo_dark, 0, l46Var3), null, b.m(g09Var, 81.0f, 36.0f), null, an2.b, 0.0f, null, l46Var, 25016, 104);
            l46 l46Var4 = l46Var;
            if (str == null) {
                l46Var4.f0(-935769014);
                if (1.0f <= 0.0d) {
                    g37.a("invalid weight; must be greater than zero");
                }
                o5c.f(l46Var4, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                r4 = 0;
            } else {
                r4 = 0;
                l46Var4.f0(1055957587);
            }
            l46Var4.r(r4);
            if (str != null) {
                if (1.0f <= 0.0d) {
                    g37.a("invalid weight; must be greater than zero");
                }
                j09VarD0 = ynb.d0(8.0f, 0.0f, 0.0f, 0.0f, 14, new jw7(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
            } else {
                j09VarD0 = g09Var;
            }
            boolean z2 = true;
            c92 c92VarA2 = a92.a(new uc0(4.0f, true, new qc0(r4)), ndb.E0, l46Var4, 54);
            int iHashCode3 = Long.hashCode(l46Var4.T);
            u8a u8aVarM3 = l46Var4.m();
            j09 j09VarJ3 = m93.J(l46Var4, j09VarD0);
            l46Var4.j0();
            if (l46Var4.S) {
                l46Var4.l(x16Var);
            } else {
                l46Var4.s0();
            }
            dec.l(he2Var4, l46Var4, c92VarA2);
            dec.l(he2Var3, l46Var4, u8aVarM3);
            ib8.s(iHashCode3, l46Var4, he2Var2, l46Var4);
            Iterator itS = kv2.s(l46Var4, j09VarJ3, he2Var5, 1135640792, list);
            l46 l46Var5 = l46Var4;
            while (itS.hasNext()) {
                String str2 = (String) itS.next();
                mue mueVar = pue.a;
                nte.b(str2, null, ((e8b) l46Var5.k(l8b.a)).q, 0L, null, null, 0L, null, new jme(6), 0L, 0, false, 0, 0, null, pue.j(l46Var5), l46Var, 0, 0, 130042);
                l46Var5 = l46Var;
                he2Var3 = he2Var3;
                he2Var4 = he2Var4;
                he2Var2 = he2Var2;
                x16Var = x16Var;
                he2Var5 = he2Var5;
                f3 = f3;
                z2 = true;
            }
            he2 he2Var6 = he2Var5;
            he2 he2Var7 = he2Var2;
            he2 he2Var8 = he2Var3;
            he2 he2Var9 = he2Var4;
            x16 x16Var2 = x16Var;
            l46Var5.r(false);
            l46Var5.r(true);
            o5c.f(l46Var5, b.p(g09Var, 8.0f));
            j09 j09VarE = oa7.E(b.l(g09Var, f2 + f3), y6cVarB);
            b1b b1bVar2 = l8b.a;
            j09 j09VarW = db6.w(tm7.o(j09VarE, ((e8b) l46Var5.k(b1bVar2)).j, g21.f), 0.5f, ((e8b) l46Var5.k(b1bVar2)).A, y6cVarB);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode4 = Long.hashCode(l46Var5.T);
            u8a u8aVarM4 = l46Var5.m();
            j09 j09VarJ4 = m93.J(l46Var5, j09VarW);
            lf2.q.getClass();
            l46Var5.j0();
            if (l46Var5.S) {
                l46Var5.l(x16Var2);
            } else {
                l46Var5.s0();
            }
            dec.l(he2Var9, l46Var5, xn8VarC);
            dec.l(he2Var8, l46Var5, u8aVarM4);
            ib8.s(iHashCode4, l46Var5, he2Var7, l46Var5);
            dec.l(he2Var6, l46Var5, j09VarJ4);
            if (cv6Var != null) {
                l46Var5.f0(-1598579787);
                feg.k(cv6Var, "QR code", b.l(g09Var, f2), null, 0, l46Var5, 48, 120);
                l46Var5.r(false);
            } else {
                l46Var5.f0(-1159939112);
                a6c.c(54, l46Var5, b.l(g09Var, 44.5f), "summary");
                l46Var5.r(false);
            }
            tec.s(l46Var5, true, true, true);
            l46Var2 = l46Var5;
        } else {
            l46Var3.Z();
            l46Var2 = l46Var3;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new dxc(i);
        }
    }

    public static final void i(String str, List list, TarotSkinIdentify tarotSkinIdentify, ShareSummaryContent shareSummaryContent, boolean z, l46 l46Var, int i) {
        int i2;
        TarotSkinIdentify tarotSkinIdentify2;
        l46 l46Var2;
        g09 g09Var;
        boolean z2;
        l46Var.h0(1153380771);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? l46Var.g(list) : l46Var.i(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.e(tarotSkinIdentify.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? l46Var.g(shareSummaryContent) : l46Var.i(shareSummaryContent) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.h(z) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (l46Var.W(i2 & 1, (i2 & 9363) != 9362)) {
            g09 g09Var2 = g09.a;
            j09 j09VarD0 = ynb.d0(0.0f, 40.0f, 0.0f, 0.0f, 13, b.c(g09Var2, 1.0f));
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
            if (v4e.Q(str)) {
                l46Var2 = l46Var;
                g09Var = g09Var2;
                z2 = false;
                l46Var2.f0(119751605);
                l46Var2.r(false);
            } else {
                l46Var.f0(119408528);
                mue mueVar = pue.a;
                g09Var = g09Var2;
                z2 = false;
                nte.b(str, ynb.a0(b.c(g09Var2, 1.0f), 32.0f, 20.0f), ((e8b) l46Var.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.m(l46Var), 0L, 0L, null, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 0, 0L, null, null, 16777183), l46Var, (i2 & 14) | 48, 0, 131064);
                l46Var2 = l46Var;
                tec.u(g09Var, 16.0f, l46Var2, false);
            }
            if (list.isEmpty()) {
                tarotSkinIdentify2 = tarotSkinIdentify;
                l46Var2.f0(119924213);
                l46Var2.r(z2);
            } else {
                l46Var2.f0(119784868);
                tarotSkinIdentify2 = tarotSkinIdentify;
                p(list, tarotSkinIdentify2, z, l46Var2, ((i2 >> 3) & 126) | ((i2 >> 6) & 896));
                tec.u(g09Var, 32.0f, l46Var2, z2);
            }
            o(shareSummaryContent, l46Var2, ShareSummaryContent.$stable | ((i2 >> 9) & 14));
            l46Var2.r(true);
        } else {
            tarotSkinIdentify2 = tarotSkinIdentify;
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new dk(str, list, tarotSkinIdentify2, shareSummaryContent, z, i);
        }
    }

    public static final void j(TarotCardChoice tarotCardChoice, j09 j09Var, jx0 jx0Var, l46 l46Var, int i) {
        boolean z;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1356929547);
        int i2 = i | (l46Var2.g(tarotCardChoice) ? 4 : 2);
        if (l46Var2.W(i2 & 1, (i2 & 147) != 146)) {
            j09 j09VarD = b.d(j09Var, 14.0f);
            t7c t7cVarA = s7c.a(new uc0(2.0f, true, new jv2(3, jx0Var)), ndb.z, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarD);
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
            dec.l(he2Var, l46Var2, t7cVarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            if (tarotCardChoice.isReversed()) {
                l46Var2.f0(-1951038010);
                j09 j09VarL = b.l(g09.a, 12.0f);
                pr4 pr4Var = l8b.a;
                j09 j09VarO = tm7.o(j09VarL, ((e8b) l46Var2.k(pr4Var)).m, a7c.b(2.0f));
                xn8 xn8VarC = s21.c(ndb.f, false);
                int iHashCode2 = Long.hashCode(l46Var2.T);
                u8a u8aVarM2 = l46Var2.m();
                j09 j09VarJ2 = m93.J(l46Var2, j09VarO);
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
                nte.b(afc.q(R.string.text_reverse_tag, l46Var2), null, ((e8b) l46Var2.k(pr4Var)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, q(l46Var2), l46Var, 0, 24576, 114682);
                l46Var2 = l46Var;
                z = true;
                l46Var2.r(true);
                l46Var2.r(false);
            } else {
                z = true;
                l46Var2.f0(-1950658415);
                l46Var2.r(false);
            }
            nte.b(afc.q(tarotCardChoice.getCard().getTitleRes(), l46Var2), null, ((e8b) l46Var2.k(l8b.a)).t, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, q(l46Var2), l46Var, 0, 24960, 110586);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o7b(i, tarotCardChoice, j09Var, jx0Var, 10);
        }
    }

    public static final void k(int i, int i2, l46 l46Var, j09 j09Var, List list) {
        float f;
        boolean z;
        float f2;
        g09 g09Var;
        j09 jw7Var;
        boolean z2;
        he2 he2Var = hj6.x;
        he2 he2Var2 = hj6.X;
        he2 he2Var3 = hj6.y;
        he2 he2Var4 = hj6.z;
        jx0 jx0Var = ndb.Y;
        l46Var.h0(1715834100);
        int i3 = i2 | (l46Var.g(list) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i3 |= l46Var.e(i) ? 32 : 16;
        }
        int i4 = i3 | (l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i4 & 1, (i4 & 147) != 146)) {
            t7c t7cVarA = s7c.a(new uc0(4.0f, true, new qc0(0)), ndb.y, l46Var, 54);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09Var);
            lf2.q.getClass();
            l46Var.j0();
            boolean z3 = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z3) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var4, l46Var, t7cVarA);
            dec.l(he2Var3, l46Var, u8aVarM);
            ib8.s(iHashCode, l46Var, he2Var2, l46Var);
            dec.l(he2Var, l46Var, j09VarJ);
            g09 g09Var2 = g09.a;
            j09 j09VarP = b.p(g09Var2, 16.0f);
            c92 c92VarA = a92.a(new uc0(4.0f, true, new qc0(0)), jx0Var, l46Var, 6);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarP);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var4, l46Var, c92VarA);
            dec.l(he2Var3, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var2, l46Var);
            dec.l(he2Var, l46Var, j09VarJ2);
            l46Var.f0(-908107864);
            Iterator it = t72.B(list).iterator();
            while (true) {
                f = 1.0f;
                if (!((y67) it).c) {
                    break;
                }
                l(0, 48, 4, l46Var, b.c(g09Var2, 1.0f), ub3.g(((q67) it).nextInt() + i + 1, "."));
                g09Var2 = g09Var2;
            }
            g09 g09Var3 = g09Var2;
            l46Var.r(false);
            l46Var.r(true);
            if (!list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    }
                    String tarotCardDesc = ((TarotCardChoice) it2.next()).getTarotCardDesc();
                    if (tarotCardDesc != null && !v4e.Q(tarotCardDesc)) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            if (z) {
                l46Var.f0(1669973201);
                if (1.0f <= 0.0d) {
                    g37.a("invalid weight; must be greater than zero");
                }
                jw7 jw7Var2 = new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                c92 c92VarA2 = a92.a(new uc0(4.0f, true, new qc0(0)), jx0Var, l46Var, 6);
                int iHashCode3 = Long.hashCode(l46Var.T);
                u8a u8aVarM3 = l46Var.m();
                j09 j09VarJ3 = m93.J(l46Var, jw7Var2);
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var4, l46Var, c92VarA2);
                dec.l(he2Var3, l46Var, u8aVarM3);
                ib8.s(iHashCode3, l46Var, he2Var2, l46Var);
                Iterator itS = kv2.s(l46Var, j09VarJ3, he2Var, -1635274102, list);
                while (itS.hasNext()) {
                    String tarotCardDesc2 = ((TarotCardChoice) itS.next()).getTarotCardDesc();
                    if (tarotCardDesc2 == null) {
                        tarotCardDesc2 = "";
                    }
                    String str = tarotCardDesc2;
                    g09 g09Var4 = g09Var3;
                    l(0, 48, 4, l46Var, b.c(g09Var4, f), str);
                    f = f;
                    g09Var3 = g09Var4;
                }
                f2 = f;
                g09Var = g09Var3;
                tec.s(l46Var, false, true, false);
            } else {
                f2 = 1.0f;
                g09Var = g09Var3;
                l46Var.f0(1670273994);
                l46Var.r(false);
            }
            if (z) {
                jw7Var = g09Var;
                z2 = true;
            } else {
                if (f2 <= 0.0d) {
                    g37.a("invalid weight; must be greater than zero");
                }
                z2 = true;
                jw7Var = new jw7(f2 > Float.MAX_VALUE ? Float.MAX_VALUE : f2, true);
            }
            c92 c92VarA3 = a92.a(new uc0(4.0f, z2, new qc0(0)), jx0Var, l46Var, 6);
            int iHashCode4 = Long.hashCode(l46Var.T);
            u8a u8aVarM4 = l46Var.m();
            j09 j09VarJ4 = m93.J(l46Var, jw7Var);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var4, l46Var, c92VarA3);
            dec.l(he2Var3, l46Var, u8aVarM4);
            ib8.s(iHashCode4, l46Var, he2Var2, l46Var);
            Iterator itS2 = kv2.s(l46Var, j09VarJ4, he2Var, 1266853670, list);
            while (itS2.hasNext()) {
                j((TarotCardChoice) itS2.next(), g09Var, jx0Var, l46Var, 432);
            }
            tec.s(l46Var, false, true, true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new or1(list, i, j09Var, i2, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:36:0x010d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0117  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    public static final void l(int i, int i2, int i3, l46 l46Var, j09 j09Var, String str) {
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        ojb ojbVarV;
        l46 l46Var2 = l46Var;
        l46Var2.h0(493841085);
        int i8 = i2 | (l46Var2.g(str) ? 4 : 2);
        if ((i3 & 4) == 0) {
            i4 = i;
            if (l46Var2.e(i4)) {
                i5 = 256;
            }
            i6 = i8 | i5;
            if ((i6 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var2.W(i6 & 1, z)) {
                l46Var2.b0();
                if ((i2 & 1) == 0 && !l46Var2.C()) {
                    l46Var2.Z();
                    if ((i3 & 4) != 0) {
                        i6 &= -897;
                    }
                } else if ((i3 & 4) != 0) {
                    i6 &= -897;
                    i4 = 5;
                }
                int i9 = i4;
                int i10 = i6;
                l46Var2.s();
                j09 j09VarD = b.d(j09Var, 14.0f);
                xn8 xn8VarC = s21.c(ndb.e, false);
                int iHashCode = Long.hashCode(l46Var2.T);
                u8a u8aVarM = l46Var2.m();
                j09 j09VarJ = m93.J(l46Var2, j09VarD);
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
                nte.b(str, b.c(g09.a, 1.0f), ((e8b) l46Var2.k(l8b.a)).q, 0L, null, null, 0L, null, new jme(i9), 0L, 2, false, 1, 0, null, q(l46Var2), l46Var2, (i10 & 14) | 48, ((i10 >> 6) & 14) | 24960, 109560);
                l46Var2 = l46Var2;
                l46Var2.r(true);
                i7 = i9;
            } else {
                l46Var2.Z();
                i7 = i4;
            }
            ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new mc2(str, j09Var, i7, i2, i3);
            }
        }
        i4 = i;
        i5 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        i6 = i8 | i5;
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (l46Var2.W(i6 & 1, z)) {
            l46Var2.b0();
            if ((i2 & 1) == 0) {
                if ((i3 & 4) != 0) {
                    i6 &= -897;
                    i4 = 5;
                }
            } else if ((i3 & 4) != 0) {
                i6 &= -897;
                i4 = 5;
            }
            int i11 = i4;
            int i12 = i6;
            l46Var2.s();
            j09 j09VarD2 = b.d(j09Var, 14.0f);
            xn8 xn8VarC2 = s21.c(ndb.e, false);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarD2);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, xn8VarC2);
            dec.l(hj6.y, l46Var2, u8aVarM2);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode2));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ2);
            nte.b(str, b.c(g09.a, 1.0f), ((e8b) l46Var2.k(l8b.a)).q, 0L, null, null, 0L, null, new jme(i11), 0L, 2, false, 1, 0, null, q(l46Var2), l46Var2, (i12 & 14) | 48, ((i12 >> 6) & 14) | 24960, 109560);
            l46Var2 = l46Var2;
            l46Var2.r(true);
            i7 = i11;
        } else {
            l46Var2.Z();
            i7 = i4;
        }
        ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new mc2(str, j09Var, i7, i2, i3);
        }
    }

    public static final void m(List list, TarotSkinIdentify tarotSkinIdentify, boolean z, l46 l46Var, int i) {
        int i2;
        float f;
        boolean z2;
        long jD;
        List list2 = list;
        he2 he2Var = hj6.x;
        he2 he2Var2 = hj6.X;
        he2 he2Var3 = hj6.y;
        he2 he2Var4 = hj6.z;
        kx0 kx0Var = ndb.y;
        l46Var.h0(1224891909);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var.g(list2) : l46Var.i(list2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.e(tarotSkinIdentify.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i3 = i2;
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            int size = list2.size();
            if (size != 6) {
                f = size != 7 ? 40.0f : 48.0f;
            } else {
                f = 56.0f;
            }
            g09 g09Var = g09.a;
            j09 j09VarB0 = ynb.b0(24.0f, 0.0f, b.c(g09Var, 1.0f), 2);
            c92 c92VarA = a92.a(new uc0(16.0f, true, new qc0(0)), ndb.Y, l46Var, 6);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarB0);
            lf2.q.getClass();
            l46Var.j0();
            boolean z3 = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z3) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var4, l46Var, c92VarA);
            dec.l(he2Var3, l46Var, u8aVarM);
            ib8.s(iHashCode, l46Var, he2Var2, l46Var);
            dec.l(he2Var, l46Var, j09VarJ);
            float f2 = a;
            boolean z4 = true;
            float size2 = (f2 - f) / (list2.size() - 1);
            j09 j09VarP = b.p(g09Var, f2);
            float f3 = f;
            t7c t7cVarA = s7c.a(new uc0(size2 - f, true, new qc0(0)), kx0Var, l46Var, 0);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarP);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var4, l46Var, t7cVarA);
            dec.l(he2Var3, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var2, l46Var);
            Iterator itS = kv2.s(l46Var, j09VarJ2, he2Var, -550953955, list2);
            while (itS.hasNext()) {
                TarotCardChoice tarotCardChoice = (TarotCardChoice) itS.next();
                if (z) {
                    l46Var.f0(327206226);
                    jD = ((e8b) l46Var.k(l8b.a)).a;
                    z2 = false;
                    l46Var.r(false);
                } else {
                    z2 = false;
                    l46Var.f0(327206900);
                    l46Var.r(false);
                    jD = abg.d(4282072409L);
                }
                float f4 = f3;
                g(tarotCardChoice, f4, tarotSkinIdentify, z, new r6d(jD), l46Var, (i3 << 3) & 8064);
                g09Var = g09Var;
                i3 = i3;
                itS = itS;
                z4 = true;
                f3 = f4;
            }
            l46Var.r(false);
            l46Var.r(true);
            int size3 = (list2.size() + 1) / 2;
            j09 j09VarC = b.c(g09Var, 1.0f);
            t7c t7cVarA2 = s7c.a(new uc0(16.0f, true, new qc0(0)), kx0Var, l46Var, 54);
            int iHashCode3 = Long.hashCode(l46Var.T);
            u8a u8aVarM3 = l46Var.m();
            j09 j09VarJ3 = m93.J(l46Var, j09VarC);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var4, l46Var, t7cVarA2);
            dec.l(he2Var3, l46Var, u8aVarM3);
            ib8.s(iHashCode3, l46Var, he2Var2, l46Var);
            dec.l(he2Var, l46Var, j09VarJ3);
            list2 = list;
            List listC1 = s72.c1(list2, size3);
            if (1.0f <= 0.0d) {
                g37.a("invalid weight; must be greater than zero");
            }
            k(0, 48, l46Var, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), listC1);
            List listR0 = s72.r0(list2, size3);
            if (1.0f <= 0.0d) {
                g37.a("invalid weight; must be greater than zero");
            }
            k(size3, 0, l46Var, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), listR0);
            l46Var.r(true);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new h6d(list2, tarotSkinIdentify, z, i, 2);
        }
    }

    public static final void n(List list, TarotSkinIdentify tarotSkinIdentify, boolean z, l46 l46Var, int i) {
        int i2;
        boolean z2;
        float f;
        l46 l46Var2 = l46Var;
        he2 he2Var = hj6.x;
        he2 he2Var2 = hj6.X;
        he2 he2Var3 = hj6.y;
        he2 he2Var4 = hj6.z;
        l46Var2.h0(-529488971);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var2.g(list) : l46Var2.i(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var2.e(tarotSkinIdentify.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= l46Var2.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        } else {
            z2 = z;
        }
        int i3 = i2;
        if (l46Var2.W(i3 & 1, (i3 & 147) != 146)) {
            int size = list.size();
            if (1 > size || size >= 4) {
                f = size == 4 ? 72.0f : 56.0f;
            } else {
                f = 96.0f;
            }
            float f2 = f;
            t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(0)), ndb.y, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var2, g09Var);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z3 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z3) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var4, l46Var2, t7cVarA);
            dec.l(he2Var3, l46Var2, u8aVarM);
            ib8.s(iHashCode, l46Var2, he2Var2, l46Var2);
            Iterator itS = kv2.s(l46Var2, j09VarJ, he2Var, 1031187506, list);
            while (itS.hasNext()) {
                TarotCardChoice tarotCardChoice = (TarotCardChoice) itS.next();
                j09 j09VarP = b.p(g09Var, f2);
                jx0 jx0Var = ndb.Z;
                float f3 = f2;
                c92 c92VarA = a92.a(new uc0(4.0f, true, new qc0(0)), jx0Var, l46Var2, 54);
                int iHashCode2 = Long.hashCode(l46Var2.T);
                u8a u8aVarM2 = l46Var2.m();
                j09 j09VarJ2 = m93.J(l46Var2, j09VarP);
                lf2.q.getClass();
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var4, l46Var2, c92VarA);
                dec.l(he2Var3, l46Var2, u8aVarM2);
                ib8.s(iHashCode2, l46Var2, he2Var2, l46Var2);
                dec.l(he2Var, l46Var2, j09VarJ2);
                l46 l46Var3 = l46Var2;
                g(tarotCardChoice, f3, tarotSkinIdentify, z2, new q6d(((e8b) l46Var2.k(l8b.a)).A), l46Var3, (i3 << 3) & 8064);
                l46Var2 = l46Var3;
                j09 j09VarC = b.c(g09Var, 1.0f);
                c92 c92VarA2 = a92.a(xc0.c, ndb.Y, l46Var2, 0);
                int iHashCode3 = Long.hashCode(l46Var2.T);
                u8a u8aVarM3 = l46Var2.m();
                j09 j09VarJ3 = m93.J(l46Var2, j09VarC);
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var4, l46Var2, c92VarA2);
                dec.l(he2Var3, l46Var2, u8aVarM3);
                ib8.s(iHashCode3, l46Var2, he2Var2, l46Var2);
                dec.l(he2Var, l46Var2, j09VarJ3);
                String tarotCardDesc = tarotCardChoice.getTarotCardDesc();
                String str = (tarotCardDesc == null || v4e.Q(tarotCardDesc)) ? null : tarotCardDesc;
                if (str == null) {
                    l46Var2.f0(-843629105);
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(-843629104);
                    l(3, 48, 0, l46Var2, b.c(g09Var, 1.0f), str);
                    l46Var2.r(false);
                }
                j(tarotCardChoice, b.c(g09Var, 1.0f), jx0Var, l46Var2, 432);
                l46Var2.r(true);
                l46Var2.r(true);
                z2 = z;
                f2 = f3;
                ov7Var = ov7Var;
            }
            l46Var2.r(false);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new h6d(list, tarotSkinIdentify, z, i, 1);
        }
    }

    public static final void o(ShareSummaryContent shareSummaryContent, l46 l46Var, int i) {
        int i2;
        int i3;
        g09 g09Var;
        l46 l46Var2 = l46Var;
        l46Var2.h0(886588542);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? l46Var2.g(shareSummaryContent) : l46Var2.i(shareSummaryContent) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (l46Var2.W(i2 & 1, (i2 & 3) != 2)) {
            g09 g09Var2 = g09.a;
            j09 j09VarD0 = ynb.d0(32.0f, 0.0f, 32.0f, 20.0f, 2, b.c(g09Var2, 1.0f));
            c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarD0);
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
            if (shareSummaryContent == null) {
                l46Var2.f0(2119382269);
                String strQ = afc.q(R.string.loading, l46Var2);
                mue mueVar = oue.a;
                i3 = 0;
                nte.b(strQ, b.c(g09Var2, 1.0f), ((e8b) l46Var2.k(l8b.a)).q, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var2), l46Var, 48, 0, 130040);
                l46Var2 = l46Var;
                l46Var2.r(false);
                g09Var = g09Var2;
            } else {
                i3 = 0;
                l46Var2.f0(2119656371);
                if (v4e.Q(shareSummaryContent.getAdvice())) {
                    l46Var2.f0(2119975578);
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(2119708172);
                    String advice = shareSummaryContent.getAdvice();
                    mue mueVar2 = pue.a;
                    nte.b(advice, b.c(g09Var2, 1.0f), ((e8b) l46Var2.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.p(l46Var2), 0L, 0L, null, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, 0, 0L, null, null, 16777183), l46Var, 48, 0, 131064);
                    l46Var2 = l46Var;
                    l46Var2.r(false);
                }
                if (v4e.Q(shareSummaryContent.getSummary())) {
                    g09Var = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01ea: MOVE (r30v0 'g09Var' g09) = (r28v0 g09) (LINE:491) in method: p6d.o(tech.chatmind.api.ShareSummaryContent, l46, int):void, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r28v0 g09
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 601
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.p6d.o(tech.chatmind.api.ShareSummaryContent, l46, int):void");
                }

                public static final void p(List list, TarotSkinIdentify tarotSkinIdentify, boolean z, l46 l46Var, int i) {
                    int i2;
                    long jB;
                    l46Var.h0(-1952521657);
                    if ((i & 6) == 0) {
                        i2 = ((i & 8) == 0 ? l46Var.g(list) : l46Var.i(list) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i & 48) == 0) {
                        i2 |= l46Var.e(tarotSkinIdentify.ordinal()) ? 32 : 16;
                    }
                    if ((i & 384) == 0) {
                        i2 |= l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
                        y6c y6cVarB = a7c.b(z ? 8.0f : 20.0f);
                        j09 j09VarO = tm7.o(oa7.E(ynb.b0(24.0f, 0.0f, b.c(g09.a, 1.0f), 2), y6cVarB), l8b.i(l46Var), g21.f);
                        float f = z ? 0.5f : 1.0f;
                        if (z) {
                            l46Var.f0(-830166808);
                            jB = l8b.m(l46Var);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(-830109644);
                            jB = y72.b(l8b.k(l46Var), 0.08f);
                            l46Var.r(false);
                        }
                        j09 j09VarB0 = ynb.b0(0.0f, 20.0f, db6.w(j09VarO, f, jB, y6cVarB), 1);
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
                        if (list.size() < 6) {
                            l46Var.f0(-461335545);
                            n(list, tarotSkinIdentify, z, l46Var, i2 & 1022);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(-461256247);
                            m(list, tarotSkinIdentify, z, l46Var, i2 & 1022);
                            l46Var.r(false);
                        }
                        l46Var.r(true);
                    } else {
                        l46Var.Z();
                    }
                    ojb ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new h6d(list, tarotSkinIdentify, z, i, 0);
                    }
                }

                public static final mue q(l46 l46Var) {
                    mue mueVar = pue.a;
                    return mue.a(pue.j(l46Var), 0L, 0L, null, null, 0L, null, 0, w6c.l(10), new iga(), null, 16121855);
                }
            }
