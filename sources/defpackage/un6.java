package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class un6 implements qa4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a08 b;

    public /* synthetic */ un6(a08 a08Var, int i) {
        this.a = i;
        this.b = a08Var;
    }

    @Override // defpackage.qa4
    public final void a() {
        int i = this.a;
        a08 a08Var = this.b;
        switch (i) {
            case 0:
                if (a08Var != null) {
                    a08Var.b();
                }
                break;
            case 1:
                if (a08Var != null) {
                    a08Var.b();
                }
                break;
            default:
                a08Var.f = true;
                a08Var.d = 0;
                a08Var.b.a.remove(a08Var);
                a08 a08Var2 = a08Var.e;
                if (a08Var2 != null) {
                    a08Var2.b();
                }
                a08Var.e = null;
                break;
        }
    }
}
