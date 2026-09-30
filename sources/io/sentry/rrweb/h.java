package io.sentry.rrweb;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements k2 {
    public int a;
    public float b;
    public float c;
    public long d;
    public HashMap e;

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        cVar.q("id");
        cVar.v(this.a);
        cVar.q("x");
        cVar.u(this.b);
        cVar.q("y");
        cVar.u(this.c);
        cVar.q("timeOffset");
        cVar.v(this.d);
        HashMap map = this.e;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.e, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }
}
