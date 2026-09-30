package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rn extends yk4 {
    public mo Y0;
    public lu9 Z0;
    public gj5 a1;
    public sw3 b1;

    @Override // defpackage.yk4
    public final boolean D1() {
        return this.Y0.l.getValue() != null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G1(float f, zn2 zn2Var) {
        mn mnVar;
        jmb jmbVar;
        if (zn2Var instanceof mn) {
            mnVar = (mn) zn2Var;
            int i = mnVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mnVar.label = i - Integer.MIN_VALUE;
            } else {
                mnVar = new mn(this, zn2Var);
            }
        } else {
            mnVar = new mn(this, zn2Var);
        }
        Object obj = mnVar.result;
        int i2 = mnVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            boolean zC = this.Y0.c();
            Object obj2 = bw2.a;
            if (zC) {
                mo moVar = this.Y0;
                mnVar.label = 1;
                if (!moVar.c()) {
                    l37.a("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
                }
                Object value = moVar.g.getValue();
                hq3 hq3VarB = moVar.b();
                float fE = moVar.e();
                znd zndVar = moVar.b;
                if (zndVar == null) {
                    pa7.g0("positionalThreshold");
                    throw null;
                }
                tm tmVar = moVar.c;
                if (tmVar == null) {
                    pa7.g0("velocityThreshold");
                    throw null;
                }
                Object objD = jn.d(hq3VarB, fE, f, zndVar, tmVar);
                Object objC = ((Boolean) moVar.a.d(objD)).booleanValue() ? jn.c(moVar, objD, f, mnVar) : jn.c(moVar, value, f, mnVar);
                if (objC != obj2) {
                    return objC;
                }
            } else {
                jmb jmbVar2 = new jmb();
                jmbVar2.element = f;
                mo moVar2 = this.Y0;
                on onVar = new on(this, jmbVar2, f, null);
                mnVar.L$0 = jmbVar2;
                mnVar.label = 2;
                b99 b99Var = moVar2.f;
                yn ynVar = new yn(moVar2, null, onVar);
                b99Var.getClass();
                Object objO = jgb.O(new y89(s89.a, b99Var, ynVar, null), mnVar);
                if (objO != obj2) {
                    objO = wef.a;
                }
                if (objO != obj2) {
                    jmbVar = jmbVar2;
                }
            }
            return obj2;
        }
        if (i2 == 1) {
            jzb.q(obj);
            return obj;
        }
        if (i2 != 2) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jmbVar = (jmb) mnVar.L$0;
        jzb.q(obj);
        return new Float(jmbVar.element);
    }

    public final boolean H1() {
        return vd0.s0(this).P0 == cv7.b && this.F0 == ks9.b;
    }

    public final long I1(float f) {
        ks9 ks9Var = this.F0;
        float f2 = ks9Var == ks9.b ? f : 0.0f;
        if (ks9Var != ks9.a) {
            f = 0.0f;
        }
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32);
    }

    public final void J1() {
        x6f x6fVar = rm.a;
        z4 z4Var = rm.b;
        sw3 sw3Var = vd0.s0(this).O0;
        this.b1 = sw3Var;
        this.a1 = new ard(new um(this.Y0, z4Var, new tm(sw3Var, 0), 0), jn.b, x6fVar);
    }

    @Override // defpackage.i09
    public final void d1() {
        J1();
    }

    @Override // defpackage.rv3
    public final void e() {
        N();
        if (this.Y) {
            sw3 sw3Var = vd0.s0(this).O0;
            sw3 sw3Var2 = this.b1;
            if (sw3Var2 == null || !sw3Var2.equals(sw3Var)) {
                this.b1 = sw3Var;
                J1();
            }
        }
    }

    @Override // defpackage.yk4
    public final Object p1(wk4 wk4Var, xk4 xk4Var) {
        mo moVar = this.Y0;
        ln lnVar = new ln(wk4Var, this, null);
        b99 b99Var = moVar.f;
        yn ynVar = new yn(moVar, null, lnVar);
        b99Var.getClass();
        Object objO = jgb.O(new y89(s89.a, b99Var, ynVar, null), xk4Var);
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        if (objO != bw2Var) {
            objO = wefVar;
        }
        return objO == bw2Var ? objO : wefVar;
    }

    @Override // defpackage.yk4
    public final void v1(wj4 wj4Var) {
        if (this.Y) {
            ynb.V(Z0(), null, null, new qn(this, wj4Var, null), 3);
        }
    }

    @Override // defpackage.yk4
    public final void u1(long j) {
    }
}
