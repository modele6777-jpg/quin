package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vkd extends ry6 {
    public final transient Object d;

    public vkd(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override // defpackage.ry6, defpackage.ay6
    public final jy6 a() {
        return jy6.s(this.d);
    }

    @Override // defpackage.ay6
    public final int c(int i, Object[] objArr) {
        objArr[i] = this.d;
        return i + 1;
    }

    @Override // defpackage.ay6, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // defpackage.ry6, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // defpackage.ay6
    public final boolean i() {
        return false;
    }

    @Override // defpackage.ay6
    /* JADX INFO: renamed from: j */
    public final gff iterator() {
        return new ld7(this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.d.toString() + ']';
    }

    @Override // defpackage.ry6, defpackage.ay6
    public Object writeReplace() {
        return super.writeReplace();
    }
}
