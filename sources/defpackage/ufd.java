package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ufd extends gbe implements l26 {
    final /* synthetic */ h0e $currentOnUserCutCompleted$delegate;
    final /* synthetic */ h0e $currentOnUserShuffleCompleted$delegate;
    final /* synthetic */ e89 $cutCardStage$delegate;
    final /* synthetic */ jie $cutMotion;
    final /* synthetic */ boolean $enableCut;
    final /* synthetic */ gh6 $haptic;
    final /* synthetic */ h0e $latestOnComplete$delegate;
    final /* synthetic */ boolean $layeredStack;
    final /* synthetic */ aw2 $scope;
    final /* synthetic */ egd $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ufd(egd egdVar, aw2 aw2Var, boolean z, boolean z2, e89 e89Var, jie jieVar, gh6 gh6Var, h0e h0eVar, h0e h0eVar2, h0e h0eVar3, xn2 xn2Var) {
        super(2, xn2Var);
        this.$state = egdVar;
        this.$scope = aw2Var;
        this.$enableCut = z;
        this.$layeredStack = z2;
        this.$cutCardStage$delegate = e89Var;
        this.$cutMotion = jieVar;
        this.$haptic = gh6Var;
        this.$currentOnUserShuffleCompleted$delegate = h0eVar;
        this.$currentOnUserCutCompleted$delegate = h0eVar2;
        this.$latestOnComplete$delegate = h0eVar3;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ufd(this.$state, this.$scope, this.$enableCut, this.$layeredStack, this.$cutCardStage$delegate, this.$cutMotion, this.$haptic, this.$currentOnUserShuffleCompleted$delegate, this.$currentOnUserCutCompleted$delegate, this.$latestOnComplete$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        egd egdVar = this.$state;
        aw2 aw2Var = this.$scope;
        e89 e89Var = this.$cutCardStage$delegate;
        xfc xfcVar = new xfc(e89Var, 8);
        w77 w77Var = new w77(e89Var, 12);
        boolean z = this.$enableCut;
        tfd tfdVar = this.$layeredStack ? new tfd(this.$cutMotion, this.$haptic, null) : null;
        zk1 zk1Var = new zk1(16, this.$currentOnUserShuffleCompleted$delegate);
        zk1 zk1Var2 = new zk1(17, this.$currentOnUserCutCompleted$delegate);
        zk1 zk1Var3 = new zk1(18, this.$latestOnComplete$delegate);
        egdVar.getClass();
        aw2Var.getClass();
        egdVar.h = new bv9(aw2Var, egdVar, zk1Var, 10);
        egdVar.i = new ffd(egdVar, 2);
        egdVar.j = new h6b(23, egdVar, zk1Var);
        egdVar.k = new k11(egdVar, xfcVar, aw2Var, tfdVar, w77Var, zk1Var2, 8);
        egdVar.l = new xu(egdVar, z, aw2Var, zk1Var3, 2);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ufd ufdVar = (ufd) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        ufdVar.r(wefVar);
        return wefVar;
    }
}
