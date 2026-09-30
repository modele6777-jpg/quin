package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qi2 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public /* synthetic */ qi2(float f, float f2, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        float f = this.b;
        float f2 = this.c;
        switch (i) {
            case 0:
                ((sw3) obj).getClass();
                return new w67((((long) ((int) f2)) & 4294967295L) | (((long) ((int) f)) << 32));
            case 1:
                ((sw3) obj).getClass();
                return new w67((((long) ((int) f2)) & 4294967295L) | (((long) ((int) f)) << 32));
            case 2:
                float f3 = this.b;
                sn4 sn4Var = (sn4) obj;
                Float fValueOf = Float.valueOf(0.0f);
                sn4Var.getClass();
                Float fValueOf2 = Float.valueOf(1.0f);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)) * 1.2589285f;
                sn4Var.v0().p().g();
                try {
                    vd9 vd9Var = (vd9) sn4Var.v0().c;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (sn4Var.f() >> 32)) / 2.0f;
                    vd9Var.G(2.9592907f, 1.0f, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32));
                    iy9[] iy9VarArr = {new iy9(fValueOf, new y72(q8b.a)), new iy9(Float.valueOf(0.5f), new y72(q8b.b)), new iy9(fValueOf2, new y72(q8b.c))};
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (sn4Var.f() >> 32)) / 2.0f;
                    sn4.T(sn4Var, gec.M(iy9VarArr, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32), fIntBitsToFloat), 0L, 0L, (((long) Float.floatToRawIntBits(sn4Var.p0(f2))) << 32) | (((long) Float.floatToRawIntBits(sn4Var.p0(f2))) & 4294967295L), f3, null, null, 0, 230);
                    sn4Var.v0().p().o();
                    long j = y72.e;
                    sn4.T(sn4Var, gec.O(new iy9[]{new iy9(fValueOf, new y72(y72.b(j, 0.75f * f3))), new iy9(Float.valueOf(0.38f), new y72(y72.b(j, 0.15f * f3))), new iy9(Float.valueOf(0.68f), new y72(y72.b(j, 0.0f))), new iy9(fValueOf2, new y72(y72.b(j, 0.3f * f3)))}, 0.0f, 0.0f, 14), 0L, 0L, (((long) Float.floatToRawIntBits(sn4Var.p0(f2))) << 32) | (((long) Float.floatToRawIntBits(sn4Var.p0(f2))) & 4294967295L), 0.0f, new d5e(sn4Var.p0(1.0f), 0.0f, 0, 0, null, 30), null, 0, 214);
                    return wefVar;
                } catch (Throwable th) {
                    sn4Var.v0().p().o();
                    throw th;
                }
            case 3:
                g0c g0cVar = (g0c) obj;
                g0cVar.getClass();
                g0cVar.q(f);
                g0cVar.r(f);
                g0cVar.b(f2);
                return wefVar;
            case 4:
                g0c g0cVar2 = (g0c) obj;
                g0cVar2.getClass();
                g0cVar2.p(f);
                g0cVar2.b(f2);
                return wefVar;
            default:
                g0c g0cVar3 = (g0c) obj;
                g0cVar3.getClass();
                g0cVar3.G(g0cVar3.I0.getDensity() * f);
                g0cVar3.b(f2);
                return wefVar;
        }
    }
}
