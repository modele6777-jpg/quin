package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class x5c extends gbe implements l26 {
    final /* synthetic */ ol1 $continuation;
    final /* synthetic */ w5c $this_startTransactionCoroutine;
    final /* synthetic */ l26 $transactionBlock;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5c(w5c w5cVar, ol1 ol1Var, l26 l26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_startTransactionCoroutine = w5cVar;
        this.$continuation = ol1Var;
        this.$transactionBlock = l26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        x5c x5cVar = new x5c(this.$this_startTransactionCoroutine, this.$continuation, this.$transactionBlock, xn2Var);
        x5cVar.L$0 = obj;
        return x5cVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        xn2 xn2Var;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            nv2 nv2VarF0 = ((aw2) this.L$0).getCoroutineContext().F0(hj6.Z);
            nv2VarF0.getClass();
            sv2 sv2Var = (sv2) nv2VarF0;
            w5c w5cVar = this.$this_startTransactionCoroutine;
            pv2 pv2VarI = i7h.I(sv2Var, new j2f(sv2Var));
            pv2 pv2VarP0 = pv2VarI.p0(new fwe(pv2VarI, w5cVar.i));
            ol1 ol1Var = this.$continuation;
            l26 l26Var = this.$transactionBlock;
            this.L$0 = ol1Var;
            this.label = 1;
            obj = ynb.p0(pv2VarP0, l26Var, this);
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
            xn2Var = ol1Var;
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xn2Var = (xn2) this.L$0;
            jzb.q(obj);
        }
        xn2Var.g(obj);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((x5c) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
