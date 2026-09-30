package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h9 extends gbe implements l26 {
    final /* synthetic */ String $accountId;
    final /* synthetic */ nu3 $fetch;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ o9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9(o9 o9Var, String str, nu3 nu3Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = o9Var;
        this.$accountId = str;
        this.$fetch = nu3Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new h9(this.this$0, this.$accountId, this.$fetch, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        o9 o9Var;
        d99 d99Var;
        String str;
        nu3 nu3Var;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            o9Var = this.this$0;
            f99 f99Var = o9Var.d;
            String str2 = this.$accountId;
            nu3 nu3Var2 = this.$fetch;
            this.L$0 = f99Var;
            this.L$1 = o9Var;
            this.L$2 = str2;
            this.L$3 = nu3Var2;
            this.label = 1;
            Object objB = f99Var.b(this);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
            d99Var = f99Var;
            str = str2;
            nu3Var = nu3Var2;
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nu3Var = (nu3) this.L$3;
            str = (String) this.L$2;
            o9Var = (o9) this.L$1;
            d99Var = (d99) this.L$0;
            jzb.q(obj);
        }
        try {
            if (o9Var.v.get(str) == nu3Var) {
                o9Var.v.remove(str);
            }
            return wef.a;
        } finally {
            d99Var.h(null);
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((h9) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
