package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tm implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sw3 b;

    public /* synthetic */ tm(sw3 sw3Var, int i) {
        this.a = i;
        this.b = sw3Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        float fP0;
        int i = this.a;
        sw3 sw3Var = this.b;
        switch (i) {
            case 0:
                fP0 = sw3Var.p0(125.0f);
                break;
            default:
                fP0 = sw3Var.p0(100.0f);
                break;
        }
        return Float.valueOf(fP0);
    }
}
