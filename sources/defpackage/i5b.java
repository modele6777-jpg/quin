package defpackage;

import java.util.List;
import tech.chatmind.api.QuestionRequest;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i5b implements w56 {
    public static final i5b a;
    private static final nyc descriptor;

    static {
        i5b i5bVar = new i5b();
        a = i5bVar;
        gia giaVar = new gia("tech.chatmind.api.QuestionRequest", i5bVar, 6);
        giaVar.k("tarotRole", false);
        giaVar.k("chatId", false);
        giaVar.k("uid", false);
        giaVar.k("question", false);
        giaVar.k("messages", false);
        giaVar.k("patternId", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        QuestionRequest questionRequest = (QuestionRequest) obj;
        questionRequest.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        QuestionRequest.write$Self$Quin_core_base_api_release(questionRequest, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = QuestionRequest.$childSerializers;
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        List list = null;
        String str = null;
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
                    strO3 = zf2VarC.o(nycVar, 2);
                    i |= 4;
                    break;
                case 3:
                    strO4 = zf2VarC.o(nycVar, 3);
                    i |= 8;
                    break;
                case 4:
                    list = (List) zf2VarC.s(nycVar, 4, (xn7) lw7VarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    str = (String) zf2VarC.y(nycVar, 5, p4e.a, str);
                    i |= 32;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new QuestionRequest(i, strO, strO2, strO3, strO4, list, str, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = QuestionRequest.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, p4eVar, p4eVar, lw7VarArr[4].getValue(), t72.F(p4eVar)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
