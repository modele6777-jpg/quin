package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mf3 extends gbe implements l26 {
    final /* synthetic */ j91 $calendarModel;
    final /* synthetic */ j18 $lazyListState;
    final /* synthetic */ a26 $onDisplayedMonthChange;
    final /* synthetic */ z67 $yearRange;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf3(j18 j18Var, a26 a26Var, j91 j91Var, z67 z67Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$lazyListState = j18Var;
        this.$onDisplayedMonthChange = a26Var;
        this.$calendarModel = j91Var;
        this.$yearRange = z67Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new mf3(this.$lazyListState, this.$onDisplayedMonthChange, this.$calendarModel, this.$yearRange, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        wef wefVar = wef.a;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        j18 j18Var = this.$lazyListState;
        a26 a26Var = this.$onDisplayedMonthChange;
        j91 j91Var = this.$calendarModel;
        z67 z67Var = this.$yearRange;
        this.label = 1;
        bx9 bx9Var = vf3.a;
        Object objB = jzb.p(new te3(j18Var, 0)).b(new tu2(j18Var, a26Var, j91Var, z67Var, 1), this);
        bw2 bw2Var = bw2.a;
        if (objB != bw2Var) {
            objB = wefVar;
        }
        return objB == bw2Var ? bw2Var : wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((mf3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
