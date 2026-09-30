package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lhb {
    public final vz9 a = q1c.f(null);
    public final vz9 b = q1c.f(null);
    public final vz9 c = q1c.f(Boolean.TRUE);

    public final hkb a() {
        bv7 bv7Var = (bv7) this.a.getValue();
        if (bv7Var != null) {
            if (!bv7Var.h()) {
                bv7Var = null;
            }
            if (bv7Var != null) {
                long jN = bv7Var.N(0L);
                int i = (int) (jN >> 32);
                int i2 = (int) (jN & 4294967295L);
                return new hkb(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + ((int) (bv7Var.l() >> 32)), Float.intBitsToFloat(i2) + ((int) (4294967295L & bv7Var.l())));
            }
        }
        return null;
    }
}
