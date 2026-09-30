package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class el4 extends i09 implements kv7 {
    public l26 E0;
    public ks9 F0;
    public boolean G0;
    public lo Z;

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        cea ceaVarV = tn8Var.v(j);
        if (!zn8Var.k0() || !this.G0) {
            iy9 iy9Var = (iy9) this.E0.z(new e77((((long) ceaVarV.b) & 4294967295L) | (((long) ceaVarV.a) << 32)), new kl2(j));
            lo loVar = this.Z;
            jl8 jl8Var = (jl8) iy9Var.d();
            Object objE = iy9Var.e();
            if (!pa7.t(loVar.d(), jl8Var)) {
                loVar.l.setValue(jl8Var);
                f99 f99Var = loVar.e.b;
                boolean zF = f99Var.f();
                if (zF) {
                    try {
                        go goVar = loVar.m;
                        float fD = loVar.d().d(objE);
                        if (!Float.isNaN(fD)) {
                            go.a(goVar, fD);
                            loVar.h(null);
                        }
                        loVar.g(objE);
                        f99Var.h(null);
                    } catch (Throwable th) {
                        f99Var.h(null);
                        throw th;
                    }
                }
                if (!zF) {
                    loVar.h(objE);
                }
            }
        }
        this.G0 = zn8Var.k0() || this.G0;
        return zn8Var.n0(ceaVarV.a, ceaVarV.b, qu4.a, new it3(zn8Var, this, ceaVarV, 3));
    }

    @Override // defpackage.i09
    public final void e1() {
        this.G0 = false;
    }
}
