package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z0a extends gbe implements a26 {
    final /* synthetic */ l26 $block;
    final /* synthetic */ k2f $type;
    int label;
    final /* synthetic */ a1a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0a(a1a a1aVar, k2f k2fVar, l26 l26Var, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = a1aVar;
        this.$type = k2fVar;
        this.$block = l26Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new z0a(this.this$0, this.$type, this.$block, (xn2) obj).r(wef.a);
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
        a1a a1aVar = this.this$0;
        k2f k2fVar = this.$type;
        l26 l26Var = this.$block;
        this.label = 1;
        Object objE = a1aVar.e(k2fVar, l26Var, this);
        bw2 bw2Var = bw2.a;
        return objE == bw2Var ? bw2Var : objE;
    }
}
