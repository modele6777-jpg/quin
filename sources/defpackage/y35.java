package defpackage;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y35 extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ e89 $isLoading$delegate;
    final /* synthetic */ e89 $testResult$delegate;
    final /* synthetic */ Uri $uri;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y35(Context context, Uri uri, e89 e89Var, e89 e89Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$context = context;
        this.$uri = uri;
        this.$testResult$delegate = e89Var;
        this.$isLoading$delegate = e89Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new y35(this.$context, this.$uri, this.$testResult$delegate, this.$isLoading$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                Context context = this.$context;
                Uri uri = this.$uri;
                this.label = 1;
                obj = qk2.Q(context, uri, this);
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
            e89 e89Var = this.$testResult$delegate;
            e89Var.setValue(((String) e89Var.getValue()) + "\n\n" + ((String) obj));
        } catch (Exception e) {
            e89 e89Var2 = this.$testResult$delegate;
            e89Var2.setValue(((String) e89Var2.getValue()) + "\n\n❌ Verification failed:\n" + e.getMessage());
        } finally {
            qk2.l(this.$isLoading$delegate, false);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((y35) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
