package io.sentry;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class r5 implements k2 {
    public int a;
    public String b;
    public String c;
    public String d;
    public Long e;
    public ConcurrentHashMap f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r5.class != obj.getClass()) {
            return false;
        }
        return io.sentry.util.b.i(this.b, ((r5) obj).b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        cVar.q("type");
        cVar.v(this.a);
        if (this.b != null) {
            cVar.q("address");
            cVar.z(this.b);
        }
        if (this.c != null) {
            cVar.q("package_name");
            cVar.z(this.c);
        }
        if (this.d != null) {
            cVar.q("class_name");
            cVar.z(this.d);
        }
        if (this.e != null) {
            cVar.q("thread_id");
            cVar.y(this.e);
        }
        ConcurrentHashMap concurrentHashMap = this.f;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                e.b(this.f, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }
}
