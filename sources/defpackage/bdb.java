package defpackage;

import tech.chatmind.api.personality.model.RatingRequestBody;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bdb implements w56 {
    public static final bdb a;
    private static final nyc descriptor;

    static {
        bdb bdbVar = new bdb();
        a = bdbVar;
        gia giaVar = new gia("tech.chatmind.api.personality.model.RatingRequestBody", bdbVar, 3);
        giaVar.k("testId", false);
        giaVar.k("questionIndex", false);
        giaVar.k("rate", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        RatingRequestBody ratingRequestBody = (RatingRequestBody) obj;
        ratingRequestBody.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        RatingRequestBody.write$Self$Quin_core_base_api_release(ratingRequestBody, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        int iT = 0;
        int iT2 = 0;
        String strO = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strO = zf2VarC.o(nycVar, 0);
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
        return new RatingRequestBody(i, strO, iT, iT2, null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        c77 c77Var = c77.a;
        return new xn7[]{p4e.a, c77Var, c77Var};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
