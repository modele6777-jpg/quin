package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x8d implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y8d b;

    public /* synthetic */ x8d(y8d y8dVar, int i) {
        this.a = i;
        this.b = y8dVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        y8d y8dVar = this.b;
        switch (i) {
            case 0:
                sn4 sn4Var = (sn4) obj;
                sn4Var.getClass();
                long j = y8dVar.a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)) - 0.5f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(-1.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (sn4Var.f() >> 32)) + 1.0f;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)) - 0.5f;
                sn4.V0(sn4Var, j, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat3))), 1.0f, 0, null, 496);
                break;
            default:
                sn4 sn4Var2 = (sn4) obj;
                sn4Var2.getClass();
                sn4.y0(sn4Var2, y8dVar.f, 0L, 0L, 0.0f, null, 0, 126);
                break;
        }
        return wefVar;
    }
}
