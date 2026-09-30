package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yg4 extends gbe implements l26 {
    final /* synthetic */ yx9 $carouselPagerState;
    final /* synthetic */ a26 $onPageChanged;
    final /* synthetic */ int $pageSize;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg4(int i, xn2 xn2Var, a26 a26Var, yx9 yx9Var) {
        super(2, xn2Var);
        this.$carouselPagerState = yx9Var;
        this.$pageSize = i;
        this.$onPageChanged = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new yg4(this.$pageSize, xn2Var, this.$onPageChanged, this.$carouselPagerState);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        int iJ = ((sz9) this.$carouselPagerState.d.c).j() % this.$pageSize;
        a26 a26Var = this.$onPageChanged;
        if (a26Var != null) {
            a26Var.d(new Integer(iJ));
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        yg4 yg4Var = (yg4) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        yg4Var.r(wefVar);
        return wefVar;
    }
}
