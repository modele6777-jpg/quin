package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ty extends ja7 {
    public g3f E0;
    public e89 F0;
    public uy G0;
    public cea H0;
    public cea I0;
    public long J0;
    public long K0;
    public final qy L0;
    public final py M0;
    public long N0;

    public ty(g3f g3fVar, e89 e89Var, uy uyVar) {
        super(1);
        this.E0 = g3fVar;
        this.F0 = e89Var;
        this.G0 = uyVar;
        this.J0 = 0L;
        this.K0 = 0L;
        this.L0 = new qy(this);
        this.M0 = new py(this);
        this.N0 = -9223372034707292160L;
    }

    @Override // defpackage.ja7, defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        long j2;
        cea ceaVarV = tn8Var.v(j);
        if (zn8Var.k0()) {
            j2 = (((long) ceaVarV.a) << 32) | (((long) ceaVarV.b) & 4294967295L);
        } else {
            g3f g3fVar = this.E0;
            int i = ceaVarV.a;
            if (g3fVar == null) {
                j2 = (((long) i) << 32) | (((long) ceaVarV.b) & 4294967295L);
                this.N0 = j2;
            } else {
                long j3 = (((long) ceaVarV.b) & 4294967295L) | (((long) i) << 32);
                f3f f3fVarA = g3fVar.a(new ry(this, j3), null, null, new sy(this, j3));
                j2 = ((e77) f3fVarA.getValue()).a;
                this.N0 = ((e77) f3fVarA.getValue()).a;
            }
        }
        boolean zK0 = zn8Var.k0();
        qu4 qu4Var = qu4.a;
        if (zK0) {
            this.H0 = ceaVarV;
            this.J0 = j2;
            return zn8Var.n0((int) (j2 >> 32), (int) (j2 & 4294967295L), qu4Var, this.L0);
        }
        this.I0 = ceaVarV;
        this.K0 = j2;
        return zn8Var.n0((int) (j2 >> 32), (int) (j2 & 4294967295L), qu4Var, this.M0);
    }

    @Override // defpackage.i09
    public final void f1() {
        this.N0 = -9223372034707292160L;
    }
}
