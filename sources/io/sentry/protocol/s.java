package io.sentry.protocol;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements k2 {
    public String a;
    public ConcurrentHashMap b;
    public Integer c;
    public Long d;
    public Object e;
    public ConcurrentHashMap f;

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        if (this.a != null) {
            cVar.q("cookies");
            cVar.z(this.a);
        }
        if (this.b != null) {
            cVar.q("headers");
            cVar.w(z0Var, this.b);
        }
        if (this.c != null) {
            cVar.q("status_code");
            cVar.w(z0Var, this.c);
        }
        if (this.d != null) {
            cVar.q("body_size");
            cVar.w(z0Var, this.d);
        }
        if (this.e != null) {
            cVar.q("data");
            cVar.w(z0Var, this.e);
        }
        ConcurrentHashMap concurrentHashMap = this.f;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.f, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }
}
