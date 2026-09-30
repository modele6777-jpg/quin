package defpackage;

import tech.chatmind.api.personality.CosmicSection;
import tech.chatmind.api.personality.CpSection;
import tech.chatmind.api.personality.Overview;
import tech.chatmind.api.personality.PersonalitySection;
import tech.chatmind.api.personality.ProfessionSection;
import tech.chatmind.api.personality.ReportData;
import tech.chatmind.api.personality.RomanceSection;
import tech.chatmind.api.personality.ShortCard;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wrb implements w56 {
    public static final wrb a;
    private static final nyc descriptor;

    static {
        wrb wrbVar = new wrb();
        a = wrbVar;
        gia giaVar = new gia("tech.chatmind.api.personality.ReportData", wrbVar, 7);
        giaVar.k("overview", false);
        giaVar.k("personality", false);
        giaVar.k("shortCard", true);
        giaVar.k("romance", true);
        giaVar.k("cp", true);
        giaVar.k("profession", true);
        giaVar.k("cosmic", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        ReportData reportData = (ReportData) obj;
        reportData.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ReportData.write$Self$Quin_core_base_api_release(reportData, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        Overview overview = null;
        PersonalitySection personalitySection = null;
        ShortCard shortCard = null;
        RomanceSection romanceSection = null;
        CpSection cpSection = null;
        ProfessionSection professionSection = null;
        CosmicSection cosmicSection = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    break;
                case 0:
                    overview = (Overview) zf2VarC.s(nycVar, 0, pu9.a, overview);
                    i |= 1;
                    break;
                case 1:
                    personalitySection = (PersonalitySection) zf2VarC.s(nycVar, 1, eca.a, personalitySection);
                    i |= 2;
                    break;
                case 2:
                    shortCard = (ShortCard) zf2VarC.y(nycVar, 2, yed.a, shortCard);
                    i |= 4;
                    break;
                case 3:
                    romanceSection = (RomanceSection) zf2VarC.y(nycVar, 3, m5c.a, romanceSection);
                    i |= 8;
                    break;
                case 4:
                    cpSection = (CpSection) zf2VarC.y(nycVar, 4, xw2.a, cpSection);
                    i |= 16;
                    break;
                case 5:
                    professionSection = (ProfessionSection) zf2VarC.y(nycVar, 5, jwa.a, professionSection);
                    i |= 32;
                    break;
                case 6:
                    cosmicSection = (CosmicSection) zf2VarC.y(nycVar, 6, ow2.a, cosmicSection);
                    i |= 64;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new ReportData(i, overview, personalitySection, shortCard, romanceSection, cpSection, professionSection, cosmicSection, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{pu9.a, eca.a, t72.F(yed.a), t72.F(m5c.a), t72.F(xw2.a), t72.F(jwa.a), t72.F(ow2.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
