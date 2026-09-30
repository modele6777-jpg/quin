package ai.askquin.repository;

import defpackage.ag2;
import defpackage.ev4;
import defpackage.gia;
import defpackage.nyc;
import defpackage.om3;
import defpackage.p4e;
import defpackage.s8f;
import defpackage.w56;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.zf2;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements w56 {
    public static final a a;
    private static final nyc descriptor;

    static {
        a aVar = new a();
        a = aVar;
        gia giaVar = new gia("ai.askquin.repository.LocalAssetRepository.SkinMeaningOverride", aVar, 2);
        giaVar.k("cardKey", false);
        giaVar.k("description", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        LocalAssetRepository$SkinMeaningOverride localAssetRepository$SkinMeaningOverride = (LocalAssetRepository$SkinMeaningOverride) obj;
        localAssetRepository$SkinMeaningOverride.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        LocalAssetRepository$SkinMeaningOverride.write$Self$Quin_core_base_api_release(localAssetRepository$SkinMeaningOverride, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strO = zf2VarC.o(nycVar, 0);
                i |= 1;
            } else {
                if (iJ != 1) {
                    s8f.f(iJ);
                    return null;
                }
                strO2 = zf2VarC.o(nycVar, 1);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new LocalAssetRepository$SkinMeaningOverride(i, strO, strO2, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
