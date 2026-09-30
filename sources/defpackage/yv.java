package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yv extends gbe implements l26 {
    final /* synthetic */ ne2 $composeImm;
    final /* synthetic */ z2f $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv(z2f z2fVar, ne2 ne2Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$state = z2fVar;
        this.$composeImm = ne2Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new yv(this.$state, this.$composeImm, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            oo3.f();
            return null;
        }
        jzb.q(obj);
        z2f z2fVar = this.$state;
        xv xvVar = new xv(this.$composeImm);
        this.label = 1;
        z2fVar.b(xvVar, this);
        return bw2.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((yv) k((xn2) obj2, (aw2) obj)).r(wef.a);
        return bw2.a;
    }
}
