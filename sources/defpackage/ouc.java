package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ouc implements puc {
    public final n07 a;

    public ouc(n07 n07Var) {
        n07Var.getClass();
        this.a = n07Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ouc) && pa7.t(this.a, ((ouc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TimesCard(product=" + this.a + ")";
    }
}
