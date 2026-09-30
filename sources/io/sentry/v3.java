package io.sentry;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class v3 implements k2 {
    public String a;
    public String b;
    public String c;
    public Long d;
    public Long e;
    public Long f;
    public Long g;
    public ConcurrentHashMap v;

    public v3(q1 q1Var, Long l, Long l2) {
        this.a = q1Var.q().a();
        this.b = q1Var.u().a.a();
        this.c = q1Var.getName().isEmpty() ? "unknown" : q1Var.getName();
        this.d = l;
        this.f = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v3.class != obj.getClass()) {
            return false;
        }
        v3 v3Var = (v3) obj;
        return this.a.equals(v3Var.a) && this.b.equals(v3Var.b) && this.c.equals(v3Var.c) && this.d.equals(v3Var.d) && this.f.equals(v3Var.f) && io.sentry.util.b.i(this.g, v3Var.g) && io.sentry.util.b.i(this.e, v3Var.e) && io.sentry.util.b.i(this.v, v3Var.v);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v});
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        cVar.q("id");
        cVar.w(z0Var, this.a);
        cVar.q("trace_id");
        cVar.w(z0Var, this.b);
        cVar.q("name");
        cVar.w(z0Var, this.c);
        cVar.q("relative_start_ns");
        cVar.w(z0Var, this.d);
        cVar.q("relative_end_ns");
        cVar.w(z0Var, this.e);
        cVar.q("relative_cpu_start_ms");
        cVar.w(z0Var, this.f);
        cVar.q("relative_cpu_end_ms");
        cVar.w(z0Var, this.g);
        ConcurrentHashMap concurrentHashMap = this.v;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                e.b(this.v, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }
}
