package defpackage;

import android.content.res.Configuration;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends gbe implements l26 {
    final /* synthetic */ Configuration $configuration;
    int label;
    final /* synthetic */ h1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(h1 h1Var, xn2 xn2Var, Configuration configuration) {
        super(2, xn2Var);
        this.this$0 = h1Var;
        this.$configuration = configuration;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new g1(this.this$0, xn2Var, this.$configuration);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            h1 h1Var = this.this$0;
            f1 f1Var = new f1(h1Var, null, this.$configuration);
            this.label = 1;
            Object objP = rrb.p(h1Var, g48.c, f1Var, this);
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
        return ((g1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
