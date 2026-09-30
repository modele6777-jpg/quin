package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dpe {
    public static final String a = c5e.y(10, "H");

    public static long a(mue mueVar, sw3 sw3Var, xp5 xp5Var) throws IOException {
        tt ttVarB = b(mueVar, sw3Var, xp5Var, 1, false);
        return (((long) gdc.c(ttVarB.a.g())) << 32) | (((long) gdc.c(ttVarB.f)) & 4294967295L);
    }

    public static final tt b(mue mueVar, sw3 sw3Var, xp5 xp5Var, int i, boolean z) throws IOException {
        String strD0 = s72.D0(mh3.c0(0, i), "\n", null, null, new ule(1), 30);
        pu4 pu4Var = pu4.a;
        return new tt(new xt(strD0, mueVar, pu4Var, pu4Var, xp5Var, sw3Var, z), i, 1, ll2.b(0, 0, 0, 0, 15));
    }
}
