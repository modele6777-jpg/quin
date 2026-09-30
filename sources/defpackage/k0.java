package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;

    public /* synthetic */ k0(b1 b1Var, int i) {
        this.a = i;
        this.b = b1Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        rv3 rv3Var;
        int i = this.a;
        b1 b1Var = this.b;
        switch (i) {
            case 0:
                r17 r17Var = (r17) eb3.H(b1Var, o17.a);
                if (r17Var == null) {
                    l37.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + r17Var);
                }
                r17 r17Var2 = b1Var.N0;
                b1Var.N0 = r17Var;
                if (r17Var2 != null && !pa7.t(r17Var, r17Var2) && ((rv3Var = b1Var.Q0) != null || !b1Var.X0)) {
                    if (rv3Var != null) {
                        b1Var.m1(rv3Var);
                    }
                    b1Var.Q0 = null;
                    b1Var.w1();
                }
                return wef.a;
            default:
                b1Var.A1();
                return Boolean.TRUE;
        }
    }
}
