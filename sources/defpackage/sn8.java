package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sn8 implements qu8 {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public sn8(String str, byte[] bArr, int i, int i2) {
        byte b;
        str.getClass();
        boolean z = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i2 == 23 && bArr.length == 4) {
                    z = true;
                }
                pa7.A(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                pa7.A(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i2 == 78 && bArr.length == 8) {
                    z = true;
                }
                pa7.A(z);
                break;
            case "auxiliary.tracks.map":
                pa7.A(i2 == 0);
                break;
        }
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    public final ArrayList d() {
        pa7.I("Metadata is not an auxiliary tracks map", this.a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.b;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2] & 255));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sn8.class != obj.getClass()) {
            return false;
        }
        sn8 sn8Var = (sn8) obj;
        return this.a.equals(sn8Var.a) && Arrays.equals(this.b, sn8Var.b) && this.c == sn8Var.c && this.d == sn8Var.d;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + ub3.c(527, 31, this.a)) * 31) + this.c) * 31) + this.d;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:54:0x011a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0121  */
    /* JADX WARN: Code duplicated, block: B:60:0x012c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0135  */
    /* JADX WARN: Code duplicated, block: B:63:0x0138 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x013a  */
    /* JADX WARN: Code duplicated, block: B:65:0x013c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0141  */
    /* JADX WARN: Code duplicated, block: B:73:0x0172 A[EDGE_INSN: B:73:0x0172->B:75:0x0178 BREAK  A[LOOP:0: B:33:0x00c9->B:74:0x0174]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0174 A[LOOP:0: B:33:0x00c9->B:74:0x0174, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x017c  */
    /* JADX WARN: Code duplicated, block: B:78:0x017e  */
    /* JADX WARN: Code duplicated, block: B:84:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x00c3, please report this as an issue */
    public final String toString() {
        String string;
        st0 st0Var;
        ut0 st0Var2;
        rt0 rt0Var;
        char[] cArr;
        int i;
        int length;
        int i2;
        boolean z;
        char[] cArr2;
        int i3;
        rt0 rt0Var2;
        byte[] bArr;
        byte[] bArrCopyOf;
        int i4;
        int i5;
        byte b;
        byte b2;
        boolean z2;
        char c;
        char c2;
        char c3;
        char c4;
        int i6 = this.d;
        if (i6 != 0) {
            if (i6 == 1) {
                byte[] bArr2 = this.b;
                String str = pqf.a;
                string = new String(bArr2, StandardCharsets.UTF_8);
            } else if (i6 == 23) {
                byte[] bArr3 = this.b;
                pa7.y("array too small: %s < %s", bArr3.length, 4, bArr3.length >= 4);
                string = String.valueOf(Float.intBitsToFloat(rxg.F(bArr3[0], bArr3[1], bArr3[2], bArr3[3])));
            } else if (i6 == 67) {
                byte[] bArr4 = this.b;
                pa7.y("array too small: %s < %s", bArr4.length, 4, bArr4.length >= 4);
                string = String.valueOf(rxg.F(bArr4[0], bArr4[1], bArr4[2], bArr4[3]));
            } else if (i6 == 75) {
                string = String.valueOf(Byte.toUnsignedInt(this.b[0]));
            } else if (i6 != 78) {
                byte[] bArr5 = this.b;
                String str2 = pqf.a;
                int length2 = bArr5.length;
                st0Var = ut0.e;
                st0Var2 = st0Var.c;
                if (st0Var2 == null) {
                    rt0Var = st0Var.a;
                    cArr = rt0Var.b;
                    for (char c5 : cArr) {
                        if (bm8.D(c5)) {
                            length = cArr.length;
                            i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    z = false;
                                    break;
                                }
                                c4 = cArr[i2];
                                if (c4 < 'a' && c4 <= 'z') {
                                    z = true;
                                    break;
                                }
                                i2++;
                            }
                            pa7.I("Cannot call lowerCase() on a mixed-case alphabet", !z);
                            cArr2 = new char[cArr.length];
                            for (i3 = 0; i3 < cArr.length; i3++) {
                                c3 = cArr[i3];
                                if (bm8.D(c3)) {
                                    c3 = (char) (c3 ^ ' ');
                                }
                                cArr2[i3] = c3;
                            }
                            rt0Var2 = new rt0(ks0.l(new StringBuilder(), rt0Var.a, ".lowerCase()"), cArr2);
                            if (rt0Var.h) {
                                rt0Var = rt0Var2;
                                break;
                            }
                            bArr = rt0Var2.g;
                            if (rt0Var2.h) {
                                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                                for (i4 = 65; i4 <= 90; i4++) {
                                    i5 = i4 | 32;
                                    b = bArr[i4];
                                    b2 = bArr[i5];
                                    if (b == -1) {
                                        bArrCopyOf[i4] = b2;
                                    } else {
                                        if (b2 == -1) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        c = (char) i4;
                                        c2 = (char) i5;
                                        if (z2) {
                                            qc0.p(rfc.l("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c), Character.valueOf(c2)));
                                            return null;
                                        }
                                        bArrCopyOf[i5] = b;
                                    }
                                }
                                rt0Var = new rt0(ks0.l(new StringBuilder(), rt0Var2.a, ".ignoreCase()"), rt0Var2.b, bArrCopyOf, true);
                                break;
                            }
                            rt0Var = rt0Var2;
                            break;
                        }
                    }
                    if (rt0Var == st0Var.a) {
                        st0Var2 = st0Var;
                    } else {
                        st0Var2 = new st0(rt0Var);
                    }
                    st0Var.c = st0Var2;
                }
                string = st0Var2.a(bArr5, length2);
            } else {
                string = String.valueOf(new d0a(this.b).F());
            }
        } else if (this.a.equals("auxiliary.tracks.map")) {
            ArrayList arrayListD = d();
            StringBuilder sbO = ub3.o("track types = ");
            new ue1(String.valueOf(','), 1).a(sbO, arrayListD.iterator());
            string = sbO.toString();
        } else {
            byte[] bArr6 = this.b;
            String str3 = pqf.a;
            int length3 = bArr6.length;
            st0Var = ut0.e;
            st0Var2 = st0Var.c;
            if (st0Var2 == null) {
                rt0Var = st0Var.a;
                cArr = rt0Var.b;
                while (i < r7) {
                    if (bm8.D(c5)) {
                        length = cArr.length;
                        i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                z = false;
                                break;
                            }
                            c4 = cArr[i2];
                            if (c4 < 'a') {
                            }
                            i2++;
                        }
                        pa7.I("Cannot call lowerCase() on a mixed-case alphabet", !z);
                        cArr2 = new char[cArr.length];
                        while (i3 < cArr.length) {
                            c3 = cArr[i3];
                            if (bm8.D(c3)) {
                                c3 = (char) (c3 ^ ' ');
                            }
                            cArr2[i3] = c3;
                        }
                        rt0Var2 = new rt0(ks0.l(new StringBuilder(), rt0Var.a, ".lowerCase()"), cArr2);
                        if (rt0Var.h) {
                            rt0Var = rt0Var2;
                            break;
                        }
                        bArr = rt0Var2.g;
                        if (rt0Var2.h) {
                            bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                            while (i4 <= 90) {
                                i5 = i4 | 32;
                                b = bArr[i4];
                                b2 = bArr[i5];
                                if (b == -1) {
                                    bArrCopyOf[i4] = b2;
                                } else {
                                    if (b2 == -1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    c = (char) i4;
                                    c2 = (char) i5;
                                    if (z2) {
                                        qc0.p(rfc.l("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c), Character.valueOf(c2)));
                                        return null;
                                    }
                                    bArrCopyOf[i5] = b;
                                }
                            }
                            rt0Var = new rt0(ks0.l(new StringBuilder(), rt0Var2.a, ".ignoreCase()"), rt0Var2.b, bArrCopyOf, true);
                            break;
                        }
                        rt0Var = rt0Var2;
                        break;
                    }
                }
                if (rt0Var == st0Var.a) {
                    st0Var2 = st0Var;
                } else {
                    st0Var2 = new st0(rt0Var);
                }
                st0Var.c = st0Var2;
            }
            string = st0Var2.a(bArr6, length3);
        }
        return ib8.m(new StringBuilder("mdta: key="), this.a, ", value=", string);
    }
}
