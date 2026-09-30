package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p45 implements c98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ p45(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.c98
    public final void d(Object obj) {
        int i = this.a;
        boolean z = this.b;
        xga xgaVar = (xga) obj;
        switch (i) {
            case 0:
                xgaVar.n(z);
                break;
            default:
                xgaVar.y(z);
                break;
        }
    }
}
