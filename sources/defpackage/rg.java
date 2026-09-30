package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rg implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x16 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ p5a e;

    public /* synthetic */ rg(x16 x16Var, String str, String str2, p5a p5aVar, int i) {
        this.a = i;
        this.b = x16Var;
        this.c = str;
        this.d = str2;
        this.e = p5aVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        p5a p5aVar = this.e;
        String str = this.d;
        String str2 = this.c;
        x16 x16Var = this.b;
        switch (i) {
            case 0:
                x1f x1fVar = x1f.a;
                x1f.k(new r05("paywall_action"), new vg(str2, str, p5aVar, 0), 2);
                x16Var.invoke();
                break;
            default:
                x1f x1fVar2 = x1f.a;
                x1f.k(new r05("paywall_action"), new vg(str2, str, p5aVar, 1), 2);
                x16Var.invoke();
                break;
        }
        return wefVar;
    }
}
