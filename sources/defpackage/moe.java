package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class moe implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ape b;

    public /* synthetic */ moe(ape apeVar, int i) {
        this.a = i;
        this.b = apeVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        a52 a52Var;
        int i = this.a;
        String strK = null;
        ape apeVar = this.b;
        switch (i) {
            case 0:
                a52 a52Var2 = (a52) obj;
                apeVar.p1();
                apeVar.H0.b();
                String strK2 = hfc.k(a52Var2);
                yib yibVarB = b21.B(apeVar);
                if (yibVarB != null) {
                    sug sugVarD = ((wr4) yibVarB).b.d(new sug(a52Var2, 1, 19));
                    if (sugVarD != null && (a52Var = (a52) sugVarD.c) != null) {
                        strK = hfc.k(a52Var);
                    }
                    strK2 = strK;
                }
                if (strK2 != null) {
                    z2f.h(apeVar.F0, strK2, false, false, 30);
                }
                return Boolean.TRUE;
            default:
                ynb.V(apeVar.Z0(), null, dw2.d, new roe((lo7) obj, apeVar, ((Boolean) obj2).booleanValue(), null), 1);
                return wef.a;
        }
    }
}
