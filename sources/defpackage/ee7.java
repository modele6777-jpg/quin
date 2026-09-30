package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ee7 extends gbe implements l26 {
    final /* synthetic */ isa $key;
    final /* synthetic */ Object $value;
    int label;
    final /* synthetic */ fe7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee7(fe7 fe7Var, isa isaVar, Object obj, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = fe7Var;
        this.$key = isaVar;
        this.$value = obj;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ee7(this.this$0, this.$key, this.$value, xn2Var);
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
        fc3 fc3Var = this.this$0.c;
        de7 de7Var = new de7(this.$key, this.$value, null);
        this.label = 1;
        Object objA = fc3Var.a(new lsa(de7Var, null), this);
        bw2 bw2Var = bw2.a;
        return objA == bw2Var ? bw2Var : objA;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ee7) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
