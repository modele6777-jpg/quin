package defpackage;

import tech.chatmind.api.seasonal.model.SeasonalCareerStatus;
import tech.chatmind.api.seasonal.model.SeasonalGender;
import tech.chatmind.api.seasonal.model.SeasonalLoveStatus;
import tech.chatmind.api.seasonal.model.SeasonalUserInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class msc implements w56 {
    public static final msc a;
    private static final nyc descriptor;

    static {
        msc mscVar = new msc();
        a = mscVar;
        gia giaVar = new gia("tech.chatmind.api.seasonal.model.SeasonalUserInfo", mscVar, 4);
        giaVar.k("gender", true);
        giaVar.k("careerStatus", true);
        giaVar.k("loveStatus", true);
        giaVar.k("note", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SeasonalUserInfo seasonalUserInfo = (SeasonalUserInfo) obj;
        seasonalUserInfo.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SeasonalUserInfo.write$Self$Quin_core_base_api_release(seasonalUserInfo, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = SeasonalUserInfo.$childSerializers;
        boolean z = true;
        int i = 0;
        SeasonalGender seasonalGender = null;
        SeasonalCareerStatus seasonalCareerStatus = null;
        SeasonalLoveStatus seasonalLoveStatus = null;
        String str = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                seasonalGender = (SeasonalGender) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), seasonalGender);
                i |= 1;
            } else if (iJ == 1) {
                seasonalCareerStatus = (SeasonalCareerStatus) zf2VarC.s(nycVar, 1, (xn7) lw7VarArr[1].getValue(), seasonalCareerStatus);
                i |= 2;
            } else if (iJ == 2) {
                seasonalLoveStatus = (SeasonalLoveStatus) zf2VarC.s(nycVar, 2, (xn7) lw7VarArr[2].getValue(), seasonalLoveStatus);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                str = (String) zf2VarC.y(nycVar, 3, p4e.a, str);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new SeasonalUserInfo(i, seasonalGender, seasonalCareerStatus, seasonalLoveStatus, str, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = SeasonalUserInfo.$childSerializers;
        return new xn7[]{lw7VarArr[0].getValue(), lw7VarArr[1].getValue(), lw7VarArr[2].getValue(), t72.F(p4e.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
