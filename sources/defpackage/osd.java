package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class osd implements Parcelable, c1e, Set, RandomAccess, jn7 {
    public static final Parcelable.Creator<osd> CREATOR = new uz9(2);
    public h1e a;

    public osd() {
        y9a y9aVar = y9a.d;
        h1e h1eVar = new h1e(qrd.h().g(), y9aVar);
        if (qrd.b.get() != null) {
            h1eVar.b = new h1e(1L, y9aVar);
        }
        this.a = h1eVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        y9a y9aVar;
        ird irdVarH;
        boolean zS;
        do {
            synchronized (z7f.k) {
                h1e h1eVar = (h1e) qrd.f(this.a);
                i = h1eVar.d;
                y9aVar = h1eVar.c;
            }
            y9aVar.getClass();
            y9a y9aVarD = y9aVar.d(obj);
            if (y9aVarD.equals(y9aVar)) {
                return false;
            }
            h1e h1eVar2 = this.a;
            synchronized (qrd.c) {
                irdVarH = qrd.h();
                zS = z7f.s((h1e) qrd.w(h1eVar2, this, irdVarH), i, y9aVarD);
            }
            qrd.l(irdVarH, this);
        } while (!zS);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        y9a y9aVar;
        ird irdVarH;
        boolean zS;
        do {
            synchronized (z7f.k) {
                h1e h1eVar = (h1e) qrd.f(this.a);
                i = h1eVar.d;
                y9aVar = h1eVar.c;
            }
            y9aVar.getClass();
            z9a z9aVar = new z9a(y9aVar);
            z9aVar.addAll(collection);
            y9a y9aVarD = z9aVar.d();
            if (y9aVarD.equals(y9aVar)) {
                return false;
            }
            h1e h1eVar2 = this.a;
            synchronized (qrd.c) {
                irdVarH = qrd.h();
                zS = z7f.s((h1e) qrd.w(h1eVar2, this, irdVarH), i, y9aVarD);
            }
            qrd.l(irdVarH, this);
        } while (!zS);
        return true;
    }

    @Override // defpackage.c1e
    public final f1e c() {
        return this.a;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        ird irdVarH;
        h1e h1eVar = this.a;
        synchronized (qrd.c) {
            irdVarH = qrd.h();
            h1e h1eVar2 = (h1e) qrd.w(h1eVar, this, irdVarH);
            synchronized (z7f.k) {
                h1eVar2.c = y9a.d;
                h1eVar2.d++;
            }
        }
        qrd.l(irdVarH, this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return z7f.H(this).c.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return z7f.H(this).c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.c1e
    public final void f(f1e f1eVar) {
        f1eVar.b = this.a;
        this.a = (h1e) f1eVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return z7f.H(this).c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new g1e(this, ((h1e) qrd.s(this.a, this)).c.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        y9a y9aVar;
        ird irdVarH;
        boolean zS;
        do {
            synchronized (z7f.k) {
                h1e h1eVar = (h1e) qrd.f(this.a);
                i = h1eVar.d;
                y9aVar = h1eVar.c;
            }
            y9aVar.getClass();
            y9a y9aVarE = y9aVar.e(obj);
            if (y9aVarE.equals(y9aVar)) {
                return false;
            }
            h1e h1eVar2 = this.a;
            synchronized (qrd.c) {
                irdVarH = qrd.h();
                zS = z7f.s((h1e) qrd.w(h1eVar2, this, irdVarH), i, y9aVarE);
            }
            qrd.l(irdVarH, this);
        } while (!zS);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        y9a y9aVar;
        ird irdVarH;
        boolean zS;
        do {
            synchronized (z7f.k) {
                h1e h1eVar = (h1e) qrd.f(this.a);
                i = h1eVar.d;
                y9aVar = h1eVar.c;
            }
            y9aVar.getClass();
            z9a z9aVar = new z9a(y9aVar);
            z9aVar.removeAll(collection);
            y9a y9aVarD = z9aVar.d();
            if (y9aVarD.equals(y9aVar)) {
                return false;
            }
            h1e h1eVar2 = this.a;
            synchronized (qrd.c) {
                irdVarH = qrd.h();
                zS = z7f.s((h1e) qrd.w(h1eVar2, this, irdVarH), i, y9aVarD);
            }
            qrd.l(irdVarH, this);
        } while (!zS);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        y9a y9aVar;
        boolean zRetainAll;
        ird irdVarH;
        boolean zS;
        do {
            synchronized (z7f.k) {
                h1e h1eVar = (h1e) qrd.f(this.a);
                i = h1eVar.d;
                y9aVar = h1eVar.c;
            }
            if (y9aVar == null) {
                qc0.p("No set to mutate");
                return false;
            }
            z9a z9aVar = new z9a(y9aVar);
            zRetainAll = z9aVar.retainAll(s72.o1(collection));
            y9a y9aVarD = z9aVar.d();
            if (y9aVarD.equals(y9aVar)) {
                break;
            }
            h1e h1eVar2 = this.a;
            synchronized (qrd.c) {
                irdVarH = qrd.h();
                zS = z7f.s((h1e) qrd.w(h1eVar2, this, irdVarH), i, y9aVarD);
            }
            qrd.l(irdVarH, this);
        } while (!zS);
        return zRetainAll;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return z7f.H(this).c.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return bzd.J(this);
    }

    public final String toString() {
        return "SnapshotStateSet(value=" + ((h1e) qrd.f(this.a)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        y9a y9aVar = z7f.H(this).c;
        parcel.writeInt(size());
        Iterator it = y9aVar.iterator();
        if (it.hasNext()) {
            parcel.writeValue(it.next());
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return bzd.K(this, objArr);
    }
}
