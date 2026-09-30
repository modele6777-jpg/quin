package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jh3 extends gbe implements l26 {
    final /* synthetic */ long $debounceTime;
    final /* synthetic */ e89 $isClickable$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh3(long j, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$debounceTime = j;
        this.$isClickable$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new jh3(this.$debounceTime, this.$isClickable$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            long j = this.$debounceTime;
            this.label = 1;
            Object objQ = vfh.q(j, this);
            bw2 bw2Var = bw2.a;
            if (objQ == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        this.$isClickable$delegate.setValue(Boolean.TRUE);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((jh3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
