package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rd9 extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ wd9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd9(wd9 wd9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = wd9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        rd9 rd9Var = new rd9(this.this$0, xn2Var);
        rd9Var.L$0 = obj;
        return rd9Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        me9 me9Var = (me9) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            wd9 wd9Var = this.this$0;
            utd utdVar = me9Var.e;
            if (utdVar == null) {
                qc0.p("body == null");
                return null;
            }
            this.L$0 = me9Var;
            this.label = 1;
            obj = wd9Var.g(utdVar, this);
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return new otd((ax6) obj, wd9.d(this.this$0.a, me9Var.d.a()), zb3.d);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((rd9) k((xn2) obj2, (me9) obj)).r(wef.a);
    }
}
