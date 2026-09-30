package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class m1 extends rg7 implements xn2, aw2 {
    public final pv2 d;

    public m1(pv2 pv2Var, boolean z) {
        super(z);
        O((dg7) pv2Var.F0(ndb.Y0));
        this.d = pv2Var.p0(this);
    }

    @Override // defpackage.rg7
    public final void M(fb2 fb2Var) {
        tq.C(this.d, fb2Var);
    }

    @Override // defpackage.rg7
    public final void Y(Object obj) {
        if (!(obj instanceof eb2)) {
            j0(obj);
        } else {
            eb2 eb2Var = (eb2) obj;
            i0(eb2Var.a, ud0.a.getIntVolatile(eb2Var, eb2.b) == 1);
        }
    }

    @Override // defpackage.xn2
    public final void g(Object obj) {
        Throwable thA = ezb.a(obj);
        if (thA != null) {
            obj = new eb2(thA, false);
        }
        Object objS = S(obj);
        if (objS == sg7.b) {
            return;
        }
        r(objS);
    }

    @Override // defpackage.xn2
    public final pv2 getContext() {
        return this.d;
    }

    @Override // defpackage.aw2
    public final pv2 getCoroutineContext() {
        return this.d;
    }

    public final void k0(dw2 dw2Var, m1 m1Var, l26 l26Var) {
        Object objZ;
        int iOrdinal = dw2Var.ordinal();
        wef wefVar = wef.a;
        if (iOrdinal == 0) {
            try {
                aa4.a(k99.D(k99.x(m1Var, this, l26Var)), wefVar);
                return;
            } catch (Throwable th) {
                th = th;
                if (th instanceof y94) {
                    th = ((y94) th).getCause();
                }
                g(jzb.k(th));
                throw th;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                l26Var.getClass();
                k99.D(k99.x(m1Var, this, l26Var)).g(wefVar);
                return;
            }
            if (iOrdinal != 3) {
                ap.c();
                return;
            }
            try {
                pv2 pv2Var = this.d;
                Object objC = dwe.c(pv2Var, null);
                try {
                    if (l26Var instanceof pt0) {
                        z7f.t(2, l26Var);
                        objZ = l26Var.z(m1Var, this);
                    } else {
                        objZ = k99.Q(l26Var, m1Var, this);
                    }
                    dwe.a(pv2Var, objC);
                    if (objZ != bw2.a) {
                        g(objZ);
                    }
                } catch (Throwable th2) {
                    dwe.a(pv2Var, objC);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                if (th instanceof y94) {
                    th = ((y94) th).getCause();
                }
                g(jzb.k(th));
            }
        }
    }

    @Override // defpackage.rg7
    public final String y() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void j0(Object obj) {
    }

    public void i0(Throwable th, boolean z) {
    }
}
