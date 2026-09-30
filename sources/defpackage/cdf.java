package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cdf extends gbe implements l26 {
    final /* synthetic */ mmb $decoded;
    final /* synthetic */ g8d $image;
    final /* synthetic */ o26 $loadRegion;
    final /* synthetic */ qad $metrics;
    final /* synthetic */ d6d $strip;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdf(mmb mmbVar, o26 o26Var, g8d g8dVar, d6d d6dVar, qad qadVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$decoded = mmbVar;
        this.$loadRegion = o26Var;
        this.$image = g8dVar;
        this.$strip = d6dVar;
        this.$metrics = qadVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new cdf(this.$decoded, this.$loadRegion, this.$image, this.$strip, this.$metrics, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        mmb mmbVar;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            mmb mmbVar2 = this.$decoded;
            o26 o26Var = this.$loadRegion;
            g8d g8dVar = this.$image;
            d6d d6dVar = this.$strip;
            Integer num = new Integer(this.$metrics.b);
            this.L$0 = mmbVar2;
            this.label = 1;
            Object objT = o26Var.t(g8dVar, d6dVar, num, this);
            bw2 bw2Var = bw2.a;
            if (objT == bw2Var) {
                return bw2Var;
            }
            obj = objT;
            mmbVar = mmbVar2;
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mmbVar = (mmb) this.L$0;
            jzb.q(obj);
        }
        mmbVar.element = obj;
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((cdf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
