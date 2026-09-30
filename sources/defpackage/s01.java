package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s01 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s01(xh6 xh6Var, float f, long j) {
        this.a = 0;
        this.d = xh6Var;
        this.c = f;
        this.b = j;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0279  */
    /* JADX WARN: Code duplicated, block: B:143:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:60:0x017c  */
    /* JADX WARN: Code duplicated, block: B:79:0x01bd  */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        float f = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                xh6 xh6Var = (xh6) obj2;
                long j = this.b;
                sn4 sn4Var = (sn4) obj;
                sn4Var.getClass();
                lw7 lw7Var = zh6.a;
                long j2 = xh6Var.U0;
                if (j2 == 16) {
                    j2 = xh6Var.K0.a;
                }
                if (j2 == 16) {
                    j2 = xh6Var.J0.a;
                }
                if (j2 != 16) {
                    sn4.y0(sn4Var, j2, 0L, 0L, 0.0f, null, 0, 126);
                }
                ta0 ta0VarV0 = sn4Var.v0();
                long jZ = ta0VarV0.z();
                ta0VarV0.p().g();
                try {
                    long j3 = 0;
                    ((vd9) ta0VarV0.c).G(f, f, 0L);
                    long jF = hl9.f(j, xh6Var.L0);
                    if (((((jF & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) != 0 || hl9.c(jF, 0L)) {
                        for (sh6 sh6Var : xh6Var.a1) {
                            if (sh6Var.g) {
                                throw new IllegalArgumentException("Modifier.haze nodes can not draw Modifier.hazeChild nodes. This should not happen if you are providing correct values for zIndex on Modifier.haze. Alternatively you can use can `canDrawArea` to to filter out parent areas.");
                            }
                            ird irdVarJ = iqf.j();
                            a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
                            ird irdVarL = iqf.l(irdVarJ);
                            try {
                                long jB = sh6Var.b();
                                if ((jB & 9223372034707292159L) == 9205357640488583168L) {
                                    jB = 0;
                                }
                                iqf.p(irdVarJ, irdVarL, a26VarE);
                                if (((((jB & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) != 0 || hl9.c(jB, 0L)) {
                                    ke6 ke6VarA = sh6Var.a();
                                    if (ke6VarA == null) {
                                        ke6VarA = null;
                                    } else {
                                        if (ke6VarA.s) {
                                            ke6VarA = null;
                                        }
                                        if (ke6VarA != null) {
                                            long j4 = ke6VarA.u;
                                            if (((int) (j4 >> 32)) <= 0 || ((int) (j4 & 4294967295L)) <= 0) {
                                                ke6VarA = null;
                                            }
                                        } else {
                                            ke6VarA = null;
                                        }
                                    }
                                    if (ke6VarA != null) {
                                        i7h.r(sn4Var, ke6VarA);
                                    }
                                } else {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB & 4294967295L));
                                    ((vd9) sn4Var.v0().c).I(fIntBitsToFloat, fIntBitsToFloat2);
                                    try {
                                        ke6 ke6VarA2 = sh6Var.a();
                                        if (ke6VarA2 == null) {
                                            ke6VarA2 = null;
                                        } else {
                                            if (ke6VarA2.s) {
                                                ke6VarA2 = null;
                                            }
                                            if (ke6VarA2 != null) {
                                                long j5 = ke6VarA2.u;
                                                if (((int) (j5 >> 32)) <= 0 || ((int) (j5 & 4294967295L)) <= 0) {
                                                    ke6VarA2 = null;
                                                }
                                            } else {
                                                ke6VarA2 = null;
                                            }
                                        }
                                        if (ke6VarA2 != null) {
                                            i7h.r(sn4Var, ke6VarA2);
                                        }
                                        ((vd9) sn4Var.v0().c).I(-fIntBitsToFloat, -fIntBitsToFloat2);
                                    } catch (Throwable th) {
                                        ((vd9) sn4Var.v0().c).I(-fIntBitsToFloat, -fIntBitsToFloat2);
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                iqf.p(irdVarJ, irdVarL, a26VarE);
                                throw th2;
                            }
                        }
                    } else {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jF >> 32));
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jF & 4294967295L));
                        ((vd9) sn4Var.v0().c).I(fIntBitsToFloat3, fIntBitsToFloat4);
                        try {
                            for (sh6 sh6Var2 : xh6Var.a1) {
                                if (sh6Var2.g) {
                                    throw new IllegalArgumentException("Modifier.haze nodes can not draw Modifier.hazeChild nodes. This should not happen if you are providing correct values for zIndex on Modifier.haze. Alternatively you can use can `canDrawArea` to to filter out parent areas.");
                                }
                                ird irdVarJ2 = iqf.j();
                                a26 a26VarE2 = irdVarJ2 != null ? irdVarJ2.e() : null;
                                ird irdVarL2 = iqf.l(irdVarJ2);
                                try {
                                    long jB2 = sh6Var2.b();
                                    if ((jB2 & 9223372034707292159L) != 9205357640488583168L) {
                                        j3 = jB2;
                                    }
                                    iqf.p(irdVarJ2, irdVarL2, a26VarE2);
                                    if (((((j3 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) != j3 || hl9.c(j3, j3)) {
                                        ke6 ke6VarA3 = sh6Var2.a();
                                        if (ke6VarA3 == null) {
                                            ke6VarA3 = null;
                                        } else {
                                            if (ke6VarA3.s) {
                                                ke6VarA3 = null;
                                            }
                                            if (ke6VarA3 != null) {
                                                long j6 = ke6VarA3.u;
                                                if (((int) (j6 >> 32)) <= 0 || ((int) (j6 & 4294967295L)) <= 0) {
                                                    ke6VarA3 = null;
                                                }
                                            } else {
                                                ke6VarA3 = null;
                                            }
                                        }
                                        if (ke6VarA3 != null) {
                                            i7h.r(sn4Var, ke6VarA3);
                                        }
                                    } else {
                                        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (j3 >> 32));
                                        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (j3 & 4294967295L));
                                        ((vd9) sn4Var.v0().c).I(fIntBitsToFloat5, fIntBitsToFloat6);
                                        try {
                                            ke6 ke6VarA4 = sh6Var2.a();
                                            if (ke6VarA4 == null) {
                                                ke6VarA4 = null;
                                            } else {
                                                if (ke6VarA4.s) {
                                                    ke6VarA4 = null;
                                                }
                                                if (ke6VarA4 != null) {
                                                    long j7 = ke6VarA4.u;
                                                    if (((int) (j7 >> 32)) <= 0 || ((int) (j7 & 4294967295L)) <= 0) {
                                                        ke6VarA4 = null;
                                                    }
                                                } else {
                                                    ke6VarA4 = null;
                                                }
                                            }
                                            if (ke6VarA4 != null) {
                                                i7h.r(sn4Var, ke6VarA4);
                                            }
                                            ((vd9) sn4Var.v0().c).I(-fIntBitsToFloat5, -fIntBitsToFloat6);
                                        } catch (Throwable th3) {
                                            ((vd9) sn4Var.v0().c).I(-fIntBitsToFloat5, -fIntBitsToFloat6);
                                            throw th3;
                                        }
                                    }
                                    j3 = 0;
                                } catch (Throwable th4) {
                                    iqf.p(irdVarJ2, irdVarL2, a26VarE2);
                                    throw th4;
                                }
                            }
                            ((vd9) sn4Var.v0().c).I(-fIntBitsToFloat3, -fIntBitsToFloat4);
                        } catch (Throwable th5) {
                            ((vd9) sn4Var.v0().c).I(-fIntBitsToFloat3, -fIntBitsToFloat4);
                            throw th5;
                        }
                    }
                    ks0.t(ta0VarV0, jZ);
                    return wefVar;
                } catch (Throwable th6) {
                    ks0.t(ta0VarV0, jZ);
                    throw th6;
                }
            case 1:
                sn4 sn4Var2 = (sn4) obj;
                sn4Var2.getClass();
                rs0.w(sn4Var2, (us9) obj2, this.b, new d5e(f * 2.0f, 0.0f, 0, 0, null, 30), 52);
                return wefVar;
            default:
                sn4 sn4Var3 = (sn4) obj;
                sn4Var3.getClass();
                rs0.w(sn4Var3, (vs9) obj2, this.b, new d5e(f * 2.0f, 0.0f, 0, 0, null, 30), 52);
                return wefVar;
        }
    }

    public /* synthetic */ s01(vs9 vs9Var, long j, float f, int i) {
        this.a = i;
        this.d = vs9Var;
        this.b = j;
        this.c = f;
    }
}
