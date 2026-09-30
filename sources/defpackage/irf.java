package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class irf implements xn7 {
    public static final irf a = new irf();
    public static final hua b = new hua("kotlin.uuid.Uuid", fua.k);

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        frf frfVar = (frf) obj;
        frfVar.getClass();
        ev4Var.D(frfVar.toString());
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        String strU = om3Var.u();
        strU.getClass();
        int length = strU.length();
        int i = 0;
        if (length == 32) {
            long j = 0;
            while (i < 16) {
                long j2 = j << 4;
                char cCharAt = strU.charAt(i);
                if ((cCharAt >>> '\b') == 0) {
                    long j3 = sj6.b[cCharAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i++;
                    }
                }
                q6c.o(i, strU, "a hexadecimal digit");
                throw null;
            }
            long j4 = 0;
            for (int i2 = 16; i2 < 32; i2++) {
                long j5 = j4 << 4;
                char cCharAt2 = strU.charAt(i2);
                if ((cCharAt2 >>> '\b') == 0) {
                    long j6 = sj6.b[cCharAt2];
                    if (j6 >= 0) {
                        j4 = j5 | j6;
                    }
                }
                q6c.o(i2, strU, "a hexadecimal digit");
                throw null;
            }
            if (j != 0 || j4 != 0) {
                return new frf(j, j4);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                sb.append(strU.length() <= 64 ? strU : strU.substring(0, 64).concat("..."));
                sb.append("\" of length ");
                sb.append(strU.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long j7 = 0;
            while (i < 8) {
                long j8 = j7 << 4;
                char cCharAt3 = strU.charAt(i);
                if ((cCharAt3 >>> '\b') == 0) {
                    long j9 = sj6.b[cCharAt3];
                    if (j9 >= 0) {
                        j7 = j8 | j9;
                        i++;
                    }
                }
                q6c.o(i, strU, "a hexadecimal digit");
                throw null;
            }
            if (strU.charAt(8) != '-') {
                q6c.o(8, strU, "'-' (hyphen)");
                throw null;
            }
            long j10 = 0;
            for (int i3 = 9; i3 < 13; i3++) {
                long j11 = j10 << 4;
                char cCharAt4 = strU.charAt(i3);
                if ((cCharAt4 >>> '\b') == 0) {
                    long j12 = sj6.b[cCharAt4];
                    if (j12 >= 0) {
                        j10 = j11 | j12;
                    }
                }
                q6c.o(i3, strU, "a hexadecimal digit");
                throw null;
            }
            if (strU.charAt(13) != '-') {
                q6c.o(13, strU, "'-' (hyphen)");
                throw null;
            }
            long j13 = 0;
            for (int i4 = 14; i4 < 18; i4++) {
                long j14 = j13 << 4;
                char cCharAt5 = strU.charAt(i4);
                if ((cCharAt5 >>> '\b') == 0) {
                    long j15 = sj6.b[cCharAt5];
                    if (j15 >= 0) {
                        j13 = j14 | j15;
                    }
                }
                q6c.o(i4, strU, "a hexadecimal digit");
                throw null;
            }
            if (strU.charAt(18) != '-') {
                q6c.o(18, strU, "'-' (hyphen)");
                throw null;
            }
            long j16 = 0;
            for (int i5 = 19; i5 < 23; i5++) {
                long j17 = j16 << 4;
                char cCharAt6 = strU.charAt(i5);
                if ((cCharAt6 >>> '\b') == 0) {
                    long j18 = sj6.b[cCharAt6];
                    if (j18 >= 0) {
                        j16 = j17 | j18;
                    }
                }
                q6c.o(i5, strU, "a hexadecimal digit");
                throw null;
            }
            if (strU.charAt(23) != '-') {
                q6c.o(23, strU, "'-' (hyphen)");
                throw null;
            }
            long j19 = 0;
            for (int i6 = 24; i6 < 36; i6++) {
                long j20 = j19 << 4;
                char cCharAt7 = strU.charAt(i6);
                if ((cCharAt7 >>> '\b') == 0) {
                    long j21 = sj6.b[cCharAt7];
                    if (j21 >= 0) {
                        j19 = j20 | j21;
                    }
                }
                q6c.o(i6, strU, "a hexadecimal digit");
                throw null;
            }
            long j22 = (j7 << 32) | (j10 << 16) | j13;
            long j23 = (j16 << 48) | j19;
            if (j22 != 0 || j23 != 0) {
                return new frf(j22, j23);
            }
        }
        return frf.a;
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return b;
    }
}
