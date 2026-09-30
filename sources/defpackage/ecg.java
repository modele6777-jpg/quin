package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ecg extends gbe implements l26 {
    final /* synthetic */ l26 $block;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ gcg this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecg(l26 l26Var, gcg gcgVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$block = l26Var;
        this.this$0 = gcgVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ecg ecgVar = new ecg(this.$block, this.this$0, xn2Var);
        ecgVar.L$0 = obj;
        return ecgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        aw2 aw2Var = (aw2) this.L$0;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                l26 l26Var = this.$block;
                this.L$0 = null;
                this.label = 1;
                Object objZ = l26Var.z(aw2Var, this);
                bw2 bw2Var = bw2.a;
                this = objZ;
                if (objZ == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
                this = this;
            }
        } catch (CancellationException unused) {
        } catch (Exception e) {
            this.this$0.d().c("launchCoreJob", e);
            td5 td5Var = td5.a;
            td5.b(e);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ecg) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
