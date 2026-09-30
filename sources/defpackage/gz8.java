package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gz8 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ h0e c;

    public /* synthetic */ gz8(long j, h0e h0eVar, int i) {
        this.a = i;
        this.b = j;
        this.c = h0eVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        h0e h0eVar = this.c;
        switch (i) {
            case 0:
                sn4.y0((sn4) obj, this.b, 0L, 0L, mh3.n(((Number) h0eVar.getValue()).floatValue(), 0.0f, 1.0f), null, 0, 118);
                break;
            default:
                sn4 sn4Var = (sn4) obj;
                sn4Var.getClass();
                float fP0 = sn4Var.p0(3.0f);
                if (((Number) h0eVar.getValue()).floatValue() > 0.0f) {
                    float fFloatValue = ((Number) h0eVar.getValue()).floatValue() * 360.0f;
                    d5e d5eVar = new d5e(fP0, 0.0f, 1, 0, null, 26);
                    float f = fP0 / 2.0f;
                    sn4Var.X0(this.b, -90.0f, fFloatValue, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sn4Var.f() >> 32)) - fP0)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)) - fP0)) & 4294967295L), d5eVar);
                }
                break;
        }
        return wefVar;
    }
}
