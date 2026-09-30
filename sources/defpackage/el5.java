package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class el5 extends gbe implements o26 {
    final /* synthetic */ l26 $predicate;
    final /* synthetic */ long $retries;
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el5(long j, l26 l26Var, xn2 xn2Var) {
        super(4, xn2Var);
        this.$retries = j;
        this.$predicate = l26Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Throwable th = (Throwable) this.L$0;
        long j = this.J$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            if (j < this.$retries) {
                l26 l26Var = this.$predicate;
                this.L$0 = null;
                this.J$0 = j;
                this.label = 1;
                obj = l26Var.z(th, this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        boolean z = ((Boolean) obj).booleanValue();
        return Boolean.valueOf(z);
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        el5 el5Var = new el5(this.$retries, this.$predicate, (xn2) obj4);
        el5Var.L$0 = (Throwable) obj2;
        el5Var.J$0 = jLongValue;
        return el5Var.r(wef.a);
    }
}
