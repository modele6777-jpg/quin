package io.sentry.protocol;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements k2 {
    public Long a;
    public Integer b;
    public String c;
    public String d;
    public Boolean e;
    public Boolean f;
    public Boolean g;
    public Boolean v;
    public c0 w;
    public Map x;
    public ConcurrentHashMap y;

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        if (this.a != null) {
            cVar.q("id");
            cVar.y(this.a);
        }
        if (this.b != null) {
            cVar.q("priority");
            cVar.y(this.b);
        }
        if (this.c != null) {
            cVar.q("name");
            cVar.z(this.c);
        }
        if (this.d != null) {
            cVar.q("state");
            cVar.z(this.d);
        }
        if (this.e != null) {
            cVar.q("crashed");
            cVar.x(this.e);
        }
        if (this.f != null) {
            cVar.q("current");
            cVar.x(this.f);
        }
        if (this.g != null) {
            cVar.q("daemon");
            cVar.x(this.g);
        }
        if (this.v != null) {
            cVar.q("main");
            cVar.x(this.v);
        }
        if (this.w != null) {
            cVar.q("stacktrace");
            cVar.w(z0Var, this.w);
        }
        if (this.x != null) {
            cVar.q("held_locks");
            cVar.w(z0Var, this.x);
        }
        ConcurrentHashMap concurrentHashMap = this.y;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.y, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }
}
