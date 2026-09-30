package defpackage;

import ai.askquin.ui.onboard.PendingUserProfile;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z7a extends gbe implements l26 {
    final /* synthetic */ PendingUserProfile $expected;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7a(PendingUserProfile pendingUserProfile, xn2 xn2Var) {
        super(2, xn2Var);
        this.$expected = pendingUserProfile;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        z7a z7aVar = new z7a(this.$expected, xn2Var);
        z7aVar.L$0 = obj;
        return z7aVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        PendingUserProfile pendingUserProfile = (PendingUserProfile) this.L$0;
        if (this.label == 0) {
            jzb.q(obj);
            return pa7.t(pendingUserProfile, this.$expected) ? PendingUserProfile.copy$default(pendingUserProfile, null, null, null, false, null, null, 51, null) : pendingUserProfile;
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((z7a) k((xn2) obj2, (PendingUserProfile) obj)).r(wef.a);
    }
}
