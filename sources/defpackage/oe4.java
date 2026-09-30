package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oe4 extends gbe implements l26 {
    final /* synthetic */ a26 $onProgress;
    final /* synthetic */ a26 $onProgressDiscard;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe4(a26 a26Var, a26 a26Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$onProgress = a26Var;
        this.$onProgressDiscard = a26Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        oe4 oe4Var = new oe4(this.$onProgress, this.$onProgressDiscard, xn2Var);
        oe4Var.L$0 = obj;
        return oe4Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        oyb oybVar = (oyb) this.L$0;
        Object obj2 = null;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (oybVar instanceof myb) {
            this.$onProgress.d(((myb) oybVar).a);
        } else if ((oybVar instanceof kyb) || (oybVar instanceof jyb)) {
            a26 a26Var = this.$onProgressDiscard;
            oybVar.getClass();
            if (oybVar instanceof jyb) {
                obj2 = ((jyb) oybVar).a;
            } else if (!(oybVar instanceof kyb) && !(oybVar instanceof lyb)) {
                if (oybVar instanceof myb) {
                    obj2 = ((myb) oybVar).a;
                } else {
                    if (!(oybVar instanceof nyb)) {
                        ap.c();
                        return null;
                    }
                    obj2 = ((nyb) oybVar).a;
                }
            }
            a26Var.d(obj2);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        oe4 oe4Var = (oe4) k((xn2) obj2, (oyb) obj);
        wef wefVar = wef.a;
        oe4Var.r(wefVar);
        return wefVar;
    }
}
