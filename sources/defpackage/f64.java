package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f64 extends gbe implements l26 {
    final /* synthetic */ gd8 $localStorageDataSource;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f64(gd8 gd8Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$localStorageDataSource = gd8Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new f64(this.$localStorageDataSource, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            gd8 gd8Var = this.$localStorageDataSource;
            ma8 ma8Var = new ma8(2023, 10, 1);
            this.label = 1;
            Object objA = gd8Var.a(ma8Var, this);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        lw2.a(new e64(2, null));
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((f64) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
