package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hu extends gbe implements l26 {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ iu this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu(iu iuVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = iuVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        hu huVar = new hu(this.this$0, xn2Var);
        huVar.L$0 = obj;
        return huVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            l47 l47Var = (l47) this.L$0;
            iu iuVar = this.this$0;
            this.L$0 = l47Var;
            this.L$1 = iuVar;
            this.label = 1;
            pl1 pl1Var = new pl1(1, k99.D(this));
            pl1Var.v();
            gte gteVar = iuVar.b;
            gga ggaVar = gteVar.a;
            ggaVar.a();
            gteVar.b.set(new jte(gteVar, ggaVar));
            pl1Var.x(new d5(2, l47Var, iuVar));
            Object objT = pl1Var.t();
            bw2 bw2Var = bw2.a;
            if (objT == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        oo3.f();
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((hu) k((xn2) obj2, (l47) obj)).r(wef.a);
        return bw2.a;
    }
}
