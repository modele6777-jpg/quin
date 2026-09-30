package defpackage;

import ai.askquin.datastore.model.InternalAnnualReportProgress;
import ai.askquin.datastore.model.LocalStorage;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jb8 implements w56 {
    public static final jb8 a;
    private static final nyc descriptor;

    static {
        jb8 jb8Var = new jb8();
        a = jb8Var;
        gia giaVar = new gia("ai.askquin.datastore.model.LocalStorage", jb8Var, 22);
        giaVar.k("visitedDays", true);
        giaVar.k("visitedEventIds", true);
        giaVar.k("consumedDailyMonthEventIds", true);
        giaVar.k("drawFreeSingleCardDays", true);
        giaVar.k("hasNewMessage", true);
        giaVar.k("openTimes", true);
        giaVar.k("visitedSkinBanner", true);
        giaVar.k("lastExpirationAlertDate", true);
        giaVar.k("discountStartDateTime", true);
        giaVar.k("visitedGuide", true);
        giaVar.k("divinationCompletedDates", true);
        giaVar.k("dailyFortuneCompletedCount", true);
        giaVar.k("lastDailyFortuneCompletedDate", true);
        giaVar.k("dailyFortuneCompletedDates", true);
        giaVar.k("lastDailyFortuneCompletionEventDate", true);
        giaVar.k("firstDailyFortuneCompleted", true);
        giaVar.k("firstDivinationCompletedSinceUpdate", true);
        giaVar.k("annualReportProgress", true);
        giaVar.k("dailyFortuneSkinType", true);
        giaVar.k("skinUsageHistory", true);
        giaVar.k("dailyFortuneSkinPerDate", true);
        giaVar.k("dailyFortuneSkinBackfilled", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        LocalStorage localStorage = (LocalStorage) obj;
        localStorage.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        LocalStorage.write$Self$Quin_core_datastore_release(localStorage, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        int i;
        List list;
        int i2;
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = LocalStorage.$childSerializers;
        List list2 = null;
        String str = null;
        List list3 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i3 = 0;
        Map map = null;
        List list4 = null;
        List list5 = null;
        List list6 = null;
        InternalAnnualReportProgress internalAnnualReportProgress = null;
        String str5 = null;
        Map map2 = null;
        int i4 = 1;
        boolean z = false;
        boolean z2 = true;
        int iT = 0;
        boolean z3 = false;
        int iT2 = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        List list7 = null;
        boolean z7 = false;
        while (z2) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    list = list7;
                    z2 = false;
                    str = str;
                    list5 = list5;
                    i4 = 1;
                    list7 = list;
                    list2 = list2;
                    break;
                case 0:
                    list = (List) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), list7);
                    i3 |= 1;
                    list4 = list4;
                    str = str;
                    list5 = list5;
                    i4 = 1;
                    list7 = list;
                    list2 = list2;
                    break;
                case 1:
                    list5 = list5;
                    list4 = (List) zf2VarC.s(nycVar, i4, (xn7) lw7VarArr[i4].getValue(), list4);
                    i3 |= 2;
                    list2 = list2;
                    list5 = list5;
                    break;
                case 2:
                    list2 = list2;
                    list5 = (List) zf2VarC.s(nycVar, 2, (xn7) lw7VarArr[2].getValue(), list5);
                    i3 |= 4;
                    list4 = list4;
                    list2 = list2;
                    break;
                case 3:
                    list4 = list4;
                    list5 = list5;
                    list6 = (List) zf2VarC.s(nycVar, 3, (xn7) lw7VarArr[3].getValue(), list6);
                    i3 |= 8;
                    list4 = list4;
                    list5 = list5;
                    break;
                case 4:
                    list4 = list4;
                    z3 = zf2VarC.z(nycVar, 4);
                    i3 |= 16;
                    list4 = list4;
                    break;
                case 5:
                    list4 = list4;
                    iT2 = zf2VarC.t(nycVar, 5);
                    i3 |= 32;
                    list4 = list4;
                    break;
                case 6:
                    list4 = list4;
                    z4 = zf2VarC.z(nycVar, 6);
                    i3 |= 64;
                    list4 = list4;
                    break;
                case 7:
                    list4 = list4;
                    list5 = list5;
                    str4 = (String) zf2VarC.y(nycVar, 7, p4e.a, str4);
                    i3 |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    list4 = list4;
                    list5 = list5;
                    break;
                case 8:
                    list4 = list4;
                    list5 = list5;
                    str2 = (String) zf2VarC.y(nycVar, 8, p4e.a, str2);
                    i3 |= 256;
                    list4 = list4;
                    list5 = list5;
                    break;
                case 9:
                    list4 = list4;
                    z = zf2VarC.z(nycVar, 9);
                    i3 |= 512;
                    list4 = list4;
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    list4 = list4;
                    list5 = list5;
                    list3 = (List) zf2VarC.s(nycVar, 10, (xn7) lw7VarArr[10].getValue(), list3);
                    i3 |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                    list4 = list4;
                    list5 = list5;
                    break;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    list4 = list4;
                    iT = zf2VarC.t(nycVar, 11);
                    i3 |= 2048;
                    list4 = list4;
                    break;
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    list4 = list4;
                    list5 = list5;
                    str = (String) zf2VarC.y(nycVar, 12, p4e.a, str);
                    i3 |= 4096;
                    list4 = list4;
                    list5 = list5;
                    break;
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    list4 = list4;
                    list5 = list5;
                    list2 = (List) zf2VarC.s(nycVar, 13, (xn7) lw7VarArr[13].getValue(), list2);
                    i3 |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    list4 = list4;
                    list5 = list5;
                    break;
                case 14:
                    list4 = list4;
                    list5 = list5;
                    str3 = (String) zf2VarC.y(nycVar, 14, p4e.a, str3);
                    i3 |= 16384;
                    list4 = list4;
                    list5 = list5;
                    break;
                case 15:
                    z5 = zf2VarC.z(nycVar, 15);
                    i = 32768;
                    i3 |= i;
                    list4 = list4;
                    break;
                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                    z6 = zf2VarC.z(nycVar, 16);
                    i = 65536;
                    i3 |= i;
                    list4 = list4;
                    break;
                case 17:
                    internalAnnualReportProgress = (InternalAnnualReportProgress) zf2VarC.y(nycVar, 17, u87.a, internalAnnualReportProgress);
                    i2 = 131072;
                    i3 |= i2;
                    list4 = list4;
                    list5 = list5;
                    break;
                case 18:
                    str5 = (String) zf2VarC.y(nycVar, 18, p4e.a, str5);
                    i2 = 262144;
                    i3 |= i2;
                    list4 = list4;
                    list5 = list5;
                    break;
                case 19:
                    map2 = (Map) zf2VarC.s(nycVar, 19, (xn7) lw7VarArr[19].getValue(), map2);
                    i2 = 524288;
                    i3 |= i2;
                    list4 = list4;
                    list5 = list5;
                    break;
                case 20:
                    map = (Map) zf2VarC.s(nycVar, 20, (xn7) lw7VarArr[20].getValue(), map);
                    i2 = 1048576;
                    i3 |= i2;
                    list4 = list4;
                    list5 = list5;
                    break;
                case 21:
                    z7 = zf2VarC.z(nycVar, 21);
                    i = 2097152;
                    i3 |= i;
                    list4 = list4;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        List list8 = list2;
        List list9 = list7;
        List list10 = list4;
        zf2VarC.b(nycVar);
        return new LocalStorage(i3, list9, list10, list5, list6, z3, iT2, z4, str4, str2, z, list3, iT, str, list8, str3, z5, z6, internalAnnualReportProgress, str5, map2, map, z7, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = LocalStorage.$childSerializers;
        g11 g11Var = g11.a;
        c77 c77Var = c77.a;
        p4e p4eVar = p4e.a;
        return new xn7[]{lw7VarArr[0].getValue(), lw7VarArr[1].getValue(), lw7VarArr[2].getValue(), lw7VarArr[3].getValue(), g11Var, c77Var, g11Var, t72.F(p4eVar), t72.F(p4eVar), g11Var, lw7VarArr[10].getValue(), c77Var, t72.F(p4eVar), lw7VarArr[13].getValue(), t72.F(p4eVar), g11Var, g11Var, t72.F(u87.a), t72.F(p4eVar), lw7VarArr[19].getValue(), lw7VarArr[20].getValue(), g11Var};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
