package defpackage;

import java.util.List;
import tech.chatmind.api.TarotReadingChatState;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eje implements w56 {
    public static final eje a;
    private static final nyc descriptor;

    static {
        eje ejeVar = new eje();
        a = ejeVar;
        gia giaVar = new gia("tech.chatmind.api.TarotReadingChatState", ejeVar, 3);
        giaVar.k("messages", true);
        giaVar.k("createdTime", true);
        giaVar.k("updatedTime", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        TarotReadingChatState tarotReadingChatState = (TarotReadingChatState) obj;
        tarotReadingChatState.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        TarotReadingChatState.write$Self$Quin_core_base_api_release(tarotReadingChatState, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = TarotReadingChatState.$childSerializers;
        boolean z = true;
        int i = 0;
        List list = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                list = (List) zf2VarC.y(nycVar, 0, (xn7) lw7VarArr[0].getValue(), list);
                i |= 1;
            } else if (iJ == 1) {
                str = (String) zf2VarC.y(nycVar, 1, p4e.a, str);
                i |= 2;
            } else {
                if (iJ != 2) {
                    s8f.f(iJ);
                    return null;
                }
                str2 = (String) zf2VarC.y(nycVar, 2, p4e.a, str2);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new TarotReadingChatState(i, list, str, str2, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        xn7 xn7VarF = t72.F((xn7) TarotReadingChatState.$childSerializers[0].getValue());
        p4e p4eVar = p4e.a;
        return new xn7[]{xn7VarF, t72.F(p4eVar), t72.F(p4eVar)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
