package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hk5 extends gbe implements a26 {
    final /* synthetic */ xj5 $downstream;
    final /* synthetic */ mmb $lastValue;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk5(xn2 xn2Var, xj5 xj5Var, mmb mmbVar) {
        super(1, xn2Var);
        this.$downstream = xj5Var;
        this.$lastValue = mmbVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new hk5((xn2) obj, this.$downstream, this.$lastValue).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            xj5 xj5Var = this.$downstream;
            Object obj2 = this.$lastValue.element;
            if (obj2 == rj9.a) {
                obj2 = null;
            }
            this.label = 1;
            Object objA = xj5Var.a(obj2, this);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        this.$lastValue.element = null;
        return wef.a;
    }
}
