package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b58 implements ltb, DefaultLifecycleObserver {
    public final h48 a;
    public final dg7 b;

    public b58(h48 h48Var, dg7 dg7Var) {
        this.a = h48Var;
        this.b = dg7Var;
    }

    @Override // defpackage.ltb
    public final void b() {
        this.a.a(this);
    }

    @Override // defpackage.ltb
    public final Object c(kib kibVar) {
        return an1.k(this.a, kibVar);
    }

    @Override // defpackage.ltb
    public final void d() {
        this.a.b(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(x48 x48Var) {
        this.b.h(null);
    }
}
