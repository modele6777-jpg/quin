package defpackage;

import ai.askquin.R;
import ai.askquin.data.QuotaBlockReason;
import ai.askquin.ui.conversation.FailReason;
import android.content.Context;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ga5 {
    public static final void a(j09 j09Var, FailReason failReason, boolean z, x16 x16Var, x16 x16Var2, l46 l46Var, int i) {
        failReason.getClass();
        l46Var.h0(-751408588);
        int i2 = (l46Var.g(j09Var) ? 4 : 2) | i | (l46Var.g(failReason) ? 32 : 16) | (l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (l46Var.W(i2 & 1, (i2 & 9363) != 9362)) {
            Context context = (Context) l46Var.k(uq.b);
            if (failReason.equals(FailReason.Network.INSTANCE)) {
                l46Var.f0(-549139333);
                d(((i2 >> 6) & 112) | (i2 & 14), x16Var, l46Var, j09Var);
                l46Var.r(false);
            } else if (failReason.equals(FailReason.NoFreeCount.INSTANCE)) {
                l46Var.f0(-549137083);
                e(((i2 >> 6) & 896) | (i2 & 14) | ((i2 >> 3) & 112), x16Var2, l46Var, j09Var, z);
                l46Var.r(false);
            } else if (failReason.equals(FailReason.Unauthorized.INSTANCE)) {
                l46Var.f0(156701112);
                boolean zI = l46Var.i(context);
                Object objR = l46Var.R();
                if (zI || objR == sf2.a) {
                    objR = new da5(context, null);
                    l46Var.p0(objR);
                }
                af1.o((l26) objR, l46Var, wef.a);
                l46Var.r(false);
            } else if (failReason.equals(FailReason.NoRemainingTokens.INSTANCE)) {
                l46Var.f0(-549130574);
                f(i2 & 14, 0, l46Var, j09Var);
                l46Var.r(false);
            } else if (failReason instanceof FailReason.UsageBlocked) {
                l46Var.f0(-549128484);
                g(j09Var, ((FailReason.UsageBlocked) failReason).getReason(), l46Var, i2 & 14);
                l46Var.r(false);
            } else {
                if (!(failReason instanceof FailReason.IllegalContent)) {
                    throw tec.d(-549140166, l46Var, false);
                }
                l46Var.f0(-549126003);
                c(i2 & 14, l46Var, j09Var, ((FailReason.IllegalContent) failReason).getMessage());
                l46Var.r(false);
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l30(j09Var, failReason, z, x16Var, x16Var2, i, 4);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 10611. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final void b(defpackage.tr2 r52, ai.askquin.ui.conversation.FailReason r53, defpackage.l46 r54, int r55) {
        /*
            Method dump skipped, instruction units count: 1061
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ga5.b(tr2, ai.askquin.ui.conversation.FailReason, l46, int):void");
    }

    public static final void c(int i, l46 l46Var, j09 j09Var, String str) {
        int i2;
        l46 l46Var2 = l46Var;
        String str2 = str;
        str2.getClass();
        l46Var2.h0(938925884);
        if ((i & 6) == 0) {
            i2 = i | (l46Var.g(j09Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var2.g(str2) ? 32 : 16;
        }
        if (l46Var2.W(i2 & 1, (i2 & 19) != 18)) {
            j09 j09VarC = b.c(j09Var, 1.0f);
            xn8 xn8VarC = s21.c(ndb.f, false);
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
            dec.l(hj6.z, l46Var2, xn8VarC);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            nte.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jgb.W(l46Var2), l46Var2, (i2 >> 3) & 14, 0, 131070);
            str2 = str;
            l46Var2 = l46Var2;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o43(j09Var, str2, i, 2);
        }
    }

    public static final void d(int i, x16 x16Var, l46 l46Var, j09 j09Var) {
        int i2;
        l46Var.h0(105028895);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(x16Var) ? 32 : 16;
        }
        int i3 = i2;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            bzd.d(j09Var, y6c.c(((s5d) l46Var.k(u5d.a)).e, new zi4(0.0f), null, null, null, 14), z5c.p(y72.j, 0L, l46Var, 24582, 14), null, x57.b(y72.b(((m82) l46Var.k(o82.a)).q, 0.32f), 0.0f), af1.b0(591901293, new n(6, x16Var), l46Var), l46Var, (i3 & 14) | 196608, 8);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ca5(j09Var, x16Var, i, 0, (byte) 0);
        }
    }

    public static final void e(int i, x16 x16Var, l46 l46Var, j09 j09Var, boolean z) {
        int i2;
        l46Var.h0(-766414424);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            bzd.d(j09Var, y6c.c(((s5d) l46Var.k(u5d.a)).e, new zi4(0.0f), null, null, null, 14), z5c.p(y72.j, 0L, l46Var, 24582, 14), null, x57.b(y72.b(((m82) l46Var.k(o82.a)).q, 0.32f), 0.0f), af1.b0(-455364198, new dv(z, x16Var, 3), l46Var), l46Var, (i2 & 14) | 196608, 8);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cv(j09Var, z, x16Var, i, 2);
        }
    }

    public static final void f(int i, int i2, l46 l46Var, j09 j09Var) {
        int i3;
        j09 j09Var2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-541941226);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (l46Var.g(j09Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if (l46Var2.W(i3 & 1, (i3 & 3) != 2)) {
            j09 j09Var3 = i4 != 0 ? g09.a : j09Var;
            j09 j09VarC = b.c(j09Var3, 1.0f);
            xn8 xn8VarC = s21.c(ndb.f, false);
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
            dec.l(hj6.z, l46Var2, xn8VarC);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            nte.b(afc.q(R.string.error_token_exceeds_limit, l46Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jgb.W(l46Var2), l46Var, 0, 0, 131070);
            l46Var2 = l46Var;
            l46Var2.r(true);
            j09Var2 = j09Var3;
        } else {
            l46Var2.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new kc2(j09Var2, i, i2, 2);
        }
    }

    public static final void g(j09 j09Var, QuotaBlockReason quotaBlockReason, l46 l46Var, int i) {
        int i2;
        l46 l46Var2 = l46Var;
        quotaBlockReason.getClass();
        l46Var2.h0(-252029196);
        if ((i & 6) == 0) {
            i2 = i | (l46Var2.g(j09Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var2.e(quotaBlockReason.ordinal()) ? 32 : 16;
        }
        if (l46Var2.W(i2 & 1, (i2 & 19) != 18)) {
            j09 j09VarC = b.c(j09Var, 1.0f);
            xn8 xn8VarC = s21.c(ndb.f, false);
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
            dec.l(hj6.z, l46Var2, xn8VarC);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            nte.b(afc.q(h(quotaBlockReason), l46Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jgb.W(l46Var2), l46Var, 0, 0, 131070);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gc(j09Var, quotaBlockReason, i, 18);
        }
    }

    public static final int h(QuotaBlockReason quotaBlockReason) {
        int i = fa5.a[quotaBlockReason.ordinal()];
        if (i == 1) {
            return R.string.chat_content_error_usage_empty;
        }
        if (i == 2) {
            return R.string.chat_content_error_daily_limit;
        }
        if (i == 3) {
            return R.string.chat_content_error_no_follow_up;
        }
        if (i == 4) {
            return R.string.chat_content_error_no_free_count;
        }
        ap.c();
        return 0;
    }
}
