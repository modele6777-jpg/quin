package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xx5 implements wx5 {
    public final int a;
    public final /* synthetic */ zx5 b;

    public xx5(zx5 zx5Var, int i) {
        this.b = zx5Var;
        this.a = i;
    }

    @Override // defpackage.wx5
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        zx5 zx5Var = this.b;
        kx5 kx5Var = zx5Var.z;
        int i = this.a;
        if (kx5Var == null || i >= 0 || !kx5Var.f().P()) {
            return zx5Var.Q(i, 1, arrayList, arrayList2);
        }
        return false;
    }
}
