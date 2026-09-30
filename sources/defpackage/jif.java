package defpackage;

import ai.askquin.ui.settings.model.UsageCount;
import ai.askquin.ui.settings.model.UsageType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jif implements w56 {
    public static final jif a;
    private static final nyc descriptor;

    static {
        jif jifVar = new jif();
        a = jifVar;
        gia giaVar = new gia("ai.askquin.ui.settings.model.UsageCount", jifVar, 3);
        giaVar.k("type", false);
        giaVar.k("used", false);
        giaVar.k("total", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        UsageCount usageCount = (UsageCount) obj;
        usageCount.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        UsageCount.write$Self$Quin_conversation_gpRelease(usageCount, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = UsageCount.$childSerializers;
        boolean z = true;
        int i = 0;
        int iT = 0;
        int iT2 = 0;
        UsageType usageType = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                usageType = (UsageType) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), usageType);
                i |= 1;
            } else if (iJ == 1) {
                iT = zf2VarC.t(nycVar, 1);
                i |= 2;
            } else {
                if (iJ != 2) {
                    s8f.f(iJ);
                    return null;
                }
                iT2 = zf2VarC.t(nycVar, 2);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new UsageCount(i, usageType, iT, iT2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        c77 c77Var = c77.a;
        return new xn7[]{UsageCount.$childSerializers[0].getValue(), c77Var, c77Var};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
