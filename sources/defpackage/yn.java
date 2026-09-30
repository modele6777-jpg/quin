package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yn extends gbe implements a26 {
    final /* synthetic */ n26 $block;
    int label;
    final /* synthetic */ mo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn(mo moVar, xn2 xn2Var, n26 n26Var) {
        super(1, xn2Var);
        this.this$0 = moVar;
        this.$block = n26Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new yn(this.this$0, (xn2) obj, this.$block).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            mo moVar = this.this$0;
            tn tnVar = new tn(moVar, 1);
            wn wnVar = new wn(moVar, null, this.$block);
            this.label = 1;
            Object objE = jn.e(tnVar, wnVar, this);
            bw2 bw2Var = bw2.a;
            if (objE == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        Object objA = this.this$0.b().a(this.this$0.j.j());
        if (objA != null) {
            if (Math.abs(this.this$0.j.j() - this.this$0.b().e(objA)) < 0.5f && ((Boolean) this.this$0.a.d(objA)).booleanValue()) {
                this.this$0.h.setValue(objA);
                this.this$0.g.setValue(objA);
            }
        }
        return wef.a;
    }
}
