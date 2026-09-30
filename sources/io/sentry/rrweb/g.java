package io.sentry.rrweb;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends e implements k2 {
    public f d;
    public int e;
    public float f;
    public float g;
    public int v;
    public int w;
    public HashMap x;
    public HashMap y;

    public g() {
        super(d.MouseInteraction);
        this.v = 2;
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
        cVar.q("type");
        cVar.w(z0Var, this.d);
        cVar.q("id");
        cVar.v(this.e);
        cVar.q("x");
        cVar.u(this.f);
        cVar.q("y");
        cVar.u(this.g);
        cVar.q("pointerType");
        cVar.v(this.v);
        cVar.q("pointerId");
        cVar.v(this.w);
        HashMap map = this.y;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.y, str, cVar, str, z0Var);
            }
        }
        cVar.m();
        HashMap map2 = this.x;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                io.sentry.e.a(this.x, str2, cVar, str2, z0Var);
            }
        }
        cVar.m();
    }
}
