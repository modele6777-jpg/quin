package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gjf extends gbe implements l26 {
    final /* synthetic */ a26 $block;
    final /* synthetic */ ya2 $signal;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjf(ya2 ya2Var, xn2 xn2Var, a26 a26Var) {
        super(2, xn2Var);
        this.$block = a26Var;
        this.$signal = ya2Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new gjf(this.$signal, xn2Var, this.$block);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            a26 a26Var = this.$block;
            this.label = 1;
            obj = a26Var.d(this);
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        lmg.o0((nu3) obj, this.$signal);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((gjf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
