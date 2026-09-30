package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xee extends gbe implements l26 {
    final /* synthetic */ n26 $onPress;
    final /* synthetic */ nta $pressScope;
    final /* synthetic */ oia $secondDown;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xee(n26 n26Var, nta ntaVar, oia oiaVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$onPress = n26Var;
        this.$pressScope = ntaVar;
        this.$secondDown = oiaVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new xee(this.$onPress, this.$pressScope, this.$secondDown, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            n26 n26Var = this.$onPress;
            nta ntaVar = this.$pressScope;
            hl9 hl9Var = new hl9(this.$secondDown.c);
            this.label = 1;
            Object objM = n26Var.m(ntaVar, hl9Var, this);
            bw2 bw2Var = bw2.a;
            if (objM == bw2Var) {
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
        return ((xee) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
