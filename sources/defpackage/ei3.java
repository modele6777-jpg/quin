package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ei3 extends gbe implements l26 {
    final /* synthetic */ n69 $boxRotation$delegate;
    final /* synthetic */ float $from;
    final /* synthetic */ gh6 $haptic;
    final /* synthetic */ a26 $reportIfSpun;
    final /* synthetic */ float $target;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei3(float f, float f2, gh6 gh6Var, a26 a26Var, n69 n69Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$from = f;
        this.$target = f2;
        this.$haptic = gh6Var;
        this.$reportIfSpun = a26Var;
        this.$boxRotation$delegate = n69Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ei3(this.$from, this.$target, this.$haptic, this.$reportIfSpun, this.$boxRotation$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            float f = this.$from;
            float f2 = this.$target;
            fxd fxdVarP = b21.P(1.0f, 50.0f, 4, null);
            x6 x6Var = new x6(this.$haptic, this.$reportIfSpun, this.$boxRotation$delegate, 20);
            this.label = 1;
            Object objS = hkg.S(f, f2, fxdVarP, x6Var, this, 4);
            bw2 bw2Var = bw2.a;
            if (objS == bw2Var) {
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
        return ((ei3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
