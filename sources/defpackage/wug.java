package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wug extends qtg {
    public static final wug g = new wug(0, new Object[0]);
    public final transient Object[] e;
    public final transient int f;

    public wug(int i, Object[] objArr) {
        super(1);
        this.e = objArr;
        this.f = i;
    }

    @Override // defpackage.qtg, defpackage.olg
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.e;
        int i = this.f;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.olg
    public final int c() {
        return this.f;
    }

    @Override // defpackage.olg
    public final int e() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        v2c.B(i, this.f);
        Object obj = this.e[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.olg
    public final Object[] j() {
        return this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f;
    }
}
