package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fld extends ja7 {
    public vz E0;
    public long F0;
    public long G0;
    public boolean H0;
    public final vz9 I0;

    public fld(vz vzVar) {
        super(1);
        this.E0 = vzVar;
        this.F0 = -9223372034707292160L;
        this.G0 = ll2.b(0, 0, 0, 0, 15);
        this.I0 = q1c.f(null);
    }

    @Override // defpackage.ja7, defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        cea ceaVarV;
        cld cldVar;
        long jD;
        cld cldVar2;
        if (zn8Var.k0()) {
            this.G0 = j;
            this.H0 = true;
            ceaVarV = tn8Var.v(j);
        } else {
            ceaVarV = tn8Var.v(this.H0 ? this.G0 : j);
        }
        cea ceaVar = ceaVarV;
        char c = ' ';
        long j2 = (((long) ceaVar.b) & 4294967295L) | (((long) ceaVar.a) << 32);
        if (zn8Var.k0()) {
            this.F0 = j2;
            c = ' ';
            jD = j2;
            j2 = jD;
        } else {
            long j3 = !e77.b(this.F0, -9223372034707292160L) ? this.F0 : j2;
            vz9 vz9Var = this.I0;
            cld cldVar3 = (cld) vz9Var.getValue();
            if (cldVar3 != null) {
                jx jxVar = cldVar3.a;
                boolean z = (e77.b(j3, ((e77) jxVar.e()).a) || jxVar.f()) ? false : true;
                if (!e77.b(j3, ((e77) jxVar.e.getValue()).a) || z) {
                    cldVar3.b = ((e77) jxVar.e()).a;
                    cldVar2 = cldVar3;
                    ynb.V(Z0(), null, null, new dld(cldVar2, j3, this, null), 3);
                } else {
                    cldVar2 = cldVar3;
                }
                cldVar = cldVar2;
            } else {
                long j4 = j3;
                cldVar = new cld(new jx(new e77(j4), xo1.n, new e77(4294967297L), 8), j4);
            }
            vz9Var.setValue(cldVar);
            jD = ll2.d(j, ((e77) cldVar.a.e()).a);
        }
        int i = (int) (jD >> c);
        int i2 = (int) (jD & 4294967295L);
        return zn8Var.n0(i, i2, qu4.a, new eld(this, j2, i, i2, zn8Var, ceaVar));
    }

    @Override // defpackage.i09
    public final void d1() {
        this.F0 = -9223372034707292160L;
        this.H0 = false;
    }

    @Override // defpackage.i09
    public final void f1() {
        this.I0.setValue(null);
    }
}
