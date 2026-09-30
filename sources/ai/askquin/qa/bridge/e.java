package ai.askquin.qa.bridge;

import defpackage.ag2;
import defpackage.ev4;
import defpackage.gia;
import defpackage.nyc;
import defpackage.om3;
import defpackage.s8f;
import defpackage.ti7;
import defpackage.w56;
import defpackage.wi7;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.zf2;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements w56 {
    public static final e a;
    private static final nyc descriptor;

    static {
        e eVar = new e();
        a = eVar;
        gia giaVar = new gia("ok", eVar, 1);
        giaVar.k("data", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        QaResult.Ok ok = (QaResult.Ok) obj;
        ok.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        QaResult.Ok.write$Self$Quin_qa_bridge(ok, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        ti7 ti7Var = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else {
                if (iJ != 0) {
                    s8f.f(iJ);
                    return null;
                }
                ti7Var = (ti7) zf2VarC.s(nycVar, 0, wi7.a, ti7Var);
                i = 1;
            }
        }
        zf2VarC.b(nycVar);
        return new QaResult.Ok(i, ti7Var, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{wi7.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
