package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jbd extends gbe implements l26 {
    int label;
    final /* synthetic */ lbd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbd(lbd lbdVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = lbdVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new jbd(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        lbd lbdVar = this.this$0;
        vc4 vc4Var = lbdVar.f;
        String divinationId = lbdVar.d.getDivinationId();
        this.label = 1;
        Object objK = urg.K(this, new ks2(20, divinationId, vc4Var), vc4Var.a, true, false);
        bw2 bw2Var = bw2.a;
        return objK == bw2Var ? bw2Var : objK;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((jbd) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
