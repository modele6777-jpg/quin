package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e1e implements Runnable {
    public static final Object v = new Object();
    public final Executor a;
    public final uk9 b;
    public final AtomicReference d;
    public final AtomicBoolean c = new AtomicBoolean(true);
    public Object e = v;
    public int f = -1;
    public boolean g = false;

    public e1e(AtomicReference atomicReference, Executor executor, uk9 uk9Var) {
        this.d = atomicReference;
        this.a = executor;
        this.b = uk9Var;
    }

    public final void a(int i) {
        synchronized (this) {
            try {
                if (this.c.get()) {
                    if (i <= this.f) {
                        return;
                    }
                    this.f = i;
                    if (this.g) {
                        return;
                    }
                    this.g = true;
                    try {
                        this.a.execute(this);
                    } catch (Throwable unused) {
                        synchronized (this) {
                            this.g = false;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            try {
                if (!this.c.get()) {
                    this.g = false;
                    return;
                }
                Object obj = this.d.get();
                int i = this.f;
                while (true) {
                    if (!Objects.equals(this.e, obj)) {
                        this.e = obj;
                        boolean z = obj instanceof gq0;
                        uk9 uk9Var = this.b;
                        if (z) {
                            uk9Var.onError(null);
                        } else {
                            uk9Var.b(obj);
                        }
                    }
                    synchronized (this) {
                        try {
                            if (i == this.f || !this.c.get()) {
                                break;
                                break;
                            } else {
                                obj = this.d.get();
                                i = this.f;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                this.g = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
