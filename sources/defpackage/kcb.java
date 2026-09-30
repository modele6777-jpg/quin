package defpackage;

import ai.askquin.datastore.model.RatingConditionRecord;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kcb extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        kcb kcbVar = new kcb(2, xn2Var);
        kcbVar.L$0 = obj;
        return kcbVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        RatingConditionRecord ratingConditionRecord = (RatingConditionRecord) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        int appLaunchCount = ratingConditionRecord.getAppLaunchCount() + 1;
        return RatingConditionRecord.copy$default(ratingConditionRecord, 0L, 0, appLaunchCount > 1073741823 ? 1073741823 : appLaunchCount, 0, null, 27, null);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((kcb) k((xn2) obj2, (RatingConditionRecord) obj)).r(wef.a);
    }
}
