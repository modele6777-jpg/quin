package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hv3 extends gbe implements l26 {
    final /* synthetic */ qh2 $config$inlined;
    final /* synthetic */ Map $tags$inlined;
    int label;
    final /* synthetic */ jv3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv3(jv3 jv3Var, xn2 xn2Var, qh2 qh2Var, Map map) {
        super(2, xn2Var);
        this.this$0 = jv3Var;
        this.$config$inlined = qh2Var;
        this.$tags$inlined = map;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new hv3(this.this$0, xn2Var, this.$config$inlined, this.$tags$inlined);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
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
        nu3 nu3VarI = this.this$0.l().i(this.$config$inlined, this.$tags$inlined);
        this.label = 1;
        Object objS = ((za2) nu3VarI).s(this);
        bw2 bw2Var = bw2.a;
        return objS == bw2Var ? bw2Var : objS;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((hv3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
