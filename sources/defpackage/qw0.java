package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qw0 extends gbe implements l26 {
    final /* synthetic */ jo5 $it;
    final /* synthetic */ d0f $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw0(jo5 jo5Var, d0f d0fVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$it = jo5Var;
        this.$state = d0fVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new qw0(this.$it, this.$state, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            if (((ko5) this.$it).b()) {
                d0f d0fVar = this.$state;
                this.label = 1;
                Object objC = ((h0f) d0fVar).c(s89.c, this);
                bw2 bw2Var = bw2.a;
                if (objC == bw2Var) {
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
        if (((h0f) this.$state).b() && !((ko5) this.$it).b()) {
            ((h0f) this.$state).a();
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((qw0) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
