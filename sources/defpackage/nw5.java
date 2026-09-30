package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nw5 extends gbe implements l26 {
    final /* synthetic */ yic $campaign;
    int label;
    final /* synthetic */ rw5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw5(rw5 rw5Var, yic yicVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = rw5Var;
        this.$campaign = yicVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new nw5(this.this$0, this.$campaign, xn2Var);
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
        rw5 rw5Var = this.this$0;
        yic yicVar = this.$campaign;
        this.label = 1;
        Enum enumA = rw5Var.a(yicVar, this);
        bw2 bw2Var = bw2.a;
        return enumA == bw2Var ? bw2Var : enumA;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((nw5) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
