package defpackage;

import tech.chatmind.api.AdditionalInfoAudio;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gg implements w56 {
    public static final gg a;
    private static final nyc descriptor;

    static {
        gg ggVar = new gg();
        a = ggVar;
        gia giaVar = new gia("tech.chatmind.api.AdditionalInfoAudio", ggVar, 2);
        giaVar.k("assetId", true);
        giaVar.k("transcription", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        AdditionalInfoAudio additionalInfoAudio = (AdditionalInfoAudio) obj;
        additionalInfoAudio.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        AdditionalInfoAudio.write$Self$Quin_core_base_api_release(additionalInfoAudio, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String strO = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                str = (String) zf2VarC.y(nycVar, 0, p4e.a, str);
                i |= 1;
            } else {
                if (iJ != 1) {
                    s8f.f(iJ);
                    return null;
                }
                strO = zf2VarC.o(nycVar, 1);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new AdditionalInfoAudio(i, str, strO, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{t72.F(p4eVar), p4eVar};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
