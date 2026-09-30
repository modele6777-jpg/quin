package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ce8 {
    public final Object a;
    public final x16 b;

    public ce8(Object obj, x16 x16Var) {
        this.a = obj;
        this.b = x16Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ce8.class == obj.getClass() && this.a.equals(((ce8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
