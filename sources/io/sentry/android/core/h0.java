package io.sentry.android.core;

import androidx.lifecycle.DefaultLifecycleObserver;
import defpackage.x48;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements DefaultLifecycleObserver {
    public final g0 a = new g0(this);
    public final /* synthetic */ i0 b;

    public h0(i0 i0Var) {
        this.b = i0Var;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(x48 x48Var) {
        this.b.d = Boolean.FALSE;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).b();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(x48 x48Var) {
        this.b.d = Boolean.TRUE;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).h();
        }
    }
}
