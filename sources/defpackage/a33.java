package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.explore.model.DailyCardBasicInfo;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a33 implements w56 {
    public static final a33 a;
    private static final nyc descriptor;

    static {
        a33 a33Var = new a33();
        a = a33Var;
        gia giaVar = new gia("ai.askquin.ui.explore.model.DailyCardBasicInfo", a33Var, 8);
        giaVar.k("date", false);
        giaVar.k("affirmation", false);
        giaVar.k("tarotCard", false);
        giaVar.k("cardDescription", false);
        giaVar.k("explain", false);
        giaVar.k("dos", true);
        giaVar.k("donts", true);
        giaVar.k("skin", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        DailyCardBasicInfo dailyCardBasicInfo = (DailyCardBasicInfo) obj;
        dailyCardBasicInfo.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        DailyCardBasicInfo.write$Self$Quin_conversation_gpRelease(dailyCardBasicInfo, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = DailyCardBasicInfo.$childSerializers;
        Object obj = null;
        boolean z = true;
        TarotSkinIdentify tarotSkinIdentify = null;
        String strO = null;
        String strO2 = null;
        TarotCardChoice tarotCardChoice = null;
        String strO3 = null;
        String str = null;
        List list = null;
        List list2 = null;
        int i = 0;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strO = zf2VarC.o(nycVar, 0);
                    i |= 1;
                    break;
                case 1:
                    strO2 = zf2VarC.o(nycVar, 1);
                    i |= 2;
                    break;
                case 2:
                    tarotCardChoice = (TarotCardChoice) zf2VarC.s(nycVar, 2, rhe.a, tarotCardChoice);
                    i |= 4;
                    break;
                case 3:
                    strO3 = zf2VarC.o(nycVar, 3);
                    i |= 8;
                    break;
                case 4:
                    str = (String) zf2VarC.y(nycVar, 4, p4e.a, str);
                    i |= 16;
                    break;
                case 5:
                    list = (List) zf2VarC.s(nycVar, 5, (xn7) lw7VarArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) zf2VarC.s(nycVar, 6, (xn7) lw7VarArr[6].getValue(), list2);
                    i |= 64;
                    break;
                case 7:
                    tarotSkinIdentify = (TarotSkinIdentify) zf2VarC.y(nycVar, 7, (xn7) lw7VarArr[7].getValue(), tarotSkinIdentify);
                    i |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    break;
                default:
                    s8f.f(iJ);
                    return obj;
            }
            obj = null;
        }
        zf2VarC.b(nycVar);
        return new DailyCardBasicInfo(i, strO, strO2, tarotCardChoice, strO3, str, list, list2, tarotSkinIdentify, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = DailyCardBasicInfo.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, rhe.a, p4eVar, t72.F(p4eVar), lw7VarArr[5].getValue(), lw7VarArr[6].getValue(), t72.F((xn7) lw7VarArr[7].getValue())};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
