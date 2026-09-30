package defpackage;

import tech.chatmind.api.credits.TokenUsage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bze implements w56 {
    public static final bze a;
    private static final nyc descriptor;

    static {
        bze bzeVar = new bze();
        a = bzeVar;
        gia giaVar = new gia("tech.chatmind.api.credits.TokenUsage", bzeVar, 3);
        giaVar.k("hasToken", false);
        giaVar.k("outputUsedTokens", false);
        giaVar.k("remainingTokens", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        TokenUsage tokenUsage = (TokenUsage) obj;
        tokenUsage.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        TokenUsage.write$Self$Quin_core_base_api_release(tokenUsage, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        int iT = 0;
        int iT2 = 0;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                z2 = zf2VarC.z(nycVar, 0);
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
        return new TokenUsage(i, z2, iT, iT2, null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        c77 c77Var = c77.a;
        return new xn7[]{g11.a, c77Var, c77Var};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
