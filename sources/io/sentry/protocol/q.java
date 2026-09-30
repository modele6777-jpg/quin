package io.sentry.protocol;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements k2 {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Boolean f;
    public ConcurrentHashMap g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (io.sentry.util.b.i(this.a, qVar.a) && io.sentry.util.b.i(this.b, qVar.b) && io.sentry.util.b.i(this.c, qVar.c) && io.sentry.util.b.i(this.d, qVar.d) && io.sentry.util.b.i(this.e, qVar.e) && io.sentry.util.b.i(this.f, qVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
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
            cVar.q("version");
            cVar.z(this.b);
        }
        if (this.c != null) {
            cVar.q("raw_description");
            cVar.z(this.c);
        }
        if (this.d != null) {
            cVar.q("build");
            cVar.z(this.d);
        }
        if (this.e != null) {
            cVar.q("kernel_version");
            cVar.z(this.e);
        }
        if (this.f != null) {
            cVar.q("rooted");
            cVar.x(this.f);
        }
        ConcurrentHashMap concurrentHashMap = this.g;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.g, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }
}
