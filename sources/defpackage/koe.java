package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class koe implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ape b;

    public /* synthetic */ koe(ape apeVar, int i) {
        this.a = i;
        this.b = apeVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        sue sueVar = sue.c;
        wef wefVar = wef.a;
        ape apeVar = this.b;
        switch (i) {
            case 0:
                ynb.V(apeVar.Z0(), null, null, new ooe(apeVar, null), 3);
                return Boolean.TRUE;
            case 1:
                apeVar.S0 = (e7g) eb3.H(apeVar, zg2.u);
                apeVar.H0.h = apeVar.q1();
                if (apeVar.q1() && apeVar.T0 == null) {
                    apeVar.T0 = ynb.V(apeVar.Z0(), null, null, new soe(apeVar, null), 3);
                } else if (!apeVar.q1()) {
                    lyd lydVar = apeVar.T0;
                    if (lydVar != null) {
                        lydVar.h(null);
                    }
                    apeVar.T0 = null;
                }
                return wefVar;
            case 2:
                vd0.o0(apeVar);
                return wefVar;
            case 3:
                vd0.o0(apeVar);
                return wefVar;
            case 4:
                return b21.B(apeVar);
            case 5:
                return b21.B(apeVar) != null ? ioe.b : ioe.a;
            case 6:
                ynb.V(apeVar.Z0(), null, null, new poe(apeVar, null), 3);
                return Boolean.TRUE;
            case 7:
                return apeVar.F0.a.d().c.toString();
            case 8:
                if (apeVar.q1()) {
                    ((dw3) apeVar.s1()).b();
                } else {
                    vo5 vo5Var = apeVar.O0;
                    if (vo5Var.Y) {
                        oo5.t1(vo5Var.K0);
                    }
                }
                return Boolean.TRUE;
            case 9:
                if (!apeVar.q1()) {
                    vo5 vo5Var2 = apeVar.O0;
                    if (vo5Var2.Y) {
                        oo5.t1(vo5Var2.K0);
                    }
                }
                apeVar.H0.x(sueVar);
                return Boolean.TRUE;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ynb.V(apeVar.Z0(), null, null, new noe(apeVar, null), 3);
                return Boolean.TRUE;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (apeVar.W0 != null) {
                    ((dw3) apeVar.s1()).b();
                } else {
                    apeVar.t1(true);
                }
                return wefVar;
            default:
                apeVar.H0.x(sueVar);
                return wefVar;
        }
    }
}
