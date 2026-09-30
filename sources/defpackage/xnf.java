package defpackage;

import ai.askquin.datastore.model.UserProfile;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xnf implements w56 {
    public static final xnf a;
    private static final nyc descriptor;

    static {
        xnf xnfVar = new xnf();
        a = xnfVar;
        gia giaVar = new gia("ai.askquin.datastore.model.UserProfile", xnfVar, 11);
        giaVar.k("nickname", false);
        giaVar.k("gender", false);
        giaVar.k("birthday", false);
        giaVar.k("bios", false);
        giaVar.k("cardCoverOrdinal", false);
        giaVar.k("purchasedSkins", true);
        giaVar.k("usingSkinType", true);
        giaVar.k("appReviewClaimed", true);
        giaVar.k("optOutAllServerPush", true);
        giaVar.k("optOutDailyTarotLocalPush", true);
        giaVar.k("optOutTomorrowTarotLocalPush", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        UserProfile userProfile = (UserProfile) obj;
        userProfile.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        UserProfile.write$Self$Quin_core_datastore_release(userProfile, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        lw7[] lw7VarArr;
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr2 = UserProfile.$childSerializers;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        boolean z = true;
        Boolean bool4 = null;
        int i = 0;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        Integer num = null;
        List list = null;
        n2f n2fVar = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    break;
                case 0:
                    lw7VarArr = lw7VarArr2;
                    strO = zf2VarC.o(nycVar, 0);
                    i |= 1;
                    lw7VarArr2 = lw7VarArr;
                    z = z;
                    break;
                case 1:
                    strO2 = zf2VarC.o(nycVar, 1);
                    i |= 2;
                    lw7VarArr2 = lw7VarArr2;
                    break;
                case 2:
                    strO3 = zf2VarC.o(nycVar, 2);
                    i |= 4;
                    lw7VarArr2 = lw7VarArr2;
                    break;
                case 3:
                    strO4 = zf2VarC.o(nycVar, 3);
                    i |= 8;
                    lw7VarArr2 = lw7VarArr2;
                    break;
                case 4:
                    lw7VarArr = lw7VarArr2;
                    num = (Integer) zf2VarC.y(nycVar, 4, c77.a, num);
                    i |= 16;
                    lw7VarArr2 = lw7VarArr;
                    z = z;
                    break;
                case 5:
                    lw7VarArr = lw7VarArr2;
                    list = (List) zf2VarC.s(nycVar, 5, (xn7) lw7VarArr[5].getValue(), list);
                    i |= 32;
                    lw7VarArr2 = lw7VarArr;
                    z = z;
                    break;
                case 6:
                    lw7VarArr = lw7VarArr2;
                    n2fVar = (n2f) zf2VarC.s(nycVar, 6, (xn7) lw7VarArr[6].getValue(), n2fVar);
                    i |= 64;
                    lw7VarArr2 = lw7VarArr;
                    z = z;
                    break;
                case 7:
                    lw7VarArr = lw7VarArr2;
                    bool4 = (Boolean) zf2VarC.y(nycVar, 7, g11.a, bool4);
                    i |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    lw7VarArr2 = lw7VarArr;
                    z = z;
                    break;
                case 8:
                    lw7VarArr = lw7VarArr2;
                    bool3 = (Boolean) zf2VarC.y(nycVar, 8, g11.a, bool3);
                    i |= 256;
                    lw7VarArr2 = lw7VarArr;
                    z = z;
                    break;
                case 9:
                    lw7VarArr = lw7VarArr2;
                    bool2 = (Boolean) zf2VarC.y(nycVar, 9, g11.a, bool2);
                    i |= 512;
                    lw7VarArr2 = lw7VarArr;
                    z = z;
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    lw7VarArr = lw7VarArr2;
                    bool = (Boolean) zf2VarC.y(nycVar, 10, g11.a, bool);
                    i |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                    lw7VarArr2 = lw7VarArr;
                    z = z;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new UserProfile(i, strO, strO2, strO3, strO4, num, list, n2fVar, bool4, bool3, bool2, bool, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = UserProfile.$childSerializers;
        p4e p4eVar = p4e.a;
        g11 g11Var = g11.a;
        return new xn7[]{p4eVar, p4eVar, p4eVar, p4eVar, t72.F(c77.a), lw7VarArr[5].getValue(), lw7VarArr[6].getValue(), t72.F(g11Var), t72.F(g11Var), t72.F(g11Var), t72.F(g11Var)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
