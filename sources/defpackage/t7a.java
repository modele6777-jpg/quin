package defpackage;

import ai.askquin.ui.onboard.PendingUserProfile;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t7a implements w56 {
    public static final t7a a;
    private static final nyc descriptor;

    static {
        t7a t7aVar = new t7a();
        a = t7aVar;
        gia giaVar = new gia("ai.askquin.ui.onboard.PendingUserProfile", t7aVar, 6);
        giaVar.k("quinSource", true);
        giaVar.k("intentions", true);
        giaVar.k("birthday", true);
        giaVar.k("birthdayWasEdited", true);
        giaVar.k("accountId", true);
        giaVar.k("revision", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        PendingUserProfile pendingUserProfile = (PendingUserProfile) obj;
        pendingUserProfile.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        PendingUserProfile.write$Self$Quin_conversation_gpRelease(pendingUserProfile, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = PendingUserProfile.$childSerializers;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        List list = null;
        List list2 = null;
        String str = null;
        String str2 = null;
        String strO = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) zf2VarC.y(nycVar, 0, (xn7) lw7VarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    list2 = (List) zf2VarC.y(nycVar, 1, (xn7) lw7VarArr[1].getValue(), list2);
                    i |= 2;
                    break;
                case 2:
                    str = (String) zf2VarC.y(nycVar, 2, p4e.a, str);
                    i |= 4;
                    break;
                case 3:
                    z2 = zf2VarC.z(nycVar, 3);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) zf2VarC.y(nycVar, 4, p4e.a, str2);
                    i |= 16;
                    break;
                case 5:
                    strO = zf2VarC.o(nycVar, 5);
                    i |= 32;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new PendingUserProfile(i, list, list2, str, z2, str2, strO, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = PendingUserProfile.$childSerializers;
        xn7 xn7VarF = t72.F((xn7) lw7VarArr[0].getValue());
        xn7 xn7VarF2 = t72.F((xn7) lw7VarArr[1].getValue());
        p4e p4eVar = p4e.a;
        return new xn7[]{xn7VarF, xn7VarF2, t72.F(p4eVar), g11.a, t72.F(p4eVar), p4eVar};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
