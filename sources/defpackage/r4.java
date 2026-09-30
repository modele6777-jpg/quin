package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r4 extends jgb {
    public final AtomicReferenceFieldUpdater p;
    public final AtomicReferenceFieldUpdater q;
    public final AtomicReferenceFieldUpdater r;
    public final AtomicReferenceFieldUpdater s;
    public final AtomicReferenceFieldUpdater t;

    public r4(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.p = atomicReferenceFieldUpdater;
        this.q = atomicReferenceFieldUpdater2;
        this.r = atomicReferenceFieldUpdater3;
        this.s = atomicReferenceFieldUpdater4;
        this.t = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.jgb
    public final boolean J(u4 u4Var, q4 q4Var, q4 q4Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.s;
            if (atomicReferenceFieldUpdater.compareAndSet(u4Var, q4Var, q4Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(u4Var) == q4Var);
        return false;
    }

    @Override // defpackage.jgb
    public final boolean K(u4 u4Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.t;
            if (atomicReferenceFieldUpdater.compareAndSet(u4Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(u4Var) == obj);
        return false;
    }

    @Override // defpackage.jgb
    public final boolean L(u4 u4Var, t4 t4Var, t4 t4Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.r;
            if (atomicReferenceFieldUpdater.compareAndSet(u4Var, t4Var, t4Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(u4Var) == t4Var);
        return false;
    }

    @Override // defpackage.jgb
    public final void e0(t4 t4Var, t4 t4Var2) {
        this.q.lazySet(t4Var, t4Var2);
    }

    @Override // defpackage.jgb
    public final void f0(t4 t4Var, Thread thread) {
        this.p.lazySet(t4Var, thread);
    }
}
