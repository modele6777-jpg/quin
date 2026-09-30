package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class x1 extends urg {
    public final AtomicReferenceFieldUpdater S;
    public final AtomicReferenceFieldUpdater T;
    public final AtomicReferenceFieldUpdater U;
    public final AtomicReferenceFieldUpdater V;
    public final AtomicReferenceFieldUpdater W;

    public x1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.S = atomicReferenceFieldUpdater;
        this.T = atomicReferenceFieldUpdater2;
        this.U = atomicReferenceFieldUpdater3;
        this.V = atomicReferenceFieldUpdater4;
        this.W = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.urg
    public final void N(e2 e2Var, e2 e2Var2) {
        this.T.lazySet(e2Var, e2Var2);
    }

    @Override // defpackage.urg
    public final void O(e2 e2Var, Thread thread) {
        this.S.lazySet(e2Var, thread);
    }

    @Override // defpackage.urg
    public final boolean l(f2 f2Var, w1 w1Var, w1 w1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.V;
            if (atomicReferenceFieldUpdater.compareAndSet(f2Var, w1Var, w1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(f2Var) == w1Var);
        return false;
    }

    @Override // defpackage.urg
    public final boolean m(f2 f2Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.W;
            if (atomicReferenceFieldUpdater.compareAndSet(f2Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(f2Var) == obj);
        return false;
    }

    @Override // defpackage.urg
    public final boolean n(f2 f2Var, e2 e2Var, e2 e2Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.U;
            if (atomicReferenceFieldUpdater.compareAndSet(f2Var, e2Var, e2Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(f2Var) == e2Var);
        return false;
    }

    @Override // defpackage.urg
    public final w1 x(f2 f2Var) {
        return (w1) this.V.getAndSet(f2Var, w1.d);
    }

    @Override // defpackage.urg
    public final e2 y(f2 f2Var) {
        return (e2) this.U.getAndSet(f2Var, e2.c);
    }
}
