package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import tech.chatmind.api.dailycard.model.DailyCardResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e43 implements w56 {
    public static final e43 a;
    private static final nyc descriptor;

    static {
        e43 e43Var = new e43();
        a = e43Var;
        gia giaVar = new gia("tech.chatmind.api.dailycard.model.DailyCardResponse", e43Var, 11);
        giaVar.k("date", false);
        giaVar.k("description", false);
        giaVar.k("direction", false);
        giaVar.k("key", false);
        giaVar.k("locale", false);
        giaVar.k("question", false);
        giaVar.k("reading", false);
        giaVar.k("summary", false);
        giaVar.k("tagType", false);
        giaVar.k("title", false);
        giaVar.k("userId", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        DailyCardResponse dailyCardResponse = (DailyCardResponse) obj;
        dailyCardResponse.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        DailyCardResponse.write$Self$Quin_core_base_api_release(dailyCardResponse, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        int iT = 0;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        String strO5 = null;
        String strO6 = null;
        String strO7 = null;
        String strO8 = null;
        String strO9 = null;
        String strO10 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strO = zf2VarC.o(nycVar, 0);
                    i |= 1;
                    break;
                case 1:
                    strO2 = zf2VarC.o(nycVar, 1);
                    i |= 2;
                    break;
                case 2:
                    iT = zf2VarC.t(nycVar, 2);
                    i |= 4;
                    break;
                case 3:
                    strO3 = zf2VarC.o(nycVar, 3);
                    i |= 8;
                    break;
                case 4:
                    strO4 = zf2VarC.o(nycVar, 4);
                    i |= 16;
                    break;
                case 5:
                    strO5 = zf2VarC.o(nycVar, 5);
                    i |= 32;
                    break;
                case 6:
                    strO6 = zf2VarC.o(nycVar, 6);
                    i |= 64;
                    break;
                case 7:
                    strO7 = zf2VarC.o(nycVar, 7);
                    i |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    break;
                case 8:
                    strO8 = zf2VarC.o(nycVar, 8);
                    i |= 256;
                    break;
                case 9:
                    strO9 = zf2VarC.o(nycVar, 9);
                    i |= 512;
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    strO10 = zf2VarC.o(nycVar, 10);
                    i |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new DailyCardResponse(i, strO, strO2, iT, strO3, strO4, strO5, strO6, strO7, strO8, strO9, strO10, null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, c77.a, p4eVar, p4eVar, p4eVar, p4eVar, p4eVar, p4eVar, p4eVar, p4eVar};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
