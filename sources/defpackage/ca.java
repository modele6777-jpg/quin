package defpackage;

import ai.askquin.ui.settings.profile.AccountProfileRoute$SetGender;
import tech.chatmind.api.Gender;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ca implements w56 {
    public static final ca a;
    private static final nyc descriptor;

    static {
        ca caVar = new ca();
        a = caVar;
        gia giaVar = new gia("ai.askquin.ui.settings.profile.AccountProfileRoute.SetGender", caVar, 1);
        giaVar.k("default", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        AccountProfileRoute$SetGender accountProfileRoute$SetGender = (AccountProfileRoute$SetGender) obj;
        accountProfileRoute$SetGender.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ag2VarC.A(nycVar, 0, (xn7) AccountProfileRoute$SetGender.$childSerializers[0].getValue(), accountProfileRoute$SetGender.default);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = AccountProfileRoute$SetGender.$childSerializers;
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        Gender gender = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else {
                if (iJ != 0) {
                    s8f.f(iJ);
                    return null;
                }
                gender = (Gender) zf2VarC.y(nycVar, 0, (xn7) lw7VarArr[0].getValue(), gender);
                i = 1;
            }
        }
        zf2VarC.b(nycVar);
        return new AccountProfileRoute$SetGender(i, gender, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{t72.F((xn7) AccountProfileRoute$SetGender.$childSerializers[0].getValue())};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
