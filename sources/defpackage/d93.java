package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d93 implements x4d {
    public final boolean a;

    public d93(boolean z) {
        this.a = z;
    }

    @Override // defpackage.x4d
    public final vs9 a(long j, cv7 cv7Var, sw3 sw3Var) {
        cv7Var.getClass();
        sw3Var.getClass();
        float f = no6.a;
        float fP0 = sw3Var.p0(6.0f);
        float fP1 = sw3Var.p0(12.0f);
        int i = (int) (4294967295L & j);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float f2 = (fIntBitsToFloat - fP1) / 2.0f;
        float f3 = fIntBitsToFloat / 2.0f;
        float f4 = fP1 + f2;
        float fP2 = sw3Var.p0(12.0f);
        boolean z = this.a;
        float f5 = z ? fP0 : 0.0f;
        float fIntBitsToFloat2 = z ? Float.intBitsToFloat((int) (j >> 32)) : Float.intBitsToFloat((int) (j >> 32)) - fP0;
        zt ztVarA = cu.a();
        if (z) {
            float f6 = f5 + fP2;
            ztVarA.h(f6, 0.0f);
            float f7 = fIntBitsToFloat2 - fP2;
            ztVarA.g(f7, 0.0f);
            ztVarA.j(fIntBitsToFloat2, 0.0f, fIntBitsToFloat2, fP2);
            ztVarA.g(fIntBitsToFloat2, Float.intBitsToFloat(i) - fP2);
            ztVarA.j(fIntBitsToFloat2, Float.intBitsToFloat(i), f7, Float.intBitsToFloat(i));
            ztVarA.g(f6, Float.intBitsToFloat(i));
            ztVarA.j(f5, Float.intBitsToFloat(i), f5, Float.intBitsToFloat(i) - fP2);
            ztVarA.g(f5, f4);
            ztVarA.g(0.0f, f3);
            ztVarA.g(fP0, f2);
            ztVarA.g(f5, fP2);
            ztVarA.j(f5, 0.0f, f6, 0.0f);
        } else {
            float f8 = f5 + fP2;
            ztVarA.h(f8, 0.0f);
            float f9 = fIntBitsToFloat2 - fP2;
            ztVarA.g(f9, 0.0f);
            ztVarA.j(fIntBitsToFloat2, 0.0f, fIntBitsToFloat2, fP2);
            ztVarA.g(fIntBitsToFloat2, f2);
            ztVarA.g(Float.intBitsToFloat((int) (j >> 32)), f3);
            ztVarA.g(fIntBitsToFloat2, f4);
            ztVarA.g(fIntBitsToFloat2, Float.intBitsToFloat(i) - fP2);
            ztVarA.j(fIntBitsToFloat2, Float.intBitsToFloat(i), f9, Float.intBitsToFloat(i));
            ztVarA.g(f8, Float.intBitsToFloat(i));
            ztVarA.j(f5, Float.intBitsToFloat(i), f5, Float.intBitsToFloat(i) - fP2);
            ztVarA.g(f5, fP2);
            ztVarA.j(f5, 0.0f, f8, 0.0f);
        }
        ztVarA.e();
        return new ss9(ztVarA);
    }
}
