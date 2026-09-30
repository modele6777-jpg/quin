package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kq7 extends bzd {
    public final int o;

    public kq7(int i) {
        this.o = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kq7) && this.o == ((kq7) obj).o;
    }

    public final int hashCode() {
        return Integer.hashCode(this.o);
    }

    public final String toString() {
        return tec.n(new StringBuilder("TypeParameter(id="), this.o, ')');
    }
}
