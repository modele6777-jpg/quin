package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u17 extends gbe implements l26 {
    int label;
    final /* synthetic */ x17 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u17(x17 x17Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = x17Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new u17(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            x17 x17Var = this.this$0;
            jx jxVar = x17Var.O0;
            yi4 yi4Var = new yi4((x17Var.J0 && x17Var.F0) ? x17Var.H0 : x17Var.I0);
            vz vzVarB = x17Var.F0 ? vpf.B((s39) eb3.H(x17Var, vm8.a), t39.b) : b21.O();
            this.label = 1;
            Object objB = jx.b(jxVar, yi4Var, vzVarB, null, null, this, 12);
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
        return ((u17) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
