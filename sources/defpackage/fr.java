package defpackage;

import androidx.compose.foundation.layout.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fr {
    public static final float a = (25.0f * 2.0f) / 2.4142137f;

    public static final void a(final ul9 ul9Var, final j09 j09Var, long j, l46 l46Var, final int i, final int i2) {
        l46Var.h0(1776202187);
        int i3 = (l46Var.g(ul9Var) ? 4 : 2) | i | (l46Var.g(j09Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && l46Var.f(j)) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            l46Var.b0();
            if ((i & 1) != 0 && !l46Var.C()) {
                l46Var.Z();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            } else if ((i2 & 4) != 0) {
                i3 &= -897;
                j = 9205357640488583168L;
            }
            l46Var.s();
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objR = l46Var.R();
            if (z || objR == sf2.a) {
                objR = new c1(14, ul9Var);
                l46Var.p0(objR);
            }
            i7h.c(ul9Var, ndb.c, af1.b0(-1653527038, new cr(j, vwc.b(j09Var, false, (a26) objR)), l46Var), l46Var, i4 | 432);
        } else {
            l46Var.Z();
        }
        final long j2 = j;
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: dr
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fr.a(ul9Var, j09Var, j2, (l46) obj, k99.P(i | 1), i2);
                    return wef.a;
                }
            };
        }
    }

    public static final void b(int i, int i2, l46 l46Var, j09 j09Var) {
        int i3;
        l46Var.h0(694251107);
        int i4 = i2 & 1;
        int i5 = 2;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (l46Var.g(j09Var) ? 4 : 2) | i;
        }
        if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                j09Var = g09.a;
            }
            o5c.f(l46Var, b21.t(b.m(j09Var, a, 25.0f), new ac(((hue) l46Var.k(iue.a)).a, 1)));
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new pb(j09Var, i, i2, i5);
        }
    }
}
