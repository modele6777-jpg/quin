package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class z4h extends d8c {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public z4h(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.d8c
    public final void u(y8h y8hVar, y8h y8hVar2) {
        this.b.lazySet(y8hVar, y8hVar2);
    }

    @Override // defpackage.d8c
    public final void v(y8h y8hVar, Thread thread) {
        this.a.lazySet(y8hVar, thread);
    }

    @Override // defpackage.d8c
    public final boolean w(bbh bbhVar, j1h j1hVar, j1h j1hVar2) {
        return dec.o(this.d, bbhVar, j1hVar, j1hVar2);
    }

    @Override // defpackage.d8c
    public final boolean x(bbh bbhVar, Object obj, Object obj2) {
        return dec.o(this.e, bbhVar, obj, obj2);
    }

    @Override // defpackage.d8c
    public final boolean y(bbh bbhVar, y8h y8hVar, y8h y8hVar2) {
        return dec.o(this.c, bbhVar, y8hVar, y8hVar2);
    }
}
