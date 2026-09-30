package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ca6 extends gbe implements a26 {
    final /* synthetic */ wa6 $tab;
    int label;
    final /* synthetic */ ea6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca6(ea6 ea6Var, wa6 wa6Var, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = ea6Var;
        this.$tab = wa6Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new ca6(this.this$0, this.$tab, (xn2) obj).r(wef.a);
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
        r76 r76Var = this.this$0.a;
        String strA = this.$tab.a();
        this.label = 1;
        Object objB = r76Var.b(strA, this);
        bw2 bw2Var = bw2.a;
        return objB == bw2Var ? bw2Var : objB;
    }
}
