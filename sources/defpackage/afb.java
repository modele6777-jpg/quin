package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import tech.chatmind.api.ReadingFeedbackData;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class afb implements w56 {
    public static final afb a;
    private static final nyc descriptor;

    static {
        afb afbVar = new afb();
        a = afbVar;
        gia giaVar = new gia("tech.chatmind.api.ReadingFeedbackData", afbVar, 9);
        giaVar.k("uid", false);
        giaVar.k("chatId", false);
        giaVar.k("userType", false);
        giaVar.k("entrypoint", false);
        giaVar.k("feedbackType", false);
        giaVar.k("tags", false);
        giaVar.k("text", false);
        giaVar.k("createdAt", false);
        giaVar.k("updatedAt", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        ReadingFeedbackData readingFeedbackData = (ReadingFeedbackData) obj;
        readingFeedbackData.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ReadingFeedbackData.write$Self$Quin_core_base_api_release(readingFeedbackData, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = ReadingFeedbackData.$childSerializers;
        Object obj = null;
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        String strO5 = null;
        List list = null;
        String str = null;
        String strO6 = null;
        String strO7 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strO = zf2VarC.o(nycVar, 0);
                    i |= 1;
                    break;
                case 1:
                    strO2 = zf2VarC.o(nycVar, 1);
                    i |= 2;
                    break;
                case 2:
                    strO3 = zf2VarC.o(nycVar, 2);
                    i |= 4;
                    break;
                case 3:
                    strO4 = zf2VarC.o(nycVar, 3);
                    i |= 8;
                    break;
                case 4:
                    strO5 = zf2VarC.o(nycVar, 4);
                    i |= 16;
                    break;
                case 5:
                    list = (List) zf2VarC.y(nycVar, 5, (xn7) lw7VarArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    str = (String) zf2VarC.y(nycVar, 6, p4e.a, str);
                    i |= 64;
                    break;
                case 7:
                    strO6 = zf2VarC.o(nycVar, 7);
                    i |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    continue;
                case 8:
                    strO7 = zf2VarC.o(nycVar, 8);
                    i |= 256;
                    continue;
                default:
                    s8f.f(iJ);
                    return obj;
            }
            obj = null;
        }
        zf2VarC.b(nycVar);
        return new ReadingFeedbackData(i, strO, strO2, strO3, strO4, strO5, list, str, strO6, strO7, null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = ReadingFeedbackData.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, p4eVar, p4eVar, p4eVar, t72.F((xn7) lw7VarArr[5].getValue()), t72.F(p4eVar), p4eVar, p4eVar};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
