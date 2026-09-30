package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jsd implements Parcelable, c1e, List, RandomAccess, an7 {
    public static final Parcelable.Creator<jsd> CREATOR = new isd(0);
    public y0e a;

    public jsd(i4 i4Var) {
        ird irdVarH = qrd.h();
        y0e y0eVar = new y0e(irdVarH.g(), i4Var);
        if (!(irdVarH instanceof qb6)) {
            y0eVar.b = new y0e(1L, i4Var);
        }
        this.a = y0eVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        i4 i4Var;
        ird irdVarH;
        boolean zJ;
        do {
            synchronized (z5c.h) {
                y0e y0eVar = this.a;
                y0eVar.getClass();
                y0e y0eVar2 = (y0e) qrd.f(y0eVar);
                i = y0eVar2.d;
                i4Var = y0eVar2.c;
            }
            i4Var.getClass();
            i4 i4VarE = i4Var.e(obj);
            if (i4VarE.equals(i4Var)) {
                return false;
            }
            y0e y0eVar3 = this.a;
            y0eVar3.getClass();
            synchronized (qrd.c) {
                irdVarH = qrd.h();
                zJ = z5c.j((y0e) qrd.w(y0eVar3, this, irdVarH), i, i4VarE, true);
            }
            qrd.l(irdVarH, this);
        } while (!zJ);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        i4 i4Var;
        ird irdVarH;
        boolean zJ;
        do {
            synchronized (z5c.h) {
                y0e y0eVar = this.a;
                y0eVar.getClass();
                y0e y0eVar2 = (y0e) qrd.f(y0eVar);
                i = y0eVar2.d;
                i4Var = y0eVar2.c;
            }
            i4Var.getClass();
            i4 i4VarG = i4Var.g(collection);
            if (pa7.t(i4VarG, i4Var)) {
                return false;
            }
            y0e y0eVar3 = this.a;
            y0eVar3.getClass();
            synchronized (qrd.c) {
                irdVarH = qrd.h();
                zJ = z5c.j((y0e) qrd.w(y0eVar3, this, irdVarH), i, i4VarG, true);
            }
            qrd.l(irdVarH, this);
        } while (!zJ);
        return true;
    }

    @Override // defpackage.c1e
    public final f1e c() {
        return this.a;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        ird irdVarH;
        y0e y0eVar = this.a;
        y0eVar.getClass();
        synchronized (qrd.c) {
            irdVarH = qrd.h();
            y0e y0eVar2 = (y0e) qrd.w(y0eVar, this, irdVarH);
            synchronized (z5c.h) {
                y0eVar2.c = rpd.b;
                y0eVar2.d++;
                y0eVar2.e++;
            }
        }
        qrd.l(irdVarH, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return z5c.z(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return z5c.z(this).c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(int i, int i2) {
        int i3;
        i4 i4Var;
        ird irdVarH;
        boolean zJ;
        do {
            synchronized (z5c.h) {
                y0e y0eVar = this.a;
                y0eVar.getClass();
                y0e y0eVar2 = (y0e) qrd.f(y0eVar);
                i3 = y0eVar2.d;
                i4Var = y0eVar2.c;
            }
            i4Var.getClass();
            caa caaVarI = i4Var.i();
            caaVarI.subList(i, i2).clear();
            i4 i4VarE = caaVarI.e();
            if (pa7.t(i4VarE, i4Var)) {
                return;
            }
            y0e y0eVar3 = this.a;
            y0eVar3.getClass();
            synchronized (qrd.c) {
                irdVarH = qrd.h();
                zJ = z5c.j((y0e) qrd.w(y0eVar3, this, irdVarH), i3, i4VarE, true);
            }
            qrd.l(irdVarH, this);
        } while (!zJ);
    }

    @Override // defpackage.c1e
    public final void f(f1e f1eVar) {
        f1eVar.b = this.a;
        this.a = (y0e) f1eVar;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return z5c.z(this).c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return z5c.z(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return z5c.z(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return z5c.z(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new ql6(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        i4 i4Var;
        ird irdVarH;
        boolean zJ;
        do {
            synchronized (z5c.h) {
                y0e y0eVar = this.a;
                y0eVar.getClass();
                y0e y0eVar2 = (y0e) qrd.f(y0eVar);
                i = y0eVar2.d;
                i4Var = y0eVar2.c;
            }
            i4Var.getClass();
            int iIndexOf = i4Var.indexOf(obj);
            i4 i4VarK = iIndexOf != -1 ? i4Var.k(iIndexOf) : i4Var;
            if (i4VarK.equals(i4Var)) {
                return false;
            }
            y0e y0eVar3 = this.a;
            y0eVar3.getClass();
            synchronized (qrd.c) {
                irdVarH = qrd.h();
                zJ = z5c.j((y0e) qrd.w(y0eVar3, this, irdVarH), i, i4VarK, true);
            }
            qrd.l(irdVarH, this);
        } while (!zJ);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        i4 i4Var;
        ird irdVarH;
        boolean zJ;
        do {
            synchronized (z5c.h) {
                y0e y0eVar = this.a;
                y0eVar.getClass();
                y0e y0eVar2 = (y0e) qrd.f(y0eVar);
                i = y0eVar2.d;
                i4Var = y0eVar2.c;
            }
            i4Var.getClass();
            i4 i4VarJ = i4Var.j(new h4(0, collection));
            if (pa7.t(i4VarJ, i4Var)) {
                return false;
            }
            y0e y0eVar3 = this.a;
            y0eVar3.getClass();
            synchronized (qrd.c) {
                irdVarH = qrd.h();
                zJ = z5c.j((y0e) qrd.w(y0eVar3, this, irdVarH), i, i4VarJ, true);
            }
            qrd.l(irdVarH, this);
        } while (!zJ);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return z5c.E(this, new h4(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        i4 i4Var;
        ird irdVarH;
        boolean zJ;
        Object obj2 = get(i);
        do {
            synchronized (z5c.h) {
                y0e y0eVar = this.a;
                y0eVar.getClass();
                y0e y0eVar2 = (y0e) qrd.f(y0eVar);
                i2 = y0eVar2.d;
                i4Var = y0eVar2.c;
            }
            i4Var.getClass();
            i4 i4VarM = i4Var.m(i, obj);
            if (i4VarM.equals(i4Var)) {
                break;
            }
            y0e y0eVar3 = this.a;
            y0eVar3.getClass();
            synchronized (qrd.c) {
                irdVarH = qrd.h();
                zJ = z5c.j((y0e) qrd.w(y0eVar3, this, irdVarH), i2, i4VarM, false);
            }
            qrd.l(irdVarH, this);
        } while (!zJ);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return z5c.z(this).c.c();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            epa.a("fromIndex or toIndex are out of bounds");
        }
        return new j6e(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return bzd.J(this);
    }

    public final String toString() {
        y0e y0eVar = this.a;
        y0eVar.getClass();
        return "SnapshotStateList(value=" + ((y0e) qrd.f(y0eVar)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        i4 i4Var = z5c.z(this).c;
        int iC = i4Var.c();
        parcel.writeInt(iC);
        for (int i2 = 0; i2 < iC; i2++) {
            parcel.writeValue(i4Var.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return bzd.K(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new ql6(this, i);
    }

    public jsd() {
        this(rpd.b);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        i4 i4Var;
        ird irdVarH;
        boolean zJ;
        do {
            synchronized (z5c.h) {
                y0e y0eVar = this.a;
                y0eVar.getClass();
                y0e y0eVar2 = (y0e) qrd.f(y0eVar);
                i2 = y0eVar2.d;
                i4Var = y0eVar2.c;
            }
            i4Var.getClass();
            i4 i4VarD = i4Var.d(i, obj);
            if (i4VarD.equals(i4Var)) {
                return;
            }
            y0e y0eVar3 = this.a;
            y0eVar3.getClass();
            synchronized (qrd.c) {
                irdVarH = qrd.h();
                zJ = z5c.j((y0e) qrd.w(y0eVar3, this, irdVarH), i2, i4VarD, true);
            }
            qrd.l(irdVarH, this);
        } while (!zJ);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return z5c.E(this, new vj(i, collection, 9));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        i4 i4Var;
        ird irdVarH;
        boolean zJ;
        Object obj = get(i);
        do {
            synchronized (z5c.h) {
                y0e y0eVar = this.a;
                y0eVar.getClass();
                y0e y0eVar2 = (y0e) qrd.f(y0eVar);
                i2 = y0eVar2.d;
                i4Var = y0eVar2.c;
            }
            i4Var.getClass();
            i4 i4VarK = i4Var.k(i);
            if (i4VarK.equals(i4Var)) {
                break;
            }
            y0e y0eVar3 = this.a;
            y0eVar3.getClass();
            synchronized (qrd.c) {
                irdVarH = qrd.h();
                zJ = z5c.j((y0e) qrd.w(y0eVar3, this, irdVarH), i2, i4VarK, true);
            }
            qrd.l(irdVarH, this);
        } while (!zJ);
        return obj;
    }
}
