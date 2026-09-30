package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bw9 extends gbe implements l26 {
    final /* synthetic */ cgb $exposure;
    final /* synthetic */ ggb $tracker;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw9(xn2 xn2Var, cgb cgbVar, ggb ggbVar) {
        super(2, xn2Var);
        this.$exposure = cgbVar;
        this.$tracker = ggbVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new bw9(xn2Var, this.$exposure, this.$tracker);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object objP0;
        int i = this.label;
        wef wefVar = wef.a;
        if (i == 0) {
            jzb.q(obj);
            cgb cgbVar = this.$exposure;
            if (cgbVar != null) {
                ggb ggbVar = this.$tracker;
                this.L$0 = null;
                this.label = 1;
                ggbVar.getClass();
                boolean zQ = v4e.Q(cgbVar.a);
                bw2 bw2Var = bw2.a;
                if (zQ || (objP0 = ynb.p0(fg9.b, new fgb(null, cgbVar, ggbVar), this)) != bw2Var) {
                    objP0 = wefVar;
                }
                if (objP0 == bw2Var) {
                    return bw2Var;
                }
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((bw9) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
