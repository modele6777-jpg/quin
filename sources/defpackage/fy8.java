package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fy8 extends gbe implements a26 {
    Object L$0;
    Object L$1;
    int label;

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new fy8(1, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            hs3 hs3Var = xqa.o0;
            Boolean bool = Boolean.TRUE;
            isa isaVar = hs3Var.a;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            Object objO = bsa.o(isaVar, bool, this);
            bw2 bw2Var = bw2.a;
            if (objO == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }
}
