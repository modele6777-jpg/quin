package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s1f implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mfc b;

    public /* synthetic */ s1f(mfc mfcVar, int i) {
        this.a = i;
        this.b = mfcVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        mfc mfcVar = mfc.b;
        mfc mfcVar2 = this.b;
        l1f l1fVar = (l1f) obj;
        switch (i) {
            case 0:
                l1fVar.getClass();
                l1fVar.a(mfcVar2 == mfcVar ? "neo" : "classic", "theme");
                break;
            default:
                l1fVar.getClass();
                l1fVar.a(mfcVar2 == mfcVar ? "neo" : "classic", "theme");
                break;
        }
        return wefVar;
    }
}
