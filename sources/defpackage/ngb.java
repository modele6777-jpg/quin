package defpackage;

import tech.chatmind.api.ReadingRequest;
import tech.chatmind.api.UserSelectedSpread;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ngb implements w56 {
    public static final ngb a;
    private static final nyc descriptor;

    static {
        ngb ngbVar = new ngb();
        a = ngbVar;
        gia giaVar = new gia("tech.chatmind.api.ReadingRequest", ngbVar, 6);
        giaVar.k("chatId", false);
        giaVar.k("question", false);
        giaVar.k("divinationType", true);
        giaVar.k("scenarioId", true);
        giaVar.k("userSelectedSpread", true);
        giaVar.k("followsUpTriggerMessageId", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        ReadingRequest readingRequest = (ReadingRequest) obj;
        readingRequest.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ReadingRequest.write$Self$Quin_core_base_api_release(readingRequest, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        String str = null;
        String str2 = null;
        UserSelectedSpread userSelectedSpread = null;
        String str3 = null;
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
                    str = (String) zf2VarC.y(nycVar, 2, p4e.a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) zf2VarC.y(nycVar, 3, p4e.a, str2);
                    i |= 8;
                    break;
                case 4:
                    userSelectedSpread = (UserSelectedSpread) zf2VarC.y(nycVar, 4, qpf.a, userSelectedSpread);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) zf2VarC.y(nycVar, 5, p4e.a, str3);
                    i |= 32;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new ReadingRequest(i, strO, strO2, str, str2, userSelectedSpread, str3, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, t72.F(p4eVar), t72.F(p4eVar), t72.F(qpf.a), t72.F(p4eVar)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
