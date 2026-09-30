package io.sentry.protocol;

import io.sentry.d7;
import io.sentry.e7;
import io.sentry.g7;
import io.sentry.h7;
import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import io.sentry.z4;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class z implements k2 {
    public ConcurrentHashMap X;
    public final Double a;
    public final Double b;
    public final w c;
    public final g7 d;
    public final g7 e;
    public final String f;
    public final String g;
    public final h7 v;
    public final String w;
    public final Map x;
    public Map y;
    public final Map z;

    public z(d7 d7Var) {
        ConcurrentHashMap concurrentHashMap = d7Var.k;
        e7 e7Var = d7Var.c;
        this.g = e7Var.f;
        this.f = e7Var.e;
        this.d = e7Var.b;
        this.e = e7Var.c;
        this.c = e7Var.a;
        this.v = e7Var.g;
        this.w = e7Var.w;
        ConcurrentHashMap concurrentHashMapO = io.sentry.util.b.o(e7Var.v);
        this.x = concurrentHashMapO == null ? new ConcurrentHashMap() : concurrentHashMapO;
        ConcurrentHashMap concurrentHashMapO2 = io.sentry.util.b.o(d7Var.l);
        this.z = concurrentHashMapO2 == null ? new ConcurrentHashMap() : concurrentHashMapO2;
        z4 z4Var = d7Var.b;
        this.b = z4Var == null ? null : Double.valueOf(d7Var.a.c(z4Var) / 1.0E9d);
        this.a = Double.valueOf(d7Var.a.d() / 1.0E9d);
        this.y = concurrentHashMap;
        e7Var.Y.j();
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        cVar.q("start_timestamp");
        cVar.w(z0Var, io.sentry.config.a.g(this.a.doubleValue()));
        Double d = this.b;
        if (d != null) {
            cVar.q("timestamp");
            cVar.w(z0Var, io.sentry.config.a.g(d.doubleValue()));
        }
        cVar.q("trace_id");
        cVar.w(z0Var, this.c);
        cVar.q("span_id");
        cVar.w(z0Var, this.d);
        g7 g7Var = this.e;
        if (g7Var != null) {
            cVar.q("parent_span_id");
            cVar.w(z0Var, g7Var);
        }
        cVar.q("op");
        cVar.z(this.f);
        String str = this.g;
        if (str != null) {
            cVar.q("description");
            cVar.z(str);
        }
        h7 h7Var = this.v;
        if (h7Var != null) {
            cVar.q("status");
            cVar.w(z0Var, h7Var);
        }
        String str2 = this.w;
        if (str2 != null) {
            cVar.q("origin");
            cVar.w(z0Var, str2);
        }
        Map map = this.x;
        if (!map.isEmpty()) {
            cVar.q("tags");
            cVar.w(z0Var, map);
        }
        if (this.y != null) {
            cVar.q("data");
            cVar.w(z0Var, this.y);
        }
        Map map2 = this.z;
        if (!map2.isEmpty()) {
            cVar.q("measurements");
            cVar.w(z0Var, map2);
        }
        ConcurrentHashMap concurrentHashMap = this.X;
        if (concurrentHashMap != null) {
            for (String str3 : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.X, str3, cVar, str3, z0Var);
            }
        }
        cVar.m();
    }

    public z(Double d, Double d2, w wVar, g7 g7Var, g7 g7Var2, String str, String str2, h7 h7Var, String str3, Map map, Map map2, Map map3) {
        this.a = d;
        this.b = d2;
        this.c = wVar;
        this.d = g7Var;
        this.e = g7Var2;
        this.f = str;
        this.g = str2;
        this.v = h7Var;
        this.w = str3;
        this.x = map;
        this.z = map2;
        this.y = map3;
    }
}
