package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import io.sentry.android.core.b1;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uif extends gbe implements l26 {
    int label;
    final /* synthetic */ xif this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uif(xn2 xn2Var, xif xifVar) {
        super(2, xn2Var);
        this.this$0 = xifVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new uif(xn2Var, this.this$0);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws IOException {
        za2 za2Var;
        boolean zIsTerminated;
        bw2 bw2Var = bw2.a;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "Closing " + this.this$0);
            }
            this.this$0.getClass();
            ckf ckfVar = this.this$0.a;
            if (ckfVar.e.b()) {
                Object objA = ckfVar.a();
                if (objA instanceof AutoCloseable) {
                    ((dg1) objA).close();
                } else if (objA instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) objA;
                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z = false;
                        while (!zIsTerminated) {
                            try {
                                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z) {
                                    executorService.shutdownNow();
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } else if (objA instanceof TypedArray) {
                    ((TypedArray) objA).recycle();
                } else if (objA instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) objA).release();
                } else {
                    if (!(objA instanceof MediaDrm)) {
                        cva.s();
                        return null;
                    }
                    ((MediaDrm) objA).release();
                }
            }
            kkf kkfVar = (kkf) this.this$0.i.getValue();
            synchronized (kkfVar.e) {
                try {
                    za2Var = kkfVar.i;
                    if (za2Var == null) {
                        pu3 pu3Var = kkfVar.f;
                        if (pu3Var != null) {
                            pu3Var.h(null);
                        }
                        kkfVar.c.a();
                        kkfVar.h = null;
                        za2Var = new za2();
                        kkfVar.i = za2Var;
                        kkfVar.e();
                    } else if (b21.F(5, "CXCP")) {
                        b1.l("CXCP", "UseCaseSurfaceManager is already stopping!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.label = 1;
            if (za2Var.s(this) == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((uif) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
