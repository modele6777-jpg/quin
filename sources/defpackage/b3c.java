package defpackage;

import ai.askquin.datastore.reviewreward.ReviewRewardStore;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b3c implements w56 {
    public static final b3c a;
    private static final nyc descriptor;

    static {
        b3c b3cVar = new b3c();
        a = b3cVar;
        gia giaVar = new gia("ai.askquin.datastore.reviewreward.ReviewRewardStore", b3cVar, 1);
        giaVar.k("accountStates", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        ReviewRewardStore reviewRewardStore = (ReviewRewardStore) obj;
        reviewRewardStore.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ReviewRewardStore.write$Self$Quin_core_datastore_release(reviewRewardStore, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = ReviewRewardStore.$childSerializers;
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        Map map = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else {
                if (iJ != 0) {
                    s8f.f(iJ);
                    return null;
                }
                map = (Map) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), map);
                i = 1;
            }
        }
        zf2VarC.b(nycVar);
        return new ReviewRewardStore(i, map, xycVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{ReviewRewardStore.$childSerializers[0].getValue()};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
