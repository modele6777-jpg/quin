package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hi6 extends gbe implements l26 {
    final /* synthetic */ vb2 $activity;
    final /* synthetic */ gi6 $this_clearHazeAreaLayerOnStop;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi6(vb2 vb2Var, gi6 gi6Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$activity = vb2Var;
        this.$this_clearHazeAreaLayerOnStop = gi6Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new hi6(this.$activity, this.$this_clearHazeAreaLayerOnStop, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            whb whbVarN = if9.n(this.$activity.a.j);
            ts tsVar = new ts(12, this.$this_clearHazeAreaLayerOnStop);
            this.label = 1;
            Object objB = whbVarN.a.b(tsVar, this);
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
        oo3.f();
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((hi6) k((xn2) obj2, (aw2) obj)).r(wef.a);
        return bw2.a;
    }
}
