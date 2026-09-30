package defpackage;

import tech.chatmind.api.PopupData;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yja implements w56 {
    public static final yja a;
    private static final nyc descriptor;

    static {
        yja yjaVar = new yja();
        a = yjaVar;
        gia giaVar = new gia("tech.chatmind.api.PopupData", yjaVar, 4);
        giaVar.k("popupCode", false);
        giaVar.k("actionLink", false);
        giaVar.k("canCancel", false);
        giaVar.k("content", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        PopupData popupData = (PopupData) obj;
        popupData.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        PopupData.write$Self$Quin_core_base_api_release(popupData, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        int iT = 0;
        String str = null;
        Boolean bool = null;
        String str2 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                iT = zf2VarC.t(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                str = (String) zf2VarC.y(nycVar, 1, p4e.a, str);
                i |= 2;
            } else if (iJ == 2) {
                bool = (Boolean) zf2VarC.y(nycVar, 2, g11.a, bool);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                str2 = (String) zf2VarC.y(nycVar, 3, p4e.a, str2);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new PopupData(i, iT, str, bool, str2, null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{c77.a, t72.F(p4eVar), t72.F(g11.a), t72.F(p4eVar)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
