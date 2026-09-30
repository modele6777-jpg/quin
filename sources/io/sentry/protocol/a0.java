package io.sentry.protocol;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.r5;
import io.sentry.z0;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements k2 {
    public String E0;
    public String F0;
    public String G0;
    public String H0;
    public ConcurrentHashMap I0;
    public String J0;
    public r5 K0;
    public Boolean X;
    public String Y;
    public String Z;
    public List a;
    public List b;
    public Map c;
    public String d;
    public String e;
    public String f;
    public Integer g;
    public Integer v;
    public String w;
    public String x;
    public Boolean y;
    public String z;

    public final boolean equals(Object obj) {
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Objects.equals(this.a, a0Var.a) && Objects.equals(this.b, a0Var.b) && Objects.equals(this.c, a0Var.c) && Objects.equals(this.d, a0Var.d) && Objects.equals(this.e, a0Var.e) && Objects.equals(this.f, a0Var.f) && Objects.equals(this.g, a0Var.g) && Objects.equals(this.v, a0Var.v) && Objects.equals(this.w, a0Var.w) && Objects.equals(this.x, a0Var.x) && Objects.equals(this.y, a0Var.y) && Objects.equals(this.z, a0Var.z) && Objects.equals(this.X, a0Var.X) && Objects.equals(this.Y, a0Var.Y) && Objects.equals(this.Z, a0Var.Z) && Objects.equals(this.E0, a0Var.E0) && Objects.equals(this.F0, a0Var.F0) && Objects.equals(this.G0, a0Var.G0) && Objects.equals(this.H0, a0Var.H0) && Objects.equals(this.I0, a0Var.I0) && Objects.equals(this.J0, a0Var.J0) && Objects.equals(this.K0, a0Var.K0);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, null, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, this.z, this.X, this.Y, this.Z, this.E0, this.F0, this.G0, this.H0, this.I0, this.J0, this.K0);
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        if (this.d != null) {
            cVar.q("filename");
            cVar.z(this.d);
        }
        if (this.e != null) {
            cVar.q("function");
            cVar.z(this.e);
        }
        if (this.f != null) {
            cVar.q("module");
            cVar.z(this.f);
        }
        if (this.g != null) {
            cVar.q("lineno");
            cVar.y(this.g);
        }
        if (this.v != null) {
            cVar.q("colno");
            cVar.y(this.v);
        }
        if (this.w != null) {
            cVar.q("abs_path");
            cVar.z(this.w);
        }
        if (this.x != null) {
            cVar.q("context_line");
            cVar.z(this.x);
        }
        if (this.y != null) {
            cVar.q("in_app");
            cVar.x(this.y);
        }
        if (this.z != null) {
            cVar.q("package");
            cVar.z(this.z);
        }
        if (this.X != null) {
            cVar.q("native");
            cVar.x(this.X);
        }
        if (this.Y != null) {
            cVar.q("platform");
            cVar.z(this.Y);
        }
        if (this.Z != null) {
            cVar.q("image_addr");
            cVar.z(this.Z);
        }
        if (this.E0 != null) {
            cVar.q("symbol_addr");
            cVar.z(this.E0);
        }
        if (this.F0 != null) {
            cVar.q("instruction_addr");
            cVar.z(this.F0);
        }
        if (this.G0 != null) {
            cVar.q("addr_mode");
            cVar.z(this.G0);
        }
        if (this.J0 != null) {
            cVar.q("raw_function");
            cVar.z(this.J0);
        }
        if (this.H0 != null) {
            cVar.q("symbol");
            cVar.z(this.H0);
        }
        if (this.K0 != null) {
            cVar.q("lock");
            cVar.w(z0Var, this.K0);
        }
        List list = this.a;
        if (list != null && !list.isEmpty()) {
            cVar.q("pre_context");
            cVar.w(z0Var, this.a);
        }
        List list2 = this.b;
        if (list2 != null && !list2.isEmpty()) {
            cVar.q("post_context");
            cVar.w(z0Var, this.b);
        }
        Map map = this.c;
        if (map != null && !map.isEmpty()) {
            cVar.q("vars");
            cVar.w(z0Var, this.c);
        }
        ConcurrentHashMap concurrentHashMap = this.I0;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.I0, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }
}
