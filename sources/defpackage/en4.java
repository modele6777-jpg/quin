package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class en4 extends gbe implements l26 {
    final /* synthetic */ e89 $showModal$delegate;
    final /* synthetic */ boolean $trigger;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en4(boolean z, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$trigger = z;
        this.$showModal$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new en4(this.$trigger, this.$showModal$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            if (this.$trigger) {
                hs3 hs3Var = xqa.a0;
                isa isaVar = hs3Var.a;
                Object obj2 = hs3Var.b;
                ypa.a.getClass();
                dn4 dn4Var = new dn4(ypa.b(), isaVar, obj2);
                this.label = 1;
                obj = tm7.B(dn4Var, this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            }
            return wef.a;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (((Boolean) obj).booleanValue()) {
            this.$showModal$delegate.setValue(Boolean.TRUE);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((en4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
