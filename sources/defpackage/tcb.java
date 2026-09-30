package defpackage;

import ai.askquin.datastore.model.RatingConditionRecord;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tcb implements xj5 {
    public final /* synthetic */ xj5 a;

    public tcb(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        scb scbVar;
        if (xn2Var instanceof scb) {
            scbVar = (scb) xn2Var;
            int i = scbVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                scbVar.label = i - Integer.MIN_VALUE;
            } else {
                scbVar = new scb(this, xn2Var);
            }
        } else {
            scbVar = new scb(this, xn2Var);
        }
        Object obj2 = scbVar.result;
        int i2 = scbVar.label;
        if (i2 == 0) {
            jzb.q(obj2);
            RatingConditionRecord ratingConditionRecord = (RatingConditionRecord) obj;
            icb icbVar = new icb(ratingConditionRecord.getTotalShowRatingCount(), ratingConditionRecord.getAppLaunchCount(), ratingConditionRecord.getDrawCardTimes(), ratingConditionRecord.over8Hours());
            scbVar.L$0 = null;
            scbVar.L$1 = null;
            scbVar.L$2 = null;
            scbVar.L$3 = null;
            scbVar.label = 1;
            Object objA = this.a.a(icbVar, scbVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj2);
        }
        return wef.a;
    }
}
