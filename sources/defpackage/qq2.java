package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qq2 extends gbe implements l26 {
    final /* synthetic */ s7 $accountIdProvider;
    final /* synthetic */ o9 $accountProfileRepository;
    final /* synthetic */ Context $context;
    final /* synthetic */ gpf $userRequester;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq2(s7 s7Var, Context context, gpf gpfVar, o9 o9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$accountIdProvider = s7Var;
        this.$context = context;
        this.$userRequester = gpfVar;
        this.$accountProfileRepository = o9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new qq2(this.$accountIdProvider, this.$context, this.$userRequester, this.$accountProfileRepository, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            this.$accountIdProvider.getClass();
            pq2 pq2Var = new pq2(s7.b());
            lq2 lq2Var = new lq2(this.$context, this.$userRequester, this.$accountProfileRepository, null);
            this.label = 1;
            Object objP = ok8.p(pq2Var, lq2Var, this);
            bw2 bw2Var = bw2.a;
            if (objP == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((qq2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
