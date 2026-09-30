package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j84 implements zk9 {
    public final /* synthetic */ l84 a;

    public j84(l84 l84Var) {
        this.a = l84Var;
    }

    @Override // defpackage.zk9
    public final void a(Object obj) {
        if (((x48) obj) != null) {
            l84 l84Var = this.a;
            if (l84Var.o1) {
                yg5.k(l84Var, " did not return a View from onCreateView() or this was called before onCreateView().", "Fragment ");
            }
        }
    }
}
