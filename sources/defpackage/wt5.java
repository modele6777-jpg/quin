package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wt5 extends gbe implements l26 {
    final /* synthetic */ boolean $automatic;
    final /* synthetic */ h0e $latestClose$delegate;
    final /* synthetic */ h0e $latestLoaded$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt5(boolean z, h0e h0eVar, h0e h0eVar2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$automatic = z;
        this.$latestLoaded$delegate = h0eVar;
        this.$latestClose$delegate = h0eVar2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new wt5(this.$automatic, this.$latestLoaded$delegate, this.$latestClose$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            if (this.$automatic) {
                vt5 vt5Var = new vt5(this.$latestLoaded$delegate, null);
                this.label = 1;
                obj = rs0.S(20000L, vt5Var, this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            }
            return wef.a;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (((Boolean) obj) == null) {
            ((x16) this.$latestClose$delegate.getValue()).invoke();
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((wt5) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
