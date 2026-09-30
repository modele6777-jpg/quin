package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gx5 {
    public final /* synthetic */ kx5 a;

    public gx5(kx5 kx5Var) {
        this.a = kx5Var;
    }

    public final void a() {
        kx5 kx5Var = this.a;
        kx5Var.f1.o();
        cdc.b(kx5Var);
        Bundle bundle = kx5Var.b;
        kx5Var.f1.p(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
