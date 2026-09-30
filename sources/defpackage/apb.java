package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class apb extends ry6 {
    public final transient ny6 d;
    public final transient Object[] e;
    public final transient int f;

    public apb(ny6 ny6Var, Object[] objArr, int i) {
        this.d = ny6Var;
        this.e = objArr;
        this.f = i;
    }

    @Override // defpackage.ay6
    public final int c(int i, Object[] objArr) {
        return a().c(i, objArr);
    }

    @Override // defpackage.ay6, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ay6
    public final boolean i() {
        return true;
    }

    @Override // defpackage.ay6
    /* JADX INFO: renamed from: j */
    public final gff iterator() {
        return a().listIterator(0);
    }

    @Override // defpackage.ry6
    public final jy6 p() {
        return new zob(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }

    @Override // defpackage.ry6, defpackage.ay6
    public Object writeReplace() {
        return super.writeReplace();
    }
}
