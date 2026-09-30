package defpackage;

import tech.chatmind.api.AdditionalInfoAudio;
import tech.chatmind.api.TarotReadingAdditionalInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uie implements w56 {
    public static final uie a;
    private static final nyc descriptor;

    static {
        uie uieVar = new uie();
        a = uieVar;
        gia giaVar = new gia("tech.chatmind.api.TarotReadingAdditionalInfo", uieVar, 4);
        giaVar.k("additionalQuestionTextInfo", true);
        giaVar.k("additionalReadingTextInfo", true);
        giaVar.k("additionalQuestionAudioInfo", true);
        giaVar.k("additionalReadingAudioInfo", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        TarotReadingAdditionalInfo tarotReadingAdditionalInfo = (TarotReadingAdditionalInfo) obj;
        tarotReadingAdditionalInfo.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        TarotReadingAdditionalInfo.write$Self$Quin_core_base_api_release(tarotReadingAdditionalInfo, ag2VarC, nycVar);
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
        AdditionalInfoAudio additionalInfoAudio = null;
        AdditionalInfoAudio additionalInfoAudio2 = null;
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
            } else if (iJ == 2) {
                additionalInfoAudio = (AdditionalInfoAudio) zf2VarC.y(nycVar, 2, gg.a, additionalInfoAudio);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                additionalInfoAudio2 = (AdditionalInfoAudio) zf2VarC.y(nycVar, 3, gg.a, additionalInfoAudio2);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new TarotReadingAdditionalInfo(i, str, str2, additionalInfoAudio, additionalInfoAudio2, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        xn7 xn7VarF = t72.F(p4eVar);
        xn7 xn7VarF2 = t72.F(p4eVar);
        gg ggVar = gg.a;
        return new xn7[]{xn7VarF, xn7VarF2, t72.F(ggVar), t72.F(ggVar)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
