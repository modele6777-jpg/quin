package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ef3 extends gbe implements l26 {
    final /* synthetic */ j18 $monthsListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef3(j18 j18Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$monthsListState = j18Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ef3(this.$monthsListState, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                j18 j18Var = this.$monthsListState;
                int iJ = j18Var.e.b.j() + 1;
                this.label = 1;
                Object objF = j18Var.f(iJ, this);
                bw2 bw2Var = bw2.a;
                if (objF == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
        } catch (IllegalArgumentException unused) {
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ef3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
