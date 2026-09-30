package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p2f implements zt0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p2f(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.zt0
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((q2f) obj).k = true;
                break;
            case 1:
                ((q2f) obj).k = true;
                break;
            case 2:
                ((q2f) obj).k = true;
                break;
            default:
                eu0 eu0Var = (eu0) obj;
                boolean z = eu0Var.r.i() == 1.0f;
                if (z != eu0Var.x) {
                    eu0Var.x = z;
                    eu0Var.o.invalidateSelf();
                }
                break;
        }
    }
}
