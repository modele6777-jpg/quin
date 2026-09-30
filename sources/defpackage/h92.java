package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h92 extends gbe implements l26 {
    final /* synthetic */ wj5[] $flows;
    final /* synthetic */ int $i;
    final /* synthetic */ AtomicInteger $nonClosed;
    final /* synthetic */ yv1 $resultChannel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h92(wj5[] wj5VarArr, int i, AtomicInteger atomicInteger, yv1 yv1Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$flows = wj5VarArr;
        this.$i = i;
        this.$nonClosed = atomicInteger;
        this.$resultChannel = yv1Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new h92(this.$flows, this.$i, this.$nonClosed, this.$resultChannel, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                wj5[] wj5VarArr = this.$flows;
                int i2 = this.$i;
                wj5 wj5Var = wj5VarArr[i2];
                g92 g92Var = new g92(this.$resultChannel, i2);
                this.label = 1;
                Object objB = wj5Var.b(g92Var, this);
                bw2 bw2Var = bw2.a;
                if (objB == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            if (this.$nonClosed.decrementAndGet() == 0) {
                this.$resultChannel.c(null);
            }
            return wef.a;
        } catch (Throwable th) {
            if (this.$nonClosed.decrementAndGet() == 0) {
                this.$resultChannel.c(null);
            }
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((h92) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
