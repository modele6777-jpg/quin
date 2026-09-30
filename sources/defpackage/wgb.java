package defpackage;

import tech.chatmind.api.ReadingShareRequest;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wgb implements w56 {
    public static final wgb a;
    private static final nyc descriptor;

    static {
        wgb wgbVar = new wgb();
        a = wgbVar;
        gia giaVar = new gia("tech.chatmind.api.ReadingShareRequest", wgbVar, 5);
        giaVar.k("uid", false);
        giaVar.k("scene", false);
        giaVar.k("format", false);
        giaVar.k("channel", false);
        giaVar.k("lang", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        ReadingShareRequest readingShareRequest = (ReadingShareRequest) obj;
        readingShareRequest.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ReadingShareRequest.write$Self$Quin_core_base_api_release(readingShareRequest, ag2VarC, nycVar);
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
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strO = zf2VarC.o(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                strO2 = zf2VarC.o(nycVar, 1);
                i |= 2;
            } else if (iJ == 2) {
                strO3 = zf2VarC.o(nycVar, 2);
                i |= 4;
            } else if (iJ == 3) {
                strO4 = zf2VarC.o(nycVar, 3);
                i |= 8;
            } else {
                if (iJ != 4) {
                    s8f.f(iJ);
                    return null;
                }
                strO5 = zf2VarC.o(nycVar, 4);
                i |= 16;
            }
        }
        zf2VarC.b(nycVar);
        return new ReadingShareRequest(i, strO, strO2, strO3, strO4, strO5, null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, p4eVar, p4eVar, p4eVar};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
