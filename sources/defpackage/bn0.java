package defpackage;

import ai.askquin.R;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bn0 extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ e89 $showCancelDialog$delegate;
    final /* synthetic */ sn0 $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn0(sn0 sn0Var, Context context, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$viewModel = sn0Var;
        this.$context = context;
        this.$showCancelDialog$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new bn0(this.$viewModel, this.$context, this.$showCancelDialog$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            sn0 sn0Var = this.$viewModel;
            this.label = 1;
            obj = sn0Var.Q(this);
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
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Context context = this.$context;
        if (zBooleanValue) {
            hkg.N0(context, R.string.auto_renew_status_off);
        } else {
            hkg.N0(context, R.string.unknown_error);
        }
        this.$showCancelDialog$delegate.setValue(Boolean.FALSE);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((bn0) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
