package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nod {
    public final l46 a;

    public /* synthetic */ nod(l46 l46Var) {
        this.a = l46Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nod) {
            return pa7.t(this.a, ((nod) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.a + ")";
    }
}
