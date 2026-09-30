package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ntg extends qtg {
    public final transient qtg e;

    public ntg(qtg qtgVar) {
        super(1);
        this.e = qtgVar;
    }

    @Override // defpackage.qtg, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.e.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        qtg qtgVar = this.e;
        v2c.B(i, qtgVar.size());
        return qtgVar.get((qtgVar.size() - 1) - i);
    }

    @Override // defpackage.qtg, java.util.List
    public final int indexOf(Object obj) {
        qtg qtgVar = this.e;
        int iLastIndexOf = qtgVar.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (qtgVar.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.qtg, java.util.List
    public final int lastIndexOf(Object obj) {
        qtg qtgVar = this.e;
        int iIndexOf = qtgVar.indexOf(obj);
        if (iIndexOf >= 0) {
            return (qtgVar.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // defpackage.qtg
    public final qtg m() {
        return this.e;
    }

    @Override // defpackage.qtg, java.util.List
    /* JADX INFO: renamed from: n */
    public final qtg subList(int i, int i2) {
        qtg qtgVar = this.e;
        v2c.C(i, i2, qtgVar.size());
        return qtgVar.subList(qtgVar.size() - i2, qtgVar.size() - i).m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e.size();
    }
}
