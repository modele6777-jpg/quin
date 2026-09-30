package defpackage;

import java.io.EOFException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i49 implements l95 {
    public static final ho7 v = new ho7(14);
    public final int a;
    public final d0a b;
    public final u49 c;
    public final s46 d;
    public final mjg e;
    public final l94 f;
    public n95 g;
    public k1f h;
    public k1f i;
    public int j;
    public su8 k;
    public su8 l;
    public long m;
    public long n;
    public long o;
    public long p;
    public int q;
    public ntc r;
    public boolean s;
    public boolean t;
    public long u;

    public i49(int i) {
        this.a = (i & 2) != 0 ? i | 1 : i;
        this.b = new d0a(10);
        this.c = new u49();
        this.d = new s46();
        this.m = -9223372036854775807L;
        this.e = new mjg(20);
        l94 l94Var = new l94();
        this.f = l94Var;
        this.i = l94Var;
        this.p = -1L;
    }

    @Override // defpackage.l95
    public final boolean b(m95 m95Var) {
        return j(m95Var, true);
    }

    @Override // defpackage.l95
    public final void c(long j, long j2) {
        this.j = 0;
        this.m = -9223372036854775807L;
        this.n = 0L;
        this.q = 0;
        this.p = -1L;
        this.u = j2;
        ntc ntcVar = this.r;
        if (ntcVar instanceof k17) {
            jf8 jf8Var = ((k17) ntcVar).d.b;
            int i = jf8Var.b;
            if (i != 0 && j2 - jf8Var.d(i - 1) < 100000) {
                return;
            }
            this.t = true;
            this.i = this.f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x026d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0272 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x027c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0288  */
    /* JADX WARN: Code duplicated, block: B:113:0x0299  */
    /* JADX WARN: Code duplicated, block: B:116:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:118:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:11:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:125:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:128:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:12:0x004d  */
    /* JADX WARN: Code duplicated, block: B:130:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:132:0x0309  */
    /* JADX WARN: Code duplicated, block: B:134:0x030d  */
    /* JADX WARN: Code duplicated, block: B:138:0x031d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0343  */
    /* JADX WARN: Code duplicated, block: B:142:0x0346  */
    /* JADX WARN: Code duplicated, block: B:144:0x034c  */
    /* JADX WARN: Code duplicated, block: B:146:0x035a  */
    /* JADX WARN: Code duplicated, block: B:149:0x0369  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x036d A[LOOP:0: B:143:0x034a->B:152:0x036d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:157:0x0376  */
    /* JADX WARN: Code duplicated, block: B:159:0x037e  */
    /* JADX WARN: Code duplicated, block: B:161:0x038c  */
    /* JADX WARN: Code duplicated, block: B:164:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:167:0x03a4 A[LOOP:1: B:158:0x037c->B:167:0x03a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    /* JADX WARN: Code duplicated, block: B:171:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:172:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:175:0x03d1 A[LOOP:2: B:174:0x03cf->B:175:0x03d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:179:0x0402  */
    /* JADX WARN: Code duplicated, block: B:180:0x040b  */
    /* JADX WARN: Code duplicated, block: B:182:0x040e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x0413  */
    /* JADX WARN: Code duplicated, block: B:187:0x041c  */
    /* JADX WARN: Code duplicated, block: B:191:0x0437  */
    /* JADX WARN: Code duplicated, block: B:193:0x043b  */
    /* JADX WARN: Code duplicated, block: B:194:0x043e  */
    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0454  */
    /* JADX WARN: Code duplicated, block: B:202:0x0460  */
    /* JADX WARN: Code duplicated, block: B:205:0x0469  */
    /* JADX WARN: Code duplicated, block: B:216:0x049f  */
    /* JADX WARN: Code duplicated, block: B:219:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:21:0x0077 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:224:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:227:0x0500  */
    /* JADX WARN: Code duplicated, block: B:229:0x0519  */
    /* JADX WARN: Code duplicated, block: B:231:0x0526  */
    /* JADX WARN: Code duplicated, block: B:233:0x0530  */
    /* JADX WARN: Code duplicated, block: B:236:0x0539  */
    /* JADX WARN: Code duplicated, block: B:238:0x0542  */
    /* JADX WARN: Code duplicated, block: B:239:0x0549  */
    /* JADX WARN: Code duplicated, block: B:23:0x007a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0080  */
    /* JADX WARN: Code duplicated, block: B:265:0x05f1 A[PHI: r23
  0x05f1: PHI (r23v3 long) = (r23v4 long), (r23v6 long) binds: [B:271:0x060c, B:264:0x05ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:266:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:269:0x0604 A[PHI: r23
  0x0604: PHI (r23v5 long) = (r23v4 long), (r23v8 long) binds: [B:268:0x0602, B:238:0x0542] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:270:0x0607  */
    /* JADX WARN: Code duplicated, block: B:273:0x060f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:287:0x0664  */
    /* JADX WARN: Code duplicated, block: B:28:0x008b  */
    /* JADX WARN: Code duplicated, block: B:294:0x0371 A[EDGE_INSN: B:294:0x0371->B:154:0x0371 BREAK  A[LOOP:0: B:143:0x034a->B:152:0x036d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x0370 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x03a8 A[EDGE_INSN: B:296:0x03a8->B:169:0x03a8 BREAK  A[LOOP:1: B:158:0x037c->B:167:0x03a4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x03a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x012a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ba A[EDGE_INSN: B:37:0x00ba->B:63:0x0174 BREAK  A[LOOP:3: B:39:0x00e8->B:53:0x0119]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:46:0x0102  */
    /* JADX WARN: Code duplicated, block: B:49:0x0106  */
    /* JADX WARN: Code duplicated, block: B:50:0x010b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0110  */
    /* JADX WARN: Code duplicated, block: B:52:0x0115  */
    /* JADX WARN: Code duplicated, block: B:56:0x0136  */
    /* JADX WARN: Code duplicated, block: B:61:0x0150  */
    /* JADX WARN: Code duplicated, block: B:64:0x017b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0183  */
    /* JADX WARN: Code duplicated, block: B:67:0x0188  */
    /* JADX WARN: Code duplicated, block: B:70:0x018d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0192  */
    /* JADX WARN: Code duplicated, block: B:74:0x0199  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a0 A[LOOP:4: B:75:0x019e->B:76:0x01a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:82:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:94:0x0216  */
    /* JADX WARN: Code duplicated, block: B:98:0x0226  */
    /* JADX WARN: Code duplicated, block: B:99:0x0230  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    @Override // defpackage.l95
    public final int e(m95 m95Var, d82 d82Var) {
        int i;
        int i2;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        int i3;
        long position;
        long j6;
        int iC;
        int i4;
        int iM;
        d0a d0aVar;
        int i5;
        int i6;
        int i7;
        int i8;
        int iM2;
        int iM3;
        int iD;
        long jB;
        long[] jArr;
        long j7;
        int iMax;
        int i9;
        k49 k49Var;
        tlg tlgVar;
        long j8;
        u49 u49Var;
        su8 su8Var;
        long position2;
        long j9;
        long length;
        long jA;
        int i10;
        long j10;
        long j11;
        int iV;
        ntc yk2Var;
        long jA2;
        long jMin;
        String strX;
        float fIntBitsToFloat;
        j49 j49VarA;
        j49 j49VarA2;
        long[] jArr2;
        int i11;
        su8 su8Var2;
        long position3;
        qu8[] qu8VarArr;
        int length2;
        int i12;
        qu8 qu8Var;
        ky8 ky8Var;
        int[] iArr;
        qu8[] qu8VarArr2;
        int length3;
        int i13;
        qu8 qu8Var2;
        fte fteVar;
        char c;
        long jH;
        int length4;
        long[] jArr3;
        long[] jArr4;
        int i14;
        long j12;
        ntc ly8Var;
        qu8 qu8Var3;
        qu8 qu8Var4;
        boolean z;
        int i15;
        long jH2;
        long length5;
        ntc ntcVarG;
        ntc yk2Var2;
        su8 su8VarB;
        qr5 qr5Var;
        long length6;
        long position4;
        long j13;
        long jMax;
        int iM4;
        long jL;
        int iG;
        int iG2;
        int iG3;
        long[] jArr5;
        long[] jArr6;
        long j14;
        int i16;
        int iZ;
        this.h.getClass();
        String str = pqf.a;
        int i17 = this.j;
        s46 s46Var = this.d;
        u49 u49Var2 = this.c;
        if (i17 == 0) {
            try {
                j(m95Var, false);
                if (this.r == null) {
                    j = 1000000;
                    d0aVar = new d0a(u49Var2.b);
                    m95Var.o(d0aVar.a, 0, u49Var2.b);
                    i5 = u49Var2.a & 1;
                    i6 = u49Var2.d;
                    i7 = 21;
                    j2 = 1;
                    if (i5 != 0) {
                        if (i6 != 1) {
                            i8 = 36;
                        }
                        j3 = 0;
                        if (d0aVar.c >= i8 + 4) {
                            d0aVar.M(i8);
                            iM2 = d0aVar.m();
                            if (iM2 != 1483304551 && iM2 != 1231971951) {
                                if (d0aVar.c >= 40) {
                                    d0aVar.M(36);
                                    if (d0aVar.m() == 1447187017) {
                                        iM2 = 1447187017;
                                    } else {
                                        iM2 = 0;
                                    }
                                } else {
                                    iM2 = 0;
                                }
                            }
                        } else if (d0aVar.c >= 40) {
                            d0aVar.M(36);
                            if (d0aVar.m() == 1447187017) {
                                iM2 = 1447187017;
                            } else {
                                iM2 = 0;
                            }
                        } else {
                            iM2 = 0;
                        }
                        if (iM2 == 1231971951) {
                            iM3 = d0aVar.m();
                            if ((iM3 & 1) != 0) {
                                iD = d0aVar.D();
                            } else {
                                iD = -1;
                            }
                            if ((iM3 & 2) != 0) {
                                jB = d0aVar.B();
                            } else {
                                jB = -1;
                            }
                            if ((iM3 & 4) == 4) {
                                jArr2 = new long[100];
                                i11 = 0;
                                while (i11 < 100) {
                                    jArr2[i11] = d0aVar.z();
                                    i11++;
                                    jB = jB;
                                }
                                jArr = jArr2;
                            } else {
                                jArr = null;
                            }
                            j7 = jB;
                            if ((iM3 & 8) != 0) {
                                d0aVar.N(4);
                            }
                            if (d0aVar.a() >= 24) {
                                strX = d0aVar.x(9, StandardCharsets.UTF_8);
                                d0aVar.N(2);
                                fIntBitsToFloat = Float.intBitsToFloat(d0aVar.m());
                                int iG4 = d0aVar.G();
                                int iG5 = d0aVar.G();
                                j49VarA = j49.a(iG4);
                                j49VarA2 = j49.a(iG5);
                                if (fIntBitsToFloat > 0.0f && j49VarA == null && j49VarA2 == null) {
                                    k49Var = null;
                                } else {
                                    k49Var = new k49(fIntBitsToFloat, j49VarA, j49VarA2);
                                }
                                d0aVar.N(2);
                                int iC2 = d0aVar.C();
                                i9 = (16773120 & iC2) >> 12;
                                iMax = iC2 & 4095;
                                if (strX.startsWith("LAME") || strX.startsWith("Lavf") || strX.startsWith("Lavc")) {
                                    i9 += 529;
                                    iMax = Math.max(0, iMax - 529);
                                }
                            } else {
                                iMax = -1;
                                i9 = -1;
                                k49Var = null;
                            }
                            j8 = iD;
                            tlgVar = new tlg();
                            u49 u49Var3 = new u49();
                            u49Var3.a = u49Var2.a;
                            u49Var3.g = (String) u49Var2.g;
                            u49Var3.b = u49Var2.b;
                            u49Var3.c = u49Var2.c;
                            u49Var3.d = u49Var2.d;
                            u49Var3.e = u49Var2.e;
                            u49Var3.f = u49Var2.f;
                            tlgVar.c = u49Var3;
                            tlgVar.b = j8;
                            tlgVar.a = i9;
                            tlgVar.d = iMax;
                            u49Var = (u49) tlgVar.c;
                            if ((s46Var.a != -1 || s46Var.b == -1) && i9 != -1 && iMax != -1) {
                                s46Var.a = i9;
                                s46Var.b = iMax;
                            }
                            if (k49Var != null) {
                                su8Var = new su8(k49Var);
                            } else {
                                su8Var = null;
                            }
                            this.l = su8Var;
                            position2 = m95Var.getPosition();
                            m95Var.l(u49Var2.b);
                            if (iM2 == 1483304551) {
                                long length7 = m95Var.getLength();
                                jA2 = tlgVar.a();
                                if (jA2 == -9223372036854775807L) {
                                    yk2Var = null;
                                } else {
                                    if (j7 != -1 || length7 == -1 || position2 + j7 == length7) {
                                        jMin = j7;
                                    } else {
                                        long j15 = length7 - position2;
                                        StringBuilder sbP = ub3.p("Data size mismatch between stream (", ") and Xing frame (", j15);
                                        sbP.append(j7);
                                        sbP.append("), using smaller value.");
                                        xo1.D("XingSeeker", sbP.toString());
                                        jMin = Math.min(j7, j15);
                                    }
                                    yk2Var = new xcg(position2, u49Var.b, jA2, jMin, jArr);
                                }
                            } else {
                                j9 = j7;
                                length = m95Var.getLength();
                                jA = tlgVar.a();
                                if (jA != -9223372036854775807L) {
                                    if (j9 != -1) {
                                        length = position2 + j9;
                                        i10 = u49Var.b;
                                    } else if (length != -1) {
                                        j9 = length - position2;
                                        i10 = u49Var.b;
                                    } else {
                                        yk2Var = null;
                                    }
                                    j10 = length;
                                    j11 = j9 - ((long) i10);
                                    iV = feg.v(j11, jA);
                                    if (iV == -2147483647) {
                                        yk2Var = null;
                                    } else {
                                        yk2Var = new yk2(j10, position2 + ((long) u49Var.b), iV, rxg.B(cn1.t(j11, j8, RoundingMode.HALF_UP)), false, true, jA);
                                    }
                                } else {
                                    yk2Var = null;
                                }
                            }
                        } else if (iM2 != 1447187017) {
                            if (iM2 != 1483304551) {
                                m95Var.k();
                            } else {
                                iM3 = d0aVar.m();
                                if ((iM3 & 1) != 0) {
                                    iD = d0aVar.D();
                                } else {
                                    iD = -1;
                                }
                                if ((iM3 & 2) != 0) {
                                    jB = d0aVar.B();
                                } else {
                                    jB = -1;
                                }
                                if ((iM3 & 4) == 4) {
                                    jArr2 = new long[100];
                                    i11 = 0;
                                    while (i11 < 100) {
                                        jArr2[i11] = d0aVar.z();
                                        i11++;
                                        jB = jB;
                                    }
                                    jArr = jArr2;
                                } else {
                                    jArr = null;
                                }
                                j7 = jB;
                                if ((iM3 & 8) != 0) {
                                    d0aVar.N(4);
                                }
                                if (d0aVar.a() >= 24) {
                                    strX = d0aVar.x(9, StandardCharsets.UTF_8);
                                    d0aVar.N(2);
                                    fIntBitsToFloat = Float.intBitsToFloat(d0aVar.m());
                                    int iG6 = d0aVar.G();
                                    int iG7 = d0aVar.G();
                                    j49VarA = j49.a(iG6);
                                    j49VarA2 = j49.a(iG7);
                                    if (fIntBitsToFloat > 0.0f) {
                                        k49Var = new k49(fIntBitsToFloat, j49VarA, j49VarA2);
                                    } else {
                                        k49Var = new k49(fIntBitsToFloat, j49VarA, j49VarA2);
                                    }
                                    d0aVar.N(2);
                                    int iC3 = d0aVar.C();
                                    i9 = (16773120 & iC3) >> 12;
                                    iMax = iC3 & 4095;
                                    if (strX.startsWith("LAME")) {
                                        i9 += 529;
                                        iMax = Math.max(0, iMax - 529);
                                    } else {
                                        i9 += 529;
                                        iMax = Math.max(0, iMax - 529);
                                    }
                                } else {
                                    iMax = -1;
                                    i9 = -1;
                                    k49Var = null;
                                }
                                j8 = iD;
                                tlgVar = new tlg();
                                u49 u49Var4 = new u49();
                                u49Var4.a = u49Var2.a;
                                u49Var4.g = (String) u49Var2.g;
                                u49Var4.b = u49Var2.b;
                                u49Var4.c = u49Var2.c;
                                u49Var4.d = u49Var2.d;
                                u49Var4.e = u49Var2.e;
                                u49Var4.f = u49Var2.f;
                                tlgVar.c = u49Var4;
                                tlgVar.b = j8;
                                tlgVar.a = i9;
                                tlgVar.d = iMax;
                                u49Var = (u49) tlgVar.c;
                                if (s46Var.a != -1) {
                                    s46Var.a = i9;
                                    s46Var.b = iMax;
                                } else {
                                    s46Var.a = i9;
                                    s46Var.b = iMax;
                                }
                                if (k49Var != null) {
                                    su8Var = new su8(k49Var);
                                } else {
                                    su8Var = null;
                                }
                                this.l = su8Var;
                                position2 = m95Var.getPosition();
                                m95Var.l(u49Var2.b);
                                if (iM2 == 1483304551) {
                                    long length8 = m95Var.getLength();
                                    jA2 = tlgVar.a();
                                    if (jA2 == -9223372036854775807L) {
                                        if (j7 != -1) {
                                            jMin = j7;
                                        } else {
                                            jMin = j7;
                                        }
                                        yk2Var = new xcg(position2, u49Var.b, jA2, jMin, jArr);
                                    }
                                } else {
                                    j9 = j7;
                                    length = m95Var.getLength();
                                    jA = tlgVar.a();
                                    if (jA != -9223372036854775807L) {
                                        if (j9 != -1) {
                                            length = position2 + j9;
                                            i10 = u49Var.b;
                                        } else if (length != -1) {
                                            j9 = length - position2;
                                            i10 = u49Var.b;
                                        }
                                        j10 = length;
                                        j11 = j9 - ((long) i10);
                                        iV = feg.v(j11, jA);
                                        if (iV == -2147483647) {
                                            yk2Var = new yk2(j10, position2 + ((long) u49Var.b), iV, rxg.B(cn1.t(j11, j8, RoundingMode.HALF_UP)), false, true, jA);
                                        }
                                    }
                                }
                            }
                            yk2Var = null;
                        } else {
                            length6 = m95Var.getLength();
                            position4 = m95Var.getPosition();
                            d0aVar.N(6);
                            int iM5 = d0aVar.m();
                            j13 = position4 + ((long) u49Var2.b);
                            jMax = j13 + ((long) iM5);
                            iM4 = d0aVar.m();
                            if (iM4 <= 0) {
                                jL = pqf.L(u49Var2.c, (((long) iM4) * ((long) u49Var2.f)) - 1);
                                iG = d0aVar.G();
                                iG2 = d0aVar.G();
                                iG3 = d0aVar.G();
                                d0aVar.N(2);
                                jArr5 = new long[iG];
                                jArr6 = new long[iG];
                                j14 = position4 + ((long) u49Var2.b);
                                i16 = 0;
                                while (true) {
                                    if (i16 < iG) {
                                        long[] jArr7 = jArr5;
                                        long[] jArr8 = jArr6;
                                        if (length6 != -1 && length6 != jMax) {
                                            StringBuilder sbP2 = ub3.p("VBRI data size mismatch: ", ", ", length6);
                                            sbP2.append(jMax);
                                            xo1.V("VbriSeeker", sbP2.toString());
                                        }
                                        if (jMax != j14) {
                                            StringBuilder sbP3 = ub3.p("VBRI bytes and ToC mismatch (using max): ", ", ", jMax);
                                            sbP3.append(j14);
                                            sbP3.append("\nSeeking will be inaccurate.");
                                            xo1.V("VbriSeeker", sbP3.toString());
                                            jMax = Math.max(jMax, j14);
                                        }
                                        yk2Var = new gsf(jArr7, jArr8, jL, j13, jMax);
                                        break;
                                    }
                                    long[] jArr9 = jArr5;
                                    long[] jArr10 = jArr6;
                                    jArr9[i16] = (((long) i16) * jL) / ((long) iG);
                                    jArr10[i16] = j14;
                                    if (iG3 != 1) {
                                        iZ = d0aVar.z();
                                    } else if (iG3 != 2) {
                                        iZ = d0aVar.G();
                                    } else if (iG3 != 3) {
                                        iZ = d0aVar.C();
                                    } else {
                                        if (iG3 != 4) {
                                            yk2Var = null;
                                            break;
                                        }
                                        iZ = d0aVar.D();
                                    }
                                    j14 += ((long) iZ) * ((long) iG2);
                                    i16++;
                                    jArr5 = jArr9;
                                    jArr6 = jArr10;
                                    iG = iG;
                                }
                            } else {
                                yk2Var = null;
                                break;
                            }
                            m95Var.l(u49Var2.b);
                        }
                        su8Var2 = this.k;
                        position3 = m95Var.getPosition();
                        if (su8Var2 == null) {
                            ly8Var = null;
                        } else {
                            qu8VarArr = su8Var2.a;
                            length2 = qu8VarArr.length;
                            i12 = 0;
                            while (true) {
                                if (i12 < length2) {
                                    qu8Var = null;
                                    break;
                                }
                                qu8Var4 = qu8VarArr[i12];
                                if (ky8.class.isAssignableFrom(qu8Var4.getClass())) {
                                    qu8Var = (qu8) ky8.class.cast(qu8Var4);
                                    if (!tpa.a.apply(qu8Var)) {
                                        qu8Var = null;
                                    }
                                } else {
                                    qu8Var = null;
                                }
                                if (qu8Var != null) {
                                    break;
                                }
                                i12++;
                            }
                            ky8Var = (ky8) qu8Var;
                            if (ky8Var == null) {
                                ly8Var = null;
                            } else {
                                iArr = ky8Var.e;
                                qu8VarArr2 = su8Var2.a;
                                length3 = qu8VarArr2.length;
                                i13 = 0;
                                while (true) {
                                    if (i13 < length3) {
                                        qu8Var2 = null;
                                        break;
                                    }
                                    qu8Var3 = qu8VarArr2[i13];
                                    if (fte.class.isAssignableFrom(qu8Var3.getClass())) {
                                        qu8Var2 = (qu8) fte.class.cast(qu8Var3);
                                        if (!((fte) qu8Var2).a.equals("TLEN")) {
                                            qu8Var2 = null;
                                        }
                                    } else {
                                        qu8Var2 = null;
                                    }
                                    if (qu8Var2 != null) {
                                        break;
                                    }
                                    i13++;
                                }
                                fteVar = (fte) qu8Var2;
                                if (fteVar == null) {
                                    jH = -9223372036854775807L;
                                    c = 0;
                                } else {
                                    c = 0;
                                    jH = pqf.H(Long.parseLong((String) fteVar.c.get(0)));
                                }
                                length4 = iArr.length;
                                int i18 = length4 + 1;
                                jArr3 = new long[i18];
                                jArr4 = new long[i18];
                                jArr3[c] = position3;
                                jArr4[c] = 0;
                                i14 = 1;
                                j12 = 0;
                                while (i14 <= length4) {
                                    int i19 = i14 - 1;
                                    long j16 = position3 + ((long) (ky8Var.c + iArr[i19]));
                                    j12 += (long) (ky8Var.d + ky8Var.f[i19]);
                                    jArr3[i14] = j16;
                                    jArr4[i14] = j12;
                                    i14++;
                                    length4 = length4;
                                    position3 = j16;
                                }
                                ly8Var = new ly8(jH, jArr3, jArr4);
                            }
                        }
                        z = this.s;
                        i15 = this.a;
                        if (z) {
                            ntcVarG = new mtc(-9223372036854775807L);
                        } else {
                            if (ly8Var == null) {
                                if (yk2Var == null) {
                                    yk2Var = g(m95Var);
                                }
                                ly8Var = yk2Var;
                            }
                            if ((i15 & 4) == 0 && !ly8Var.c()) {
                                yk2Var2 = new k17(ly8Var.h(), m95Var.getPosition(), ly8Var.a());
                            } else if (!(ly8Var instanceof yk2) || ly8Var.c() || (i15 & 1) == 0) {
                                ntcVarG = ly8Var;
                            } else {
                                jH2 = ly8Var.h();
                                if (ly8Var.a() != -1) {
                                    length5 = ly8Var.a();
                                } else {
                                    length5 = m95Var.getLength();
                                }
                                long j17 = length5;
                                if (jH2 != -9223372036854775807L || j17 == -1) {
                                    ntcVarG = g(m95Var);
                                } else {
                                    long jB2 = ly8Var.b() != -1 ? ly8Var.b() : 0L;
                                    int iV2 = feg.v(j17 - jB2, jH2);
                                    if (iV2 == -2147483647) {
                                        ntcVarG = g(m95Var);
                                    } else {
                                        yk2Var2 = new yk2(j17, jB2, iV2, -1, false, true, jH2);
                                    }
                                }
                            }
                            ntcVarG = yk2Var2;
                        }
                        this.r = ntcVarG;
                        this.h.d(ntcVarG.h());
                        this.g.q(this.r);
                        su8VarB = this.k;
                        if (su8VarB == null && (i15 & 8) == 0) {
                            su8 su8Var3 = this.l;
                            if (su8Var3 != null) {
                                su8VarB = su8VarB.b(su8Var3);
                            }
                        } else {
                            su8VarB = this.l;
                        }
                        qr5Var = new qr5();
                        qr5Var.n = qv8.l("audio/mpeg");
                        qr5Var.o = qv8.l((String) u49Var2.g);
                        qr5Var.p = 4096;
                        qr5Var.I = u49Var2.d;
                        qr5Var.K = u49Var2.c;
                        qr5Var.M = s46Var.a;
                        qr5Var.N = s46Var.b;
                        qr5Var.l = su8VarB;
                        if (this.r.g() != -2147483647) {
                            qr5Var.i = this.r.g();
                        }
                        this.i.g(new rr5(qr5Var));
                        this.o = m95Var.getPosition();
                    } else if (i6 == 1) {
                        i7 = 13;
                    }
                    i8 = i7;
                    j3 = 0;
                    if (d0aVar.c >= i8 + 4) {
                        d0aVar.M(i8);
                        iM2 = d0aVar.m();
                        if (iM2 != 1483304551) {
                            if (d0aVar.c >= 40) {
                                d0aVar.M(36);
                                if (d0aVar.m() == 1447187017) {
                                    iM2 = 1447187017;
                                } else {
                                    iM2 = 0;
                                }
                            } else {
                                iM2 = 0;
                            }
                        }
                    } else if (d0aVar.c >= 40) {
                        d0aVar.M(36);
                        if (d0aVar.m() == 1447187017) {
                            iM2 = 1447187017;
                        } else {
                            iM2 = 0;
                        }
                    } else {
                        iM2 = 0;
                    }
                    if (iM2 == 1231971951) {
                        iM3 = d0aVar.m();
                        if ((iM3 & 1) != 0) {
                            iD = d0aVar.D();
                        } else {
                            iD = -1;
                        }
                        if ((iM3 & 2) != 0) {
                            jB = d0aVar.B();
                        } else {
                            jB = -1;
                        }
                        if ((iM3 & 4) == 4) {
                            jArr2 = new long[100];
                            i11 = 0;
                            while (i11 < 100) {
                                jArr2[i11] = d0aVar.z();
                                i11++;
                                jB = jB;
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        j7 = jB;
                        if ((iM3 & 8) != 0) {
                            d0aVar.N(4);
                        }
                        if (d0aVar.a() >= 24) {
                            strX = d0aVar.x(9, StandardCharsets.UTF_8);
                            d0aVar.N(2);
                            fIntBitsToFloat = Float.intBitsToFloat(d0aVar.m());
                            int iG8 = d0aVar.G();
                            int iG9 = d0aVar.G();
                            j49VarA = j49.a(iG8);
                            j49VarA2 = j49.a(iG9);
                            if (fIntBitsToFloat > 0.0f) {
                                k49Var = new k49(fIntBitsToFloat, j49VarA, j49VarA2);
                            } else {
                                k49Var = new k49(fIntBitsToFloat, j49VarA, j49VarA2);
                            }
                            d0aVar.N(2);
                            int iC4 = d0aVar.C();
                            i9 = (16773120 & iC4) >> 12;
                            iMax = iC4 & 4095;
                            if (strX.startsWith("LAME")) {
                                i9 += 529;
                                iMax = Math.max(0, iMax - 529);
                            } else {
                                i9 += 529;
                                iMax = Math.max(0, iMax - 529);
                            }
                        } else {
                            iMax = -1;
                            i9 = -1;
                            k49Var = null;
                        }
                        j8 = iD;
                        tlgVar = new tlg();
                        u49 u49Var5 = new u49();
                        u49Var5.a = u49Var2.a;
                        u49Var5.g = (String) u49Var2.g;
                        u49Var5.b = u49Var2.b;
                        u49Var5.c = u49Var2.c;
                        u49Var5.d = u49Var2.d;
                        u49Var5.e = u49Var2.e;
                        u49Var5.f = u49Var2.f;
                        tlgVar.c = u49Var5;
                        tlgVar.b = j8;
                        tlgVar.a = i9;
                        tlgVar.d = iMax;
                        u49Var = (u49) tlgVar.c;
                        if (s46Var.a != -1) {
                            s46Var.a = i9;
                            s46Var.b = iMax;
                        } else {
                            s46Var.a = i9;
                            s46Var.b = iMax;
                        }
                        if (k49Var != null) {
                            su8Var = new su8(k49Var);
                        } else {
                            su8Var = null;
                        }
                        this.l = su8Var;
                        position2 = m95Var.getPosition();
                        m95Var.l(u49Var2.b);
                        if (iM2 == 1483304551) {
                            long length9 = m95Var.getLength();
                            jA2 = tlgVar.a();
                            if (jA2 == -9223372036854775807L) {
                                yk2Var = null;
                            } else {
                                if (j7 != -1) {
                                    jMin = j7;
                                } else {
                                    jMin = j7;
                                }
                                yk2Var = new xcg(position2, u49Var.b, jA2, jMin, jArr);
                            }
                        } else {
                            j9 = j7;
                            length = m95Var.getLength();
                            jA = tlgVar.a();
                            if (jA != -9223372036854775807L) {
                                if (j9 != -1) {
                                    length = position2 + j9;
                                    i10 = u49Var.b;
                                } else if (length != -1) {
                                    j9 = length - position2;
                                    i10 = u49Var.b;
                                } else {
                                    yk2Var = null;
                                }
                                j10 = length;
                                j11 = j9 - ((long) i10);
                                iV = feg.v(j11, jA);
                                if (iV == -2147483647) {
                                    yk2Var = null;
                                } else {
                                    yk2Var = new yk2(j10, position2 + ((long) u49Var.b), iV, rxg.B(cn1.t(j11, j8, RoundingMode.HALF_UP)), false, true, jA);
                                }
                            } else {
                                yk2Var = null;
                            }
                        }
                    } else if (iM2 != 1447187017) {
                        if (iM2 != 1483304551) {
                            m95Var.k();
                        } else {
                            iM3 = d0aVar.m();
                            if ((iM3 & 1) != 0) {
                                iD = d0aVar.D();
                            } else {
                                iD = -1;
                            }
                            if ((iM3 & 2) != 0) {
                                jB = d0aVar.B();
                            } else {
                                jB = -1;
                            }
                            if ((iM3 & 4) == 4) {
                                jArr2 = new long[100];
                                i11 = 0;
                                while (i11 < 100) {
                                    jArr2[i11] = d0aVar.z();
                                    i11++;
                                    jB = jB;
                                }
                                jArr = jArr2;
                            } else {
                                jArr = null;
                            }
                            j7 = jB;
                            if ((iM3 & 8) != 0) {
                                d0aVar.N(4);
                            }
                            if (d0aVar.a() >= 24) {
                                strX = d0aVar.x(9, StandardCharsets.UTF_8);
                                d0aVar.N(2);
                                fIntBitsToFloat = Float.intBitsToFloat(d0aVar.m());
                                int iG10 = d0aVar.G();
                                int iG11 = d0aVar.G();
                                j49VarA = j49.a(iG10);
                                j49VarA2 = j49.a(iG11);
                                if (fIntBitsToFloat > 0.0f) {
                                    k49Var = new k49(fIntBitsToFloat, j49VarA, j49VarA2);
                                } else {
                                    k49Var = new k49(fIntBitsToFloat, j49VarA, j49VarA2);
                                }
                                d0aVar.N(2);
                                int iC5 = d0aVar.C();
                                i9 = (16773120 & iC5) >> 12;
                                iMax = iC5 & 4095;
                                if (strX.startsWith("LAME")) {
                                    i9 += 529;
                                    iMax = Math.max(0, iMax - 529);
                                } else {
                                    i9 += 529;
                                    iMax = Math.max(0, iMax - 529);
                                }
                            } else {
                                iMax = -1;
                                i9 = -1;
                                k49Var = null;
                            }
                            j8 = iD;
                            tlgVar = new tlg();
                            u49 u49Var6 = new u49();
                            u49Var6.a = u49Var2.a;
                            u49Var6.g = (String) u49Var2.g;
                            u49Var6.b = u49Var2.b;
                            u49Var6.c = u49Var2.c;
                            u49Var6.d = u49Var2.d;
                            u49Var6.e = u49Var2.e;
                            u49Var6.f = u49Var2.f;
                            tlgVar.c = u49Var6;
                            tlgVar.b = j8;
                            tlgVar.a = i9;
                            tlgVar.d = iMax;
                            u49Var = (u49) tlgVar.c;
                            if (s46Var.a != -1) {
                                s46Var.a = i9;
                                s46Var.b = iMax;
                            } else {
                                s46Var.a = i9;
                                s46Var.b = iMax;
                            }
                            if (k49Var != null) {
                                su8Var = new su8(k49Var);
                            } else {
                                su8Var = null;
                            }
                            this.l = su8Var;
                            position2 = m95Var.getPosition();
                            m95Var.l(u49Var2.b);
                            if (iM2 == 1483304551) {
                                long length10 = m95Var.getLength();
                                jA2 = tlgVar.a();
                                if (jA2 == -9223372036854775807L) {
                                    if (j7 != -1) {
                                        jMin = j7;
                                    } else {
                                        jMin = j7;
                                    }
                                    yk2Var = new xcg(position2, u49Var.b, jA2, jMin, jArr);
                                }
                            } else {
                                j9 = j7;
                                length = m95Var.getLength();
                                jA = tlgVar.a();
                                if (jA != -9223372036854775807L) {
                                    if (j9 != -1) {
                                        length = position2 + j9;
                                        i10 = u49Var.b;
                                    } else if (length != -1) {
                                        j9 = length - position2;
                                        i10 = u49Var.b;
                                    }
                                    j10 = length;
                                    j11 = j9 - ((long) i10);
                                    iV = feg.v(j11, jA);
                                    if (iV == -2147483647) {
                                        yk2Var = new yk2(j10, position2 + ((long) u49Var.b), iV, rxg.B(cn1.t(j11, j8, RoundingMode.HALF_UP)), false, true, jA);
                                    }
                                }
                            }
                        }
                        yk2Var = null;
                    } else {
                        length6 = m95Var.getLength();
                        position4 = m95Var.getPosition();
                        d0aVar.N(6);
                        int iM6 = d0aVar.m();
                        j13 = position4 + ((long) u49Var2.b);
                        jMax = j13 + ((long) iM6);
                        iM4 = d0aVar.m();
                        if (iM4 <= 0) {
                            jL = pqf.L(u49Var2.c, (((long) iM4) * ((long) u49Var2.f)) - 1);
                            iG = d0aVar.G();
                            iG2 = d0aVar.G();
                            iG3 = d0aVar.G();
                            d0aVar.N(2);
                            jArr5 = new long[iG];
                            jArr6 = new long[iG];
                            j14 = position4 + ((long) u49Var2.b);
                            i16 = 0;
                            while (true) {
                                if (i16 < iG) {
                                    long[] jArr11 = jArr5;
                                    long[] jArr12 = jArr6;
                                    if (length6 != -1) {
                                        StringBuilder sbP4 = ub3.p("VBRI data size mismatch: ", ", ", length6);
                                        sbP4.append(jMax);
                                        xo1.V("VbriSeeker", sbP4.toString());
                                    }
                                    if (jMax != j14) {
                                        StringBuilder sbP5 = ub3.p("VBRI bytes and ToC mismatch (using max): ", ", ", jMax);
                                        sbP5.append(j14);
                                        sbP5.append("\nSeeking will be inaccurate.");
                                        xo1.V("VbriSeeker", sbP5.toString());
                                        jMax = Math.max(jMax, j14);
                                    }
                                    yk2Var = new gsf(jArr11, jArr12, jL, j13, jMax);
                                    break;
                                }
                                long[] jArr13 = jArr5;
                                long[] jArr14 = jArr6;
                                jArr13[i16] = (((long) i16) * jL) / ((long) iG);
                                jArr14[i16] = j14;
                                if (iG3 != 1) {
                                    iZ = d0aVar.z();
                                } else if (iG3 != 2) {
                                    iZ = d0aVar.G();
                                } else if (iG3 != 3) {
                                    iZ = d0aVar.C();
                                } else {
                                    if (iG3 != 4) {
                                        yk2Var = null;
                                        break;
                                    }
                                    iZ = d0aVar.D();
                                }
                                j14 += ((long) iZ) * ((long) iG2);
                                i16++;
                                jArr5 = jArr13;
                                jArr6 = jArr14;
                                iG = iG;
                            }
                        } else {
                            yk2Var = null;
                            break;
                        }
                        m95Var.l(u49Var2.b);
                    }
                    su8Var2 = this.k;
                    position3 = m95Var.getPosition();
                    if (su8Var2 == null) {
                        ly8Var = null;
                    } else {
                        qu8VarArr = su8Var2.a;
                        length2 = qu8VarArr.length;
                        i12 = 0;
                        while (true) {
                            if (i12 < length2) {
                                qu8Var = null;
                                break;
                            }
                            qu8Var4 = qu8VarArr[i12];
                            if (ky8.class.isAssignableFrom(qu8Var4.getClass())) {
                                qu8Var = (qu8) ky8.class.cast(qu8Var4);
                                if (!tpa.a.apply(qu8Var)) {
                                    qu8Var = null;
                                }
                            } else {
                                qu8Var = null;
                            }
                            if (qu8Var != null) {
                                break;
                                break;
                            }
                            i12++;
                        }
                        ky8Var = (ky8) qu8Var;
                        if (ky8Var == null) {
                            ly8Var = null;
                        } else {
                            iArr = ky8Var.e;
                            qu8VarArr2 = su8Var2.a;
                            length3 = qu8VarArr2.length;
                            i13 = 0;
                            while (true) {
                                if (i13 < length3) {
                                    qu8Var2 = null;
                                    break;
                                }
                                qu8Var3 = qu8VarArr2[i13];
                                if (fte.class.isAssignableFrom(qu8Var3.getClass())) {
                                    qu8Var2 = (qu8) fte.class.cast(qu8Var3);
                                    if (!((fte) qu8Var2).a.equals("TLEN")) {
                                        qu8Var2 = null;
                                    }
                                } else {
                                    qu8Var2 = null;
                                }
                                if (qu8Var2 != null) {
                                    break;
                                    break;
                                }
                                i13++;
                            }
                            fteVar = (fte) qu8Var2;
                            if (fteVar == null) {
                                jH = -9223372036854775807L;
                                c = 0;
                            } else {
                                c = 0;
                                jH = pqf.H(Long.parseLong((String) fteVar.c.get(0)));
                            }
                            length4 = iArr.length;
                            int i110 = length4 + 1;
                            jArr3 = new long[i110];
                            jArr4 = new long[i110];
                            jArr3[c] = position3;
                            jArr4[c] = 0;
                            i14 = 1;
                            j12 = 0;
                            while (i14 <= length4) {
                                int i111 = i14 - 1;
                                long j18 = position3 + ((long) (ky8Var.c + iArr[i111]));
                                j12 += (long) (ky8Var.d + ky8Var.f[i111]);
                                jArr3[i14] = j18;
                                jArr4[i14] = j12;
                                i14++;
                                length4 = length4;
                                position3 = j18;
                            }
                            ly8Var = new ly8(jH, jArr3, jArr4);
                        }
                    }
                    z = this.s;
                    i15 = this.a;
                    if (z) {
                        ntcVarG = new mtc(-9223372036854775807L);
                    } else {
                        if (ly8Var == null) {
                            if (yk2Var == null) {
                                yk2Var = g(m95Var);
                            }
                            ly8Var = yk2Var;
                        }
                        if ((i15 & 4) == 0) {
                            if (!(ly8Var instanceof yk2)) {
                                ntcVarG = ly8Var;
                            } else {
                                jH2 = ly8Var.h();
                                if (ly8Var.a() != -1) {
                                    length5 = ly8Var.a();
                                } else {
                                    length5 = m95Var.getLength();
                                }
                                long j19 = length5;
                                if (jH2 != -9223372036854775807L) {
                                    ntcVarG = g(m95Var);
                                } else {
                                    ntcVarG = g(m95Var);
                                }
                            }
                        } else if (!(ly8Var instanceof yk2)) {
                            ntcVarG = ly8Var;
                        } else {
                            jH2 = ly8Var.h();
                            if (ly8Var.a() != -1) {
                                length5 = ly8Var.a();
                            } else {
                                length5 = m95Var.getLength();
                            }
                            long j110 = length5;
                            if (jH2 != -9223372036854775807L) {
                                ntcVarG = g(m95Var);
                            } else {
                                ntcVarG = g(m95Var);
                            }
                        }
                    }
                    this.r = ntcVarG;
                    this.h.d(ntcVarG.h());
                    this.g.q(this.r);
                    su8VarB = this.k;
                    if (su8VarB == null) {
                        su8VarB = this.l;
                    } else {
                        su8VarB = this.l;
                    }
                    qr5Var = new qr5();
                    qr5Var.n = qv8.l("audio/mpeg");
                    qr5Var.o = qv8.l((String) u49Var2.g);
                    qr5Var.p = 4096;
                    qr5Var.I = u49Var2.d;
                    qr5Var.K = u49Var2.c;
                    qr5Var.M = s46Var.a;
                    qr5Var.N = s46Var.b;
                    qr5Var.l = su8VarB;
                    if (this.r.g() != -2147483647) {
                        qr5Var.i = this.r.g();
                    }
                    this.i.g(new rr5(qr5Var));
                    this.o = m95Var.getPosition();
                } else {
                    j = 1000000;
                    j2 = 1;
                    j3 = 0;
                    if (this.o != 0) {
                        position = m95Var.getPosition();
                        j6 = this.o;
                        if (position < j6) {
                            m95Var.l((int) (j6 - position));
                        }
                    }
                }
                if (this.q == 0) {
                    m95Var.k();
                    if (i(m95Var)) {
                        j4 = -9223372036854775807L;
                    } else {
                        d0a d0aVar2 = this.b;
                        d0aVar2.M(0);
                        iM = d0aVar2.m();
                        if (((-128000) & iM) == (((long) this.j) & (-128000)) || qn4.B(iM) == -1) {
                            j4 = -9223372036854775807L;
                            m95Var.l(1);
                            this.j = 0;
                        } else {
                            u49Var2.a(iM);
                            j4 = -9223372036854775807L;
                            if (this.m == -9223372036854775807L) {
                                this.m = this.r.d(m95Var.getPosition());
                            }
                            this.q = u49Var2.b;
                            long position5 = m95Var.getPosition() + ((long) u49Var2.b);
                            this.p = position5;
                            ntc ntcVar = this.r;
                            if (ntcVar instanceof k17) {
                                j17 j17Var = ((k17) ntcVar).d;
                                long j20 = (((this.n + ((long) u49Var2.f)) * j) / ((long) u49Var2.c)) + this.m;
                                jf8 jf8Var = j17Var.b;
                                int i20 = jf8Var.b;
                                if (i20 == 0 || j20 - jf8Var.d(i20 - 1) >= 100000) {
                                    j17Var.i(j20, position5);
                                }
                                if (this.t) {
                                    long j21 = this.u;
                                    jf8 jf8Var2 = j17Var.b;
                                    int i21 = jf8Var2.b;
                                    if (i21 != 0 && j21 - jf8Var2.d(i21 - 1) < 100000) {
                                        this.t = false;
                                        this.i = this.h;
                                    }
                                }
                            }
                        }
                        i = -1;
                        i2 = 0;
                    }
                    i = -1;
                    i2 = -1;
                } else {
                    j4 = -9223372036854775807L;
                }
                iC = this.i.c(m95Var, this.q, true);
                if (iC == -1) {
                    i = -1;
                    i2 = -1;
                } else {
                    i4 = this.q - iC;
                    this.q = i4;
                    if (i4 > 0) {
                        i = -1;
                        i2 = 0;
                    } else {
                        this.i.a(((this.n * j) / ((long) u49Var2.c)) + this.m, 1, u49Var2.b, 0, null);
                        this.n += (long) u49Var2.f;
                        this.q = 0;
                        i2 = 0;
                        i = -1;
                    }
                }
            } catch (EOFException unused) {
                i = -1;
                i2 = -1;
                j = 1000000;
                j2 = 1;
                j3 = 0;
                j4 = -9223372036854775807L;
            }
        } else {
            if (this.r == null) {
                j = 1000000;
                d0aVar = new d0a(u49Var2.b);
                m95Var.o(d0aVar.a, 0, u49Var2.b);
                i5 = u49Var2.a & 1;
                i6 = u49Var2.d;
                i7 = 21;
                j2 = 1;
                if (i5 != 0) {
                    if (i6 != 1) {
                        i8 = 36;
                    }
                    j3 = 0;
                    if (d0aVar.c >= i8 + 4) {
                        d0aVar.M(i8);
                        iM2 = d0aVar.m();
                        if (iM2 != 1483304551) {
                            if (d0aVar.c >= 40) {
                                d0aVar.M(36);
                                if (d0aVar.m() == 1447187017) {
                                    iM2 = 1447187017;
                                } else {
                                    iM2 = 0;
                                }
                            } else {
                                iM2 = 0;
                            }
                        }
                    } else if (d0aVar.c >= 40) {
                        d0aVar.M(36);
                        if (d0aVar.m() == 1447187017) {
                            iM2 = 1447187017;
                        } else {
                            iM2 = 0;
                        }
                    } else {
                        iM2 = 0;
                    }
                    if (iM2 == 1231971951) {
                        iM3 = d0aVar.m();
                        if ((iM3 & 1) != 0) {
                            iD = d0aVar.D();
                        } else {
                            iD = -1;
                        }
                        if ((iM3 & 2) != 0) {
                            jB = d0aVar.B();
                        } else {
                            jB = -1;
                        }
                        if ((iM3 & 4) == 4) {
                            jArr2 = new long[100];
                            i11 = 0;
                            while (i11 < 100) {
                                jArr2[i11] = d0aVar.z();
                                i11++;
                                jB = jB;
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        j7 = jB;
                        if ((iM3 & 8) != 0) {
                            d0aVar.N(4);
                        }
                        if (d0aVar.a() >= 24) {
                            strX = d0aVar.x(9, StandardCharsets.UTF_8);
                            d0aVar.N(2);
                            fIntBitsToFloat = Float.intBitsToFloat(d0aVar.m());
                            int iG12 = d0aVar.G();
                            int iG13 = d0aVar.G();
                            j49VarA = j49.a(iG12);
                            j49VarA2 = j49.a(iG13);
                            if (fIntBitsToFloat > 0.0f) {
                                k49Var = new k49(fIntBitsToFloat, j49VarA, j49VarA2);
                            } else {
                                k49Var = new k49(fIntBitsToFloat, j49VarA, j49VarA2);
                            }
                            d0aVar.N(2);
                            int iC6 = d0aVar.C();
                            i9 = (16773120 & iC6) >> 12;
                            iMax = iC6 & 4095;
                            if (strX.startsWith("LAME")) {
                                i9 += 529;
                                iMax = Math.max(0, iMax - 529);
                            } else {
                                i9 += 529;
                                iMax = Math.max(0, iMax - 529);
                            }
                        } else {
                            iMax = -1;
                            i9 = -1;
                            k49Var = null;
                        }
                        j8 = iD;
                        tlgVar = new tlg();
                        u49 u49Var7 = new u49();
                        u49Var7.a = u49Var2.a;
                        u49Var7.g = (String) u49Var2.g;
                        u49Var7.b = u49Var2.b;
                        u49Var7.c = u49Var2.c;
                        u49Var7.d = u49Var2.d;
                        u49Var7.e = u49Var2.e;
                        u49Var7.f = u49Var2.f;
                        tlgVar.c = u49Var7;
                        tlgVar.b = j8;
                        tlgVar.a = i9;
                        tlgVar.d = iMax;
                        u49Var = (u49) tlgVar.c;
                        if (s46Var.a != -1) {
                            s46Var.a = i9;
                            s46Var.b = iMax;
                        } else {
                            s46Var.a = i9;
                            s46Var.b = iMax;
                        }
                        if (k49Var != null) {
                            su8Var = new su8(k49Var);
                        } else {
                            su8Var = null;
                        }
                        this.l = su8Var;
                        position2 = m95Var.getPosition();
                        m95Var.l(u49Var2.b);
                        if (iM2 == 1483304551) {
                            long length11 = m95Var.getLength();
                            jA2 = tlgVar.a();
                            if (jA2 == -9223372036854775807L) {
                                yk2Var = null;
                            } else {
                                if (j7 != -1) {
                                    jMin = j7;
                                } else {
                                    jMin = j7;
                                }
                                yk2Var = new xcg(position2, u49Var.b, jA2, jMin, jArr);
                            }
                        } else {
                            j9 = j7;
                            length = m95Var.getLength();
                            jA = tlgVar.a();
                            if (jA != -9223372036854775807L) {
                                if (j9 != -1) {
                                    length = position2 + j9;
                                    i10 = u49Var.b;
                                } else if (length != -1) {
                                    j9 = length - position2;
                                    i10 = u49Var.b;
                                } else {
                                    yk2Var = null;
                                }
                                j10 = length;
                                j11 = j9 - ((long) i10);
                                iV = feg.v(j11, jA);
                                if (iV == -2147483647) {
                                    yk2Var = null;
                                } else {
                                    yk2Var = new yk2(j10, position2 + ((long) u49Var.b), iV, rxg.B(cn1.t(j11, j8, RoundingMode.HALF_UP)), false, true, jA);
                                }
                            } else {
                                yk2Var = null;
                            }
                        }
                    } else if (iM2 != 1447187017) {
                        if (iM2 != 1483304551) {
                            m95Var.k();
                        } else {
                            iM3 = d0aVar.m();
                            if ((iM3 & 1) != 0) {
                                iD = d0aVar.D();
                            } else {
                                iD = -1;
                            }
                            if ((iM3 & 2) != 0) {
                                jB = d0aVar.B();
                            } else {
                                jB = -1;
                            }
                            if ((iM3 & 4) == 4) {
                                jArr2 = new long[100];
                                i11 = 0;
                                while (i11 < 100) {
                                    jArr2[i11] = d0aVar.z();
                                    i11++;
                                    jB = jB;
                                }
                                jArr = jArr2;
                            } else {
                                jArr = null;
                            }
                            j7 = jB;
                            if ((iM3 & 8) != 0) {
                                d0aVar.N(4);
                            }
                            if (d0aVar.a() >= 24) {
                                strX = d0aVar.x(9, StandardCharsets.UTF_8);
                                d0aVar.N(2);
                                fIntBitsToFloat = Float.intBitsToFloat(d0aVar.m());
                                int iG14 = d0aVar.G();
                                int iG15 = d0aVar.G();
                                j49VarA = j49.a(iG14);
                                j49VarA2 = j49.a(iG15);
                                if (fIntBitsToFloat > 0.0f) {
                                    k49Var = new k49(fIntBitsToFloat, j49VarA, j49VarA2);
                                } else {
                                    k49Var = new k49(fIntBitsToFloat, j49VarA, j49VarA2);
                                }
                                d0aVar.N(2);
                                int iC7 = d0aVar.C();
                                i9 = (16773120 & iC7) >> 12;
                                iMax = iC7 & 4095;
                                if (strX.startsWith("LAME")) {
                                    i9 += 529;
                                    iMax = Math.max(0, iMax - 529);
                                } else {
                                    i9 += 529;
                                    iMax = Math.max(0, iMax - 529);
                                }
                            } else {
                                iMax = -1;
                                i9 = -1;
                                k49Var = null;
                            }
                            j8 = iD;
                            tlgVar = new tlg();
                            u49 u49Var8 = new u49();
                            u49Var8.a = u49Var2.a;
                            u49Var8.g = (String) u49Var2.g;
                            u49Var8.b = u49Var2.b;
                            u49Var8.c = u49Var2.c;
                            u49Var8.d = u49Var2.d;
                            u49Var8.e = u49Var2.e;
                            u49Var8.f = u49Var2.f;
                            tlgVar.c = u49Var8;
                            tlgVar.b = j8;
                            tlgVar.a = i9;
                            tlgVar.d = iMax;
                            u49Var = (u49) tlgVar.c;
                            if (s46Var.a != -1) {
                                s46Var.a = i9;
                                s46Var.b = iMax;
                            } else {
                                s46Var.a = i9;
                                s46Var.b = iMax;
                            }
                            if (k49Var != null) {
                                su8Var = new su8(k49Var);
                            } else {
                                su8Var = null;
                            }
                            this.l = su8Var;
                            position2 = m95Var.getPosition();
                            m95Var.l(u49Var2.b);
                            if (iM2 == 1483304551) {
                                long length12 = m95Var.getLength();
                                jA2 = tlgVar.a();
                                if (jA2 == -9223372036854775807L) {
                                    if (j7 != -1) {
                                        jMin = j7;
                                    } else {
                                        jMin = j7;
                                    }
                                    yk2Var = new xcg(position2, u49Var.b, jA2, jMin, jArr);
                                }
                            } else {
                                j9 = j7;
                                length = m95Var.getLength();
                                jA = tlgVar.a();
                                if (jA != -9223372036854775807L) {
                                    if (j9 != -1) {
                                        length = position2 + j9;
                                        i10 = u49Var.b;
                                    } else if (length != -1) {
                                        j9 = length - position2;
                                        i10 = u49Var.b;
                                    }
                                    j10 = length;
                                    j11 = j9 - ((long) i10);
                                    iV = feg.v(j11, jA);
                                    if (iV == -2147483647) {
                                        yk2Var = new yk2(j10, position2 + ((long) u49Var.b), iV, rxg.B(cn1.t(j11, j8, RoundingMode.HALF_UP)), false, true, jA);
                                    }
                                }
                            }
                        }
                        yk2Var = null;
                    } else {
                        length6 = m95Var.getLength();
                        position4 = m95Var.getPosition();
                        d0aVar.N(6);
                        int iM7 = d0aVar.m();
                        j13 = position4 + ((long) u49Var2.b);
                        jMax = j13 + ((long) iM7);
                        iM4 = d0aVar.m();
                        if (iM4 <= 0) {
                            jL = pqf.L(u49Var2.c, (((long) iM4) * ((long) u49Var2.f)) - 1);
                            iG = d0aVar.G();
                            iG2 = d0aVar.G();
                            iG3 = d0aVar.G();
                            d0aVar.N(2);
                            jArr5 = new long[iG];
                            jArr6 = new long[iG];
                            j14 = position4 + ((long) u49Var2.b);
                            i16 = 0;
                            while (true) {
                                if (i16 < iG) {
                                    long[] jArr15 = jArr5;
                                    long[] jArr16 = jArr6;
                                    if (length6 != -1) {
                                        StringBuilder sbP6 = ub3.p("VBRI data size mismatch: ", ", ", length6);
                                        sbP6.append(jMax);
                                        xo1.V("VbriSeeker", sbP6.toString());
                                    }
                                    if (jMax != j14) {
                                        StringBuilder sbP7 = ub3.p("VBRI bytes and ToC mismatch (using max): ", ", ", jMax);
                                        sbP7.append(j14);
                                        sbP7.append("\nSeeking will be inaccurate.");
                                        xo1.V("VbriSeeker", sbP7.toString());
                                        jMax = Math.max(jMax, j14);
                                    }
                                    yk2Var = new gsf(jArr15, jArr16, jL, j13, jMax);
                                    break;
                                }
                                long[] jArr17 = jArr5;
                                long[] jArr18 = jArr6;
                                jArr17[i16] = (((long) i16) * jL) / ((long) iG);
                                jArr18[i16] = j14;
                                if (iG3 != 1) {
                                    iZ = d0aVar.z();
                                } else if (iG3 != 2) {
                                    iZ = d0aVar.G();
                                } else if (iG3 != 3) {
                                    iZ = d0aVar.C();
                                } else {
                                    if (iG3 != 4) {
                                        yk2Var = null;
                                        break;
                                    }
                                    iZ = d0aVar.D();
                                }
                                j14 += ((long) iZ) * ((long) iG2);
                                i16++;
                                jArr5 = jArr17;
                                jArr6 = jArr18;
                                iG = iG;
                            }
                        } else {
                            yk2Var = null;
                            break;
                        }
                        m95Var.l(u49Var2.b);
                    }
                    su8Var2 = this.k;
                    position3 = m95Var.getPosition();
                    if (su8Var2 == null) {
                        ly8Var = null;
                    } else {
                        qu8VarArr = su8Var2.a;
                        length2 = qu8VarArr.length;
                        i12 = 0;
                        while (true) {
                            if (i12 < length2) {
                                qu8Var = null;
                                break;
                            }
                            qu8Var4 = qu8VarArr[i12];
                            if (ky8.class.isAssignableFrom(qu8Var4.getClass())) {
                                qu8Var = (qu8) ky8.class.cast(qu8Var4);
                                if (!tpa.a.apply(qu8Var)) {
                                    qu8Var = null;
                                }
                            } else {
                                qu8Var = null;
                            }
                            if (qu8Var != null) {
                                break;
                                break;
                            }
                            i12++;
                        }
                        ky8Var = (ky8) qu8Var;
                        if (ky8Var == null) {
                            ly8Var = null;
                        } else {
                            iArr = ky8Var.e;
                            qu8VarArr2 = su8Var2.a;
                            length3 = qu8VarArr2.length;
                            i13 = 0;
                            while (true) {
                                if (i13 < length3) {
                                    qu8Var2 = null;
                                    break;
                                }
                                qu8Var3 = qu8VarArr2[i13];
                                if (fte.class.isAssignableFrom(qu8Var3.getClass())) {
                                    qu8Var2 = (qu8) fte.class.cast(qu8Var3);
                                    if (!((fte) qu8Var2).a.equals("TLEN")) {
                                        qu8Var2 = null;
                                    }
                                } else {
                                    qu8Var2 = null;
                                }
                                if (qu8Var2 != null) {
                                    break;
                                    break;
                                }
                                i13++;
                            }
                            fteVar = (fte) qu8Var2;
                            if (fteVar == null) {
                                jH = -9223372036854775807L;
                                c = 0;
                            } else {
                                c = 0;
                                jH = pqf.H(Long.parseLong((String) fteVar.c.get(0)));
                            }
                            length4 = iArr.length;
                            int i112 = length4 + 1;
                            jArr3 = new long[i112];
                            jArr4 = new long[i112];
                            jArr3[c] = position3;
                            jArr4[c] = 0;
                            i14 = 1;
                            j12 = 0;
                            while (i14 <= length4) {
                                int i113 = i14 - 1;
                                long j111 = position3 + ((long) (ky8Var.c + iArr[i113]));
                                j12 += (long) (ky8Var.d + ky8Var.f[i113]);
                                jArr3[i14] = j111;
                                jArr4[i14] = j12;
                                i14++;
                                length4 = length4;
                                position3 = j111;
                            }
                            ly8Var = new ly8(jH, jArr3, jArr4);
                        }
                    }
                    z = this.s;
                    i15 = this.a;
                    if (z) {
                        ntcVarG = new mtc(-9223372036854775807L);
                    } else {
                        if (ly8Var == null) {
                            if (yk2Var == null) {
                                yk2Var = g(m95Var);
                            }
                            ly8Var = yk2Var;
                        }
                        if ((i15 & 4) == 0) {
                            if (!(ly8Var instanceof yk2)) {
                                ntcVarG = ly8Var;
                            } else {
                                jH2 = ly8Var.h();
                                if (ly8Var.a() != -1) {
                                    length5 = ly8Var.a();
                                } else {
                                    length5 = m95Var.getLength();
                                }
                                long j112 = length5;
                                if (jH2 != -9223372036854775807L) {
                                    ntcVarG = g(m95Var);
                                } else {
                                    ntcVarG = g(m95Var);
                                }
                            }
                        } else if (!(ly8Var instanceof yk2)) {
                            ntcVarG = ly8Var;
                        } else {
                            jH2 = ly8Var.h();
                            if (ly8Var.a() != -1) {
                                length5 = ly8Var.a();
                            } else {
                                length5 = m95Var.getLength();
                            }
                            long j113 = length5;
                            if (jH2 != -9223372036854775807L) {
                                ntcVarG = g(m95Var);
                            } else {
                                ntcVarG = g(m95Var);
                            }
                        }
                    }
                    this.r = ntcVarG;
                    this.h.d(ntcVarG.h());
                    this.g.q(this.r);
                    su8VarB = this.k;
                    if (su8VarB == null) {
                        su8VarB = this.l;
                    } else {
                        su8VarB = this.l;
                    }
                    qr5Var = new qr5();
                    qr5Var.n = qv8.l("audio/mpeg");
                    qr5Var.o = qv8.l((String) u49Var2.g);
                    qr5Var.p = 4096;
                    qr5Var.I = u49Var2.d;
                    qr5Var.K = u49Var2.c;
                    qr5Var.M = s46Var.a;
                    qr5Var.N = s46Var.b;
                    qr5Var.l = su8VarB;
                    if (this.r.g() != -2147483647) {
                        qr5Var.i = this.r.g();
                    }
                    this.i.g(new rr5(qr5Var));
                    this.o = m95Var.getPosition();
                } else if (i6 == 1) {
                    i7 = 13;
                }
                i8 = i7;
                j3 = 0;
                if (d0aVar.c >= i8 + 4) {
                    d0aVar.M(i8);
                    iM2 = d0aVar.m();
                    if (iM2 != 1483304551) {
                        if (d0aVar.c >= 40) {
                            d0aVar.M(36);
                            if (d0aVar.m() == 1447187017) {
                                iM2 = 1447187017;
                            } else {
                                iM2 = 0;
                            }
                        } else {
                            iM2 = 0;
                        }
                    }
                } else if (d0aVar.c >= 40) {
                    d0aVar.M(36);
                    if (d0aVar.m() == 1447187017) {
                        iM2 = 1447187017;
                    } else {
                        iM2 = 0;
                    }
                } else {
                    iM2 = 0;
                }
                if (iM2 == 1231971951) {
                    iM3 = d0aVar.m();
                    if ((iM3 & 1) != 0) {
                        iD = d0aVar.D();
                    } else {
                        iD = -1;
                    }
                    if ((iM3 & 2) != 0) {
                        jB = d0aVar.B();
                    } else {
                        jB = -1;
                    }
                    if ((iM3 & 4) == 4) {
                        jArr2 = new long[100];
                        i11 = 0;
                        while (i11 < 100) {
                            jArr2[i11] = d0aVar.z();
                            i11++;
                            jB = jB;
                        }
                        jArr = jArr2;
                    } else {
                        jArr = null;
                    }
                    j7 = jB;
                    if ((iM3 & 8) != 0) {
                        d0aVar.N(4);
                    }
                    if (d0aVar.a() >= 24) {
                        strX = d0aVar.x(9, StandardCharsets.UTF_8);
                        d0aVar.N(2);
                        fIntBitsToFloat = Float.intBitsToFloat(d0aVar.m());
                        int iG16 = d0aVar.G();
                        int iG17 = d0aVar.G();
                        j49VarA = j49.a(iG16);
                        j49VarA2 = j49.a(iG17);
                        if (fIntBitsToFloat > 0.0f) {
                            k49Var = new k49(fIntBitsToFloat, j49VarA, j49VarA2);
                        } else {
                            k49Var = new k49(fIntBitsToFloat, j49VarA, j49VarA2);
                        }
                        d0aVar.N(2);
                        int iC8 = d0aVar.C();
                        i9 = (16773120 & iC8) >> 12;
                        iMax = iC8 & 4095;
                        if (strX.startsWith("LAME")) {
                            i9 += 529;
                            iMax = Math.max(0, iMax - 529);
                        } else {
                            i9 += 529;
                            iMax = Math.max(0, iMax - 529);
                        }
                    } else {
                        iMax = -1;
                        i9 = -1;
                        k49Var = null;
                    }
                    j8 = iD;
                    tlgVar = new tlg();
                    u49 u49Var9 = new u49();
                    u49Var9.a = u49Var2.a;
                    u49Var9.g = (String) u49Var2.g;
                    u49Var9.b = u49Var2.b;
                    u49Var9.c = u49Var2.c;
                    u49Var9.d = u49Var2.d;
                    u49Var9.e = u49Var2.e;
                    u49Var9.f = u49Var2.f;
                    tlgVar.c = u49Var9;
                    tlgVar.b = j8;
                    tlgVar.a = i9;
                    tlgVar.d = iMax;
                    u49Var = (u49) tlgVar.c;
                    if (s46Var.a != -1) {
                        s46Var.a = i9;
                        s46Var.b = iMax;
                    } else {
                        s46Var.a = i9;
                        s46Var.b = iMax;
                    }
                    if (k49Var != null) {
                        su8Var = new su8(k49Var);
                    } else {
                        su8Var = null;
                    }
                    this.l = su8Var;
                    position2 = m95Var.getPosition();
                    m95Var.l(u49Var2.b);
                    if (iM2 == 1483304551) {
                        long length13 = m95Var.getLength();
                        jA2 = tlgVar.a();
                        if (jA2 == -9223372036854775807L) {
                            yk2Var = null;
                        } else {
                            if (j7 != -1) {
                                jMin = j7;
                            } else {
                                jMin = j7;
                            }
                            yk2Var = new xcg(position2, u49Var.b, jA2, jMin, jArr);
                        }
                    } else {
                        j9 = j7;
                        length = m95Var.getLength();
                        jA = tlgVar.a();
                        if (jA != -9223372036854775807L) {
                            if (j9 != -1) {
                                length = position2 + j9;
                                i10 = u49Var.b;
                            } else if (length != -1) {
                                j9 = length - position2;
                                i10 = u49Var.b;
                            } else {
                                yk2Var = null;
                            }
                            j10 = length;
                            j11 = j9 - ((long) i10);
                            iV = feg.v(j11, jA);
                            if (iV == -2147483647) {
                                yk2Var = null;
                            } else {
                                yk2Var = new yk2(j10, position2 + ((long) u49Var.b), iV, rxg.B(cn1.t(j11, j8, RoundingMode.HALF_UP)), false, true, jA);
                            }
                        } else {
                            yk2Var = null;
                        }
                    }
                } else if (iM2 != 1447187017) {
                    if (iM2 != 1483304551) {
                        m95Var.k();
                    } else {
                        iM3 = d0aVar.m();
                        if ((iM3 & 1) != 0) {
                            iD = d0aVar.D();
                        } else {
                            iD = -1;
                        }
                        if ((iM3 & 2) != 0) {
                            jB = d0aVar.B();
                        } else {
                            jB = -1;
                        }
                        if ((iM3 & 4) == 4) {
                            jArr2 = new long[100];
                            i11 = 0;
                            while (i11 < 100) {
                                jArr2[i11] = d0aVar.z();
                                i11++;
                                jB = jB;
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        j7 = jB;
                        if ((iM3 & 8) != 0) {
                            d0aVar.N(4);
                        }
                        if (d0aVar.a() >= 24) {
                            strX = d0aVar.x(9, StandardCharsets.UTF_8);
                            d0aVar.N(2);
                            fIntBitsToFloat = Float.intBitsToFloat(d0aVar.m());
                            int iG18 = d0aVar.G();
                            int iG19 = d0aVar.G();
                            j49VarA = j49.a(iG18);
                            j49VarA2 = j49.a(iG19);
                            if (fIntBitsToFloat > 0.0f) {
                                k49Var = new k49(fIntBitsToFloat, j49VarA, j49VarA2);
                            } else {
                                k49Var = new k49(fIntBitsToFloat, j49VarA, j49VarA2);
                            }
                            d0aVar.N(2);
                            int iC9 = d0aVar.C();
                            i9 = (16773120 & iC9) >> 12;
                            iMax = iC9 & 4095;
                            if (strX.startsWith("LAME")) {
                                i9 += 529;
                                iMax = Math.max(0, iMax - 529);
                            } else {
                                i9 += 529;
                                iMax = Math.max(0, iMax - 529);
                            }
                        } else {
                            iMax = -1;
                            i9 = -1;
                            k49Var = null;
                        }
                        j8 = iD;
                        tlgVar = new tlg();
                        u49 u49Var10 = new u49();
                        u49Var10.a = u49Var2.a;
                        u49Var10.g = (String) u49Var2.g;
                        u49Var10.b = u49Var2.b;
                        u49Var10.c = u49Var2.c;
                        u49Var10.d = u49Var2.d;
                        u49Var10.e = u49Var2.e;
                        u49Var10.f = u49Var2.f;
                        tlgVar.c = u49Var10;
                        tlgVar.b = j8;
                        tlgVar.a = i9;
                        tlgVar.d = iMax;
                        u49Var = (u49) tlgVar.c;
                        if (s46Var.a != -1) {
                            s46Var.a = i9;
                            s46Var.b = iMax;
                        } else {
                            s46Var.a = i9;
                            s46Var.b = iMax;
                        }
                        if (k49Var != null) {
                            su8Var = new su8(k49Var);
                        } else {
                            su8Var = null;
                        }
                        this.l = su8Var;
                        position2 = m95Var.getPosition();
                        m95Var.l(u49Var2.b);
                        if (iM2 == 1483304551) {
                            long length14 = m95Var.getLength();
                            jA2 = tlgVar.a();
                            if (jA2 == -9223372036854775807L) {
                                if (j7 != -1) {
                                    jMin = j7;
                                } else {
                                    jMin = j7;
                                }
                                yk2Var = new xcg(position2, u49Var.b, jA2, jMin, jArr);
                            }
                        } else {
                            j9 = j7;
                            length = m95Var.getLength();
                            jA = tlgVar.a();
                            if (jA != -9223372036854775807L) {
                                if (j9 != -1) {
                                    length = position2 + j9;
                                    i10 = u49Var.b;
                                } else if (length != -1) {
                                    j9 = length - position2;
                                    i10 = u49Var.b;
                                }
                                j10 = length;
                                j11 = j9 - ((long) i10);
                                iV = feg.v(j11, jA);
                                if (iV == -2147483647) {
                                    yk2Var = new yk2(j10, position2 + ((long) u49Var.b), iV, rxg.B(cn1.t(j11, j8, RoundingMode.HALF_UP)), false, true, jA);
                                }
                            }
                        }
                    }
                    yk2Var = null;
                } else {
                    length6 = m95Var.getLength();
                    position4 = m95Var.getPosition();
                    d0aVar.N(6);
                    int iM8 = d0aVar.m();
                    j13 = position4 + ((long) u49Var2.b);
                    jMax = j13 + ((long) iM8);
                    iM4 = d0aVar.m();
                    if (iM4 <= 0) {
                        jL = pqf.L(u49Var2.c, (((long) iM4) * ((long) u49Var2.f)) - 1);
                        iG = d0aVar.G();
                        iG2 = d0aVar.G();
                        iG3 = d0aVar.G();
                        d0aVar.N(2);
                        jArr5 = new long[iG];
                        jArr6 = new long[iG];
                        j14 = position4 + ((long) u49Var2.b);
                        i16 = 0;
                        while (true) {
                            if (i16 < iG) {
                                long[] jArr19 = jArr5;
                                long[] jArr110 = jArr6;
                                if (length6 != -1) {
                                    StringBuilder sbP8 = ub3.p("VBRI data size mismatch: ", ", ", length6);
                                    sbP8.append(jMax);
                                    xo1.V("VbriSeeker", sbP8.toString());
                                }
                                if (jMax != j14) {
                                    StringBuilder sbP9 = ub3.p("VBRI bytes and ToC mismatch (using max): ", ", ", jMax);
                                    sbP9.append(j14);
                                    sbP9.append("\nSeeking will be inaccurate.");
                                    xo1.V("VbriSeeker", sbP9.toString());
                                    jMax = Math.max(jMax, j14);
                                }
                                yk2Var = new gsf(jArr19, jArr110, jL, j13, jMax);
                                break;
                            }
                            long[] jArr111 = jArr5;
                            long[] jArr112 = jArr6;
                            jArr111[i16] = (((long) i16) * jL) / ((long) iG);
                            jArr112[i16] = j14;
                            if (iG3 != 1) {
                                iZ = d0aVar.z();
                            } else if (iG3 != 2) {
                                iZ = d0aVar.G();
                            } else if (iG3 != 3) {
                                iZ = d0aVar.C();
                            } else {
                                if (iG3 != 4) {
                                    yk2Var = null;
                                    break;
                                }
                                iZ = d0aVar.D();
                            }
                            j14 += ((long) iZ) * ((long) iG2);
                            i16++;
                            jArr5 = jArr111;
                            jArr6 = jArr112;
                            iG = iG;
                        }
                    } else {
                        yk2Var = null;
                        break;
                    }
                    m95Var.l(u49Var2.b);
                }
                su8Var2 = this.k;
                position3 = m95Var.getPosition();
                if (su8Var2 == null) {
                    ly8Var = null;
                } else {
                    qu8VarArr = su8Var2.a;
                    length2 = qu8VarArr.length;
                    i12 = 0;
                    while (true) {
                        if (i12 < length2) {
                            qu8Var = null;
                            break;
                        }
                        qu8Var4 = qu8VarArr[i12];
                        if (ky8.class.isAssignableFrom(qu8Var4.getClass())) {
                            qu8Var = (qu8) ky8.class.cast(qu8Var4);
                            if (!tpa.a.apply(qu8Var)) {
                                qu8Var = null;
                            }
                        } else {
                            qu8Var = null;
                        }
                        if (qu8Var != null) {
                            break;
                            break;
                        }
                        i12++;
                    }
                    ky8Var = (ky8) qu8Var;
                    if (ky8Var == null) {
                        ly8Var = null;
                    } else {
                        iArr = ky8Var.e;
                        qu8VarArr2 = su8Var2.a;
                        length3 = qu8VarArr2.length;
                        i13 = 0;
                        while (true) {
                            if (i13 < length3) {
                                qu8Var2 = null;
                                break;
                            }
                            qu8Var3 = qu8VarArr2[i13];
                            if (fte.class.isAssignableFrom(qu8Var3.getClass())) {
                                qu8Var2 = (qu8) fte.class.cast(qu8Var3);
                                if (!((fte) qu8Var2).a.equals("TLEN")) {
                                    qu8Var2 = null;
                                }
                            } else {
                                qu8Var2 = null;
                            }
                            if (qu8Var2 != null) {
                                break;
                                break;
                            }
                            i13++;
                        }
                        fteVar = (fte) qu8Var2;
                        if (fteVar == null) {
                            jH = -9223372036854775807L;
                            c = 0;
                        } else {
                            c = 0;
                            jH = pqf.H(Long.parseLong((String) fteVar.c.get(0)));
                        }
                        length4 = iArr.length;
                        int i114 = length4 + 1;
                        jArr3 = new long[i114];
                        jArr4 = new long[i114];
                        jArr3[c] = position3;
                        jArr4[c] = 0;
                        i14 = 1;
                        j12 = 0;
                        while (i14 <= length4) {
                            int i115 = i14 - 1;
                            long j114 = position3 + ((long) (ky8Var.c + iArr[i115]));
                            j12 += (long) (ky8Var.d + ky8Var.f[i115]);
                            jArr3[i14] = j114;
                            jArr4[i14] = j12;
                            i14++;
                            length4 = length4;
                            position3 = j114;
                        }
                        ly8Var = new ly8(jH, jArr3, jArr4);
                    }
                }
                z = this.s;
                i15 = this.a;
                if (z) {
                    ntcVarG = new mtc(-9223372036854775807L);
                } else {
                    if (ly8Var == null) {
                        if (yk2Var == null) {
                            yk2Var = g(m95Var);
                        }
                        ly8Var = yk2Var;
                    }
                    if ((i15 & 4) == 0) {
                        if (!(ly8Var instanceof yk2)) {
                            ntcVarG = ly8Var;
                        } else {
                            jH2 = ly8Var.h();
                            if (ly8Var.a() != -1) {
                                length5 = ly8Var.a();
                            } else {
                                length5 = m95Var.getLength();
                            }
                            long j115 = length5;
                            if (jH2 != -9223372036854775807L) {
                                ntcVarG = g(m95Var);
                            } else {
                                ntcVarG = g(m95Var);
                            }
                        }
                    } else if (!(ly8Var instanceof yk2)) {
                        ntcVarG = ly8Var;
                    } else {
                        jH2 = ly8Var.h();
                        if (ly8Var.a() != -1) {
                            length5 = ly8Var.a();
                        } else {
                            length5 = m95Var.getLength();
                        }
                        long j116 = length5;
                        if (jH2 != -9223372036854775807L) {
                            ntcVarG = g(m95Var);
                        } else {
                            ntcVarG = g(m95Var);
                        }
                    }
                }
                this.r = ntcVarG;
                this.h.d(ntcVarG.h());
                this.g.q(this.r);
                su8VarB = this.k;
                if (su8VarB == null) {
                    su8VarB = this.l;
                } else {
                    su8VarB = this.l;
                }
                qr5Var = new qr5();
                qr5Var.n = qv8.l("audio/mpeg");
                qr5Var.o = qv8.l((String) u49Var2.g);
                qr5Var.p = 4096;
                qr5Var.I = u49Var2.d;
                qr5Var.K = u49Var2.c;
                qr5Var.M = s46Var.a;
                qr5Var.N = s46Var.b;
                qr5Var.l = su8VarB;
                if (this.r.g() != -2147483647) {
                    qr5Var.i = this.r.g();
                }
                this.i.g(new rr5(qr5Var));
                this.o = m95Var.getPosition();
            } else {
                j = 1000000;
                j2 = 1;
                j3 = 0;
                if (this.o != 0) {
                    position = m95Var.getPosition();
                    j6 = this.o;
                    if (position < j6) {
                        m95Var.l((int) (j6 - position));
                    }
                }
            }
            if (this.q == 0) {
                m95Var.k();
                if (i(m95Var)) {
                    j4 = -9223372036854775807L;
                } else {
                    d0a d0aVar3 = this.b;
                    d0aVar3.M(0);
                    iM = d0aVar3.m();
                    if (((-128000) & iM) == (((long) this.j) & (-128000))) {
                    }
                    j4 = -9223372036854775807L;
                    m95Var.l(1);
                    this.j = 0;
                    i = -1;
                    i2 = 0;
                }
                i = -1;
                i2 = -1;
            } else {
                j4 = -9223372036854775807L;
            }
            iC = this.i.c(m95Var, this.q, true);
            if (iC == -1) {
                i = -1;
                i2 = -1;
            } else {
                i4 = this.q - iC;
                this.q = i4;
                if (i4 > 0) {
                    i = -1;
                    i2 = 0;
                } else {
                    this.i.a(((this.n * j) / ((long) u49Var2.c)) + this.m, 1, u49Var2.b, 0, null);
                    this.n += (long) u49Var2.f;
                    this.q = 0;
                    i2 = 0;
                    i = -1;
                }
            }
        }
        if (i2 == i) {
            ntc ntcVar2 = this.r;
            if (ntcVar2 instanceof k17) {
                long j22 = this.n - j2;
                if (j22 < j3) {
                    j5 = j4;
                } else {
                    int i22 = s46Var.a;
                    if (i22 != i && (i3 = s46Var.b) != i) {
                        j22 = (j22 - ((long) i22)) - ((long) i3);
                    }
                    if (j22 >= j3) {
                        j5 = ((j22 * j) / ((long) u49Var2.c)) + this.m;
                    } else {
                        j5 = j4;
                    }
                }
                if (ntcVar2.h() != j5) {
                    ntc ntcVar3 = this.r;
                    ((k17) ntcVar3).d.c = j5;
                    this.g.q(ntcVar3);
                    this.h.d(this.r.h());
                }
            }
        }
        return i2;
    }

    @Override // defpackage.l95
    public final void f(n95 n95Var) {
        this.g = n95Var;
        k1f k1fVarN = n95Var.n(0, 1);
        this.h = k1fVarN;
        this.i = k1fVarN;
        this.g.j();
    }

    public final yk2 g(m95 m95Var) {
        d0a d0aVar = this.b;
        m95Var.o(d0aVar.a, 0, 4);
        d0aVar.M(0);
        int iM = d0aVar.m();
        u49 u49Var = this.c;
        u49Var.a(iM);
        return new yk2(m95Var.getLength(), m95Var.getPosition(), u49Var.e, u49Var.b, (this.a & 2) != 0, true, -9223372036854775807L);
    }

    public final void h() {
        ntc ntcVar = this.r;
        if ((ntcVar instanceof yk2) && ((yk2) ntcVar).c()) {
            long j = this.p;
            if (j == -1 || j == this.r.a()) {
                return;
            }
            yk2 yk2Var = (yk2) this.r;
            this.r = new yk2(this.p, yk2Var.b, yk2Var.e, yk2Var.c, yk2Var.g, false, yk2Var.i);
            n95 n95Var = this.g;
            n95Var.getClass();
            n95Var.q(this.r);
            k1f k1fVar = this.h;
            k1fVar.getClass();
            k1fVar.d(this.r.h());
        }
    }

    public final boolean i(m95 m95Var) {
        ntc ntcVar = this.r;
        if (ntcVar != null) {
            long jA = ntcVar.a();
            if (jA == -1 || m95Var.e() <= jA - 4) {
            }
            return true;
        }
        try {
            return !m95Var.d(this.b.a, 0, 4, true);
        } catch (EOFException unused) {
        }
    }

    public final boolean j(m95 m95Var, boolean z) throws EOFException {
        int iE;
        int i;
        int iB;
        pu6 pu6Var;
        m95Var.k();
        if (m95Var.getPosition() == 0) {
            int i2 = this.a;
            boolean z2 = (i2 & 8) == 0;
            boolean z3 = (i2 & 16) != 0;
            if (z2) {
                pu6Var = z3 ? qu6.c : null;
            } else {
                pu6Var = v;
            }
            su8 su8VarG = this.e.G(m95Var, pu6Var, 131072);
            this.k = su8VarG;
            if (su8VarG != null) {
                this.d.b(su8VarG);
            }
            iE = (int) m95Var.e();
            if (!z) {
                m95Var.l(iE);
            }
            i = 0;
        } else {
            iE = 0;
            i = 0;
        }
        int i3 = i;
        int i4 = i3;
        while (true) {
            if (i(m95Var)) {
                if (i3 > 0) {
                    break;
                }
                h();
                throw new EOFException();
            }
            d0a d0aVar = this.b;
            d0aVar.M(0);
            int iM = d0aVar.m();
            if ((i == 0 || ((-128000) & iM) == (((long) i) & (-128000))) && (iB = qn4.B(iM)) != -1) {
                i3++;
                if (i3 != 1) {
                    if (i3 == 4) {
                        break;
                    }
                } else {
                    this.c.a(iM);
                    i = iM;
                }
                m95Var.f(iB - 4);
            } else {
                int i5 = i4 + 1;
                if (i4 == 131072) {
                    if (z) {
                        return false;
                    }
                    h();
                    throw new EOFException();
                }
                if (z) {
                    m95Var.k();
                    m95Var.f(iE + i5);
                } else {
                    m95Var.l(1);
                }
                i3 = 0;
                i4 = i5;
                i = 0;
            }
        }
        if (z) {
            m95Var.l(iE + i4);
        } else {
            m95Var.k();
        }
        this.j = i;
        return true;
    }

    @Override // defpackage.l95
    public final void a() {
    }
}
