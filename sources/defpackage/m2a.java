package defpackage;

import tech.chatmind.api.PauseReadingAudioResponse;
import tech.chatmind.api.PauseReadingAudioStatus;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m2a implements w56 {
    public static final m2a a;
    private static final nyc descriptor;

    static {
        m2a m2aVar = new m2a();
        a = m2aVar;
        gia giaVar = new gia("tech.chatmind.api.PauseReadingAudioResponse", m2aVar, 1);
        giaVar.k("status", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        PauseReadingAudioResponse pauseReadingAudioResponse = (PauseReadingAudioResponse) obj;
        pauseReadingAudioResponse.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        PauseReadingAudioResponse.write$Self$Quin_core_base_api_release(pauseReadingAudioResponse, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = PauseReadingAudioResponse.$childSerializers;
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        PauseReadingAudioStatus pauseReadingAudioStatus = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else {
                if (iJ != 0) {
                    s8f.f(iJ);
                    return null;
                }
                pauseReadingAudioStatus = (PauseReadingAudioStatus) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), pauseReadingAudioStatus);
                i = 1;
            }
        }
        zf2VarC.b(nycVar);
        return new PauseReadingAudioResponse(i, pauseReadingAudioStatus, xycVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{PauseReadingAudioResponse.$childSerializers[0].getValue()};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
