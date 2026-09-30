package defpackage;

import java.util.Map;
import tech.chatmind.api.AppSettings;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bb0 implements w56 {
    public static final bb0 a;
    private static final nyc descriptor;

    static {
        bb0 bb0Var = new bb0();
        a = bb0Var;
        gia giaVar = new gia("tech.chatmind.api.AppSettings", bb0Var, 5);
        giaVar.k("enableYearlySubUnlockAllCards", true);
        giaVar.k("newUserFreeReadingCount", true);
        giaVar.k("forceUpdateSince", true);
        giaVar.k("suggestUpdateSince", true);
        giaVar.k("experimentVariants", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        AppSettings appSettings = (AppSettings) obj;
        appSettings.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        AppSettings.write$Self$Quin_core_base_api_release(appSettings, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = AppSettings.$childSerializers;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        int iT = 0;
        String str = null;
        String str2 = null;
        Map map = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                z2 = zf2VarC.z(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                iT = zf2VarC.t(nycVar, 1);
                i |= 2;
            } else if (iJ == 2) {
                str = (String) zf2VarC.y(nycVar, 2, p4e.a, str);
                i |= 4;
            } else if (iJ == 3) {
                str2 = (String) zf2VarC.y(nycVar, 3, p4e.a, str2);
                i |= 8;
            } else {
                if (iJ != 4) {
                    s8f.f(iJ);
                    return null;
                }
                map = (Map) zf2VarC.s(nycVar, 4, (xn7) lw7VarArr[4].getValue(), map);
                i |= 16;
            }
        }
        zf2VarC.b(nycVar);
        return new AppSettings(i, z2, iT, str, str2, map, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = AppSettings.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{g11.a, c77.a, t72.F(p4eVar), t72.F(p4eVar), lw7VarArr[4].getValue()};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
