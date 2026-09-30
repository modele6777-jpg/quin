package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q14 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw2 b;
    public final /* synthetic */ nb4 c;

    public /* synthetic */ q14(aw2 aw2Var, nb4 nb4Var, int i) {
        this.a = i;
        this.b = aw2Var;
        this.c = nb4Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        nb4 nb4Var = this.c;
        aw2 aw2Var = this.b;
        switch (i) {
            case 0:
                ynb.V(aw2Var, null, null, new a24(nb4Var, null), 3);
                break;
            case 1:
                ynb.V(aw2Var, null, null, new d24(nb4Var, null), 3);
                break;
            case 2:
                ynb.V(aw2Var, null, null, new e24(nb4Var, null), 3);
                break;
            default:
                ynb.V(aw2Var, null, null, new f24(nb4Var, null), 3);
                break;
        }
        return wefVar;
    }
}
