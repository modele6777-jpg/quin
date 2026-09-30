package io.sentry;

import com.google.firebase.crashlytics.BuildConfig;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c7 implements k2 {
    public ConcurrentHashMap E0;
    public final String X;
    public String Y;
    public final io.sentry.util.a Z = new io.sentry.util.a();
    public final Date a;
    public Date b;
    public final AtomicInteger c;
    public final String d;
    public final String e;
    public Boolean f;
    public b7 g;
    public Long v;
    public Double w;
    public final String x;
    public String y;
    public final String z;

    public c7(b7 b7Var, Date date, Date date2, int i, String str, String str2, Boolean bool, Long l, Double d, String str3, String str4, String str5, String str6, String str7) {
        this.g = b7Var;
        this.a = date;
        this.b = date2;
        this.c = new AtomicInteger(i);
        this.d = str;
        this.e = str2;
        this.f = bool;
        this.v = l;
        this.w = d;
        this.x = str3;
        this.y = str4;
        this.z = str5;
        this.X = str6;
        this.Y = str7;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c7 clone() {
        return new c7(this.g, this.a, this.b, this.c.get(), this.d, this.e, this.f, this.v, this.w, this.x, this.y, this.z, this.X, this.Y);
    }

    public final void b(Date date) {
        io.sentry.util.a aVar = this.Z;
        aVar.b();
        try {
            this.f = null;
            if (this.g == b7.Ok) {
                this.g = b7.Exited;
            }
            if (date != null) {
                this.b = date;
            } else {
                date = new Date();
                this.b = date;
            }
            this.w = Double.valueOf(Math.abs(date.getTime() - this.a.getTime()) / 1000.0d);
            long time = this.b.getTime();
            if (time < 0) {
                time = Math.abs(time);
            }
            this.v = Long.valueOf(time);
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

    public final boolean c(b7 b7Var, String str, boolean z, String str2) {
        boolean z2;
        io.sentry.util.a aVar = this.Z;
        aVar.b();
        boolean z3 = true;
        if (b7Var != null) {
            try {
                this.g = b7Var;
                z2 = true;
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            z2 = false;
        }
        if (str != null) {
            this.y = str;
            z2 = true;
        }
        if (z) {
            this.c.addAndGet(1);
            z2 = true;
        }
        if (str2 != null) {
            this.Y = str2;
        } else {
            z3 = z2;
        }
        if (z3) {
            this.f = null;
            Date date = new Date();
            this.b = date;
            long time = date.getTime();
            if (time < 0) {
                time = Math.abs(time);
            }
            this.v = Long.valueOf(time);
        }
        aVar.close();
        return z3;
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        String str = this.e;
        if (str != null) {
            cVar.q("sid");
            cVar.z(str);
        }
        String str2 = this.d;
        if (str2 != null) {
            cVar.q("did");
            cVar.z(str2);
        }
        if (this.f != null) {
            cVar.q("init");
            cVar.x(this.f);
        }
        cVar.q("started");
        cVar.w(z0Var, this.a);
        cVar.q("status");
        cVar.w(z0Var, this.g.name().toLowerCase(Locale.ROOT));
        if (this.v != null) {
            cVar.q("seq");
            cVar.y(this.v);
        }
        cVar.q("errors");
        cVar.v(this.c.intValue());
        if (this.w != null) {
            cVar.q("duration");
            cVar.y(this.w);
        }
        if (this.b != null) {
            cVar.q("timestamp");
            cVar.w(z0Var, this.b);
        }
        if (this.Y != null) {
            cVar.q("abnormal_mechanism");
            cVar.w(z0Var, this.Y);
        }
        cVar.q("attrs");
        cVar.j();
        cVar.q(BuildConfig.BUILD_TYPE);
        cVar.w(z0Var, this.X);
        String str3 = this.z;
        if (str3 != null) {
            cVar.q("environment");
            cVar.w(z0Var, str3);
        }
        String str4 = this.x;
        if (str4 != null) {
            cVar.q("ip_address");
            cVar.w(z0Var, str4);
        }
        if (this.y != null) {
            cVar.q("user_agent");
            cVar.w(z0Var, this.y);
        }
        cVar.m();
        ConcurrentHashMap concurrentHashMap = this.E0;
        if (concurrentHashMap != null) {
            for (String str5 : concurrentHashMap.keySet()) {
                e.b(this.E0, str5, cVar, str5, z0Var);
            }
        }
        cVar.m();
    }
}
