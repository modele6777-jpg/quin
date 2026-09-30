package ai.askquin.ui.persistence.serialization;

import defpackage.ag2;
import defpackage.ev4;
import defpackage.gia;
import defpackage.nyc;
import defpackage.om3;
import defpackage.p4e;
import defpackage.s8f;
import defpackage.t72;
import defpackage.w56;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.zf2;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements w56 {
    public static final r a;
    private static final nyc descriptor;

    static {
        r rVar = new r();
        a = rVar;
        gia giaVar = new gia("ai.askquin.ui.persistence.serialization.SerializableDivinationState.WaitQuickDrawSpread", rVar, 1);
        giaVar.k("selectedSpreadId", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SerializableDivinationState.WaitQuickDrawSpread waitQuickDrawSpread = (SerializableDivinationState.WaitQuickDrawSpread) obj;
        waitQuickDrawSpread.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SerializableDivinationState.WaitQuickDrawSpread.write$Self$Quin_conversation_gpRelease(waitQuickDrawSpread, ag2VarC, nycVar);
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
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else {
                if (iJ != 0) {
                    s8f.f(iJ);
                    return null;
                }
                str = (String) zf2VarC.y(nycVar, 0, p4e.a, str);
                i = 1;
            }
        }
        zf2VarC.b(nycVar);
        return new SerializableDivinationState.WaitQuickDrawSpread(i, str, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{t72.F(p4e.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
