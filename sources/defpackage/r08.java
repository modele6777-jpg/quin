package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r08 extends i09 implements wwc {
    public k08 E0;
    public ks9 F0;
    public boolean G0;
    public rgc H0;
    public final o08 I0 = new o08(this, 0);
    public o08 J0;
    public x16 Z;

    public r08(x16 x16Var, k08 k08Var, ks9 ks9Var, boolean z) {
        this.Z = x16Var;
        this.E0 = k08Var;
        this.F0 = ks9Var;
        this.G0 = z;
        l1();
    }

    @Override // defpackage.wwc
    public final void R0(hxc hxcVar) {
        exc.p(hxcVar);
        hxcVar.c(cxc.P, this.I0);
        ks9 ks9Var = this.F0;
        rgc rgcVar = this.H0;
        if (ks9Var == ks9.a) {
            if (rgcVar == null) {
                pa7.g0("scrollAxisRange");
                throw null;
            }
            gxc gxcVar = cxc.w;
            wn7 wn7Var = exc.a[13];
            gxcVar.getClass();
            hxcVar.c(gxcVar, rgcVar);
        } else {
            if (rgcVar == null) {
                pa7.g0("scrollAxisRange");
                throw null;
            }
            exc.i(hxcVar, rgcVar);
        }
        o08 o08Var = this.J0;
        if (o08Var != null) {
            hxcVar.c(swc.f, new f6(null, o08Var));
        }
        hxcVar.c(swc.C, new f6(null, new ckb(18, new p08(this, 2))));
        Object objE = this.E0.e();
        gxc gxcVar2 = cxc.f;
        wn7 wn7Var2 = exc.a[24];
        gxcVar2.getClass();
        hxcVar.c(gxcVar2, objE);
    }

    @Override // defpackage.i09
    public final boolean a1() {
        return false;
    }

    public final void l1() {
        this.H0 = new rgc(new p08(this, 0), new p08(this, 1));
        this.J0 = this.G0 ? new o08(this, 1) : null;
    }
}
