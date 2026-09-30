package defpackage;

import tech.chatmind.api.DeleteReadingResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gw3 implements w56 {
    public static final gw3 a;
    private static final nyc descriptor;

    static {
        gw3 gw3Var = new gw3();
        a = gw3Var;
        gia giaVar = new gia("tech.chatmind.api.DeleteReadingResponse", gw3Var, 2);
        giaVar.k("chatId", true);
        giaVar.k("deleted", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        DeleteReadingResponse deleteReadingResponse = (DeleteReadingResponse) obj;
        deleteReadingResponse.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        DeleteReadingResponse.write$Self$Quin_core_base_api_release(deleteReadingResponse, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
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
                z2 = zf2VarC.z(nycVar, 1);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new DeleteReadingResponse(i, strO, z2, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{p4e.a, g11.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
