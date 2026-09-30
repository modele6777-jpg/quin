package defpackage;

import tech.chatmind.api.RedeemRequest;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class amb implements w56 {
    public static final amb a;
    private static final nyc descriptor;

    static {
        amb ambVar = new amb();
        a = ambVar;
        gia giaVar = new gia("tech.chatmind.api.RedeemRequest", ambVar, 3);
        giaVar.k("code", false);
        giaVar.k("codeType", true);
        giaVar.k("isMember", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        RedeemRequest redeemRequest = (RedeemRequest) obj;
        redeemRequest.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        RedeemRequest.write$Self$Quin_core_base_api_release(redeemRequest, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        String strO = null;
        String str = null;
        Boolean bool = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strO = zf2VarC.o(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                str = (String) zf2VarC.y(nycVar, 1, p4e.a, str);
                i |= 2;
            } else {
                if (iJ != 2) {
                    s8f.f(iJ);
                    return null;
                }
                bool = (Boolean) zf2VarC.y(nycVar, 2, g11.a, bool);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new RedeemRequest(i, strO, str, bool, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, t72.F(p4eVar), t72.F(g11.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
