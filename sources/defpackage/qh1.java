package defpackage;

import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qh1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uh1 b;

    public /* synthetic */ qh1(uh1 uh1Var, di2 di2Var) {
        this.a = 1;
        this.b = uh1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        uh1 uh1Var = this.b;
        switch (i) {
            case 0:
                Iterator it = uh1Var.k.iterator();
                while (it.hasNext()) {
                    uh1Var.a(((jg1) it.next()).a());
                }
                return;
            case 1:
                s72.o1(uh1Var.k).isEmpty();
                return;
            default:
                synchronized (uh1Var.d) {
                    try {
                        ScheduledFuture scheduledFuture = uh1Var.e;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        b21.q("CameraPresencePrvdr", "Starting new refresh-with-retries sequence.");
                        uh1Var.d(3, uh1Var.k);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public /* synthetic */ qh1(uh1 uh1Var, int i) {
        this.a = i;
        this.b = uh1Var;
    }
}
