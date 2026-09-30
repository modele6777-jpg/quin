package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cy9 implements gj5 {
    public final ard a;
    public final yx9 b;

    public cy9(ard ardVar, yx9 yx9Var) {
        this.a = ardVar;
        this.b = yx9Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.gj5
    public final Object a(fhc fhcVar, float f, xn2 xn2Var) {
        by9 by9Var;
        if (xn2Var instanceof by9) {
            by9Var = (by9) xn2Var;
            int i = by9Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                by9Var.label = i - Integer.MIN_VALUE;
            } else {
                by9Var = new by9(this, (zn2) xn2Var);
            }
        } else {
            by9Var = new by9(this, (zn2) xn2Var);
        }
        Object objC = by9Var.result;
        int i2 = by9Var.label;
        if (i2 == 0) {
            jzb.q(objC);
            p59 p59Var = new p59(10, this, fhcVar);
            by9Var.label = 1;
            objC = this.a.c(fhcVar, f, p59Var, by9Var);
            bw2 bw2Var = bw2.a;
            if (objC == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objC);
        }
        float fFloatValue = ((Number) objC).floatValue();
        yx9 yx9Var = this.b;
        hzc hzcVar = yx9Var.d;
        hzc hzcVar2 = yx9Var.d;
        if (((qz9) hzcVar.d).j() != 0.0f && Math.abs(((qz9) hzcVar2.d).j()) < 0.001d) {
            int iJ = ((sz9) hzcVar2.c).j();
            if (yx9Var.k.a()) {
                ynb.V(((qx9) yx9Var.m.getValue()).s, null, null, new vx9(yx9Var, null), 3);
            }
            yx9Var.t(0.0f, iJ, false);
        } else {
            new Float(((qz9) hzcVar2.d).j());
        }
        return new Float(fFloatValue);
    }
}
