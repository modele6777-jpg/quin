package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qh0 implements t0b {
    public final int b;

    public qh0(int i) {
        this.b = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return t0b.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0b)) {
            return false;
        }
        t0b t0bVar = (t0b) obj;
        return this.b == t0bVar.tag() && s0b.a.equals(t0bVar.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.b ^ 14552422) + (s0b.a.hashCode() ^ 2041407134);
    }

    @Override // defpackage.t0b
    public final s0b intEncoding() {
        return s0b.a;
    }

    @Override // defpackage.t0b
    public final int tag() {
        return this.b;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.b + "intEncoding=" + s0b.a + ')';
    }
}
