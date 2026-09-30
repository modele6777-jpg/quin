package io.sentry;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class w5 implements k2 {
    public io.sentry.protocol.w a;
    public g7 b;
    public Double c;
    public String d;
    public String e;
    public String f;
    public Double g;
    public Map v;
    public HashMap w;

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        cVar.q("timestamp");
        cVar.w(z0Var, io.sentry.config.a.g(this.c.doubleValue()));
        cVar.q("type");
        cVar.z(this.f);
        cVar.q("name");
        cVar.z(this.d);
        cVar.q("value");
        cVar.y(this.g);
        cVar.q("trace_id");
        cVar.w(z0Var, this.a);
        if (this.b != null) {
            cVar.q("span_id");
            cVar.w(z0Var, this.b);
        }
        if (this.e != null) {
            cVar.q("unit");
            cVar.w(z0Var, this.e);
        }
        if (this.v != null) {
            cVar.q("attributes");
            cVar.w(z0Var, this.v);
        }
        HashMap map = this.w;
        if (map != null) {
            for (String str : map.keySet()) {
                e.a(this.w, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }
}
