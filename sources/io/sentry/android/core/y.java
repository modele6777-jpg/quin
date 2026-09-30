package io.sentry.android.core;

import android.content.Context;
import android.os.Build;
import com.adjust.sdk.Constants;
import defpackage.ip3;
import io.sentry.a7;
import io.sentry.q4;
import io.sentry.q5;
import io.sentry.q6;
import io.sentry.u3;
import io.sentry.v3;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y implements io.sentry.r1 {
    public long X;
    public long Y;
    public Date Z;
    public final Context a;
    public final io.sentry.z0 b;
    public final String c;
    public final boolean d;
    public final int e;
    public final io.sentry.util.e f;
    public final o0 g;
    public final io.sentry.android.core.internal.util.o x;
    public volatile v3 y;
    public boolean v = false;
    public final AtomicBoolean w = new AtomicBoolean(false);
    public volatile w z = null;
    public final io.sentry.util.a E0 = new io.sentry.util.a();

    public y(Context context, o0 o0Var, io.sentry.android.core.internal.util.o oVar, io.sentry.z0 z0Var, String str, boolean z, int i, io.sentry.util.e eVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        io.sentry.util.b.r(z0Var, "ILogger is required");
        this.b = z0Var;
        this.x = oVar;
        io.sentry.util.b.r(o0Var, "The BuildInfoProvider is required.");
        this.g = o0Var;
        this.c = str;
        this.d = z;
        this.e = i;
        this.f = eVar;
        this.Z = new Date();
    }

    public final u3 a(String str, String str2, String str3, boolean z, List list, q6 q6Var) {
        this.g.getClass();
        int i = Build.VERSION.SDK_INT;
        if (this.z != null) {
            io.sentry.util.a aVar = this.E0;
            aVar.b();
            try {
                v3 v3Var = this.y;
                if (v3Var == null || !v3Var.a.equals(str2)) {
                    this.b.i(q5.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
                    aVar.close();
                    return null;
                }
                this.y = null;
                aVar.close();
                this.b.i(q5.DEBUG, "Transaction %s (%s) finished.", str, str3);
                v vVarA = this.z.a(list, false);
                this.w.set(false);
                if (vVarA != null) {
                    long j = vVarA.a - this.X;
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(v3Var);
                    long j2 = vVarA.a;
                    long j3 = this.X;
                    long j4 = vVarA.c;
                    long j5 = this.Y;
                    if (v3Var.e == null) {
                        v3Var.e = Long.valueOf(j2 - j3);
                        v3Var.d = Long.valueOf(v3Var.d.longValue() - j3);
                        v3Var.g = Long.valueOf(j4 - j5);
                        v3Var.f = Long.valueOf(v3Var.f.longValue() - j5);
                    }
                    Long l = q6Var instanceof SentryAndroidOptions ? u0.c(this.a, (SentryAndroidOptions) q6Var).h : null;
                    String string = l != null ? Long.toString(l.longValue()) : "0";
                    String[] strArr = Build.SUPPORTED_ABIS;
                    File file = (File) vVarA.d;
                    Date date = this.Z;
                    String string2 = Long.toString(j);
                    this.g.getClass();
                    String str4 = (strArr == null || strArr.length <= 0) ? "" : strArr[0];
                    io.sentry.m0 m0Var = new io.sentry.m0(2);
                    this.g.getClass();
                    String str5 = Build.MANUFACTURER;
                    this.g.getClass();
                    String str6 = Build.MODEL;
                    this.g.getClass();
                    return new u3(file, date, arrayList, str, str2, str3, string2, i, str4, m0Var, str5, str6, Build.VERSION.RELEASE, this.g.a(), string, q6Var.getProguardUuid(), q6Var.getRelease(), q6Var.getEnvironment(), (vVarA.b || z) ? "timeout" : Constants.NORMAL, (HashMap) vVarA.e);
                }
            } catch (Throwable th) {
                try {
                    aVar.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        return null;
    }

    @Override // io.sentry.r1
    public final void close() {
        y yVar;
        v3 v3Var = this.y;
        if (v3Var != null) {
            yVar = this;
            yVar.a(v3Var.c, v3Var.a, v3Var.b, true, null, q4.b().o());
        } else {
            yVar = this;
        }
        yVar.w.set(false);
        if (yVar.z != null) {
            w wVar = yVar.z;
            io.sentry.util.a aVar = wVar.o;
            aVar.b();
            try {
                Future future = wVar.d;
                if (future != null) {
                    future.cancel(true);
                    wVar.d = null;
                }
                if (wVar.n) {
                    wVar.a(null, true);
                }
                aVar.close();
            } catch (Throwable th) {
                try {
                    aVar.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
    }

    @Override // io.sentry.r1
    public final void e(io.sentry.q1 q1Var) {
        if (this.w.get() && this.y == null) {
            io.sentry.util.a aVar = this.E0;
            aVar.b();
            try {
                if (this.w.get() && this.y == null) {
                    this.y = new v3(q1Var, Long.valueOf(this.X), Long.valueOf(this.Y));
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
    }

    @Override // io.sentry.r1
    public final u3 f(a7 a7Var, List list, q6 q6Var) {
        return a(a7Var.e, a7Var.a.a(), a7Var.b.c.a.a(), false, list, q6Var);
    }

    @Override // io.sentry.r1
    public final boolean isRunning() {
        return this.w.get();
    }

    @Override // io.sentry.r1
    public final void start() {
        ip3 ip3VarC;
        this.g.getClass();
        if (this.w.getAndSet(true)) {
            return;
        }
        if (!this.v) {
            this.v = true;
            if (this.d) {
                String str = this.c;
                if (str == null) {
                    this.b.i(q5.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
                } else {
                    int i = this.e;
                    if (i <= 0) {
                        this.b.i(q5.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i));
                    } else {
                        this.z = new w(str, 1000000 / i, this.x, this.f, this.b);
                    }
                }
            } else {
                this.b.i(q5.INFO, "Profiling is disabled in options.", new Object[0]);
            }
        }
        if (this.z != null && (ip3VarC = this.z.c()) != null) {
            this.X = ip3VarC.a;
            this.Y = ip3VarC.b;
            this.Z = (Date) ip3VarC.c;
            this.b.i(q5.DEBUG, "Profiler started.", new Object[0]);
            return;
        }
        if (this.z != null && this.z.n) {
            this.b.i(q5.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
            return;
        }
        io.sentry.util.a aVar = this.E0;
        aVar.b();
        try {
            this.y = null;
            aVar.close();
            this.w.set(false);
        } catch (Throwable th) {
            try {
                aVar.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
