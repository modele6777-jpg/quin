package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.q6;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b6e {
    public static final int[] a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final a6e n;

    static {
        int[] iArr = new int[61];
        a = iArr;
        iArr[2] = iArr[2] | 1;
        iArr[3] = iArr[3] | 1;
        iArr[0] = iArr[0] | 1;
        iArr[1] = iArr[1] | 1;
        iArr[6] = iArr[6] | 8;
        iArr[7] = iArr[7] | 8;
        iArr[4] = iArr[4] | 8;
        iArr[5] = iArr[5] | 8;
        iArr[8] = 3 | iArr[8];
        iArr[35] = iArr[35] | 2;
        iArr[50] = iArr[50] | 2;
        iArr[9] = iArr[9] | 8;
        iArr[10] = iArr[10] | 8;
        iArr[11] = iArr[11] | 8;
        iArr[12] = iArr[12] | 8;
        iArr[13] = iArr[13] | 8;
        iArr[14] = iArr[14] | 8;
        iArr[15] = iArr[15] | 8;
        iArr[16] = iArr[16] | 8;
        iArr[17] = iArr[17] | 8;
        iArr[18] = iArr[18] | 8;
        iArr[19] = iArr[19] | 8;
        iArr[20] = iArr[20] | 8;
        iArr[21] = iArr[21] | 4;
        iArr[22] = iArr[22] | 4;
        iArr[23] = iArr[23] | 4;
        iArr[24] = iArr[24] | 4;
        iArr[25] = iArr[25] | 4;
        iArr[29] = iArr[29] | 4;
        iArr[30] = iArr[30] | 4;
        iArr[26] = iArr[26] | 4;
        iArr[27] = iArr[27] | 4;
        iArr[28] = iArr[28] | 4;
        iArr[32] = iArr[32] | 4;
        iArr[34] = iArr[34] | 2;
        iArr[51] = iArr[51] | 2;
        iArr[36] = iArr[36] | 2;
        iArr[52] = iArr[52] | 2;
        iArr[31] = iArr[31] | 4;
        iArr[53] = iArr[53] | 2;
        iArr[54] = iArr[54] | 4;
        iArr[55] = iArr[55] | 2;
        iArr[56] = iArr[56] | 2;
        iArr[37] = iArr[37] | 32;
        iArr[57] = iArr[57] | 32;
        iArr[58] = iArr[58] | 48;
        iArr[59] = iArr[59] | 48;
        iArr[60] = iArr[60] | 48;
        iArr[46] = iArr[46] | 48;
        iArr[47] = iArr[47] | 48;
        iArr[48] = iArr[48] | 48;
        iArr[43] = iArr[43] | 48;
        iArr[49] = iArr[49] | 48;
        iArr[39] = iArr[39] | 48;
        iArr[40] = iArr[40] | 48;
        iArr[41] = iArr[41] | 48;
        iArr[42] = iArr[42] | 48;
        iArr[44] = iArr[44] | 48;
        iArr[45] = iArr[45] | 48;
        iArr[38] = iArr[38] | 48;
        b = f(1);
        c = f(8);
        d = f(2);
        e = f(4);
        f = f(32);
        g = f(16);
        h = d(1);
        i = d(8);
        j = d(2);
        k = d(4);
        l = d(32);
        m = d(16);
        n = new a6e();
    }

    /* JADX WARN: Code duplicated, block: B:232:0x0540  */
    /* JADX WARN: Code duplicated, block: B:249:0x056f  */
    /* JADX WARN: Code duplicated, block: B:250:0x0571  */
    public static final void a(a6e a6eVar, a6e a6eVar2, t5e t5eVar, long j2, int i2, a6e a6eVar3) {
        double d2;
        int i3;
        float f2;
        ete eteVar;
        long j3;
        long j4;
        long j5;
        c82 k58Var;
        Object objB;
        long jI = i(i2, j2);
        int iH = h(i2, j2) & (a6eVar.b | a6eVar2.b);
        long j6 = (a6eVar.a | a6eVar2.a) & jI;
        if ((iH & 135) != 0) {
            if ((iH & 1) != 0) {
                j6 &= -34359738369L;
            }
            if ((iH & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                j6 &= -137438953473L;
            }
            if ((iH & 2) != 0) {
                j6 &= -17179869185L;
            }
            if ((iH & 4) != 0) {
                j6 &= -68719476737L;
            }
        }
        long j7 = 0;
        if (j6 == 0 && iH == 0) {
            return;
        }
        float f3 = 1.0f;
        if ((c & j6) != 0) {
            if ((j6 & 16) != 0) {
                float fD = t5eVar.d(4);
                float f4 = a6eVar.g;
                float f5 = a6eVar2.g;
                boolean zIsNaN = Float.isNaN(f4);
                boolean zIsNaN2 = Float.isNaN(f5);
                float f6 = (fD * f5) + ((1.0f - fD) * f4);
                if (zIsNaN) {
                    f4 = f5;
                } else if (!zIsNaN2) {
                    f4 = f6;
                }
                a6eVar3.a |= 16;
                a6eVar3.g = f4;
            }
            if ((j6 & 32) != j7) {
                float fD2 = t5eVar.d(5);
                float f7 = a6eVar.h;
                float f8 = a6eVar2.h;
                boolean zIsNaN3 = Float.isNaN(f7);
                boolean zIsNaN4 = Float.isNaN(f8);
                float f9 = (fD2 * f8) + ((1.0f - fD2) * f7);
                if (zIsNaN3) {
                    f7 = f8;
                } else if (!zIsNaN4) {
                    f7 = f9;
                }
                a6eVar3.a = 32 | a6eVar3.a;
                a6eVar3.h = f7;
            }
            if ((j6 & 64) != j7) {
                float fD3 = t5eVar.d(6);
                float f10 = a6eVar.i;
                float f11 = a6eVar2.i;
                boolean zIsNaN5 = Float.isNaN(f10);
                boolean zIsNaN6 = Float.isNaN(f11);
                float f12 = (fD3 * f11) + ((1.0f - fD3) * f10);
                if (zIsNaN5) {
                    f10 = f11;
                } else if (!zIsNaN6) {
                    f10 = f12;
                }
                a6eVar3.a = 64 | a6eVar3.a;
                a6eVar3.i = f10;
            }
            if ((j6 & 128) != j7) {
                float fD4 = t5eVar.d(7);
                float f13 = a6eVar.j;
                float f14 = a6eVar2.j;
                boolean zIsNaN7 = Float.isNaN(f13);
                boolean zIsNaN8 = Float.isNaN(f14);
                float f15 = (fD4 * f14) + ((1.0f - fD4) * f13);
                if (zIsNaN7) {
                    f13 = f14;
                } else if (!zIsNaN8) {
                    f13 = f15;
                }
                a6eVar3.a = 128 | a6eVar3.a;
                a6eVar3.j = f13;
            }
            if ((j6 & 8192) != j7) {
                float fD5 = t5eVar.d(13);
                float f16 = a6eVar.p;
                float f17 = a6eVar2.p;
                boolean zIsNaN9 = Float.isNaN(f16);
                boolean zIsNaN10 = Float.isNaN(f17);
                float f18 = (fD5 * f17) + ((1.0f - fD5) * f16);
                if (zIsNaN9) {
                    f16 = f17;
                } else if (!zIsNaN10) {
                    f16 = f18;
                }
                a6eVar3.a = 8192 | a6eVar3.a;
                a6eVar3.p = f16;
            }
            if ((j6 & 16384) != j7) {
                float fD6 = t5eVar.d(14);
                float f19 = a6eVar.q;
                float f20 = a6eVar2.q;
                boolean zIsNaN11 = Float.isNaN(f19);
                boolean zIsNaN12 = Float.isNaN(f20);
                float f21 = (fD6 * f20) + ((1.0f - fD6) * f19);
                if (zIsNaN11) {
                    f19 = f20;
                } else if (!zIsNaN12) {
                    f19 = f21;
                }
                a6eVar3.a = 16384 | a6eVar3.a;
                a6eVar3.q = f19;
            }
            if ((j6 & 32768) != j7) {
                float fD7 = t5eVar.d(15);
                float f22 = a6eVar.r;
                float f23 = a6eVar2.r;
                boolean zIsNaN13 = Float.isNaN(f22);
                boolean zIsNaN14 = Float.isNaN(f23);
                float f24 = (fD7 * f23) + ((1.0f - fD7) * f22);
                if (zIsNaN13) {
                    f22 = f23;
                } else if (!zIsNaN14) {
                    f22 = f24;
                }
                a6eVar3.a = 32768 | a6eVar3.a;
                a6eVar3.r = f22;
            }
            if ((j6 & 65536) != j7) {
                float fD8 = t5eVar.d(16);
                float f25 = a6eVar.s;
                float f26 = a6eVar2.s;
                boolean zIsNaN15 = Float.isNaN(f25);
                boolean zIsNaN16 = Float.isNaN(f26);
                float f27 = (fD8 * f26) + ((1.0f - fD8) * f25);
                if (zIsNaN15) {
                    f25 = f26;
                } else if (!zIsNaN16) {
                    f25 = f27;
                }
                a6eVar3.a = 65536 | a6eVar3.a;
                a6eVar3.s = f25;
            }
            if ((512 & j6) != j7) {
                float fD9 = t5eVar.d(9);
                float f28 = a6eVar.l;
                float f29 = a6eVar2.l;
                boolean zIsNaN17 = Float.isNaN(f28);
                boolean zIsNaN18 = Float.isNaN(f29);
                float f30 = (fD9 * f29) + ((1.0f - fD9) * f28);
                if (zIsNaN17) {
                    f28 = f29;
                } else if (!zIsNaN18) {
                    f28 = f30;
                }
                a6eVar3.C(f28);
            }
            if ((1024 & j6) != j7) {
                float fD10 = t5eVar.d(10);
                float f31 = a6eVar.m;
                float f32 = a6eVar2.m;
                boolean zIsNaN19 = Float.isNaN(f31);
                boolean zIsNaN20 = Float.isNaN(f32);
                float f33 = (fD10 * f32) + ((1.0f - fD10) * f31);
                if (zIsNaN19) {
                    f31 = f32;
                } else if (!zIsNaN20) {
                    f31 = f33;
                }
                a6eVar3.x(f31);
            }
            if ((j6 & 2048) != j7) {
                float fD11 = t5eVar.d(11);
                float f34 = a6eVar.n;
                float f35 = a6eVar2.n;
                boolean zIsNaN21 = Float.isNaN(f34);
                boolean zIsNaN22 = Float.isNaN(f35);
                float f36 = (fD11 * f35) + ((1.0f - fD11) * f34);
                if (zIsNaN21) {
                    f34 = f35;
                } else if (!zIsNaN22) {
                    f34 = f36;
                }
                a6eVar3.a = 2048 | (a6eVar3.a & (-513));
                a6eVar3.n = f34;
                a6eVar3.l = Float.NaN;
            }
            if ((j6 & 4096) != j7) {
                float fD12 = t5eVar.d(12);
                float f37 = a6eVar.o;
                float f38 = a6eVar2.o;
                boolean zIsNaN23 = Float.isNaN(f37);
                boolean zIsNaN24 = Float.isNaN(f38);
                float f39 = (fD12 * f38) + ((1.0f - fD12) * f37);
                if (zIsNaN23) {
                    f37 = f38;
                } else if (!zIsNaN24) {
                    f37 = f39;
                }
                a6eVar3.a = 4096 | (a6eVar3.a & (-1025));
                a6eVar3.o = f37;
                a6eVar3.m = Float.NaN;
            }
            if ((j6 & 131072) != j7) {
                float fD13 = t5eVar.d(17);
                float f40 = a6eVar.v;
                float f41 = a6eVar2.v;
                boolean zIsNaN25 = Float.isNaN(f40);
                boolean zIsNaN26 = Float.isNaN(f41);
                float f42 = (fD13 * f41) + ((1.0f - fD13) * f40);
                if (zIsNaN25) {
                    f40 = f41;
                } else if (!zIsNaN26) {
                    f40 = f42;
                }
                a6eVar3.a = 131072 | a6eVar3.a;
                a6eVar3.v = f40;
            }
            if ((j6 & 524288) != j7) {
                float fD14 = t5eVar.d(19);
                float f43 = a6eVar.w;
                float f44 = a6eVar2.w;
                boolean zIsNaN27 = Float.isNaN(f43);
                boolean zIsNaN28 = Float.isNaN(f44);
                float f45 = (fD14 * f44) + ((1.0f - fD14) * f43);
                if (zIsNaN27) {
                    f43 = f44;
                } else if (!zIsNaN28) {
                    f43 = f45;
                }
                a6eVar3.a = 524288 | a6eVar3.a;
                a6eVar3.w = f43;
            }
            if ((j6 & 262144) != j7) {
                float fD15 = t5eVar.d(18);
                float f46 = a6eVar.t;
                float f47 = a6eVar2.t;
                boolean zIsNaN29 = Float.isNaN(f46);
                boolean zIsNaN30 = Float.isNaN(f47);
                float f48 = (fD15 * f47) + ((1.0f - fD15) * f46);
                if (zIsNaN29) {
                    f46 = f47;
                } else if (!zIsNaN30) {
                    f46 = f48;
                }
                a6eVar3.a = 262144 | a6eVar3.a;
                a6eVar3.t = f46;
            }
            if ((j6 & q6.MAX_EVENT_SIZE_BYTES) != j7) {
                float fD16 = t5eVar.d(20);
                float f49 = a6eVar.u;
                float f50 = a6eVar2.u;
                boolean zIsNaN31 = Float.isNaN(f49);
                boolean zIsNaN32 = Float.isNaN(f50);
                float f51 = (fD16 * f50) + ((1.0f - fD16) * f49);
                if (zIsNaN31) {
                    f49 = f50;
                } else if (!zIsNaN32) {
                    f49 = f51;
                }
                a6eVar3.a = q6.MAX_EVENT_SIZE_BYTES | a6eVar3.a;
                a6eVar3.u = f49;
            }
        } else {
            j7 = 0;
        }
        if ((b & j6) != j7) {
            if ((j6 & 1) != j7) {
                float fP = abg.P(a6eVar.c, a6eVar2.c, t5eVar.d(0));
                a6eVar3.a = 1 | a6eVar3.a;
                a6eVar3.c = fP;
            }
            if ((j6 & 2) != j7) {
                float fP2 = abg.P(a6eVar.d, a6eVar2.d, t5eVar.d(1));
                a6eVar3.a = 2 | a6eVar3.a;
                a6eVar3.d = fP2;
            }
            if ((j6 & 4) != j7) {
                float fP3 = abg.P(a6eVar.e, a6eVar2.e, t5eVar.d(2));
                a6eVar3.a = 4 | a6eVar3.a;
                a6eVar3.e = fP3;
            }
            if ((j6 & 8) != j7) {
                float fP4 = abg.P(a6eVar.f, a6eVar2.f, t5eVar.d(3));
                a6eVar3.a = 8 | a6eVar3.a;
                a6eVar3.f = fP4;
            }
        }
        if ((d & j6) != j7) {
            if ((j6 & 256) != j7) {
                float fP5 = abg.P(a6eVar.k, a6eVar2.k, t5eVar.d(8));
                a6eVar3.a |= 256;
                a6eVar3.k = fP5;
            }
            if ((34359738368L & j6) != j7) {
                a6eVar3.d(abg.R(a6eVar.x, a6eVar2.x, t5eVar.d(50)));
            }
            if ((17179869184L & j6) != j7) {
                a6eVar3.b(abg.R(a6eVar.z, a6eVar2.z, t5eVar.d(51)));
            }
            if ((j6 & 68719476736L) != j7) {
                long jR = abg.R(a6eVar.B, a6eVar2.B, t5eVar.d(52));
                a6eVar3.a |= 68719476736L;
                a6eVar3.b &= -5;
                a6eVar3.B = jR;
                a6eVar3.C = null;
            }
        } else {
            f3 = 1.0f;
        }
        if ((j & iH) != 0) {
            if ((iH & 1) != 0) {
                d2 = 0.5d;
                i3 = 32;
                f2 = 0.5f;
                a6eVar3.c(b(a6eVar.y, a6eVar.x, a6eVar2.y, a6eVar2.x, t5eVar.d(50)));
            } else {
                d2 = 0.5d;
                i3 = 32;
                f2 = 0.5f;
            }
            if ((iH & 2) != 0) {
                a6eVar3.a(b(a6eVar.A, a6eVar.z, a6eVar2.A, a6eVar2.z, t5eVar.d(51)));
            }
            if ((iH & 4) != 0) {
                a6eVar3.m(b(a6eVar.C, a6eVar.B, a6eVar2.C, a6eVar2.B, t5eVar.d(52)));
            }
            if ((iH & 64) != 0) {
                Object objC = c(a6eVar.G, a6eVar2.G, t5eVar.d(56));
                int i4 = a6eVar3.b;
                a6eVar3.b = objC != null ? i4 | 64 : i4 & (-65);
                a6eVar3.G = objC;
            }
            if ((iH & 32) != 0) {
                Object objC2 = c(a6eVar.F, a6eVar2.F, t5eVar.d(55));
                int i5 = a6eVar3.b;
                a6eVar3.b = objC2 != null ? i5 | 32 : i5 & (-33);
                a6eVar3.F = objC2;
            }
            if ((iH & 8) != 0) {
                float fD17 = t5eVar.d(53);
                x4d x4dVar = a6eVar.E;
                x4d x4dVar2 = a6eVar2.E;
                if (fD17 != 0.0f) {
                    if (fD17 != f3) {
                        if (!pa7.t(x4dVar, x4dVar2)) {
                            objB = x4dVar instanceof i97 ? ((i97) x4dVar).b(fD17, x4dVar2) : null;
                            if (objB == null && (x4dVar2 instanceof i97)) {
                                objB = ((i97) x4dVar2).b(f3 - fD17, x4dVar);
                            }
                            if (objB == null) {
                                if (fD17 < f2) {
                                    objB = x4dVar;
                                } else {
                                    objB = x4dVar2;
                                }
                            }
                        } else if (fD17 < f2) {
                            objB = x4dVar;
                        } else {
                            objB = x4dVar2;
                        }
                        x4d x4dVar3 = objB instanceof x4d ? (x4d) objB : null;
                        if (x4dVar3 != null) {
                            x4dVar = x4dVar3;
                        } else if (fD17 >= d2) {
                            x4dVar = x4dVar2;
                        }
                    } else {
                        x4dVar = x4dVar2;
                    }
                }
                a6eVar3.b |= 8;
                a6eVar3.E = x4dVar;
            }
        } else {
            d2 = 0.5d;
            i3 = 32;
            f2 = 0.5f;
        }
        if ((e & j6) != j7) {
            if ((j6 & 2097152) != j7) {
                float fP6 = abg.P(a6eVar.H, a6eVar2.H, t5eVar.d(21));
                a6eVar3.a = 2097152 | a6eVar3.a;
                a6eVar3.H = fP6;
            }
            if ((j6 & 4194304) != j7) {
                float fP7 = abg.P(a6eVar.I, a6eVar2.I, t5eVar.d(22));
                a6eVar3.a = 4194304 | a6eVar3.a;
                a6eVar3.I = fP7;
            }
            if ((j6 & 8388608) != j7) {
                float fP8 = abg.P(a6eVar.J, a6eVar2.J, t5eVar.d(23));
                a6eVar3.a = 8388608 | a6eVar3.a;
                a6eVar3.J = fP8;
            }
            if ((j6 & 16777216) != j7) {
                float fP9 = abg.P(a6eVar.K, a6eVar2.K, t5eVar.d(24));
                a6eVar3.a |= 16777216;
                a6eVar3.K = fP9;
            }
            if ((j6 & 33554432) != j7) {
                float fP10 = abg.P(a6eVar.L, a6eVar2.L, t5eVar.d(25));
                a6eVar3.a |= 33554432;
                a6eVar3.L = fP10;
            }
            if ((j6 & 67108864) != j7) {
                float fP11 = abg.P(a6eVar.M, a6eVar2.M, t5eVar.d(26));
                a6eVar3.a |= 67108864;
                a6eVar3.M = fP11;
            }
            if ((j6 & 134217728) != j7) {
                float fP12 = abg.P(a6eVar.N, a6eVar2.N, t5eVar.d(27));
                a6eVar3.a = 134217728 | a6eVar3.a;
                a6eVar3.N = fP12;
            }
            if ((j6 & 268435456) != j7) {
                float fP13 = abg.P(a6eVar.O, a6eVar2.O, t5eVar.d(28));
                a6eVar3.a = 268435456 | a6eVar3.a;
                a6eVar3.O = fP13;
            }
            if ((536870912 & j6) != j7) {
                float fP14 = abg.P(a6eVar.P, a6eVar2.P, t5eVar.d(29));
                a6eVar3.a |= 16777216;
                a6eVar3.K = fP14;
            }
            if ((1073741824 & j6) != j7) {
                float fP15 = abg.P(a6eVar.Q, a6eVar2.Q, t5eVar.d(30));
                a6eVar3.a |= 33554432;
                a6eVar3.L = fP15;
            }
            if ((j6 & 4294967296L) != j7) {
                float fP16 = abg.P(a6eVar.R, a6eVar2.R, t5eVar.d(i3));
                a6eVar3.a = 4294967296L | a6eVar3.a;
                a6eVar3.R = fP16;
            }
            if ((j6 & 2147483648L) != j7) {
                boolean z = (t5eVar.d(31) < f2 ? a6eVar : a6eVar2).D;
                a6eVar3.a = 2147483648L | a6eVar3.a;
                a6eVar3.D = z;
            }
        }
        if ((k & iH) != 0 && (iH & 16) != 0) {
            float fD18 = t5eVar.d(54);
            c82 c82Var = a6eVar.S;
            c82 c82Var2 = a6eVar2.S;
            if ((c82Var instanceof xz0) && (c82Var2 instanceof xz0)) {
                xz0 xz0Var = (xz0) c82Var;
                xz0 xz0Var2 = (xz0) c82Var2;
                k58Var = new xz0(abg.R(xz0Var.b, xz0Var2.b, fD18), (fD18 <= f2 ? xz0Var : xz0Var2).c);
            } else {
                if ((c82Var instanceof k58) && (c82Var2 instanceof k58)) {
                    k58 k58Var2 = (k58) c82Var;
                    k58 k58Var3 = (k58) c82Var2;
                    k58Var = new k58(abg.R(k58Var2.b, k58Var3.b, fD18), abg.R(k58Var2.c, k58Var3.c, fD18));
                } else if (fD18 > f2) {
                    c82Var = c82Var2;
                }
                a6eVar3.b |= 16;
                a6eVar3.S = c82Var;
            }
            c82Var = k58Var;
            a6eVar3.b |= 16;
            a6eVar3.S = c82Var;
        }
        if ((137438953472L & j6) != j7) {
            long jR2 = abg.R(a6eVar.T, a6eVar2.T, t5eVar.d(57));
            a6eVar3.a |= 137438953472L;
            a6eVar3.b &= -129;
            a6eVar3.T = jR2;
            a6eVar3.U = null;
        }
        if ((iH & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            a6eVar3.e(b(a6eVar.U, a6eVar.T, a6eVar2.U, a6eVar2.T, t5eVar.d(57)));
        }
        if ((g & j6) != j7) {
            if ((j6 & 274877906944L) != j7) {
                a6eVar3.A(((a6eVar.a & 274877906944L) == j7 || ((274877906944L & a6eVar2.a) != j7 && ((double) t5eVar.d(38)) >= d2)) ? a6eVar2.t() : a6eVar.t());
            }
            if ((j6 & 70368744177664L) != j7) {
                if ((a6eVar.a & 70368744177664L) == j7) {
                    j5 = a6eVar2.W;
                } else if ((a6eVar2.a & 70368744177664L) != j7) {
                    j5 = (((double) t5eVar.d(46)) < d2 ? a6eVar : a6eVar2).W;
                } else {
                    j5 = a6eVar.W;
                }
                a6eVar3.a = 70368744177664L | a6eVar3.a;
                a6eVar3.W = j5;
            }
            if ((j6 & 140737488355328L) != j7) {
                if ((a6eVar.a & 140737488355328L) == j7) {
                    j4 = a6eVar2.X;
                } else if ((a6eVar2.a & 140737488355328L) != j7) {
                    j4 = (((double) t5eVar.d(47)) < d2 ? a6eVar : a6eVar2).X;
                } else {
                    j4 = a6eVar.X;
                }
                a6eVar3.a = 140737488355328L | a6eVar3.a;
                a6eVar3.X = j4;
            }
            if ((j6 & 281474976710656L) != j7) {
                if ((a6eVar.a & 281474976710656L) == j7) {
                    j3 = a6eVar2.Y;
                } else if ((a6eVar2.a & 281474976710656L) != j7) {
                    j3 = (((double) t5eVar.d(48)) < d2 ? a6eVar : a6eVar2).Y;
                } else {
                    j3 = a6eVar.Y;
                }
                a6eVar3.a = 281474976710656L | a6eVar3.a;
                a6eVar3.Y = j3;
            }
            if ((j6 & 8796093022208L) != j7) {
                if ((a6eVar.a & 8796093022208L) != j7 && (a6eVar2.a & 8796093022208L) != j7) {
                    t5eVar.d(43);
                }
                a6eVar3.a = 8796093022208L | a6eVar3.a;
            }
            if ((j6 & 562949953421312L) != j7) {
                if ((a6eVar.a & 562949953421312L) != j7 && (a6eVar2.a & 562949953421312L) != j7) {
                    t5eVar.d(49);
                }
                a6eVar3.a = 562949953421312L | a6eVar3.a;
            }
            if ((j6 & 2199023255552L) != j7) {
                a6eVar3.z(((a6eVar.a & 2199023255552L) == j7 || ((2199023255552L & a6eVar2.a) != j7 && ((double) t5eVar.d(41)) >= d2)) ? a6eVar2.s() : a6eVar.s());
            }
            if ((j6 & 4398046511104L) != j7) {
                a6eVar3.B(((a6eVar.a & 4398046511104L) == j7 || ((4398046511104L & a6eVar2.a) != j7 && ((double) t5eVar.d(42)) >= d2)) ? a6eVar2.u() : a6eVar.u());
            }
            if ((j6 & 17592186044416L) != j7) {
                a6eVar3.y(((a6eVar.a & 17592186044416L) == j7 || ((17592186044416L & a6eVar2.a) != j7 && ((double) t5eVar.d(44)) >= d2)) ? a6eVar2.q() : a6eVar.q());
            }
            if ((j6 & 35184372088832L) != j7) {
                a6eVar3.k(((a6eVar.a & 35184372088832L) == j7 || ((35184372088832L & a6eVar2.a) != j7 && ((double) t5eVar.d(45)) >= d2)) ? a6eVar2.o() : a6eVar.o());
            }
            if ((j6 & 549755813888L) != j7) {
                a6eVar3.l(((a6eVar.a & 549755813888L) == j7 || ((549755813888L & a6eVar2.a) != j7 && ((double) t5eVar.d(39)) >= d2)) ? a6eVar2.p() : a6eVar.p());
            }
            if ((j6 & 1099511627776L) != j7) {
                a6eVar3.j(((a6eVar.a & 1099511627776L) == j7 || ((a6eVar2.a & 1099511627776L) != j7 && ((double) t5eVar.d(40)) >= d2)) ? a6eVar2.n() : a6eVar.n());
            }
        }
        if ((m & iH) != 0) {
            if ((iH & 256) != 0) {
                if ((a6eVar.b & 256) != 0 && (a6eVar2.b & 256) != 0) {
                    t5eVar.d(58);
                }
                a6eVar3.b |= 256;
            }
            if ((iH & 512) != 0) {
                if ((a6eVar.b & 512) != 0 && (a6eVar2.b & 512) != 0) {
                    t5eVar.d(59);
                }
                a6eVar3.b |= 512;
            }
            if ((iH & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                if ((a6eVar.b & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                    eteVar = ((a6eVar2.b & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0 || ((double) t5eVar.d(60)) < d2) ? a6eVar.V : a6eVar2.V;
                } else {
                    eteVar = a6eVar2.V;
                }
                eteVar.getClass();
                a6eVar3.b |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                a6eVar3.V = eteVar;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    public static final b41 b(b41 b41Var, long j2, b41 b41Var2, long j3, float f2) {
        Object objB;
        if (b41Var == null && b41Var2 == null) {
            return null;
        }
        if (b41Var == null) {
            b41Var = new dtd(j2);
        } else if (b41Var2 == null) {
            b41Var2 = new dtd(j3);
        }
        if (!b41Var.equals(b41Var2)) {
            objB = b41Var instanceof i97 ? ((i97) b41Var).b(f2, b41Var2) : null;
            if (objB == null && (b41Var2 instanceof i97)) {
                objB = ((i97) b41Var2).b(1.0f - f2, b41Var);
            }
            if (objB == null) {
                if (f2 < 0.5f) {
                    objB = b41Var;
                } else {
                    objB = b41Var2;
                }
            }
        } else if (f2 < 0.5f) {
            objB = b41Var;
        } else {
            objB = b41Var2;
        }
        b41 b41Var3 = objB instanceof b41 ? (b41) objB : null;
        if (b41Var3 == null) {
            return ((double) f2) < 0.5d ? b41Var : b41Var2;
        }
        return b41Var3;
    }

    public static final Object c(Object obj, Object obj2, float f2) {
        Object[] objArr;
        Object[] objArr2;
        n4d n4dVarH = null;
        if (obj == null && obj2 == null) {
            return null;
        }
        boolean z = obj instanceof Object[];
        boolean z2 = obj2 instanceof Object[];
        if (!z && !z2) {
            n4d n4dVar = obj instanceof n4d ? (n4d) obj : null;
            n4d n4dVar2 = obj2 instanceof n4d ? (n4d) obj2 : null;
            if (n4dVar == null && n4dVar2 == null) {
                return null;
            }
            if (n4dVar != null) {
                return n4dVar2 == null ? jrb.h(n4dVar, new n4d(n4dVar.a, y72.j, n4dVar.b, n4dVar.c, n4dVar.g, n4dVar.d), f2) : jrb.h(n4dVar, n4dVar2, f2);
            }
            n4dVar2.getClass();
            return jrb.h(new n4d(n4dVar2.a, y72.j, n4dVar2.b, n4dVar2.c, n4dVar2.g, n4dVar2.d), n4dVar2, f2);
        }
        int i2 = 0;
        if (z) {
            objArr = (n4d[]) obj;
        } else {
            obj.getClass();
            objArr = new n4d[]{obj};
        }
        if (z2) {
            objArr2 = (n4d[]) obj2;
        } else {
            obj2.getClass();
            objArr2 = new n4d[]{obj2};
        }
        int iMax = Math.max(objArr.length, objArr2.length);
        n4d[] n4dVarArr = new n4d[iMax];
        for (int i3 = 0; i3 < iMax; i3++) {
            n4dVarArr[i3] = null;
        }
        while (i2 < iMax) {
            n4d n4dVar3 = (n4d) qd0.q0(i2, objArr);
            n4d n4dVar4 = (n4d) qd0.q0(i2, objArr2);
            if (n4dVar3 != null || n4dVar4 != null) {
                if (n4dVar3 == null) {
                    n4dVar4.getClass();
                    n4dVarH = jrb.h(new n4d(n4dVar4.a, y72.j, n4dVar4.b, n4dVar4.c, n4dVar4.g, n4dVar4.d), n4dVar4, f2);
                } else {
                    if (n4dVar4 == null) {
                        n4dVar4 = new n4d(n4dVar3.a, y72.j, n4dVar3.b, n4dVar3.c, n4dVar3.g, n4dVar3.d);
                    }
                    n4dVarH = jrb.h(n4dVar3, n4dVar4, f2);
                }
            }
            n4dVarArr[i2] = n4dVarH;
            i2++;
            n4dVarH = null;
        }
        return n4dVarArr;
    }

    public static final int d(int i2) {
        int i3 = 0;
        for (int i4 = 50; i4 < 61; i4++) {
            if ((a[i4] & i2) != 0) {
                i3 |= 1 << (i4 - 50);
            }
        }
        return i3;
    }

    public static final int e(int i2) {
        return ((h & i2) != 0 ? 1 : 0) | ((i & i2) != 0 ? 8 : 0) | ((j & i2) != 0 ? 2 : 0) | ((k & i2) != 0 ? 4 : 0) | ((l & i2) != 0 ? 32 : 0) | ((i2 & m) != 0 ? 16 : 0);
    }

    public static final long f(int i2) {
        long j2 = 0;
        for (int i3 = 0; i3 < 50; i3++) {
            if ((a[i3] & i2) != 0) {
                j2 |= 1 << ((byte) i3);
            }
        }
        return j2;
    }

    public static final int g(long j2) {
        return ((b & j2) != 0 ? 1 : 0) | ((c & j2) != 0 ? 8 : 0) | ((d & j2) != 0 ? 2 : 0) | ((e & j2) != 0 ? 4 : 0) | ((f & j2) != 0 ? 32 : 0) | ((j2 & g) != 0 ? 16 : 0);
    }

    public static final int h(int i2, long j2) {
        if ((257698037760L & j2) == 0) {
            return i2;
        }
        if ((34359738368L & j2) != 0) {
            i2 |= 1;
        }
        if ((137438953472L & j2) != 0) {
            i2 |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((17179869184L & j2) != 0) {
            i2 |= 2;
        }
        return (j2 & 68719476736L) != 0 ? i2 | 4 : i2;
    }

    public static final long i(int i2, long j2) {
        if ((i2 & 135) != 0) {
            if ((i2 & 1) != 0) {
                j2 |= 34359738368L;
            }
            if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                j2 |= 137438953472L;
            }
            if ((i2 & 2) != 0) {
                j2 |= 17179869184L;
            }
            if ((i2 & 4) != 0) {
                return j2 | 68719476736L;
            }
        }
        return j2;
    }
}
