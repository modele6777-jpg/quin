package defpackage;

import tech.chatmind.api.seasonal.model.SeasonalFollowUp;
import tech.chatmind.api.seasonal.model.SeasonalStatus;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nkc implements w56 {
    public static final nkc a;
    private static final nyc descriptor;

    static {
        nkc nkcVar = new nkc();
        a = nkcVar;
        gia giaVar = new gia("tech.chatmind.api.seasonal.model.SeasonalFollowUp", nkcVar, 4);
        giaVar.k("question", true);
        giaVar.k("answer", true);
        giaVar.k("status", true);
        giaVar.k("createdTime", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SeasonalFollowUp seasonalFollowUp = (SeasonalFollowUp) obj;
        seasonalFollowUp.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SeasonalFollowUp.write$Self$Quin_core_base_api_release(seasonalFollowUp, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = SeasonalFollowUp.$childSerializers;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        SeasonalStatus seasonalStatus = null;
        String str3 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                str = (String) zf2VarC.y(nycVar, 0, p4e.a, str);
                i |= 1;
            } else if (iJ == 1) {
                str2 = (String) zf2VarC.y(nycVar, 1, p4e.a, str2);
                i |= 2;
            } else if (iJ == 2) {
                seasonalStatus = (SeasonalStatus) zf2VarC.s(nycVar, 2, (xn7) lw7VarArr[2].getValue(), seasonalStatus);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                str3 = (String) zf2VarC.y(nycVar, 3, p4e.a, str3);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new SeasonalFollowUp(i, str, str2, seasonalStatus, str3, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = SeasonalFollowUp.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{t72.F(p4eVar), t72.F(p4eVar), lw7VarArr[2].getValue(), t72.F(p4eVar)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
