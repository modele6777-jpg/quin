package defpackage;

import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class z97 extends gbe implements l26 {
    final /* synthetic */ x16 $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z97(x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$block = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        z97 z97Var = new z97(this.$block, xn2Var);
        z97Var.L$0 = obj;
        return z97Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Unsafe unsafe;
        long j;
        int intVolatile;
        aw2 aw2Var = (aw2) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        pv2 coroutineContext = aw2Var.getCoroutineContext();
        x16 x16Var = this.$block;
        try {
            lwe lweVar = new lwe();
            lweVar.f = tq.E(tq.z(coroutineContext), true, lweVar);
            do {
                unsafe = ud0.a;
                j = lwe.g;
                intVolatile = unsafe.getIntVolatile(lweVar, j);
                if (intVolatile != 0) {
                    if (intVolatile == 2 || intVolatile == 3) {
                        break;
                        break;
                    }
                    lwe.p(intVolatile);
                    throw null;
                }
            } while (!unsafe.compareAndSwapInt(lweVar, j, intVolatile, 0));
            try {
                return x16Var.invoke();
            } finally {
                lweVar.o();
            }
        } catch (InterruptedException e) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((z97) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
