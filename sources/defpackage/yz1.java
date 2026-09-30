package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yz1 extends gbe implements l26 {
    final /* synthetic */ gh6 $haptic;
    final /* synthetic */ jx $rotationAnimatable;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz1(jx jxVar, gh6 gh6Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$rotationAnimatable = jxVar;
        this.$haptic = gh6Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new yz1(this.$rotationAnimatable, this.$haptic, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            mmb mmbVarD = ks0.d(obj);
            ybc ybcVarP = jzb.p(new wz1(this.$rotationAnimatable, 0));
            xz1 xz1Var = new xz1(mmbVarD, this.$haptic, 0);
            this.L$0 = null;
            this.label = 1;
            Object objB = ybcVarP.b(xz1Var, this);
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
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((yz1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
