package defpackage;

import ai.askquin.ui.router.AppRoute;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dnc {
    public static final void a(grc grcVar, x16 x16Var, x16 x16Var2, dd2 dd2Var, l46 l46Var, int i) {
        l46Var.h0(-1606288231);
        int i2 = (l46Var.e(grcVar.ordinal()) ? 4 : 2) | i | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            int iOrdinal = grcVar.ordinal();
            if (iOrdinal == 0) {
                l46Var.f0(-1749723358);
                dd2Var.z(l46Var, 6);
                l46Var.r(false);
            } else if (iOrdinal == 1) {
                l46Var.f0(-1749721269);
                int i3 = i2 << 3;
                uyb.b(ppc.a, false, x16Var, x16Var2, l46Var, (i3 & 896) | 54 | (i3 & 7168));
                l46Var.r(false);
            } else {
                if (iOrdinal != 2) {
                    throw tec.d(-1749724926, l46Var, false);
                }
                l46Var.f0(-1749713956);
                int i4 = i2 << 3;
                uyb.b(new opc(null), false, x16Var, x16Var2, l46Var, (i4 & 896) | 48 | (i4 & 7168));
                l46Var.r(false);
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new r19(grcVar, x16Var, x16Var2, dd2Var, i);
        }
    }

    public static final void b(ka9 ka9Var) {
        ka9.h(ka9Var, AppRoute.Main.INSTANCE, false);
    }
}
