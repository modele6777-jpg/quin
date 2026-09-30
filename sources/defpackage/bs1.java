package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bs1 extends gbe implements l26 {
    final /* synthetic */ use $jsonState;
    final /* synthetic */ String $jsonText;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs1(use useVar, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$jsonState = useVar;
        this.$jsonText = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new bs1(this.$jsonState, this.$jsonText, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (!pa7.t(this.$jsonState.d().c.toString(), this.$jsonText)) {
            n3d.q(this.$jsonState, this.$jsonText);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        bs1 bs1Var = (bs1) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        bs1Var.r(wefVar);
        return wefVar;
    }
}
