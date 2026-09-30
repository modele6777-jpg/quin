package defpackage;

import tech.chatmind.api.CloudMixedDeckSnapshot;
import tech.chatmind.api.TarotReadingMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lje implements w56 {
    public static final lje a;
    private static final nyc descriptor;

    static {
        lje ljeVar = new lje();
        a = ljeVar;
        gia giaVar = new gia("tech.chatmind.api.TarotReadingMetadata", ljeVar, 3);
        giaVar.k("divinationType", true);
        giaVar.k("scenarioId", true);
        giaVar.k("mixedDeckSnapshot", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        TarotReadingMetadata tarotReadingMetadata = (TarotReadingMetadata) obj;
        tarotReadingMetadata.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        TarotReadingMetadata.write$Self$Quin_core_base_api_release(tarotReadingMetadata, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        CloudMixedDeckSnapshot cloudMixedDeckSnapshot = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                str = (String) zf2VarC.y(nycVar, 0, p4e.a, str);
                i |= 1;
            } else if (iJ == 1) {
                str2 = (String) zf2VarC.y(nycVar, 1, p4e.a, str2);
                i |= 2;
            } else {
                if (iJ != 2) {
                    s8f.f(iJ);
                    return null;
                }
                cloudMixedDeckSnapshot = (CloudMixedDeckSnapshot) zf2VarC.y(nycVar, 2, k62.a, cloudMixedDeckSnapshot);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new TarotReadingMetadata(i, str, str2, cloudMixedDeckSnapshot, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{t72.F(p4eVar), t72.F(p4eVar), t72.F(k62.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
