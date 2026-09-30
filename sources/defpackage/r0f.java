package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r0f {
    public final int a;

    public /* synthetic */ r0f(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r0f) {
            return this.a == ((r0f) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return tec.k("TorchMode(value=", this.a, ')');
    }
}
