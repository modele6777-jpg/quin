package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class byd extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ cyd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byd(cyd cydVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = cydVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        byd bydVar = new byd(this.this$0, xn2Var);
        bydVar.L$0 = obj;
        return bydVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        String str = (String) this.L$0;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        k2c k2cVar = this.this$0.a;
        this.L$0 = null;
        this.label = 1;
        Object objC = k2cVar.c(this, new i2c(k2cVar, null), str);
        bw2 bw2Var = bw2.a;
        return objC == bw2Var ? bw2Var : objC;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((byd) k((xn2) obj2, (String) obj)).r(wef.a);
    }
}
