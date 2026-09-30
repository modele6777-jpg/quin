package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tn9 extends gbe implements l26 {
    final /* synthetic */ wf3 $dateState;
    final /* synthetic */ h0e $latestOnEdited$delegate;
    final /* synthetic */ h0e $latestOnSelected$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn9(wf3 wf3Var, h0e h0eVar, h0e h0eVar2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$dateState = wf3Var;
        this.$latestOnEdited$delegate = h0eVar;
        this.$latestOnSelected$delegate = h0eVar2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new tn9(this.$dateState, this.$latestOnEdited$delegate, this.$latestOnSelected$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            mmb mmbVarD = ks0.d(obj);
            mmbVarD.element = ((xf3) this.$dateState).b();
            ybc ybcVarP = jzb.p(new zv6(24, this.$dateState));
            gz gzVar = new gz(mmbVarD, this.$latestOnEdited$delegate, this.$latestOnSelected$delegate);
            this.L$0 = null;
            this.label = 1;
            Object objB = ybcVarP.b(gzVar, this);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
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

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((tn9) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
