package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rrd implements Set, jn7 {
    public final lsd a;
    public final /* synthetic */ int b;

    public rrd(lsd lsdVar, int i) {
        this.b = i;
        this.a = lsdVar;
    }

    private final boolean c(Collection collection) {
        w8a w8aVar;
        int i;
        ird irdVarH;
        boolean zB;
        Set setO1 = s72.o1(collection);
        lsd lsdVar = this.a;
        boolean z = false;
        do {
            synchronized (bzd.l) {
                ksd ksdVar = (ksd) qrd.f(lsdVar.a);
                w8aVar = ksdVar.c;
                i = ksdVar.d;
            }
            w8aVar.getClass();
            z8a z8aVarG = w8aVar.g();
            Iterator it = lsdVar.b.iterator();
            while (((b1e) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((b1e) it).next();
                if (!setO1.contains(entry.getKey())) {
                    z8aVarG.remove(entry.getKey());
                    z = true;
                }
            }
            w8a w8aVarG = z8aVarG.g();
            if (pa7.t(w8aVarG, w8aVar)) {
                break;
            }
            ksd ksdVar2 = lsdVar.a;
            synchronized (qrd.c) {
                irdVarH = qrd.h();
                zB = lsd.b((ksd) qrd.w(ksdVar2, lsdVar, irdVarH), i, w8aVarG);
            }
            qrd.l(irdVarH, lsdVar);
        } while (!zB);
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.b) {
            case 0:
                bzd.L();
                throw null;
            case 1:
                bzd.L();
                throw null;
            default:
                bzd.L();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.b) {
            case 0:
                bzd.L();
                throw null;
            case 1:
                bzd.L();
                throw null;
            default:
                bzd.L();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.b;
        lsd lsdVar = this.a;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof zm7) && !(obj instanceof bn7))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return pa7.t(lsdVar.get(entry.getKey()), entry.getValue());
            case 1:
                return lsdVar.containsKey(obj);
            default:
                return lsdVar.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.b;
        lsd lsdVar = this.a;
        switch (i) {
            case 0:
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!contains((Map.Entry) it.next())) {
                            return false;
                        }
                    }
                }
                return true;
            case 1:
                Collection collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    Iterator it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        if (!lsdVar.containsKey(it2.next())) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                Collection collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    Iterator it3 = collection4.iterator();
                    while (it3.hasNext()) {
                        if (!lsdVar.containsValue(it3.next())) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.b;
        lsd lsdVar = this.a;
        switch (i) {
            case 0:
                return new b1e(lsdVar, ((sy6) lsdVar.e().c.entrySet()).iterator(), 0);
            case 1:
                return new b1e(lsdVar, ((sy6) lsdVar.e().c.entrySet()).iterator(), 1);
            default:
                return new b1e(lsdVar, ((sy6) lsdVar.e().c.entrySet()).iterator(), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v8 java.lang.Object, still in use, count: 2, list:
          (r3v8 java.lang.Object) from 0x002e: PHI (r3 I:??) = (r3v3 java.lang.Object), (r3v8 java.lang.Object) binds: [B:10:0x002d, B:30:0x002e] A[DONT_GENERATE, DONT_INLINE]
          (r3v8 java.lang.Object) from 0x0020: CHECK_CAST (java.util.Map$Entry) (r3v8 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.b
            r1 = 0
            r2 = 1
            lsd r5 = r5.a
            switch(r0) {
                case 0: goto L43;
                case 1: goto L3b;
                default: goto L9;
            }
        L9:
            rrd r0 = r5.b
            java.util.Iterator r0 = r0.iterator()
        Lf:
            r3 = r0
            b1e r3 = (defpackage.b1e) r3
            boolean r3 = r3.hasNext()
            if (r3 == 0) goto L2d
            r3 = r0
            b1e r3 = (defpackage.b1e) r3
            java.lang.Object r3 = r3.next()
            r4 = r3
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            boolean r4 = defpackage.pa7.t(r4, r6)
            if (r4 == 0) goto Lf
            goto L2e
        L2d:
            r3 = 0
        L2e:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r3 == 0) goto L3a
            java.lang.Object r6 = r3.getKey()
            r5.remove(r6)
            r1 = r2
        L3a:
            return r1
        L3b:
            java.lang.Object r5 = r5.remove(r6)
            if (r5 == 0) goto L42
            r1 = r2
        L42:
            return r1
        L43:
            boolean r0 = r6 instanceof java.util.Map.Entry
            if (r0 == 0) goto L5c
            boolean r0 = r6 instanceof defpackage.zm7
            if (r0 == 0) goto L4f
            boolean r0 = r6 instanceof defpackage.bn7
            if (r0 == 0) goto L5c
        L4f:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getKey()
            java.lang.Object r5 = r5.remove(r6)
            if (r5 == 0) goto L5c
            r1 = r2
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rrd.remove(java.lang.Object):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        w8a w8aVar;
        int i;
        ird irdVarH;
        boolean zB;
        boolean z = false;
        switch (this.b) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (this.a.remove(((Map.Entry) it.next()).getKey()) != null || z2) {
                            z2 = true;
                        }
                    }
                    return z2;
                }
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z3 = false;
                    while (it2.hasNext()) {
                        if (this.a.remove(it2.next()) != null || z3) {
                            z3 = true;
                        }
                    }
                    return z3;
                }
            default:
                Set setO1 = s72.o1(collection);
                lsd lsdVar = this.a;
                do {
                    synchronized (bzd.l) {
                        ksd ksdVar = (ksd) qrd.f(lsdVar.a);
                        w8aVar = ksdVar.c;
                        i = ksdVar.d;
                    }
                    w8aVar.getClass();
                    z8a z8aVarG = w8aVar.g();
                    Iterator it3 = lsdVar.b.iterator();
                    while (((b1e) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((b1e) it3).next();
                        if (setO1.contains(entry.getValue())) {
                            z8aVarG.remove(entry.getKey());
                            z = true;
                        }
                    }
                    w8a w8aVarG = z8aVarG.g();
                    if (!pa7.t(w8aVarG, w8aVar)) {
                        ksd ksdVar2 = lsdVar.a;
                        synchronized (qrd.c) {
                            irdVarH = qrd.h();
                            zB = lsd.b((ksd) qrd.w(ksdVar2, lsdVar, irdVarH), i, w8aVarG);
                        }
                        qrd.l(irdVarH, lsdVar);
                    }
                    return z;
                } while (!zB);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        w8a w8aVar;
        int i;
        ird irdVarH;
        boolean zB;
        w8a w8aVar2;
        int i2;
        ird irdVarH2;
        boolean zB2;
        boolean z = false;
        switch (this.b) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int iF = bm8.F(t72.u(collection2, 10));
                if (iF < 16) {
                    iF = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iF);
                for (Map.Entry entry : collection2) {
                    iy9 iy9Var = new iy9(entry.getKey(), entry.getValue());
                    linkedHashMap.put(iy9Var.d(), iy9Var.e());
                }
                lsd lsdVar = this.a;
                do {
                    synchronized (bzd.l) {
                        ksd ksdVar = (ksd) qrd.f(lsdVar.a);
                        w8aVar = ksdVar.c;
                        i = ksdVar.d;
                    }
                    w8aVar.getClass();
                    z8a z8aVarG = w8aVar.g();
                    Iterator it = lsdVar.b.iterator();
                    while (((b1e) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((b1e) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !pa7.t(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            z8aVarG.remove(entry2.getKey());
                            z = true;
                        }
                    }
                    w8a w8aVarG = z8aVarG.g();
                    if (!pa7.t(w8aVarG, w8aVar)) {
                        ksd ksdVar2 = lsdVar.a;
                        synchronized (qrd.c) {
                            irdVarH = qrd.h();
                            zB = lsd.b((ksd) qrd.w(ksdVar2, lsdVar, irdVarH), i, w8aVarG);
                        }
                        qrd.l(irdVarH, lsdVar);
                    }
                    return z;
                } while (!zB);
                return z;
            case 1:
                return c(collection);
            default:
                Set setO1 = s72.o1(collection);
                lsd lsdVar2 = this.a;
                do {
                    synchronized (bzd.l) {
                        ksd ksdVar3 = (ksd) qrd.f(lsdVar2.a);
                        w8aVar2 = ksdVar3.c;
                        i2 = ksdVar3.d;
                    }
                    w8aVar2.getClass();
                    z8a z8aVarG2 = w8aVar2.g();
                    Iterator it2 = lsdVar2.b.iterator();
                    while (((b1e) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((b1e) it2).next();
                        if (!setO1.contains(entry3.getValue())) {
                            z8aVarG2.remove(entry3.getKey());
                            z = true;
                        }
                    }
                    w8a w8aVarG2 = z8aVarG2.g();
                    if (!pa7.t(w8aVarG2, w8aVar2)) {
                        ksd ksdVar4 = lsdVar2.a;
                        synchronized (qrd.c) {
                            irdVarH2 = qrd.h();
                            zB2 = lsd.b((ksd) qrd.w(ksdVar4, lsdVar2, irdVarH2), i2, w8aVarG2);
                        }
                        qrd.l(irdVarH2, lsdVar2);
                    }
                    return z;
                } while (!zB2);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return bzd.J(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return bzd.K(this, objArr);
    }
}
