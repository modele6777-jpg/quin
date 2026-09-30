package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pp2 extends gbe implements l26 {
    final /* synthetic */ vb2 $activity;
    final /* synthetic */ q7b $app;
    final /* synthetic */ e3b $clock;
    final /* synthetic */ gd8 $localStorageDataSource;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp2(vb2 vb2Var, q7b q7bVar, gd8 gd8Var, e3b e3bVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$activity = vb2Var;
        this.$app = q7bVar;
        this.$localStorageDataSource = gd8Var;
        this.$clock = e3bVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new pp2(this.$activity, this.$app, this.$localStorageDataSource, this.$clock, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            vb2 vb2Var = this.$activity;
            q7b q7bVar = this.$app;
            gd8 gd8Var = this.$localStorageDataSource;
            e3b e3bVar = this.$clock;
            this.label = 1;
            Object objO = wq2.o(vb2Var, q7bVar, gd8Var, e3bVar, this);
            bw2 bw2Var = bw2.a;
            if (objO == bw2Var) {
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
        return ((pp2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
