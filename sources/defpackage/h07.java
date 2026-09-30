package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h07 extends gbe implements l26 {
    final /* synthetic */ cz6 $messageDataSource;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h07(cz6 cz6Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$messageDataSource = cz6Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new h07(this.$messageDataSource, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        if (i == 0) {
            jzb.q(obj);
            cz6 cz6Var = this.$messageDataSource;
            this.label = 1;
            uz6 uz6Var = (uz6) cz6Var;
            uz6Var.getClass();
            js3 js3Var = ga4.a;
            Object objP0 = ynb.p0(hr3.c, new tz6(uz6Var, null), this);
            bw2 bw2Var = bw2.a;
            if (objP0 != bw2Var) {
                objP0 = wefVar;
            }
            if (objP0 == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((h07) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
