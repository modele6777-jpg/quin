package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yl5 extends gbe implements l26 {
    final /* synthetic */ wj5 $this_transformWhile;
    final /* synthetic */ n26 $transform;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl5(wj5 wj5Var, n26 n26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_transformWhile = wj5Var;
        this.$transform = n26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        yl5 yl5Var = new yl5(this.$this_transformWhile, this.$transform, xn2Var);
        yl5Var.L$0 = obj;
        return yl5Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        xl5 xl5Var;
        xj5 xj5Var = (xj5) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            wj5 wj5Var = this.$this_transformWhile;
            xl5 xl5Var2 = new xl5(this.$transform, xj5Var);
            try {
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = xl5Var2;
                this.I$0 = 0;
                this.label = 1;
                Object objB = wj5Var.b(xl5Var2, this);
                bw2 bw2Var = bw2.a;
                if (objB == bw2Var) {
                    return bw2Var;
                }
            } catch (l e) {
                e = e;
                xl5Var = xl5Var2;
                if (e.a == xl5Var) {
                    throw e;
                }
                tq.v(getContext());
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xl5Var = (xl5) this.L$2;
            try {
                jzb.q(obj);
            } catch (l e2) {
                e = e2;
                if (e.a == xl5Var) {
                    throw e;
                }
                tq.v(getContext());
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((yl5) k((xn2) obj2, (xj5) obj)).r(wef.a);
    }
}
