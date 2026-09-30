package io.sentry.rrweb;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.q5;
import io.sentry.z0;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends b implements k2 {
    public String c;
    public double d;
    public String e;
    public String f;
    public String g;
    public q5 v;
    public ConcurrentHashMap w;
    public HashMap x;
    public ConcurrentHashMap y;
    public ConcurrentHashMap z;

    public a() {
        super(c.Custom);
        this.c = "breadcrumb";
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
        if (this.e != null) {
            cVar.q("type");
            cVar.z(this.e);
        }
        cVar.q("timestamp");
        cVar.w(z0Var, BigDecimal.valueOf(this.d));
        if (this.f != null) {
            cVar.q("category");
            cVar.z(this.f);
        }
        if (this.g != null) {
            cVar.q("message");
            cVar.z(this.g);
        }
        if (this.v != null) {
            cVar.q("level");
            cVar.w(z0Var, this.v);
        }
        if (this.w != null) {
            cVar.q("data");
            cVar.w(z0Var, this.w);
        }
        ConcurrentHashMap concurrentHashMap = this.y;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.y, str, cVar, str, z0Var);
            }
        }
        cVar.m();
        ConcurrentHashMap concurrentHashMap2 = this.z;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                io.sentry.e.b(this.z, str2, cVar, str2, z0Var);
            }
        }
        cVar.m();
        HashMap map = this.x;
        if (map != null) {
            for (String str3 : map.keySet()) {
                io.sentry.e.a(this.x, str3, cVar, str3, z0Var);
            }
        }
        cVar.m();
    }
}
