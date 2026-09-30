package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rq6 {
    public final l26 a;
    public final /* synthetic */ int b;

    public rq6(int i, l26 l26Var) {
        this.b = i;
        this.a = l26Var;
    }

    public final float a(float f, bv7 bv7Var, bv7 bv7Var2) {
        switch (this.b) {
            case 0:
                return Float.intBitsToFloat((int) (bv7Var2.K(bv7Var, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(((int) (bv7Var.l() >> 32)) / 2.0f) << 32)) & 4294967295L));
            default:
                return Float.intBitsToFloat((int) (bv7Var2.K(bv7Var, (((long) Float.floatToRawIntBits(((int) (bv7Var.l() & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)) >> 32));
        }
    }
}
