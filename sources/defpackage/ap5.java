package defpackage;

import ai.askquin.R;
import ai.askquin.data.QuotaBlockReason;
import ai.askquin.ui.conversation.ClarifyingCardDrawActionState;
import ai.askquin.ui.conversation.ClarifyingCardSkipActionState;
import ai.askquin.ui.conversation.FailReason;
import ai.askquin.ui.conversation.dialogue.ClarifyingCardState;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ap5 {
    public static final void a(String str, l46 l46Var, int i) {
        l46Var.h0(-1697639833);
        int i2 = i | (l46Var.g(str) ? 4 : 2);
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            mue mueVar = pue.a;
            nte.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, mue.a(pue.d(l46Var), 0L, 0L, null, null, w6c.l(0), null, 0, 0L, null, null, 16777087), l46Var, i2 & 14, 24576, 114686);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o8(str, i, 13);
        }
    }

    public static final void b(String str, boolean z, x16 x16Var, String str2, boolean z2, x16 x16Var2, l46 l46Var, int i) {
        int i2;
        x16 x16Var3;
        l46Var.h0(1331421068);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            x16Var3 = x16Var;
            i2 |= l46Var.i(x16Var3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        } else {
            x16Var3 = x16Var;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.g(str2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.h(z2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var.i(x16Var2) ? 131072 : 65536;
        }
        if (l46Var.W(i2 & 1, (74899 & i2) != 74898)) {
            j09 j09VarC = b.c(g09.a, 1.0f);
            t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(0)), ndb.y, l46Var, 6);
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
            if (1.0f <= 0.0d) {
                g37.a("invalid weight; must be greater than zero");
            }
            cgg.a(x16Var3, b.d(new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 40.0f), z, eze.a(l46Var).a.a, c8b.m(l46Var), null, null, ynb.q(12.0f, 0.0f, 2), af1.b0(-1193223496, new ob0(str, 8), l46Var), l46Var, ((i2 << 3) & 896) | ((i2 >> 6) & 14) | 817889280, 352);
            if (1.0f <= 0.0d) {
                g37.a("invalid weight; must be greater than zero");
            }
            c8b.k(b.d(new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 40.0f), z2, null, c8b.n(l46Var), null, ynb.q(12.0f, 0.0f, 2), false, x16Var2, af1.b0(1973312094, new ob0(str2, 9), l46Var), l46Var, ((i2 >> 9) & 112) | 100859904 | ((i2 << 6) & 29360128), 84);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new g91(str, z, x16Var, str2, z2, x16Var2, i);
        }
    }

    public static final void c(int i, x16 x16Var, x16 x16Var2, l46 l46Var, boolean z) {
        int i2;
        char c;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-331518643);
        if ((i & 6) == 0) {
            i2 = (l46Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var2.i(x16Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var2.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var2.W(i2 & 1, (i2 & 147) != 146)) {
            pr4 pr4Var = l8b.a;
            x4d x4dVarB = k8b.f((e8b) l46Var2.k(pr4Var)) ? g21.f : a7c.b(12.0f);
            g09 g09Var = g09.a;
            j09 j09VarZ = ynb.Z(tm7.o(b.c(g09Var, 1.0f), y72.b(((e8b) l46Var2.k(pr4Var)).k, 0.12f), x4dVarB), 12.0f);
            c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarZ);
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
            dec.l(he2Var, l46Var2, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(0)), ndb.z, l46Var2, 54);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, g09Var);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, t7cVarA);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            gx6 gx6VarB = ym8.l;
            if (gx6VarB != null) {
                c = 0;
            } else {
                fx6 fx6Var = new fx6("Outlined.ErrorOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i3 = msf.a;
                dtd dtdVar = new dtd(y72.b);
                s71 s71Var = new s71(1);
                s71Var.p(11.0f, 15.0f);
                s71Var.m(2.0f);
                s71Var.t(2.0f);
                s71Var.m(-2.0f);
                s71Var.t(-2.0f);
                s71Var.h();
                s71Var.p(11.0f, 7.0f);
                s71Var.m(2.0f);
                s71Var.t(6.0f);
                s71Var.m(-2.0f);
                s71Var.n(11.0f, 7.0f);
                s71Var.h();
                s71Var.p(11.99f, 2.0f);
                s71Var.i(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                s71Var.r(4.47f, 10.0f, 9.99f, 10.0f);
                s71Var.i(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
                s71Var.q(17.52f, 2.0f, 11.99f, 2.0f);
                s71Var.h();
                s71Var.p(12.0f, 20.0f);
                s71Var.j(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
                c = 0;
                s71Var.r(3.58f, -8.0f, 8.0f, -8.0f);
                s71Var.r(8.0f, 3.58f, 8.0f, 8.0f);
                s71Var.r(-3.58f, 8.0f, -8.0f, 8.0f);
                s71Var.h();
                fx6.a(fx6Var, s71Var.b, dtdVar, 1.0f, 1.0f, 2, 1.0f);
                gx6VarB = fx6Var.b();
                ym8.l = gx6VarB;
            }
            gu6.a(gx6VarB, null, b.l(g09Var, 20.0f), ((e8b) l46Var2.k(pr4Var)).k, l46Var2, 432, 0);
            String strQ = afc.q(R.string.follow_up_clarifying_error, l46Var2);
            mue mueVar = pue.a;
            nte.b(strQ, null, ((e8b) l46Var2.k(pr4Var)).k, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.d(l46Var2), 0L, 0L, null, null, w6c.l(0), null, 0, 0L, null, null, 16777087), l46Var, 0, 0, 131066);
            l46Var.r(true);
            j09 j09VarC = b.c(g09Var, 1.0f);
            t7c t7cVarA2 = s7c.a(new uc0(8.0f, true, new qc0(0)), ndb.y, l46Var, 6);
            int iHashCode3 = Long.hashCode(l46Var.T);
            u8a u8aVarM3 = l46Var.m();
            j09 j09VarJ3 = m93.J(l46Var, j09VarC);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, t7cVarA2);
            dec.l(he2Var2, l46Var, u8aVarM3);
            ib8.s(iHashCode3, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ3);
            if (1.0f <= 0.0d) {
                g37.a("invalid weight; must be greater than zero");
            }
            boolean z3 = !z;
            c8b.k(b.d(new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 40.0f), z3, null, c8b.n(l46Var), null, ynb.q(12.0f, 0.0f, 2), false, x16Var, t72.e, l46Var, ((i2 << 18) & 29360128) | 100859904, 84);
            if (1.0f <= 0.0d) {
                g37.a("invalid weight; must be greater than zero");
            }
            l46Var2 = l46Var;
            c8b.k(b.d(new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 40.0f), z3, null, c8b.n(l46Var), null, ynb.q(12.0f, 0.0f, 2), false, x16Var2, t72.f, l46Var2, ((i2 << 15) & 29360128) | 100859904, 84);
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new e21(z, x16Var, x16Var2, i, 3);
        }
    }

    public static final void d(TarotCardChoice tarotCardChoice, x16 x16Var, l46 l46Var, int i) {
        l46Var.h0(929746946);
        int i2 = (l46Var.g(tarotCardChoice) ? 4 : 2) | i | (l46Var.i(x16Var) ? 32 : 16);
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            g09 g09Var = g09.a;
            j09 j09VarC = b.c(g09Var, 1.0f);
            c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Y, l46Var, 54);
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
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            o7c.d(androidx.compose.foundation.b.c(dj6.w(b.p(g09Var, 80.0f), snd.b(null, l46Var, 1)), false, null, null, x16Var, 15), q7c.r(tarotCardChoice), null, false, an2.d, eze.a(l46Var).a.f, null, false, l46Var, 24576, 204);
            cgg.c(b.p(g09Var, 80.0f), tarotCardChoice, l46Var, ((i2 << 3) & 112) | 6, 0);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o14(tarotCardChoice, x16Var, i, 17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:301:0x073d  */
    /* JADX WARN: Code duplicated, block: B:302:0x0749  */
    /* JADX WARN: Code duplicated, block: B:304:0x0753  */
    /* JADX WARN: Code duplicated, block: B:305:0x0755  */
    /* JADX WARN: Code duplicated, block: B:308:0x075c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:309:0x075e  */
    /* JADX WARN: Code duplicated, block: B:312:0x076c  */
    /* JADX WARN: Code duplicated, block: B:313:0x076e  */
    /* JADX WARN: Code duplicated, block: B:316:0x0775 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:317:0x0777  */
    /* JADX WARN: Code duplicated, block: B:320:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:321:0x07b6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v41, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v42 */
    public static final void e(final String str, final ClarifyingCardState clarifyingCardState, final TarotCardChoice tarotCardChoice, final TarotCardChoice tarotCardChoice2, final ClarifyingCardDrawActionState clarifyingCardDrawActionState, final ClarifyingCardSkipActionState clarifyingCardSkipActionState, final QuotaBlockReason quotaBlockReason, ip5 ip5Var, final x16 x16Var, final x16 x16Var2, final x16 x16Var3, a26 a26Var, a26 a26Var2, final j09 j09Var, l46 l46Var, final int i) {
        final ip5 ip5Var2;
        final a26 a26Var3;
        a26 a26Var4;
        l46 l46Var2;
        x4d x4dVar;
        boolean z;
        long jB;
        long jG;
        QuotaBlockReason quotaBlockReason2;
        boolean z2;
        long jA;
        int i2;
        l46 l46Var3;
        int i3;
        int i4;
        FailReason failReason;
        boolean z3;
        g09 g09Var;
        int i5;
        g09 g09Var2;
        l46 l46Var4;
        int i6;
        boolean z4;
        Object obj;
        boolean z5;
        Object obj2;
        l46 l46Var5;
        boolean z6;
        l46 l46Var6;
        l46 l46Var7;
        int i7;
        ?? r8;
        Object obj3;
        Object obj4;
        l46 l46Var8 = l46Var;
        str.getClass();
        clarifyingCardState.getClass();
        clarifyingCardDrawActionState.getClass();
        clarifyingCardSkipActionState.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        a26Var.getClass();
        a26Var2.getClass();
        l46Var8.h0(-1429695700);
        int i8 = i | (l46Var8.g(str) ? 4 : 2) | (l46Var8.e(clarifyingCardState.ordinal()) ? 32 : 16);
        boolean zG = l46Var8.g(tarotCardChoice);
        int i9 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        int i10 = i8 | (zG ? 256 : 128);
        boolean zG2 = l46Var8.g(tarotCardChoice2);
        int i11 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        int i12 = i10 | (zG2 ? 2048 : 1024) | (l46Var8.g(clarifyingCardDrawActionState) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var8.g(clarifyingCardSkipActionState) ? 131072 : 65536) | (l46Var8.e(quotaBlockReason == null ? -1 : quotaBlockReason.ordinal()) ? 1048576 : 524288) | (l46Var8.g(ip5Var) ? 8388608 : 4194304) | (l46Var8.i(x16Var) ? 67108864 : 33554432) | (l46Var8.i(x16Var2) ? 536870912 : 268435456);
        int i13 = (l46Var8.i(x16Var3) ? 4 : 2) | (l46Var8.i(a26Var) ? 32 : 16);
        if (l46Var8.i(a26Var2)) {
            i9 = 256;
        }
        int i14 = i13 | i9;
        if (l46Var8.g(j09Var)) {
            i11 = 2048;
        }
        int i15 = i14 | i11;
        if (l46Var8.W(i12 & 1, ((i12 & 306783379) == 306783378 && (i15 & 1171) == 1170) ? false : true)) {
            boolean zF = k8b.f((e8b) l46Var8.k(l8b.a));
            if (zF) {
                l46Var8.f0(451986778);
                l46Var8.r(false);
                x4dVar = g21.f;
            } else {
                l46Var8.f0(451987858);
                x4dVar = eze.a(l46Var8).a.j;
                l46Var8.r(false);
            }
            if (zF) {
                l46Var8.f0(1126768956);
                long jH = l8b.h(l46Var8);
                l46Var8.r(false);
                z = zF;
                jB = jH;
            } else {
                l46Var8.f0(1126801506);
                z = zF;
                jB = y72.b(l8b.g(l46Var8), 0.48f);
                l46Var8.r(false);
            }
            float f = z ? 1.0f : 0.5f;
            if (z) {
                l46Var8.f0(451995682);
                jG = l8b.m(l46Var8);
            } else {
                l46Var8.f0(451996795);
                jG = l8b.g(l46Var8);
            }
            l46Var8.r(false);
            q11 q11VarB = x57.b(jG, f);
            boolean z7 = clarifyingCardDrawActionState instanceof ClarifyingCardDrawActionState.Failed;
            ClarifyingCardDrawActionState.Failed failed = z7 ? (ClarifyingCardDrawActionState.Failed) clarifyingCardDrawActionState : null;
            FailReason reason = failed != null ? failed.getReason() : null;
            FailReason.UsageBlocked usageBlocked = reason instanceof FailReason.UsageBlocked ? (FailReason.UsageBlocked) reason : null;
            QuotaBlockReason reason2 = usageBlocked != null ? usageBlocked.getReason() : null;
            QuotaBlockReason quotaBlockReason3 = reason2 == null ? quotaBlockReason : reason2;
            if (reason2 == null) {
                quotaBlockReason2 = clarifyingCardState == ClarifyingCardState.PendingDecision ? quotaBlockReason : null;
            } else {
                quotaBlockReason2 = reason2;
            }
            boolean z8 = clarifyingCardSkipActionState instanceof ClarifyingCardSkipActionState.Loading;
            String strQ = afc.q(clarifyingCardSkipActionState instanceof ClarifyingCardSkipActionState.Failed ? R.string.button_retry : R.string.additional_info_skip, l46Var8);
            boolean z9 = clarifyingCardDrawActionState instanceof ClarifyingCardDrawActionState.Loading;
            boolean z10 = z9 || z8;
            ClarifyingCardDrawActionState.Failed failed2 = z7 ? (ClarifyingCardDrawActionState.Failed) clarifyingCardDrawActionState : null;
            FailReason reason3 = failed2 != null ? failed2.getReason() : null;
            ClarifyingCardState clarifyingCardState2 = ClarifyingCardState.Drawing;
            boolean z11 = clarifyingCardState == clarifyingCardState2 && tarotCardChoice2 != null && z9;
            QuotaBlockReason quotaBlockReason4 = quotaBlockReason3;
            j09 j09VarC = b.c(j09Var, 1.0f);
            boolean z12 = z10;
            uc0 uc0Var = new uc0(12.0f, true, new qc0(0));
            jx0 jx0Var = ndb.Y;
            c92 c92VarA = a92.a(uc0Var, jx0Var, l46Var8, 6);
            int iHashCode = Long.hashCode(l46Var8.T);
            u8a u8aVarM = l46Var8.m();
            j09 j09VarJ = m93.J(l46Var8, j09VarC);
            lf2.q.getClass();
            l46Var8.j0();
            boolean z13 = l46Var8.S;
            x16 x16Var4 = LayoutNode.h1;
            if (z13) {
                l46Var8.l(x16Var4);
            } else {
                l46Var8.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var8, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var8, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            FailReason failReason2 = reason3;
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var8, numValueOf);
            dec.k(l46Var8);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var8, j09VarJ);
            g09 g09Var3 = g09.a;
            QuotaBlockReason quotaBlockReason5 = reason2;
            j09 j09VarZ = ynb.Z(db6.x(tm7.o(b.c(g09Var3, 1.0f), jB, x4dVar), q11VarB.a, q11VarB.b, x4dVar), 20.0f);
            c92 c92VarA2 = a92.a(new uc0(12.0f, true, new qc0(0)), jx0Var, l46Var8, 6);
            int iHashCode2 = Long.hashCode(l46Var8.T);
            u8a u8aVarM2 = l46Var8.m();
            j09 j09VarJ2 = m93.J(l46Var8, j09VarZ);
            l46Var8.j0();
            if (l46Var8.S) {
                l46Var8.l(x16Var4);
            } else {
                l46Var8.s0();
            }
            dec.l(he2Var, l46Var8, c92VarA2);
            dec.l(he2Var2, l46Var8, u8aVarM2);
            ib8.s(iHashCode2, l46Var8, he2Var3, l46Var8);
            dec.l(he2Var4, l46Var8, j09VarJ2);
            j09 j09VarC2 = b.c(g09Var3, 1.0f);
            t7c t7cVarA = s7c.a(xc0.g, ndb.z, l46Var8, 54);
            int iHashCode3 = Long.hashCode(l46Var8.T);
            u8a u8aVarM3 = l46Var8.m();
            j09 j09VarJ3 = m93.J(l46Var8, j09VarC2);
            l46Var8.j0();
            if (l46Var8.S) {
                l46Var8.l(x16Var4);
            } else {
                l46Var8.s0();
            }
            dec.l(he2Var, l46Var8, t7cVarA);
            dec.l(he2Var2, l46Var8, u8aVarM3);
            ib8.s(iHashCode3, l46Var8, he2Var3, l46Var8);
            dec.l(he2Var4, l46Var8, j09VarJ3);
            String strQ2 = afc.q(R.string.follow_up_clarifying_title, l46Var8);
            mue mueVar = pue.a;
            mue mueVarA = mue.a(pue.d(l46Var8), 0L, 0L, null, null, w6c.l(0), null, 0, 0L, null, null, 16777087);
            if (z) {
                l46Var8.f0(-71548245);
                jA = l8b.e(l46Var8);
                z2 = false;
            } else {
                z2 = false;
                l46Var8.f0(-71547351);
                jA = l8b.a(l46Var8);
            }
            l46Var8.r(z2);
            nte.b(strQ2, null, jA, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarA, l46Var8, 0, 0, 131066);
            l46 l46Var9 = l46Var8;
            ClarifyingCardState clarifyingCardState3 = ClarifyingCardState.Skipped;
            if (clarifyingCardState == clarifyingCardState3) {
                l46Var9.f0(2077091766);
                nte.b(afc.q(R.string.follow_up_clarifying_skipped, l46Var9), null, l8b.e(l46Var9), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.g(l46Var9), 0L, 0L, null, null, w6c.l(0), null, 0, 0L, null, null, 16777087), l46Var9, 0, 0, 131066);
                l46 l46Var10 = l46Var9;
                i2 = 0;
                l46Var10.r(false);
                l46Var3 = l46Var10;
            } else {
                i2 = 0;
                l46Var9.f0(2077301574);
                l46Var9.r(false);
                l46Var3 = l46Var9;
            }
            l46Var3.r(true);
            l46 l46Var11 = l46Var3;
            nte.b(str, null, l8b.b(l46Var3), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.c(l46Var3), 0L, 0L, null, null, w6c.l(i2), null, 0, 0L, null, null, 16777087), l46Var11, i12 & 14, 0, 131066);
            l46 l46Var12 = l46Var11;
            Object obj5 = sf2.a;
            if (quotaBlockReason5 == null || clarifyingCardState == ClarifyingCardState.Stale) {
                a26Var3 = a26Var2;
                i3 = i15;
                i4 = 32;
                if (failReason2 != null) {
                    failReason = failReason2;
                    if ((failReason.equals(FailReason.Network.INSTANCE) || (failReason instanceof FailReason.IllegalContent)) && clarifyingCardState != ClarifyingCardState.Stale) {
                        l46Var12.f0(1339918077);
                        c(((i3 << 3) & 112) | ((i12 >> 21) & 896), x16Var3, x16Var2, l46Var12, z12);
                        z3 = false;
                        l46Var12.r(false);
                        a26Var4 = a26Var;
                    }
                    g09Var = g09Var3;
                    l46Var6 = l46Var12;
                    i5 = i4;
                    l46Var4 = l46Var6;
                    l46Var4.r(true);
                    if (quotaBlockReason2 == null) {
                        l46Var4.f0(125688256);
                        l46Var4.r(z3);
                        ip5Var2 = ip5Var;
                    } else {
                        l46Var4.f0(125688257);
                        i6 = i3 & 112;
                        if (i6 == i5) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        Object objR = l46Var4.R();
                        obj = objR;
                        if (z4 || objR == obj5) {
                            Object zh1Var = new zh1(a26Var4, 14);
                            l46Var4.p0(zh1Var);
                            obj = zh1Var;
                        }
                        x16 x16Var5 = (x16) obj;
                        if (i6 == i5) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        Object objR2 = l46Var4.R();
                        obj2 = objR2;
                        if (z5 || objR2 == obj5) {
                            Object zh1Var2 = new zh1(a26Var4, 15);
                            l46Var4.p0(zh1Var2);
                            obj2 = zh1Var2;
                        }
                        ip5Var2 = ip5Var;
                        feg.e(quotaBlockReason2, x16Var5, (x16) obj2, b.c(g09Var, 1.0f), ip5Var2.a, ip5Var2.b, ip5Var2.c, l46Var, 3072);
                        l46 l46Var13 = l46Var;
                        z3 = false;
                        l46Var13.r(false);
                        l46Var5 = l46Var13;
                    }
                    if (z11) {
                        l46Var5 = l46Var4;
                        l46Var5.f0(126198517);
                        z6 = true;
                        jgb.b(null, t72.d, l46Var5, 48, 1);
                        l46Var5.r(z3);
                    } else {
                        l46Var5 = l46Var4;
                        z6 = true;
                        l46Var5.f0(126251372);
                        l46Var5.r(z3);
                    }
                    l46Var5.r(z6);
                    l46Var2 = l46Var5;
                } else {
                    failReason = failReason2;
                }
                if (failReason == null || clarifyingCardState == ClarifyingCardState.Stale) {
                    a26Var4 = a26Var;
                    wef wefVar = wef.a;
                    if (clarifyingCardState == clarifyingCardState2) {
                        l46Var12.f0(1340752442);
                        final TarotCardChoice tarotCardChoice3 = tarotCardChoice == null ? tarotCardChoice2 : tarotCardChoice;
                        if (tarotCardChoice3 == null) {
                            l46Var12.f0(1340773986);
                            z3 = false;
                            l46Var12.r(false);
                            wefVar = null;
                        } else {
                            l46Var12.f0(1340773987);
                            boolean zG3 = ((i3 & 896) == 256) | l46Var12.g(tarotCardChoice3);
                            Object objR3 = l46Var12.R();
                            Object obj6 = objR3;
                            if (zG3 || objR3 == obj5) {
                                final int i16 = 2;
                                Object obj7 = new x16() { // from class: yo5
                                    @Override // defpackage.x16
                                    public final Object invoke() {
                                        int i17 = i16;
                                        wef wefVar2 = wef.a;
                                        TarotCardChoice tarotCardChoice4 = tarotCardChoice3;
                                        a26 a26Var5 = a26Var3;
                                        switch (i17) {
                                            case 0:
                                                a26Var5.d(tarotCardChoice4);
                                                break;
                                            case 1:
                                                a26Var5.d(tarotCardChoice4);
                                                break;
                                            case 2:
                                                a26Var5.d(tarotCardChoice4);
                                                break;
                                            case 3:
                                                a26Var5.d(tarotCardChoice4);
                                                break;
                                            default:
                                                a26Var5.d(tarotCardChoice4);
                                                break;
                                        }
                                        return wefVar2;
                                    }
                                };
                                l46Var12.p0(obj7);
                                obj6 = obj7;
                            }
                            z3 = false;
                            d(tarotCardChoice3, (x16) obj6, l46Var12, 0);
                            l46Var12.r(false);
                        }
                        if (wefVar == null) {
                            l46Var12.f0(1428727182);
                            jgb.B(null, l46Var12, z3 ? 1 : 0);
                        } else {
                            l46Var12.f0(1428723400);
                        }
                        l46Var12.r(z3);
                        l46Var12.r(z3);
                    } else {
                        z3 = false;
                        ClarifyingCardState clarifyingCardState4 = ClarifyingCardState.Interpreting;
                        if (clarifyingCardState == clarifyingCardState4 && tarotCardChoice == null) {
                            l46Var12.f0(1340979300);
                            if (tarotCardChoice2 == null) {
                                l46Var12.f0(1340991234);
                                l46Var12.r(false);
                                wefVar = null;
                            } else {
                                l46Var12.f0(1340991235);
                                boolean zG4 = ((i3 & 896) == 256) | l46Var12.g(tarotCardChoice2);
                                Object objR4 = l46Var12.R();
                                Object obj8 = objR4;
                                if (zG4 || objR4 == obj5) {
                                    final int i17 = 3;
                                    Object obj9 = new x16() { // from class: yo5
                                        @Override // defpackage.x16
                                        public final Object invoke() {
                                            int i18 = i17;
                                            wef wefVar2 = wef.a;
                                            TarotCardChoice tarotCardChoice4 = tarotCardChoice2;
                                            a26 a26Var5 = a26Var3;
                                            switch (i18) {
                                                case 0:
                                                    a26Var5.d(tarotCardChoice4);
                                                    break;
                                                case 1:
                                                    a26Var5.d(tarotCardChoice4);
                                                    break;
                                                case 2:
                                                    a26Var5.d(tarotCardChoice4);
                                                    break;
                                                case 3:
                                                    a26Var5.d(tarotCardChoice4);
                                                    break;
                                                default:
                                                    a26Var5.d(tarotCardChoice4);
                                                    break;
                                            }
                                            return wefVar2;
                                        }
                                    };
                                    l46Var12.p0(obj9);
                                    obj8 = obj9;
                                }
                                z3 = false;
                                d(tarotCardChoice2, (x16) obj8, l46Var12, 0);
                                l46Var12.r(false);
                            }
                            if (wefVar == null) {
                                l46Var12.f0(1428734190);
                                jgb.B(null, l46Var12, z3 ? 1 : 0);
                            } else {
                                l46Var12.f0(1428730718);
                            }
                            l46Var12.r(z3);
                            l46Var12.r(z3);
                        } else if (clarifyingCardState == clarifyingCardState4 || clarifyingCardState == ClarifyingCardState.Completed) {
                            g09Var = g09Var3;
                            i5 = 32;
                            z3 = false;
                            l46Var12.f0(1428738719);
                            if (tarotCardChoice == null) {
                                l46Var12.f0(1341227330);
                                l46Var12.r(false);
                            } else {
                                l46Var12.f0(1341227331);
                                boolean zG5 = ((i3 & 896) == 256) | l46Var12.g(tarotCardChoice);
                                Object objR5 = l46Var12.R();
                                Object obj10 = objR5;
                                if (zG5 || objR5 == obj5) {
                                    final int i18 = 4;
                                    Object obj11 = new x16() { // from class: yo5
                                        @Override // defpackage.x16
                                        public final Object invoke() {
                                            int i19 = i18;
                                            wef wefVar2 = wef.a;
                                            TarotCardChoice tarotCardChoice4 = tarotCardChoice;
                                            a26 a26Var5 = a26Var3;
                                            switch (i19) {
                                                case 0:
                                                    a26Var5.d(tarotCardChoice4);
                                                    break;
                                                case 1:
                                                    a26Var5.d(tarotCardChoice4);
                                                    break;
                                                case 2:
                                                    a26Var5.d(tarotCardChoice4);
                                                    break;
                                                case 3:
                                                    a26Var5.d(tarotCardChoice4);
                                                    break;
                                                default:
                                                    a26Var5.d(tarotCardChoice4);
                                                    break;
                                            }
                                            return wefVar2;
                                        }
                                    };
                                    l46Var12.p0(obj11);
                                    obj10 = obj11;
                                }
                                z3 = false;
                                d(tarotCardChoice, (x16) obj10, l46Var12, 0);
                                l46Var12.r(false);
                            }
                            l46Var12.r(z3);
                            l46Var4 = l46Var12;
                        } else {
                            ClarifyingCardState clarifyingCardState5 = ClarifyingCardState.PendingDecision;
                            if (clarifyingCardState == clarifyingCardState5 || clarifyingCardState == ClarifyingCardState.Stale) {
                                l46Var12.f0(1341438038);
                                boolean z14 = clarifyingCardState == clarifyingCardState5 && !z12;
                                g09Var = g09Var3;
                                i5 = 32;
                                b(afc.q(R.string.follow_up_clarifying_draw, l46Var12), z14 && quotaBlockReason4 != QuotaBlockReason.DailyLimit, x16Var, strQ, z14, x16Var2, l46Var12, ((i12 >> 18) & 896) | (458752 & (i12 >> 12)));
                                z3 = false;
                                l46Var12.r(false);
                                l46Var4 = l46Var12;
                            } else if (clarifyingCardState == clarifyingCardState3) {
                                l46Var12.f0(1428761380);
                                z3 = false;
                                l46Var12.r(false);
                            } else {
                                z3 = false;
                                l46Var12.f0(1341941602);
                                l46Var12.r(false);
                            }
                        }
                    }
                    g09Var = g09Var3;
                    l46Var6 = l46Var12;
                    i5 = i4;
                    l46Var4 = l46Var6;
                } else {
                    l46Var12.f0(1340178353);
                    if (tarotCardChoice2 == null) {
                        l46Var12.f0(1340189698);
                        l46Var12.r(false);
                    } else {
                        l46Var12.f0(1340189699);
                        boolean zG6 = ((i3 & 896) == 256) | l46Var12.g(tarotCardChoice2);
                        Object objR6 = l46Var12.R();
                        Object obj12 = objR6;
                        if (zG6 || objR6 == obj5) {
                            final int i19 = 1;
                            Object obj13 = new x16() { // from class: yo5
                                @Override // defpackage.x16
                                public final Object invoke() {
                                    int i110 = i19;
                                    wef wefVar2 = wef.a;
                                    TarotCardChoice tarotCardChoice4 = tarotCardChoice2;
                                    a26 a26Var5 = a26Var3;
                                    switch (i110) {
                                        case 0:
                                            a26Var5.d(tarotCardChoice4);
                                            break;
                                        case 1:
                                            a26Var5.d(tarotCardChoice4);
                                            break;
                                        case 2:
                                            a26Var5.d(tarotCardChoice4);
                                            break;
                                        case 3:
                                            a26Var5.d(tarotCardChoice4);
                                            break;
                                        default:
                                            a26Var5.d(tarotCardChoice4);
                                            break;
                                    }
                                    return wefVar2;
                                }
                            };
                            l46Var12.p0(obj13);
                            obj12 = obj13;
                        }
                        d(tarotCardChoice2, (x16) obj12, l46Var12, 0);
                        l46Var12.r(false);
                    }
                    g09Var2 = g09Var3;
                    a26Var4 = a26Var;
                    cgg.a(x16Var3, b.d(b.c(g09Var3, 1.0f), 40.0f), false, eze.a(l46Var12).a.a, c8b.m(l46Var12), null, null, ynb.q(20.0f, 0.0f, 2), t72.c, l46Var, (i3 & 14) | 817889328, 356);
                    l46 l46Var14 = l46Var;
                    z3 = false;
                    l46Var14.r(false);
                    l46Var7 = l46Var14;
                }
                l46Var4.r(true);
                if (quotaBlockReason2 == null) {
                    l46Var4.f0(125688256);
                    l46Var4.r(z3);
                    ip5Var2 = ip5Var;
                } else {
                    l46Var4.f0(125688257);
                    i6 = i3 & 112;
                    if (i6 == i5) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    Object objR7 = l46Var4.R();
                    obj = objR7;
                    if (z4) {
                        Object zh1Var3 = new zh1(a26Var4, 14);
                        l46Var4.p0(zh1Var3);
                        obj = zh1Var3;
                    } else {
                        Object zh1Var4 = new zh1(a26Var4, 14);
                        l46Var4.p0(zh1Var4);
                        obj = zh1Var4;
                    }
                    x16 x16Var6 = (x16) obj;
                    if (i6 == i5) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    Object objR8 = l46Var4.R();
                    obj2 = objR8;
                    if (z5) {
                        Object zh1Var5 = new zh1(a26Var4, 15);
                        l46Var4.p0(zh1Var5);
                        obj2 = zh1Var5;
                    } else {
                        Object zh1Var6 = new zh1(a26Var4, 15);
                        l46Var4.p0(zh1Var6);
                        obj2 = zh1Var6;
                    }
                    ip5Var2 = ip5Var;
                    feg.e(quotaBlockReason2, x16Var6, (x16) obj2, b.c(g09Var, 1.0f), ip5Var2.a, ip5Var2.b, ip5Var2.c, l46Var, 3072);
                    l46 l46Var15 = l46Var;
                    z3 = false;
                    l46Var15.r(false);
                    l46Var5 = l46Var15;
                }
                if (z11) {
                    l46Var5 = l46Var4;
                    l46Var5.f0(126198517);
                    z6 = true;
                    jgb.b(null, t72.d, l46Var5, 48, 1);
                    l46Var5.r(z3);
                } else {
                    l46Var5 = l46Var4;
                    z6 = true;
                    l46Var5.f0(126251372);
                    l46Var5.r(z3);
                }
                l46Var5.r(z6);
                l46Var2 = l46Var5;
            } else {
                l46Var12.f0(1339268193);
                if (tarotCardChoice2 == null) {
                    l46Var12.f0(1339279042);
                    l46Var12.r(false);
                    a26Var3 = a26Var2;
                    i7 = i15;
                } else {
                    l46Var12.f0(1339279043);
                    i7 = i15;
                    boolean zG7 = ((i7 & 896) == 256) | l46Var12.g(tarotCardChoice2);
                    Object objR9 = l46Var12.R();
                    if (zG7 || objR9 == obj5) {
                        a26Var3 = a26Var2;
                        r8 = 0;
                        final boolean z15 = false ? 1 : 0;
                        Object obj14 = new x16() { // from class: yo5
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i110 = z15;
                                wef wefVar2 = wef.a;
                                TarotCardChoice tarotCardChoice4 = tarotCardChoice2;
                                a26 a26Var5 = a26Var3;
                                switch (i110) {
                                    case 0:
                                        a26Var5.d(tarotCardChoice4);
                                        break;
                                    case 1:
                                        a26Var5.d(tarotCardChoice4);
                                        break;
                                    case 2:
                                        a26Var5.d(tarotCardChoice4);
                                        break;
                                    case 3:
                                        a26Var5.d(tarotCardChoice4);
                                        break;
                                    default:
                                        a26Var5.d(tarotCardChoice4);
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var12.p0(obj14);
                        obj3 = obj14;
                    } else {
                        a26Var3 = a26Var2;
                        r8 = 0;
                        obj3 = objR9;
                    }
                    d(tarotCardChoice2, (x16) obj3, l46Var12, r8);
                    l46Var12.r(r8);
                }
                String strQ3 = afc.q(R.string.follow_up_clarifying_view_reading, l46Var12);
                boolean z16 = (quotaBlockReason5 == QuotaBlockReason.DailyLimit || z8) ? false : true;
                boolean zE = ((i7 & 112) == 32) | l46Var12.e(quotaBlockReason5.ordinal());
                Object objR10 = l46Var12.R();
                if (zE || objR10 == obj5) {
                    a26Var4 = a26Var;
                    Object jt3Var = new jt3(21, a26Var4, quotaBlockReason5);
                    l46Var12.p0(jt3Var);
                    obj4 = jt3Var;
                } else {
                    a26Var4 = a26Var;
                    obj4 = objR10;
                }
                i3 = i7;
                i4 = 32;
                g09Var2 = g09Var3;
                b(strQ3, z16, (x16) obj4, strQ, !z8, x16Var2, l46Var12, (i12 >> 12) & 458752);
                z3 = false;
                l46Var12.r(false);
                l46Var7 = l46Var12;
            }
            g09Var = g09Var2;
            l46Var6 = l46Var7;
            i5 = i4;
            l46Var4 = l46Var6;
            l46Var4.r(true);
            if (quotaBlockReason2 == null) {
                l46Var4.f0(125688256);
                l46Var4.r(z3);
                ip5Var2 = ip5Var;
            } else {
                l46Var4.f0(125688257);
                i6 = i3 & 112;
                if (i6 == i5) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Object objR11 = l46Var4.R();
                obj = objR11;
                if (z4) {
                    Object zh1Var7 = new zh1(a26Var4, 14);
                    l46Var4.p0(zh1Var7);
                    obj = zh1Var7;
                } else {
                    Object zh1Var8 = new zh1(a26Var4, 14);
                    l46Var4.p0(zh1Var8);
                    obj = zh1Var8;
                }
                x16 x16Var7 = (x16) obj;
                if (i6 == i5) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                Object objR12 = l46Var4.R();
                obj2 = objR12;
                if (z5) {
                    Object zh1Var9 = new zh1(a26Var4, 15);
                    l46Var4.p0(zh1Var9);
                    obj2 = zh1Var9;
                } else {
                    Object zh1Var10 = new zh1(a26Var4, 15);
                    l46Var4.p0(zh1Var10);
                    obj2 = zh1Var10;
                }
                ip5Var2 = ip5Var;
                feg.e(quotaBlockReason2, x16Var7, (x16) obj2, b.c(g09Var, 1.0f), ip5Var2.a, ip5Var2.b, ip5Var2.c, l46Var, 3072);
                l46 l46Var16 = l46Var;
                z3 = false;
                l46Var16.r(false);
                l46Var5 = l46Var16;
            }
            if (z11) {
                l46Var5 = l46Var4;
                l46Var5.f0(126198517);
                z6 = true;
                jgb.b(null, t72.d, l46Var5, 48, 1);
                l46Var5.r(z3);
            } else {
                l46Var5 = l46Var4;
                z6 = true;
                l46Var5.f0(126251372);
                l46Var5.r(z3);
            }
            l46Var5.r(z6);
            l46Var2 = l46Var5;
        } else {
            ip5Var2 = ip5Var;
            a26Var3 = a26Var2;
            a26Var4 = a26Var;
            l46Var8.Z();
            l46Var2 = l46Var8;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            final a26 a26Var5 = a26Var3;
            final a26 a26Var6 = a26Var4;
            ojbVarV.d = new l26(str, clarifyingCardState, tarotCardChoice, tarotCardChoice2, clarifyingCardDrawActionState, clarifyingCardSkipActionState, quotaBlockReason, ip5Var2, x16Var, x16Var2, x16Var3, a26Var6, a26Var5, j09Var, i) { // from class: zo5
                public final /* synthetic */ a26 X;
                public final /* synthetic */ j09 Y;
                public final /* synthetic */ String a;
                public final /* synthetic */ ClarifyingCardState b;
                public final /* synthetic */ TarotCardChoice c;
                public final /* synthetic */ TarotCardChoice d;
                public final /* synthetic */ ClarifyingCardDrawActionState e;
                public final /* synthetic */ ClarifyingCardSkipActionState f;
                public final /* synthetic */ QuotaBlockReason g;
                public final /* synthetic */ ip5 v;
                public final /* synthetic */ x16 w;
                public final /* synthetic */ x16 x;
                public final /* synthetic */ x16 y;
                public final /* synthetic */ a26 z;

                @Override // defpackage.l26
                public final Object z(Object obj15, Object obj16) {
                    ((Integer) obj16).getClass();
                    int iP = k99.P(1);
                    ap5.e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, this.z, this.X, this.Y, (l46) obj15, iP);
                    return wef.a;
                }
            };
        }
    }
}
