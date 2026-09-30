package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xbc implements xn2, cw2 {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(xbc.class, Object.class, "result");
    public final xn2 a;
    private volatile Object result;

    public xbc(xn2 xn2Var) {
        bw2 bw2Var = bw2.a;
        this.a = xn2Var;
        this.result = bw2Var;
    }

    @Override // defpackage.cw2
    public final cw2 e() {
        xn2 xn2Var = this.a;
        if (xn2Var instanceof cw2) {
            return (cw2) xn2Var;
        }
        return null;
    }

    @Override // defpackage.xn2
    public final void g(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        while (true) {
            Object obj2 = this.result;
            bw2 bw2Var = bw2.b;
            if (obj2 == bw2Var) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, bw2Var, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != bw2Var) {
                    }
                }
                return;
            }
            bw2 bw2Var2 = bw2.a;
            if (obj2 != bw2Var2) {
                qc0.p("Already resumed");
                return;
            }
            bw2 bw2Var3 = bw2.c;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, bw2Var2, bw2Var3)) {
                    this.a.g(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == bw2Var2);
        }
    }

    @Override // defpackage.xn2
    public final pv2 getContext() {
        return this.a.getContext();
    }

    public final String toString() {
        return "SafeContinuation for " + this.a;
    }
}
