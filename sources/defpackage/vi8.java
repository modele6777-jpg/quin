package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vi8 {
    public static final Executor e;
    public final LinkedHashSet a = new LinkedHashSet(1);
    public final LinkedHashSet b = new LinkedHashSet(1);
    public final Handler c = new Handler(Looper.getMainLooper());
    public volatile ti8 d = null;

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            e = new mc0(1);
        } else {
            e = Executors.newCachedThreadPool(new wi8());
        }
    }

    public vi8(Callable callable) {
        Executor executor = e;
        ui8 ui8Var = new ui8(callable);
        ui8Var.b = this;
        executor.execute(ui8Var);
    }

    public final synchronized void a(si8 si8Var) {
        Throwable th;
        try {
            ti8 ti8Var = this.d;
            if (ti8Var != null && (th = ti8Var.b) != null) {
                si8Var.onResult(th);
            }
            this.b.add(si8Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(si8 si8Var) {
        uh8 uh8Var;
        try {
            ti8 ti8Var = this.d;
            if (ti8Var != null && (uh8Var = ti8Var.a) != null) {
                si8Var.onResult(uh8Var);
            }
            this.a.add(si8Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() {
        ti8 ti8Var = this.d;
        if (ti8Var == null) {
            return;
        }
        uh8 uh8Var = ti8Var.a;
        if (uh8Var != null) {
            synchronized (this) {
                Iterator it = new ArrayList(this.a).iterator();
                while (it.hasNext()) {
                    ((si8) it.next()).onResult(uh8Var);
                }
            }
            return;
        }
        Throwable th = ti8Var.b;
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.b);
            if (arrayList.isEmpty()) {
                gf8.c("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((si8) it2.next()).onResult(th);
            }
        }
    }

    public final void d(ti8 ti8Var) {
        if (this.d != null) {
            qc0.p("A task may only be set once.");
            return;
        }
        this.d = ti8Var;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            c();
        } else {
            this.c.post(new m45(9, this));
        }
    }

    public vi8(uh8 uh8Var) {
        d(new ti8(uh8Var));
    }
}
