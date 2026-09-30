package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fah implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public fah(gfh gfhVar, Callable callable) {
        this.a = 2;
        this.b = gfhVar;
        this.c = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                lah lahVar = ((gah) obj).c;
                lahVar.e = null;
                if (((ConnectionResult) obj2).b != 7777) {
                    lahVar.P0();
                } else {
                    ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = lahVar.v;
                    if (scheduledExecutorServiceNewScheduledThreadPool == null) {
                        scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
                        lahVar.v = scheduledExecutorServiceNewScheduledThreadPool;
                    }
                    scheduledExecutorServiceNewScheduledThreadPool.schedule(new jfg(13, this), ((Long) bzg.Z.a(null)).longValue(), TimeUnit.MILLISECONDS);
                }
                break;
            case 1:
                l1h l1hVar = (l1h) obj;
                gfh gfhVar = (gfh) l1hVar.d;
                try {
                    Task taskThen = ((j8e) l1hVar.c).then(((Task) obj2).i());
                    if (taskThen != null) {
                        g94 g94Var = hle.b;
                        taskThen.e(g94Var, l1hVar);
                        taskThen.d(g94Var, l1hVar);
                        taskThen.a(g94Var, l1hVar);
                    } else {
                        gfhVar.r(new NullPointerException("Continuation returned null"));
                    }
                    break;
                } catch (j8c e) {
                    if (e.getCause() instanceof Exception) {
                        l1hVar.r((Exception) e.getCause());
                        return;
                    } else {
                        gfhVar.r(e);
                        return;
                    }
                } catch (CancellationException unused) {
                    l1hVar.c();
                    return;
                } catch (Exception e2) {
                    gfhVar.r(e2);
                    return;
                }
                break;
            default:
                gfh gfhVar2 = (gfh) obj2;
                try {
                    gfhVar2.p(((Callable) obj).call());
                } catch (Exception e3) {
                    gfhVar2.r(e3);
                } catch (Throwable th) {
                    gfhVar2.r(new RuntimeException(th));
                    return;
                }
                break;
        }
    }

    public /* synthetic */ fah(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj2;
        this.c = obj;
    }
}
