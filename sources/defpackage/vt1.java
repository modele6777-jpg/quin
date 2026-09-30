package defpackage;

import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vt1 {
    public static final pr4 a = new pr4(0, new jl0(25));

    public static final j09 a(j09 j09Var, String str, yi4 yi4Var, l46 l46Var, int i, int i2) {
        bv7[] bv7VarArr;
        TarotCardType tarotCardType;
        j09Var.getClass();
        str.getClass();
        boolean z = (i2 & 2) == 0;
        boolean z2 = (i2 & 4) == 0;
        Float fValueOf = null;
        yi4 yi4Var2 = (i2 & 8) != 0 ? null : yi4Var;
        tt1 tt1Var = (tt1) l46Var.k(a);
        nu1 nu1Var = (nu1) tt1Var.b.getValue();
        boolean z3 = pa7.t((nu1Var == null || (tarotCardType = nu1Var.a) == null) ? null : tarotCardType.getCardKey(), str) && (!((Boolean) tt1Var.f.getValue()).booleanValue() || z2);
        Object objR = l46Var.R();
        Object obj = sf2.a;
        if (objR == obj) {
            objR = new bv7[1];
            l46Var.p0(objR);
        }
        bv7[] bv7VarArr2 = (bv7[]) objR;
        if (yi4Var2 == null) {
            l46Var.f0(71249263);
            l46Var.r(false);
        } else {
            l46Var.f0(71249264);
            float fP0 = ((sw3) l46Var.k(zg2.h)).p0(yi4Var2.a);
            l46Var.r(false);
            fValueOf = Float.valueOf(fP0);
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        int i3 = (i & 896) ^ 384;
        int i4 = (i & 112) ^ 48;
        boolean zI = l46Var.i(bv7VarArr2) | ((i3 > 256 && l46Var.h(z)) || (i & 384) == 256) | l46Var.g(fValueOf) | l46Var.g(tt1Var) | ((i4 > 32 && l46Var.g(str)) || (i & 48) == 32);
        Object objR2 = l46Var.R();
        if (zI || objR2 == obj) {
            Object fl0Var = new fl0(fValueOf, tt1Var, str, bv7VarArr2, z);
            bv7VarArr = bv7VarArr2;
            l46Var.p0(fl0Var);
            objR2 = fl0Var;
        } else {
            bv7VarArr = bv7VarArr2;
        }
        af1.i(str, boolValueOf, fValueOf, (a26) objR2, l46Var);
        boolean zI2 = l46Var.i(bv7VarArr) | ((((i & 7168) ^ 3072) > 2048 && l46Var.h(z2)) || (i & 3072) == 2048) | l46Var.g(tt1Var) | ((i4 > 32 && l46Var.g(str)) || (i & 48) == 32) | ((i3 > 256 && l46Var.h(z)) || (i & 384) == 256);
        Object objR3 = l46Var.R();
        if (zI2 || objR3 == obj) {
            Object ut1Var = new ut1(bv7VarArr, z2, tt1Var, str, z);
            l46Var.p0(ut1Var);
            objR3 = ut1Var;
        }
        return pa7.p(nk8.w(j09Var, (a26) objR3), z3 ? 0.0f : 1.0f);
    }

    public static final hkb b(bv7 bv7Var, boolean z) {
        if (z) {
            return vd0.S(bv7Var).M(bv7Var, true);
        }
        long jN = bv7Var.N(0L);
        long jL = bv7Var.l();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jN >> 32));
        return z5c.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jN & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), (((long) Float.floatToRawIntBits((int) (jL & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (jL >> 32)) << 32));
    }
}
