package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a68 implements tq5 {
    public final float a;

    public a68(float f) {
        this.a = f;
    }

    @Override // defpackage.tq5
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.tq5
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a68) && Float.compare(this.a, ((a68) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return kv2.j("LinearFontScaleConverter(fontScale=", this.a, ")");
    }
}
