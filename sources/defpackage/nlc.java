package defpackage;

import tech.chatmind.api.seasonal.model.SeasonalHistoryItem;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nlc implements w56 {
    public static final nlc a;
    private static final nyc descriptor;

    static {
        nlc nlcVar = new nlc();
        a = nlcVar;
        gia giaVar = new gia("tech.chatmind.api.seasonal.model.SeasonalHistoryItem", nlcVar, 3);
        giaVar.k("year", true);
        giaVar.k("solarTerm", true);
        giaVar.k("divinedAt", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SeasonalHistoryItem seasonalHistoryItem = (SeasonalHistoryItem) obj;
        seasonalHistoryItem.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SeasonalHistoryItem.write$Self$Quin_core_base_api_release(seasonalHistoryItem, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = SeasonalHistoryItem.$childSerializers;
        boolean z = true;
        int i = 0;
        int iT = 0;
        SolarTerm solarTerm = null;
        String str = null;
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
            } else {
                if (iJ != 2) {
                    s8f.f(iJ);
                    return null;
                }
                str = (String) zf2VarC.y(nycVar, 2, p4e.a, str);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new SeasonalHistoryItem(i, iT, solarTerm, str, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{c77.a, SeasonalHistoryItem.$childSerializers[1].getValue(), t72.F(p4e.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
