package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gpd implements zl4 {
    public final int a;
    public final b62 b;
    public final qz9 c;
    public a26 d;
    public final boolean e = true;
    public final float[] f;
    public final sz9 g;
    public final sz9 h;
    public boolean i;
    public final sz9 j;
    public final sz9 k;
    public final ks9 l;
    public final vz9 m;
    public final hla n;
    public final qz9 o;
    public final qz9 p;
    public final jo q;
    public final b99 r;

    public gpd(float f, int i, b62 b62Var) {
        float[] fArr;
        this.a = i;
        this.b = b62Var;
        this.c = new qz9(f);
        if (i == 0) {
            fArr = new float[0];
        } else {
            int i2 = i + 2;
            float[] fArr2 = new float[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr2[i3] = i3 / (i + 1);
            }
            fArr = fArr2;
        }
        this.f = fArr;
        this.g = new sz9(0);
        this.h = new sz9(0);
        this.j = new sz9(0);
        this.k = new sz9(0);
        this.l = ks9.b;
        this.m = q1c.f(Boolean.FALSE);
        this.n = new hla(26, this);
        b62 b62Var2 = this.b;
        float f2 = b62Var2.a;
        float f3 = b62Var2.b - f2;
        this.o = new qz9(abg.P(0.0f, 0.0f, mh3.n(f3 == 0.0f ? 0.0f : (f - f2) / f3, 0.0f, 1.0f)));
        this.p = new qz9(0.0f);
        this.q = new jo(2, this);
        this.r = new b99();
    }

    @Override // defpackage.zl4
    public final Object a(vl4 vl4Var, xk4 xk4Var) {
        Object objO = jgb.O(new fpd(this, s89.b, vl4Var, null), xk4Var);
        return objO == bw2.a ? objO : wef.a;
    }

    public final void b(float f) {
        float fMax;
        float fMin;
        if (this.l == ks9.a) {
            float fJ = this.h.j();
            sz9 sz9Var = this.k;
            fMax = Math.max(fJ - (sz9Var.j() / 2.0f), 0.0f);
            fMin = Math.min(sz9Var.j() / 2.0f, fMax);
        } else {
            float fJ2 = this.g.j();
            sz9 sz9Var2 = this.j;
            fMax = Math.max(fJ2 - (sz9Var2.j() / 2.0f), 0.0f);
            fMin = Math.min(sz9Var2.j() / 2.0f, fMax);
        }
        qz9 qz9Var = this.o;
        float fJ3 = qz9Var.j() + f;
        qz9 qz9Var2 = this.p;
        qz9Var.k(qz9Var2.j() + fJ3);
        qz9Var2.k(0.0f);
        float fE = epd.e(qz9Var.j(), this.f, fMin, fMax);
        b62 b62Var = this.b;
        float f2 = fMax - fMin;
        float fP = abg.P(b62Var.a, b62Var.b, mh3.n(f2 == 0.0f ? 0.0f : (fE - fMin) / f2, 0.0f, 1.0f));
        if (fP == this.c.j()) {
            return;
        }
        a26 a26Var = this.d;
        if (a26Var != null) {
            a26Var.d(Float.valueOf(fP));
        } else {
            d(fP);
        }
    }

    public final float c() {
        b62 b62Var = this.b;
        float f = b62Var.a;
        float f2 = b62Var.b;
        float fN = mh3.n(this.c.j(), f, f2);
        float f3 = f2 - f;
        return mh3.n(f3 == 0.0f ? 0.0f : (fN - f) / f3, 0.0f, 1.0f);
    }

    public final void d(float f) {
        if (this.e) {
            b62 b62Var = this.b;
            float f2 = b62Var.a;
            float f3 = b62Var.b;
            f = epd.e(mh3.n(f, f2, f3), this.f, f2, f3);
        }
        this.c.k(f);
    }
}
