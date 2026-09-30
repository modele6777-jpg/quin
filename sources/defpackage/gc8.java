package defpackage;

import ai.askquin.datastore.model.LocalStorage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gc8 extends gbe implements l26 {
    final /* synthetic */ String $completionEventDateString;
    final /* synthetic */ String $targetDateString;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc8(String str, String str2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$targetDateString = str;
        this.$completionEventDateString = str2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        gc8 gc8Var = new gc8(this.$targetDateString, this.$completionEventDateString, xn2Var);
        gc8Var.L$0 = obj;
        return gc8Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        LocalStorage localStorage = (LocalStorage) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        LocalStorage localStorageAddDailyFortuneCompletedDate = localStorage.addDailyFortuneCompletedDate(this.$targetDateString);
        return pa7.t(localStorageAddDailyFortuneCompletedDate, localStorage) ? LocalStorage.copy$default(localStorage, null, null, null, null, false, 0, false, null, null, false, null, 0, null, null, null, true, false, null, null, null, null, false, 4161535, null) : LocalStorage.copy$default(localStorageAddDailyFortuneCompletedDate, null, null, null, null, false, 0, false, null, null, false, null, 0, null, null, this.$completionEventDateString, true, false, null, null, null, null, false, 4145151, null);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((gc8) k((xn2) obj2, (LocalStorage) obj)).r(wef.a);
    }
}
