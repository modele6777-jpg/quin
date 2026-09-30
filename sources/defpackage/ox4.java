package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ox4 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ px4 b;

    public /* synthetic */ ox4(px4 px4Var, int i) {
        this.a = i;
        this.b = px4Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        lf9 lf9Var = lf9.f;
        px4 px4Var = this.b;
        switch (i) {
            case 0:
                t99 t99Var = (t99) obj;
                if (t99Var != null) {
                    return px4Var.j(t99Var, px4Var.i().b(t99Var, lf9Var));
                }
                px4.h(8);
                throw null;
            default:
                t99 t99Var2 = (t99) obj;
                if (t99Var2 != null) {
                    return px4Var.j(t99Var2, px4Var.i().f(t99Var2, lf9Var));
                }
                px4.h(4);
                throw null;
        }
    }
}
