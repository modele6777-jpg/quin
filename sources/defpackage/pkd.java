package defpackage;

import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pkd implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public pkd(b9h b9hVar, t8h t8hVar, long j) {
        this.c = t8hVar;
        this.b = j;
        Objects.requireNonNull(b9hVar);
        this.d = b9hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.d;
        long j = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                try {
                    Thread.sleep(j);
                } catch (InterruptedException e) {
                    AdjustFactory.getLogger().warn("Sleep delay exception: %s", e.getMessage());
                }
                ((SingleThreadCachedScheduler) obj).submit((Runnable) obj2);
                break;
            case 1:
                b9h b9hVar = (b9h) obj;
                b9hVar.J0((t8h) obj2, false, j);
                b9hVar.f = null;
                lah lahVarJ = ((w3h) b9hVar.b).j();
                lahVarJ.A0();
                lahVarJ.B0();
                lahVarJ.O0(new n6h(lahVarJ, null));
                break;
            default:
                ((mt4) obj2).run();
                i39 i39Var = (i39) obj;
                i39Var.getClass();
                s5f s5fVar = new s5f(Executors.callable(this, null));
                g39 g39Var = new g39(s5fVar, i39Var.b.schedule(s5fVar, j, TimeUnit.MINUTES));
                g39Var.b(new u36(g39Var, 1), f94.a);
                break;
        }
    }

    public pkd(SingleThreadCachedScheduler singleThreadCachedScheduler, long j, Runnable runnable) {
        this.d = singleThreadCachedScheduler;
        this.b = j;
        this.c = runnable;
    }

    public pkd(cdh cdhVar, mt4 mt4Var, i39 i39Var, long j) {
        this.c = mt4Var;
        this.d = i39Var;
        this.b = j;
    }
}
