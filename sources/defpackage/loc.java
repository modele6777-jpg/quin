package defpackage;

import java.util.List;
import tech.chatmind.api.seasonal.model.SeasonalReading;
import tech.chatmind.api.seasonal.model.SeasonalReadingResponse;
import tech.chatmind.api.seasonal.model.SeasonalStatus;
import tech.chatmind.api.seasonal.model.SeasonalUserInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class loc implements w56 {
    public static final loc a;
    private static final nyc descriptor;

    static {
        loc locVar = new loc();
        a = locVar;
        gia giaVar = new gia("tech.chatmind.api.seasonal.model.SeasonalReadingResponse", locVar, 6);
        giaVar.k("status", true);
        giaVar.k("userInfo", true);
        giaVar.k("cards", true);
        giaVar.k("reading", true);
        giaVar.k("followUps", true);
        giaVar.k("errorMessage", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SeasonalReadingResponse seasonalReadingResponse = (SeasonalReadingResponse) obj;
        seasonalReadingResponse.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SeasonalReadingResponse.write$Self$Quin_core_base_api_release(seasonalReadingResponse, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = SeasonalReadingResponse.$childSerializers;
        boolean z = true;
        int i = 0;
        SeasonalStatus seasonalStatus = null;
        SeasonalUserInfo seasonalUserInfo = null;
        List list = null;
        SeasonalReading seasonalReading = null;
        List list2 = null;
        String str = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    break;
                case 0:
                    seasonalStatus = (SeasonalStatus) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), seasonalStatus);
                    i |= 1;
                    break;
                case 1:
                    seasonalUserInfo = (SeasonalUserInfo) zf2VarC.y(nycVar, 1, msc.a, seasonalUserInfo);
                    i |= 2;
                    break;
                case 2:
                    list = (List) zf2VarC.y(nycVar, 2, (xn7) lw7VarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    seasonalReading = (SeasonalReading) zf2VarC.y(nycVar, 3, boc.a, seasonalReading);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) zf2VarC.y(nycVar, 4, (xn7) lw7VarArr[4].getValue(), list2);
                    i |= 16;
                    break;
                case 5:
                    str = (String) zf2VarC.y(nycVar, 5, p4e.a, str);
                    i |= 32;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new SeasonalReadingResponse(i, seasonalStatus, seasonalUserInfo, list, seasonalReading, list2, str, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = SeasonalReadingResponse.$childSerializers;
        return new xn7[]{lw7VarArr[0].getValue(), t72.F(msc.a), t72.F((xn7) lw7VarArr[2].getValue()), t72.F(boc.a), t72.F((xn7) lw7VarArr[4].getValue()), t72.F(p4e.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
