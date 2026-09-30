package defpackage;

import tech.chatmind.api.RedeemPopupAction;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xlb implements w56 {
    public static final xlb a;
    private static final nyc descriptor;

    static {
        xlb xlbVar = new xlb();
        a = xlbVar;
        gia giaVar = new gia("tech.chatmind.api.RedeemPopupAction", xlbVar, 2);
        giaVar.k("text", false);
        giaVar.k("url", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        RedeemPopupAction redeemPopupAction = (RedeemPopupAction) obj;
        redeemPopupAction.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        RedeemPopupAction.write$Self$Quin_core_base_api_release(redeemPopupAction, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        String strO = null;
        String str = null;
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
                str = (String) zf2VarC.y(nycVar, 1, p4e.a, str);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new RedeemPopupAction(i, strO, str, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, t72.F(p4eVar)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
