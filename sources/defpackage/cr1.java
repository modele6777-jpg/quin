package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cr1 {
    public final float a;
    public final float b;
    public final float c;

    public cr1(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    public final h0e a(boolean z, t69 t69Var, l46 l46Var, int i) {
        jx jxVar;
        l46Var.f0(-1763481333);
        float f = this.a;
        Object obj = sf2.a;
        if (t69Var == null) {
            l46Var.f0(167751211);
            Object objR = l46Var.R();
            if (objR == obj) {
                objR = q1c.f(new yi4(f));
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) objR;
            l46Var.r(false);
            l46Var.r(false);
            return e89Var;
        }
        l46Var.f0(167824247);
        l46Var.r(false);
        Object objR2 = l46Var.R();
        if (objR2 == obj) {
            objR2 = new jsd();
            l46Var.p0(objR2);
        }
        jsd jsdVar = (jsd) objR2;
        boolean z2 = true;
        boolean z3 = (((i & 112) ^ 48) > 32 && l46Var.g(t69Var)) || (i & 48) == 32;
        Object objR3 = l46Var.R();
        if (z3 || objR3 == obj) {
            objR3 = new ar1(t69Var, jsdVar, null);
            l46Var.p0(objR3);
        }
        af1.o((l26) objR3, l46Var, t69Var);
        l77 l77Var = (l77) s72.H0(jsdVar);
        if (!z || (l77Var instanceof pta)) {
            f = 0.0f;
        } else if (l77Var instanceof yq6) {
            f = this.b;
        } else if (l77Var instanceof rn5) {
            f = 0.0f;
        } else if (l77Var instanceof al4) {
            f = this.c;
        }
        Object objR4 = l46Var.R();
        if (objR4 == obj) {
            objR4 = new jx(new yi4(f), xo1.i, null, 12);
            l46Var.p0(objR4);
        }
        jx jxVar2 = (jx) objR4;
        yi4 yi4Var = new yi4(f);
        boolean zI = l46Var.i(jxVar2) | l46Var.d(f) | ((((i & 14) ^ 6) > 4 && l46Var.h(z)) || (i & 6) == 4);
        if ((((i & 896) ^ 384) <= 256 || !l46Var.g(this)) && (i & 384) != 256) {
            z2 = false;
        }
        boolean zI2 = zI | z2 | l46Var.i(l77Var);
        Object objR5 = l46Var.R();
        if (zI2 || objR5 == obj) {
            jxVar = jxVar2;
            Object br1Var = new br1(jxVar, f, z, this, l77Var, null);
            l46Var.p0(br1Var);
            objR5 = br1Var;
        } else {
            jxVar = jxVar2;
        }
        af1.o((l26) objR5, l46Var, yi4Var);
        wz wzVar = jxVar.c;
        l46Var.r(false);
        return wzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof cr1)) {
            return false;
        }
        cr1 cr1Var = (cr1) obj;
        return yi4.b(this.a, cr1Var.a) && yi4.b(0.0f, 0.0f) && yi4.b(0.0f, 0.0f) && yi4.b(this.b, cr1Var.b) && yi4.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + ub3.a(this.b, ub3.a(0.0f, ub3.a(0.0f, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
