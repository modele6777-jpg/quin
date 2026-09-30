package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mb8 extends gbe implements l26 {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        mb8 mb8Var = new mb8(2, xn2Var);
        mb8Var.L$0 = obj;
        return mb8Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        String str = (String) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            isa isaVar = xqa.m.a;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            Object objN = bsa.n(isaVar, str, this);
            bw2 bw2Var = bw2.a;
            if (objN == bw2Var) {
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

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((mb8) k((xn2) obj2, (String) obj)).r(wef.a);
    }
}
