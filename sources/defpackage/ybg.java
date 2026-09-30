package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ybg extends gbe implements l26 {
    int label;
    final /* synthetic */ ccg this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybg(ccg ccgVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = ccgVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ybg(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
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
        ccg ccgVar = this.this$0;
        this.label = 1;
        Object objC = ccgVar.c(this);
        bw2 bw2Var = bw2.a;
        return objC == bw2Var ? bw2Var : objC;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ybg) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
