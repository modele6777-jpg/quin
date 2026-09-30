package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import tech.chatmind.api.RecommendQuestion;
import tech.chatmind.api.RecommendQuestionType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class njb {
    public static final /* synthetic */ int a = 0;

    static {
        t72.I(new RecommendQuestion(RecommendQuestionType.CURRENT_STATE, "他现在还在意我吗？"), new RecommendQuestion(RecommendQuestionType.WHAT_TO_DO, "我该主动联系他吗？"), new RecommendQuestion(RecommendQuestionType.CARD_MEANING, "恶魔牌是什么意思？"));
    }

    public static final void a(int i, x16 x16Var, l46 l46Var, String str, boolean z) {
        ojb ojbVarV;
        ku7 ku7Var;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1255182301);
        int i2 = i | (l46Var.g(str) ? 4 : 2) | (l46Var2.i(x16Var) ? 32 : 16) | (l46Var2.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var2.W(i2 & 1, (i2 & 147) != 146)) {
            pr4 pr4Var = l8b.a;
            if (k8b.f((e8b) l46Var2.k(pr4Var))) {
                l46Var2.f0(-1150469507);
                int i3 = i2 << 3;
                wle.b(null, str, false, null, null, null, null, null, null, ynb.q(24.0f, 0.0f, 2), z, x16Var, l46Var2, (i3 & 112) | 384, ((i2 >> 3) & 112) | 6 | (i3 & 896), 1017);
                l46Var2.r(false);
                ojbVarV = l46Var2.v();
                if (ojbVarV == null) {
                    return;
                } else {
                    ku7Var = new ku7(str, x16Var, z, i, 1);
                }
            } else {
                l46Var2.f0(-1150283073);
                l46Var2.r(false);
                y6c y6cVarB = a7c.b(20.0f);
                j09 j09VarA0 = ynb.a0(b.c(db6.w(tm7.o(oa7.E(androidx.compose.foundation.layout.b.b(0.0f, 56.0f, g09.a, 1), y6cVarB), ((e8b) l46Var2.k(pr4Var)).f, y6cVarB), 0.5f, l8b.k(l46Var2), y6cVarB), z, null, null, x16Var, 14), 24.0f, 14.0f);
                t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var2, 48);
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
                dec.l(hj6.z, l46Var2, t7cVarA);
                dec.l(hj6.y, l46Var2, u8aVarM);
                dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                dec.k(l46Var2);
                dec.l(hj6.x, l46Var2, j09VarJ);
                mue mueVar = oue.a;
                nte.b(str, null, l8b.b(l46Var2), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.c(l46Var2), l46Var, i2 & 14, 0, 131066);
                l46Var2 = l46Var;
                l46Var2.r(true);
            }
            ojbVarV.d = ku7Var;
        }
        l46Var2.Z();
        ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ku7Var = new ku7(str, x16Var, z, i, 2);
            ojbVarV.d = ku7Var;
        }
    }

    public static final void b(int i, RecommendQuestion recommendQuestion, a26 a26Var, boolean z, l46 l46Var, int i2) {
        int i3;
        int i4;
        l46Var.h0(-1255032909);
        if ((i2 & 6) == 0) {
            i3 = i;
            i4 = (l46Var.e(i3) ? 4 : 2) | i2;
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? l46Var.g(recommendQuestion) : l46Var.i(recommendQuestion) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i4 |= l46Var.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        int i5 = i4;
        if (l46Var.W(i5 & 1, (i5 & 1171) != 1170)) {
            int i6 = i5 & 112;
            boolean z2 = i6 == 32 || ((i5 & 64) != 0 && l46Var.g(recommendQuestion));
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (z2 || objR == obj) {
                objR = qk2.d(z ? 0.0f : 1.0f);
                l46Var.p0(objR);
            }
            jx jxVar = (jx) objR;
            boolean z3 = i6 == 32 || ((i5 & 64) != 0 && l46Var.g(recommendQuestion));
            Object objR2 = l46Var.R();
            if (z3 || objR2 == obj) {
                objR2 = q1c.f(Boolean.valueOf(!z));
                l46Var.p0(objR2);
            }
            e89 e89Var = (e89) objR2;
            boolean zG = ((i5 & 14) == 4) | ((i5 & 7168) == 2048) | l46Var.g(e89Var) | l46Var.i(jxVar);
            Object objR3 = l46Var.R();
            if (zG || objR3 == obj) {
                Object ljbVar = new ljb(z, i3, jxVar, e89Var, null);
                l46Var.p0(ljbVar);
                objR3 = ljbVar;
            }
            af1.o((l26) objR3, l46Var, recommendQuestion);
            boolean zI = l46Var.i(jxVar);
            Object objR4 = l46Var.R();
            if (zI || objR4 == obj) {
                objR4 = new wt1(jxVar, 7);
                l46Var.p0(objR4);
            }
            j09 j09VarA = g09.a;
            j09 j09VarX = bzd.x(j09VarA, (a26) objR4);
            if (((Boolean) e89Var.getValue()).booleanValue()) {
                l46Var.f0(799212795);
            } else {
                l46Var.f0(799213546);
                Object objR5 = l46Var.R();
                if (objR5 == obj) {
                    objR5 = new z8b(20);
                    l46Var.p0(objR5);
                }
                j09VarA = vwc.a(j09VarA, (a26) objR5);
            }
            l46Var.r(false);
            j09 j09VarD = j09VarX.D(j09VarA);
            xn8 xn8VarC = s21.c(ndb.b, false);
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
            String text = recommendQuestion.getText();
            boolean z4 = ((i5 & 896) == 256) | (i6 == 32 || ((i5 & 64) != 0 && l46Var.i(recommendQuestion)));
            Object objR6 = l46Var.R();
            if (z4 || objR6 == obj) {
                objR6 = new ek9(26, a26Var, recommendQuestion);
                l46Var.p0(objR6);
            }
            a(0, (x16) objR6, l46Var, text, ((Boolean) e89Var.getValue()).booleanValue());
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p83(i, recommendQuestion, a26Var, z, i2);
        }
    }

    public static final void c(int i, x16 x16Var, a26 a26Var, l46 l46Var, j09 j09Var, List list, boolean z) {
        l46 l46Var2 = l46Var;
        list.getClass();
        a26Var.getClass();
        x16Var.getClass();
        l46Var2.h0(608783517);
        int i2 = i | (l46Var2.g(list) ? 4 : 2) | (l46Var2.i(a26Var) ? 32 : 16) | (l46Var2.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.g(j09Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (l46Var2.W(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z2 = (i2 & 14) == 4;
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (z2 || objR == i8cVar) {
                objR = Boolean.valueOf(z);
                l46Var2.p0(objR);
            }
            boolean zBooleanValue = ((Boolean) objR).booleanValue();
            boolean zH = l46Var2.h(zBooleanValue) | ((i2 & 7168) == 2048);
            Object objR2 = l46Var2.R();
            if (zH || objR2 == i8cVar) {
                objR2 = new mjb(zBooleanValue, x16Var, null);
                l46Var2.p0(objR2);
            }
            af1.o((l26) objR2, l46Var2, list);
            j09 j09VarD0 = ynb.d0(0.0f, 0.0f, 0.0f, 32.0f, 7, androidx.compose.foundation.layout.b.c(androidx.compose.foundation.layout.b.q(0.0f, 353.0f, j09Var, 1), 1.0f));
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
            String strQ = afc.q(R.string.recommended_follow_up_title, l46Var2);
            j09 j09VarB0 = ynb.b0(12.0f, 0.0f, androidx.compose.foundation.layout.b.c(g09.a, 1.0f), 2);
            mue mueVar = oue.a;
            nte.b(strQ, j09VarB0, ((e8b) l46Var2.k(l8b.a)).u, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.d(l46Var2), l46Var, 48, 0, 131064);
            l46Var2 = l46Var;
            l46Var2.f0(910430611);
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    t72.Z();
                    throw null;
                }
                b(i3, (RecommendQuestion) obj, a26Var, zBooleanValue, l46Var2, (RecommendQuestion.$stable << 3) | ((i2 << 3) & 896));
                i3 = i4;
            }
            l46Var2.r(false);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new i16(list, a26Var, z, x16Var, j09Var, i);
        }
    }
}
