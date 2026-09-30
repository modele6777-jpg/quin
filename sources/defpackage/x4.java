package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x4 extends gbe implements l26 {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ y4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(y4 y4Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = y4Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        x4 x4Var = new x4(this.this$0, xn2Var);
        x4Var.J$0 = ((hl9) obj).a;
        return x4Var;
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
        long j = this.J$0;
        y4 y4Var = this.this$0;
        this.label = 1;
        Object objB = ohc.b(((yhc) y4Var).g1, j, this);
        bw2 bw2Var = bw2.a;
        return objB == bw2Var ? bw2Var : objB;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        long j = ((hl9) obj).a;
        x4 x4Var = new x4(this.this$0, (xn2) obj2);
        x4Var.J$0 = j;
        return x4Var.r(wef.a);
    }
}
