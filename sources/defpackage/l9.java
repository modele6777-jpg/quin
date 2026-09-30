package defpackage;

import ai.askquin.ui.onboard.PendingUserProfile;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l9 extends gbe implements a26 {
    final /* synthetic */ PendingUserProfile $pending;
    Object L$0;
    int label;
    final /* synthetic */ o9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(PendingUserProfile pendingUserProfile, o9 o9Var, xn2 xn2Var) {
        super(1, xn2Var);
        this.$pending = pendingUserProfile;
        this.this$0 = o9Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new l9(this.$pending, this.this$0, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            String birthday = this.$pending.getBirthday();
            if (birthday != null) {
                xof xofVar = this.this$0.a;
                this.L$0 = null;
                this.label = 1;
                Object objE = xofVar.e(birthday, this);
                bw2 bw2Var = bw2.a;
                if (objE == bw2Var) {
                    return bw2Var;
                }
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
}
