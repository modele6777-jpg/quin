package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y1c extends gbe implements a26 {
    final /* synthetic */ String $accountId;
    int label;
    final /* synthetic */ k2c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1c(k2c k2cVar, String str, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = k2cVar;
        this.$accountId = str;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new y1c(this.this$0, this.$accountId, (xn2) obj).r(wef.a);
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
        p1c p1cVar = this.this$0.a;
        String str = this.$accountId;
        this.label = 1;
        Object objD = p1cVar.d(str, this);
        bw2 bw2Var = bw2.a;
        return objD == bw2Var ? bw2Var : objD;
    }
}
