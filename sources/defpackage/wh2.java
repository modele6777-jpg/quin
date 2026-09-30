package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wh2 {
    public static final HashMap d = new HashMap();
    public static final mc0 e = new mc0(1);
    public final Executor a;
    public final mi2 b;
    public gfh c = null;

    public wh2(Executor executor, mi2 mi2Var) {
        this.a = executor;
        this.b = mi2Var;
    }

    public static Object a(Task task) throws ExecutionException, TimeoutException {
        vd9 vd9Var = new vd9(11);
        Executor executor = e;
        task.e(executor, vd9Var);
        task.d(executor, vd9Var);
        task.a(executor, vd9Var);
        if (!((CountDownLatch) vd9Var.b).await(5L, TimeUnit.SECONDS)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.m()) {
            return task.i();
        }
        throw new ExecutionException(task.h());
    }

    public final synchronized Task b() {
        try {
            gfh gfhVar = this.c;
            if (gfhVar == null || (gfhVar.l() && !this.c.m())) {
                this.c = Tasks.b(this.a, new uh2(0, this.b));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    public final yh2 c() {
        synchronized (this) {
            try {
                gfh gfhVar = this.c;
                if (gfhVar != null && gfhVar.m()) {
                    return (yh2) this.c.i();
                }
                try {
                    return (yh2) a(b());
                } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e2);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
