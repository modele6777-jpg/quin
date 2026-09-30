package io.sentry;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class s5 implements k2 {
    public final io.sentry.protocol.w a;
    public g7 b;
    public final Double c;
    public final String d;
    public final u5 e;
    public Integer f;
    public Map g;
    public HashMap v;

    public s5(io.sentry.protocol.w wVar, Double d, String str, u5 u5Var) {
        this.a = wVar;
        this.c = d;
        this.d = str;
        this.e = u5Var;
    }

    public final void a(String str, io.sentry.protocol.n nVar) {
        Map map = this.g;
        if (map == null) {
            map = new HashMap();
            this.g = map;
        }
        map.put(str, nVar);
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        cVar.q("timestamp");
        cVar.w(z0Var, io.sentry.config.a.g(this.c.doubleValue()));
        cVar.q("trace_id");
        cVar.w(z0Var, this.a);
        if (this.b != null) {
            cVar.q("span_id");
            cVar.w(z0Var, this.b);
        }
        cVar.q("body");
        cVar.z(this.d);
        cVar.q("level");
        cVar.w(z0Var, this.e);
        if (this.f != null) {
            cVar.q("severity_number");
            cVar.w(z0Var, this.f);
        }
        if (this.g != null) {
            cVar.q("attributes");
            cVar.w(z0Var, this.g);
        }
        HashMap map = this.v;
        if (map != null) {
            for (String str : map.keySet()) {
                e.a(this.v, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }
}
