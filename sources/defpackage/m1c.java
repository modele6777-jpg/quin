package defpackage;

import ai.askquin.datastore.reviewreward.ReviewRewardStore;
import ai.askquin.model.reviewreward.ReviewRewardState;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m1c extends gbe implements l26 {
    final /* synthetic */ String $accountId;
    final /* synthetic */ mmb $previous;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1c(mmb mmbVar, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$previous = mmbVar;
        this.$accountId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        m1c m1cVar = new m1c(this.$previous, this.$accountId, xn2Var);
        m1cVar.L$0 = obj;
        return m1cVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        ReviewRewardStore reviewRewardStore = (ReviewRewardStore) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.$previous.element = reviewRewardStore.getAccountStates().get(this.$accountId);
        if (this.$previous.element == null) {
            return reviewRewardStore;
        }
        Map<String, ReviewRewardState> accountStates = reviewRewardStore.getAccountStates();
        String str = this.$accountId;
        accountStates.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(accountStates);
        linkedHashMap.remove(str);
        return reviewRewardStore.copy(bm8.K(linkedHashMap));
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((m1c) k((xn2) obj2, (ReviewRewardStore) obj)).r(wef.a);
    }
}
