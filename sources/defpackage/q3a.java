package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q3a implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3a b;

    public /* synthetic */ q3a(y3a y3aVar, int i) {
        this.a = i;
        this.b = y3aVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        y3a y3aVar = this.b;
        switch (i) {
            case 0:
                return ((eab) y3aVar.R0).b();
            default:
                if (pa7.t(y3aVar.T0, "onboarding_finish")) {
                    tj7 tj7Var = tj7.L0;
                    ca2.a.getClass();
                    if (ca2.c) {
                        x1f x1fVar = x1f.a;
                        x1f.k(new r05("restore_purchase_trigger"), tj7Var, 2);
                    }
                }
                y3aVar.f(new z3(y3aVar, null));
                return wef.a;
        }
    }
}
