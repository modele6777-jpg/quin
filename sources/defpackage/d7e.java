package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import tech.chatmind.api.Period;
import tech.chatmind.api.SubscriptionData;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d7e implements w56 {
    public static final d7e a;
    private static final nyc descriptor;

    static {
        d7e d7eVar = new d7e();
        a = d7eVar;
        gia giaVar = new gia("tech.chatmind.api.SubscriptionData", d7eVar, 8);
        giaVar.k("subscriptionType", false);
        giaVar.k("nextBillingAt", false);
        giaVar.k("subscribedAt", false);
        giaVar.k("paymentType", false);
        giaVar.k("expiredAt", false);
        giaVar.k("renewAt", false);
        giaVar.k("plan", false);
        giaVar.k("period", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SubscriptionData subscriptionData = (SubscriptionData) obj;
        subscriptionData.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SubscriptionData.write$Self$Quin_core_base_api_release(subscriptionData, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        Object obj = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Period period = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = (String) zf2VarC.y(nycVar, 0, p4e.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) zf2VarC.y(nycVar, 1, p4e.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) zf2VarC.y(nycVar, 2, p4e.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) zf2VarC.y(nycVar, 3, p4e.a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) zf2VarC.y(nycVar, 4, p4e.a, str5);
                    i |= 16;
                    break;
                case 5:
                    str6 = (String) zf2VarC.y(nycVar, 5, p4e.a, str6);
                    i |= 32;
                    break;
                case 6:
                    str7 = (String) zf2VarC.y(nycVar, 6, p4e.a, str7);
                    i |= 64;
                    break;
                case 7:
                    period = (Period) zf2VarC.y(nycVar, 7, o8a.a, period);
                    i |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    break;
                default:
                    s8f.f(iJ);
                    return obj;
            }
            obj = null;
        }
        zf2VarC.b(nycVar);
        return new SubscriptionData(i, str, str2, str3, str4, str5, str6, str7, period, null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{t72.F(p4eVar), t72.F(p4eVar), t72.F(p4eVar), t72.F(p4eVar), t72.F(p4eVar), t72.F(p4eVar), t72.F(p4eVar), t72.F(o8a.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
