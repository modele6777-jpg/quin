package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements x16 {
    public final hbc a;
    public final m0b b;
    public final ut8 c;
    public final int d;
    public final int e;

    public z(hbc hbcVar, m0b m0bVar, ut8 ut8Var, int i, int i2) {
        this.a = hbcVar;
        this.b = m0bVar;
        this.c = ut8Var;
        this.d = i;
        this.e = i2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    @Override // defpackage.x16
    public final Object invoke() {
        int iJ0;
        ut8 ut8Var = this.c;
        boolean z = ut8Var instanceof dza;
        int i = 0;
        if (z) {
            iJ0 = ((dza) ut8Var).Z();
        } else {
            iJ0 = ut8Var instanceof kza ? ((kza) ut8Var).j0() : 0;
        }
        m0b m0bVar = this.b;
        if (z) {
            dza dzaVar = (dza) ut8Var;
            if (dzaVar.u0() || dzaVar.v0()) {
                i = 1;
            }
        } else if (ut8Var instanceof kza) {
            kza kzaVar = (kza) ut8Var;
            if (kzaVar.K0() || kzaVar.L0()) {
                i = 1;
            }
        } else {
            if (!(ut8Var instanceof qya)) {
                throw new UnsupportedOperationException("Unsupported message: " + ut8Var.getClass());
            }
            k0b k0bVar = (k0b) m0bVar;
            if (k0bVar.g == mya.ENUM_CLASS) {
                i = 2;
            } else if (k0bVar.h) {
                i = 1;
            }
        }
        return this.a.k0(m0bVar, ut8Var, this.d, iJ0 + i + this.e);
    }
}
