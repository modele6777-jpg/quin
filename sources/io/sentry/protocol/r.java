package io.sentry.protocol;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements k2 {
    public String a;
    public String b;
    public String c;
    public Object d;
    public String e;
    public ConcurrentHashMap f;
    public ConcurrentHashMap g;
    public Long v;
    public ConcurrentHashMap w;
    public String x;
    public String y;
    public ConcurrentHashMap z;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return io.sentry.util.b.i(this.a, rVar.a) && io.sentry.util.b.i(this.b, rVar.b) && io.sentry.util.b.i(this.c, rVar.c) && io.sentry.util.b.i(this.e, rVar.e) && io.sentry.util.b.i(this.f, rVar.f) && io.sentry.util.b.i(this.g, rVar.g) && io.sentry.util.b.i(this.v, rVar.v) && io.sentry.util.b.i(this.x, rVar.x) && io.sentry.util.b.i(this.y, rVar.y);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.f, this.g, this.v, this.x, this.y});
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        if (this.a != null) {
            cVar.q("url");
            cVar.z(this.a);
        }
        if (this.b != null) {
            cVar.q("method");
            cVar.z(this.b);
        }
        if (this.c != null) {
            cVar.q("query_string");
            cVar.z(this.c);
        }
        if (this.d != null) {
            cVar.q("data");
            cVar.w(z0Var, this.d);
        }
        if (this.e != null) {
            cVar.q("cookies");
            cVar.z(this.e);
        }
        if (this.f != null) {
            cVar.q("headers");
            cVar.w(z0Var, this.f);
        }
        if (this.g != null) {
            cVar.q("env");
            cVar.w(z0Var, this.g);
        }
        if (this.w != null) {
            cVar.q("other");
            cVar.w(z0Var, this.w);
        }
        if (this.x != null) {
            cVar.q("fragment");
            cVar.w(z0Var, this.x);
        }
        if (this.v != null) {
            cVar.q("body_size");
            cVar.w(z0Var, this.v);
        }
        if (this.y != null) {
            cVar.q("api_target");
            cVar.w(z0Var, this.y);
        }
        ConcurrentHashMap concurrentHashMap = this.z;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.z, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }
}
