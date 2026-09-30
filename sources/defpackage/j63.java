package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j63 extends gbe implements l26 {
    final /* synthetic */ String $skinKey;
    final /* synthetic */ d63 $success;
    int label;
    final /* synthetic */ y63 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j63(y63 y63Var, d63 d63Var, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = y63Var;
        this.$success = d63Var;
        this.$skinKey = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new j63(this.this$0, this.$success, this.$skinKey, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            gd8 gd8Var = this.this$0.e;
            String str = this.$success.a;
            String str2 = this.$skinKey;
            this.label = 1;
            Object objO = gd8Var.o(str, str2, this);
            bw2 bw2Var = bw2.a;
            if (objO == bw2Var) {
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
        return ((j63) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
