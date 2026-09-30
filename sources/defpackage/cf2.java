package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cf2 extends gbe implements l26 {
    final /* synthetic */ Runnable $onReady;
    int label;
    final /* synthetic */ gf2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf2(gf2 gf2Var, Runnable runnable, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = gf2Var;
        this.$onReady = runnable;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new cf2(this.this$0, this.$onReady, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        if (i == 0) {
            jzb.q(obj);
            opb opbVar = this.this$0.f;
            this.label = 1;
            Object objA = opbVar.a(0.0f - opbVar.c, this);
            bw2 bw2Var = bw2.a;
            if (objA != bw2Var) {
                objA = wefVar;
            }
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        ((vz9) this.this$0.c.b).setValue(Boolean.FALSE);
        this.$onReady.run();
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((cf2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
