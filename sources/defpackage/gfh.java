package defpackage;

import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gfh extends Task {
    public final Object a = new Object();
    public final egh b = new egh();
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    @Override // com.google.android.gms.tasks.Task
    public final void a(Executor executor, wm9 wm9Var) {
        this.b.m(new l1h(executor, wm9Var));
        u();
    }

    @Override // com.google.android.gms.tasks.Task
    public final void b(xm9 xm9Var) {
        this.b.m(new l1h(hle.a, xm9Var));
        u();
    }

    @Override // com.google.android.gms.tasks.Task
    public final void c(Executor executor, xm9 xm9Var) {
        this.b.m(new l1h(executor, xm9Var));
        u();
    }

    @Override // com.google.android.gms.tasks.Task
    public final gfh d(Executor executor, an9 an9Var) {
        this.b.m(new l1h(executor, an9Var));
        u();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final gfh e(Executor executor, kn9 kn9Var) {
        this.b.m(new l1h(executor, kn9Var));
        u();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task f(Executor executor, yn2 yn2Var) {
        gfh gfhVar = new gfh();
        this.b.m(new qvg(executor, yn2Var, gfhVar, 0));
        u();
        return gfhVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task g(Executor executor, yn2 yn2Var) {
        gfh gfhVar = new gfh();
        this.b.m(new qvg(executor, yn2Var, gfhVar, 1));
        u();
        return gfhVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception h() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object i() {
        Object obj;
        synchronized (this.a) {
            try {
                oa7.C("Task is not yet complete", this.c);
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new j8c(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object j() {
        Object obj;
        synchronized (this.a) {
            try {
                oa7.C("Task is not yet complete", this.c);
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                boolean zIsInstance = IOException.class.isInstance(this.f);
                Exception exc = this.f;
                if (zIsInstance) {
                    throw ((Throwable) IOException.class.cast(exc));
                }
                if (exc != null) {
                    throw new j8c(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean k() {
        return this.d;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean m() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task n(j8e j8eVar) {
        dd7 dd7Var = hle.a;
        gfh gfhVar = new gfh();
        this.b.m(new l1h(dd7Var, j8eVar, gfhVar));
        u();
        return gfhVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task o(Executor executor, j8e j8eVar) {
        gfh gfhVar = new gfh();
        this.b.m(new l1h(executor, j8eVar, gfhVar));
        u();
        return gfhVar;
    }

    public final void p(Object obj) {
        synchronized (this.a) {
            t();
            this.c = true;
            this.e = obj;
        }
        this.b.n(this);
    }

    public final boolean q(Object obj) {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.e = obj;
                this.b.n(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r(Exception exc) {
        oa7.B(exc, "Exception must not be null");
        synchronized (this.a) {
            t();
            this.c = true;
            this.f = exc;
        }
        this.b.n(this);
    }

    public final void s() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return;
                }
                this.c = true;
                this.d = true;
                this.b.n(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t() {
        String strConcat;
        if (this.c) {
            if (!l()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excH = h();
            if (excH != null) {
                strConcat = "failure";
            } else if (m()) {
                strConcat = "result ".concat(String.valueOf(i()));
            } else {
                strConcat = this.d ? "cancellation" : "unknown issue";
            }
        }
    }

    public final void u() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.n(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
