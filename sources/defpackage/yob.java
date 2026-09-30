package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yob extends jy6 {
    public static final yob e = new yob(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public yob(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.jy6, defpackage.ay6
    public final int c(int i, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i2 = this.d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.ay6
    public final Object[] d() {
        return this.c;
    }

    @Override // defpackage.ay6
    public final int e() {
        return this.d;
    }

    @Override // defpackage.ay6
    public final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        pa7.C(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.ay6
    public final boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // defpackage.jy6, defpackage.ay6
    public Object writeReplace() {
        return super.writeReplace();
    }
}
