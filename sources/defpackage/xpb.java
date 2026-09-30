package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xpb implements aw2, vpb {
    public static final ul1 d = new ul1(0);
    public final pv2 a;
    public final xpb b = this;
    public volatile pv2 c;

    public xpb(pv2 pv2Var) {
        this.a = pv2Var;
    }

    @Override // defpackage.vpb
    public final void a() {
        b();
    }

    public final void b() {
        synchronized (this.b) {
            try {
                pv2 pv2Var = this.c;
                if (pv2Var == null) {
                    this.c = d;
                } else {
                    tq.n(pv2Var, new nr5());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.vpb
    public final void c() {
        b();
    }

    @Override // defpackage.aw2
    public final pv2 getCoroutineContext() {
        pv2 pv2VarP0;
        pv2 pv2Var = this.c;
        if (pv2Var == null || pv2Var == d) {
            og2 og2Var = (og2) this.a.F0(og2.b);
            pv2 wpbVar = og2Var != null ? new wpb(og2Var, this) : nu4.a;
            synchronized (this.b) {
                try {
                    pv2 pv2Var2 = this.c;
                    if (pv2Var2 == null) {
                        pv2 pv2Var3 = this.a;
                        pv2VarP0 = pv2Var3.p0(new fg7((dg7) pv2Var3.F0(ndb.Y0))).p0(nu4.a).p0(wpbVar);
                    } else if (pv2Var2 == d) {
                        pv2 pv2Var4 = this.a;
                        fg7 fg7Var = new fg7((dg7) pv2Var4.F0(ndb.Y0));
                        fg7Var.t(new nr5());
                        pv2VarP0 = pv2Var4.p0(fg7Var).p0(nu4.a).p0(wpbVar);
                    } else {
                        pv2VarP0 = pv2Var2;
                    }
                    this.c = pv2VarP0;
                } catch (Throwable th) {
                    throw th;
                }
            }
            pv2Var = pv2VarP0;
        }
        pv2Var.getClass();
        return pv2Var;
    }

    @Override // defpackage.vpb
    public final void d() {
    }
}
