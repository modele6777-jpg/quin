package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class aug extends mtg {
    public static final aug e = new aug(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public aug(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.mtg, defpackage.usg
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.usg
    public final int c() {
        return this.d;
    }

    @Override // defpackage.usg
    public final int d() {
        return 0;
    }

    @Override // defpackage.usg
    public final boolean g() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        q1c.k(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.usg
    public final Object[] i() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
