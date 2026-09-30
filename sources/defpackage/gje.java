package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import tech.chatmind.api.TarotReadingAdditionalInfo;
import tech.chatmind.api.TarotReadingBody;
import tech.chatmind.api.TarotReadingChatState;
import tech.chatmind.api.TarotReadingHistory;
import tech.chatmind.api.TarotReadingMetadata;
import tech.chatmind.api.TarotReadingQuestionHistory;
import tech.chatmind.api.TarotReadingSpreadHistory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gje implements w56 {
    public static final gje a;
    private static final nyc descriptor;

    static {
        gje gjeVar = new gje();
        a = gjeVar;
        gia giaVar = new gia("tech.chatmind.api.TarotReadingHistory", gjeVar, 14);
        giaVar.k("chatId", true);
        giaVar.k("createdTime", true);
        giaVar.k("updatedTime", true);
        giaVar.k("tarotRole", true);
        giaVar.k("question", true);
        giaVar.k("spread", true);
        giaVar.k("reading", true);
        giaVar.k("chat", true);
        giaVar.k("additionalInfo", true);
        giaVar.k("metadata", true);
        giaVar.k("uid", true);
        giaVar.k("type", true);
        giaVar.k("scenarioId", true);
        giaVar.k("assets", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        TarotReadingHistory tarotReadingHistory = (TarotReadingHistory) obj;
        tarotReadingHistory.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        TarotReadingHistory.write$Self$Quin_core_base_api_release(tarotReadingHistory, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = TarotReadingHistory.$childSerializers;
        String str = null;
        String str2 = null;
        TarotReadingMetadata tarotReadingMetadata = null;
        TarotReadingAdditionalInfo tarotReadingAdditionalInfo = null;
        String str3 = null;
        TarotReadingChatState tarotReadingChatState = null;
        int i = 0;
        List list = null;
        String strO = null;
        String strO2 = null;
        String str4 = null;
        TarotReadingQuestionHistory tarotReadingQuestionHistory = null;
        TarotReadingSpreadHistory tarotReadingSpreadHistory = null;
        TarotReadingBody tarotReadingBody = null;
        boolean z = true;
        String strO3 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    strO2 = strO2;
                    z = false;
                    strO2 = strO2;
                    break;
                case 0:
                    strO3 = zf2VarC.o(nycVar, 0);
                    i |= 1;
                    strO = strO;
                    strO2 = strO2;
                    break;
                case 1:
                    strO2 = strO2;
                    i |= 2;
                    strO = zf2VarC.o(nycVar, 1);
                    strO2 = strO2;
                    break;
                case 2:
                    strO2 = zf2VarC.o(nycVar, 2);
                    i |= 4;
                    strO = strO;
                    break;
                case 3:
                    str4 = (String) zf2VarC.y(nycVar, 3, p4e.a, str4);
                    i |= 8;
                    strO = strO;
                    strO2 = strO2;
                    break;
                case 4:
                    tarotReadingQuestionHistory = (TarotReadingQuestionHistory) zf2VarC.y(nycVar, 4, nje.a, tarotReadingQuestionHistory);
                    i |= 16;
                    strO = strO;
                    strO2 = strO2;
                    break;
                case 5:
                    tarotReadingSpreadHistory = (TarotReadingSpreadHistory) zf2VarC.y(nycVar, 5, vke.a, tarotReadingSpreadHistory);
                    i |= 32;
                    strO = strO;
                    strO2 = strO2;
                    break;
                case 6:
                    tarotReadingBody = (TarotReadingBody) zf2VarC.y(nycVar, 6, cje.a, tarotReadingBody);
                    i |= 64;
                    strO = strO;
                    strO2 = strO2;
                    break;
                case 7:
                    tarotReadingChatState = (TarotReadingChatState) zf2VarC.y(nycVar, 7, eje.a, tarotReadingChatState);
                    i |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    strO = strO;
                    strO2 = strO2;
                    break;
                case 8:
                    tarotReadingAdditionalInfo = (TarotReadingAdditionalInfo) zf2VarC.y(nycVar, 8, uie.a, tarotReadingAdditionalInfo);
                    i |= 256;
                    strO = strO;
                    strO2 = strO2;
                    break;
                case 9:
                    tarotReadingMetadata = (TarotReadingMetadata) zf2VarC.y(nycVar, 9, lje.a, tarotReadingMetadata);
                    i |= 512;
                    strO = strO;
                    strO2 = strO2;
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    str2 = (String) zf2VarC.y(nycVar, 10, p4e.a, str2);
                    i |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                    strO = strO;
                    strO2 = strO2;
                    break;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    str = (String) zf2VarC.y(nycVar, 11, p4e.a, str);
                    i |= 2048;
                    strO = strO;
                    strO2 = strO2;
                    break;
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    str3 = (String) zf2VarC.y(nycVar, 12, p4e.a, str3);
                    i |= 4096;
                    strO = strO;
                    strO2 = strO2;
                    break;
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    list = (List) zf2VarC.y(nycVar, 13, (xn7) lw7VarArr[13].getValue(), list);
                    i |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    strO = strO;
                    strO2 = strO2;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new TarotReadingHistory(i, strO3, strO, strO2, str4, tarotReadingQuestionHistory, tarotReadingSpreadHistory, tarotReadingBody, tarotReadingChatState, tarotReadingAdditionalInfo, tarotReadingMetadata, str2, str, str3, list, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = TarotReadingHistory.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, p4eVar, t72.F(p4eVar), t72.F(nje.a), t72.F(vke.a), t72.F(cje.a), t72.F(eje.a), t72.F(uie.a), t72.F(lje.a), t72.F(p4eVar), t72.F(p4eVar), t72.F(p4eVar), t72.F((xn7) lw7VarArr[13].getValue())};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
