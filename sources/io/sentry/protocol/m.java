package io.sentry.protocol;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements k2 {
    public String a;
    public Integer b;
    public String c;
    public String d;
    public Integer e;
    public String f;
    public Boolean g;
    public String v;
    public String w;
    public ConcurrentHashMap x;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (io.sentry.util.b.i(this.a, mVar.a) && io.sentry.util.b.i(this.b, mVar.b) && io.sentry.util.b.i(this.c, mVar.c) && io.sentry.util.b.i(this.d, mVar.d) && io.sentry.util.b.i(this.e, mVar.e) && io.sentry.util.b.i(this.f, mVar.f) && io.sentry.util.b.i(this.g, mVar.g) && io.sentry.util.b.i(this.v, mVar.v) && io.sentry.util.b.i(this.w, mVar.w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w});
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        if (this.a != null) {
            cVar.q("name");
            cVar.z(this.a);
        }
        if (this.b != null) {
            cVar.q("id");
            cVar.y(this.b);
        }
        if (this.c != null) {
            cVar.q("vendor_id");
            cVar.z(this.c);
        }
        if (this.d != null) {
            cVar.q("vendor_name");
            cVar.z(this.d);
        }
        if (this.e != null) {
            cVar.q("memory_size");
            cVar.y(this.e);
        }
        if (this.f != null) {
            cVar.q("api_type");
            cVar.z(this.f);
        }
        if (this.g != null) {
            cVar.q("multi_threaded_rendering");
            cVar.x(this.g);
        }
        if (this.v != null) {
            cVar.q("version");
            cVar.z(this.v);
        }
        if (this.w != null) {
            cVar.q("npot_support");
            cVar.z(this.w);
        }
        ConcurrentHashMap concurrentHashMap = this.x;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.x, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }
}
