package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ui3 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ui3(float f, float f2, jx jxVar) {
        this.a = 0;
        this.b = f;
        this.c = f2;
        this.d = jxVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        float f = this.c;
        float f2 = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                g0c g0cVar = (g0c) obj;
                g0cVar.getClass();
                g0cVar.G((((Number) ((jx) obj2).e()).floatValue() * f) + f2);
                break;
            case 1:
                sn4 sn4Var = (sn4) obj;
                sn4Var.getClass();
                long jB = y72.b(((y8d) obj2).a, 0.25f);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(sn4Var.p0(f2)) << 32);
                float fP0 = sn4Var.p0(f);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fP0) << 32);
                float fP1 = sn4Var.p0(f) / 2.0f;
                sn4.K0(sn4Var, jB, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fP1)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fP1))), null, 240);
                break;
            default:
                ((bea) obj).g((cea) obj2, Math.round(f2), Math.round(f), 0.0f);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ ui3(float f, float f2, int i, Object obj) {
        this.a = i;
        this.d = obj;
        this.b = f;
        this.c = f2;
    }
}
