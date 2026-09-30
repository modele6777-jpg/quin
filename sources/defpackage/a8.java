package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a8 implements euc {
    public final /* synthetic */ int a;
    public final /* synthetic */ ma8 b;

    public /* synthetic */ a8(ma8 ma8Var, int i) {
        this.a = i;
        this.b = ma8Var;
    }

    @Override // defpackage.euc
    public final boolean a(long j) {
        int i = this.a;
        ma8 ma8Var = this.b;
        switch (i) {
            case 0:
                th5 th5Var = cye.b;
                th5Var.getClass();
                w57 w57Var = w57.a;
                return gcc.E(mh3.x(j), th5Var).a().compareTo(ma8Var) <= 0;
            default:
                th5 th5Var2 = cye.b;
                th5Var2.getClass();
                w57 w57Var2 = w57.a;
                return gcc.E(mh3.x(j), th5Var2).a().compareTo(ma8Var) <= 0;
        }
    }
}
