package defpackage;

import java.util.List;
import tech.chatmind.api.seasonal.model.SeasonalReadingRequest;
import tech.chatmind.api.seasonal.model.SeasonalUserInfo;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class joc implements w56 {
    public static final joc a;
    private static final nyc descriptor;

    static {
        joc jocVar = new joc();
        a = jocVar;
        gia giaVar = new gia("tech.chatmind.api.seasonal.model.SeasonalReadingRequest", jocVar, 4);
        giaVar.k("year", false);
        giaVar.k("solarTerm", false);
        giaVar.k("userInfo", false);
        giaVar.k("cards", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SeasonalReadingRequest seasonalReadingRequest = (SeasonalReadingRequest) obj;
        seasonalReadingRequest.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SeasonalReadingRequest.write$Self$Quin_core_base_api_release(seasonalReadingRequest, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = SeasonalReadingRequest.$childSerializers;
        boolean z = true;
        int i = 0;
        int iT = 0;
        SolarTerm solarTerm = null;
        SeasonalUserInfo seasonalUserInfo = null;
        List list = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                iT = zf2VarC.t(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                solarTerm = (SolarTerm) zf2VarC.s(nycVar, 1, (xn7) lw7VarArr[1].getValue(), solarTerm);
                i |= 2;
            } else if (iJ == 2) {
                seasonalUserInfo = (SeasonalUserInfo) zf2VarC.s(nycVar, 2, msc.a, seasonalUserInfo);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                list = (List) zf2VarC.s(nycVar, 3, (xn7) lw7VarArr[3].getValue(), list);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new SeasonalReadingRequest(i, iT, solarTerm, seasonalUserInfo, list, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = SeasonalReadingRequest.$childSerializers;
        return new xn7[]{c77.a, lw7VarArr[1].getValue(), msc.a, lw7VarArr[3].getValue()};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
