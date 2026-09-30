package io.sentry;

import com.google.firebase.crashlytics.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class r3 implements k2 {
    public io.sentry.protocol.profiling.a Y;
    public ConcurrentHashMap Z;
    public io.sentry.protocol.w b;
    public io.sentry.protocol.w c;
    public io.sentry.protocol.u d;
    public final AbstractMap e;
    public String f;
    public String g;
    public String v;
    public String w;
    public double x;
    public String y;
    public final File z;
    public String X = null;
    public io.sentry.protocol.f a = null;

    public r3(io.sentry.protocol.w wVar, io.sentry.protocol.w wVar2, File file, AbstractMap abstractMap, Double d, q6 q6Var) {
        this.b = wVar;
        this.c = wVar2;
        this.z = file;
        this.e = abstractMap;
        this.d = q6Var.getSdkVersion();
        this.g = q6Var.getRelease() != null ? q6Var.getRelease() : "";
        this.v = q6Var.getEnvironment();
        this.f = "android";
        this.w = "2";
        this.x = d.doubleValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3)) {
            return false;
        }
        r3 r3Var = (r3) obj;
        return this.a == r3Var.a && Objects.equals(this.b, r3Var.b) && Objects.equals(this.c, r3Var.c) && Objects.equals(this.d, r3Var.d) && this.e.equals(r3Var.e) && Objects.equals(this.f, r3Var.f) && Objects.equals(this.g, r3Var.g) && Objects.equals(this.v, r3Var.v) && Objects.equals(this.w, r3Var.w) && Objects.equals(this.X, r3Var.X) && Objects.equals(this.Z, r3Var.Z) && this.Y == r3Var.Y;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.X, this.Y, this.Z);
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        if (this.a != null) {
            cVar.q("debug_meta");
            cVar.w(z0Var, this.a);
        }
        cVar.q("profiler_id");
        cVar.w(z0Var, this.b);
        cVar.q("chunk_id");
        cVar.w(z0Var, this.c);
        if (this.d != null) {
            cVar.q("client_sdk");
            cVar.w(z0Var, this.d);
        }
        AbstractMap abstractMap = this.e;
        if (!abstractMap.isEmpty()) {
            String str = ((io.sentry.vendor.gson.stream.c) cVar.b).d;
            cVar.t("");
            cVar.q("measurements");
            cVar.w(z0Var, abstractMap);
            cVar.t(str);
        }
        cVar.q("platform");
        cVar.w(z0Var, this.f);
        cVar.q(BuildConfig.BUILD_TYPE);
        cVar.w(z0Var, this.g);
        if (this.v != null) {
            cVar.q("environment");
            cVar.w(z0Var, this.v);
        }
        cVar.q("version");
        cVar.w(z0Var, this.w);
        if (this.y != null) {
            cVar.q("content_type");
            cVar.w(z0Var, this.y);
        }
        if (this.X != null) {
            cVar.q("sampled_profile");
            cVar.w(z0Var, this.X);
        }
        cVar.q("timestamp");
        cVar.w(z0Var, io.sentry.config.a.g(this.x));
        if (this.Y != null) {
            cVar.q("profile");
            cVar.w(z0Var, this.Y);
        }
        ConcurrentHashMap concurrentHashMap = this.Z;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                e.b(this.Z, str2, cVar, str2, z0Var);
            }
        }
        cVar.m();
    }
}
