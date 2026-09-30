package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cmc {
    public final e56 a;
    public final e56 b;

    public cmc(e56 e56Var, e56 e56Var2) {
        this.a = e56Var;
        this.b = e56Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmc)) {
            return false;
        }
        cmc cmcVar = (cmc) obj;
        return this.a == cmcVar.a && this.b == cmcVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SeasonalInAppProductTypes(regular=" + this.a + ", earlyBird=" + this.b + ")";
    }
}
