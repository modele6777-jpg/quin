package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class il6 extends gbe implements l26 {
    final /* synthetic */ fc4 $key;
    int label;
    final /* synthetic */ ol6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il6(ol6 ol6Var, fc4 fc4Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = ol6Var;
        this.$key = fc4Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new il6(this.this$0, this.$key, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            tc4 tc4Var = this.this$0.b;
            String str = this.$key.a;
            this.label = 1;
            Object objC = tc4Var.c(str, this);
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
        return ((il6) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
