package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qa7 extends bzb {
    final /* synthetic */ Object $receiver$inlined;
    final /* synthetic */ l26 $this_createCoroutineUnintercepted$inlined;
    private int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa7(xn2 xn2Var, xn2 xn2Var2, l26 l26Var) {
        super(xn2Var);
        this.$this_createCoroutineUnintercepted$inlined = l26Var;
        this.$receiver$inlined = xn2Var2;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                qc0.p("This coroutine had already completed");
                return null;
            }
            this.label = 2;
            jzb.q(obj);
            return obj;
        }
        this.label = 1;
        jzb.q(obj);
        this.$this_createCoroutineUnintercepted$inlined.getClass();
        l26 l26Var = this.$this_createCoroutineUnintercepted$inlined;
        z7f.t(2, l26Var);
        return l26Var.z(this.$receiver$inlined, this);
    }
}
