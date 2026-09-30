package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yj b;
    public final /* synthetic */ int c;

    public /* synthetic */ wj(yj yjVar, int i, int i2) {
        this.a = i2;
        this.b = yjVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x16 x16Var;
        x16 x16Var2;
        int i = this.a;
        int i2 = this.c;
        yj yjVar = this.b;
        switch (i) {
            case 0:
                if (!yjVar.v && yjVar.w == i2 && (x16Var = yjVar.b) != null) {
                    x16Var.invoke();
                    break;
                }
                break;
            default:
                if (!yjVar.v && yjVar.w == i2 && (x16Var2 = yjVar.c) != null) {
                    x16Var2.invoke();
                    break;
                }
                break;
        }
    }
}
