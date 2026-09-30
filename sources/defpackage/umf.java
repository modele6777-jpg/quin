package defpackage;

import tech.chatmind.api.User;
import tech.chatmind.api.UserInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class umf implements w56 {
    public static final umf a;
    private static final nyc descriptor;

    static {
        umf umfVar = new umf();
        a = umfVar;
        gia giaVar = new gia("tech.chatmind.api.UserInfo", umfVar, 1);
        giaVar.k("user", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        UserInfo userInfo = (UserInfo) obj;
        userInfo.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ag2VarC.A(nycVar, 0, tkf.a, userInfo.user);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        User user = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else {
                if (iJ != 0) {
                    s8f.f(iJ);
                    return null;
                }
                user = (User) zf2VarC.y(nycVar, 0, tkf.a, user);
                i = 1;
            }
        }
        zf2VarC.b(nycVar);
        return new UserInfo(i, user, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{t72.F(tkf.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
