package defpackage;

import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zr9 extends o2 implements RandomAccess {
    public final a71[] a;
    public final int[] b;

    public zr9(a71[] a71VarArr, int[] iArr) {
        this.a = a71VarArr;
        this.b = iArr;
    }

    @Override // defpackage.d1
    public final int c() {
        return this.a.length;
    }

    @Override // defpackage.d1, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof a71) {
            return super.contains((a71) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.a[i];
    }

    @Override // defpackage.o2, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof a71) {
            return super.indexOf((a71) obj);
        }
        return -1;
    }

    @Override // defpackage.o2, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof a71) {
            return super.lastIndexOf((a71) obj);
        }
        return -1;
    }
}
