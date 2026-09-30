package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xk6 extends gbe implements l26 {
    final /* synthetic */ j18 $listState;
    final /* synthetic */ String $topItemKey;
    final /* synthetic */ e89 $userScrolled$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk6(String str, j18 j18Var, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$topItemKey = str;
        this.$listState = j18Var;
        this.$userScrolled$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new xk6(this.$topItemKey, this.$listState, this.$userScrolled$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            e89 e89Var = this.$userScrolled$delegate;
            int i2 = al6.a;
            if (!((Boolean) e89Var.getValue()).booleanValue() && this.$topItemKey != null) {
                j18 j18Var = this.$listState;
                this.label = 1;
                vea veaVar = j18.y;
                Object objJ = j18Var.j(0, 0, this);
                bw2 bw2Var = bw2.a;
                if (objJ == bw2Var) {
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
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((xk6) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
