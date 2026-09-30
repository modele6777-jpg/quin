package io.sentry;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class s6 extends v4 implements k2 {
    public File E0;
    public int I0;
    public Date K0;
    public HashMap P0;
    public io.sentry.protocol.w H0 = new io.sentry.protocol.w();
    public String F0 = "replay_event";
    public r6 G0 = r6.SESSION;
    public List M0 = new ArrayList();
    public List N0 = new ArrayList();
    public List O0 = new ArrayList();
    public List L0 = new ArrayList();
    public Date J0 = new Date();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s6.class != obj.getClass()) {
            return false;
        }
        s6 s6Var = (s6) obj;
        return this.I0 == s6Var.I0 && io.sentry.util.b.i(this.F0, s6Var.F0) && this.G0 == s6Var.G0 && io.sentry.util.b.i(this.H0, s6Var.H0) && io.sentry.util.b.i(this.L0, s6Var.L0) && io.sentry.util.b.i(this.M0, s6Var.M0) && io.sentry.util.b.i(this.N0, s6Var.N0) && io.sentry.util.b.i(this.O0, s6Var.O0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.F0, this.G0, this.H0, Integer.valueOf(this.I0), this.L0, this.M0, this.N0, this.O0});
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        cVar.q("type");
        cVar.z(this.F0);
        cVar.q("replay_type");
        cVar.w(z0Var, this.G0);
        cVar.q("segment_id");
        cVar.v(this.I0);
        cVar.q("timestamp");
        cVar.w(z0Var, this.J0);
        if (this.H0 != null) {
            cVar.q("replay_id");
            cVar.w(z0Var, this.H0);
        }
        if (this.K0 != null) {
            cVar.q("replay_start_timestamp");
            cVar.w(z0Var, this.K0);
        }
        if (this.L0 != null) {
            cVar.q("urls");
            cVar.w(z0Var, this.L0);
        }
        if (this.M0 != null) {
            cVar.q("error_ids");
            cVar.w(z0Var, this.M0);
        }
        if (this.N0 != null) {
            cVar.q("trace_ids");
            cVar.w(z0Var, this.N0);
        }
        if (this.O0 != null) {
            cVar.q("segment_names");
            cVar.w(z0Var, this.O0);
        }
        io.sentry.config.a.w(this, cVar, z0Var);
        HashMap map = this.P0;
        if (map != null) {
            for (String str : map.keySet()) {
                e.a(this.P0, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }
}
