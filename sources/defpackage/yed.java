package defpackage;

import tech.chatmind.api.personality.ShortCard;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yed implements w56 {
    public static final yed a;
    private static final nyc descriptor;

    static {
        yed yedVar = new yed();
        a = yedVar;
        gia giaVar = new gia("tech.chatmind.api.personality.ShortCard", yedVar, 7);
        giaVar.k("cosmic", false);
        giaVar.k("cp", false);
        giaVar.k("personality", false);
        giaVar.k("profession", false);
        giaVar.k("romance", false);
        giaVar.k("summary", false);
        giaVar.k("title", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        ShortCard shortCard = (ShortCard) obj;
        shortCard.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ShortCard.write$Self$Quin_core_base_api_release(shortCard, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        String strO5 = null;
        String strO6 = null;
        String strO7 = null;
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
                    strO2 = zf2VarC.o(nycVar, 1);
                    i |= 2;
                    break;
                case 2:
                    strO3 = zf2VarC.o(nycVar, 2);
                    i |= 4;
                    break;
                case 3:
                    strO4 = zf2VarC.o(nycVar, 3);
                    i |= 8;
                    break;
                case 4:
                    strO5 = zf2VarC.o(nycVar, 4);
                    i |= 16;
                    break;
                case 5:
                    strO6 = zf2VarC.o(nycVar, 5);
                    i |= 32;
                    break;
                case 6:
                    strO7 = zf2VarC.o(nycVar, 6);
                    i |= 64;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new ShortCard(i, strO, strO2, strO3, strO4, strO5, strO6, strO7, null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, p4eVar, p4eVar, p4eVar, p4eVar, p4eVar};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
