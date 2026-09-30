package io.sentry;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class e7 implements k2 {
    public c X;
    public final d Y;
    public final io.sentry.protocol.w Z;
    public final io.sentry.protocol.w a;
    public final g7 b;
    public final g7 c;
    public transient w3 d;
    public String e;
    public String f;
    public h7 g;
    public ConcurrentHashMap v;
    public String w;
    public Map x;
    public ConcurrentHashMap y;
    public v1 z;

    public e7(io.sentry.protocol.w wVar, g7 g7Var, g7 g7Var2, String str, String str2, w3 w3Var, h7 h7Var, String str3) {
        this.v = new ConcurrentHashMap();
        this.w = "manual";
        this.x = new ConcurrentHashMap();
        this.z = v1.SENTRY;
        this.Y = new d(10);
        this.Z = io.sentry.protocol.w.b;
        io.sentry.util.b.r(wVar, "traceId is required");
        this.a = wVar;
        io.sentry.util.b.r(g7Var, "spanId is required");
        this.b = g7Var;
        io.sentry.util.b.r(str, "operation is required");
        this.e = str;
        this.c = g7Var2;
        this.f = str2;
        this.g = h7Var;
        this.w = str3;
        a(w3Var);
        io.sentry.util.thread.a threadChecker = q4.b().o().getThreadChecker();
        this.x.put("thread.id", String.valueOf(threadChecker.b()));
        this.x.put("thread.name", threadChecker.a());
    }

    public final void a(w3 w3Var) {
        this.d = w3Var;
        c cVar = this.X;
        if (cVar == null || w3Var == null) {
            return;
        }
        Boolean bool = (Boolean) w3Var.a;
        Charset charset = io.sentry.util.p.a;
        cVar.d("sentry-sampled", bool == null ? null : bool.toString());
        Double d = (Double) w3Var.c;
        if (d != null && cVar.f) {
            cVar.d = d;
        }
        Double d2 = (Double) w3Var.b;
        if (d2 != null) {
            cVar.c = d2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        return this.a.equals(e7Var.a) && this.b.equals(e7Var.b) && io.sentry.util.b.i(this.c, e7Var.c) && this.e.equals(e7Var.e) && io.sentry.util.b.i(this.f, e7Var.f) && this.g == e7Var.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.f, this.g});
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        cVar.q("trace_id");
        this.a.serialize(cVar, z0Var);
        cVar.q("span_id");
        this.b.serialize(cVar, z0Var);
        g7 g7Var = this.c;
        if (g7Var != null) {
            cVar.q("parent_span_id");
            g7Var.serialize(cVar, z0Var);
        }
        cVar.q("op");
        cVar.z(this.e);
        if (this.f != null) {
            cVar.q("description");
            cVar.z(this.f);
        }
        if (this.g != null) {
            cVar.q("status");
            cVar.w(z0Var, this.g);
        }
        if (this.w != null) {
            cVar.q("origin");
            cVar.w(z0Var, this.w);
        }
        if (!this.v.isEmpty()) {
            cVar.q("tags");
            cVar.w(z0Var, this.v);
        }
        if (!this.x.isEmpty()) {
            cVar.q("data");
            cVar.w(z0Var, this.x);
        }
        ConcurrentHashMap concurrentHashMap = this.y;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                e.b(this.y, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }

    public e7(io.sentry.protocol.w wVar, g7 g7Var, String str, g7 g7Var2) {
        this(wVar, g7Var, g7Var2, str, null, null, null, "manual");
    }

    public e7(e7 e7Var) {
        this.v = new ConcurrentHashMap();
        this.w = "manual";
        this.x = new ConcurrentHashMap();
        this.z = v1.SENTRY;
        this.Y = new d(10);
        this.Z = io.sentry.protocol.w.b;
        this.a = e7Var.a;
        this.b = e7Var.b;
        this.c = e7Var.c;
        a(e7Var.d);
        this.e = e7Var.e;
        this.f = e7Var.f;
        this.g = e7Var.g;
        ConcurrentHashMap concurrentHashMapO = io.sentry.util.b.o(e7Var.v);
        if (concurrentHashMapO != null) {
            this.v = concurrentHashMapO;
        }
        ConcurrentHashMap concurrentHashMapO2 = io.sentry.util.b.o(e7Var.y);
        if (concurrentHashMapO2 != null) {
            this.y = concurrentHashMapO2;
        }
        this.X = e7Var.X;
        ConcurrentHashMap concurrentHashMapO3 = io.sentry.util.b.o(e7Var.x);
        if (concurrentHashMapO3 != null) {
            this.x = concurrentHashMapO3;
        }
    }
}
