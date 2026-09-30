package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ar1 extends gbe implements l26 {
    final /* synthetic */ m77 $interactionSource;
    final /* synthetic */ jsd $interactions;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar1(m77 m77Var, jsd jsdVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$interactionSource = m77Var;
        this.$interactions = jsdVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ar1(this.$interactionSource, this.$interactions, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return wef.a;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        ncd ncdVar = ((u69) this.$interactionSource).a;
        w51 w51Var = new w51(this.$interactions, 1);
        this.label = 1;
        ncdVar.b(w51Var, this);
        return bw2.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ar1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
