package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rfh extends egh {
    public final l7h f;

    public /* synthetic */ rfh(l7h l7hVar) {
        super(false, null, null, 0);
        this.f = l7hVar;
    }

    @Override // defpackage.egh
    public final String l() {
        try {
            return (String) this.f.call();
        } catch (Exception e) {
            yg5.p(e);
            return null;
        }
    }
}
