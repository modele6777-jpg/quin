package defpackage;

import java.util.List;
import tech.chatmind.api.TarotReadingBody;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cje implements w56 {
    public static final cje a;
    private static final nyc descriptor;

    static {
        cje cjeVar = new cje();
        a = cjeVar;
        gia giaVar = new gia("tech.chatmind.api.TarotReadingBody", cjeVar, 3);
        giaVar.k("userSelectedCards", true);
        giaVar.k("content", true);
        giaVar.k("createdTime", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        TarotReadingBody tarotReadingBody = (TarotReadingBody) obj;
        tarotReadingBody.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        TarotReadingBody.write$Self$Quin_core_base_api_release(tarotReadingBody, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = TarotReadingBody.$childSerializers;
        boolean z = true;
        int i = 0;
        List list = null;
        String strO = null;
        String str = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                list = (List) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), list);
                i |= 1;
            } else if (iJ == 1) {
                strO = zf2VarC.o(nycVar, 1);
                i |= 2;
            } else {
                if (iJ != 2) {
                    s8f.f(iJ);
                    return null;
                }
                str = (String) zf2VarC.y(nycVar, 2, p4e.a, str);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new TarotReadingBody(i, list, strO, str, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{TarotReadingBody.$childSerializers[0].getValue(), p4eVar, t72.F(p4eVar)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
