package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gxa implements k1f {
    public final ncc a;
    public final ncc b;
    public final l94 c = new l94();
    public final AtomicReference d = new AtomicReference(fxa.a);

    public gxa(ncc nccVar) {
        this.a = nccVar;
        this.b = nccVar;
    }

    @Override // defpackage.k1f
    public final void a(long j, int i, int i2, int i3, j1f j1fVar) {
        h().a(j, i, i2, i3, j1fVar);
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == fxa.b) {
            this.b.p(false);
            atomicReference.set(fxa.c);
        }
    }

    @Override // defpackage.k1f
    public final void b(d0a d0aVar, int i, int i2) {
        h().b(d0aVar, i, i2);
    }

    @Override // defpackage.k1f
    public final int c(sb3 sb3Var, int i, boolean z) {
        return h().c(sb3Var, i, z);
    }

    @Override // defpackage.k1f
    public final void e(int i, d0a d0aVar) {
        h().e(i, d0aVar);
    }

    @Override // defpackage.k1f
    public final int f(sb3 sb3Var, int i, boolean z) {
        return h().f(sb3Var, i, z);
    }

    @Override // defpackage.k1f
    public final void g(rr5 rr5Var) {
        this.a.g(rr5Var);
    }

    public final k1f h() {
        return this.d.get() == fxa.c ? this.c : this.b;
    }

    @Override // defpackage.k1f
    public final void d(long j) {
    }
}
