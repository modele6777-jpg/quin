package defpackage;

import tech.chatmind.api.RedeemPopup;
import tech.chatmind.api.RedeemPopupAction;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vlb implements w56 {
    public static final vlb a;
    private static final nyc descriptor;

    static {
        vlb vlbVar = new vlb();
        a = vlbVar;
        gia giaVar = new gia("tech.chatmind.api.RedeemPopup", vlbVar, 4);
        giaVar.k("title", true);
        giaVar.k("subTitle", true);
        giaVar.k("cancelButton", true);
        giaVar.k("actionButton", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        RedeemPopup redeemPopup = (RedeemPopup) obj;
        redeemPopup.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        RedeemPopup.write$Self$Quin_core_base_api_release(redeemPopup, ag2VarC, nycVar);
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
        RedeemPopupAction redeemPopupAction = null;
        RedeemPopupAction redeemPopupAction2 = null;
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
            } else if (iJ == 2) {
                redeemPopupAction = (RedeemPopupAction) zf2VarC.y(nycVar, 2, xlb.a, redeemPopupAction);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                redeemPopupAction2 = (RedeemPopupAction) zf2VarC.y(nycVar, 3, xlb.a, redeemPopupAction2);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new RedeemPopup(i, strO, str, redeemPopupAction, redeemPopupAction2, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        xn7 xn7VarF = t72.F(p4eVar);
        xlb xlbVar = xlb.a;
        return new xn7[]{p4eVar, xn7VarF, t72.F(xlbVar), t72.F(xlbVar)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
