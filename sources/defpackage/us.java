package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class us extends gbe implements l26 {
    final /* synthetic */ j47 $inputMethodManager;
    int label;
    final /* synthetic */ ys this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us(ys ysVar, j47 j47Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = ysVar;
        this.$inputMethodManager = j47Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new us(this.this$0, this.$inputMethodManager, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            z4 z4Var = new z4(26);
            this.label = 1;
            if (tm7.Q(z4Var, this) == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
                oo3.f();
                return null;
            }
            jzb.q(obj);
        }
        b89 b89VarI = this.this$0.i();
        if (b89VarI == null) {
            return wef.a;
        }
        ts tsVar = new ts(0, this.$inputMethodManager);
        this.label = 2;
        ncd.n((ncd) b89VarI, tsVar, this);
        return bw2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((us) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
