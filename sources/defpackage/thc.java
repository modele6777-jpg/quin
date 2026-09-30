package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class thc extends gbe implements l26 {
    final /* synthetic */ wj4 $event;
    int label;
    final /* synthetic */ yhc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public thc(wj4 wj4Var, yhc yhcVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$event = wj4Var;
        this.this$0 = yhcVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new thc(this.$event, this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            wj4 wj4Var = this.$event;
            float f = wj4Var.b ? -1.0f : 1.0f;
            gic gicVar = this.this$0.g1;
            long jF = zsf.f(wj4Var.a, f);
            this.label = 1;
            Object objC = gicVar.c(jF, false, this);
            bw2 bw2Var = bw2.a;
            if (objC == bw2Var) {
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
        return ((thc) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
