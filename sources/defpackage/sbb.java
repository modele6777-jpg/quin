package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sbb extends gbe implements l26 {
    final /* synthetic */ String $chatId;
    int label;
    final /* synthetic */ fcb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbb(fcb fcbVar, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = fcbVar;
        this.$chatId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new sbb(this.this$0, this.$chatId, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            zcb zcbVar = this.this$0.a;
            String str = this.$chatId;
            this.label = 1;
            obj = zcbVar.b(str, this);
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
        this.this$0.a(new rbb(((Number) obj).intValue(), null));
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((sbb) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
