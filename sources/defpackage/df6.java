package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class df6 extends lrf {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = y72.k;
    public List f;
    public boolean g;
    public zt h;
    public a26 i;
    public final za6 j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    public df6() {
        int i = msf.a;
        this.f = pu4.a;
        this.g = true;
        this.j = new za6(5, this);
        this.k = "";
        this.o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    @Override // defpackage.lrf
    public final void a(sn4 sn4Var) {
        if (this.s) {
            float[] fArrA = this.b;
            if (fArrA == null) {
                fArrA = zm8.a();
                this.b = fArrA;
            } else {
                zm8.d(fArrA);
            }
            zm8.f(fArrA, this.q + this.m, this.r + this.n);
            float f = this.l;
            if (fArrA.length >= 16) {
                double d = ((double) f) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d);
                float fCos = (float) Math.cos(d);
                float f2 = fArrA[0];
                float f3 = fArrA[4];
                float f4 = (fSin * f3) + (fCos * f2);
                float f5 = -fSin;
                float f6 = (f3 * fCos) + (f2 * f5);
                float f7 = fArrA[1];
                float f8 = fArrA[5];
                float f9 = (fSin * f8) + (fCos * f7);
                float f10 = (f8 * fCos) + (f7 * f5);
                float f11 = fArrA[2];
                float f12 = fArrA[6];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = (f12 * fCos) + (f11 * f5);
                float f15 = fArrA[3];
                float f16 = fArrA[7];
                float f17 = (fSin * f16) + (fCos * f15);
                fArrA[0] = f4;
                fArrA[1] = f9;
                fArrA[2] = f13;
                fArrA[3] = f17;
                fArrA[4] = f6;
                fArrA[5] = f10;
                fArrA[6] = f14;
                fArrA[7] = (fCos * f16) + (f5 * f15);
            }
            float f18 = this.o;
            float f19 = this.p;
            if (fArrA.length >= 16) {
                fArrA[0] = fArrA[0] * f18;
                fArrA[1] = fArrA[1] * f18;
                fArrA[2] = fArrA[2] * f18;
                fArrA[3] = fArrA[3] * f18;
                fArrA[4] = fArrA[4] * f19;
                fArrA[5] = fArrA[5] * f19;
                fArrA[6] = fArrA[6] * f19;
                fArrA[7] = fArrA[7] * f19;
                fArrA[8] = fArrA[8] * 1.0f;
                fArrA[9] = fArrA[9] * 1.0f;
                fArrA[10] = fArrA[10] * 1.0f;
                fArrA[11] = fArrA[11] * 1.0f;
            }
            zm8.f(fArrA, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                zt ztVarA = this.h;
                if (ztVarA == null) {
                    ztVarA = cu.a();
                    this.h = ztVarA;
                }
                pa7.i0(this.f, ztVarA);
            }
            this.g = false;
        }
        ta0 ta0VarV0 = sn4Var.v0();
        long jZ = ta0VarV0.z();
        ta0VarV0.p().g();
        try {
            vd9 vd9Var = (vd9) ta0VarV0.c;
            float[] fArr = this.b;
            if (fArr != null) {
                ((ta0) vd9Var.b).p().k(fArr);
            }
            zt ztVar = this.h;
            if (!this.f.isEmpty() && ztVar != null) {
                vd9Var.k(ztVar, 1);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((lrf) arrayList.get(i)).a(sn4Var);
            }
        } finally {
            ks0.t(ta0VarV0, jZ);
        }
    }

    @Override // defpackage.lrf
    public final a26 b() {
        return this.i;
    }

    @Override // defpackage.lrf
    public final void d(za6 za6Var) {
        this.i = za6Var;
    }

    public final void e(int i, lrf lrfVar) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, lrfVar);
        } else {
            arrayList.add(lrfVar);
        }
        g(lrfVar);
        lrfVar.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            int i = msf.a;
            if (y72.g(j2) == y72.g(j) && y72.f(j2) == y72.f(j) && y72.d(j2) == y72.d(j)) {
                return;
            }
            this.d = false;
            this.e = y72.k;
        }
    }

    public final void g(lrf lrfVar) {
        if (!(lrfVar instanceof g1a)) {
            if (lrfVar instanceof df6) {
                df6 df6Var = (df6) lrfVar;
                if (df6Var.d && this.d) {
                    f(df6Var.e);
                    return;
                } else {
                    this.d = false;
                    this.e = y72.k;
                    return;
                }
            }
            return;
        }
        g1a g1aVar = (g1a) lrfVar;
        b41 b41Var = g1aVar.b;
        if (this.d && b41Var != null) {
            if (b41Var instanceof dtd) {
                f(((dtd) b41Var).a);
            } else {
                this.d = false;
                this.e = y72.k;
            }
        }
        b41 b41Var2 = g1aVar.g;
        if (this.d && b41Var2 != null) {
            if (b41Var2 instanceof dtd) {
                f(((dtd) b41Var2).a);
            } else {
                this.d = false;
                this.e = y72.k;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            lrf lrfVar = (lrf) arrayList.get(i);
            sb.append("\t");
            sb.append(lrfVar.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
