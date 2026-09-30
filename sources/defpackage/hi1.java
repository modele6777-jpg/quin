package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hi1 implements vta {
    public final /* synthetic */ int a;
    public final /* synthetic */ pi1 b;

    public /* synthetic */ hi1(pi1 pi1Var, int i) {
        this.a = i;
        this.b = pi1Var;
    }

    @Override // defpackage.vta
    public final void a(wae waeVar) {
        Object value;
        Object value2;
        int i = this.a;
        pi1 pi1Var = this.b;
        switch (i) {
            case 0:
                waeVar.getClass();
                s0e s0eVar = pi1Var.d;
                do {
                    value = s0eVar.getValue();
                } while (!s0eVar.l(value, waeVar));
                break;
            default:
                waeVar.getClass();
                s0e s0eVar2 = pi1Var.d;
                do {
                    value2 = s0eVar2.getValue();
                } while (!s0eVar2.l(value2, waeVar));
                break;
        }
    }
}
