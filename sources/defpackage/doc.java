package defpackage;

import tech.chatmind.api.seasonal.model.SeasonalPosition;
import tech.chatmind.api.seasonal.model.SeasonalReadingCard;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class doc implements w56 {
    public static final doc a;
    private static final nyc descriptor;

    static {
        doc docVar = new doc();
        a = docVar;
        gia giaVar = new gia("tech.chatmind.api.seasonal.model.SeasonalReadingCard", docVar, 4);
        giaVar.k("position", true);
        giaVar.k("cardName", true);
        giaVar.k("direction", true);
        giaVar.k("content", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SeasonalReadingCard seasonalReadingCard = (SeasonalReadingCard) obj;
        seasonalReadingCard.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SeasonalReadingCard.write$Self$Quin_core_base_api_release(seasonalReadingCard, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = SeasonalReadingCard.$childSerializers;
        boolean z = true;
        int i = 0;
        int iT = 0;
        SeasonalPosition seasonalPosition = null;
        String strO = null;
        String strO2 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                seasonalPosition = (SeasonalPosition) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), seasonalPosition);
                i |= 1;
            } else if (iJ == 1) {
                strO = zf2VarC.o(nycVar, 1);
                i |= 2;
            } else if (iJ == 2) {
                iT = zf2VarC.t(nycVar, 2);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                strO2 = zf2VarC.o(nycVar, 3);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new SeasonalReadingCard(i, seasonalPosition, strO, iT, strO2, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{SeasonalReadingCard.$childSerializers[0].getValue(), p4eVar, c77.a, p4eVar};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
