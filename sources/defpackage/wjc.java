package defpackage;

import ai.askquin.data.SeasonalDraftStore$Draft;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wjc implements w56 {
    public static final wjc a;
    private static final nyc descriptor;

    static {
        wjc wjcVar = new wjc();
        a = wjcVar;
        gia giaVar = new gia("ai.askquin.data.SeasonalDraftStore.Draft", wjcVar, 6);
        giaVar.k("genderKey", true);
        giaVar.k("careerKey", true);
        giaVar.k("relationshipKey", true);
        giaVar.k("question", true);
        giaVar.k("virtualChoices", true);
        giaVar.k("physicalSlots", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SeasonalDraftStore$Draft seasonalDraftStore$Draft = (SeasonalDraftStore$Draft) obj;
        seasonalDraftStore$Draft.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SeasonalDraftStore$Draft.write$Self$Quin_conversation_gpRelease(seasonalDraftStore$Draft, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = SeasonalDraftStore$Draft.$childSerializers;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        List list2 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    break;
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
                    list = (List) zf2VarC.s(nycVar, 4, (xn7) lw7VarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) zf2VarC.s(nycVar, 5, (xn7) lw7VarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new SeasonalDraftStore$Draft(i, str, str2, str3, str4, list, list2, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = SeasonalDraftStore$Draft.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{t72.F(p4eVar), t72.F(p4eVar), t72.F(p4eVar), t72.F(p4eVar), lw7VarArr[4].getValue(), lw7VarArr[5].getValue()};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
