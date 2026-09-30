package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g8a implements gv2 {
    public final float a;

    public g8a(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            l37.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.gv2
    public final float a(long j, sw3 sw3Var) {
        return (this.a / 100.0f) * ald.c(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g8a) && Float.compare(this.a, ((g8a) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return kv2.j("CornerSize(size = ", this.a, "%)");
    }
}
