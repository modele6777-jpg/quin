package io.sentry.protocol;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements k2 {
    public Boolean E0;
    public Long F0;
    public Long G0;
    public Long H0;
    public Long I0;
    public Integer J0;
    public Integer K0;
    public Float L0;
    public Integer M0;
    public Date N0;
    public TimeZone O0;
    public String P0;
    public String Q0;
    public String R0;
    public Float S0;
    public Integer T0;
    public Double U0;
    public String V0;
    public String W0;
    public Long X;
    public ConcurrentHashMap X0;
    public Long Y;
    public Long Z;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String[] g;
    public Float v;
    public Boolean w;
    public Boolean x;
    public g y;
    public Boolean z;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (io.sentry.util.b.i(this.a, hVar.a) && io.sentry.util.b.i(this.b, hVar.b) && io.sentry.util.b.i(this.c, hVar.c) && io.sentry.util.b.i(this.d, hVar.d) && io.sentry.util.b.i(this.e, hVar.e) && io.sentry.util.b.i(this.f, hVar.f) && Arrays.equals(this.g, hVar.g) && io.sentry.util.b.i(this.v, hVar.v) && io.sentry.util.b.i(this.w, hVar.w) && io.sentry.util.b.i(this.x, hVar.x) && this.y == hVar.y && io.sentry.util.b.i(this.z, hVar.z) && io.sentry.util.b.i(this.X, hVar.X) && io.sentry.util.b.i(this.Y, hVar.Y) && io.sentry.util.b.i(this.Z, hVar.Z) && io.sentry.util.b.i(this.E0, hVar.E0) && io.sentry.util.b.i(this.F0, hVar.F0) && io.sentry.util.b.i(this.G0, hVar.G0) && io.sentry.util.b.i(this.H0, hVar.H0) && io.sentry.util.b.i(this.I0, hVar.I0) && io.sentry.util.b.i(this.J0, hVar.J0) && io.sentry.util.b.i(this.K0, hVar.K0) && io.sentry.util.b.i(this.L0, hVar.L0) && io.sentry.util.b.i(this.M0, hVar.M0) && io.sentry.util.b.i(this.N0, hVar.N0) && io.sentry.util.b.i(this.P0, hVar.P0) && io.sentry.util.b.i(this.Q0, hVar.Q0) && io.sentry.util.b.i(this.R0, hVar.R0) && io.sentry.util.b.i(this.S0, hVar.S0) && io.sentry.util.b.i(this.T0, hVar.T0) && io.sentry.util.b.i(this.U0, hVar.U0) && io.sentry.util.b.i(this.V0, hVar.V0) && io.sentry.util.b.i(this.W0, hVar.W0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.v, this.w, this.x, this.y, this.z, this.X, this.Y, this.Z, this.E0, this.F0, this.G0, this.H0, this.I0, this.J0, this.K0, this.L0, this.M0, this.N0, this.O0, this.P0, this.Q0, this.R0, this.S0, this.T0, this.U0, this.V0, this.W0}) * 31) + Arrays.hashCode(this.g);
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        if (this.a != null) {
            cVar.q("name");
            cVar.z(this.a);
        }
        if (this.b != null) {
            cVar.q("manufacturer");
            cVar.z(this.b);
        }
        if (this.c != null) {
            cVar.q("brand");
            cVar.z(this.c);
        }
        if (this.d != null) {
            cVar.q("family");
            cVar.z(this.d);
        }
        if (this.e != null) {
            cVar.q("model");
            cVar.z(this.e);
        }
        if (this.f != null) {
            cVar.q("model_id");
            cVar.z(this.f);
        }
        if (this.g != null) {
            cVar.q("archs");
            cVar.w(z0Var, this.g);
        }
        if (this.v != null) {
            cVar.q("battery_level");
            cVar.y(this.v);
        }
        if (this.w != null) {
            cVar.q("charging");
            cVar.x(this.w);
        }
        if (this.x != null) {
            cVar.q("online");
            cVar.x(this.x);
        }
        if (this.y != null) {
            cVar.q("orientation");
            cVar.w(z0Var, this.y);
        }
        if (this.z != null) {
            cVar.q("simulator");
            cVar.x(this.z);
        }
        if (this.X != null) {
            cVar.q("memory_size");
            cVar.y(this.X);
        }
        if (this.Y != null) {
            cVar.q("free_memory");
            cVar.y(this.Y);
        }
        if (this.Z != null) {
            cVar.q("usable_memory");
            cVar.y(this.Z);
        }
        if (this.E0 != null) {
            cVar.q("low_memory");
            cVar.x(this.E0);
        }
        if (this.F0 != null) {
            cVar.q("storage_size");
            cVar.y(this.F0);
        }
        if (this.G0 != null) {
            cVar.q("free_storage");
            cVar.y(this.G0);
        }
        if (this.H0 != null) {
            cVar.q("external_storage_size");
            cVar.y(this.H0);
        }
        if (this.I0 != null) {
            cVar.q("external_free_storage");
            cVar.y(this.I0);
        }
        if (this.J0 != null) {
            cVar.q("screen_width_pixels");
            cVar.y(this.J0);
        }
        if (this.K0 != null) {
            cVar.q("screen_height_pixels");
            cVar.y(this.K0);
        }
        if (this.L0 != null) {
            cVar.q("screen_density");
            cVar.y(this.L0);
        }
        if (this.M0 != null) {
            cVar.q("screen_dpi");
            cVar.y(this.M0);
        }
        if (this.N0 != null) {
            cVar.q("boot_time");
            cVar.w(z0Var, this.N0);
        }
        if (this.O0 != null) {
            cVar.q("timezone");
            cVar.w(z0Var, this.O0);
        }
        if (this.P0 != null) {
            cVar.q("id");
            cVar.z(this.P0);
        }
        if (this.R0 != null) {
            cVar.q("connection_type");
            cVar.z(this.R0);
        }
        if (this.S0 != null) {
            cVar.q("battery_temperature");
            cVar.y(this.S0);
        }
        if (this.Q0 != null) {
            cVar.q("locale");
            cVar.z(this.Q0);
        }
        if (this.T0 != null) {
            cVar.q("processor_count");
            cVar.y(this.T0);
        }
        if (this.U0 != null) {
            cVar.q("processor_frequency");
            cVar.y(this.U0);
        }
        if (this.V0 != null) {
            cVar.q("cpu_description");
            cVar.z(this.V0);
        }
        if (this.W0 != null) {
            cVar.q("chipset");
            cVar.z(this.W0);
        }
        ConcurrentHashMap concurrentHashMap = this.X0;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.X0, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }
}
