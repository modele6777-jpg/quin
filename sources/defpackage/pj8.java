package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pj8 {
    public static final gxc a = new gxc("MagnifierPositionInRoot");

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static j09 b(a26 a26Var, a26 a26Var2, efa efaVar) {
        return a() ? new lj8(a26Var, a26Var2, efaVar) : g09.a;
    }
}
