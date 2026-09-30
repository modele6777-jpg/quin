package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g08 extends gbe implements l26 {
    int label;
    final /* synthetic */ h08 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g08(h08 h08Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = h08Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new g08(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            wz wzVar = this.this$0.b;
            Float f = new Float(0.0f);
            fxd fxdVarP = b21.P(0.0f, 400.0f, 1, new Float(0.5f));
            this.label = 1;
            Object objV = hkg.V(wzVar, f, fxdVarP, true, null, this, 8);
            bw2 bw2Var = bw2.a;
            if (objV == bw2Var) {
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
        return ((g08) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
