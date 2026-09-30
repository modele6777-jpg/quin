package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class g69 extends rxg implements Serializable {
    private static final long serialVersionUID = 0;
    public static final g69 z = new g69();
    private final int seed = 0;

    static {
        int i = rh6.a;
    }

    public final qp8 c0() {
        return new qp8(this.seed);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof g69) && this.seed == ((g69) obj).seed;
    }

    public final int hashCode() {
        return this.seed ^ g69.class.hashCode();
    }

    public final String toString() {
        return tec.g(this.seed, ")", new StringBuilder("Hashing.murmur3_128("));
    }
}
