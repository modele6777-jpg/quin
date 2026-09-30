package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qo2 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mma b;

    public /* synthetic */ qo2(mma mmaVar, int i) {
        this.a = i;
        this.b = mmaVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        Long lValueOf;
        int i = this.a;
        mma mmaVar = this.b;
        switch (i) {
            case 0:
                pqa pqaVar = (pqa) mmaVar.g;
                synchronized (pqaVar.a) {
                    if (pqaVar.d) {
                        lValueOf = null;
                    } else {
                        hs3 hs3Var = xqa.z0;
                        if (((Boolean) z5c.I(nu4.a, new nqa(hs3Var.a, hs3Var.b, null))).booleanValue()) {
                            lValueOf = null;
                        } else {
                            pqaVar.d = true;
                            long j = pqaVar.c + 1;
                            pqaVar.c = j;
                            lValueOf = Long.valueOf(j);
                        }
                    }
                }
                if (lValueOf != null) {
                    long jLongValue = lValueOf.longValue();
                    synchronized (mmaVar.S0) {
                        mmaVar.Y0 = jr5.a;
                        mmaVar.Z0 = false;
                        mmaVar.a1 = true;
                        mmaVar.b1 = false;
                    }
                    a62 a62VarA = hwf.a(mmaVar);
                    js3 js3Var = ga4.a;
                    ynb.V(a62VarA, hr3.c, null, new dma(mmaVar, jLongValue, null), 2);
                    r05 r05Var = new r05("popup_view");
                    m1f m1fVar = m1f.a;
                    oz5 oz5Var = new oz5(8);
                    x1f x1fVar = x1f.a;
                    x1f.g(r05Var, m1fVar, oz5Var);
                }
                return wef.a;
            case 1:
                mmaVar.G();
                return wef.a;
            case 2:
                hs3 hs3Var2 = xqa.y0;
                ynb.V(lw2.a, null, null, new qa0(hs3Var2.a, Boolean.TRUE, null), 3);
                mmaVar.G();
                return wef.a;
            case 3:
                hs3 hs3Var3 = xqa.N0;
                ynb.V(lw2.a, null, null, new na0(hs3Var3.a, Boolean.TRUE, null), 3);
                mmaVar.G();
                return wef.a;
            case 4:
                mmaVar.i(1);
                return wef.a;
            case 5:
                mmaVar.i(2);
                return wef.a;
            case 6:
                mmaVar.i(3);
                return wef.a;
            case 7:
                mmaVar.i(4);
                return wef.a;
            default:
                x1f x1fVar2 = x1f.a;
                x1f.k(p05.a, new tk6(4), 2);
                mmaVar.Q(xua.a);
                return wef.a;
        }
    }
}
