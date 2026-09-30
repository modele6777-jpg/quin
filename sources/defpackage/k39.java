package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k39 extends gbe implements l26 {
    final /* synthetic */ q0e $durationScaleStateFlow;
    int label;
    final /* synthetic */ l39 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k39(q0e q0eVar, l39 l39Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$durationScaleStateFlow = q0eVar;
        this.this$0 = l39Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new k39(this.$durationScaleStateFlow, this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            q0e q0eVar = this.$durationScaleStateFlow;
            ts tsVar = new ts(17, this.this$0);
            this.label = 1;
            Object objB = q0eVar.b(tsVar, this);
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
        }
        oo3.f();
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((k39) k((xn2) obj2, (aw2) obj)).r(wef.a);
        return bw2.a;
    }
}
