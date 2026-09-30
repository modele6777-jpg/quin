package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class iy5 {
    public static final hy5 a = hy5.a;

    public static hy5 a(kx5 kx5Var) {
        while (kx5Var != null) {
            if (kx5Var.n()) {
                kx5Var.j();
            }
            kx5Var = kx5Var.L0;
        }
        return a;
    }

    public static void b(vxf vxfVar) {
        if (zx5.I(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(vxfVar.getFragment().getClass().getName()), vxfVar);
        }
    }
}
