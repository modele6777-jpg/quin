package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m92 extends gbe implements l26 {
    int label;
    final /* synthetic */ n92 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m92(n92 n92Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = n92Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new m92(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            long jB = ((rvf) eb3.H(this.this$0, zg2.t)).b();
            this.label = 1;
            Object objQ = vfh.q(jB, this);
            bw2 bw2Var = bw2.a;
            if (objQ == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        x16 x16Var = this.this$0.Z0;
        if (x16Var != null) {
            x16Var.invoke();
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((m92) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
