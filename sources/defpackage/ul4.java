package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ul4 {
    public static final sl4 a = new sl4(3, null);
    public static final tl4 b = new tl4(3, null);

    public static j09 a(j09 j09Var, zl4 zl4Var, ks9 ks9Var, boolean z, t69 t69Var, boolean z2, n26 n26Var, boolean z3, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            t69Var = null;
        }
        return j09Var.D(new ql4(zl4Var, ks9Var, z4, t69Var, (i & 16) != 0 ? false : z2, a, n26Var, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? false : z3));
    }

    public static final long b(long j) {
        return q7c.j(Float.isNaN(zsf.b(j)) ? 0.0f : zsf.b(j), Float.isNaN(zsf.c(j)) ? 0.0f : zsf.c(j));
    }
}
