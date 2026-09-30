package defpackage;

import tech.chatmind.api.dailycard.model.DailyCard;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v23 implements w56 {
    public static final v23 a;
    private static final nyc descriptor;

    static {
        v23 v23Var = new v23();
        a = v23Var;
        gia giaVar = new gia("tech.chatmind.api.dailycard.model.DailyCard", v23Var, 4);
        giaVar.k("date", false);
        giaVar.k("direction", false);
        giaVar.k("isReversed", false);
        giaVar.k("key", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        DailyCard dailyCard = (DailyCard) obj;
        dailyCard.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        DailyCard.write$Self$Quin_core_base_api_release(dailyCard, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        int iT = 0;
        boolean z2 = false;
        String strO = null;
        String strO2 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strO = zf2VarC.o(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                iT = zf2VarC.t(nycVar, 1);
                i |= 2;
            } else if (iJ == 2) {
                z2 = zf2VarC.z(nycVar, 2);
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
        return new DailyCard(i, strO, iT, z2, strO2, null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, c77.a, g11.a, p4eVar};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
