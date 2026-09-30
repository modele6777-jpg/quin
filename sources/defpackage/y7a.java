package defpackage;

import ai.askquin.ui.onboard.PendingUserProfile;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y7a extends gbe implements l26 {
    final /* synthetic */ imb $cleared;
    final /* synthetic */ a26 $consume;
    final /* synthetic */ PendingUserProfile $expected;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7a(PendingUserProfile pendingUserProfile, a26 a26Var, imb imbVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$expected = pendingUserProfile;
        this.$consume = a26Var;
        this.$cleared = imbVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        y7a y7aVar = new y7a(this.$expected, this.$consume, this.$cleared, xn2Var);
        y7aVar.L$0 = obj;
        return y7aVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        PendingUserProfile pendingUserProfile = (PendingUserProfile) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            if (!pa7.t(pendingUserProfile, this.$expected)) {
                return pendingUserProfile;
            }
            a26 a26Var = this.$consume;
            this.L$0 = null;
            this.label = 1;
            Object objD = a26Var.d(this);
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
        this.$cleared.element = true;
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((y7a) k((xn2) obj2, (PendingUserProfile) obj)).r(wef.a);
    }
}
