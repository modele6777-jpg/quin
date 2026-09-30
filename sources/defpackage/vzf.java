package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vzf extends gbe implements l26 {
    final /* synthetic */ owa $failure;
    final /* synthetic */ List<String> $intentions;
    int label;
    final /* synthetic */ xzf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vzf(xzf xzfVar, List list, owa owaVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = xzfVar;
        this.$intentions = list;
        this.$failure = owaVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new vzf(this.this$0, this.$intentions, this.$failure, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
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
        gpf gpfVar = this.this$0.b;
        List<String> list = this.$intentions;
        v9 v9Var = new v9(this.$failure, 6);
        this.label = 1;
        Object objA = gpf.a(gpfVar, null, null, null, null, null, list, null, null, null, v9Var, this, 3839);
        bw2 bw2Var = bw2.a;
        return objA == bw2Var ? bw2Var : objA;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((vzf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
