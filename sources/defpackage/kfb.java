package defpackage;

import java.util.List;
import tech.chatmind.api.ReadingFeedbackRequest;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kfb implements w56 {
    public static final kfb a;
    private static final nyc descriptor;

    static {
        kfb kfbVar = new kfb();
        a = kfbVar;
        gia giaVar = new gia("tech.chatmind.api.ReadingFeedbackRequest", kfbVar, 5);
        giaVar.k("chatId", false);
        giaVar.k("feedbackType", false);
        giaVar.k("entrypoint", true);
        giaVar.k("tags", true);
        giaVar.k("text", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        ReadingFeedbackRequest readingFeedbackRequest = (ReadingFeedbackRequest) obj;
        readingFeedbackRequest.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ReadingFeedbackRequest.write$Self$Quin_core_base_api_release(readingFeedbackRequest, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = ReadingFeedbackRequest.$childSerializers;
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        String str = null;
        List list = null;
        String str2 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strO = zf2VarC.o(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                strO2 = zf2VarC.o(nycVar, 1);
                i |= 2;
            } else if (iJ == 2) {
                str = (String) zf2VarC.y(nycVar, 2, p4e.a, str);
                i |= 4;
            } else if (iJ == 3) {
                list = (List) zf2VarC.y(nycVar, 3, (xn7) lw7VarArr[3].getValue(), list);
                i |= 8;
            } else {
                if (iJ != 4) {
                    s8f.f(iJ);
                    return null;
                }
                str2 = (String) zf2VarC.y(nycVar, 4, p4e.a, str2);
                i |= 16;
            }
        }
        zf2VarC.b(nycVar);
        return new ReadingFeedbackRequest(i, strO, strO2, str, list, str2, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = ReadingFeedbackRequest.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, t72.F(p4eVar), t72.F((xn7) lw7VarArr[3].getValue()), t72.F(p4eVar)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
