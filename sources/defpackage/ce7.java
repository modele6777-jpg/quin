package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ce7 extends gbe implements l26 {
    final /* synthetic */ Object $defaultValue;
    final /* synthetic */ isa $key;
    int label;
    final /* synthetic */ fe7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce7(fe7 fe7Var, isa isaVar, Object obj, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = fe7Var;
        this.$key = isaVar;
        this.$defaultValue = obj;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ce7(this.this$0, this.$key, this.$defaultValue, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object objC;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            wj5 data = this.this$0.c.getData();
            this.label = 1;
            obj = tm7.D(data, this);
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        p79 p79Var = (p79) obj;
        return (p79Var == null || (objC = p79Var.c(this.$key)) == null) ? this.$defaultValue : objC;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ce7) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
