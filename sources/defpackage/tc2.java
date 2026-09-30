package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tc2 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tc2(float f, Object obj, int i) {
        this.a = i;
        this.b = f;
        this.c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x015b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        byte b;
        int i = this.a;
        boolean z = false;
        z = false;
        wef wefVar = wef.a;
        float f = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                bea beaVar = (bea) obj;
                beaVar.getClass();
                bea.q(beaVar, (cea) obj2, 0, 0, new uc2(z ? 1 : 0, f), 4);
                return wefVar;
            case 1:
                x16 x16Var = (x16) obj2;
                if (Math.abs(((Float) obj).floatValue() - f) >= 20.0f) {
                    x16Var.invoke();
                }
                return wefVar;
            case 2:
                imb imbVar = (imb) obj2;
                rl4 rl4Var = (rl4) obj;
                boolean zT = pa7.t(rl4Var.Y(), "waiting");
                if (rl4Var.f0() == null) {
                    b = false;
                } else {
                    ks9 ks9VarF0 = rl4Var.f0();
                    ks9VarF0.getClass();
                    sl4 sl4Var = ul4.a;
                    if (ks9VarF0 != ks9.b ? f <= 30.0f || f > 90.0f : f > 30.0f) {
                        b = false;
                    } else {
                        b = true;
                    }
                }
                if (imbVar.element || (zT && b != false)) {
                    z = true;
                }
                imbVar.element = z;
                return Boolean.valueOf(!z);
            case 3:
                sn4 sn4Var = (sn4) obj;
                sn4Var.getClass();
                float fP0 = sn4Var.p0(2.0f);
                long j = ((r6d) ((s6d) obj2)).a;
                float f2 = -fP0;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                float f3 = 2.0f * fP0;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sn4Var.f() >> 32)) + f3)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)) + f3)) & 4294967295L);
                float fP1 = sn4Var.p0(f) + fP0;
                sn4.K0(sn4Var, j, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fP1)) << 32) | (((long) Float.floatToRawIntBits(fP1)) & 4294967295L), null, 240);
                return wefVar;
            case 4:
                sn4 sn4Var2 = (sn4) obj;
                sn4Var2.getClass();
                sn4.y0(sn4Var2, y72.b(((y8d) obj2).a, 0.2f), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(sn4Var2.p0(f))) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sn4Var2.f() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(sn4Var2.p0(1.0f))) & 4294967295L), 0.0f, null, 0, 120);
                return wefVar;
            case 5:
                im2 im2Var = (im2) obj;
                im2Var.getClass();
                sn4.T(im2Var, (b68) obj2, 0L, ((vv7) im2Var).a.f(), (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), 0.0f, null, null, 0, 242);
                return wefVar;
            default:
                n3f n3fVar = (n3f) obj2;
                long jLongValue = ((Long) obj).longValue();
                boolean zH = n3fVar.h();
                tz9 tz9Var = n3fVar.h;
                if (!zH) {
                    if (tz9Var.j() == Long.MIN_VALUE) {
                        tz9Var.k(jLongValue);
                        n3fVar.a.a.setValue(Boolean.TRUE);
                    }
                    long j2 = jLongValue - tz9Var.j();
                    if (f != 0.0f) {
                        j2 = ym8.M(j2 / ((double) f));
                    }
                    n3fVar.o(j2);
                    n3fVar.i(j2, f == 0.0f);
                }
                return wefVar;
        }
    }

    public /* synthetic */ tc2(Object obj, float f, int i) {
        this.a = i;
        this.c = obj;
        this.b = f;
    }
}
