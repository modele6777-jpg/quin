package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d2c extends gbe implements a26 {
    final /* synthetic */ String $accountId;
    final /* synthetic */ n2c $input;
    int label;
    final /* synthetic */ k2c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2c(k2c k2cVar, String str, n2c n2cVar, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = k2cVar;
        this.$accountId = str;
        this.$input = n2cVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new d2c(this.this$0, this.$accountId, this.$input, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            p1c p1cVar = this.this$0.a;
            String str = this.$accountId;
            ckb ckbVar = new ckb(6, this.$input);
            this.label = 1;
            obj = p1cVar.f(str, ckbVar, this);
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
        return Boolean.valueOf(obj instanceof q2c);
    }
}
