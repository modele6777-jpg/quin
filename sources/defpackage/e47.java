package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e47 extends q4d {
    public final n4d i;
    public final rt j;
    public c41 k;
    public jg2 l;

    public e47(n4d n4dVar, vs9 vs9Var) {
        super(vs9Var);
        this.i = n4dVar;
        this.j = urg.h();
    }

    @Override // defpackage.q4d
    public final void a(sn4 sn4Var, long j, long j2, zt ztVar) {
        c41 c41Var;
        ks ksVarE;
        n4d n4dVar = this.i;
        float fP0 = sn4Var.p0(n4dVar.a);
        float fP1 = sn4Var.p0(n4dVar.b);
        long j3 = n4dVar.c;
        float fP2 = sn4Var.p0(aj4.a(j3));
        float fP3 = sn4Var.p0(aj4.b(j3));
        rt rtVar = this.j;
        if (ztVar != null) {
            int iCeil = (int) Math.ceil(Float.intBitsToFloat((int) (j >> 32)));
            int iCeil2 = (int) Math.ceil(Float.intBitsToFloat((int) (j & 4294967295L)));
            if (fP1 > 0.0f) {
                hkb hkbVarF = ztVar.f();
                float f = hkbVarF.c - hkbVarF.a;
                float f2 = hkbVarF.d - hkbVarF.b;
                ksVarE = vpf.e((int) Math.ceil(f), (int) Math.ceil(f2), 1);
                lp lpVarA = mp.a(ksVarE);
                lpVarA.d(ztVar, rtVar);
                lpVarA.m(0.0f, 0.0f, f, f2, 1);
                rt rtVarT = mh3.t(rtVar, 0, null, 5);
                rtVarT.m(fP1 * 2.0f);
                lpVarA.d(ztVar, rtVarT);
            } else {
                ksVarE = null;
            }
            int iCeil3 = ((int) Math.ceil(fP0)) * 2;
            ks ksVarE2 = vpf.e(iCeil + iCeil3, iCeil2 + iCeil3, 1);
            Bitmap bitmap = ksVarE2.a;
            lp lpVarA2 = mp.a(ksVarE2);
            if (ksVarE != null) {
                lpVarA2.s(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), mh3.t(rtVar, 0, null, 15));
                lpVarA2.q(ksVarE, (((long) Float.floatToRawIntBits(fP2)) << 32) | (((long) Float.floatToRawIntBits(fP3)) & 4294967295L), mh3.t(rtVar, 11, fP0 > 0.0f ? qn4.d(fP0) : null, 9));
                c41Var = new c41(arb.a(ksVarE2));
            } else {
                lpVarA2.g();
                lpVarA2.n(fP2, fP3);
                lpVarA2.d(ztVar, mh3.t(rtVar, 0, fP0 > 0.0f ? qn4.d(fP0) : null, 11));
                lpVarA2.o();
                lpVarA2.s(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), mh3.t(rtVar, 11, null, 13));
                c41Var = new c41(arb.a(ksVarE2));
            }
        } else {
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            ks ksVarE3 = vpf.e((int) Math.ceil(Float.intBitsToFloat(i)), (int) Math.ceil(Float.intBitsToFloat(i2)), 1);
            lp lpVarA3 = mp.a(ksVarE3);
            float f3 = fP2 + fP1;
            float f4 = fP3 + fP1;
            lpVarA3.b(f3, f4, Math.max(f3, (Float.intBitsToFloat(i) + fP2) - fP1), Math.max(f4, (Float.intBitsToFloat(i2) + fP3) - fP1), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), mh3.t(rtVar, 0, fP0 > 0.0f ? qn4.d(fP0) : null, 11));
            Bitmap bitmap2 = ksVarE3.a;
            lpVarA3.s(0.0f, 0.0f, bitmap2.getWidth(), bitmap2.getHeight(), mh3.t(rtVar, 11, null, 13));
            c41Var = new c41(arb.a(ksVarE3));
        }
        this.k = c41Var;
    }

    @Override // defpackage.q4d
    public final void c(sn4 sn4Var, long j, zt ztVar, float f, c82 c82Var, b41 b41Var, int i) {
        l4d l4dVar = this.k;
        if (l4dVar != null) {
            n4d n4dVar = this.i;
            b41 b41Var2 = n4dVar.f;
            if (b41Var2 instanceof l4d) {
                jg2 jg2Var = this.l;
                if (jg2Var == null || !jg2Var.d.equals(b41Var2)) {
                    jg2Var = new jg2(k99.N(l4dVar), k99.N(b41Var2));
                    this.l = jg2Var;
                }
                l4dVar = jg2Var;
            }
            l4d l4dVar2 = l4dVar;
            if (ztVar != null) {
                sn4.s(sn4Var, ztVar, l4dVar2, f, null, c82Var, i, 8);
            } else if (urg.v(j, 0L)) {
                sn4.O0(sn4Var, l4dVar2, 0L, 0L, f, null, c82Var, i, 22);
            } else {
                sn4.T(sn4Var, l4dVar2, 0L, 0L, j, f, null, c82Var, n4dVar.d, 38);
            }
        }
    }
}
