package defpackage;

import ai.askquin.ui.onboard.PendingUserProfile;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a8a extends gbe implements l26 {
    final /* synthetic */ String $birthday;
    final /* synthetic */ boolean $wasEdited;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8a(xn2 xn2Var, String str, boolean z) {
        super(2, xn2Var);
        this.$birthday = str;
        this.$wasEdited = z;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        a8a a8aVar = new a8a(xn2Var, this.$birthday, this.$wasEdited);
        a8aVar.L$0 = obj;
        return a8aVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        PendingUserProfile pendingUserProfile = (PendingUserProfile) this.L$0;
        if (this.label == 0) {
            jzb.q(obj);
            return PendingUserProfile.copy$default(pendingUserProfile == null ? new PendingUserProfile((List) null, (List) null, (String) null, false, (String) null, (String) null, 63, (rp3) null) : pendingUserProfile, null, null, this.$birthday, this.$wasEdited, null, null, 51, null);
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((a8a) k((xn2) obj2, (PendingUserProfile) obj)).r(wef.a);
    }
}
