package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class es1 extends gbe implements l26 {
    final /* synthetic */ use $textState;
    final /* synthetic */ Integer $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es1(use useVar, Integer num, xn2 xn2Var) {
        super(2, xn2Var);
        this.$textState = useVar;
        this.$value = num;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new es1(this.$textState, this.$value, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        String strValueOf;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (!pa7.t(c5e.D(this.$textState.d().c.toString()), this.$value)) {
            use useVar = this.$textState;
            Integer num = this.$value;
            if (num == null || (strValueOf = String.valueOf(num.intValue())) == null) {
                strValueOf = "";
            }
            n3d.q(useVar, strValueOf);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        es1 es1Var = (es1) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        es1Var.r(wefVar);
        return wefVar;
    }
}
