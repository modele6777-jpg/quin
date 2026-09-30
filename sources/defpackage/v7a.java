package defpackage;

import ai.askquin.ui.onboard.PendingUserProfile;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v7a extends gbe implements l26 {
    final /* synthetic */ String $accountId;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7a(String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$accountId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        v7a v7aVar = new v7a(this.$accountId, xn2Var);
        v7aVar.L$0 = obj;
        return v7aVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        PendingUserProfile pendingUserProfile = (PendingUserProfile) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if ((pendingUserProfile != null ? pendingUserProfile.getAccountId() : null) != null) {
            return pendingUserProfile;
        }
        if (pendingUserProfile != null) {
            return PendingUserProfile.copy$default(pendingUserProfile, null, null, null, false, this.$accountId, null, 47, null);
        }
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((v7a) k((xn2) obj2, (PendingUserProfile) obj)).r(wef.a);
    }
}
