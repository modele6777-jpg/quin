package defpackage;

import tech.chatmind.api.personality.TarotCard;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ohe implements w56 {
    public static final ohe a;
    private static final nyc descriptor;

    static {
        ohe oheVar = new ohe();
        a = oheVar;
        gia giaVar = new gia("tech.chatmind.api.personality.TarotCard", oheVar, 2);
        giaVar.k("name", false);
        giaVar.k("direction", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        TarotCard tarotCard = (TarotCard) obj;
        tarotCard.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        TarotCard.write$Self$Quin_core_base_api_release(tarotCard, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        int iT = 0;
        String strO = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strO = zf2VarC.o(nycVar, 0);
                i |= 1;
            } else {
                if (iJ != 1) {
                    s8f.f(iJ);
                    return null;
                }
                iT = zf2VarC.t(nycVar, 1);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new TarotCard(i, strO, iT, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{p4e.a, c77.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
