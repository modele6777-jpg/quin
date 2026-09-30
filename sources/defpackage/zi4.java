package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zi4 implements gv2 {
    public final float a;

    public zi4(float f) {
        this.a = f;
    }

    @Override // defpackage.gv2
    public final float a(long j, sw3 sw3Var) {
        return sw3Var.p0(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zi4) && yi4.b(this.a, ((zi4) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return kv2.j("CornerSize(size = ", this.a, ".dp)");
    }
}
