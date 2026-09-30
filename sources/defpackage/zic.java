package defpackage;

import tech.chatmind.api.seasonal.model.SeasonalCard;
import tech.chatmind.api.seasonal.model.SeasonalPosition;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zic implements w56 {
    public static final zic a;
    private static final nyc descriptor;

    static {
        zic zicVar = new zic();
        a = zicVar;
        gia giaVar = new gia("tech.chatmind.api.seasonal.model.SeasonalCard", zicVar, 3);
        giaVar.k("position", true);
        giaVar.k("key", true);
        giaVar.k("direction", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SeasonalCard seasonalCard = (SeasonalCard) obj;
        seasonalCard.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SeasonalCard.write$Self$Quin_core_base_api_release(seasonalCard, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = SeasonalCard.$childSerializers;
        boolean z = true;
        int i = 0;
        int iT = 0;
        SeasonalPosition seasonalPosition = null;
        String strO = null;
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
            } else {
                if (iJ != 2) {
                    s8f.f(iJ);
                    return null;
                }
                iT = zf2VarC.t(nycVar, 2);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new SeasonalCard(i, seasonalPosition, strO, iT, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{SeasonalCard.$childSerializers[0].getValue(), p4e.a, c77.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
