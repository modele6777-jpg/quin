package io.sentry.protocol;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements k2 {
    public Long a;
    public Double b;
    public Long c;
    public Double d;
    public Long e;
    public Double f;
    public Long g;
    public Long v;
    public Long w;
    public Long x;
    public Long y;
    public ConcurrentHashMap z;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (io.sentry.util.b.i(this.a, cVar.a) && io.sentry.util.b.i(this.b, cVar.b) && io.sentry.util.b.i(this.c, cVar.c) && io.sentry.util.b.i(this.d, cVar.d) && io.sentry.util.b.i(this.e, cVar.e) && io.sentry.util.b.i(this.f, cVar.f) && io.sentry.util.b.i(this.g, cVar.g) && io.sentry.util.b.i(this.v, cVar.v) && io.sentry.util.b.i(this.w, cVar.w) && io.sentry.util.b.i(this.x, cVar.x) && io.sentry.util.b.i(this.y, cVar.y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y});
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        if (this.a != null) {
            cVar.q("gc.total_count");
            cVar.y(this.a);
        }
        if (this.b != null) {
            cVar.q("gc.total_time");
            cVar.y(this.b);
        }
        if (this.c != null) {
            cVar.q("gc.blocking_count");
            cVar.y(this.c);
        }
        if (this.d != null) {
            cVar.q("gc.blocking_time");
            cVar.y(this.d);
        }
        if (this.e != null) {
            cVar.q("gc.pre_oome_count");
            cVar.y(this.e);
        }
        if (this.f != null) {
            cVar.q("gc.waiting_time");
            cVar.y(this.f);
        }
        if (this.g != null) {
            cVar.q("memory.free");
            cVar.y(this.g);
        }
        if (this.v != null) {
            cVar.q("memory.free_until_gc");
            cVar.y(this.v);
        }
        if (this.w != null) {
            cVar.q("memory.free_until_oome");
            cVar.y(this.w);
        }
        if (this.x != null) {
            cVar.q("memory.total");
            cVar.y(this.x);
        }
        if (this.y != null) {
            cVar.q("memory.max");
            cVar.y(this.y);
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
