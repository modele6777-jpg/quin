package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class u0e extends c5 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.c5
    public final boolean a(b5 b5Var) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(t0e.a);
        return true;
    }

    @Override // defpackage.c5
    public final xn2[] b(b5 b5Var) {
        this.a.set(null);
        return rs0.b;
    }
}
