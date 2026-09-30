package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mj8 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oj8 b;

    public /* synthetic */ mj8(oj8 oj8Var, int i) {
        this.a = i;
        this.b = oj8Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        oj8 oj8Var = this.b;
        switch (i) {
            case 0:
                oj8Var.n1();
                return wef.a;
            case 1:
                return new hl9(oj8Var.R0);
            default:
                bv7 bv7Var = (bv7) oj8Var.P0.getValue();
                return new hl9(bv7Var != null ? bv7Var.N(0L) : 9205357640488583168L);
        }
    }
}
