package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ffd implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ egd b;

    public /* synthetic */ ffd(egd egdVar, int i) {
        this.a = i;
        this.b = egdVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        egd egdVar = this.b;
        switch (i) {
            case 0:
                k11 k11Var = egdVar.k;
                if (k11Var != null) {
                    k11Var.d(Boolean.TRUE);
                }
                return wefVar;
            case 1:
                return Integer.valueOf(egdVar.c.j());
            default:
                if (!egdVar.b() && egdVar.a() == hgd.b) {
                    egdVar.d(true);
                    vz9 vz9Var = egdVar.f;
                    Boolean bool = Boolean.TRUE;
                    vz9Var.setValue(bool);
                    egdVar.g.setValue(bool);
                }
                return wefVar;
        }
    }
}
