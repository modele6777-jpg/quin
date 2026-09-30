package defpackage;

import ai.askquin.datastore.model.RatingConditionRecord;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mcb extends gbe implements l26 {
    final /* synthetic */ String $chatId;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcb(String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$chatId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        mcb mcbVar = new mcb(this.$chatId, xn2Var);
        mcbVar.L$0 = obj;
        return mcbVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        RatingConditionRecord ratingConditionRecord = (RatingConditionRecord) this.L$0;
        if (this.label == 0) {
            jzb.q(obj);
            return ratingConditionRecord.askQuestion(this.$chatId);
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((mcb) k((xn2) obj2, (RatingConditionRecord) obj)).r(wef.a);
    }
}
