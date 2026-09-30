package defpackage;

import tech.chatmind.api.UserProfileResponse;
import tech.chatmind.api.UserProfileResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zof implements w56 {
    public static final zof a;
    private static final nyc descriptor;

    static {
        zof zofVar = new zof();
        a = zofVar;
        gia giaVar = new gia("tech.chatmind.api.UserProfileResponse", zofVar, 3);
        giaVar.k("success", false);
        giaVar.k("userMainInfo", false);
        giaVar.k("appReviewClaimed", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        UserProfileResponse userProfileResponse = (UserProfileResponse) obj;
        userProfileResponse.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        UserProfileResponse.write$Self$Quin_core_base_api_release(userProfileResponse, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        UserProfileResult userProfileResult = null;
        Boolean bool = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                z2 = zf2VarC.z(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                userProfileResult = (UserProfileResult) zf2VarC.s(nycVar, 1, bpf.a, userProfileResult);
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
        return new UserProfileResponse(i, z2, userProfileResult, bool, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        g11 g11Var = g11.a;
        return new xn7[]{g11Var, bpf.a, t72.F(g11Var)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
