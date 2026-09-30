package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dvg extends m7c {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(gvg.class, Thread.class, "a");
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(gvg.class, gvg.class, "b");
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(ivg.class, gvg.class, "c");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(ivg.class, bvg.class, "b");
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(ivg.class, Object.class, "a");

    @Override // defpackage.m7c
    public final boolean A(zwg zwgVar, bvg bvgVar, bvg bvgVar2) {
        return o7c.F(d, zwgVar, bvgVar, bvgVar2);
    }

    @Override // defpackage.m7c
    public final boolean B(ivg ivgVar, Object obj, Object obj2) {
        return o7c.F(e, ivgVar, obj, obj2);
    }

    @Override // defpackage.m7c
    public final boolean C(ivg ivgVar, gvg gvgVar, gvg gvgVar2) {
        return o7c.F(c, ivgVar, gvgVar, gvgVar2);
    }

    @Override // defpackage.m7c
    public final bvg w(zwg zwgVar) {
        return (bvg) d.getAndSet(zwgVar, bvg.d);
    }

    @Override // defpackage.m7c
    public final gvg x(zwg zwgVar) {
        return (gvg) c.getAndSet(zwgVar, gvg.c);
    }

    @Override // defpackage.m7c
    public final void y(gvg gvgVar, gvg gvgVar2) {
        b.lazySet(gvgVar, gvgVar2);
    }

    @Override // defpackage.m7c
    public final void z(gvg gvgVar, Thread thread) {
        a.lazySet(gvgVar, thread);
    }
}
