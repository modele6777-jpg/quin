package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fpb extends ry6 {
    public static final Object[] w;
    public static final fpb x;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int g;
    public final transient int v;

    static {
        Object[] objArr = new Object[0];
        w = objArr;
        x = new fpb(0, 0, 0, objArr, objArr);
    }

    public fpb(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i;
        this.f = objArr2;
        this.g = i2;
        this.v = i3;
    }

    @Override // defpackage.ay6
    public final int c(int i, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i2 = this.v;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.ay6, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int iP = rs0.P(obj);
                while (true) {
                    int i = iP & this.g;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iP = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ay6
    public final Object[] d() {
        return this.d;
    }

    @Override // defpackage.ay6
    public final int e() {
        return this.v;
    }

    @Override // defpackage.ay6
    public final int g() {
        return 0;
    }

    @Override // defpackage.ry6, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // defpackage.ay6
    public final boolean i() {
        return false;
    }

    @Override // defpackage.ay6
    /* JADX INFO: renamed from: j */
    public final gff iterator() {
        return a().listIterator(0);
    }

    @Override // defpackage.ry6
    public final jy6 p() {
        return jy6.k(this.v, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.v;
    }

    @Override // defpackage.ry6, defpackage.ay6
    public Object writeReplace() {
        return super.writeReplace();
    }
}
