package io.sentry;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class v6 implements f0 {
    public final String a;
    public final String b;

    public v6() {
        String property = System.getProperty("java.version");
        String property2 = System.getProperty("java.vendor");
        this.a = property;
        this.b = property2;
    }

    public final void a(v4 v4Var) {
        io.sentry.protocol.e eVar = v4Var.b;
        if (eVar.i() == null) {
            eVar.u(new io.sentry.protocol.y());
        }
        io.sentry.protocol.y yVarI = eVar.i();
        if (yVarI != null && yVarI.a == null && yVarI.b == null) {
            yVarI.a = this.b;
            yVarI.b = this.a;
        }
    }

    @Override // io.sentry.f0
    public final i5 h(i5 i5Var, l0 l0Var) {
        a(i5Var);
        return i5Var;
    }

    @Override // io.sentry.f0
    public final io.sentry.protocol.f0 l(io.sentry.protocol.f0 f0Var, l0 l0Var) {
        a(f0Var);
        return f0Var;
    }
}
