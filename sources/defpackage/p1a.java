package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class p1a extends d2a {
    public final float c;
    public final float d;

    public p1a(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1a)) {
            return false;
        }
        p1a p1aVar = (p1a) obj;
        return Float.compare(this.c, p1aVar.c) == 0 && Float.compare(this.d, p1aVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        return kv2.k("MoveTo(x=", this.c, ", y=", this.d, ")");
    }
}
