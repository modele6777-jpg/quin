package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j11 implements a26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j11(b41 b41Var, long j, long j2, un4 un4Var) {
        this.d = b41Var;
        this.b = j;
        this.c = j2;
        this.e = un4Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                vv7 vv7Var = (vv7) ((im2) obj);
                vv7Var.a();
                sn4.O0(vv7Var, (b41) obj3, this.b, this.c, 0.0f, (un4) obj2, null, 0, 104);
                break;
            default:
                final fy9 fy9Var = (fy9) obj2;
                sn4 sn4Var = (sn4) obj;
                sn4Var.getClass();
                final long j = this.b;
                final long j2 = this.c;
                z7f.v(sn4Var, (y6c) obj3, new a26() { // from class: rt2
                    @Override // defpackage.a26
                    public final Object d(Object obj4) {
                        sn4 sn4Var2 = (sn4) obj4;
                        sn4Var2.getClass();
                        sn4.y0(sn4Var2, j, 0L, 0L, 0.0f, null, 0, 126);
                        fy9 fy9Var2 = fy9Var;
                        long jI = fy9Var2.i();
                        long jF = sn4Var2.f();
                        float fMax = Math.max(Float.intBitsToFloat((int) (jF >> 32)) / Float.intBitsToFloat((int) (jI >> 32)), Float.intBitsToFloat((int) (jF & 4294967295L)) / Float.intBitsToFloat((int) (jI & 4294967295L)));
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
                        int i2 = cec.a;
                        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) * Float.intBitsToFloat((int) (fy9Var2.i() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) * Float.intBitsToFloat((int) (fy9Var2.i() & 4294967295L)))) & 4294967295L);
                        long jL = (((long) ym8.L(Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)))) & 4294967295L) | (((long) ym8.L(Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)))) << 32);
                        long jL2 = (((long) ym8.L(Float.intBitsToFloat((int) (sn4Var2.f() >> 32)))) << 32) | (((long) ym8.L(Float.intBitsToFloat((int) (sn4Var2.f() & 4294967295L)))) & 4294967295L);
                        long jRound = (((long) Math.round(1.0f * ((((int) (jL2 & 4294967295L)) - ((int) (jL & 4294967295L))) / 2.0f))) & 4294967295L) | (((long) Math.round(((sn4Var2.getLayoutDirection() == cv7.a ? 0.0f : -0.0f) + 1.0f) * ((((int) (jL2 >> 32)) - ((int) (jL >> 32))) / 2.0f))) << 32);
                        float f = (int) (jRound >> 32);
                        float f2 = (int) (jRound & 4294967295L);
                        ((vd9) sn4Var2.v0().c).I(f, f2);
                        try {
                            fy9.h(fy9Var2, sn4Var2, jFloatToRawIntBits2, 0.0f, 6);
                            ((vd9) sn4Var2.v0().c).I(-f, -f2);
                            sn4.y0(sn4Var2, j2, 0L, 0L, 0.0f, null, 0, 126);
                            return wef.a;
                        } catch (Throwable th) {
                            ((vd9) sn4Var2.v0().c).I(-f, -f2);
                            throw th;
                        }
                    }
                });
                break;
        }
        return wefVar;
    }

    public /* synthetic */ j11(y6c y6cVar, long j, fy9 fy9Var, long j2) {
        this.d = y6cVar;
        this.b = j;
        this.e = fy9Var;
        this.c = j2;
    }
}
