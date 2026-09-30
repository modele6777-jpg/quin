package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jv4 {
    public final String a;

    public jv4(String str) {
        if (str != null) {
            this.a = str;
        } else {
            r82.g("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv4)) {
            return false;
        }
        return this.a.equals(((jv4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return ks0.l(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
