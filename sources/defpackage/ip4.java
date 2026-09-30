package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ip4 extends gbe implements l26 {
    final /* synthetic */ sdd $this_DrawnCardLayout;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip4(sdd sddVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_DrawnCardLayout = sddVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ip4(this.$this_DrawnCardLayout, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        kl5 kl5Var = new kl5(jzb.p(new ov1(this.$this_DrawnCardLayout, 1)), new gp4(2, null), 0);
        hp4 hp4Var = new hp4(2, null);
        this.label = 1;
        Object objC = tm7.C(kl5Var, hp4Var, this);
        bw2 bw2Var = bw2.a;
        return objC == bw2Var ? bw2Var : objC;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ip4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
