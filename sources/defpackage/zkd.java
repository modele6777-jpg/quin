package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zkd {
    public final int a;
    public final float b;

    static {
        new zkd(6, 4.0f, 4);
        new zkd(8, 0.0f, 6);
        new zkd(10, 6.0f, 4);
    }

    public zkd(int i, float f, int i2) {
        f = (i2 & 2) != 0 ? 5.0f : f;
        this.a = i;
        this.b = f;
        if (f != 0.0f) {
            return;
        }
        qc0.o(kv2.j("mass=", f, " must be != 0"));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkd)) {
            return false;
        }
        zkd zkdVar = (zkd) obj;
        return this.a == zkdVar.a && Float.compare(this.b, zkdVar.b) == 0 && Float.compare(0.2f, 0.2f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(0.2f) + ub3.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "Size(sizeInDp=" + this.a + ", mass=" + this.b + ", massVariance=0.2)";
    }
}
