package defpackage;

import tech.chatmind.api.payment.PaywallSkus;
import tech.chatmind.api.payment.PaywallSkusEnvelope;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n5a implements w56 {
    public static final n5a a;
    private static final nyc descriptor;

    static {
        n5a n5aVar = new n5a();
        a = n5aVar;
        gia giaVar = new gia("tech.chatmind.api.payment.PaywallSkusEnvelope", n5aVar, 1);
        giaVar.k("paywallSkus", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        PaywallSkusEnvelope paywallSkusEnvelope = (PaywallSkusEnvelope) obj;
        paywallSkusEnvelope.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        PaywallSkusEnvelope.write$Self$Quin_core_base_api_release(paywallSkusEnvelope, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        PaywallSkus paywallSkus = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else {
                if (iJ != 0) {
                    s8f.f(iJ);
                    return null;
                }
                paywallSkus = (PaywallSkus) zf2VarC.y(nycVar, 0, v5a.a, paywallSkus);
                i = 1;
            }
        }
        zf2VarC.b(nycVar);
        return new PaywallSkusEnvelope(i, paywallSkus, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{t72.F(v5a.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
