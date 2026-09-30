package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wa3 extends gbe implements l26 {
    final /* synthetic */ ya3 $kind;
    final /* synthetic */ nh9 $nm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa3(nh9 nh9Var, ya3 ya3Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$nm = nh9Var;
        this.$kind = ya3Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new wa3(this.$nm, this.$kind, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            this.label = 1;
            Object objQ = vfh.q(1000L, this);
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
        nh9 nh9Var = this.$nm;
        nh9Var.b.cancel(null, this.$kind.a());
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((wa3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
