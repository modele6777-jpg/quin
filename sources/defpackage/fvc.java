package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fvc implements ul9, v26 {
    public final /* synthetic */ x16 a;

    public fvc(x16 x16Var) {
        this.a = x16Var;
    }

    @Override // defpackage.ul9
    public final /* synthetic */ long a() {
        return ((hl9) this.a.invoke()).a;
    }

    @Override // defpackage.v26
    public final m26 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ul9) || !(obj instanceof v26)) {
            return false;
        }
        return pa7.t(this.a, ((v26) obj).b());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
