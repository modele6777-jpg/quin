package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xca implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw2 b;
    public final /* synthetic */ ted c;
    public final /* synthetic */ e89 d;

    public /* synthetic */ xca(aw2 aw2Var, ted tedVar, e89 e89Var, int i) {
        this.a = i;
        this.b = aw2Var;
        this.c = tedVar;
        this.d = e89Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        e89 e89Var = this.d;
        ted tedVar = this.c;
        aw2 aw2Var = this.b;
        switch (i) {
            case 0:
                ynb.V(aw2Var, null, null, new cda(tedVar, e89Var, null), 3);
                break;
            default:
                ynb.V(aw2Var, null, null, new hnc(tedVar, e89Var, null), 3);
                break;
        }
        return wefVar;
    }
}
