package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j3f implements i3f {
    public final Object a;
    public final Object b;

    public j3f(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.i3f
    public final Object b() {
        return this.a;
    }

    @Override // defpackage.i3f
    public final Object d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i3f)) {
            return false;
        }
        i3f i3fVar = (i3f) obj;
        return pa7.t(this.a, i3fVar.b()) && pa7.t(this.b, i3fVar.d());
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
