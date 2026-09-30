package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import tech.chatmind.api.UserProfileUpdateRequestBody;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class epf implements w56 {
    public static final epf a;
    private static final nyc descriptor;

    static {
        epf epfVar = new epf();
        a = epfVar;
        gia giaVar = new gia("tech.chatmind.api.UserProfileUpdateRequestBody", epfVar, 12);
        giaVar.k("nickname", true);
        giaVar.k("gender", true);
        giaVar.k("birthday", true);
        giaVar.k("selfDescription", true);
        giaVar.k("customizedCardBack", true);
        giaVar.k("tarotExperienceLevel", true);
        giaVar.k("expectations", true);
        giaVar.k("quinSource", true);
        giaVar.k("intentions", true);
        giaVar.k("optOutAllServerPush", true);
        giaVar.k("optOutDailyTarotLocalPush", true);
        giaVar.k("optOutTomorrowTarotLocalPush", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        UserProfileUpdateRequestBody userProfileUpdateRequestBody = (UserProfileUpdateRequestBody) obj;
        userProfileUpdateRequestBody.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        UserProfileUpdateRequestBody.write$Self$Quin_core_base_api_release(userProfileUpdateRequestBody, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = UserProfileUpdateRequestBody.$childSerializers;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        List list = null;
        boolean z = true;
        List list2 = null;
        int i = 0;
        String str = null;
        Integer num = null;
        String str2 = null;
        String str3 = null;
        Integer num2 = null;
        Integer num3 = null;
        String str4 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    bool = bool;
                    break;
                case 0:
                    str = (String) zf2VarC.y(nycVar, 0, p4e.a, str);
                    i |= 1;
                    z = z;
                    bool = bool;
                    break;
                case 1:
                    num = (Integer) zf2VarC.y(nycVar, 1, c77.a, num);
                    i |= 2;
                    z = z;
                    str = str;
                    break;
                case 2:
                    str2 = (String) zf2VarC.y(nycVar, 2, p4e.a, str2);
                    i |= 4;
                    z = z;
                    str = str;
                    break;
                case 3:
                    str3 = (String) zf2VarC.y(nycVar, 3, p4e.a, str3);
                    i |= 8;
                    z = z;
                    str = str;
                    break;
                case 4:
                    num2 = (Integer) zf2VarC.y(nycVar, 4, c77.a, num2);
                    i |= 16;
                    z = z;
                    str = str;
                    break;
                case 5:
                    num3 = (Integer) zf2VarC.y(nycVar, 5, c77.a, num3);
                    i |= 32;
                    z = z;
                    str = str;
                    break;
                case 6:
                    str4 = (String) zf2VarC.y(nycVar, 6, p4e.a, str4);
                    i |= 64;
                    z = z;
                    str = str;
                    break;
                case 7:
                    list2 = (List) zf2VarC.y(nycVar, 7, (xn7) lw7VarArr[7].getValue(), list2);
                    i |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    z = z;
                    str = str;
                    break;
                case 8:
                    list = (List) zf2VarC.y(nycVar, 8, (xn7) lw7VarArr[8].getValue(), list);
                    i |= 256;
                    z = z;
                    str = str;
                    break;
                case 9:
                    bool3 = (Boolean) zf2VarC.y(nycVar, 9, g11.a, bool3);
                    i |= 512;
                    z = z;
                    str = str;
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    bool2 = (Boolean) zf2VarC.y(nycVar, 10, g11.a, bool2);
                    i |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                    z = z;
                    str = str;
                    break;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    bool = (Boolean) zf2VarC.y(nycVar, 11, g11.a, bool);
                    i |= 2048;
                    z = z;
                    str = str;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new UserProfileUpdateRequestBody(i, str, num, str2, str3, num2, num3, str4, list2, list, bool3, bool2, bool, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = UserProfileUpdateRequestBody.$childSerializers;
        p4e p4eVar = p4e.a;
        xn7 xn7VarF = t72.F(p4eVar);
        c77 c77Var = c77.a;
        xn7 xn7VarF2 = t72.F(c77Var);
        xn7 xn7VarF3 = t72.F(p4eVar);
        xn7 xn7VarF4 = t72.F(p4eVar);
        xn7 xn7VarF5 = t72.F(c77Var);
        xn7 xn7VarF6 = t72.F(c77Var);
        xn7 xn7VarF7 = t72.F(p4eVar);
        xn7 xn7VarF8 = t72.F((xn7) lw7VarArr[7].getValue());
        xn7 xn7VarF9 = t72.F((xn7) lw7VarArr[8].getValue());
        g11 g11Var = g11.a;
        return new xn7[]{xn7VarF, xn7VarF2, xn7VarF3, xn7VarF4, xn7VarF5, xn7VarF6, xn7VarF7, xn7VarF8, xn7VarF9, t72.F(g11Var), t72.F(g11Var), t72.F(g11Var)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
