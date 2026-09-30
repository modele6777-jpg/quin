package defpackage;

import ai.askquin.datastore.model.LocalStorage;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wb8 extends gbe implements l26 {
    final /* synthetic */ String $targetDate;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb8(String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$targetDate = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        wb8 wb8Var = new wb8(this.$targetDate, xn2Var);
        wb8Var.L$0 = obj;
        return wb8Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        LocalStorage localStorage = (LocalStorage) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        String lastDailyFortuneCompletedDate = localStorage.getLastDailyFortuneCompletedDate();
        String str = (lastDailyFortuneCompletedDate == null || lastDailyFortuneCompletedDate.equals(this.$targetDate)) ? null : lastDailyFortuneCompletedDate;
        List<String> dailyFortuneCompletedDates = localStorage.getDailyFortuneCompletedDates();
        String str2 = this.$targetDate;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : dailyFortuneCompletedDates) {
            if (!pa7.t((String) obj2, str2)) {
                arrayList.add(obj2);
            }
        }
        String lastDailyFortuneCompletionEventDate = localStorage.getLastDailyFortuneCompletionEventDate();
        return LocalStorage.copy$default(localStorage, null, null, null, null, false, 0, false, null, null, false, null, 0, str, arrayList, (lastDailyFortuneCompletionEventDate == null || lastDailyFortuneCompletionEventDate.equals(this.$targetDate)) ? null : lastDailyFortuneCompletionEventDate, false, false, null, null, null, null, false, 4165631, null);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((wb8) k((xn2) obj2, (LocalStorage) obj)).r(wef.a);
    }
}
