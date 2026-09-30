package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import tech.chatmind.api.AiRecommendResponse;
import tech.chatmind.api.TarotReadingSpreadHistory;
import tech.chatmind.api.UserSelectedSpread;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vke implements w56 {
    public static final vke a;
    private static final nyc descriptor;

    static {
        vke vkeVar = new vke();
        a = vkeVar;
        gia giaVar = new gia("tech.chatmind.api.TarotReadingSpreadHistory", vkeVar, 8);
        giaVar.k("userSelectedSpreadId", true);
        giaVar.k("recommendSpreadId", true);
        giaVar.k("recommendSpreadReason", true);
        giaVar.k("spreadId", true);
        giaVar.k("generatedSpread", true);
        giaVar.k("userSelectedSpread", true);
        giaVar.k("aiRecommendedSpreads", true);
        giaVar.k("createdTime", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        TarotReadingSpreadHistory tarotReadingSpreadHistory = (TarotReadingSpreadHistory) obj;
        tarotReadingSpreadHistory.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        TarotReadingSpreadHistory.write$Self$Quin_core_base_api_release(tarotReadingSpreadHistory, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = TarotReadingSpreadHistory.$childSerializers;
        Object obj = null;
        boolean z = true;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list = null;
        UserSelectedSpread userSelectedSpread = null;
        AiRecommendResponse aiRecommendResponse = null;
        int i = 0;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str2 = (String) zf2VarC.y(nycVar, 0, p4e.a, str2);
                    i |= 1;
                    break;
                case 1:
                    str3 = (String) zf2VarC.y(nycVar, 1, p4e.a, str3);
                    i |= 2;
                    break;
                case 2:
                    str4 = (String) zf2VarC.y(nycVar, 2, p4e.a, str4);
                    i |= 4;
                    break;
                case 3:
                    str5 = (String) zf2VarC.y(nycVar, 3, p4e.a, str5);
                    i |= 8;
                    break;
                case 4:
                    list = (List) zf2VarC.y(nycVar, 4, (xn7) lw7VarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    userSelectedSpread = (UserSelectedSpread) zf2VarC.y(nycVar, 5, qpf.a, userSelectedSpread);
                    i |= 32;
                    break;
                case 6:
                    aiRecommendResponse = (AiRecommendResponse) zf2VarC.y(nycVar, 6, ji.a, aiRecommendResponse);
                    i |= 64;
                    break;
                case 7:
                    str = (String) zf2VarC.y(nycVar, 7, p4e.a, str);
                    i |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    break;
                default:
                    s8f.f(iJ);
                    return obj;
            }
            obj = null;
        }
        zf2VarC.b(nycVar);
        return new TarotReadingSpreadHistory(i, str2, str3, str4, str5, list, userSelectedSpread, aiRecommendResponse, str, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = TarotReadingSpreadHistory.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{t72.F(p4eVar), t72.F(p4eVar), t72.F(p4eVar), t72.F(p4eVar), t72.F((xn7) lw7VarArr[4].getValue()), t72.F(qpf.a), t72.F(ji.a), t72.F(p4eVar)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
