package defpackage;

import tech.chatmind.api.TarotReadingAsset;
import tech.chatmind.api.TarotReadingAssetMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yie implements w56 {
    public static final yie a;
    private static final nyc descriptor;

    static {
        yie yieVar = new yie();
        a = yieVar;
        gia giaVar = new gia("tech.chatmind.api.TarotReadingAsset", yieVar, 7);
        giaVar.k("assetId", true);
        giaVar.k("type", true);
        giaVar.k("mimeType", true);
        giaVar.k("size", true);
        giaVar.k("s3Key", true);
        giaVar.k("metadata", true);
        giaVar.k("createdTime", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        TarotReadingAsset tarotReadingAsset = (TarotReadingAsset) obj;
        tarotReadingAsset.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        TarotReadingAsset.write$Self$Quin_core_base_api_release(tarotReadingAsset, ag2VarC, nycVar);
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
        String str3 = null;
        Long l = null;
        String str4 = null;
        TarotReadingAssetMetadata tarotReadingAssetMetadata = null;
        String str5 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) zf2VarC.y(nycVar, 0, p4e.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) zf2VarC.y(nycVar, 1, p4e.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) zf2VarC.y(nycVar, 2, p4e.a, str3);
                    i |= 4;
                    break;
                case 3:
                    l = (Long) zf2VarC.y(nycVar, 3, eg8.a, l);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) zf2VarC.y(nycVar, 4, p4e.a, str4);
                    i |= 16;
                    break;
                case 5:
                    tarotReadingAssetMetadata = (TarotReadingAssetMetadata) zf2VarC.y(nycVar, 5, aje.a, tarotReadingAssetMetadata);
                    i |= 32;
                    break;
                case 6:
                    str5 = (String) zf2VarC.y(nycVar, 6, p4e.a, str5);
                    i |= 64;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new TarotReadingAsset(i, str, str2, str3, l, str4, tarotReadingAssetMetadata, str5, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{t72.F(p4eVar), t72.F(p4eVar), t72.F(p4eVar), t72.F(eg8.a), t72.F(p4eVar), t72.F(aje.a), t72.F(p4eVar)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
