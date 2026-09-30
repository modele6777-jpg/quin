package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mu5 extends gbe implements l26 {
    int label;
    final /* synthetic */ vu5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu5(vu5 vu5Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = vu5Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new mu5(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            qv5 qv5Var = qv5.a;
            yic yicVar = this.this$0.P0;
            this.label = 1;
            Object objE = qv5Var.e(yicVar, this);
            bw2 bw2Var = bw2.a;
            if (objE == bw2Var) {
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
        return ((mu5) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
