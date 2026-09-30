package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lsd implements c1e, Map, cn7 {
    public ksd a;
    public final rrd b;
    public final rrd c;
    public final rrd d;

    public lsd() {
        w8a w8aVar = w8a.c;
        ird irdVarH = qrd.h();
        ksd ksdVar = new ksd(irdVarH.g(), w8aVar);
        if (!(irdVarH instanceof qb6)) {
            ksdVar.b = new ksd(1L, w8aVar);
        }
        this.a = ksdVar;
        this.b = new rrd(this, 0);
        this.c = new rrd(this, 1);
        this.d = new rrd(this, 2);
    }

    public static boolean b(ksd ksdVar, int i, w8a w8aVar) {
        boolean z;
        synchronized (bzd.l) {
            int i2 = ksdVar.d;
            if (i2 == i) {
                ksdVar.c = w8aVar;
                z = true;
                ksdVar.d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.c1e
    public final f1e c() {
        return this.a;
    }

    @Override // java.util.Map
    public final void clear() {
        ird irdVarH;
        w8a w8aVar = ((ksd) qrd.f(this.a)).c;
        w8a w8aVar2 = w8a.c;
        if (w8aVar2 != w8aVar) {
            ksd ksdVar = this.a;
            synchronized (qrd.c) {
                irdVarH = qrd.h();
                ksd ksdVar2 = (ksd) qrd.w(ksdVar, this, irdVarH);
                synchronized (bzd.l) {
                    ksdVar2.c = w8aVar2;
                    ksdVar2.d++;
                }
            }
            qrd.l(irdVarH, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return e().c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return e().c.containsValue(obj);
    }

    public final ksd e() {
        return (ksd) qrd.s(this.a, this);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.b;
    }

    @Override // defpackage.c1e
    public final void f(f1e f1eVar) {
        this.a = (ksd) f1eVar;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return e().c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return e().c.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.c;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        w8a w8aVar;
        int i;
        Object objPut;
        ird irdVarH;
        boolean zB;
        do {
            synchronized (bzd.l) {
                ksd ksdVar = (ksd) qrd.f(this.a);
                w8aVar = ksdVar.c;
                i = ksdVar.d;
            }
            w8aVar.getClass();
            z8a z8aVarG = w8aVar.g();
            objPut = z8aVarG.put(obj, obj2);
            w8a w8aVarG = z8aVarG.g();
            if (pa7.t(w8aVarG, w8aVar)) {
                break;
            }
            ksd ksdVar2 = this.a;
            synchronized (qrd.c) {
                irdVarH = qrd.h();
                zB = b((ksd) qrd.w(ksdVar2, this, irdVarH), i, w8aVarG);
            }
            qrd.l(irdVarH, this);
        } while (!zB);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        w8a w8aVar;
        int i;
        ird irdVarH;
        boolean zB;
        do {
            synchronized (bzd.l) {
                ksd ksdVar = (ksd) qrd.f(this.a);
                w8aVar = ksdVar.c;
                i = ksdVar.d;
            }
            w8aVar.getClass();
            z8a z8aVarG = w8aVar.g();
            z8aVarG.putAll(map);
            w8a w8aVarG = z8aVarG.g();
            if (pa7.t(w8aVarG, w8aVar)) {
                return;
            }
            ksd ksdVar2 = this.a;
            synchronized (qrd.c) {
                irdVarH = qrd.h();
                zB = b((ksd) qrd.w(ksdVar2, this, irdVarH), i, w8aVarG);
            }
            qrd.l(irdVarH, this);
        } while (!zB);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        w8a w8aVar;
        int i;
        V vRemove;
        ird irdVarH;
        boolean zB;
        do {
            synchronized (bzd.l) {
                ksd ksdVar = (ksd) qrd.f(this.a);
                w8aVar = ksdVar.c;
                i = ksdVar.d;
            }
            w8aVar.getClass();
            z8a z8aVarG = w8aVar.g();
            vRemove = z8aVarG.remove(obj);
            w8a w8aVarG = z8aVarG.g();
            if (pa7.t(w8aVarG, w8aVar)) {
                break;
            }
            ksd ksdVar2 = this.a;
            synchronized (qrd.c) {
                irdVarH = qrd.h();
                zB = b((ksd) qrd.w(ksdVar2, this, irdVarH), i, w8aVarG);
            }
            qrd.l(irdVarH, this);
        } while (!zB);
        return vRemove;
    }

    @Override // java.util.Map
    public final int size() {
        return e().c.size();
    }

    public final String toString() {
        return "SnapshotStateMap(value=" + ((ksd) qrd.f(this.a)).c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.d;
    }
}
