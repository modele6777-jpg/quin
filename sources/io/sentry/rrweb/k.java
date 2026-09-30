package io.sentry.rrweb;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends b implements k2 {
    public String c;
    public HashMap d;

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
        cVar.q("tag");
        cVar.z(this.c);
        cVar.q("payload");
        cVar.j();
        HashMap map = this.d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                cVar.q(str);
                cVar.w(z0Var, obj);
            }
        }
        cVar.m();
        cVar.m();
        cVar.m();
    }
}
