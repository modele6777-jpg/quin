package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tw1 extends gbe implements l26 {
    final /* synthetic */ Object $element;
    final /* synthetic */ qxc $this_trySendBlocking;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw1(qxc qxcVar, Object obj, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_trySendBlocking = qxcVar;
        this.$element = obj;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        tw1 tw1Var = new tw1(this.$this_trySendBlocking, this.$element, xn2Var);
        tw1Var.L$0 = obj;
        return tw1Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object dzbVar;
        int i = this.label;
        Object pw1Var = wef.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                qxc qxcVar = this.$this_trySendBlocking;
                Object obj2 = this.$element;
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = 0;
                this.label = 1;
                Object objA = qxcVar.a(this, obj2);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            dzbVar = pw1Var;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        if (dzbVar instanceof dzb) {
            pw1Var = new pw1(ezb.a(dzbVar));
        }
        return new rw1(pw1Var);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((tw1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
