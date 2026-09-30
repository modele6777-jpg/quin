package io.sentry.rrweb;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends b implements k2 {
    public String c;
    public String d;
    public String e;
    public double f;
    public double g;
    public ConcurrentHashMap v;
    public HashMap w;
    public ConcurrentHashMap x;
    public ConcurrentHashMap y;

    public l() {
        super(c.Custom);
        this.c = "performanceSpan";
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
        cVar.q("tag");
        cVar.z(this.c);
        cVar.q("payload");
        cVar.j();
        if (this.d != null) {
            cVar.q("op");
            cVar.z(this.d);
        }
        if (this.e != null) {
            cVar.q("description");
            cVar.z(this.e);
        }
        cVar.q("startTimestamp");
        cVar.w(z0Var, BigDecimal.valueOf(this.f));
        cVar.q("endTimestamp");
        cVar.w(z0Var, BigDecimal.valueOf(this.g));
        if (this.v != null) {
            cVar.q("data");
            cVar.w(z0Var, this.v);
        }
        ConcurrentHashMap concurrentHashMap = this.x;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.x, str, cVar, str, z0Var);
            }
        }
        cVar.m();
        ConcurrentHashMap concurrentHashMap2 = this.y;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                io.sentry.e.b(this.y, str2, cVar, str2, z0Var);
            }
        }
        cVar.m();
        HashMap map = this.w;
        if (map != null) {
            for (String str3 : map.keySet()) {
                io.sentry.e.a(this.w, str3, cVar, str3, z0Var);
            }
        }
        cVar.m();
    }
}
