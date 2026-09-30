package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cpe implements k82, v26 {
    public final /* synthetic */ uw7 a;

    public cpe(uw7 uw7Var) {
        this.a = uw7Var;
    }

    @Override // defpackage.k82
    public final long a() {
        return ((y72) this.a.get()).a;
    }

    @Override // defpackage.v26
    public final m26 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k82) || !(obj instanceof v26)) {
            return false;
        }
        return this.a.equals(((v26) obj).b());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
