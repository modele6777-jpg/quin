package defpackage;

import tech.chatmind.api.account.model.SendCodeResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class txc implements w56 {
    public static final txc a;
    private static final nyc descriptor;

    static {
        txc txcVar = new txc();
        a = txcVar;
        gia giaVar = new gia("tech.chatmind.api.account.model.SendCodeResult", txcVar, 4);
        giaVar.k("isNewUser", false);
        giaVar.k("isError", false);
        giaVar.k("errorCode", true);
        giaVar.k("errorMessage", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SendCodeResult sendCodeResult = (SendCodeResult) obj;
        sendCodeResult.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SendCodeResult.write$Self$Quin_core_base_api_release(sendCodeResult, ag2VarC, nycVar);
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
        Integer num = null;
        String str = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                z2 = zf2VarC.z(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                z3 = zf2VarC.z(nycVar, 1);
                i |= 2;
            } else if (iJ == 2) {
                num = (Integer) zf2VarC.y(nycVar, 2, c77.a, num);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                str = (String) zf2VarC.y(nycVar, 3, p4e.a, str);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new SendCodeResult(i, z2, z3, num, str, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        xn7 xn7VarF = t72.F(c77.a);
        xn7 xn7VarF2 = t72.F(p4e.a);
        g11 g11Var = g11.a;
        return new xn7[]{g11Var, g11Var, xn7VarF, xn7VarF2};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
