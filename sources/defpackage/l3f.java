package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l3f extends gbe implements l26 {
    float F$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ n3f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3f(n3f n3fVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = n3fVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        l3f l3fVar = new l3f(this.this$0, xn2Var);
        l3fVar.L$0 = obj;
        return l3fVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        float fV0;
        aw2 aw2Var;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            aw2 aw2Var2 = (aw2) this.L$0;
            fV0 = hkg.v0(aw2Var2.getCoroutineContext());
            aw2Var = aw2Var2;
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fV0 = this.F$0;
            aw2Var = (aw2) this.L$0;
            jzb.q(obj);
        }
        while (jgb.Y(aw2Var)) {
            tc2 tc2Var = new tc2(this.this$0, fV0, 6);
            this.L$0 = aw2Var;
            this.F$0 = fV0;
            this.label = 1;
            Object objG0 = tm7.J(getContext()).g0(this, tc2Var);
            bw2 bw2Var = bw2.a;
            if (objG0 == bw2Var) {
                return bw2Var;
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((l3f) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
