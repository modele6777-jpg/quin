package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nkd extends m4 {
    public Object c;
    public Object d;
    public x79 e;
    public x79 f;
    public qxc g;
    public final ckb v;
    public final hrd w;

    public nkd() {
        super(5);
        this.v = new ckb(26, this);
        z8d z8dVar = new z8d(3, this);
        qrd.b(qrd.a);
        synchronized (qrd.c) {
            qrd.h = s72.R0(qrd.h, z8dVar);
        }
        this.w = new hrd(z8dVar);
    }

    @Override // defpackage.m4
    public final void n0(qxc qxcVar) {
        this.d = null;
        this.f = null;
    }

    @Override // defpackage.m4
    public final void o0() {
        synchronized (this.b) {
            try {
                this.c = this.d;
                if (this.f == null) {
                    this.e = null;
                } else {
                    x79 x79Var = this.e;
                    if (x79Var == null) {
                        x79 x79Var2 = mec.a;
                        x79Var = new x79();
                        this.e = x79Var;
                    }
                    this.e = this.f;
                    this.f = x79Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.m4
    public final void p0() {
        this.w.a();
        this.d = null;
        this.f = null;
        synchronized (this.b) {
            this.g = null;
            this.c = null;
            this.e = null;
        }
    }

    @Override // defpackage.m4
    public final a26 t0(qxc qxcVar) {
        qxc qxcVar2 = this.g;
        if (qxcVar2 != null && !qxcVar2.equals(qxcVar)) {
            epa.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.g = qxcVar;
        return this.v;
    }

    @Override // defpackage.m4
    public final void u0(yv1 yv1Var) {
        this.g = null;
        this.d = null;
        this.f = null;
        o0();
    }
}
