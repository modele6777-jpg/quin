package defpackage;

import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class djg {
    public z98 a;
    public boolean b = false;
    public boolean c = false;
    public boolean d = true;
    public boolean e = false;
    public Executor f;
    public volatile eh0 g;
    public volatile eh0 h;
    public final Semaphore i;
    public final Set j;

    public djg(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.i = new Semaphore(0);
        this.j = set;
    }

    public final void a() {
        if (this.h != null || this.g == null) {
            return;
        }
        this.g.getClass();
        if (this.f == null) {
            this.f = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        eh0 eh0Var = this.g;
        Executor executor = this.f;
        if (eh0Var.b == 1) {
            eh0Var.b = 2;
            executor.execute(eh0Var.a);
            return;
        }
        int iB = kv2.B(eh0Var.b);
        if (iB == 1) {
            qc0.p("Cannot execute task: the task is already running.");
        } else if (iB != 2) {
            qc0.p("We should never reach this state");
        } else {
            qc0.p("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
    }

    public final void b() {
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            ((thg) it.next()).getClass();
            cva.f();
            return;
        }
        try {
            this.i.tryAcquire(0, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
    }

    public final boolean c() {
        if (this.g == null) {
            return false;
        }
        boolean z = this.b;
        if (!z) {
            if (z) {
                d();
            } else {
                this.e = true;
            }
        }
        eh0 eh0Var = this.h;
        eh0 eh0Var2 = this.g;
        if (eh0Var != null) {
            eh0Var2.getClass();
            this.g = null;
            return false;
        }
        eh0Var2.getClass();
        eh0 eh0Var3 = this.g;
        eh0Var3.c.set(true);
        boolean zCancel = eh0Var3.a.cancel(false);
        if (zCancel) {
            this.h = this.g;
        }
        this.g = null;
        return zCancel;
    }

    public final void d() {
        c();
        this.g = new eh0(this);
        a();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=0}");
        return sb.toString();
    }
}
