package io.sentry.protocol;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements k2 {
    public List X;
    public ConcurrentHashMap Y;
    public String a;
    public Date b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public AbstractMap v;
    public List w;
    public String x;
    public Boolean y;
    public Boolean z;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return io.sentry.util.b.i(this.a, aVar.a) && io.sentry.util.b.i(this.b, aVar.b) && io.sentry.util.b.i(this.c, aVar.c) && io.sentry.util.b.i(this.d, aVar.d) && io.sentry.util.b.i(this.e, aVar.e) && io.sentry.util.b.i(this.f, aVar.f) && io.sentry.util.b.i(this.g, aVar.g) && io.sentry.util.b.i(this.v, aVar.v) && io.sentry.util.b.i(this.y, aVar.y) && io.sentry.util.b.i(this.w, aVar.w) && io.sentry.util.b.i(this.x, aVar.x) && io.sentry.util.b.i(this.z, aVar.z) && io.sentry.util.b.i(this.X, aVar.X);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.y, this.w, this.x, this.z, this.X});
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        if (this.a != null) {
            cVar.q("app_identifier");
            cVar.z(this.a);
        }
        if (this.b != null) {
            cVar.q("app_start_time");
            cVar.w(z0Var, this.b);
        }
        if (this.c != null) {
            cVar.q("device_app_hash");
            cVar.z(this.c);
        }
        if (this.d != null) {
            cVar.q("build_type");
            cVar.z(this.d);
        }
        if (this.e != null) {
            cVar.q("app_name");
            cVar.z(this.e);
        }
        if (this.f != null) {
            cVar.q("app_version");
            cVar.z(this.f);
        }
        if (this.g != null) {
            cVar.q("app_build");
            cVar.z(this.g);
        }
        AbstractMap abstractMap = this.v;
        if (abstractMap != null && !abstractMap.isEmpty()) {
            cVar.q("permissions");
            cVar.w(z0Var, this.v);
        }
        if (this.y != null) {
            cVar.q("in_foreground");
            cVar.x(this.y);
        }
        if (this.w != null) {
            cVar.q("view_names");
            cVar.w(z0Var, this.w);
        }
        if (this.x != null) {
            cVar.q("start_type");
            cVar.z(this.x);
        }
        if (this.z != null) {
            cVar.q("is_split_apks");
            cVar.x(this.z);
        }
        List list = this.X;
        if (list != null && !list.isEmpty()) {
            cVar.q("split_names");
            cVar.w(z0Var, this.X);
        }
        ConcurrentHashMap concurrentHashMap = this.Y;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.Y, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }
}
