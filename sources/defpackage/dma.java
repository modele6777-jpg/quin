package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dma extends gbe implements l26 {
    final /* synthetic */ long $reservation;
    int label;
    final /* synthetic */ mma this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dma(mma mmaVar, long j, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = mmaVar;
        this.$reservation = j;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new dma(this.this$0, this.$reservation, xn2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                k86 k86Var = this.this$0.g;
                long j = this.$reservation;
                this.label = 1;
                Object objB = ((pqa) k86Var).b(j, this);
                bw2 bw2Var = bw2.a;
                this = objB;
                if (objB == bw2Var) {
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
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            this.this$0.d().c("Failed to persist gift-card guide exposure", e2);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((dma) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
