package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import tech.chatmind.api.TarotReadingQuestionHistory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nje implements w56 {
    public static final nje a;
    private static final nyc descriptor;

    static {
        nje njeVar = new nje();
        a = njeVar;
        gia giaVar = new gia("tech.chatmind.api.TarotReadingQuestionHistory", njeVar, 10);
        giaVar.k("userQuestion", true);
        giaVar.k("confirmedQuestion", true);
        giaVar.k("userQuestionRecommendations", true);
        giaVar.k("additionalInfoQuestion", true);
        giaVar.k("suggestions", true);
        giaVar.k("isCanTarot", true);
        giaVar.k("isSuitable", true);
        giaVar.k("isAdditionalInfoNeeded", true);
        giaVar.k("needsRevision", true);
        giaVar.k("createdTime", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        TarotReadingQuestionHistory tarotReadingQuestionHistory = (TarotReadingQuestionHistory) obj;
        tarotReadingQuestionHistory.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        TarotReadingQuestionHistory.write$Self$Quin_core_base_api_release(tarotReadingQuestionHistory, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        lw7[] lw7VarArr;
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr2 = TarotReadingQuestionHistory.$childSerializers;
        String str = null;
        Boolean bool = null;
        boolean z = true;
        Boolean bool2 = null;
        int i = 0;
        String strO = null;
        String str2 = null;
        List list = null;
        String str3 = null;
        String str4 = null;
        boolean z2 = false;
        boolean z3 = false;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    lw7VarArr = lw7VarArr2;
                    z = false;
                    break;
                case 0:
                    lw7VarArr = lw7VarArr2;
                    strO = zf2VarC.o(nycVar, 0);
                    i |= 1;
                    break;
                case 1:
                    lw7VarArr = lw7VarArr2;
                    str2 = (String) zf2VarC.y(nycVar, 1, p4e.a, str2);
                    i |= 2;
                    break;
                case 2:
                    lw7VarArr = lw7VarArr2;
                    list = (List) zf2VarC.s(nycVar, 2, (xn7) lw7VarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    lw7VarArr = lw7VarArr2;
                    str3 = (String) zf2VarC.y(nycVar, 3, p4e.a, str3);
                    i |= 8;
                    break;
                case 4:
                    lw7VarArr = lw7VarArr2;
                    str4 = (String) zf2VarC.y(nycVar, 4, p4e.a, str4);
                    i |= 16;
                    break;
                case 5:
                    lw7VarArr = lw7VarArr2;
                    z2 = zf2VarC.z(nycVar, 5);
                    i |= 32;
                    break;
                case 6:
                    lw7VarArr = lw7VarArr2;
                    z3 = zf2VarC.z(nycVar, 6);
                    i |= 64;
                    break;
                case 7:
                    lw7VarArr = lw7VarArr2;
                    bool2 = (Boolean) zf2VarC.y(nycVar, 7, g11.a, bool2);
                    i |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    break;
                case 8:
                    lw7VarArr = lw7VarArr2;
                    bool = (Boolean) zf2VarC.y(nycVar, 8, g11.a, bool);
                    i |= 256;
                    break;
                case 9:
                    lw7VarArr = lw7VarArr2;
                    str = (String) zf2VarC.y(nycVar, 9, p4e.a, str);
                    i |= 512;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
            lw7VarArr2 = lw7VarArr;
        }
        zf2VarC.b(nycVar);
        return new TarotReadingQuestionHistory(i, strO, str2, list, str3, str4, z2, z3, bool2, bool, str, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = TarotReadingQuestionHistory.$childSerializers;
        p4e p4eVar = p4e.a;
        g11 g11Var = g11.a;
        return new xn7[]{p4eVar, t72.F(p4eVar), lw7VarArr[2].getValue(), t72.F(p4eVar), t72.F(p4eVar), g11Var, g11Var, t72.F(g11Var), t72.F(g11Var), t72.F(p4eVar)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
