package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e3c extends gbe implements l26 {
    int label;
    final /* synthetic */ p3c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3c(p3c p3cVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = p3cVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new e3c(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            this.this$0.b.getClass();
            wj5 wj5VarB = s7.b();
            cs1 cs1Var = new cs1(2, this.this$0);
            this.label = 1;
            Object objB = wj5VarB.b(cs1Var, this);
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
        return ((e3c) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
