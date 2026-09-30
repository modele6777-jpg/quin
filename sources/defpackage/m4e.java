package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m4e implements g00 {
    public final String a;

    public /* synthetic */ m4e(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m4e) {
            return pa7.t(this.a, ((m4e) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ib8.j("StringAnnotation(value=", this.a, ")");
    }
}
