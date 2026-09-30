package defpackage;

import androidx.compose.foundation.layout.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class axa {
    public static final q03 a = u39.c;

    /* JADX WARN: Code duplicated, block: B:116:0x0229  */
    /* JADX WARN: Code duplicated, block: B:118:0x0251  */
    /* JADX WARN: Code duplicated, block: B:121:0x0262  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0073  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d8  */
    public static final void a(float f, float f2, int i, int i2, int i3, long j, long j2, l46 l46Var, j09 j09Var) {
        int i4;
        long jD;
        float f3;
        long j3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        j09 j09Var2;
        long j4;
        float f4;
        int i12;
        long j5;
        float f5;
        ojb ojbVarV;
        j09 j09Var3;
        int i13;
        int i14;
        long j6;
        final int i15;
        final float f6;
        j09 j09Var4;
        int i16;
        final float f7;
        final d5e d5eVar;
        int i17;
        final m27 m27VarW;
        final m27 m27VarW2;
        final m27 m27VarW3;
        boolean z2;
        boolean z3;
        boolean zG;
        Object objR;
        final long j7;
        final long j8;
        l46Var.h0(333154241);
        int i18 = i3 & 1;
        if (i18 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (l46Var.g(j09Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                jD = j;
                int i19 = l46Var.f(jD) ? 32 : 16;
                i4 |= i19;
            } else {
                jD = j;
            }
            i4 |= i19;
        } else {
            jD = j;
        }
        int i20 = i3 & 4;
        if (i20 == 0) {
            if ((i2 & 384) == 0) {
                f3 = f;
                i4 |= l46Var.d(f3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            j3 = j2;
            if ((i3 & 8) == 0 || !l46Var.f(j3)) {
                i5 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            } else {
                i5 = 2048;
            }
            i6 = i4 | i5;
            i7 = i3 & 16;
            if (i7 != 0) {
                i10 = i6 | 24576;
                i8 = i;
            } else {
                i8 = i;
                if (l46Var.e(i8)) {
                    i9 = 16384;
                } else {
                    i9 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i10 = i6 | i9;
            }
            i11 = i10 | 196608;
            if ((i11 & 74899) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i11 & 1, z)) {
                l46Var.b0();
                if ((i2 & 1) != 0 || l46Var.C()) {
                    if (i18 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var;
                    }
                    if ((i3 & 2) != 0) {
                        jD = o82.d(tq.h, l46Var);
                        i13 = i11 & (-113);
                    } else {
                        i13 = i11;
                    }
                    if (i20 != 0) {
                        f3 = 4.0f;
                    }
                    if ((i3 & 8) != 0) {
                        j3 = y72.j;
                        i14 = i13 & (-7169);
                    } else {
                        i14 = i13;
                    }
                    if (i7 != 0) {
                        i8 = 1;
                    }
                    j6 = jD;
                    i15 = i8;
                    f6 = 4.0f;
                    j09Var4 = j09Var3;
                    i16 = i14;
                } else {
                    l46Var.Z();
                    i16 = (i3 & 2) != 0 ? i11 & (-113) : i11;
                    if ((i3 & 8) != 0) {
                        i16 &= -7169;
                    }
                    f6 = f2;
                    j09Var4 = j09Var;
                    j6 = jD;
                    i15 = i8;
                }
                f7 = f3;
                l46Var.s();
                d5eVar = new d5e(((sw3) l46Var.k(zg2.h)).p0(f7), 0.0f, i15, 0, null, 26);
                i17 = i16;
                p27 p27VarC0 = af1.c0(null, l46Var, 1);
                m27VarW = af1.w(p27VarC0, 0.0f, 1080.0f, b21.D(b21.T(6000, 0, hs4.c, 2), null, 6), null, l46Var, 4536, 8);
                zea zeaVar = new zea(14);
                gp7 gp7Var = new gp7();
                zeaVar.d(gp7Var);
                m27VarW2 = af1.w(p27VarC0, 0.0f, 360.0f, b21.D(new hp7(gp7Var), null, 6), null, l46Var, 4536, 8);
                gp7 gp7Var2 = new gp7();
                gp7Var2.a = 6000;
                gp7Var2.a(Float.valueOf(0.87f), 3000).b = a;
                gp7Var2.a(Float.valueOf(0.1f), 6000);
                m27VarW3 = af1.w(p27VarC0, 0.1f, 0.87f, b21.D(new hp7(gp7Var2), null, 6), null, l46Var, 4536, 8);
                j09 j09VarL = b.l(vwc.b(j09Var4, true, new zea(15)), 40.0f);
                boolean zG2 = l46Var.g(m27VarW3);
                if ((57344 & i17) == 16384) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z4 = zG2 | z2;
                if ((i17 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zG = ((((i17 & 112) ^ 48) <= 32 && l46Var.f(j6)) || (i17 & 48) == 32) | z4 | z3 | l46Var.g(m27VarW) | l46Var.g(m27VarW2) | ((((i17 & 7168) ^ 3072) <= 2048 && l46Var.f(j3)) || (i17 & 3072) == 2048) | l46Var.i(d5eVar);
                objR = l46Var.R();
                if (!zG || objR == sf2.a) {
                    j7 = j6;
                    j8 = j3;
                    objR = new a26() { // from class: ywa
                        @Override // defpackage.a26
                        public final Object d(Object obj) {
                            long j9 = j8;
                            d5e d5eVar2 = d5eVar;
                            long j10 = j7;
                            sn4 sn4Var = (sn4) obj;
                            float fFloatValue = ((Number) m27VarW3.getValue()).floatValue() * 360.0f;
                            int i21 = i15;
                            float f8 = f6;
                            if (i21 != 0 && Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)) <= Float.intBitsToFloat((int) (sn4Var.f() >> 32))) {
                                f8 += f7;
                            }
                            float fC0 = (f8 / ((float) (((double) sn4Var.c0(Float.intBitsToFloat((int) (sn4Var.f() >> 32)))) * 3.141592653589793d))) * 360.0f;
                            float fFloatValue2 = ((Number) m27VarW2.getValue()).floatValue() + ((Number) m27VarW.getValue()).floatValue();
                            long jH0 = sn4Var.H0();
                            ta0 ta0VarV0 = sn4Var.v0();
                            long jZ = ta0VarV0.z();
                            ta0VarV0.p().g();
                            try {
                                ((vd9) ta0VarV0.c).F(jH0, fFloatValue2);
                                axa.d(sn4Var, Math.min(fFloatValue, fC0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fC0) * 2.0f), j9, d5eVar2);
                                axa.d(sn4Var, 0.0f, fFloatValue, j10, d5eVar2);
                                return wef.a;
                            } finally {
                                ks0.t(ta0VarV0, jZ);
                            }
                        }
                    };
                    l46Var.p0(objR);
                } else {
                    j7 = j6;
                    j8 = j3;
                }
                nk8.e(0, (a26) objR, l46Var, j09VarL);
                j09Var2 = j09Var4;
                i12 = i15;
                f5 = f6;
                f4 = f7;
                j5 = j8;
                j4 = j7;
            } else {
                l46Var.Z();
                j09Var2 = j09Var;
                j4 = jD;
                f4 = f3;
                i12 = i8;
                j5 = j3;
                f5 = f2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new zwa(j09Var2, j4, f4, j5, i12, f5, i2, i3);
            }
        }
        i4 |= 384;
        f3 = f;
        j3 = j2;
        if ((i3 & 8) == 0) {
            i5 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        } else {
            i5 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        i6 = i4 | i5;
        i7 = i3 & 16;
        if (i7 != 0) {
            i10 = i6 | 24576;
            i8 = i;
        } else {
            i8 = i;
            if (l46Var.e(i8)) {
                i9 = 16384;
            } else {
                i9 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i10 = i6 | i9;
        }
        i11 = i10 | 196608;
        if ((i11 & 74899) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (l46Var.W(i11 & 1, z)) {
            l46Var.b0();
            if ((i2 & 1) != 0) {
                if (i18 != 0) {
                    j09Var3 = g09.a;
                } else {
                    j09Var3 = j09Var;
                }
                if ((i3 & 2) != 0) {
                    jD = o82.d(tq.h, l46Var);
                    i13 = i11 & (-113);
                } else {
                    i13 = i11;
                }
                if (i20 != 0) {
                    f3 = 4.0f;
                }
                if ((i3 & 8) != 0) {
                    j3 = y72.j;
                    i14 = i13 & (-7169);
                } else {
                    i14 = i13;
                }
                if (i7 != 0) {
                    i8 = 1;
                }
                j6 = jD;
                i15 = i8;
                f6 = 4.0f;
                j09Var4 = j09Var3;
                i16 = i14;
            } else {
                if (i18 != 0) {
                    j09Var3 = g09.a;
                } else {
                    j09Var3 = j09Var;
                }
                if ((i3 & 2) != 0) {
                    jD = o82.d(tq.h, l46Var);
                    i13 = i11 & (-113);
                } else {
                    i13 = i11;
                }
                if (i20 != 0) {
                    f3 = 4.0f;
                }
                if ((i3 & 8) != 0) {
                    j3 = y72.j;
                    i14 = i13 & (-7169);
                } else {
                    i14 = i13;
                }
                if (i7 != 0) {
                    i8 = 1;
                }
                j6 = jD;
                i15 = i8;
                f6 = 4.0f;
                j09Var4 = j09Var3;
                i16 = i14;
            }
            f7 = f3;
            l46Var.s();
            d5eVar = new d5e(((sw3) l46Var.k(zg2.h)).p0(f7), 0.0f, i15, 0, null, 26);
            i17 = i16;
            p27 p27VarC1 = af1.c0(null, l46Var, 1);
            m27VarW = af1.w(p27VarC1, 0.0f, 1080.0f, b21.D(b21.T(6000, 0, hs4.c, 2), null, 6), null, l46Var, 4536, 8);
            zea zeaVar2 = new zea(14);
            gp7 gp7Var3 = new gp7();
            zeaVar2.d(gp7Var3);
            m27VarW2 = af1.w(p27VarC1, 0.0f, 360.0f, b21.D(new hp7(gp7Var3), null, 6), null, l46Var, 4536, 8);
            gp7 gp7Var4 = new gp7();
            gp7Var4.a = 6000;
            gp7Var4.a(Float.valueOf(0.87f), 3000).b = a;
            gp7Var4.a(Float.valueOf(0.1f), 6000);
            m27VarW3 = af1.w(p27VarC1, 0.1f, 0.87f, b21.D(new hp7(gp7Var4), null, 6), null, l46Var, 4536, 8);
            j09 j09VarL2 = b.l(vwc.b(j09Var4, true, new zea(15)), 40.0f);
            boolean zG3 = l46Var.g(m27VarW3);
            if ((57344 & i17) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z5 = zG3 | z2;
            if ((i17 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            zG = ((((i17 & 112) ^ 48) <= 32 && l46Var.f(j6)) || (i17 & 48) == 32) | z5 | z3 | l46Var.g(m27VarW) | l46Var.g(m27VarW2) | ((((i17 & 7168) ^ 3072) <= 2048 && l46Var.f(j3)) || (i17 & 3072) == 2048) | l46Var.i(d5eVar);
            objR = l46Var.R();
            if (zG) {
                j7 = j6;
                j8 = j3;
                objR = new a26() { // from class: ywa
                    @Override // defpackage.a26
                    public final Object d(Object obj) {
                        long j9 = j8;
                        d5e d5eVar2 = d5eVar;
                        long j10 = j7;
                        sn4 sn4Var = (sn4) obj;
                        float fFloatValue = ((Number) m27VarW3.getValue()).floatValue() * 360.0f;
                        int i21 = i15;
                        float f8 = f6;
                        if (i21 != 0 && Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)) <= Float.intBitsToFloat((int) (sn4Var.f() >> 32))) {
                            f8 += f7;
                        }
                        float fC0 = (f8 / ((float) (((double) sn4Var.c0(Float.intBitsToFloat((int) (sn4Var.f() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) m27VarW2.getValue()).floatValue() + ((Number) m27VarW.getValue()).floatValue();
                        long jH0 = sn4Var.H0();
                        ta0 ta0VarV0 = sn4Var.v0();
                        long jZ = ta0VarV0.z();
                        ta0VarV0.p().g();
                        try {
                            ((vd9) ta0VarV0.c).F(jH0, fFloatValue2);
                            axa.d(sn4Var, Math.min(fFloatValue, fC0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fC0) * 2.0f), j9, d5eVar2);
                            axa.d(sn4Var, 0.0f, fFloatValue, j10, d5eVar2);
                            return wef.a;
                        } finally {
                            ks0.t(ta0VarV0, jZ);
                        }
                    }
                };
                l46Var.p0(objR);
            } else {
                j7 = j6;
                j8 = j3;
                objR = new a26() { // from class: ywa
                    @Override // defpackage.a26
                    public final Object d(Object obj) {
                        long j9 = j8;
                        d5e d5eVar2 = d5eVar;
                        long j10 = j7;
                        sn4 sn4Var = (sn4) obj;
                        float fFloatValue = ((Number) m27VarW3.getValue()).floatValue() * 360.0f;
                        int i21 = i15;
                        float f8 = f6;
                        if (i21 != 0 && Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)) <= Float.intBitsToFloat((int) (sn4Var.f() >> 32))) {
                            f8 += f7;
                        }
                        float fC0 = (f8 / ((float) (((double) sn4Var.c0(Float.intBitsToFloat((int) (sn4Var.f() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) m27VarW2.getValue()).floatValue() + ((Number) m27VarW.getValue()).floatValue();
                        long jH0 = sn4Var.H0();
                        ta0 ta0VarV0 = sn4Var.v0();
                        long jZ = ta0VarV0.z();
                        ta0VarV0.p().g();
                        try {
                            ((vd9) ta0VarV0.c).F(jH0, fFloatValue2);
                            axa.d(sn4Var, Math.min(fFloatValue, fC0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fC0) * 2.0f), j9, d5eVar2);
                            axa.d(sn4Var, 0.0f, fFloatValue, j10, d5eVar2);
                            return wef.a;
                        } finally {
                            ks0.t(ta0VarV0, jZ);
                        }
                    }
                };
                l46Var.p0(objR);
            }
            nk8.e(0, (a26) objR, l46Var, j09VarL2);
            j09Var2 = j09Var4;
            i12 = i15;
            f5 = f6;
            f4 = f7;
            j5 = j8;
            j4 = j7;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            j4 = jD;
            f4 = f3;
            i12 = i8;
            j5 = j3;
            f5 = f2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new zwa(j09Var2, j4, f4, j5, i12, f5, i2, i3);
        }
    }

    public static final void b(final x16 x16Var, final j09 j09Var, final long j, final float f, final long j2, float f2, l46 l46Var, final int i) {
        int i2;
        final float f3;
        final float f4;
        l46Var.h0(-1798883595);
        if ((i & 6) == 0) {
            i2 = (l46Var.i(x16Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(j09Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.f(j) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.d(f) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.f(j2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var.e(1) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        if (l46Var.W(i3 & 1, (599187 & i3) != 599186)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                f4 = 4.0f;
            } else {
                l46Var.Z();
                f4 = f2;
            }
            l46Var.s();
            boolean z = (i3 & 14) == 4;
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (z || objR == obj) {
                objR = new yca(6, x16Var);
                l46Var.p0(objR);
            }
            final x16 x16Var2 = (x16) objR;
            final d5e d5eVar = new d5e(((sw3) l46Var.k(zg2.h)).p0(f), 0.0f, 1, 0, null, 26);
            boolean zG = l46Var.g(x16Var2);
            Object objR2 = l46Var.R();
            if (zG || objR2 == obj) {
                objR2 = new p9(25, x16Var2);
                l46Var.p0(objR2);
            }
            j09 j09VarL = b.l(vwc.b(j09Var, true, (a26) objR2), 40.0f);
            boolean zG2 = ((i3 & 458752) == 131072) | l46Var.g(x16Var2) | ((3670016 & i3) == 1048576) | ((i3 & 7168) == 2048) | ((((57344 & i3) ^ 24576) > 16384 && l46Var.f(j2)) || (i3 & 24576) == 16384) | l46Var.i(d5eVar) | ((((i3 & 896) ^ 384) > 256 && l46Var.f(j)) || (i3 & 384) == 256);
            Object objR3 = l46Var.R();
            if (zG2 || objR3 == obj) {
                Object obj2 = new a26() { // from class: uwa
                    @Override // defpackage.a26
                    public final Object d(Object obj3) {
                        sn4 sn4Var = (sn4) obj3;
                        float fFloatValue = ((Number) x16Var2.invoke()).floatValue() * 360.0f;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (sn4Var.f() >> 32));
                        float f5 = f4;
                        if (fIntBitsToFloat <= fIntBitsToFloat2) {
                            f5 += f;
                        }
                        float fC0 = (f5 / ((float) (((double) sn4Var.c0(Float.intBitsToFloat((int) (sn4Var.f() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fMin = Math.min(fFloatValue, fC0) + 270.0f + fFloatValue;
                        float fMin2 = (360.0f - fFloatValue) - (Math.min(fFloatValue, fC0) * 2.0f);
                        long j3 = j2;
                        d5e d5eVar2 = d5eVar;
                        axa.d(sn4Var, fMin, fMin2, j3, d5eVar2);
                        axa.d(sn4Var, 270.0f, fFloatValue, j, d5eVar2);
                        return wef.a;
                    }
                };
                l46Var.p0(obj2);
                objR3 = obj2;
            }
            nk8.e(0, (a26) objR3, l46Var, j09VarL);
            f3 = f4;
        } else {
            l46Var.Z();
            f3 = f2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: vwa
                @Override // defpackage.l26
                public final Object z(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    axa.b(x16Var, j09Var, j, f, j2, f3, (l46) obj3, k99.P(i | 1));
                    return wef.a;
                }
            };
        }
    }

    public static final void c(final x16 x16Var, final j09 j09Var, long j, long j2, int i, final float f, final a26 a26Var, l46 l46Var, final int i2, final int i3) {
        int i4;
        int i5;
        final long j3;
        final long j4;
        final int i6;
        final long j5;
        final long j6;
        l46Var.h0(-339970038);
        int i7 = i2 | (l46Var.i(x16Var) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i7 |= l46Var.g(j09Var) ? 32 : 16;
        }
        long jD = j;
        long jD2 = j2;
        int i8 = i7 | (((i3 & 4) == 0 && l46Var.f(jD)) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (((i3 & 8) == 0 && l46Var.f(jD2)) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        int i9 = i3 & 16;
        if (i9 != 0) {
            i5 = i8 | 24576;
            i4 = i;
        } else {
            i4 = i;
            i5 = i8 | (l46Var.e(i4) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        }
        boolean z = true;
        if (l46Var.W(i5 & 1, (599187 & i5) != 599186)) {
            l46Var.b0();
            if ((i2 & 1) == 0 || l46Var.C()) {
                if ((i3 & 4) != 0) {
                    jD = o82.d(tq.h, l46Var);
                    i5 &= -897;
                }
                if ((i3 & 8) != 0) {
                    jD2 = o82.d(tq.i, l46Var);
                    i5 &= -7169;
                }
                if (i9 != 0) {
                    i4 = 1;
                }
            } else {
                l46Var.Z();
                if ((i3 & 4) != 0) {
                    i5 &= -897;
                }
                if ((i3 & 8) != 0) {
                    i5 &= -7169;
                }
            }
            final int i10 = i4;
            l46Var.s();
            boolean z2 = (i5 & 14) == 4;
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (z2 || objR == obj) {
                objR = new yca(7, x16Var);
                l46Var.p0(objR);
            }
            final x16 x16Var2 = (x16) objR;
            j09 j09VarD = j09Var.D(c7.b);
            boolean zG = l46Var.g(x16Var2);
            Object objR2 = l46Var.R();
            if (zG || objR2 == obj) {
                objR2 = new p9(26, x16Var2);
                l46Var.p0(objR2);
            }
            j09 j09VarM = b.m(vwc.b(j09VarD, true, (a26) objR2), 240.0f, 4.0f);
            boolean zG2 = ((((i5 & 7168) ^ 3072) > 2048 && l46Var.f(jD2)) || (i5 & 3072) == 2048) | ((57344 & i5) == 16384) | l46Var.g(x16Var2);
            if ((((i5 & 896) ^ 384) <= 256 || !l46Var.f(jD)) && (i5 & 384) != 256) {
                z = false;
            }
            boolean z3 = zG2 | z;
            Object objR3 = l46Var.R();
            if (z3 || objR3 == obj) {
                j5 = jD;
                j6 = jD2;
                objR3 = new a26() { // from class: wwa
                    @Override // defpackage.a26
                    public final Object d(Object obj2) {
                        sn4 sn4Var = (sn4) obj2;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L));
                        int i11 = i10;
                        float fC0 = f;
                        if (i11 != 0 && Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)) <= Float.intBitsToFloat((int) (sn4Var.f() >> 32))) {
                            fC0 += sn4Var.c0(fIntBitsToFloat);
                        }
                        float fC1 = fC0 / sn4Var.c0(Float.intBitsToFloat((int) (sn4Var.f() >> 32)));
                        float fFloatValue = ((Number) x16Var2.invoke()).floatValue();
                        float fMin = Math.min(fFloatValue, fC1) + fFloatValue;
                        if (fMin <= 1.0f) {
                            axa.e(sn4Var, fMin, 1.0f, j6, fIntBitsToFloat, i11);
                        }
                        axa.e(sn4Var, 0.0f, fFloatValue, j5, fIntBitsToFloat, i11);
                        a26Var.d(sn4Var);
                        return wef.a;
                    }
                };
                l46Var.p0(objR3);
            } else {
                j5 = jD;
                j6 = jD2;
            }
            nk8.e(0, (a26) objR3, l46Var, j09VarM);
            i6 = i10;
            j4 = j6;
            j3 = j5;
        } else {
            l46Var.Z();
            j3 = jD;
            j4 = jD2;
            i6 = i4;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: xwa
                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    axa.c(x16Var, j09Var, j3, j4, i6, f, a26Var, (l46) obj2, k99.P(i2 | 1), i3);
                    return wef.a;
                }
            };
        }
    }

    public static final void d(sn4 sn4Var, float f, float f2, long j, d5e d5eVar) {
        float f3 = d5eVar.a / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (sn4Var.f() >> 32)) - (2.0f * f3);
        sn4Var.X0(j, f, f2, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), d5eVar);
    }

    public static final void e(sn4 sn4Var, float f, float f2, long j, float f3, int i) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (sn4Var.f() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L));
        float f4 = fIntBitsToFloat2 / 2.0f;
        boolean z = sn4Var.getLayoutDirection() == cv7.a;
        float f5 = (z ? f : 1.0f - f2) * fIntBitsToFloat;
        float f6 = (z ? f2 : 1.0f - f) * fIntBitsToFloat;
        if (i == 0 || fIntBitsToFloat2 > fIntBitsToFloat) {
            sn4.V0(sn4Var, j, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), f3, 0, null, 496);
            return;
        }
        float f7 = f3 / 2.0f;
        float f8 = fIntBitsToFloat - f7;
        if (f5 < f7) {
            f5 = f7;
        }
        if (f5 > f8) {
            f5 = f8;
        }
        if (f6 < f7) {
            f6 = f7;
        }
        if (f6 <= f8) {
            f8 = f6;
        }
        if (Math.abs(f2 - f) > 0.0f) {
            sn4.V0(sn4Var, j, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), f3, i, null, 480);
        }
    }
}
