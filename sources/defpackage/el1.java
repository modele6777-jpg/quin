package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class el1 extends gbe implements l26 {
    final /* synthetic */ h0e $currentImplementationMode$delegate;
    final /* synthetic */ wae $surfaceRequest;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el1(wae waeVar, h0e h0eVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$surfaceRequest = waeVar;
        this.$currentImplementationMode$delegate = h0eVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        el1 el1Var = new el1(this.$surfaceRequest, this.$currentImplementationMode$delegate, xn2Var);
        el1Var.L$0 = obj;
        return el1Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            xva xvaVar = (xva) this.L$0;
            wae waeVar = this.$surfaceRequest;
            mc0 mc0Var = new mc0(1);
            waeVar.j.a(new j1(15, xvaVar), mc0Var);
            s0e s0eVarA = t0e.a(null);
            this.$surfaceRequest.b(new mc0(1), new jv2(7, s0eVarA));
            tl5 tl5Var = new tl5(new wm5(jzb.p(new zk1(1, this.$currentImplementationMode$delegate)), new hl5(if9.n(s0eVarA), 1), new cl1(3, null), 0), new dl1(new mmb(), this.$surfaceRequest, null));
            qb1 qb1Var = new qb1(2, xvaVar, this.$surfaceRequest);
            this.label = 1;
            Object objB = tl5Var.b(qb1Var, this);
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
        return ((el1) k((xn2) obj2, (xva) obj)).r(wef.a);
    }
}
