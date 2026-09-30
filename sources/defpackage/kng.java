package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kng extends uog {
    public final transient uog e;

    public kng(uog uogVar) {
        super(0);
        this.e = uogVar;
    }

    @Override // defpackage.uog, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.e.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        uog uogVar = this.e;
        tgc.n(i, uogVar.size());
        return uogVar.get((uogVar.size() - 1) - i);
    }

    @Override // defpackage.uog, java.util.List
    public final int indexOf(Object obj) {
        uog uogVar = this.e;
        int iLastIndexOf = uogVar.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (uogVar.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.uog, java.util.List
    public final int lastIndexOf(Object obj) {
        uog uogVar = this.e;
        int iIndexOf = uogVar.indexOf(obj);
        if (iIndexOf >= 0) {
            return (uogVar.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // defpackage.uog
    public final uog m() {
        return this.e;
    }

    @Override // defpackage.uog, java.util.List
    /* JADX INFO: renamed from: n */
    public final uog subList(int i, int i2) {
        uog uogVar = this.e;
        tgc.o(i, i2, uogVar.size());
        return uogVar.subList(uogVar.size() - i2, uogVar.size() - i).m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e.size();
    }
}
