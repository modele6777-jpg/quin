package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nq4 extends q4d {
    public final n4d i;
    public final rt j;
    public ks k;
    public jg2 l;

    public nq4(n4d n4dVar, vs9 vs9Var) {
        super(vs9Var);
        this.i = n4dVar;
        this.j = urg.h();
    }

    @Override // defpackage.q4d
    public final void a(sn4 sn4Var, long j, long j2, zt ztVar) {
        ks ksVarE;
        n4d n4dVar = this.i;
        float fP0 = sn4Var.p0(n4dVar.a);
        float fP1 = sn4Var.p0(n4dVar.b);
        rt rtVar = this.j;
        if (ztVar != null) {
            float f = 2.0f * fP1;
            float f2 = (fP0 * 2.0f) + f;
            ksVarE = vpf.e((int) Math.ceil(Float.intBitsToFloat((int) (j >> 32)) + f2), (int) Math.ceil(Float.intBitsToFloat((int) (j & 4294967295L)) + f2), 1);
            lp lpVarA = mp.a(ksVarE);
            if (fP1 > 0.0f) {
                float f3 = fP1 + fP0;
                lpVarA.n(f3, f3);
                lpVarA.d(ztVar, mh3.t(rtVar, 0, fP0 > 0.0f ? qn4.d(fP0) : null, 11));
                rt rtVarT = mh3.t(rtVar, 0, fP0 > 0.0f ? qn4.d(fP0) : null, 3);
                rtVarT.m(f);
                lpVarA.d(ztVar, rtVarT);
            } else {
                mh3.t(rtVar, 0, fP0 > 0.0f ? qn4.d(fP0) : null, 11);
                lpVarA.n(fP0, fP0);
                lpVarA.d(ztVar, rtVar);
            }
        } else {
            float f4 = (fP1 * 2.0f) + (fP0 * 2.0f);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + f4;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + f4;
            ksVarE = vpf.e((int) Math.ceil(fIntBitsToFloat), (int) Math.ceil(fIntBitsToFloat2), 1);
            mp.a(ksVarE).b(fP0, fP0, fIntBitsToFloat - fP0, fIntBitsToFloat2 - fP0, Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), mh3.t(rtVar, 0, fP0 > 0.0f ? qn4.d(fP0) : null, 11));
        }
        this.k = ksVarE;
    }

    @Override // defpackage.q4d
    public final void c(sn4 sn4Var, long j, zt ztVar, float f, c82 c82Var, b41 b41Var, int i) {
        jg2 jg2Var;
        b41 c41Var = b41Var;
        ks ksVar = this.k;
        if (ksVar != null) {
            Bitmap bitmap = ksVar.a;
            n4d n4dVar = this.i;
            float f2 = -(sn4Var.p0(n4dVar.b) + sn4Var.p0(n4dVar.a));
            if (c41Var == null || c82Var != null) {
                sn4.A(sn4Var, ksVar, (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), f, c82Var, i, 8);
                return;
            }
            jg2 jg2Var2 = this.l;
            if (jg2Var2 == null || !jg2Var2.d.equals(c41Var)) {
                c41 c41Var2 = new c41(arb.a(ksVar));
                if (c41Var instanceof l4d) {
                    c41Var = new c41(((l4d) c41Var).c((((long) Float.floatToRawIntBits(bitmap.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap.getHeight())) & 4294967295L)));
                }
                jg2Var = new jg2(k99.N(c41Var2), k99.N(c41Var));
                this.l = jg2Var;
            } else {
                jg2Var = jg2Var2;
            }
            ((vd9) sn4Var.v0().c).I(f2, f2);
            try {
                sn4.O0(sn4Var, jg2Var, 0L, (((long) Float.floatToRawIntBits(bitmap.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap.getHeight())) & 4294967295L), f, null, null, i, 50);
            } finally {
                float f3 = -f2;
                ((vd9) sn4Var.v0().c).I(f3, f3);
            }
        }
    }
}
