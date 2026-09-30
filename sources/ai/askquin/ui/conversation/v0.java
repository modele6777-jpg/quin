package ai.askquin.ui.conversation;

import ai.askquin.data.QuotaBlockReason;
import defpackage.ag2;
import defpackage.ev4;
import defpackage.gia;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.om3;
import defpackage.s8f;
import defpackage.w56;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.zf2;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v0 implements w56 {
    public static final v0 a;
    private static final nyc descriptor;

    static {
        v0 v0Var = new v0();
        a = v0Var;
        gia giaVar = new gia("ai.askquin.ui.conversation.FailReason.UsageBlocked", v0Var, 1);
        giaVar.k("reason", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        FailReason.UsageBlocked usageBlocked = (FailReason.UsageBlocked) obj;
        usageBlocked.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ag2VarC.p(nycVar, 0, (xn7) FailReason.UsageBlocked.$childSerializers[0].getValue(), usageBlocked.reason);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = FailReason.UsageBlocked.$childSerializers;
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        QuotaBlockReason quotaBlockReason = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else {
                if (iJ != 0) {
                    s8f.f(iJ);
                    return null;
                }
                quotaBlockReason = (QuotaBlockReason) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), quotaBlockReason);
                i = 1;
            }
        }
        zf2VarC.b(nycVar);
        return new FailReason.UsageBlocked(i, quotaBlockReason, xycVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{FailReason.UsageBlocked.$childSerializers[0].getValue()};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
