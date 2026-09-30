package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kj7 extends cj7 {
    public static final a71 X;
    public static final a71 Y;
    public static final a71 z;
    public final yhb f;
    public final f41 g;
    public int v;
    public long w;
    public int x;
    public String y;

    static {
        a71 a71Var = a71.c;
        z = m8c.u("'\\");
        X = m8c.u("\"\\");
        Y = m8c.u("{}[]:, \n\t\r\f/\\;#=");
        m8c.u("\n\r");
        m8c.u("*/");
    }

    public kj7(yhb yhbVar) {
        this.b = new int[32];
        this.c = new String[32];
        this.d = new int[32];
        this.v = 0;
        this.f = yhbVar;
        this.g = yhbVar.b;
        u(6);
    }

    public final void C0(a71 a71Var) throws uh7, EOFException {
        while (true) {
            long jL = this.f.l(a71Var);
            if (jL == -1) {
                G("Unterminated string");
                throw null;
            }
            f41 f41Var = this.g;
            if (f41Var.G(jL) != 92) {
                f41Var.c1(jL + 1);
                return;
            } else {
                f41Var.c1(jL + 1);
                p0();
            }
        }
    }

    @Override // defpackage.cj7
    public final void E() throws uh7, EOFException {
        int iR = this.v;
        if (iR == 0) {
            iR = R();
        }
        if (iR == 14) {
            long jL = this.f.l(Y);
            f41 f41Var = this.g;
            if (jL == -1) {
                jL = f41Var.b;
            }
            f41Var.c1(jL);
        } else if (iR == 13) {
            C0(X);
        } else if (iR == 12) {
            C0(z);
        } else if (iR != 15) {
            l81.h(ub3.w(l()), b(), "Expected a name but was ");
            return;
        }
        this.v = 0;
        this.c[this.a - 1] = "null";
    }

    public final void N() throws uh7 {
        G("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x01c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:162:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:164:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:167:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:172:0x01fa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:173:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:175:0x0207  */
    /* JADX WARN: Code duplicated, block: B:177:0x020d  */
    /* JADX WARN: Code duplicated, block: B:230:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x0120  */
    /* JADX WARN: Code duplicated, block: B:92:0x0132  */
    /* JADX WARN: Code duplicated, block: B:94:0x013b  */
    public final int R() throws uh7, EOFException {
        int i;
        String str;
        String str2;
        long j;
        char cG;
        int i2;
        int i3;
        int i4;
        int i5;
        byte bG;
        int i6;
        int[] iArr = this.b;
        int i7 = this.a - 1;
        int i8 = iArr[i7];
        int i9 = 0;
        f41 f41Var = this.g;
        if (i8 == 1) {
            iArr[i7] = 2;
        } else if (i8 == 2) {
            int iG0 = g0(true);
            f41Var.h0();
            if (iG0 != 44) {
                if (iG0 == 59) {
                    N();
                    throw null;
                }
                if (iG0 == 93) {
                    this.v = 4;
                    return 4;
                }
                G("Unterminated array");
                throw null;
            }
        } else {
            if (i8 == 3 || i8 == 5) {
                iArr[i7] = 4;
                if (i8 == 5) {
                    int iG1 = g0(true);
                    f41Var.h0();
                    if (iG1 != 44) {
                        if (iG1 == 59) {
                            N();
                            throw null;
                        }
                        if (iG1 == 125) {
                            this.v = 2;
                            return 2;
                        }
                        G("Unterminated object");
                        throw null;
                    }
                }
                int iG2 = g0(true);
                if (iG2 == 34) {
                    f41Var.h0();
                    this.v = 13;
                    return 13;
                }
                if (iG2 == 39) {
                    f41Var.h0();
                    N();
                    throw null;
                }
                if (iG2 != 125) {
                    N();
                    throw null;
                }
                if (i8 == 5) {
                    G("Expected name");
                    throw null;
                }
                f41Var.h0();
                this.v = 2;
                return 2;
            }
            if (i8 == 4) {
                iArr[i7] = 5;
                int iG3 = g0(true);
                f41Var.h0();
                if (iG3 != 58) {
                    if (iG3 != 61) {
                        G("Expected ':'");
                        throw null;
                    }
                    N();
                    throw null;
                }
            } else if (i8 == 6) {
                iArr[i7] = 7;
            } else {
                if (i8 == 7) {
                    if (g0(false) == -1) {
                        this.v = 18;
                        return 18;
                    }
                    N();
                    throw null;
                }
                if (i8 == 8) {
                    qc0.p("JsonReader is closed");
                    return 0;
                }
            }
        }
        int iG4 = g0(true);
        if (iG4 == 34) {
            f41Var.h0();
            this.v = 9;
            return 9;
        }
        if (iG4 == 39) {
            N();
            throw null;
        }
        if (iG4 != 44 && iG4 != 59) {
            if (iG4 == 91) {
                f41Var.h0();
                this.v = 3;
                return 3;
            }
            if (iG4 != 93) {
                if (iG4 == 123) {
                    f41Var.h0();
                    this.v = 1;
                    return 1;
                }
                byte bG2 = f41Var.G(0L);
                yhb yhbVar = this.f;
                if (bG2 == 116 || bG2 == 84) {
                    i = 5;
                    str2 = "true";
                    str = "TRUE";
                } else {
                    if (bG2 != 102 && bG2 != 70) {
                        if (bG2 == 110 || bG2 == 78) {
                            i = 7;
                            str2 = "null";
                            str = "NULL";
                        } else {
                            j = 0;
                            i = 0;
                            i9 = 0;
                        }
                        if (i != 0) {
                            return i;
                        }
                        int i10 = 1;
                        i2 = i9;
                        i3 = i2;
                        int i11 = i3;
                        long j2 = j;
                        while (true) {
                            i4 = i3 + 1;
                            if (yhbVar.request(i4)) {
                                bG = f41Var.G(i3);
                                if (bG != 43) {
                                    if (bG != 69 || bG == 101) {
                                        i6 = 6;
                                        if (i2 != 2 || i2 == 4) {
                                            i2 = 5;
                                            i3 = i4;
                                        } else {
                                            i5 = i9;
                                        }
                                    } else if (bG == 45) {
                                        i6 = 6;
                                        if (i2 == 0) {
                                            i2 = 1;
                                            i11 = 1;
                                        } else {
                                            if (i2 != 5) {
                                                i5 = i9;
                                            }
                                            i2 = i6;
                                        }
                                        i3 = i4;
                                    } else if (bG != 46) {
                                        if (bG >= 48 && bG <= 57) {
                                            if (i2 == 1 || i2 == 0) {
                                                i6 = 6;
                                                j2 = -(bG - 48);
                                                i2 = 2;
                                            } else {
                                                if (i2 == 2) {
                                                    if (j2 != j) {
                                                        long j3 = (10 * j2) - ((long) (bG - 48));
                                                        i10 &= (j2 > -922337203685477580L || (j2 == -922337203685477580L && j3 < j2)) ? 1 : i9;
                                                        j2 = j3;
                                                    }
                                                } else if (i2 == 3) {
                                                    i2 = 4;
                                                } else {
                                                    i6 = 6;
                                                    if (i2 == 5 || i2 == 6) {
                                                        i2 = 7;
                                                    }
                                                }
                                                i6 = 6;
                                                i3 = i4;
                                            }
                                            i3 = i4;
                                        } else if (!W(bG)) {
                                        }
                                        i5 = i9;
                                    } else {
                                        i6 = 6;
                                        if (i2 == 2) {
                                            i2 = 3;
                                            i3 = i4;
                                        } else {
                                            i5 = i9;
                                        }
                                    }
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (W(f41Var.G(j))) {
                                        N();
                                        throw null;
                                    }
                                    G("Expected value");
                                    throw null;
                                }
                                i6 = 6;
                                if (i2 != 5) {
                                    i5 = i9;
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (W(f41Var.G(j))) {
                                        G("Expected value");
                                        throw null;
                                    }
                                    N();
                                    throw null;
                                }
                                i2 = i6;
                                i3 = i4;
                            }
                            if (i2 != 2 && i10 != 0 && ((j2 != Long.MIN_VALUE || i11 != 0) && (j2 != j || i11 == 0))) {
                                if (i11 == 0) {
                                    j2 = -j2;
                                }
                                this.w = j2;
                                f41Var.c1(i3);
                                i5 = 16;
                                this.v = 16;
                            } else if (i2 != 2 || i2 == 4 || i2 == 7) {
                                this.x = i3;
                                i5 = 17;
                                this.v = 17;
                            } else {
                                i5 = i9;
                            }
                            if (i5 != 0) {
                                return i5;
                            }
                            if (W(f41Var.G(j))) {
                                G("Expected value");
                                throw null;
                            }
                            N();
                            throw null;
                        }
                    }
                    i = 6;
                    str2 = "false";
                    str = "FALSE";
                }
                int length = str2.length();
                j = 0;
                int i12 = 1;
                while (true) {
                    if (i12 >= length) {
                        if (!yhbVar.request(length + 1) || !W(f41Var.G(length))) {
                            f41Var.c1(length);
                            this.v = i;
                            break;
                        }
                    } else {
                        int i13 = i12 + 1;
                        if (yhbVar.request(i13) && ((cG = f41Var.G(i12)) == str2.charAt(i12) || cG == str.charAt(i12))) {
                            i12 = i13;
                        }
                    }
                    i = i9;
                    break;
                }
                if (i != 0) {
                    return i;
                }
                int i14 = 1;
                i2 = i9;
                i3 = i2;
                int i15 = i3;
                long j4 = j;
                while (true) {
                    i4 = i3 + 1;
                    if (yhbVar.request(i4)) {
                        bG = f41Var.G(i3);
                        if (bG != 43) {
                            if (bG != 69) {
                                i6 = 6;
                                if (i2 != 2) {
                                }
                                i2 = 5;
                                i3 = i4;
                            } else {
                                i6 = 6;
                                if (i2 != 2) {
                                }
                                i2 = 5;
                                i3 = i4;
                            }
                            if (i5 != 0) {
                                return i5;
                            }
                            if (W(f41Var.G(j))) {
                                G("Expected value");
                                throw null;
                            }
                            N();
                            throw null;
                        }
                        i6 = 6;
                        if (i2 != 5) {
                            i5 = i9;
                            if (i5 != 0) {
                                return i5;
                            }
                            if (W(f41Var.G(j))) {
                                G("Expected value");
                                throw null;
                            }
                            N();
                            throw null;
                        }
                        i2 = i6;
                        i3 = i4;
                    }
                    if (i2 != 2) {
                        if (i2 != 2) {
                        }
                        this.x = i3;
                        i5 = 17;
                        this.v = 17;
                    } else {
                        if (i2 != 2) {
                        }
                        this.x = i3;
                        i5 = 17;
                        this.v = 17;
                    }
                    if (i5 != 0) {
                        return i5;
                    }
                    if (W(f41Var.G(j))) {
                        G("Expected value");
                        throw null;
                    }
                    N();
                    throw null;
                }
            }
            if (i8 == 1) {
                f41Var.h0();
                this.v = 4;
                return 4;
            }
        }
        if (i8 == 1 || i8 == 2) {
            N();
            throw null;
        }
        G("Unexpected value");
        throw null;
    }

    public final int U(String str, w84 w84Var) {
        int length = ((String[]) w84Var.b).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) w84Var.b)[i])) {
                this.v = 0;
                this.c[this.a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final boolean W(int i) throws uh7 {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        N();
        throw null;
    }

    @Override // defpackage.cj7
    public final void beginArray() throws uh7, EOFException {
        int iR = this.v;
        if (iR == 0) {
            iR = R();
        }
        if (iR != 3) {
            l81.h(ub3.w(l()), b(), "Expected BEGIN_ARRAY but was ");
            return;
        }
        u(1);
        this.d[this.a - 1] = 0;
        this.v = 0;
    }

    @Override // defpackage.cj7
    public final void beginObject() throws uh7, EOFException {
        int iR = this.v;
        if (iR == 0) {
            iR = R();
        }
        if (iR != 1) {
            l81.h(ub3.w(l()), b(), "Expected BEGIN_OBJECT but was ");
        } else {
            u(3);
            this.v = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.v = 0;
        this.b[0] = 8;
        this.a = 1;
        this.g.b();
        this.f.close();
    }

    @Override // defpackage.cj7
    public final void endArray() throws uh7, EOFException {
        int iR = this.v;
        if (iR == 0) {
            iR = R();
        }
        if (iR != 4) {
            l81.h(ub3.w(l()), b(), "Expected END_ARRAY but was ");
            return;
        }
        int i = this.a;
        this.a = i - 1;
        int[] iArr = this.d;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.v = 0;
    }

    @Override // defpackage.cj7
    public final void endObject() throws uh7, EOFException {
        int iR = this.v;
        if (iR == 0) {
            iR = R();
        }
        if (iR != 2) {
            l81.h(ub3.w(l()), b(), "Expected END_OBJECT but was ");
            return;
        }
        int i = this.a;
        int i2 = i - 1;
        this.a = i2;
        this.c[i2] = null;
        int[] iArr = this.d;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.v = 0;
    }

    public final int g0(boolean z2) throws uh7, EOFException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            yhb yhbVar = this.f;
            if (!yhbVar.request(i2)) {
                if (z2) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            f41 f41Var = this.g;
            byte bG = f41Var.G(j);
            if (bG != 10 && bG != 32 && bG != 13 && bG != 9) {
                f41Var.c1(j);
                if (bG == 47) {
                    if (yhbVar.request(2L)) {
                        N();
                        throw null;
                    }
                } else if (bG == 35) {
                    N();
                    throw null;
                }
                return bG;
            }
            i = i2;
        }
    }

    @Override // defpackage.cj7
    public final boolean h() throws uh7, EOFException {
        int iR = this.v;
        if (iR == 0) {
            iR = R();
        }
        if (iR == 5) {
            this.v = 0;
            int[] iArr = this.d;
            int i = this.a - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iR != 6) {
            l81.h(ub3.w(l()), b(), "Expected a boolean but was ");
            return false;
        }
        this.v = 0;
        int[] iArr2 = this.d;
        int i2 = this.a - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    public final String h0(a71 a71Var) throws uh7, EOFException {
        StringBuilder sb = null;
        while (true) {
            long jL = this.f.l(a71Var);
            if (jL == -1) {
                G("Unterminated string");
                throw null;
            }
            f41 f41Var = this.g;
            if (f41Var.G(jL) != 92) {
                if (sb == null) {
                    String strZ0 = f41Var.Z0(jL, ox1.a);
                    f41Var.h0();
                    return strZ0;
                }
                sb.append(f41Var.Z0(jL, ox1.a));
                f41Var.h0();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(f41Var.Z0(jL, ox1.a));
            f41Var.h0();
            sb.append(p0());
        }
    }

    @Override // defpackage.cj7
    public final boolean hasNext() throws uh7, EOFException {
        int iR = this.v;
        if (iR == 0) {
            iR = R();
        }
        return (iR == 2 || iR == 4 || iR == 18) ? false : true;
    }

    public final String k0() {
        long jL = this.f.l(Y);
        f41 f41Var = this.g;
        if (jL == -1) {
            return f41Var.a1();
        }
        f41Var.getClass();
        return f41Var.Z0(jL, ox1.a);
    }

    @Override // defpackage.cj7
    public final int l() throws uh7, EOFException {
        int iR = this.v;
        if (iR == 0) {
            iR = R();
        }
        switch (iR) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return 6;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
                return 5;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    @Override // defpackage.cj7
    public final double nextDouble() throws uh7, EOFException {
        int iR = this.v;
        if (iR == 0) {
            iR = R();
        }
        if (iR == 16) {
            this.v = 0;
            int[] iArr = this.d;
            int i = this.a - 1;
            iArr[i] = iArr[i] + 1;
            return this.w;
        }
        if (iR == 17) {
            long j = this.x;
            f41 f41Var = this.g;
            f41Var.getClass();
            this.y = f41Var.Z0(j, ox1.a);
        } else if (iR == 9) {
            this.y = h0(X);
        } else if (iR == 8) {
            this.y = h0(z);
        } else if (iR == 10) {
            this.y = k0();
        } else if (iR != 11) {
            l81.h(ub3.w(l()), b(), "Expected a double but was ");
            return 0.0d;
        }
        this.v = 11;
        try {
            double d = Double.parseDouble(this.y);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new uh7("JSON forbids NaN and infinities: " + d + " at path " + b());
            }
            this.y = null;
            this.v = 0;
            int[] iArr2 = this.d;
            int i2 = this.a - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            l81.h(this.y, b(), "Expected a double but was ");
            return 0.0d;
        }
    }

    @Override // defpackage.cj7
    public final int nextInt() throws uh7, EOFException {
        int iR = this.v;
        if (iR == 0) {
            iR = R();
        }
        if (iR == 16) {
            long j = this.w;
            int i = (int) j;
            if (j == i) {
                this.v = 0;
                int[] iArr = this.d;
                int i2 = this.a - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new ih7("Expected an int but was " + this.w + " at path " + b());
        }
        if (iR == 17) {
            long j2 = this.x;
            f41 f41Var = this.g;
            f41Var.getClass();
            this.y = f41Var.Z0(j2, ox1.a);
        } else if (iR == 9 || iR == 8) {
            String strH0 = iR == 9 ? h0(X) : h0(z);
            this.y = strH0;
            try {
                int i3 = Integer.parseInt(strH0);
                this.v = 0;
                int[] iArr2 = this.d;
                int i4 = this.a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iR != 11) {
            l81.h(ub3.w(l()), b(), "Expected an int but was ");
            return 0;
        }
        this.v = 11;
        try {
            double d = Double.parseDouble(this.y);
            int i5 = (int) d;
            if (i5 != d) {
                l81.h(this.y, b(), "Expected an int but was ");
                return 0;
            }
            this.y = null;
            this.v = 0;
            int[] iArr3 = this.d;
            int i6 = this.a - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            l81.h(this.y, b(), "Expected an int but was ");
            return 0;
        }
    }

    public final String nextName() throws uh7, EOFException {
        String strH0;
        int iR = this.v;
        if (iR == 0) {
            iR = R();
        }
        if (iR == 14) {
            strH0 = k0();
        } else if (iR == 13) {
            strH0 = h0(X);
        } else if (iR == 12) {
            strH0 = h0(z);
        } else {
            if (iR != 15) {
                l81.h(ub3.w(l()), b(), "Expected a name but was ");
                return null;
            }
            strH0 = this.y;
        }
        this.v = 0;
        this.c[this.a - 1] = strH0;
        return strH0;
    }

    @Override // defpackage.cj7
    public final String nextString() throws uh7, EOFException {
        String strZ0;
        int iR = this.v;
        if (iR == 0) {
            iR = R();
        }
        if (iR == 10) {
            strZ0 = k0();
        } else if (iR == 9) {
            strZ0 = h0(X);
        } else if (iR == 8) {
            strZ0 = h0(z);
        } else if (iR == 11) {
            strZ0 = this.y;
            this.y = null;
        } else if (iR == 16) {
            strZ0 = Long.toString(this.w);
        } else {
            if (iR != 17) {
                l81.h(ub3.w(l()), b(), "Expected a string but was ");
                return null;
            }
            long j = this.x;
            f41 f41Var = this.g;
            f41Var.getClass();
            strZ0 = f41Var.Z0(j, ox1.a);
        }
        this.v = 0;
        int[] iArr = this.d;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return strZ0;
    }

    public final char p0() throws uh7, EOFException {
        int i;
        yhb yhbVar = this.f;
        if (!yhbVar.request(1L)) {
            G("Unterminated escape sequence");
            throw null;
        }
        f41 f41Var = this.g;
        byte bH0 = f41Var.h0();
        if (bH0 == 10 || bH0 == 34 || bH0 == 39 || bH0 == 47 || bH0 == 92) {
            return (char) bH0;
        }
        if (bH0 == 98) {
            return '\b';
        }
        if (bH0 == 102) {
            return '\f';
        }
        if (bH0 == 110) {
            return '\n';
        }
        if (bH0 == 114) {
            return '\r';
        }
        if (bH0 == 116) {
            return '\t';
        }
        if (bH0 != 117) {
            G("Invalid escape sequence: \\" + ((char) bH0));
            throw null;
        }
        if (!yhbVar.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path ".concat(b()));
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte bG = f41Var.G(i2);
            char c2 = (char) (c << 4);
            if (bG >= 48 && bG <= 57) {
                i = bG - 48;
            } else if (bG >= 97 && bG <= 102) {
                i = bG - 87;
            } else {
                if (bG < 65 || bG > 70) {
                    G("\\u".concat(f41Var.Z0(4L, ox1.a)));
                    throw null;
                }
                i = bG - 55;
            }
            c = (char) (i + c2);
        }
        f41Var.c1(4L);
        return c;
    }

    @Override // defpackage.cj7
    public final void skipValue() throws uh7, EOFException {
        int i = 0;
        do {
            int iR = this.v;
            if (iR == 0) {
                iR = R();
            }
            if (iR == 3) {
                u(1);
            } else {
                if (iR == 1) {
                    u(3);
                } else if (iR == 4) {
                    i--;
                    if (i < 0) {
                        l81.h(ub3.w(l()), b(), "Expected a value but was ");
                        return;
                    }
                    this.a--;
                } else if (iR == 2) {
                    i--;
                    if (i < 0) {
                        l81.h(ub3.w(l()), b(), "Expected a value but was ");
                        return;
                    }
                    this.a--;
                } else {
                    f41 f41Var = this.g;
                    if (iR == 14 || iR == 10) {
                        long jL = this.f.l(Y);
                        if (jL == -1) {
                            jL = f41Var.b;
                        }
                        f41Var.c1(jL);
                    } else if (iR == 9 || iR == 13) {
                        C0(X);
                    } else if (iR == 8 || iR == 12) {
                        C0(z);
                    } else if (iR == 17) {
                        f41Var.c1(this.x);
                    } else if (iR == 18) {
                        l81.h(ub3.w(l()), b(), "Expected a value but was ");
                        return;
                    }
                }
                this.v = 0;
            }
            i++;
            this.v = 0;
        } while (i != 0);
        int[] iArr = this.d;
        int i2 = this.a - 1;
        iArr[i2] = iArr[i2] + 1;
        this.c[i2] = "null";
    }

    public final String toString() {
        return "JsonReader(" + this.f + ")";
    }

    @Override // defpackage.cj7
    public final int x(w84 w84Var) throws uh7, EOFException {
        int iR = this.v;
        if (iR == 0) {
            iR = R();
        }
        if (iR < 12 || iR > 15) {
            return -1;
        }
        if (iR == 15) {
            return U(this.y, w84Var);
        }
        int iL = this.f.L((zr9) w84Var.c);
        if (iL != -1) {
            this.v = 0;
            this.c[this.a - 1] = ((String[]) w84Var.b)[iL];
            return iL;
        }
        String str = this.c[this.a - 1];
        String strNextName = nextName();
        int iU = U(strNextName, w84Var);
        if (iU == -1) {
            this.v = 15;
            this.y = strNextName;
            this.c[this.a - 1] = str;
        }
        return iU;
    }
}
