package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class by1 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ a26 c;
    public final /* synthetic */ aw2 d;
    public final /* synthetic */ fo5 e;

    public /* synthetic */ by1(boolean z, a26 a26Var, aw2 aw2Var, fo5 fo5Var, int i) {
        this.a = i;
        this.b = z;
        this.c = a26Var;
        this.d = aw2Var;
        this.e = fo5Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        fo5 fo5Var = this.e;
        aw2 aw2Var = this.d;
        a26 a26Var = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                if (!z) {
                    a26Var.d(Boolean.TRUE);
                    ynb.V(aw2Var, null, null, new dy1(fo5Var, null), 3);
                } else {
                    a26Var.d(Boolean.FALSE);
                }
                break;
            default:
                if (!z) {
                    a26Var.d(Boolean.TRUE);
                    ynb.V(aw2Var, null, null, new iy1(fo5Var, null), 3);
                } else {
                    a26Var.d(Boolean.FALSE);
                }
                break;
        }
        return wefVar;
    }
}
