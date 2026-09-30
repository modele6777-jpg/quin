package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sje extends gbe implements a26 {
    final /* synthetic */ String $assetId;
    final /* synthetic */ String $chatId;
    int label;
    final /* synthetic */ uke this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sje(uke ukeVar, String str, String str2, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = ukeVar;
        this.$chatId = str;
        this.$assetId = str2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new sje(this.this$0, this.$chatId, this.$assetId, (xn2) obj).r(wef.a);
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
        wie wieVar = this.this$0.b;
        String str = this.$chatId;
        String str2 = this.$assetId;
        this.label = 1;
        Object objB = wieVar.b(str, str2, this);
        bw2 bw2Var = bw2.a;
        return objB == bw2Var ? bw2Var : objB;
    }
}
