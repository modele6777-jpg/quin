package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.widget.Toast;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sr2 extends gbe implements l26 {
    final /* synthetic */ xo5 $childOpenFailure;
    final /* synthetic */ x16 $closeConversation;
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr2(xo5 xo5Var, Context context, x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$childOpenFailure = xo5Var;
        this.$context = context;
        this.$closeConversation = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new sr2(this.$childOpenFailure, this.$context, this.$closeConversation, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        xo5 xo5Var = this.$childOpenFailure;
        int i2 = xo5Var == null ? -1 : rr2.a[xo5Var.ordinal()];
        wef wefVar = wef.a;
        if (i2 != -1) {
            if (i2 == 1) {
                i = R.string.follow_up_reading_deleted;
            } else {
                if (i2 != 2) {
                    ap.c();
                    return null;
                }
                i = R.string.network_common_error;
            }
            Toast.makeText(this.$context, i, 0).show();
            this.$closeConversation.invoke();
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((sr2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
