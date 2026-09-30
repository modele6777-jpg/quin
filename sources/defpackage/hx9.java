package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hx9 implements w31 {
    public final yx9 b;
    public final w31 c;
    public final cv7 d;

    public hx9(yx9 yx9Var, w31 w31Var, cv7 cv7Var) {
        this.b = yx9Var;
        this.c = w31Var;
        this.d = cv7Var;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0012  */
    @Override // defpackage.w31
    public final float a(float f, float f2, float f3) {
        int iN;
        int iN2;
        int iN3;
        float fA = this.c.a(f, f2, f3);
        boolean z = false;
        if (f <= 0.0f) {
            float f4 = f + f2;
            hkb hkbVar = qyf.a;
            if (f4 <= 1.0f) {
                z = true;
            }
        } else if (f + f2 > f3) {
            z = true;
        }
        float fAbs = Math.abs(fA);
        cv7 cv7Var = cv7.b;
        ks9 ks9Var = ks9.b;
        cv7 cv7Var2 = this.d;
        yx9 yx9Var = this.b;
        if (fAbs != 0.0f && z) {
            if (cv7Var2 == cv7Var && yx9Var.k().e == ks9Var) {
                iN3 = yx9Var.n() + (-yx9Var.f);
            } else {
                iN3 = yx9Var.f;
            }
            float fN = iN3 * (-1.0f);
            while (fA > 0.0f && fN < fA) {
                fN += yx9Var.n();
            }
            while (fA < 0.0f && fN > fA) {
                fN -= yx9Var.n();
            }
            return fN;
        }
        int i = yx9Var.f;
        vz9 vz9Var = yx9Var.E;
        if (Math.abs(i) < 1.0E-6d) {
            return 0.0f;
        }
        if (cv7Var2 == cv7Var && yx9Var.k().e == ks9Var) {
            iN = yx9Var.n() + (-yx9Var.f);
        } else {
            iN = yx9Var.f;
        }
        float f5 = iN * (-1.0f);
        if (cv7Var2 == cv7Var && yx9Var.k().e == ks9Var) {
            if (!((Boolean) vz9Var.getValue()).booleanValue()) {
                iN2 = yx9Var.n();
                f5 += iN2;
            }
        } else if (((Boolean) vz9Var.getValue()).booleanValue()) {
            iN2 = yx9Var.n();
            f5 += iN2;
        }
        return mh3.n(f5, -f3, f3);
    }
}
