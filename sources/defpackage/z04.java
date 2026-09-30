package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z04 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw2 b;

    public /* synthetic */ z04(aw2 aw2Var, int i) {
        this.a = i;
        this.b = aw2Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        aw2 aw2Var = this.b;
        switch (i) {
            case 0:
                ynb.V(aw2Var, null, null, new j54(2, null), 3);
                return wef.a;
            default:
                return Float.valueOf(hkg.v0(aw2Var.getCoroutineContext()));
        }
    }
}
