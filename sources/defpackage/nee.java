package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nee extends gbe implements l26 {
    final /* synthetic */ n26 $onPress;
    final /* synthetic */ a26 $onTap;
    final /* synthetic */ nta $pressScope;
    final /* synthetic */ tia $this_detectTapAndPress;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nee(tia tiaVar, n26 n26Var, a26 a26Var, nta ntaVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_detectTapAndPress = tiaVar;
        this.$onPress = n26Var;
        this.$onTap = a26Var;
        this.$pressScope = ntaVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        nee neeVar = new nee(this.$this_detectTapAndPress, this.$onPress, this.$onTap, this.$pressScope, xn2Var);
        neeVar.L$0 = obj;
        return neeVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            aw2 aw2Var = (aw2) this.L$0;
            tia tiaVar = this.$this_detectTapAndPress;
            mee meeVar = new mee(aw2Var, this.$onPress, this.$onTap, this.$pressScope, null);
            this.label = 1;
            Object objS = k99.s(tiaVar, meeVar, this);
            bw2 bw2Var = bw2.a;
            if (objS == bw2Var) {
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
        return ((nee) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
