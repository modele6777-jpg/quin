package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kv1 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;

    public /* synthetic */ kv1(float f, float f2, long j) {
        this.a = 2;
        this.b = f;
        this.d = j;
        this.c = f2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        float f = this.c;
        switch (i) {
            case 0:
                h81 h81Var = (h81) obj;
                h81Var.getClass();
                return h81Var.a(new kv1(this.b, this.c, 1, this.d));
            case 1:
                sn4 sn4Var = (sn4) obj;
                sn4Var.getClass();
                sn4.K0(sn4Var, this.d, 0L, 0L, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), new d5e(this.b, 0.0f, 0, 0, rxg.w(new float[]{10.0f, 10.0f}), 14), 230);
                return wefVar;
            default:
                sn4 sn4Var2 = (sn4) obj;
                sn4Var2.getClass();
                float fP0 = sn4Var2.p0(0.0f);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(sn4Var2.p0(0.0f) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (sn4Var2.f() >> 32)) / 2.0f;
                float f2 = this.b;
                float fP1 = fIntBitsToFloat - sn4Var2.p0(f2);
                float fP2 = sn4Var2.p0(0.0f) / 2.0f;
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fP1);
                long jFloatToRawIntBits3 = ((long) Float.floatToRawIntBits(fP2)) & 4294967295L;
                long j = this.d;
                sn4.V0(sn4Var2, j, jFloatToRawIntBits, jFloatToRawIntBits3 | (jFloatToRawIntBits2 << 32), fP0, 0, null, 496);
                sn4.w0(sn4Var2, j, sn4Var2.p0(f) / 2.0f, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sn4Var2.f() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(sn4Var2.p0(0.0f) / 2.0f)) & 4294967295L), null, 120);
                float fP3 = sn4Var2.p0(0.0f);
                float fP4 = sn4Var2.p0(f2) + (Float.intBitsToFloat((int) (sn4Var2.f() >> 32)) / 2.0f);
                sn4.V0(sn4Var2, j, (((long) Float.floatToRawIntBits(sn4Var2.p0(0.0f) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fP4) << 32), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sn4Var2.f() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(sn4Var2.p0(0.0f) / 2.0f)) & 4294967295L), fP3, 0, null, 496);
                return wefVar;
        }
    }

    public /* synthetic */ kv1(float f, float f2, int i, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = j;
    }
}
