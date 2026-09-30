package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cvg extends vtg {
    public static final Object[] y;
    public static final cvg z;
    public final transient Object[] f;
    public final transient int g;
    public final transient Object[] v;
    public final transient int w;
    public final transient int x;

    static {
        Object[] objArr = new Object[0];
        y = objArr;
        z = new cvg(0, 0, 0, objArr, objArr);
    }

    public cvg(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(1);
        this.f = objArr;
        this.g = i;
        this.v = objArr2;
        this.w = i2;
        this.x = i3;
    }

    @Override // defpackage.olg
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f;
        int i = this.x;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.olg
    public final int c() {
        return this.x;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.v;
        if (objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
        while (true) {
            int i = iRotateLeft & this.w;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i + 1;
        }
    }

    @Override // defpackage.olg
    public final int e() {
        return 0;
    }

    @Override // defpackage.vtg, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.g;
    }

    @Override // defpackage.olg
    public final gff i() {
        return m().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return m().listIterator(0);
    }

    @Override // defpackage.olg
    public final Object[] j() {
        return this.f;
    }

    @Override // defpackage.vtg
    public final qtg n() {
        return qtg.o(this.x, this.f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.x;
    }
}
