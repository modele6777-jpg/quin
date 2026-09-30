package io.sentry;

import defpackage.qc0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements k2, Comparable {
    public static final Map y = Collections.EMPTY_MAP;
    public final Long a;
    public Date b;
    public final Long c;
    public String d;
    public String e;
    public volatile Map f;
    public String g;
    public String v;
    public q5 w;
    public ConcurrentHashMap x;

    public g(g gVar) {
        ConcurrentHashMap concurrentHashMapO;
        this.f = y;
        this.c = Long.valueOf(System.nanoTime());
        this.b = gVar.b;
        this.a = gVar.a;
        this.d = gVar.d;
        this.e = gVar.e;
        this.g = gVar.g;
        this.v = gVar.v;
        if (!gVar.f.isEmpty() && (concurrentHashMapO = io.sentry.util.b.o(gVar.f)) != null) {
            this.f = concurrentHashMapO;
        }
        this.x = io.sentry.util.b.o(gVar.x);
        this.w = gVar.w;
    }

    public static boolean a(g gVar, g gVar2) {
        return gVar.c().getTime() == gVar2.c().getTime() && io.sentry.util.b.i(gVar.d, gVar2.d) && io.sentry.util.b.i(gVar.e, gVar2.e) && io.sentry.util.b.i(gVar.g, gVar2.g) && io.sentry.util.b.i(gVar.v, gVar2.v) && gVar.w == gVar2.w;
    }

    public final Map b() {
        Map concurrentHashMap;
        Map map = this.f;
        Map map2 = y;
        if (map != map2) {
            return map;
        }
        synchronized (this) {
            try {
                concurrentHashMap = this.f;
                if (concurrentHashMap == map2) {
                    concurrentHashMap = new ConcurrentHashMap();
                    this.f = concurrentHashMap;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return concurrentHashMap;
    }

    public final Date c() {
        Date date = this.b;
        if (date != null) {
            return date;
        }
        Long l = this.a;
        if (l == null) {
            qc0.p("No timestamp set for breadcrumb");
            return null;
        }
        Date date2 = new Date(l.longValue());
        this.b = date2;
        return date2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.c.compareTo(((g) obj).c);
    }

    public final void d(Object obj, String str) {
        if (str == null) {
            return;
        }
        if (obj != null) {
            b().put(str, obj);
            return;
        }
        Map map = this.f;
        if (map != y) {
            map.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if ("http".equals(this.e)) {
            return a(this, gVar) && io.sentry.util.b.i(this.f.get("status_code"), gVar.f.get("status_code")) && io.sentry.util.b.i(this.f.get("url"), gVar.f.get("url")) && io.sentry.util.b.i(this.f.get("method"), gVar.f.get("method")) && io.sentry.util.b.i(this.f.get("http.fragment"), gVar.f.get("http.fragment")) && io.sentry.util.b.i(this.f.get("http.query"), gVar.f.get("http.query"));
        }
        return a(this, gVar);
    }

    public final int hashCode() {
        return "http".equals(this.e) ? Arrays.hashCode(new Object[]{Long.valueOf(c().getTime()), this.d, this.e, this.g, this.v, this.w, this.f.get("status_code"), this.f.get("url"), this.f.get("method"), this.f.get("http.fragment"), this.f.get("http.query")}) : Arrays.hashCode(new Object[]{Long.valueOf(c().getTime()), this.d, this.e, this.g, this.v, this.w});
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        cVar.q("timestamp");
        Long l = this.a;
        cVar.z(l != null ? io.sentry.vendor.a.f(l.longValue()) : io.sentry.vendor.a.f(c().getTime()));
        if (this.d != null) {
            cVar.q("message");
            cVar.z(this.d);
        }
        if (this.e != null) {
            cVar.q("type");
            cVar.z(this.e);
        }
        cVar.q("data");
        cVar.w(z0Var, this.f);
        if (this.g != null) {
            cVar.q("category");
            cVar.z(this.g);
        }
        if (this.v != null) {
            cVar.q("origin");
            cVar.z(this.v);
        }
        if (this.w != null) {
            cVar.q("level");
            cVar.w(z0Var, this.w);
        }
        ConcurrentHashMap concurrentHashMap = this.x;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                e.b(this.x, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }

    public g(long j) {
        this.f = y;
        this.c = Long.valueOf(System.nanoTime());
        this.a = Long.valueOf(j);
        this.b = null;
    }

    public g(Date date) {
        this.f = y;
        this.c = Long.valueOf(System.nanoTime());
        this.b = date;
        this.a = null;
    }

    public g() {
        this(System.currentTimeMillis());
    }
}
