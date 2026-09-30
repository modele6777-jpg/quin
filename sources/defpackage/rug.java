package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rug extends utg {
    public final transient Object d;

    public rug(Object obj) {
        this.d = obj;
    }

    @Override // defpackage.usg
    public final int a(Object[] objArr) {
        objArr[0] = this.d;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // defpackage.utg, defpackage.usg
    public final mtg e() {
        Object[] objArr = {this.d};
        for (int i = 0; i < 1; i++) {
            vsg vsgVar = mtg.b;
            if (objArr[i] == null) {
                r82.g(tec.e(i, "at index "));
                return null;
            }
        }
        return mtg.k(1, objArr);
    }

    @Override // defpackage.utg, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new xtg(this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return ib8.j("[", this.d.toString(), "]");
    }
}
