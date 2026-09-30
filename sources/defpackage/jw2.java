package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jw2 extends gbe implements l26 {
    final /* synthetic */ l26 $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw2(l26 l26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$block = l26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        jw2 jw2Var = new jw2(this.$block, xn2Var);
        jw2Var.L$0 = obj;
        return jw2Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        aw2 aw2Var = (aw2) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            l26 l26Var = this.$block;
            this.L$0 = null;
            this.label = 1;
            Object objZ = l26Var.z(aw2Var, this);
            bw2 bw2Var = bw2.a;
            if (objZ == bw2Var) {
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
        return ((jw2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
