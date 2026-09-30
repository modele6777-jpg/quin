package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xc2 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ghc b;

    public /* synthetic */ xc2(ghc ghcVar, int i) {
        this.a = i;
        this.b = ghcVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int iJ;
        int i = this.a;
        ghc ghcVar = this.b;
        switch (i) {
            case 0:
                iJ = ghcVar.a.j();
                break;
            case 1:
                return Boolean.valueOf(ghcVar.a.j() < ghcVar.f.j());
            case 2:
                return Boolean.valueOf(ghcVar.a.j() > 0);
            case 3:
                iJ = ghcVar.f.j();
                break;
            default:
                iJ = ghcVar.f.j();
                break;
        }
        return Integer.valueOf(iJ);
    }
}
