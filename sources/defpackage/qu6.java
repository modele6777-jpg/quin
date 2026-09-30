package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qu6 extends fbc {
    public static final yg5 b = new yg5(16);
    public static final yg5 c = new yg5(17);
    public final pu6 a;

    public qu6(pu6 pu6Var) {
        this.a = pu6Var;
    }

    public static fte A(int i, d0a d0aVar) {
        if (i < 1) {
            return null;
        }
        int iZ = d0aVar.z();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        d0aVar.k(bArr, 0, i2);
        int iG = G(bArr, 0, iZ);
        return new fte("TXXX", new String(bArr, 0, iG, E(iZ)), z(bArr, iZ, D(iZ) + iG));
    }

    public static vhf B(int i, d0a d0aVar, String str) {
        byte[] bArr = new byte[i];
        d0aVar.k(bArr, 0, i);
        return new vhf(str, null, new String(bArr, 0, H(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    public static vhf C(int i, d0a d0aVar) {
        if (i < 1) {
            return null;
        }
        int iZ = d0aVar.z();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        d0aVar.k(bArr, 0, i2);
        int iG = G(bArr, 0, iZ);
        String str = new String(bArr, 0, iG, E(iZ));
        int iD = D(iZ) + iG;
        return new vhf("WXXX", str, x(bArr, iD, H(bArr, iD), StandardCharsets.ISO_8859_1));
    }

    public static int D(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static Charset E(int i) {
        if (i == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i != 2) {
            return i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    public static String F(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int G(byte[] bArr, int i, int i2) {
        int iH = H(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iH;
        }
        while (iH < bArr.length - 1) {
            if ((iH - i) % 2 == 0 && bArr[iH + 1] == 0) {
                return iH;
            }
            iH = H(bArr, iH + 1);
        }
        return bArr.length;
    }

    public static int H(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int I(int i, d0a d0aVar) {
        byte[] bArr = d0aVar.a;
        int i2 = d0aVar.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007a A[PHI: r3
  0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean J(d0a d0aVar, int i, int i2, boolean z) {
        int iC;
        long jC;
        int iG;
        int i3;
        int i4 = d0aVar.b;
        while (true) {
            try {
                boolean z2 = true;
                if (d0aVar.a() < i2) {
                    d0aVar.M(i4);
                    return true;
                }
                if (i >= 3) {
                    iC = d0aVar.m();
                    jC = d0aVar.B();
                    iG = d0aVar.G();
                } else {
                    iC = d0aVar.C();
                    jC = d0aVar.C();
                    iG = 0;
                }
                if (iC == 0 && jC == 0 && iG == 0) {
                    d0aVar.M(i4);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jC) != 0) {
                        d0aVar.M(i4);
                        return false;
                    }
                    jC = (((jC >> 24) & 255) << 21) | (jC & 255) | (((jC >> 8) & 255) << 7) | (((jC >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iG & 64) != 0 ? 1 : 0;
                    if ((iG & 1) == 0) {
                        z2 = false;
                    }
                } else if (i == 3) {
                    i3 = (iG & 32) != 0 ? 1 : 0;
                    if ((iG & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                        z2 = false;
                    }
                } else {
                    i3 = 0;
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (jC < i3) {
                    d0aVar.M(i4);
                    return false;
                }
                if (d0aVar.a() < jC) {
                    d0aVar.M(i4);
                    return false;
                }
                d0aVar.N((int) jC);
            } catch (Throwable th) {
                d0aVar.M(i4);
                throw th;
            }
        }
    }

    public static d70 p(d0a d0aVar, int i, int i2) {
        int iH;
        String strConcat;
        int iZ = d0aVar.z();
        Charset charsetE = E(iZ);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        d0aVar.k(bArr, 0, i3);
        if (i2 == 2) {
            strConcat = "image/" + bm8.V(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iH = 2;
        } else {
            iH = H(bArr, 0);
            String strV = bm8.V(new String(bArr, 0, iH, StandardCharsets.ISO_8859_1));
            strConcat = strV.indexOf(47) == -1 ? "image/".concat(strV) : strV;
        }
        int i4 = bArr[iH + 1] & 255;
        int i5 = iH + 2;
        int iG = G(bArr, i5, iZ);
        String str = new String(bArr, i5, iG - i5, charsetE);
        int iD = D(iZ) + iG;
        return new d70(strConcat, str, i4, i3 <= iD ? pqf.b : Arrays.copyOfRange(bArr, iD, i3));
    }

    public static vw1 q(d0a d0aVar, int i, int i2, boolean z, int i3, pu6 pu6Var) throws Throwable {
        int i4 = d0aVar.b;
        int iH = H(d0aVar.a, i4);
        String str = new String(d0aVar.a, i4, iH - i4, StandardCharsets.ISO_8859_1);
        d0aVar.M(iH + 1);
        int iM = d0aVar.m();
        int iM2 = d0aVar.m();
        if (iM > iM2) {
            return null;
        }
        long jB = d0aVar.B();
        if (jB == 4294967295L) {
            jB = -1;
        }
        long jB2 = d0aVar.B();
        long j = jB2 == 4294967295L ? -1L : jB2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (d0aVar.b < i5) {
            ru6 ru6VarT = t(i2, d0aVar, z, i3, pu6Var);
            if (ru6VarT != null) {
                arrayList.add(ru6VarT);
            }
        }
        return new vw1(str, iM, iM2, jB, j, (ru6[]) arrayList.toArray(new ru6[0]));
    }

    public static xw1 r(d0a d0aVar, int i, int i2, boolean z, int i3, pu6 pu6Var) throws Throwable {
        int i4 = d0aVar.b;
        int iH = H(d0aVar.a, i4);
        String str = new String(d0aVar.a, i4, iH - i4, StandardCharsets.ISO_8859_1);
        d0aVar.M(iH + 1);
        int iZ = d0aVar.z();
        boolean z2 = (iZ & 2) != 0;
        boolean z3 = (iZ & 1) != 0;
        int iZ2 = d0aVar.z();
        String[] strArr = new String[iZ2];
        for (int i5 = 0; i5 < iZ2; i5++) {
            int i6 = d0aVar.b;
            int iH2 = H(d0aVar.a, i6);
            strArr[i5] = new String(d0aVar.a, i6, iH2 - i6, StandardCharsets.ISO_8859_1);
            d0aVar.M(iH2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (d0aVar.b < i7) {
            ru6 ru6VarT = t(i2, d0aVar, z, i3, pu6Var);
            if (ru6VarT != null) {
                arrayList.add(ru6VarT);
            }
        }
        return new xw1(str, z2, z3, strArr, (ru6[]) arrayList.toArray(new ru6[0]));
    }

    public static aa2 s(int i, d0a d0aVar) {
        if (i < 4) {
            return null;
        }
        int iZ = d0aVar.z();
        Charset charsetE = E(iZ);
        byte[] bArr = new byte[3];
        d0aVar.k(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        d0aVar.k(bArr2, 0, i2);
        int iG = G(bArr2, 0, iZ);
        String str2 = new String(bArr2, 0, iG, charsetE);
        int iD = D(iZ) + iG;
        return new aa2(str, str2, x(bArr2, iD, G(bArr2, iD, iZ), charsetE));
    }

    /* JADX WARN: Code duplicated, block: B:143:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:167:0x0201 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x021c  */
    /* JADX WARN: Code duplicated, block: B:180:0x0222  */
    /* JADX WARN: Code duplicated, block: B:185:0x022f A[Catch: all -> 0x0216, Exception -> 0x0218, OutOfMemoryError -> 0x021a, TRY_LEAVE, TryCatch #8 {Exception -> 0x0218, OutOfMemoryError -> 0x021a, all -> 0x0216, blocks: (B:171:0x0211, B:184:0x022a, B:185:0x022f), top: B:199:0x01ff }] */
    /* JADX WARN: Code duplicated, block: B:192:0x0251  */
    /* JADX WARN: Instruction removed from duplicated block: B:192:0x0251, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [ru6] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [d0a] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [d0a] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [d0a] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static ru6 t(int i, d0a d0aVar, boolean z, int i2, pu6 pu6Var) throws Throwable {
        int iD;
        int i3;
        ?? r1;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        ?? r9;
        int i4;
        int i5;
        ?? r2;
        Throwable th;
        ?? r3;
        ?? r12;
        ?? r10;
        ?? r11;
        d0a d0aVar2;
        Object ux0Var;
        int i6 = i;
        int iZ = d0aVar.z();
        int iZ2 = d0aVar.z();
        int iZ3 = d0aVar.z();
        int iZ4 = i6 >= 3 ? d0aVar.z() : 0;
        if (i6 == 4) {
            iD = d0aVar.D();
            if (!z) {
                iD = (((iD >> 24) & 255) << 21) | (iD & 255) | (((iD >> 8) & 255) << 7) | (((iD >> 16) & 255) << 14);
            }
        } else {
            iD = i6 == 3 ? d0aVar.D() : d0aVar.C();
        }
        int I = iD;
        int iG = i6 >= 3 ? d0aVar.G() : 0;
        if (iZ == 0 && iZ2 == 0 && iZ3 == 0 && iZ4 == 0 && I == 0 && iG == 0) {
            d0aVar.M(d0aVar.c);
            return null;
        }
        int i7 = d0aVar.b + I;
        if (i7 > d0aVar.c) {
            xo1.V("Id3Decoder", "Frame size exceeds remaining tag data");
            d0aVar.M(d0aVar.c);
            return null;
        }
        if (pu6Var != null) {
            boolean zG = pu6Var.g(i6, iZ, iZ2, iZ3, iZ4);
            r1 = iZ;
            i3 = iZ2;
            if (!zG) {
                i6 = i6;
                d0aVar.M(i7);
                return null;
            }
        } else {
            i3 = iZ2;
            r1 = iZ;
        }
        i6 = i6;
        if (i6 == 3) {
            z2 = (iG & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0;
            z5 = (iG & 64) != 0;
            z6 = false;
            z4 = (iG & 32) != 0;
            z3 = z2;
        } else if (i6 == 4) {
            boolean z7 = (iG & 64) != 0;
            boolean z8 = (iG & 8) != 0;
            z5 = (iG & 4) != 0;
            z6 = (iG & 2) != 0;
            z3 = (iG & 1) != 0;
            boolean z9 = z8;
            z4 = z7;
            z2 = z9;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (z2 || z5) {
            xo1.V("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            d0aVar.M(i7);
            return null;
        }
        if (z4) {
            I--;
            d0aVar.N(1);
        }
        if (z3) {
            I -= 4;
            d0aVar.N(4);
        }
        if (z6) {
            I = I(I, d0aVar);
        }
        try {
            try {
                if (r1 == 84 && i3 == 88 && iZ3 == 88 && (i6 == 2 || iZ4 == 88)) {
                    ux0Var = A(I, d0aVar);
                } else if (r1 == 84) {
                    ux0Var = y(I, d0aVar, F(i6, r1, i3, iZ3, iZ4));
                } else if (r1 == 87 && i3 == 88 && iZ3 == 88 && (i6 == 2 || iZ4 == 88)) {
                    ux0Var = C(I, d0aVar);
                } else {
                    if (r1 != 87) {
                        if (r1 == 80 && i3 == 82 && iZ3 == 73 && iZ4 == 86) {
                            ux0Var = w(I, d0aVar);
                        } else {
                            th = null;
                            try {
                                if (r1 != 71 || i3 != 69 || iZ3 != 79 || (iZ4 != 66 && i6 != 2)) {
                                    if (i6 == 2) {
                                        if (r1 == 80 && i3 == 73 && iZ3 == 67) {
                                            ux0Var = p(d0aVar, I, i6);
                                        } else if (r1 != 67 && i3 == 79 && iZ3 == 77 && (iZ4 == 77 || i6 == 2)) {
                                            ux0Var = s(I, d0aVar);
                                        } else if (r1 != 67 && i3 == 72 && iZ3 == 65 && iZ4 == 80) {
                                            int i8 = I;
                                            I = i3;
                                            i3 = i8;
                                            r11 = r1;
                                            i4 = iZ3;
                                            i5 = iZ4;
                                            try {
                                                ux0Var = q(d0aVar, i3, i6, z, i2, pu6Var);
                                                i6 = i;
                                                r1 = d0aVar;
                                            } catch (Exception e) {
                                                e = e;
                                                i6 = i;
                                                r2 = d0aVar;
                                                r9 = r11;
                                                r2.M(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (OutOfMemoryError e2) {
                                                e = e2;
                                                i6 = i;
                                                r2 = d0aVar;
                                                r9 = r11;
                                                r2.M(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                r3 = d0aVar;
                                                r3.M(i7);
                                                throw th;
                                            }
                                        } else {
                                            int i9 = I;
                                            I = i3;
                                            i3 = i9;
                                            r11 = r1;
                                            i4 = iZ3;
                                            i5 = iZ4;
                                            try {
                                                if (r11 != 67 && I == 84 && i4 == 79 && i5 == 67) {
                                                    i6 = i;
                                                    d0a d0aVar3 = d0aVar;
                                                    ux0Var = r(d0aVar3, i3, i6, z, i2, pu6Var);
                                                    r1 = d0aVar3;
                                                } else {
                                                    i6 = i;
                                                    d0aVar2 = d0aVar;
                                                    if (r11 != 77 && I == 76 && i4 == 76 && i5 == 84) {
                                                        ux0Var = v(i3, d0aVar2);
                                                        r1 = d0aVar2;
                                                    } else {
                                                        String strF = F(i6, r11 == true ? 1 : 0, I, i4, i5);
                                                        byte[] bArr = new byte[i3];
                                                        d0aVar2.k(bArr, 0, i3);
                                                        ux0Var = new ux0(strF, bArr);
                                                        r1 = d0aVar2;
                                                    }
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                                r2 = r1;
                                                r9 = r11;
                                                r2.M(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (OutOfMemoryError e4) {
                                                e = e4;
                                                r2 = r1;
                                                r9 = r11;
                                                r2.M(i7);
                                                r12 = th;
                                                r10 = r9;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r3 = r1;
                                                r3.M(i7);
                                                throw th;
                                            }
                                        }
                                    } else if (r1 == 65 && i3 == 80 && iZ3 == 73 && iZ4 == 67) {
                                        ux0Var = p(d0aVar, I, i6);
                                    } else {
                                        if (r1 != 67) {
                                        }
                                        if (r1 != 67) {
                                            int i10 = I;
                                            I = i3;
                                            i3 = i10;
                                            r11 = r1;
                                            i4 = iZ3;
                                            i5 = iZ4;
                                            if (r11 != 67) {
                                                i6 = i;
                                                d0aVar2 = d0aVar;
                                                if (r11 != 77) {
                                                    String strF2 = F(i6, r11 == true ? 1 : 0, I, i4, i5);
                                                    byte[] bArr2 = new byte[i3];
                                                    d0aVar2.k(bArr2, 0, i3);
                                                    ux0Var = new ux0(strF2, bArr2);
                                                    r1 = d0aVar2;
                                                } else {
                                                    String strF3 = F(i6, r11 == true ? 1 : 0, I, i4, i5);
                                                    byte[] bArr3 = new byte[i3];
                                                    d0aVar2.k(bArr3, 0, i3);
                                                    ux0Var = new ux0(strF3, bArr3);
                                                    r1 = d0aVar2;
                                                }
                                            } else {
                                                i6 = i;
                                                d0aVar2 = d0aVar;
                                                if (r11 != 77) {
                                                    String strF4 = F(i6, r11 == true ? 1 : 0, I, i4, i5);
                                                    byte[] bArr4 = new byte[i3];
                                                    d0aVar2.k(bArr4, 0, i3);
                                                    ux0Var = new ux0(strF4, bArr4);
                                                    r1 = d0aVar2;
                                                } else {
                                                    String strF5 = F(i6, r11 == true ? 1 : 0, I, i4, i5);
                                                    byte[] bArr5 = new byte[i3];
                                                    d0aVar2.k(bArr5, 0, i3);
                                                    ux0Var = new ux0(strF5, bArr5);
                                                    r1 = d0aVar2;
                                                }
                                            }
                                        } else {
                                            int i11 = I;
                                            I = i3;
                                            i3 = i11;
                                            r11 = r1;
                                            i4 = iZ3;
                                            i5 = iZ4;
                                            if (r11 != 67) {
                                                i6 = i;
                                                d0aVar2 = d0aVar;
                                                if (r11 != 77) {
                                                    String strF6 = F(i6, r11 == true ? 1 : 0, I, i4, i5);
                                                    byte[] bArr6 = new byte[i3];
                                                    d0aVar2.k(bArr6, 0, i3);
                                                    ux0Var = new ux0(strF6, bArr6);
                                                    r1 = d0aVar2;
                                                } else {
                                                    String strF7 = F(i6, r11 == true ? 1 : 0, I, i4, i5);
                                                    byte[] bArr7 = new byte[i3];
                                                    d0aVar2.k(bArr7, 0, i3);
                                                    ux0Var = new ux0(strF7, bArr7);
                                                    r1 = d0aVar2;
                                                }
                                            } else {
                                                i6 = i;
                                                d0aVar2 = d0aVar;
                                                if (r11 != 77) {
                                                    String strF8 = F(i6, r11 == true ? 1 : 0, I, i4, i5);
                                                    byte[] bArr8 = new byte[i3];
                                                    d0aVar2.k(bArr8, 0, i3);
                                                    ux0Var = new ux0(strF8, bArr8);
                                                    r1 = d0aVar2;
                                                } else {
                                                    String strF9 = F(i6, r11 == true ? 1 : 0, I, i4, i5);
                                                    byte[] bArr9 = new byte[i3];
                                                    d0aVar2.k(bArr9, 0, i3);
                                                    ux0Var = new ux0(strF9, bArr9);
                                                    r1 = d0aVar2;
                                                }
                                            }
                                        }
                                    }
                                    if (r12 == 0) {
                                        xo1.W("Id3Decoder", "Failed to decode frame: id=" + F(i6, r10, I, i4, i5) + ", frameSize=" + i3, e);
                                    }
                                    return r12;
                                }
                                ux0Var = u(I, d0aVar);
                                int i12 = I;
                                I = i3;
                                i3 = i12;
                                r11 = r1;
                                i4 = iZ3;
                                i5 = iZ4;
                                r1 = d0aVar;
                            } catch (Exception e5) {
                                e = e5;
                                int i13 = I;
                                I = i3;
                                i3 = i13;
                                r9 = r1;
                                i4 = iZ3;
                                i5 = iZ4;
                                r2 = d0aVar;
                                r2.M(i7);
                                r12 = th;
                                r10 = r9;
                                if (r12 == 0) {
                                    xo1.W("Id3Decoder", "Failed to decode frame: id=" + F(i6, r10, I, i4, i5) + ", frameSize=" + i3, e);
                                }
                                return r12;
                            } catch (OutOfMemoryError e6) {
                                e = e6;
                                int i14 = I;
                                I = i3;
                                i3 = i14;
                                r9 = r1;
                                i4 = iZ3;
                                i5 = iZ4;
                                r2 = d0aVar;
                                r2.M(i7);
                                r12 = th;
                                r10 = r9;
                                if (r12 == 0) {
                                    xo1.W("Id3Decoder", "Failed to decode frame: id=" + F(i6, r10, I, i4, i5) + ", frameSize=" + i3, e);
                                }
                                return r12;
                            }
                        }
                        r1.M(i7);
                        r12 = ux0Var;
                        e = th;
                        r10 = r11;
                        if (r12 == 0) {
                            xo1.W("Id3Decoder", "Failed to decode frame: id=" + F(i6, r10, I, i4, i5) + ", frameSize=" + i3, e);
                        }
                        return r12;
                    }
                    ux0Var = B(I, d0aVar, F(i6, r1, i3, iZ3, iZ4));
                }
                int i15 = I;
                I = i3;
                i3 = i15;
                r11 = r1;
                i4 = iZ3;
                i5 = iZ4;
                r1 = d0aVar;
                th = null;
                r1.M(i7);
                r12 = ux0Var;
                e = th;
                r10 = r11;
            } catch (Exception e7) {
                e = e7;
                int i16 = I;
                I = i3;
                i3 = i16;
                r9 = r1;
                i4 = iZ3;
                i5 = iZ4;
                r2 = d0aVar;
                th = null;
                r2.M(i7);
                r12 = th;
                r10 = r9;
                if (r12 == 0) {
                    xo1.W("Id3Decoder", "Failed to decode frame: id=" + F(i6, r10, I, i4, i5) + ", frameSize=" + i3, e);
                }
                return r12;
            } catch (OutOfMemoryError e8) {
                e = e8;
                int i17 = I;
                I = i3;
                i3 = i17;
                r9 = r1;
                i4 = iZ3;
                i5 = iZ4;
                r2 = d0aVar;
                th = null;
                r2.M(i7);
                r12 = th;
                r10 = r9;
                if (r12 == 0) {
                    xo1.W("Id3Decoder", "Failed to decode frame: id=" + F(i6, r10, I, i4, i5) + ", frameSize=" + i3, e);
                }
                return r12;
            }
            if (r12 == 0) {
                xo1.W("Id3Decoder", "Failed to decode frame: id=" + F(i6, r10, I, i4, i5) + ", frameSize=" + i3, e);
            }
            return r12;
        } catch (Throwable th4) {
            th = th4;
            r3 = d0aVar;
        }
    }

    public static s66 u(int i, d0a d0aVar) {
        int iZ = d0aVar.z();
        Charset charsetE = E(iZ);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        d0aVar.k(bArr, 0, i2);
        int iH = H(bArr, 0);
        String strL = qv8.l(new String(bArr, 0, iH, StandardCharsets.ISO_8859_1));
        int i3 = iH + 1;
        int iG = G(bArr, i3, iZ);
        String strX = x(bArr, i3, iG, charsetE);
        int iD = D(iZ) + iG;
        int iG2 = G(bArr, iD, iZ);
        String strX2 = x(bArr, iD, iG2, charsetE);
        int iD2 = D(iZ) + iG2;
        return new s66(strL, strX, strX2, i2 <= iD2 ? pqf.b : Arrays.copyOfRange(bArr, iD2, i2));
    }

    public static ky8 v(int i, d0a d0aVar) {
        int iG = d0aVar.G();
        int iC = d0aVar.C();
        int iC2 = d0aVar.C();
        int iZ = d0aVar.z();
        int iZ2 = d0aVar.z();
        zu1 zu1Var = new zu1();
        zu1Var.k(d0aVar);
        int i2 = ((i - 10) * 8) / (iZ + iZ2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iG2 = zu1Var.g(iZ);
            int iG3 = zu1Var.g(iZ2);
            iArr[i3] = iG2;
            iArr2[i3] = iG3;
        }
        return new ky8(iG, iC, iC2, iArr, iArr2);
    }

    public static ava w(int i, d0a d0aVar) {
        byte[] bArr = new byte[i];
        d0aVar.k(bArr, 0, i);
        int iH = H(bArr, 0);
        String str = new String(bArr, 0, iH, StandardCharsets.ISO_8859_1);
        int i2 = iH + 1;
        return new ava(str, i <= i2 ? pqf.b : Arrays.copyOfRange(bArr, i2, i));
    }

    public static String x(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    public static fte y(int i, d0a d0aVar, String str) {
        if (i < 1) {
            return null;
        }
        int iZ = d0aVar.z();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        d0aVar.k(bArr, 0, i2);
        return new fte(str, null, z(bArr, iZ, 0));
    }

    public static yob z(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return jy6.s("");
        }
        dy6 dy6VarM = jy6.m();
        int iG = G(bArr, i2, i);
        while (i2 < iG) {
            dy6VarM.b(new String(bArr, i2, iG - i2, E(i)));
            i2 = D(i) + iG;
            iG = G(bArr, i2, i);
        }
        yob yobVarG = dy6VarM.g();
        return yobVarG.isEmpty() ? jy6.s("") : yobVarG;
    }

    @Override // defpackage.fbc
    public final su8 f(zu8 zu8Var, ByteBuffer byteBuffer) {
        return o(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c7 A[SYNTHETIC] */
    public final su8 o(byte[] bArr, int i) throws Throwable {
        boolean z;
        c72 c72Var;
        int i2;
        int i3;
        int I;
        ru6 ru6VarT;
        ArrayList arrayList = new ArrayList();
        d0a d0aVar = new d0a(bArr, i);
        boolean z2 = false;
        if (d0aVar.a() < 10) {
            xo1.V("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iC = d0aVar.C();
            if (iC == 4801587) {
                int iZ = d0aVar.z();
                d0aVar.N(1);
                int iZ2 = d0aVar.z();
                int iY = d0aVar.y();
                if (iZ != 2) {
                    if (iZ == 3) {
                        if ((iZ2 & 64) != 0) {
                            int iM = d0aVar.m();
                            d0aVar.N(iM);
                            iY -= iM + 4;
                        }
                    } else if (iZ == 4) {
                        if ((iZ2 & 64) != 0) {
                            int iY2 = d0aVar.y();
                            d0aVar.N(iY2 - 4);
                            iY -= iY2;
                        }
                        if ((iZ2 & 16) != 0) {
                            iY -= 10;
                        }
                    } else {
                        kv2.w(iZ, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    if (iZ < 4) {
                        z = false;
                    } else {
                        z = false;
                    }
                    c72Var = new c72(iZ, z, iY);
                } else if ((iZ2 & 64) != 0) {
                    xo1.V("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iZ < 4 || (iZ2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    c72Var = new c72(iZ, z, iY);
                }
                if (c72Var == null) {
                    return null;
                }
                i2 = c72Var.a;
                int i4 = d0aVar.b;
                i3 = i2 == 2 ? 6 : 10;
                I = c72Var.b;
                if (c72Var.c) {
                    I = I(I, d0aVar);
                }
                d0aVar.L(i4 + I);
                if (!J(d0aVar, i2, i3, false)) {
                    if (i2 == 4 || !J(d0aVar, 4, i3, true)) {
                        kv2.w(i2, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
                        return null;
                    }
                    z2 = true;
                }
                while (d0aVar.a() >= i3) {
                    ru6VarT = t(i2, d0aVar, z2, i3, this.a);
                    if (ru6VarT != null) {
                        arrayList.add(ru6VarT);
                    }
                }
                return new su8(arrayList);
            }
            xo1.V("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iC))));
        }
        c72Var = null;
        if (c72Var == null) {
            return null;
        }
        i2 = c72Var.a;
        int i5 = d0aVar.b;
        if (i2 == 2) {
        }
        I = c72Var.b;
        if (c72Var.c) {
            I = I(I, d0aVar);
        }
        d0aVar.L(i5 + I);
        if (!J(d0aVar, i2, i3, false)) {
            if (i2 == 4) {
            }
            kv2.w(i2, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder");
            return null;
        }
        while (d0aVar.a() >= i3) {
            ru6VarT = t(i2, d0aVar, z2, i3, this.a);
            if (ru6VarT != null) {
                arrayList.add(ru6VarT);
            }
        }
        return new su8(arrayList);
    }
}
