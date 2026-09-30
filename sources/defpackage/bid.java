package defpackage;

import tech.chatmind.api.account.model.SignWithGoogleRequestBody;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bid implements w56 {
    public static final bid a;
    private static final nyc descriptor;

    static {
        bid bidVar = new bid();
        a = bidVar;
        gia giaVar = new gia("tech.chatmind.api.account.model.SignWithGoogleRequestBody", bidVar, 4);
        giaVar.k("credential", false);
        giaVar.k("csrfToken", false);
        giaVar.k("redirect", true);
        giaVar.k("json", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SignWithGoogleRequestBody signWithGoogleRequestBody = (SignWithGoogleRequestBody) obj;
        signWithGoogleRequestBody.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SignWithGoogleRequestBody.write$Self$Quin_core_base_api_release(signWithGoogleRequestBody, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
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
                strO2 = zf2VarC.o(nycVar, 1);
                i |= 2;
            } else if (iJ == 2) {
                z2 = zf2VarC.z(nycVar, 2);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                z3 = zf2VarC.z(nycVar, 3);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new SignWithGoogleRequestBody(i, strO, strO2, z2, z3, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        g11 g11Var = g11.a;
        return new xn7[]{p4eVar, p4eVar, g11Var, g11Var};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
