package io.sentry.android.core;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends CopyOnWriteArrayList {
    final /* synthetic */ h0 this$1;

    public g0(h0 h0Var) {
        this.this$1 = h0Var;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        f0 f0Var = (f0) obj;
        boolean zAdd = super.add(f0Var);
        if (Boolean.FALSE.equals(this.this$1.b.d)) {
            f0Var.b();
            return zAdd;
        }
        if (Boolean.TRUE.equals(this.this$1.b.d)) {
            f0Var.h();
        }
        return zAdd;
    }
}
