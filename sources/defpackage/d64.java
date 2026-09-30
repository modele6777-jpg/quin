package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d64 extends gbe implements l26 {
    final /* synthetic */ gd8 $localStorageDataSource;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d64(gd8 gd8Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$localStorageDataSource = gd8Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new d64(this.$localStorageDataSource, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            gd8 gd8Var = this.$localStorageDataSource;
            th5 th5Var = cye.b;
            ma8 ma8VarA = gcc.E(z57.a.a(), fbc.d()).a();
            this.label = 1;
            Object objA = gd8Var.a(ma8VarA, this);
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
        lw2.a(new c64(2, null));
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((d64) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
