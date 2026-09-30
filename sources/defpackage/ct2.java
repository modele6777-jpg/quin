package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ct2 extends gbe implements l26 {
    final /* synthetic */ za0 $appReviewLauncher;
    final /* synthetic */ Context $context;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct2(za0 za0Var, Context context, xn2 xn2Var) {
        super(2, xn2Var);
        this.$appReviewLauncher = za0Var;
        this.$context = context;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ct2 ct2Var = new ct2(this.$appReviewLauncher, this.$context, xn2Var);
        ct2Var.L$0 = obj;
        return ct2Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        x16 x16Var = (x16) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            za0 za0Var = this.$appReviewLauncher;
            Context context = this.$context;
            p9 p9Var = new p9(9, x16Var);
            this.L$0 = null;
            this.label = 1;
            obj = ((lc6) za0Var).a(context, p9Var, this);
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return Boolean.valueOf(obj != null);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ct2) k((xn2) obj2, (x16) obj)).r(wef.a);
    }
}
