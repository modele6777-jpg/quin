package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tbd extends i09 implements pn4, p09, al9, ug2, kv7 {
    public a00 E0;
    public hkb F0;
    public boolean G0;
    public icd H0;
    public final dkd I0;
    public hkb Z;

    public tbd(icd icdVar) {
        this.H0 = icdVar;
        iy9 iy9Var = new iy9(vbd.a, icdVar);
        dkd dkdVar = new dkd((c1b) iy9Var.d());
        dkdVar.i0((c1b) iy9Var.d(), iy9Var.e());
        this.I0 = dkdVar;
    }

    @Override // defpackage.al9
    public final void A0() {
        this.H0.f().f();
        if9.C(this, this.H0.f().i);
    }

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        cea ceaVarV = tn8Var.v(j);
        return zn8Var.n0(ceaVarV.a, ceaVarV.b, qu4.a, new sbd(ceaVarV, this));
    }

    @Override // defpackage.i09
    public final void d1() {
        if9.C(this, this.H0.f().i);
        p1();
        this.H0.a.setValue(Boolean.TRUE);
    }

    @Override // defpackage.p09
    public final x57 e0() {
        return this.I0;
    }

    @Override // defpackage.i09
    public final void e1() {
        bv7 bv7Var = this.H0.f().b.e;
        if (bv7Var != null) {
            this.F0 = (bv7Var.h() && this.G0) ? z5c.g(hl9.f(vd0.r0(this).N(0L), bv7Var.N(0L)), db6.Y0(vd0.r0(this).c)) : null;
        }
        o1(null);
        icd icdVar = this.H0;
        if (!pa7.t(icdVar.z, null)) {
            icdVar.z = null;
            sz9 sz9Var = icdVar.f().b.g;
            sz9Var.k(sz9Var.j() + 1);
        }
        icd icdVar2 = this.H0;
        icdVar2.X = null;
        icdVar2.a.setValue(Boolean.FALSE);
        this.G0 = false;
    }

    @Override // defpackage.i09
    public final void f1() {
        this.F0 = null;
        o1(null);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0014  */
    public final yn8 l1(fc0 fc0Var, tn8 tn8Var, long j) {
        hkb hkbVarC;
        int i;
        long j2;
        char c;
        int i2;
        bv7 bv7Var;
        long jH;
        long jL;
        if (this.H0.f().c.e().e() == null || (hkbVarC = this.H0.f().c.e().c()) == null) {
            i = 1;
            j2 = 4294967295L;
            c = ' ';
            i2 = 0;
        } else {
            float f = hkbVarC.b;
            float f2 = hkbVarC.d;
            float f3 = hkbVarC.a;
            float f4 = hkbVarC.c;
            scd scdVarB = this.H0.b();
            if (scdVarB == null || !scdVarB.c()) {
                i = 1;
                j2 = 4294967295L;
                c = ' ';
                i2 = 0;
                this.H0.x = false;
            } else {
                if (!this.H0.x && (bv7Var = scdVarB.e) != null && bv7Var.h() && n1().h()) {
                    float f5 = scdVarB.k;
                    j2 = 4294967295L;
                    c = ' ';
                    long jA = vbd.a(bv7Var, n1(), scdVarB.i);
                    long jB = vbd.b(hkbVarC.f(), jA, f5);
                    tbd tbdVar = this.H0.X;
                    boolean z = !this.H0.h() && ((tbdVar != null ? tbdVar.m1() : null) == scdVarB);
                    if (z) {
                        f5 = 1.0f;
                    }
                    int i3 = (int) (jB >> 32);
                    int i4 = (int) (jB & 4294967295L);
                    this.Z = new hkb(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4), ks0.a(f4, f3, f5, Float.intBitsToFloat(i3)), ks0.a(f2, f, f5, Float.intBitsToFloat(i4)));
                    if (z) {
                        this.E0 = null;
                    } else {
                        xz xzVarA = scdVarB.a();
                        float f6 = xzVarA != null ? xzVarA.a : 0.0f;
                        yz yzVarB = scdVarB.b();
                        float f7 = yzVarB != null ? yzVarB.a : 0.0f;
                        float f8 = yzVarB != null ? yzVarB.b : 0.0f;
                        int i5 = (int) (jA >> 32);
                        int i6 = (int) (jA & 4294967295L);
                        this.E0 = new a00(((f3 - Float.intBitsToFloat(i5)) * f6) + f7, ((f - Float.intBitsToFloat(i6)) * f6) + f8, ((f4 - Float.intBitsToFloat(i5)) * f6) + f7, ((f2 - Float.intBitsToFloat(i6)) * f6) + f8);
                    }
                    i = 1;
                    this.H0.x = true;
                } else {
                    i = 1;
                    j2 = 4294967295L;
                    c = ' ';
                }
                i2 = 0;
            }
        }
        hkb hkbVarC2 = this.Z;
        if (hkbVarC2 == null && (hkbVarC2 = this.H0.e().c()) == null) {
            gp3 gp3Var = this.H0.f().c;
            gp3Var.j();
            hkbVarC2 = gp3Var.e().f((hcd) gp3Var.c);
        }
        if (hkbVarC2 != null) {
            long jJ0 = db6.J0(hkbVarC2.e());
            int i7 = (int) (jJ0 >> c);
            int i8 = (int) (jJ0 & j2);
            if (i7 == Integer.MAX_VALUE || i8 == Integer.MAX_VALUE) {
                ho7.x("Error: Infinite width/height is invalid. animated bounds: ", this.H0.e().c(), ", current bounds: ", this.H0.f().c.e().c());
                return null;
            }
            if (i7 < 0) {
                i7 = i2;
            }
            if (i8 < 0) {
                i8 = i2;
            }
            if (((i7 >= 0 ? i : i2) & (i8 >= 0 ? i : i2)) == 0) {
                k37.a("width and height must be >= 0");
            }
            jH = ll2.h(i7, i7, i8, i8);
        } else {
            jH = j;
        }
        cea ceaVarV = tn8Var.v(jH);
        if (this.H0.f().c.e().d()) {
            qdd qddVar = (qdd) this.H0.f.getValue();
            jL = this.H0.f().b.a.a(vd0.r0(this)).l();
            int i9 = ceaVarV.a;
            int i10 = ceaVarV.b;
            qddVar.getClass();
        } else {
            jL = (((long) ceaVarV.a) << c) | (((long) ceaVarV.b) & j2);
        }
        return fc0Var.n0((int) (jL >> c), (int) (jL & j2), qu4.a, new qbd(ceaVarV, this));
    }

    public final scd m1() {
        if (this.Y) {
            return (scd) L(tu3.a);
        }
        return null;
    }

    public final bv7 n1() {
        bv7 bv7Var = this.H0.f().b.e;
        if (bv7Var != null) {
            return bv7Var;
        }
        qc0.j("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
        return null;
    }

    @Override // defpackage.pn4
    public final void o0(im2 im2Var) {
        hkb hkbVarC = this.H0.f().c.e().c();
        boolean zH = this.H0.h();
        icd icdVar = this.H0;
        zt ztVar = null;
        if (!zH) {
            icdVar.y = null;
            o1(null);
            icd icdVar2 = this.H0;
            if (!icdVar2.f().c.e().d() || (!icdVar2.h() && icdVar2.g())) {
                ((vv7) im2Var).a();
                return;
            }
            return;
        }
        if (hkbVarC != null) {
            odd oddVar = (odd) icdVar.v.getValue();
            rdd rddVarJ = this.H0.j();
            ((vv7) im2Var).getLayoutDirection();
            sw3 sw3Var = vd0.s0(this).O0;
            ((ydd) oddVar).getClass();
            icd icdVar3 = (icd) rddVarJ.c.getValue();
            if (icdVar3 == null) {
                qc0.j("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
                return;
            }
            icd icdVar4 = icdVar3.z;
            rdd rddVarJ2 = icdVar4 != null ? icdVar4.j() : null;
            if (rddVarJ2 != null) {
                icd icdVar5 = (icd) rddVarJ2.c.getValue();
                if (icdVar5 == null) {
                    qc0.j("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
                    return;
                }
                ztVar = icdVar5.y;
            }
        }
        icdVar.y = ztVar;
        if (((ke6) this.H0.Y.getValue()) == null) {
            o1(vd0.q0(this).c());
        }
        ke6 ke6Var = (ke6) this.H0.Y.getValue();
        if (ke6Var == null) {
            qc0.p("Error: shared element does not have a layer for rendering in the overlay.");
            return;
        }
        vv7 vv7Var = (vv7) im2Var;
        sn4.j0(vv7Var, ke6Var, new rbd(vv7Var, hkbVarC, this));
        icd icdVar6 = this.H0;
        if (!icdVar6.f().c.e().d() || (!icdVar6.h() && icdVar6.g())) {
            i7h.r(im2Var, ke6Var);
        }
    }

    public final void o1(ke6 ke6Var) {
        ke6 ke6Var2 = (ke6) this.H0.Y.getValue();
        if (pa7.t(ke6Var, ke6Var2)) {
            return;
        }
        if (ke6Var2 != null) {
            vd0.q0(this).a(ke6Var2);
        }
        this.H0.Y.setValue(ke6Var);
    }

    public final void p1() {
        c1b c1bVar = vbd.a;
        icd icdVar = this.H0;
        ru4 ru4Var = ru4.s;
        dkd dkdVar = this.I0;
        if (dkdVar == ru4Var) {
            i37.a("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!dkdVar.J(c1bVar)) {
            i37.a("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + c1bVar + " was not found.");
        }
        dkdVar.i0(c1bVar, icdVar);
        icd icdVar2 = this.H0;
        icd icdVar3 = (icd) L(c1bVar);
        if (!pa7.t(icdVar2.z, icdVar3)) {
            icdVar2.z = icdVar3;
            sz9 sz9Var = icdVar2.f().b.g;
            sz9Var.k(sz9Var.j() + 1);
        }
        o1(null);
        this.G0 = false;
        this.H0.X = this;
    }
}
