package defpackage;

import ai.askquin.ui.onboard.PendingUserProfile;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c8a extends gbe implements l26 {
    final /* synthetic */ List<String> $quinSource;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8a(List list, xn2 xn2Var) {
        super(2, xn2Var);
        this.$quinSource = list;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        c8a c8aVar = new c8a(this.$quinSource, xn2Var);
        c8aVar.L$0 = obj;
        return c8aVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        PendingUserProfile pendingUserProfile = (PendingUserProfile) this.L$0;
        if (this.label == 0) {
            jzb.q(obj);
            return PendingUserProfile.copy$default(pendingUserProfile == null ? new PendingUserProfile((List) null, (List) null, (String) null, false, (String) null, (String) null, 63, (rp3) null) : pendingUserProfile, this.$quinSource, null, null, false, null, null, 62, null);
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((c8a) k((xn2) obj2, (PendingUserProfile) obj)).r(wef.a);
    }
}
