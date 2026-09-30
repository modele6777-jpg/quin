package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class eo extends gbe implements a26 {
    final /* synthetic */ o26 $block;
    final /* synthetic */ Object $targetValue;
    int label;
    final /* synthetic */ lo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo(lo loVar, Object obj, o26 o26Var, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = loVar;
        this.$targetValue = obj;
        this.$block = o26Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new eo(this.this$0, this.$targetValue, this.$block, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            this.this$0.h(this.$targetValue);
            lo loVar = this.this$0;
            sn snVar = new sn(loVar, 3);
            bo boVar = new bo(this.$block, loVar, null);
            this.label = 1;
            Object objO = y41.O(snVar, boVar, this);
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
}
