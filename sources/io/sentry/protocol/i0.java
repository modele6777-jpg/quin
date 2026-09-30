package io.sentry.protocol;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 implements k2 {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public l f;
    public ConcurrentHashMap g;
    public ConcurrentHashMap v;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i0.class == obj.getClass()) {
            i0 i0Var = (i0) obj;
            if (io.sentry.util.b.i(this.a, i0Var.a) && io.sentry.util.b.i(this.b, i0Var.b) && io.sentry.util.b.i(this.c, i0Var.c) && io.sentry.util.b.i(this.d, i0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        if (this.a != null) {
            cVar.q("email");
            cVar.z(this.a);
        }
        if (this.b != null) {
            cVar.q("id");
            cVar.z(this.b);
        }
        if (this.c != null) {
            cVar.q("username");
            cVar.z(this.c);
        }
        if (this.d != null) {
            cVar.q("ip_address");
            cVar.z(this.d);
        }
        if (this.e != null) {
            cVar.q("name");
            cVar.z(this.e);
        }
        if (this.f != null) {
            cVar.q("geo");
            this.f.serialize(cVar, z0Var);
        }
        if (this.g != null) {
            cVar.q("data");
            cVar.w(z0Var, this.g);
        }
        ConcurrentHashMap concurrentHashMap = this.v;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.v, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }
}
