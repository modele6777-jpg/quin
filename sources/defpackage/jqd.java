package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jqd extends gbe implements l26 {
    final /* synthetic */ jx $alpha;
    final /* synthetic */ vz $animation;
    final /* synthetic */ x16 $onAnimationFinish;
    final /* synthetic */ boolean $visible;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqd(jx jxVar, boolean z, vz vzVar, x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$alpha = jxVar;
        this.$visible = z;
        this.$animation = vzVar;
        this.$onAnimationFinish = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new jqd(this.$alpha, this.$visible, this.$animation, this.$onAnimationFinish, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        jqd jqdVar;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            jx jxVar = this.$alpha;
            Float f = new Float(this.$visible ? 1.0f : 0.0f);
            vz vzVar = this.$animation;
            this.label = 1;
            jqdVar = this;
            Object objB = jx.b(jxVar, f, vzVar, null, null, jqdVar, 12);
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
            jqdVar = this;
        }
        jqdVar.$onAnimationFinish.invoke();
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((jqd) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
