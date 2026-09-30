package io.sentry.android.core;

import android.os.Handler;
import androidx.lifecycle.ProcessLifecycleOwner;
import defpackage.bwe;
import defpackage.nzf;
import io.sentry.q5;
import io.sentry.v2;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 implements Closeable {
    public static final i0 e = new i0();
    public volatile h0 b;
    public final io.sentry.util.a a = new io.sentry.util.a();
    public final q0 c = new q0(3);
    public volatile Boolean d = null;

    public final void b(f0 f0Var) {
        io.sentry.util.a aVar = this.a;
        aVar.b();
        try {
            l(v2.a);
            if (this.b != null) {
                this.b.a.add(f0Var);
            }
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        x();
    }

    public final void h(io.sentry.z0 z0Var) {
        h0 h0Var = this.b;
        if (h0Var != null) {
            try {
                ProcessLifecycleOwner.w.f.a(h0Var);
            } catch (Throwable th) {
                this.b = null;
                z0Var.d(q5.ERROR, "AppState failed to get Lifecycle and could not install lifecycle observer.", th);
            }
        }
    }

    public final void l(io.sentry.z0 z0Var) {
        if (this.b != null) {
            return;
        }
        try {
            ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.w;
            this.b = new h0(this);
            if (io.sentry.android.core.internal.util.e.a.c()) {
                h(z0Var);
                return;
            }
            q0 q0Var = this.c;
            ((Handler) q0Var.a).post(new nzf(6, this, z0Var));
        } catch (ClassNotFoundException unused) {
            z0Var.i(q5.WARNING, "androidx.lifecycle is not available, some features might not be properly working,e.g. Session Tracking, Network and System Events breadcrumbs, etc.", new Object[0]);
        } catch (Throwable th) {
            z0Var.d(q5.ERROR, "AppState could not register lifecycle observer", th);
        }
    }

    public final void u(f0 f0Var) {
        io.sentry.util.a aVar = this.a;
        aVar.b();
        try {
            if (this.b != null) {
                this.b.a.remove(f0Var);
            }
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void x() {
        if (this.b == null) {
            return;
        }
        io.sentry.util.a aVar = this.a;
        aVar.b();
        try {
            h0 h0Var = this.b;
            this.b.a.clear();
            this.b = null;
            aVar.close();
            if (io.sentry.android.core.internal.util.e.a.c()) {
                if (h0Var != null) {
                    ProcessLifecycleOwner.w.f.b(h0Var);
                }
            } else {
                q0 q0Var = this.c;
                ((Handler) q0Var.a).post(new bwe(10, this, h0Var));
            }
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
