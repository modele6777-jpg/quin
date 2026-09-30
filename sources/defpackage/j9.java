package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j9 extends gbe implements l26 {
    final /* synthetic */ String $accountId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ o9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(o9 o9Var, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = o9Var;
        this.$accountId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        j9 j9Var = new j9(this.this$0, this.$accountId, xn2Var);
        j9Var.L$0 = obj;
        return j9Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                o9 o9Var = this.this$0;
                String str = this.$accountId;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                int i2 = o9.z;
                obj = o9Var.b(str, false, this);
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
        } catch (Throwable unused) {
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((j9) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
