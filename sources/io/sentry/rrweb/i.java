package io.sentry.rrweb;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends e implements k2 {
    public int d;
    public List e;
    public HashMap f;
    public HashMap g;

    public i() {
        super(d.TouchMove);
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        cVar.q("type");
        cVar.w(z0Var, this.a);
        cVar.q("timestamp");
        cVar.v(this.b);
        cVar.q("data");
        cVar.j();
        cVar.q("source");
        cVar.w(z0Var, this.c);
        List list = this.e;
        if (list != null && !list.isEmpty()) {
            cVar.q("positions");
            cVar.w(z0Var, this.e);
        }
        cVar.q("pointerId");
        cVar.v(this.d);
        HashMap map = this.g;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.g, str, cVar, str, z0Var);
            }
        }
        cVar.m();
        HashMap map2 = this.f;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                io.sentry.e.a(this.f, str2, cVar, str2, z0Var);
            }
        }
        cVar.m();
    }
}
