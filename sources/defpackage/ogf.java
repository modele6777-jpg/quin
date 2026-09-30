package defpackage;

import tech.chatmind.api.UpdateUserProfileResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ogf implements w56 {
    public static final ogf a;
    private static final nyc descriptor;

    static {
        ogf ogfVar = new ogf();
        a = ogfVar;
        gia giaVar = new gia("tech.chatmind.api.UpdateUserProfileResponse", ogfVar, 2);
        giaVar.k("success", false);
        giaVar.k("errorMessage", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        UpdateUserProfileResponse updateUserProfileResponse = (UpdateUserProfileResponse) obj;
        updateUserProfileResponse.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        UpdateUserProfileResponse.write$Self$Quin_core_base_api_release(updateUserProfileResponse, ag2VarC, nycVar);
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
        String str = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                z2 = zf2VarC.z(nycVar, 0);
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
        return new UpdateUserProfileResponse(i, z2, str, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{g11.a, t72.F(p4e.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
