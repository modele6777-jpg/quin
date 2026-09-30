package defpackage;

import tech.chatmind.api.account.model.SendCodeResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rxc implements w56 {
    public static final rxc a;
    private static final nyc descriptor;

    static {
        rxc rxcVar = new rxc();
        a = rxcVar;
        gia giaVar = new gia("tech.chatmind.api.account.model.SendCodeResponse", rxcVar, 1);
        giaVar.k("isNewUser", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SendCodeResponse sendCodeResponse = (SendCodeResponse) obj;
        sendCodeResponse.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ag2VarC.o(nycVar, 0, sendCodeResponse.isNewUser);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        while (true) {
            xyc xycVar = null;
            if (!z) {
                zf2VarC.b(nycVar);
                return new SendCodeResponse(i, z2, xycVar);
            }
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else {
                if (iJ != 0) {
                    s8f.f(iJ);
                    return null;
                }
                z2 = zf2VarC.z(nycVar, 0);
                i = 1;
            }
        }
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{g11.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
