package io.sentry;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b5 implements k2 {
    public final io.sentry.protocol.w a;
    public final io.sentry.protocol.u b;
    public final k7 c;
    public Date d;
    public HashMap e;

    public b5(io.sentry.protocol.w wVar, io.sentry.protocol.u uVar, k7 k7Var) {
        this.a = wVar;
        this.b = uVar;
        this.c = k7Var;
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        io.sentry.protocol.w wVar = this.a;
        if (wVar != null) {
            cVar.q("event_id");
            cVar.w(z0Var, wVar);
        }
        io.sentry.protocol.u uVar = this.b;
        if (uVar != null) {
            cVar.q("sdk");
            cVar.w(z0Var, uVar);
        }
        k7 k7Var = this.c;
        if (k7Var != null) {
            cVar.q("trace");
            cVar.w(z0Var, k7Var);
        }
        if (this.d != null) {
            cVar.q("sent_at");
            cVar.w(z0Var, io.sentry.vendor.a.f(this.d.getTime()));
        }
        HashMap map = this.e;
        if (map != null) {
            for (String str : map.keySet()) {
                e.a(this.e, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }
}
