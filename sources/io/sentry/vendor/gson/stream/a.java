package io.sentry.vendor.gson.stream;

import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ib8;
import defpackage.je9;
import defpackage.qc0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Closeable {
    public String[] Y;
    public int[] Z;
    public final Reader a;
    public long w;
    public int x;
    public String y;
    public int[] z;
    public boolean b = false;
    public final char[] c = new char[UserMetadata.MAX_ATTRIBUTE_SIZE];
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int v = 0;
    public int X = 1;

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.z = iArr;
        iArr[0] = 6;
        this.Y = new String[32];
        this.Z = new int[32];
        this.a = reader;
    }

    public final int E(boolean z) throws IOException {
        int i = this.d;
        int i2 = this.e;
        while (true) {
            if (i == i2) {
                this.d = i;
                if (!l(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(x()));
                    }
                    return -1;
                }
                i = this.d;
                i2 = this.e;
            }
            int i3 = i + 1;
            char[] cArr = this.c;
            char c = cArr[i];
            if (c == '\n') {
                this.f++;
                this.g = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.d = i3;
                    if (i3 == i2) {
                        this.d = i;
                        boolean zL = l(2);
                        this.d++;
                        if (!zL) {
                        }
                        return c;
                    }
                    b();
                    int i4 = this.d;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.d = i4 + 1;
                        while (true) {
                            if (this.d + 2 > this.e && !l(2)) {
                                h0("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.d;
                            if (cArr[i5] != '\n') {
                                int i6 = 0;
                                while (true) {
                                    int i7 = this.d;
                                    if (i6 >= 2) {
                                        i = i7 + 2;
                                        i2 = this.e;
                                        break;
                                    }
                                    if (cArr[i7 + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                this.f++;
                                this.g = i5 + 1;
                            }
                            this.d++;
                        }
                    } else {
                        if (c2 != '/') {
                            return c;
                        }
                        this.d = i4 + 1;
                        g0();
                        i = this.d;
                        i2 = this.e;
                    }
                } else {
                    if (c != '#') {
                        this.d = i3;
                        return c;
                    }
                    this.d = i3;
                    b();
                    g0();
                    i = this.d;
                    i2 = this.e;
                }
            }
            i = i3;
        }
    }

    public final String G(char c) {
        int i;
        char[] cArr;
        StringBuilder sb = null;
        do {
            int i2 = this.d;
            int i3 = this.e;
            while (true) {
                int i4 = i3;
                i = i2;
                while (true) {
                    cArr = this.c;
                    if (i2 < i4) {
                        int i5 = i2 + 1;
                        char c2 = cArr[i2];
                        if (c2 == c) {
                            this.d = i5;
                            int i6 = (i5 - i) - 1;
                            if (sb == null) {
                                return new String(cArr, i, i6);
                            }
                            sb.append(cArr, i, i6);
                            return sb.toString();
                        }
                        if (c2 == '\\') {
                            this.d = i5;
                            int i7 = i5 - i;
                            int i8 = i7 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i7 * 2, 16));
                            }
                            sb.append(cArr, i, i8);
                            sb.append(U());
                            i2 = this.d;
                            i3 = this.e;
                        } else {
                            if (c2 == '\n') {
                                this.f++;
                                this.g = i5;
                            }
                            i2 = i5;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i2 - i) * 2, 16));
            }
            sb.append(cArr, i, i2 - i);
            this.d = i2;
        } while (l(1));
        h0("Unterminated string");
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    public final String N() {
        String string;
        StringBuilder sb = null;
        int i = 0;
        while (true) {
            int i2 = 0;
            while (true) {
                int i3 = this.d + i2;
                int i4 = this.e;
                char[] cArr = this.c;
                if (i3 < i4) {
                    char c = cArr[i3];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        b();
                    }
                    i = i2;
                } else if (i2 >= cArr.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i2, 16));
                    }
                    sb.append(cArr, this.d, i2);
                    this.d += i2;
                    if (!l(1)) {
                    }
                } else if (!l(i2 + 1)) {
                    i = i2;
                }
                int i5 = this.d;
                if (sb == null) {
                    string = new String(cArr, i5, i);
                } else {
                    sb.append(cArr, i5, i);
                    string = sb.toString();
                }
                this.d += i;
                return string;
            }
        }
    }

    public final void R(int i) {
        int i2 = this.X;
        int[] iArr = this.z;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.z = Arrays.copyOf(iArr, i3);
            this.Z = Arrays.copyOf(this.Z, i3);
            this.Y = (String[]) Arrays.copyOf(this.Y, i3);
        }
        int[] iArr2 = this.z;
        int i4 = this.X;
        this.X = i4 + 1;
        iArr2[i4] = i;
    }

    public final char U() throws d {
        int i;
        if (this.d == this.e && !l(1)) {
            h0("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.d;
        int i3 = i2 + 1;
        this.d = i3;
        char[] cArr = this.c;
        char c = cArr[i2];
        if (c == '\n') {
            this.f++;
            this.g = i3;
            return c;
        }
        if (c == '\"' || c == '\'' || c == '/' || c == '\\') {
            return c;
        }
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return '\r';
        }
        if (c == 't') {
            return '\t';
        }
        if (c != 'u') {
            h0("Invalid escape sequence");
            throw null;
        }
        if (i2 + 5 > this.e && !l(4)) {
            h0("Unterminated escape sequence");
            throw null;
        }
        int i4 = this.d;
        int i5 = i4 + 4;
        char c2 = 0;
        while (i4 < i5) {
            char c3 = cArr[i4];
            char c4 = (char) (c2 << 4);
            if (c3 >= '0' && c3 <= '9') {
                i = c3 - '0';
            } else if (c3 >= 'a' && c3 <= 'f') {
                i = c3 - 'W';
            } else {
                if (c3 < 'A' || c3 > 'F') {
                    throw new NumberFormatException("\\u".concat(new String(cArr, this.d, 4)));
                }
                i = c3 - '7';
            }
            c2 = (char) (i + c4);
            i4++;
        }
        this.d += 4;
        return c2;
    }

    public final void W(char c) {
        do {
            int i = this.d;
            int i2 = this.e;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.c[i];
                if (c2 == c) {
                    this.d = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.d = i3;
                    U();
                    i = this.d;
                    i2 = this.e;
                } else {
                    if (c2 == '\n') {
                        this.f++;
                        this.g = i3;
                    }
                    i = i3;
                }
            }
            this.d = i;
        } while (l(1));
        h0("Unterminated string");
        throw null;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        h0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.v = 0;
        this.z[0] = 8;
        this.X = 1;
        this.a.close();
    }

    public final void g0() {
        char c;
        do {
            if (this.d >= this.e && !l(1)) {
                return;
            }
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            c = this.c[i];
            if (c == '\n') {
                this.f++;
                this.g = i2;
                return;
            }
        } while (c != '\r');
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0179 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:116:0x017a  */
    /* JADX WARN: Code duplicated, block: B:119:0x018b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0191  */
    /* JADX WARN: Code duplicated, block: B:125:0x019c  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a0 A[PHI: r1 r7
  0x01a0: PHI (r1v56 int) = (r1v55 int), (r1v71 int) binds: [B:118:0x0189, B:125:0x019c] A[DONT_GENERATE, DONT_INLINE]
  0x01a0: PHI (r7v7 int) = (r7v6 int), (r7v8 int) binds: [B:118:0x0189, B:125:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:169:0x020f  */
    /* JADX WARN: Code duplicated, block: B:170:0x0211  */
    /* JADX WARN: Code duplicated, block: B:182:0x0232 A[DONT_INVERT, PHI: r10
  0x0232: PHI (r10v31 char) = (r10v30 char), (r10v32 char) binds: [B:168:0x020d, B:174:0x021a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:183:0x0234  */
    /* JADX WARN: Code duplicated, block: B:196:0x0252  */
    /* JADX WARN: Code duplicated, block: B:198:0x0256  */
    /* JADX WARN: Code duplicated, block: B:201:0x025b  */
    /* JADX WARN: Code duplicated, block: B:206:0x0265 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:207:0x0266  */
    /* JADX WARN: Code duplicated, block: B:209:0x0270  */
    /* JADX WARN: Code duplicated, block: B:211:0x0276  */
    /* JADX WARN: Code duplicated, block: B:271:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x0199 A[SYNTHETIC] */
    public final int h() {
        int iE;
        String str;
        String str2;
        int i;
        int i2;
        char c;
        int i3;
        int i4;
        boolean z;
        int i5;
        char c2;
        char c3;
        char c4;
        int i6;
        char c5;
        int[] iArr = this.z;
        int i7 = this.X - 1;
        int i8 = iArr[i7];
        char[] cArr = this.c;
        if (i8 == 1) {
            iArr[i7] = 2;
        } else if (i8 == 2) {
            int iE2 = E(true);
            if (iE2 != 44) {
                if (iE2 != 59) {
                    if (iE2 == 93) {
                        this.v = 4;
                        return 4;
                    }
                    h0("Unterminated array");
                    throw null;
                }
                b();
            }
        } else {
            if (i8 == 3 || i8 == 5) {
                iArr[i7] = 4;
                if (i8 == 5 && (iE = E(true)) != 44) {
                    if (iE != 59) {
                        if (iE == 125) {
                            this.v = 2;
                            return 2;
                        }
                        h0("Unterminated object");
                        throw null;
                    }
                    b();
                }
                int iE3 = E(true);
                if (iE3 == 34) {
                    this.v = 13;
                    return 13;
                }
                if (iE3 == 39) {
                    b();
                    this.v = 12;
                    return 12;
                }
                if (iE3 == 125) {
                    if (i8 != 5) {
                        this.v = 2;
                        return 2;
                    }
                    h0("Expected name");
                    throw null;
                }
                b();
                this.d--;
                if (u((char) iE3)) {
                    this.v = 14;
                    return 14;
                }
                h0("Expected name");
                throw null;
            }
            if (i8 == 4) {
                iArr[i7] = 5;
                int iE4 = E(true);
                if (iE4 != 58) {
                    if (iE4 != 61) {
                        h0("Expected ':'");
                        throw null;
                    }
                    b();
                    if (this.d < this.e || l(1)) {
                        int i9 = this.d;
                        if (cArr[i9] == '>') {
                            this.d = i9 + 1;
                        }
                    }
                }
            } else if (i8 == 6) {
                if (this.b) {
                    E(true);
                    int i10 = this.d;
                    int i11 = i10 - 1;
                    this.d = i11;
                    if ((i10 + 4 <= this.e || l(5)) && cArr[i11] == ')' && cArr[i10] == ']' && cArr[i10 + 1] == '}' && cArr[i10 + 2] == '\'' && cArr[i10 + 3] == '\n') {
                        this.d += 5;
                    }
                }
                this.z[this.X - 1] = 7;
            } else if (i8 == 7) {
                if (E(false) == -1) {
                    this.v = 17;
                    return 17;
                }
                b();
                this.d--;
            } else if (i8 == 8) {
                qc0.p("JsonReader is closed");
                return 0;
            }
        }
        int iE5 = E(true);
        if (iE5 == 34) {
            this.v = 9;
            return 9;
        }
        if (iE5 == 39) {
            b();
            this.v = 8;
            return 8;
        }
        if (iE5 != 44 && iE5 != 59) {
            if (iE5 == 91) {
                this.v = 3;
                return 3;
            }
            if (iE5 != 93) {
                if (iE5 == 123) {
                    this.v = 1;
                    return 1;
                }
                int i12 = this.d - 1;
                this.d = i12;
                char c6 = cArr[i12];
                if (c6 == 't' || c6 == 'T') {
                    str = "true";
                    str2 = "TRUE";
                    i = 5;
                } else {
                    if (c6 != 'f' && c6 != 'F') {
                        if (c6 != 'n' && c6 != 'N') {
                            i2 = 0;
                            break;
                        }
                        str = "null";
                        str2 = "NULL";
                        i = 7;
                        if (i2 != 0) {
                            return i2;
                        }
                        i3 = this.d;
                        i4 = this.e;
                        z = true;
                        i5 = 0;
                        boolean z2 = false;
                        c2 = 0;
                        long j = 0;
                        while (true) {
                            if (i3 + i5 != i4) {
                                c3 = cArr[i3 + i5];
                                if (c3 != '+') {
                                    if (c3 != 'E' || c3 == 'e') {
                                        if (c2 != 2 || c2 == 4) {
                                            c2 = 5;
                                            i5++;
                                        }
                                    } else if (c3 == '-') {
                                        c4 = 6;
                                        if (c2 == 0) {
                                            z2 = true;
                                            c2 = 1;
                                        } else {
                                            if (c2 != 5) {
                                            }
                                            c2 = c4;
                                        }
                                        i5++;
                                    } else if (c3 != '.') {
                                        if (c3 >= '0' && c3 <= '9') {
                                            if (c2 == 1 || c2 == 0) {
                                                j = -(c3 - '0');
                                                c2 = 2;
                                            } else if (c2 == 2) {
                                                if (j != 0) {
                                                    long j2 = (10 * j) - ((long) (c3 - '0'));
                                                    z &= j > -922337203685477580L || (j == -922337203685477580L && j2 < j);
                                                    j = j2;
                                                }
                                            } else if (c2 == 3) {
                                                c2 = 4;
                                            } else if (c2 == 5 || c2 == 6) {
                                                c2 = 7;
                                            }
                                            i5++;
                                        } else if (!u(c3)) {
                                            c5 = 2;
                                            if (c2 != 2) {
                                                if (c2 != c5 || c2 == 4 || c2 == 7) {
                                                    this.x = i5;
                                                    i6 = 16;
                                                    this.v = 16;
                                                }
                                            } else if (z || ((j == Long.MIN_VALUE && !z2) || (j == 0 && z2))) {
                                                c5 = 2;
                                                if (c2 != c5) {
                                                }
                                                this.x = i5;
                                                i6 = 16;
                                                this.v = 16;
                                            } else {
                                                if (!z2) {
                                                    j = -j;
                                                }
                                                this.w = j;
                                                this.d += i5;
                                                i6 = 15;
                                                this.v = 15;
                                            }
                                        }
                                    } else if (c2 == 2) {
                                        c2 = 3;
                                        i5++;
                                    }
                                    if (i6 != 0) {
                                        return i6;
                                    }
                                    if (u(cArr[this.d])) {
                                        h0("Expected value");
                                        throw null;
                                    }
                                    b();
                                    this.v = 10;
                                    return 10;
                                }
                                c4 = 6;
                                if (c2 != 5) {
                                }
                                c2 = c4;
                                i5++;
                            } else if (i5 != cArr.length) {
                                if (!l(i5 + 1)) {
                                    i3 = this.d;
                                    i4 = this.e;
                                    c3 = cArr[i3 + i5];
                                    if (c3 != '+') {
                                        if (c3 != 'E') {
                                            if (c2 != 2) {
                                            }
                                            c2 = 5;
                                            i5++;
                                        } else {
                                            if (c2 != 2) {
                                            }
                                            c2 = 5;
                                            i5++;
                                        }
                                        if (i6 != 0) {
                                            return i6;
                                        }
                                        if (u(cArr[this.d])) {
                                            h0("Expected value");
                                            throw null;
                                        }
                                        b();
                                        this.v = 10;
                                        return 10;
                                    }
                                    c4 = 6;
                                    if (c2 != 5) {
                                    }
                                    c2 = c4;
                                    i5++;
                                }
                                c5 = 2;
                                if (c2 != 2) {
                                    if (c2 != c5) {
                                    }
                                    this.x = i5;
                                    i6 = 16;
                                    this.v = 16;
                                } else {
                                    if (z) {
                                    }
                                    c5 = 2;
                                    if (c2 != c5) {
                                    }
                                    this.x = i5;
                                    i6 = 16;
                                    this.v = 16;
                                }
                                if (i6 != 0) {
                                    return i6;
                                }
                                if (u(cArr[this.d])) {
                                    h0("Expected value");
                                    throw null;
                                }
                                b();
                                this.v = 10;
                                return 10;
                            }
                            i6 = 0;
                            if (i6 != 0) {
                                return i6;
                            }
                            if (u(cArr[this.d])) {
                                h0("Expected value");
                                throw null;
                            }
                            b();
                            this.v = 10;
                            return 10;
                        }
                    }
                    str = "false";
                    str2 = "FALSE";
                    i = 6;
                }
                int length = str.length();
                int i13 = 1;
                while (true) {
                    int i14 = this.d;
                    int i15 = this.e;
                    if (i13 >= length) {
                        if ((i14 + length >= i15 && !l(length + 1)) || !u(cArr[this.d + length])) {
                            this.d += length;
                            this.v = i;
                            i2 = i;
                            break;
                        }
                        break;
                    }
                    if ((i14 + i13 < i15 || l(i13 + 1)) && ((c = cArr[this.d + i13]) == str.charAt(i13) || c == str2.charAt(i13))) {
                        i13++;
                    }
                    i2 = 0;
                    break;
                }
                if (i2 != 0) {
                    return i2;
                }
                i3 = this.d;
                i4 = this.e;
                z = true;
                i5 = 0;
                boolean z3 = false;
                c2 = 0;
                long j3 = 0;
                while (true) {
                    if (i3 + i5 != i4) {
                        c3 = cArr[i3 + i5];
                        if (c3 != '+') {
                            if (c3 != 'E') {
                                if (c2 != 2) {
                                }
                                c2 = 5;
                                i5++;
                            } else {
                                if (c2 != 2) {
                                }
                                c2 = 5;
                                i5++;
                            }
                            if (i6 != 0) {
                                return i6;
                            }
                            if (u(cArr[this.d])) {
                                h0("Expected value");
                                throw null;
                            }
                            b();
                            this.v = 10;
                            return 10;
                        }
                        c4 = 6;
                        if (c2 != 5) {
                        }
                        c2 = c4;
                        i5++;
                    } else if (i5 != cArr.length) {
                        if (!l(i5 + 1)) {
                            i3 = this.d;
                            i4 = this.e;
                            c3 = cArr[i3 + i5];
                            if (c3 != '+') {
                                if (c3 != 'E') {
                                    if (c2 != 2) {
                                    }
                                    c2 = 5;
                                    i5++;
                                } else {
                                    if (c2 != 2) {
                                    }
                                    c2 = 5;
                                    i5++;
                                }
                                if (i6 != 0) {
                                    return i6;
                                }
                                if (u(cArr[this.d])) {
                                    h0("Expected value");
                                    throw null;
                                }
                                b();
                                this.v = 10;
                                return 10;
                            }
                            c4 = 6;
                            if (c2 != 5) {
                            }
                            c2 = c4;
                            i5++;
                        }
                        c5 = 2;
                        if (c2 != 2) {
                            if (c2 != c5) {
                            }
                            this.x = i5;
                            i6 = 16;
                            this.v = 16;
                        } else {
                            if (z) {
                            }
                            c5 = 2;
                            if (c2 != c5) {
                            }
                            this.x = i5;
                            i6 = 16;
                            this.v = 16;
                        }
                        if (i6 != 0) {
                            return i6;
                        }
                        if (u(cArr[this.d])) {
                            h0("Expected value");
                            throw null;
                        }
                        b();
                        this.v = 10;
                        return 10;
                    }
                    i6 = 0;
                    if (i6 != 0) {
                        return i6;
                    }
                    if (u(cArr[this.d])) {
                        h0("Expected value");
                        throw null;
                    }
                    b();
                    this.v = 10;
                    return 10;
                }
            }
            if (i8 == 1) {
                this.v = 4;
                return 4;
            }
        }
        if (i8 != 1 && i8 != 2) {
            h0("Unexpected value");
            throw null;
        }
        b();
        this.d--;
        this.v = 7;
        return 7;
    }

    public final void h0(String str) throws d {
        throw new d(str.concat(x()));
    }

    public final boolean hasNext() {
        int iH = this.v;
        if (iH == 0) {
            iH = h();
        }
        return (iH == 2 || iH == 4) ? false : true;
    }

    public final boolean l(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.g;
        int i5 = this.d;
        this.g = i4 - i5;
        int i6 = this.e;
        char[] cArr = this.c;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.e = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.e = 0;
        }
        this.d = 0;
        do {
            int i8 = this.e;
            int i9 = this.a.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.e + i9;
            this.e = i2;
            if (this.f == 0 && (i3 = this.g) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.d++;
                this.g = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public final double nextDouble() {
        int iH = this.v;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 15) {
            this.v = 0;
            int[] iArr = this.Z;
            int i = this.X - 1;
            iArr[i] = iArr[i] + 1;
            return this.w;
        }
        if (iH == 16) {
            this.y = new String(this.c, this.d, this.x);
            this.d += this.x;
        } else if (iH == 8 || iH == 9) {
            this.y = G(iH == 8 ? '\'' : '\"');
        } else if (iH == 10) {
            this.y = N();
        } else if (iH != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(peek());
            r3.k(sb, x());
            return 0.0d;
        }
        this.v = 11;
        double d = Double.parseDouble(this.y);
        if (!this.b && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new d("JSON forbids NaN and infinities: " + d + x());
        }
        this.y = null;
        this.v = 0;
        int[] iArr2 = this.Z;
        int i2 = this.X - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    public final String nextName() {
        String strG;
        int iH = this.v;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 14) {
            strG = N();
        } else if (iH == 12) {
            strG = G('\'');
        } else {
            if (iH != 13) {
                StringBuilder sb = new StringBuilder("Expected a name but was ");
                sb.append(peek());
                r3.k(sb, x());
                return null;
            }
            strG = G('\"');
        }
        this.v = 0;
        this.Y[this.X - 1] = strG;
        return strG;
    }

    public final b peek() {
        int iH = this.v;
        if (iH == 0) {
            iH = h();
        }
        switch (iH) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return b.STRING;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
                return b.NAME;
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final String toString() {
        return a.class.getSimpleName().concat(x());
    }

    public final boolean u(char c) {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        b();
        return false;
    }

    public final String x() {
        StringBuilder sbN = ib8.n(this.f + 1, (this.d - this.g) + 1, " at line ", " column ", " path ");
        StringBuilder sb = new StringBuilder("$");
        int i = this.X;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.z[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.Z[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = this.Y[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        sbN.append(sb.toString());
        return sbN.toString();
    }
}
