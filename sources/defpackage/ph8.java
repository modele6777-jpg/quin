package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ph8 extends i09 implements kv7 {
    public int E0;
    public int Z;

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        long jA;
        tn8Var.getClass();
        long jD = ll2.d(j, db6.j(this.Z, this.E0));
        if (kl2.g(j) == Integer.MAX_VALUE && kl2.h(j) != Integer.MAX_VALUE) {
            int i = (int) (jD >> 32);
            int i2 = (this.E0 * i) / this.Z;
            jA = ll2.a(i, i, i2, i2);
        } else if (kl2.h(j) != Integer.MAX_VALUE || kl2.g(j) == Integer.MAX_VALUE) {
            int i3 = (int) (jD >> 32);
            int i4 = (int) (jD & 4294967295L);
            jA = ll2.a(i3, i3, i4, i4);
        } else {
            int i5 = (int) (jD & 4294967295L);
            int i6 = (this.Z * i5) / this.E0;
            jA = ll2.a(i6, i6, i5, i5);
        }
        cea ceaVarV = tn8Var.v(jA);
        return zn8Var.n0(ceaVarV.a, ceaVarV.b, qu4.a, new oh8(ceaVarV));
    }
}
