package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wi {
    public static final pr4 a;

    static {
        ynb.r(0.0f, 0.0f, 0.0f, 16.0f, 7);
        ynb.r(0.0f, 0.0f, 0.0f, 16.0f, 7);
        ynb.r(0.0f, 0.0f, 0.0f, 24.0f, 7);
        a = new pr4(0, new q(11));
    }

    public static final void a(x16 x16Var, j09 j09Var, s84 s84Var, dd2 dd2Var, l46 l46Var, int i, int i2) {
        int i3;
        l46Var.h0(24925658);
        if ((i & 6) == 0) {
            i3 = (l46Var.i(x16Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i3 | 48;
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 = i3 | 432;
        } else if ((i & 384) == 0) {
            i4 |= l46Var.g(s84Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i4 |= l46Var.i(dd2Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var.W(i4 & 1, (i4 & 1171) != 1170)) {
            if (i5 != 0) {
                s84Var = new s84(false, false, 7);
            }
            ((mp3) l46Var.k(a)).a(new ta0(x16Var, s84Var, dd2Var), l46Var, 0);
            j09Var = g09.a;
        } else {
            l46Var.Z();
        }
        j09 j09Var2 = j09Var;
        s84 s84Var2 = s84Var;
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new vi(x16Var, j09Var2, s84Var2, dd2Var, i, i2, 0);
        }
    }
}
