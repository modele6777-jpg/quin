package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ppb implements si8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pl1 b;

    public /* synthetic */ ppb(pl1 pl1Var, int i) {
        this.a = i;
        this.b = pl1Var;
    }

    @Override // defpackage.si8
    public final void onResult(Object obj) {
        int i = this.a;
        pl1 pl1Var = this.b;
        switch (i) {
            case 0:
                if (!pl1Var.z()) {
                    pl1Var.g(obj);
                }
                break;
            default:
                Throwable th = (Throwable) obj;
                if (!pl1Var.z()) {
                    th.getClass();
                    pl1Var.g(new dzb(th));
                }
                break;
        }
    }
}
