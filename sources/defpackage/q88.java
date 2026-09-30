package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q88 extends gbe implements l26 {
    final /* synthetic */ l26 $block;
    final /* synthetic */ la1 $completer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q88(l26 l26Var, la1 la1Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$block = l26Var;
        this.$completer = la1Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        q88 q88Var = new q88(this.$block, this.$completer, xn2Var);
        q88Var.L$0 = obj;
        return q88Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                aw2 aw2Var = (aw2) this.L$0;
                l26 l26Var = this.$block;
                this.label = 1;
                obj = l26Var.z(aw2Var, this);
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
            this.$completer.b(obj);
        } catch (CancellationException unused) {
            this.$completer.c();
        } catch (Throwable th) {
            this.$completer.d(th);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((q88) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
