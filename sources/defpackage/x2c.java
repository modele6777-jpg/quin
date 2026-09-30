package defpackage;

import ai.askquin.model.reviewreward.ReviewRewardState;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x2c implements w56 {
    public static final x2c a;
    private static final nyc descriptor;

    static {
        x2c x2cVar = new x2c();
        a = x2cVar;
        gia giaVar = new gia("ai.askquin.model.reviewreward.ReviewRewardState", x2cVar, 8);
        giaVar.k("promptImpressionCount", true);
        giaVar.k("lastDismissedAt", true);
        giaVar.k("ratingRequested", true);
        giaVar.k("storeLaunchPrepared", true);
        giaVar.k("storeReturnPending", true);
        giaVar.k("snackbarExposureId", true);
        giaVar.k("snackbarExposureAtEpochMillis", true);
        giaVar.k("snackbarExposureAttemptCount", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        ReviewRewardState reviewRewardState = (ReviewRewardState) obj;
        reviewRewardState.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ReviewRewardState.write$Self$Quin_core_model(reviewRewardState, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        Object obj = null;
        boolean z = true;
        int i = 0;
        int iT = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int iT2 = 0;
        w57 w57Var = null;
        String str = null;
        Long l = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    iT = zf2VarC.t(nycVar, 0);
                    i |= 1;
                    break;
                case 1:
                    w57Var = (w57) zf2VarC.y(nycVar, 1, d67.a, w57Var);
                    i |= 2;
                    break;
                case 2:
                    z2 = zf2VarC.z(nycVar, 2);
                    i |= 4;
                    break;
                case 3:
                    z3 = zf2VarC.z(nycVar, 3);
                    i |= 8;
                    break;
                case 4:
                    z4 = zf2VarC.z(nycVar, 4);
                    i |= 16;
                    break;
                case 5:
                    str = (String) zf2VarC.y(nycVar, 5, p4e.a, str);
                    i |= 32;
                    break;
                case 6:
                    l = (Long) zf2VarC.y(nycVar, 6, eg8.a, l);
                    i |= 64;
                    break;
                case 7:
                    iT2 = zf2VarC.t(nycVar, 7);
                    i |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    continue;
                default:
                    s8f.f(iJ);
                    return obj;
            }
            obj = null;
        }
        zf2VarC.b(nycVar);
        return new ReviewRewardState(i, iT, w57Var, z2, z3, z4, str, l, iT2, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        xn7 xn7VarF = t72.F(d67.a);
        xn7 xn7VarF2 = t72.F(p4e.a);
        xn7 xn7VarF3 = t72.F(eg8.a);
        c77 c77Var = c77.a;
        g11 g11Var = g11.a;
        return new xn7[]{c77Var, xn7VarF, g11Var, g11Var, g11Var, xn7VarF2, xn7VarF3, c77Var};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
