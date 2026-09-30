package defpackage;

import ai.askquin.datastore.model.LocalStorage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yb8 extends gbe implements l26 {
    final /* synthetic */ String $eventId;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb8(String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$eventId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        yb8 yb8Var = new yb8(this.$eventId, xn2Var);
        yb8Var.L$0 = obj;
        return yb8Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        LocalStorage localStorage = (LocalStorage) this.L$0;
        if (this.label == 0) {
            jzb.q(obj);
            return localStorage.addConsumedDailyMonthEventId(this.$eventId);
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((yb8) k((xn2) obj2, (LocalStorage) obj)).r(wef.a);
    }
}
