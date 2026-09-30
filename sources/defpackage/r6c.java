package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class r6c {
    public final float a;
    public final float b;

    public r6c(int i) {
        float f = (i & 8) != 0 ? 8.0f : 1.0f;
        float f2 = (i & 16) != 0 ? 1.5f : 0.0f;
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6c)) {
            return false;
        }
        r6c r6cVar = (r6c) obj;
        return Float.compare(1.0f, 1.0f) == 0 && Float.compare(0.5f, 0.5f) == 0 && Float.compare(this.a, r6cVar.a) == 0 && Float.compare(this.b, r6cVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + ub3.a(this.a, ub3.a(0.5f, ub3.a(1.0f, 31, 31), 31), 31);
    }

    public final String toString() {
        return kv2.k("Rotation(enabled=true, speed=1.0, variance=0.5, multiplier2D=", this.a, ", multiplier3D=", this.b, ")");
    }
}
