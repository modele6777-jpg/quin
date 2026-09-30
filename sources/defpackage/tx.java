package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tx extends gbe implements l26 {
    final /* synthetic */ h0e $animSpec$delegate;
    final /* synthetic */ jx $animatable;
    final /* synthetic */ h0e $listener$delegate;
    final /* synthetic */ Object $newTarget;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx(Object obj, jx jxVar, h0e h0eVar, h0e h0eVar2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$newTarget = obj;
        this.$animatable = jxVar;
        this.$animSpec$delegate = h0eVar;
        this.$listener$delegate = h0eVar2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new tx(this.$newTarget, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        tx txVar;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            if (!pa7.t(this.$newTarget, this.$animatable.e.getValue())) {
                jx jxVar = this.$animatable;
                Object obj2 = this.$newTarget;
                h0e h0eVar = this.$animSpec$delegate;
                fxd fxdVar = vx.a;
                vz vzVar = (vz) h0eVar.getValue();
                this.label = 1;
                txVar = this;
                Object objB = jx.b(jxVar, obj2, vzVar, null, null, txVar, 12);
                bw2 bw2Var = bw2.a;
                if (objB == bw2Var) {
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
        txVar = this;
        h0e h0eVar2 = txVar.$listener$delegate;
        fxd fxdVar2 = vx.a;
        a26 a26Var = (a26) h0eVar2.getValue();
        if (a26Var != null) {
            a26Var.d(txVar.$animatable.e());
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((tx) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
