package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sdf extends gbe implements l26 {
    final /* synthetic */ u6d $method;
    final /* synthetic */ x16 $onCancel;
    final /* synthetic */ vad $session;
    final /* synthetic */ int $settledPage;
    final /* synthetic */ mmb $sheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sdf(mmb mmbVar, u6d u6dVar, vad vadVar, int i, x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$sheetState = mmbVar;
        this.$method = u6dVar;
        this.$session = vadVar;
        this.$settledPage = i;
        this.$onCancel = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new sdf(this.$sheetState, this.$method, this.$session, this.$settledPage, this.$onCancel, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                Object obj2 = this.$sheetState.element;
                if (obj2 == null) {
                    pa7.g0("sheetState");
                    throw null;
                }
                this.label = 1;
                Object objD = ((ted) obj2).d(this);
                bw2 bw2Var = bw2.a;
                if (objD == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            this.$session.a(this.$settledPage, this.$method, this.$onCancel);
            return wef.a;
        } catch (Throwable th) {
            this.$session.a(this.$settledPage, this.$method, this.$onCancel);
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((sdf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
