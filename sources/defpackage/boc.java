package defpackage;

import java.util.List;
import tech.chatmind.api.seasonal.model.SeasonalElementGuides;
import tech.chatmind.api.seasonal.model.SeasonalReading;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class boc implements w56 {
    public static final boc a;
    private static final nyc descriptor;

    static {
        boc bocVar = new boc();
        a = bocVar;
        gia giaVar = new gia("tech.chatmind.api.seasonal.model.SeasonalReading", bocVar, 3);
        giaVar.k("cards", true);
        giaVar.k("summary", true);
        giaVar.k("elementGuides", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SeasonalReading seasonalReading = (SeasonalReading) obj;
        seasonalReading.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SeasonalReading.write$Self$Quin_core_base_api_release(seasonalReading, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = SeasonalReading.$childSerializers;
        boolean z = true;
        int i = 0;
        List list = null;
        String str = null;
        SeasonalElementGuides seasonalElementGuides = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                list = (List) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), list);
                i |= 1;
            } else if (iJ == 1) {
                str = (String) zf2VarC.y(nycVar, 1, p4e.a, str);
                i |= 2;
            } else {
                if (iJ != 2) {
                    s8f.f(iJ);
                    return null;
                }
                seasonalElementGuides = (SeasonalElementGuides) zf2VarC.y(nycVar, 2, lkc.a, seasonalElementGuides);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new SeasonalReading(i, list, str, seasonalElementGuides, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{SeasonalReading.$childSerializers[0].getValue(), t72.F(p4e.a), t72.F(lkc.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
