package defpackage;

import tech.chatmind.api.CloudMixedDeckSnapshot;
import tech.chatmind.api.SubmitSpreadRequest;
import tech.chatmind.api.UserSelectedSpread;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u6e implements w56 {
    public static final u6e a;
    private static final nyc descriptor;

    static {
        u6e u6eVar = new u6e();
        a = u6eVar;
        gia giaVar = new gia("tech.chatmind.api.SubmitSpreadRequest", u6eVar, 2);
        giaVar.k("userSelectedSpread", false);
        giaVar.k("mixedDeckSnapshot", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SubmitSpreadRequest submitSpreadRequest = (SubmitSpreadRequest) obj;
        submitSpreadRequest.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SubmitSpreadRequest.write$Self$Quin_core_base_api_release(submitSpreadRequest, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        UserSelectedSpread userSelectedSpread = null;
        CloudMixedDeckSnapshot cloudMixedDeckSnapshot = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                userSelectedSpread = (UserSelectedSpread) zf2VarC.s(nycVar, 0, qpf.a, userSelectedSpread);
                i |= 1;
            } else {
                if (iJ != 1) {
                    s8f.f(iJ);
                    return null;
                }
                cloudMixedDeckSnapshot = (CloudMixedDeckSnapshot) zf2VarC.y(nycVar, 1, k62.a, cloudMixedDeckSnapshot);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new SubmitSpreadRequest(i, userSelectedSpread, cloudMixedDeckSnapshot, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{qpf.a, t72.F(k62.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
