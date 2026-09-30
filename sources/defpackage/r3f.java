package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r3f extends gbe implements l26 {
    final /* synthetic */ s3f $transitionState;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3f(s3f s3fVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$transitionState = s3fVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new r3f(this.$transitionState, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        s3f s3fVar;
        d99 d99Var;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            ltc ltcVar = (ltc) this.$transitionState;
            nsd nsdVar = ltcVar.h;
            if (nsdVar != null) {
                nsdVar.d(ltcVar, g21.g, ltcVar.g);
            }
            s3fVar = this.$transitionState;
            f99 f99Var = ((ltc) s3fVar).k;
            this.L$0 = f99Var;
            this.L$1 = s3fVar;
            this.label = 1;
            Object objB = f99Var.b(this);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
            d99Var = f99Var;
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            s3fVar = (s3f) this.L$1;
            d99Var = (d99) this.L$0;
            jzb.q(obj);
        }
        try {
            ((ltc) s3fVar).d = ((ltc) s3fVar).b.getValue();
            pl1 pl1Var = ((ltc) s3fVar).j;
            if (pl1Var != null) {
                pl1Var.g(((ltc) s3fVar).b.getValue());
            }
            ((ltc) s3fVar).j = null;
            return wef.a;
        } finally {
            d99Var.h(null);
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((r3f) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
