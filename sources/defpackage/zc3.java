package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zc3 extends gbe implements l26 {
    int label;
    final /* synthetic */ od3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc3(od3 od3Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = od3Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new zc3(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            lc3 lc3Var = this.this$0.i;
            this.label = 1;
            Object objS = lc3Var.b.s(this);
            if (objS != bw2Var) {
                objS = wefVar;
            }
            if (objS != bw2Var) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        wj5 wj5VarQ = ym8.q(this.this$0.c().e(), -1);
        ts tsVar = new ts(7, this.this$0);
        this.label = 2;
        return wj5VarQ.b(tsVar, this) == bw2Var ? bw2Var : wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((zc3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
