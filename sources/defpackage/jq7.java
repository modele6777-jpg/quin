package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jq7 extends bzd {
    public final String o;

    public jq7(String str) {
        str.getClass();
        this.o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jq7) && pa7.t(this.o, ((jq7) obj).o);
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final String toString() {
        return ub3.l(new StringBuilder("TypeAlias(name="), this.o, ')');
    }
}
