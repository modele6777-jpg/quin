package io.sentry.protocol;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class v implements k2 {
    public String a;
    public String b;
    public String c;
    public Long d;
    public c0 e;
    public o f;
    public HashMap g;

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        if (this.a != null) {
            cVar.q("type");
            cVar.z(this.a);
        }
        if (this.b != null) {
            cVar.q("value");
            cVar.z(this.b);
        }
        if (this.c != null) {
            cVar.q("module");
            cVar.z(this.c);
        }
        if (this.d != null) {
            cVar.q("thread_id");
            cVar.y(this.d);
        }
        if (this.e != null) {
            cVar.q("stacktrace");
            cVar.w(z0Var, this.e);
        }
        if (this.f != null) {
            cVar.q("mechanism");
            cVar.w(z0Var, this.f);
        }
        HashMap map = this.g;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.g, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }
}
