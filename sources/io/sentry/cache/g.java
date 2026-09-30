package io.sentry.cache;

import com.adjust.sdk.Constants;
import defpackage.xag;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.e4;
import io.sentry.e7;
import io.sentry.g7;
import io.sentry.h4;
import io.sentry.protocol.i0;
import io.sentry.protocol.w;
import io.sentry.q5;
import io.sentry.q6;
import io.sentry.w3;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends h4 {
    public static final Charset f = Charset.forName(Constants.ENCODING);
    public static final Object g = new Object();
    public static final Object h = new Object();
    public final SentryAndroidOptions a;
    public final io.sentry.util.f b = new io.sentry.util.f(new xag(16, this));
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentLinkedQueue d = new ConcurrentLinkedQueue();
    public final AtomicBoolean e = new AtomicBoolean(false);

    public g(SentryAndroidOptions sentryAndroidOptions) {
        this.a = sentryAndroidOptions;
    }

    public final void a(String str) {
        a.a(this.a, ".scope-cache", str);
    }

    public final void b(Object obj, String str) {
        if (this.a.isEnableScopePersistence()) {
            if (obj == null) {
                obj = g;
            }
            this.c.put(str, obj);
            e();
        }
    }

    @Override // io.sentry.f1
    public final void c(i0 i0Var) {
        b(i0Var, "user.json");
    }

    public final Object d(q6 q6Var, String str, Class cls) {
        if (!str.equals("breadcrumbs.json")) {
            return a.c(q6Var, ".scope-cache", str, cls);
        }
        try {
            return cls.cast(((io.sentry.cache.tape.f) this.b.a()).U());
        } catch (IOException unused) {
            q6Var.getLogger().i(q5.ERROR, "Unable to read serialized breadcrumbs from QueueFile", new Object[0]);
            return null;
        }
    }

    public final void e() {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        AtomicBoolean atomicBoolean = this.e;
        int i = 0;
        if (atomicBoolean.compareAndSet(false, true)) {
            try {
                if (sentryAndroidOptions.getExecutorService().submit(new f(this, i)).isCancelled()) {
                    atomicBoolean.set(false);
                }
            } catch (Throwable th) {
                atomicBoolean.set(false);
                sentryAndroidOptions.getLogger().d(q5.ERROR, "Scope persistence flush could not be submitted", th);
            }
        }
    }

    @Override // io.sentry.f1
    public final void j(io.sentry.g gVar) {
        if (this.a.isEnableScopePersistence()) {
            this.d.offer(gVar);
            e();
        }
    }

    @Override // io.sentry.h4, io.sentry.f1
    public final void k(Collection collection) {
        if (collection.isEmpty() && this.a.isEnableScopePersistence()) {
            this.d.offer(h);
            e();
        }
    }

    @Override // io.sentry.h4, io.sentry.f1
    public final void n(w wVar) {
        b(wVar, "replay.json");
    }

    @Override // io.sentry.f1
    public final void p(e7 e7Var, e4 e4Var) {
        if (e7Var == null) {
            w3 w3Var = e4Var.s;
            e7 e7Var2 = new e7((w) w3Var.b, (g7) w3Var.c, "default", null);
            e7Var2.w = "auto";
            e7Var = e7Var2;
        }
        b(e7Var, "trace.json");
    }

    @Override // io.sentry.h4, io.sentry.f1
    public final void q(io.sentry.protocol.e eVar) {
        b(eVar, "contexts.json");
    }

    @Override // io.sentry.h4, io.sentry.f1
    public final void r(ConcurrentHashMap concurrentHashMap) {
        b(concurrentHashMap, "extras.json");
    }

    @Override // io.sentry.h4, io.sentry.f1
    public final void s(String str) {
        b(str, "transaction.json");
    }
}
