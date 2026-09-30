package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wy8 extends gbe implements l26 {
    final /* synthetic */ String $accountId;
    int label;
    final /* synthetic */ xy8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy8(xy8 xy8Var, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = xy8Var;
        this.$accountId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new wy8(this.this$0, this.$accountId, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
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
        inf infVar = this.this$0.a;
        String str = this.$accountId;
        this.label = 1;
        Object objH = infVar.h(str, "popup_weekend-free-credit", this);
        bw2 bw2Var = bw2.a;
        return objH == bw2Var ? bw2Var : objH;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((wy8) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
