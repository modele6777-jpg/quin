package defpackage;

import tech.chatmind.api.TarotReadingAssetMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aje implements w56 {
    public static final aje a;
    private static final nyc descriptor;

    static {
        aje ajeVar = new aje();
        a = ajeVar;
        gia giaVar = new gia("tech.chatmind.api.TarotReadingAssetMetadata", ajeVar, 1);
        giaVar.k("duration", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        TarotReadingAssetMetadata tarotReadingAssetMetadata = (TarotReadingAssetMetadata) obj;
        tarotReadingAssetMetadata.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        TarotReadingAssetMetadata.write$Self$Quin_core_base_api_release(tarotReadingAssetMetadata, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        Double d = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else {
                if (iJ != 0) {
                    s8f.f(iJ);
                    return null;
                }
                d = (Double) zf2VarC.y(nycVar, 0, vi4.a, d);
                i = 1;
            }
        }
        zf2VarC.b(nycVar);
        return new TarotReadingAssetMetadata(i, d, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{t72.F(vi4.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
