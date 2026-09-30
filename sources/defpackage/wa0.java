package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wa0 implements DefaultLifecycleObserver {
    public final h48 a;
    public final hl b;
    public final AtomicBoolean c;
    public final AtomicBoolean d;

    public wa0(h48 h48Var, hl hlVar) {
        h48Var.getClass();
        this.a = h48Var;
        this.b = hlVar;
        this.c = new AtomicBoolean(false);
        this.d = new AtomicBoolean(false);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(x48 x48Var) {
        x48Var.getClass();
        if (this.d.compareAndSet(false, true)) {
            this.b.invoke();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(x48 x48Var) {
        x48Var.getClass();
        this.d.set(false);
    }
}
