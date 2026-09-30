package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n2c {
    public final boolean a;
    public final u0c b;
    public final w57 c;

    public n2c(boolean z, u0c u0cVar, w57 w57Var) {
        w57Var.getClass();
        this.a = z;
        this.b = u0cVar;
        this.c = w57Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2c)) {
            return false;
        }
        n2c n2cVar = (n2c) obj;
        return this.a == n2cVar.a && this.b == n2cVar.b && pa7.t(this.c, n2cVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "ReviewRewardPromptInput(isFeatureEnabled=" + this.a + ", claimStatus=" + this.b + ", now=" + this.c + ")";
    }
}
