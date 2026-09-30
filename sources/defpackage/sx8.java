package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sx8 implements DefaultLifecycleObserver {
    public final /* synthetic */ h48 a;
    public final /* synthetic */ tx8 b;

    public sx8(tx8 tx8Var, h48 h48Var) {
        this.b = tx8Var;
        this.a = h48Var;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(x48 x48Var) {
        this.a.b(this);
        tx8 tx8Var = this.b;
        tx8Var.o.set(true);
        tx8Var.k.getClass();
    }
}
