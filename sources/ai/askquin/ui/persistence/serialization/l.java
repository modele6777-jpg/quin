package ai.askquin.ui.persistence.serialization;

import defpackage.ag2;
import defpackage.ev4;
import defpackage.gia;
import defpackage.nyc;
import defpackage.om3;
import defpackage.s8f;
import defpackage.w56;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.zf2;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements w56 {
    public static final l a;
    private static final nyc descriptor;

    static {
        l lVar = new l();
        a = lVar;
        gia giaVar = new gia("ai.askquin.ui.persistence.serialization.SerializableDivinationState.PhotoTarot", lVar, 2);
        giaVar.k("analysis", false);
        giaVar.k("card", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SerializableDivinationState.PhotoTarot photoTarot = (SerializableDivinationState.PhotoTarot) obj;
        photoTarot.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SerializableDivinationState.PhotoTarot.write$Self$Quin_conversation_gpRelease(photoTarot, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        SerializableDivinationState.Analysis analysis = null;
        PhotoTarotCard photoTarotCard = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                analysis = (SerializableDivinationState.Analysis) zf2VarC.s(nycVar, 0, d.a, analysis);
                i |= 1;
            } else {
                if (iJ != 1) {
                    s8f.f(iJ);
                    return null;
                }
                photoTarotCard = (PhotoTarotCard) zf2VarC.s(nycVar, 1, a.a, photoTarotCard);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new SerializableDivinationState.PhotoTarot(i, analysis, photoTarotCard, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{d.a, a.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
