package defpackage;

import java.util.List;
import tech.chatmind.api.SpreadRecommendationResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wwd implements w56 {
    public static final wwd a;
    private static final nyc descriptor;

    static {
        wwd wwdVar = new wwd();
        a = wwdVar;
        gia giaVar = new gia("tech.chatmind.api.SpreadRecommendationResult", wwdVar, 6);
        giaVar.k("spreadId", true);
        giaVar.k("patternData", true);
        giaVar.k("recommendSpreadReasonTitle", true);
        giaVar.k("recommendSpreadReasonDescription", true);
        giaVar.k("isSuggested", true);
        giaVar.k("usageCount", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SpreadRecommendationResult spreadRecommendationResult = (SpreadRecommendationResult) obj;
        spreadRecommendationResult.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SpreadRecommendationResult.write$Self$Quin_core_base_api_release(spreadRecommendationResult, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = SpreadRecommendationResult.$childSerializers;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        int iT = 0;
        String strO = null;
        List list = null;
        String strO2 = null;
        String strO3 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strO = zf2VarC.o(nycVar, 0);
                    i |= 1;
                    break;
                case 1:
                    list = (List) zf2VarC.s(nycVar, 1, (xn7) lw7VarArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    strO2 = zf2VarC.o(nycVar, 2);
                    i |= 4;
                    break;
                case 3:
                    strO3 = zf2VarC.o(nycVar, 3);
                    i |= 8;
                    break;
                case 4:
                    z2 = zf2VarC.z(nycVar, 4);
                    i |= 16;
                    break;
                case 5:
                    iT = zf2VarC.t(nycVar, 5);
                    i |= 32;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new SpreadRecommendationResult(i, strO, list, strO2, strO3, z2, iT, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = SpreadRecommendationResult.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, lw7VarArr[1].getValue(), p4eVar, p4eVar, g11.a, c77.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
