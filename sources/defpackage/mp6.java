package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mp6 extends gbe implements l26 {
    final /* synthetic */ long $delayMillis;
    int label;
    final /* synthetic */ kq6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp6(long j, kq6 kq6Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$delayMillis = j;
        this.this$0 = kq6Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new mp6(this.$delayMillis, this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            long j = this.$delayMillis;
            if (j < 1000) {
                j = 1000;
            }
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
        this.this$0.h();
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((mp6) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
