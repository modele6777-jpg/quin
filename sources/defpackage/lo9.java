package defpackage;

import ai.askquin.ui.onboard.OnboardNotificationRoute;
import ai.askquin.ui.onboard.OnboardWantKnowRoute;
import ai.askquin.ui.onboard.model.UserIntentionType;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lo9 extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ cb9 $innerNavController;
    final /* synthetic */ rn9 $viewModel;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo9(rn9 rn9Var, Context context, cb9 cb9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$viewModel = rn9Var;
        this.$context = context;
        this.$innerNavController = cb9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        lo9 lo9Var = new lo9(this.$viewModel, this.$context, this.$innerNavController, xn2Var);
        lo9Var.L$0 = obj;
        return lo9Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        aw2 aw2Var = (aw2) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            rn9 rn9Var = this.$viewModel;
            this.L$0 = aw2Var;
            this.label = 1;
            rn9Var.getClass();
            js3 js3Var = ga4.a;
            obj = ynb.p0(hr3.c, new pn9(rn9Var, null), this);
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
        if (((UserIntentionType) obj) != null) {
            Context context = this.$context;
            cb9 cb9Var = this.$innerNavController;
            hs3 hs3Var = xqa.a;
            boolean zBooleanValue = ((Boolean) z5c.I(nu4.a, new ko9(hs3Var.a, hs3Var.b, null))).booleanValue();
            boolean zK = uyb.k(context);
            y93 y93Var = y93.a;
            boolean z = y93.e() != null;
            boolean z2 = y93.h() != null;
            ca2.a.getClass();
            if (ap9.d(zK, z, z2, zBooleanValue, ca2.c)) {
                ap9.b(context, (3 & 1) == 0, true);
            } else {
                ka9.e(cb9Var, new OnboardNotificationRoute(false), null, 6);
            }
        } else {
            ka9.e(this.$innerNavController, new OnboardWantKnowRoute(false), null, 6);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((lo9) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
