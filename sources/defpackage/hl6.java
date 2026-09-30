package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hl6 extends gbe implements l26 {
    int label;
    final /* synthetic */ ol6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl6(xn2 xn2Var, ol6 ol6Var) {
        super(2, xn2Var);
        this.this$0 = ol6Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new hl6(xn2Var, this.this$0);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            this.this$0.d.getClass();
            wj5 wj5VarB = s7.b();
            gl6 gl6Var = new gl6(null, this.this$0);
            this.label = 1;
            Object objP = ok8.p(wj5VarB, gl6Var, this);
            bw2 bw2Var = bw2.a;
            if (objP == bw2Var) {
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
        return ((hl6) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
