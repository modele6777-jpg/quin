package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ts0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a80 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ts0(a80 a80Var, Object obj, int i) {
        this.a = i;
        this.b = a80Var;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        a80 a80Var = this.b;
        switch (i) {
            case 0:
                if (a80Var.b == 0) {
                    a80Var.K(obj);
                }
                break;
            default:
                int i2 = a80Var.b - 1;
                a80Var.b = i2;
                if (i2 == 0) {
                    a80Var.K(obj);
                }
                break;
        }
    }
}
