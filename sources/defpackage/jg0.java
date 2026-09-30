package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jg0 extends df0 {
    public final char l;

    public jg0(char c) {
        this.l = c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jg0) && this.l == ((jg0) obj).l;
    }

    public final int hashCode() {
        return Character.hashCode(this.l);
    }

    public final String toString() {
        return "AstUnorderedList(bulletMarker=" + this.l + ")";
    }
}
