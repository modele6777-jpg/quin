package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class db4 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;

    public /* synthetic */ db4(float f, int i, long j) {
        this.a = i;
        this.b = f;
        this.c = j;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        float f = this.b;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                sn4 sn4Var = (sn4) obj;
                float fP0 = sn4Var.p0(f);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(sn4Var.p0(f) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                float fP1 = sn4Var.p0(f) / 2.0f;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L));
                sn4.V0(sn4Var, this.c, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fP1)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), fP0, 0, null, 496);
                break;
            case 1:
                sn4 sn4Var2 = (sn4) obj;
                float fP2 = sn4Var2.p0(f);
                float fP3 = sn4Var2.p0(f) / 2.0f;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fP3)) & 4294967295L);
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (sn4Var2.f() >> 32));
                float fP4 = sn4Var2.p0(f) / 2.0f;
                sn4.V0(sn4Var2, this.c, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fP4)) & 4294967295L), fP2, 0, null, 496);
                break;
            default:
                im2 im2Var = (im2) obj;
                im2Var.getClass();
                vv7 vv7Var = (vv7) im2Var;
                vv7Var.a();
                xl1 xl1Var = vv7Var.a;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (xl1Var.f() & 4294967295L));
                float f2 = this.b;
                float f3 = fIntBitsToFloat3 - (f2 / 2.0f);
                sn4.V0(im2Var, this.c, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (xl1Var.f() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), f2, 0, null, 496);
                break;
        }
        return wefVar;
    }
}
