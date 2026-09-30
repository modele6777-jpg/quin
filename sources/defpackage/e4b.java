package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e4b implements j9e {
    public String a;

    public ue1 a() {
        if (this.a != null) {
            return new ue1(this);
        }
        qc0.j("Product type must be set");
        return null;
    }

    @Override // defpackage.j9e
    public String f() {
        return this.a;
    }

    @Override // defpackage.j9e
    public void g(i9e i9eVar) {
    }
}
