package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class su7 implements vpb, tv2 {
    public final pv2 a;
    public final l26 b;
    public final qn2 c;
    public lyd d;

    public su7(pv2 pv2Var, l26 l26Var) {
        this.a = pv2Var;
        this.b = l26Var;
        this.c = jgb.k(pv2Var.p0(this));
    }

    @Override // defpackage.pv2
    public final nv2 F0(ov2 ov2Var) {
        return i7h.s(this, ov2Var);
    }

    @Override // defpackage.tv2
    public final void G(pv2 pv2Var, Throwable th) throws Throwable {
        og2 og2Var = (og2) pv2Var.F0(og2.b);
        if (og2Var != null) {
            xo1.S(th, new ad1(7, og2Var, this));
        }
        tv2 tv2Var = (tv2) this.a.F0(qk6.w);
        if (tv2Var == null) {
            throw th;
        }
        tv2Var.G(pv2Var, th);
    }

    @Override // defpackage.pv2
    public final pv2 U(ov2 ov2Var) {
        return i7h.E(this, ov2Var);
    }

    @Override // defpackage.pv2
    public final Object V0(l26 l26Var, Object obj) {
        return l26Var.z(obj, this);
    }

    @Override // defpackage.vpb
    public final void a() {
        lyd lydVar = this.d;
        if (lydVar != null) {
            lydVar.v(new e28());
        }
        this.d = null;
    }

    @Override // defpackage.vpb
    public final void c() {
        lyd lydVar = this.d;
        if (lydVar != null) {
            lydVar.v(new e28());
        }
        this.d = null;
    }

    @Override // defpackage.vpb
    public final void d() {
        lyd lydVar = this.d;
        if (lydVar != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            lydVar.h(cancellationException);
        }
        this.d = ynb.V(this.c, null, null, this.b, 3);
    }

    @Override // defpackage.nv2
    public final ov2 getKey() {
        return qk6.w;
    }

    @Override // defpackage.pv2
    public final pv2 p0(pv2 pv2Var) {
        return i7h.I(this, pv2Var);
    }
}
