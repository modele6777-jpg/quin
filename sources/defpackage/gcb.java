package defpackage;

import ai.askquin.datastore.model.RatingConditionRecord;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gcb implements w56 {
    public static final gcb a;
    private static final nyc descriptor;

    static {
        gcb gcbVar = new gcb();
        a = gcbVar;
        gia giaVar = new gia("ai.askquin.datastore.model.RatingConditionRecord", gcbVar, 5);
        giaVar.k("lastRatingTime", true);
        giaVar.k("totalShowRatingCount", true);
        giaVar.k("appLaunchCount", true);
        giaVar.k("drawCardTimes", true);
        giaVar.k("questionRecords", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        RatingConditionRecord ratingConditionRecord = (RatingConditionRecord) obj;
        ratingConditionRecord.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        RatingConditionRecord.write$Self$Quin_core_datastore_release(ratingConditionRecord, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = RatingConditionRecord.$childSerializers;
        int i = 0;
        int iT = 0;
        int iT2 = 0;
        int iT3 = 0;
        long jD = 0;
        Map map = null;
        boolean z = true;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                jD = zf2VarC.D(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                iT = zf2VarC.t(nycVar, 1);
                i |= 2;
            } else if (iJ == 2) {
                iT2 = zf2VarC.t(nycVar, 2);
                i |= 4;
            } else if (iJ == 3) {
                iT3 = zf2VarC.t(nycVar, 3);
                i |= 8;
            } else {
                if (iJ != 4) {
                    s8f.f(iJ);
                    return null;
                }
                map = (Map) zf2VarC.s(nycVar, 4, (xn7) lw7VarArr[4].getValue(), map);
                i |= 16;
            }
        }
        zf2VarC.b(nycVar);
        return new RatingConditionRecord(i, jD, iT, iT2, iT3, map, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = RatingConditionRecord.$childSerializers;
        c77 c77Var = c77.a;
        return new xn7[]{eg8.a, c77Var, c77Var, c77Var, lw7VarArr[4].getValue()};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
