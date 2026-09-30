package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gse extends gbe implements l26 {
    int label;
    final /* synthetic */ jse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gse(jse jseVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = jseVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new gse(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        jse jseVar = this.this$0;
        this.label = 1;
        jseVar.getClass();
        ybc ybcVarP = jzb.p(new hv0(jseVar, 5));
        xre xreVar = xre.a;
        fnc fncVar = dj6.d;
        z7f.t(2, xreVar);
        Object objB = dj6.J(ybcVarP, fncVar, xreVar).b(new jl5(new kmb(), new yre(jseVar, 0)), this);
        bw2 bw2Var = bw2.a;
        if (objB != bw2Var) {
            objB = wefVar;
        }
        if (objB != bw2Var) {
            objB = wefVar;
        }
        return objB == bw2Var ? bw2Var : wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((gse) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
