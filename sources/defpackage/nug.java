package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nug extends utg {
    public static final Object[] w;
    public static final nug x;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int g;
    public final transient int v;

    static {
        Object[] objArr = new Object[0];
        w = objArr;
        x = new nug(0, 0, 0, objArr, objArr);
    }

    public nug(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i;
        this.f = objArr2;
        this.g = i2;
        this.v = i3;
    }

    @Override // defpackage.usg
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.d;
        int i = this.v;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.usg
    public final int c() {
        return this.v;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.f;
        if (objArr.length == 0) {
            return false;
        }
        int iO = o5c.o(obj.hashCode());
        while (true) {
            int i = iO & this.g;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iO = i + 1;
        }
    }

    @Override // defpackage.usg
    public final int d() {
        return 0;
    }

    @Override // defpackage.utg, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // defpackage.usg
    public final Object[] i() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return e().listIterator(0);
    }

    @Override // defpackage.utg
    public final mtg k() {
        return mtg.k(this.v, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.v;
    }
}
