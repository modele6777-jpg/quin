package defpackage;

import ai.askquin.datastore.reviewreward.ReviewRewardStore;
import ai.askquin.model.reviewreward.ReviewRewardState;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b1c implements xj5 {
    public final /* synthetic */ xj5 a;
    public final /* synthetic */ String b;

    public b1c(xj5 xj5Var, String str) {
        this.a = xj5Var;
        this.b = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        a1c a1cVar;
        if (xn2Var instanceof a1c) {
            a1cVar = (a1c) xn2Var;
            int i = a1cVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                a1cVar.label = i - Integer.MIN_VALUE;
            } else {
                a1cVar = new a1c(this, xn2Var);
            }
        } else {
            a1cVar = new a1c(this, xn2Var);
        }
        Object obj2 = a1cVar.result;
        int i2 = a1cVar.label;
        if (i2 == 0) {
            jzb.q(obj2);
            ReviewRewardState reviewRewardState = ((ReviewRewardStore) obj).getAccountStates().get(this.b);
            if (reviewRewardState == null) {
                reviewRewardState = new ReviewRewardState(0, (w57) null, false, false, false, (String) null, (Long) null, 0, 255, (rp3) null);
            }
            a1cVar.L$0 = null;
            a1cVar.L$1 = null;
            a1cVar.L$2 = null;
            a1cVar.L$3 = null;
            a1cVar.label = 1;
            Object objA = this.a.a(reviewRewardState, a1cVar);
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
