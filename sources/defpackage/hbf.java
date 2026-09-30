package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hbf extends pfc {
    public final ThreadLocal f;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public hbf(xn2 xn2Var, pv2 pv2Var) {
        ul1 ul1Var = ul1.d;
        super(xn2Var, pv2Var.F0(ul1Var) == null ? pv2Var.p0(ul1Var) : pv2Var);
        this.f = new ThreadLocal();
        if (xn2Var.getContext().F0(hj6.Z) instanceof sv2) {
            return;
        }
        Object objC = dwe.c(pv2Var, null);
        dwe.a(pv2Var, objC);
        o0(pv2Var, objC);
    }

    @Override // defpackage.pfc
    public final void l0() {
        n0();
    }

    public final boolean m0() {
        boolean z = this.threadLocalIsSet && this.f.get() == null;
        this.f.remove();
        return !z;
    }

    public final void n0() {
        if (this.threadLocalIsSet) {
            iy9 iy9Var = (iy9) this.f.get();
            if (iy9Var != null) {
                dwe.a((pv2) iy9Var.a(), iy9Var.b());
            }
            this.f.remove();
        }
    }

    public final void o0(pv2 pv2Var, Object obj) {
        this.threadLocalIsSet = true;
        this.f.set(new iy9(pv2Var, obj));
    }

    @Override // defpackage.pfc, defpackage.rg7
    public final void r(Object obj) {
        n0();
        Object objG = vfh.G(obj);
        xn2 xn2Var = this.e;
        pv2 context = xn2Var.getContext();
        Object objC = dwe.c(context, null);
        hbf hbfVarS = objC != dwe.a ? y7h.S(xn2Var, context, objC) : null;
        try {
            xn2Var.g(objG);
        } finally {
            if (hbfVarS == null || hbfVarS.m0()) {
                dwe.a(context, objC);
            }
        }
    }
}
