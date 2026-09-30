package defpackage;

import ai.askquin.datastore.model.UserProfile;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uof extends gbe implements l26 {
    final /* synthetic */ Boolean $optOutAllServerPush;
    final /* synthetic */ Boolean $optOutDailyTarotLocalPush;
    final /* synthetic */ Boolean $optOutTomorrowTarotLocalPush;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uof(Boolean bool, Boolean bool2, Boolean bool3, xn2 xn2Var) {
        super(2, xn2Var);
        this.$optOutAllServerPush = bool;
        this.$optOutDailyTarotLocalPush = bool2;
        this.$optOutTomorrowTarotLocalPush = bool3;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        uof uofVar = new uof(this.$optOutAllServerPush, this.$optOutDailyTarotLocalPush, this.$optOutTomorrowTarotLocalPush, xn2Var);
        uofVar.L$0 = obj;
        return uofVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        UserProfile userProfile = (UserProfile) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        Boolean optOutAllServerPush = this.$optOutAllServerPush;
        if (optOutAllServerPush == null) {
            optOutAllServerPush = userProfile.getOptOutAllServerPush();
        }
        Boolean bool = optOutAllServerPush;
        Boolean optOutDailyTarotLocalPush = this.$optOutDailyTarotLocalPush;
        if (optOutDailyTarotLocalPush == null) {
            optOutDailyTarotLocalPush = userProfile.getOptOutDailyTarotLocalPush();
        }
        Boolean bool2 = optOutDailyTarotLocalPush;
        Boolean optOutTomorrowTarotLocalPush = this.$optOutTomorrowTarotLocalPush;
        if (optOutTomorrowTarotLocalPush == null) {
            optOutTomorrowTarotLocalPush = userProfile.getOptOutTomorrowTarotLocalPush();
        }
        return UserProfile.copy$default(userProfile, null, null, null, null, null, null, null, null, bool, bool2, optOutTomorrowTarotLocalPush, 255, null);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((uof) k((xn2) obj2, (UserProfile) obj)).r(wef.a);
    }
}
