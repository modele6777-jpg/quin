package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k5g extends gbe implements l26 {
    final /* synthetic */ isa $this_set;
    final /* synthetic */ Object $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5g(isa isaVar, Object obj, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_set = isaVar;
        this.$value = obj;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new k5g(this.$this_set, this.$value, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            j5g j5gVar = new j5g(this.$this_set, this.$value, null);
            this.label = 1;
            Object objB = lw2.b(j5gVar, this);
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
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((k5g) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
