package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ki8 implements ni8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oi8 b;

    public /* synthetic */ ki8(oi8 oi8Var, int i) {
        this.a = i;
        this.b = oi8Var;
    }

    @Override // defpackage.ni8
    public final void run() {
        int i = this.a;
        oi8 oi8Var = this.b;
        switch (i) {
            case 0:
                oi8Var.k();
                break;
            default:
                oi8Var.i();
                break;
        }
    }
}
