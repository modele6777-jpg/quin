package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xg4 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw2 b;
    public final /* synthetic */ yx9 c;
    public final /* synthetic */ ghc d;

    public /* synthetic */ xg4(aw2 aw2Var, yx9 yx9Var, ghc ghcVar, int i) {
        this.a = i;
        this.b = aw2Var;
        this.c = yx9Var;
        this.d = ghcVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        ghc ghcVar = this.d;
        yx9 yx9Var = this.c;
        aw2 aw2Var = this.b;
        switch (i) {
            case 0:
                ynb.V(aw2Var, null, null, new zg4(yx9Var, ghcVar, null), 3);
                break;
            case 1:
                ynb.V(aw2Var, null, null, new u19(yx9Var, ghcVar, null), 3);
                break;
            default:
                ynb.V(aw2Var, null, null, new toc(yx9Var, ghcVar, null), 3);
                break;
        }
        return wefVar;
    }
}
