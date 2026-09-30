package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pvg extends vtg {
    public final transient Object f;

    public pvg(Object obj) {
        super(1);
        this.f = obj;
    }

    @Override // defpackage.olg
    public final int a(Object[] objArr) {
        objArr[0] = this.f;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f.equals(obj);
    }

    @Override // defpackage.vtg, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // defpackage.olg
    public final gff i() {
        return new hug(this.f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new hug(this.f);
    }

    @Override // defpackage.vtg
    public final qtg m() {
        Object[] objArr = {this.f};
        for (int i = 0; i < 1; i++) {
            wsg wsgVar = qtg.d;
            if (objArr[i] == null) {
                r82.g(tec.e(i, "at index "));
                return null;
            }
        }
        return qtg.o(1, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return ib8.j("[", this.f.toString(), "]");
    }
}
