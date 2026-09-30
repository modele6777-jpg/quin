package defpackage;

import ai.askquin.ui.share.SharedDivination;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e7d extends gbe implements l26 {
    final /* synthetic */ SharedDivination $divination;
    final /* synthetic */ ihb $readingShareViewModel;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7d(ihb ihbVar, SharedDivination sharedDivination, xn2 xn2Var) {
        super(2, xn2Var);
        this.$readingShareViewModel = ihbVar;
        this.$divination = sharedDivination;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        e7d e7dVar = new e7d(this.$readingShareViewModel, this.$divination, xn2Var);
        e7dVar.L$0 = obj;
        return e7dVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        e8d e8dVar = (e8d) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            ihb ihbVar = this.$readingShareViewModel;
            String divinationId = this.$divination.getDivinationId();
            this.L$0 = null;
            this.label = 1;
            Object objG = ihbVar.g(divinationId, e8dVar, this);
            bw2 bw2Var = bw2.a;
            if (objG == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((e7d) k((xn2) obj2, (e8d) obj)).r(wef.a);
    }
}
