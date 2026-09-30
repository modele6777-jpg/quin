package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bpb extends ry6 {
    public final transient ny6 d;
    public final transient cpb e;

    public bpb(ny6 ny6Var, cpb cpbVar) {
        this.d = ny6Var;
        this.e = cpbVar;
    }

    @Override // defpackage.ry6, defpackage.ay6
    public final jy6 a() {
        return this.e;
    }

    @Override // defpackage.ay6
    public final int c(int i, Object[] objArr) {
        return this.e.c(i, objArr);
    }

    @Override // defpackage.ay6, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // defpackage.ay6
    public final boolean i() {
        return true;
    }

    @Override // defpackage.ay6
    /* JADX INFO: renamed from: j */
    public final gff iterator() {
        return this.e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((dpb) this.d).f;
    }

    @Override // defpackage.ry6, defpackage.ay6
    public Object writeReplace() {
        return super.writeReplace();
    }
}
