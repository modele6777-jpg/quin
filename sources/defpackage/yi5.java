package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yi5 {
    public final int a;

    static {
        t72.I(new yi5(0), new yi5(1), new yi5(2));
    }

    public /* synthetic */ yi5(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yi5) {
            return this.a == ((yi5) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return tec.k("FlashMode(value=", this.a, ')');
    }
}
