package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rm6 extends gbe implements l26 {
    final /* synthetic */ e89 $drawerStateValue$delegate;
    final /* synthetic */ jx $translationY;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm6(jx jxVar, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$translationY = jxVar;
        this.$drawerStateValue$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new rm6(this.$translationY, this.$drawerStateValue$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        rm6 rm6Var;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            jx jxVar = this.$translationY;
            Float f = new Float(0.0f);
            this.label = 1;
            rm6Var = this;
            Object objB = jx.b(jxVar, f, null, null, null, rm6Var, 14);
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
            rm6Var = this;
        }
        e89 e89Var = rm6Var.$drawerStateValue$delegate;
        float f2 = um6.a;
        e89Var.setValue(eo4.a);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((rm6) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
