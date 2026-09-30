package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rn6 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a08 b;

    public /* synthetic */ rn6(a08 a08Var, int i) {
        this.a = i;
        this.b = a08Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        a08 a08Var = null;
        a08 a08Var2 = this.b;
        ra4 ra4Var = (ra4) obj;
        switch (i) {
            case 0:
                ra4Var.getClass();
                if (a08Var2 != null) {
                    a08Var2.a();
                    a08Var = a08Var2;
                }
                return new un6(a08Var, 0);
            case 1:
                ra4Var.getClass();
                if (a08Var2 != null) {
                    a08Var2.a();
                    a08Var = a08Var2;
                }
                return new un6(a08Var, 1);
            default:
                return new un6(a08Var2, 2);
        }
    }
}
