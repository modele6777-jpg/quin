package io.sentry;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i5 extends v4 implements k2 {
    public Date E0;
    public io.sentry.protocol.p F0;
    public String G0;
    public h2 H0;
    public h2 I0;
    public q5 J0;
    public String K0;
    public List L0;
    public ConcurrentHashMap M0;
    public AbstractMap N0;

    public i5() {
        io.sentry.protocol.w wVar = new io.sentry.protocol.w();
        Date date = new Date();
        super(wVar);
        this.E0 = date;
    }

    public final ArrayList d() {
        h2 h2Var = this.I0;
        if (h2Var == null) {
            return null;
        }
        return h2Var.a;
    }

    public final ArrayList e() {
        h2 h2Var = this.H0;
        if (h2Var != null) {
            return h2Var.a;
        }
        return null;
    }

    public final io.sentry.protocol.v f() {
        Boolean bool;
        h2 h2Var = this.I0;
        if (h2Var == null) {
            return null;
        }
        for (io.sentry.protocol.v vVar : h2Var.a) {
            io.sentry.protocol.o oVar = vVar.f;
            if (oVar != null && (bool = oVar.d) != null && !bool.booleanValue()) {
                return vVar;
            }
        }
        return null;
    }

    public final boolean g() {
        h2 h2Var = this.I0;
        return (h2Var == null || h2Var.a.isEmpty()) ? false : true;
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        cVar.q("timestamp");
        cVar.w(z0Var, this.E0);
        if (this.F0 != null) {
            cVar.q("message");
            cVar.w(z0Var, this.F0);
        }
        if (this.G0 != null) {
            cVar.q("logger");
            cVar.z(this.G0);
        }
        h2 h2Var = this.H0;
        if (h2Var != null && !h2Var.a.isEmpty()) {
            cVar.q("threads");
            cVar.j();
            cVar.q("values");
            cVar.w(z0Var, this.H0.a);
            cVar.m();
        }
        h2 h2Var2 = this.I0;
        if (h2Var2 != null && !h2Var2.a.isEmpty()) {
            cVar.q("exception");
            cVar.j();
            cVar.q("values");
            cVar.w(z0Var, this.I0.a);
            cVar.m();
        }
        if (this.J0 != null) {
            cVar.q("level");
            cVar.w(z0Var, this.J0);
        }
        if (this.K0 != null) {
            cVar.q("transaction");
            cVar.z(this.K0);
        }
        if (this.L0 != null) {
            cVar.q("fingerprint");
            cVar.w(z0Var, this.L0);
        }
        if (this.N0 != null) {
            cVar.q("modules");
            cVar.w(z0Var, this.N0);
        }
        io.sentry.config.a.w(this, cVar, z0Var);
        ConcurrentHashMap concurrentHashMap = this.M0;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                e.b(this.M0, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }

    public i5(Exception exc) {
        this();
        this.x = exc;
    }
}
