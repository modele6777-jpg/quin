package defpackage;

import ai.askquin.ui.settings.model.ExpireableCount;
import ai.askquin.ui.settings.model.UserSubscriptionInformation;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import tech.chatmind.api.credits.QuinSubscription;
import tech.chatmind.api.credits.UsageBilling;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class spf implements w56 {
    public static final spf a;
    private static final nyc descriptor;

    static {
        spf spfVar = new spf();
        a = spfVar;
        gia giaVar = new gia("ai.askquin.ui.settings.model.UserSubscriptionInformation", spfVar, 8);
        giaVar.k("subscription", false);
        giaVar.k("paymentType", false);
        giaVar.k("isAutoRenew", false);
        giaVar.k("usageCounts", false);
        giaVar.k("compensateCount", false);
        giaVar.k("upgradeableSubscription", false);
        giaVar.k("limitedQuotaList", false);
        giaVar.k("usageBilling", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        UserSubscriptionInformation userSubscriptionInformation = (UserSubscriptionInformation) obj;
        userSubscriptionInformation.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        UserSubscriptionInformation.write$Self$Quin_conversation_gpRelease(userSubscriptionInformation, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = UserSubscriptionInformation.$childSerializers;
        Object obj = null;
        boolean z = true;
        UsageBilling usageBilling = null;
        QuinSubscription quinSubscription = null;
        String str = null;
        List list = null;
        ExpireableCount expireableCount = null;
        List list2 = null;
        List list3 = null;
        int i = 0;
        boolean z2 = false;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    break;
                case 0:
                    quinSubscription = (QuinSubscription) zf2VarC.y(nycVar, 0, s8b.a, quinSubscription);
                    i |= 1;
                    break;
                case 1:
                    str = (String) zf2VarC.y(nycVar, 1, p4e.a, str);
                    i |= 2;
                    break;
                case 2:
                    z2 = zf2VarC.z(nycVar, 2);
                    i |= 4;
                    break;
                case 3:
                    list = (List) zf2VarC.s(nycVar, 3, (xn7) lw7VarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    expireableCount = (ExpireableCount) zf2VarC.y(nycVar, 4, s55.a, expireableCount);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) zf2VarC.s(nycVar, 5, (xn7) lw7VarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    list3 = (List) zf2VarC.y(nycVar, 6, (xn7) lw7VarArr[6].getValue(), list3);
                    i |= 64;
                    break;
                case 7:
                    usageBilling = (UsageBilling) zf2VarC.y(nycVar, 7, whf.a, usageBilling);
                    i |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    break;
                default:
                    s8f.f(iJ);
                    return obj;
            }
            obj = null;
        }
        zf2VarC.b(nycVar);
        return new UserSubscriptionInformation(i, quinSubscription, str, z2, list, expireableCount, list2, list3, usageBilling, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = UserSubscriptionInformation.$childSerializers;
        return new xn7[]{t72.F(s8b.a), t72.F(p4e.a), g11.a, lw7VarArr[3].getValue(), t72.F(s55.a), lw7VarArr[5].getValue(), t72.F((xn7) lw7VarArr[6].getValue()), t72.F(whf.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
