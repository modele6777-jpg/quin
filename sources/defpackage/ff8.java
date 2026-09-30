package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ff8 implements yrf, dk9, rsf, as4 {
    public static volatile ff8 d;
    public final /* synthetic */ int a;
    public int b;
    public static final Object c = new Object();
    public static final float[] e = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 1.0E11f, 1.0E12f, 1.0E13f, 1.0E14f, 1.0E15f, 1.0E16f, 1.0E17f, 1.0E18f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};
    public static final float[] f = {1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};

    public ff8(int i, xf1 xf1Var) {
        this.a = 5;
        xf1Var.getClass();
        this.b = i;
    }

    public static ff8 h() {
        ff8 ff8Var;
        synchronized (c) {
            try {
                if (d == null) {
                    d = new ff8(3, 0);
                }
                ff8Var = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ff8Var;
    }

    public static String n(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    @Override // defpackage.as4
    public int a(Context context, String str, boolean z) {
        return 0;
    }

    @Override // defpackage.as4
    public int d(Context context, String str) {
        return this.b;
    }

    public void e(String str, String str2) {
        if (this.b <= 3) {
            Log.d(str, str2);
        }
    }

    public void f(String str, String str2) {
        if (this.b <= 6) {
            b1.d(str, str2);
        }
    }

    public void g(String str, String str2, Throwable th) {
        if (this.b <= 6) {
            b1.e(str, str2, th);
        }
    }

    public int j(int i) {
        int i2 = this.b;
        if (i2 == -1) {
            return i == 7 ? 6 : 3;
        }
        return i2;
    }

    public Object k(wn7 wn7Var, Object obj) {
        wn7Var.getClass();
        return ((e7f) obj).a.get(this.b);
    }

    public void l(String str, String str2) {
        if (this.b <= 4) {
            Log.i(str, str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x008a A[EDGE_INSN: B:107:0x008a->B:42:0x008a BREAK  A[LOOP:0: B:13:0x0034->B:41:0x0083], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0101 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00de  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x0105 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0108  */
    /* JADX WARN: Code duplicated, block: B:87:0x010a  */
    public float m(int i, int i2, String str) {
        boolean z;
        int i3;
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        float f2;
        char cCharAt;
        int i10;
        char cCharAt2;
        boolean z3;
        boolean z4;
        int i11;
        int i12;
        int i13;
        char cCharAt3;
        char cCharAt4;
        this.b = i;
        if (i >= i2) {
            return Float.NaN;
        }
        char cCharAt5 = str.charAt(i);
        if (cCharAt5 != '+') {
            if (cCharAt5 != '-') {
                z = false;
            } else {
                z = true;
            }
            int i14 = this.b;
            long j = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            z2 = false;
            i6 = 0;
            while (true) {
                i7 = this.b;
                if (i7 >= i2) {
                    break;
                }
                cCharAt4 = str.charAt(i7);
                if (cCharAt4 != '0') {
                    if (i3 == 0) {
                        i5++;
                    } else {
                        i4++;
                    }
                } else if (cCharAt4 < '1' && cCharAt4 <= '9') {
                    int i15 = i3 + i4;
                    while (i4 > 0) {
                        if (j > 922337203685477580L) {
                            return Float.NaN;
                        }
                        j *= 10;
                        i4--;
                    }
                    if (j > 922337203685477580L) {
                        return Float.NaN;
                    }
                    j = (j * 10) + ((long) (cCharAt4 - '0'));
                    i3 = i15 + 1;
                    if (j < 0) {
                        return Float.NaN;
                    }
                } else {
                    if (cCharAt4 != '.' || z2) {
                        break;
                    }
                    i6 = this.b - i14;
                    z2 = true;
                }
                this.b++;
            }
            if (!z2 && this.b == i6 + 1) {
                return Float.NaN;
            }
            if (i3 == 0) {
                if (i5 == 0) {
                    return Float.NaN;
                }
                i3 = 1;
            }
            if (z2) {
                i4 = (i6 - i5) - i3;
            }
            i8 = this.b;
            if (i8 < i2 && ((cCharAt = str.charAt(i8)) == 'E' || cCharAt == 'e')) {
                i10 = this.b + 1;
                this.b = i10;
                if (i10 == i2) {
                    return Float.NaN;
                }
                cCharAt2 = str.charAt(i10);
                if (cCharAt2 != '+') {
                    if (cCharAt2 != '-') {
                        switch (cCharAt2) {
                            case z7c.f /* 48 */:
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                z3 = false;
                                z4 = false;
                                break;
                            default:
                                this.b--;
                                z4 = true;
                                z3 = false;
                                break;
                        }
                    } else {
                        z3 = true;
                    }
                    if (!z4) {
                        i11 = this.b;
                        i12 = 0;
                        while (true) {
                            i13 = this.b;
                            if (i13 >= i2 && (cCharAt3 = str.charAt(i13)) >= '0' && cCharAt3 <= '9') {
                                if (i12 > 922337203685477580L) {
                                    return Float.NaN;
                                }
                                i12 = (i12 * 10) + (cCharAt3 - '0');
                                this.b++;
                            }
                        }
                        if (this.b == i11) {
                            return Float.NaN;
                        }
                        if (z3) {
                            i4 -= i12;
                        } else {
                            i4 += i12;
                        }
                    }
                } else {
                    z3 = false;
                }
                this.b++;
                z4 = false;
                if (!z4) {
                    i11 = this.b;
                    i12 = 0;
                    while (true) {
                        i13 = this.b;
                        if (i13 >= i2) {
                        }
                        i12 = (i12 * 10) + (cCharAt3 - '0');
                        this.b++;
                    }
                    if (this.b == i11) {
                        return Float.NaN;
                    }
                    if (z3) {
                        i4 -= i12;
                    } else {
                        i4 += i12;
                    }
                }
            }
            i9 = i3 + i4;
            if (i9 <= 39 || i9 < -44) {
                return Float.NaN;
            }
            float f3 = j;
            if (j != 0) {
                if (i4 > 0) {
                    f2 = e[i4];
                } else if (i4 < 0) {
                    if (i4 < -38) {
                        f3 = (float) (((double) f3) * 1.0E-20d);
                        i4 += 20;
                    }
                    f2 = f[-i4];
                }
                f3 *= f2;
            }
            return z ? -f3 : f3;
        }
        z = false;
        this.b++;
        int i16 = this.b;
        long j2 = 0;
        i3 = 0;
        i4 = 0;
        i5 = 0;
        z2 = false;
        i6 = 0;
        while (true) {
            i7 = this.b;
            if (i7 >= i2) {
                break;
                break;
            }
            cCharAt4 = str.charAt(i7);
            if (cCharAt4 != '0') {
                if (cCharAt4 < '1') {
                }
                if (cCharAt4 != '.') {
                    break;
                }
                break;
                break;
            }
            if (i3 == 0) {
                i5++;
            } else {
                i4++;
            }
            this.b++;
        }
        if (!z2) {
        }
        if (i3 == 0) {
            if (i5 == 0) {
                return Float.NaN;
            }
            i3 = 1;
        }
        if (z2) {
            i4 = (i6 - i5) - i3;
        }
        i8 = this.b;
        if (i8 < i2) {
            i10 = this.b + 1;
            this.b = i10;
            if (i10 == i2) {
                return Float.NaN;
            }
            cCharAt2 = str.charAt(i10);
            if (cCharAt2 != '+') {
                if (cCharAt2 != '-') {
                    switch (cCharAt2) {
                        case z7c.f /* 48 */:
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            z3 = false;
                            z4 = false;
                            break;
                        default:
                            this.b--;
                            z4 = true;
                            z3 = false;
                            break;
                    }
                } else {
                    z3 = true;
                }
                if (!z4) {
                    i11 = this.b;
                    i12 = 0;
                    while (true) {
                        i13 = this.b;
                        if (i13 >= i2) {
                        }
                        i12 = (i12 * 10) + (cCharAt3 - '0');
                        this.b++;
                    }
                    if (this.b == i11) {
                        return Float.NaN;
                    }
                    if (z3) {
                        i4 -= i12;
                    } else {
                        i4 += i12;
                    }
                }
            } else {
                z3 = false;
            }
            this.b++;
            z4 = false;
            if (!z4) {
                i11 = this.b;
                i12 = 0;
                while (true) {
                    i13 = this.b;
                    if (i13 >= i2) {
                    }
                    i12 = (i12 * 10) + (cCharAt3 - '0');
                    this.b++;
                }
                if (this.b == i11) {
                    return Float.NaN;
                }
                if (z3) {
                    i4 -= i12;
                } else {
                    i4 += i12;
                }
            }
        }
        i9 = i3 + i4;
        if (i9 <= 39) {
        }
        return Float.NaN;
    }

    public void o(String str, String str2) {
        if (this.b <= 5) {
            b1.l(str, str2);
        }
    }

    @Override // defpackage.rsf
    public int p() {
        return this.b;
    }

    @Override // defpackage.rsf
    public int s() {
        return 0;
    }

    @Override // defpackage.psf
    public b00 t(long j, b00 b00Var, b00 b00Var2, b00 b00Var3) {
        return j < ((long) this.b) * 1000000 ? b00Var : b00Var2;
    }

    @Override // defpackage.dk9
    public String w() {
        switch (this.a) {
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return tec.g(this.b, " digits", new StringBuilder("expected at least "));
            default:
                return tec.g(this.b, " digits", new StringBuilder("expected at most "));
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d1  */
    @Override // defpackage.yrf
    public Object x(cj7 cj7Var, float f2) {
        int i;
        int iArgb;
        float f3;
        int iArgb2;
        float f4;
        float fE;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        int i3 = 0;
        boolean z = cj7Var.l() == 1;
        if (z) {
            cj7Var.beginArray();
        }
        while (cj7Var.hasNext()) {
            arrayList.add(Float.valueOf((float) cj7Var.nextDouble()));
        }
        int i4 = 2;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.b = 2;
        }
        if (z) {
            cj7Var.endArray();
        }
        int size = this.b;
        if (size == -1) {
            size = arrayList.size() / 4;
            this.b = size;
        }
        float[] fArr = new float[size];
        int[] iArr = new int[size];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i = this.b * 4;
            if (i5 >= i) {
                break;
            }
            int i8 = i5 / 4;
            double dFloatValue = ((Float) arrayList.get(i5)).floatValue();
            int i9 = i3;
            int i10 = i5 % 4;
            if (i10 != 0) {
                if (i10 == i2) {
                    i6 = (int) (dFloatValue * 255.0d);
                } else if (i10 == 2) {
                    i7 = (int) (dFloatValue * 255.0d);
                } else if (i10 == 3) {
                    iArr[i8] = Color.argb(255, i6, i7, (int) (dFloatValue * 255.0d));
                }
            } else if (i8 > 0) {
                float f5 = (float) dFloatValue;
                if (fArr[i8 - 1] >= f5) {
                    fArr[i8] = f5 + 0.01f;
                } else {
                    fArr[i8] = (float) dFloatValue;
                }
            } else {
                fArr[i8] = (float) dFloatValue;
            }
            i5++;
            i3 = i9;
            i2 = 1;
        }
        int i11 = i3;
        wc6 wc6Var = new wc6(fArr, iArr);
        if (arrayList.size() <= i) {
            return wc6Var;
        }
        int size2 = (arrayList.size() - i) / 2;
        float[] fArr2 = new float[size2];
        float[] fArr3 = new float[size2];
        int i12 = i11;
        while (i < arrayList.size()) {
            if (i % 2 == 0) {
                fArr2[i12] = ((Float) arrayList.get(i)).floatValue();
            } else {
                fArr3[i12] = ((Float) arrayList.get(i)).floatValue();
                i12++;
            }
            i++;
        }
        float[] fArrCopyOf = wc6Var.a;
        if (fArrCopyOf.length == 0) {
            fArrCopyOf = fArr2;
        } else if (size2 != 0) {
            int length = fArrCopyOf.length + size2;
            float[] fArr4 = new float[length];
            int i13 = i11;
            int i14 = i13;
            int i15 = i14;
            int i16 = i15;
            while (i13 < length) {
                float f6 = i15 < fArrCopyOf.length ? fArrCopyOf[i15] : Float.NaN;
                float f7 = i16 < size2 ? fArr2[i16] : Float.NaN;
                if (Float.isNaN(f7) || f6 < f7) {
                    fArr4[i13] = f6;
                    i15++;
                } else if (Float.isNaN(f6) || f7 < f6) {
                    fArr4[i13] = f7;
                    i16++;
                } else {
                    fArr4[i13] = f6;
                    i15++;
                    i16++;
                    i14++;
                }
                i13++;
            }
            fArrCopyOf = i14 == 0 ? fArr4 : Arrays.copyOf(fArr4, length - i14);
        }
        int length2 = fArrCopyOf.length;
        int[] iArr2 = new int[length2];
        int i17 = i11;
        while (i17 < length2) {
            float f8 = fArrCopyOf[i17];
            int iBinarySearch = Arrays.binarySearch(fArr, f8);
            int iBinarySearch2 = Arrays.binarySearch(fArr2, f8);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                float f9 = fArr3[iBinarySearch2];
                if (size < i4 || f8 == fArr[i11]) {
                    iArgb = iArr[i11];
                } else {
                    int i18 = 1;
                    while (true) {
                        if (i18 >= size) {
                            qc0.j("Unreachable code.");
                            return null;
                        }
                        f3 = fArr[i18];
                        if (f3 >= f8 || i18 == size - 1) {
                            break;
                        }
                        i18++;
                    }
                    if (i18 != size - 1 || f8 < f3) {
                        int i19 = i18 - 1;
                        float f10 = fArr[i19];
                        int iA = tm7.A((f8 - f10) / (f3 - f10), iArr[i19], iArr[i18]);
                        iArgb = Color.argb((int) (f9 * 255.0f), Color.red(iA), Color.green(iA), Color.blue(iA));
                    } else {
                        iArgb = Color.argb((int) (f9 * 255.0f), Color.red(iArr[i18]), Color.green(iArr[i18]), Color.blue(iArr[i18]));
                    }
                }
                iArr2[i17] = iArgb;
            } else {
                int i20 = iArr[iBinarySearch];
                if (size2 < i4 || f8 <= fArr2[i11]) {
                    iArgb2 = Color.argb((int) (fArr3[i11] * 255.0f), Color.red(i20), Color.green(i20), Color.blue(i20));
                } else {
                    int i21 = 1;
                    while (true) {
                        if (i21 >= size2) {
                            qc0.j("Unreachable code.");
                            return null;
                        }
                        f4 = fArr2[i21];
                        if (f4 >= f8 || i21 == size2 - 1) {
                            break;
                        }
                        i21++;
                    }
                    if (f4 <= f8) {
                        fE = fArr3[i21];
                    } else {
                        int i22 = i21 - 1;
                        float f11 = fArr2[i22];
                        fE = aw8.e(fArr3[i22], fArr3[i21], (f8 - f11) / (f4 - f11));
                    }
                    iArgb2 = Color.argb((int) (fE * 255.0f), Color.red(i20), Color.green(i20), Color.blue(i20));
                }
                iArr2[i17] = iArgb2;
            }
            i17++;
            i4 = 2;
        }
        return new wc6(fArrCopyOf, iArr2);
    }

    public /* synthetic */ ff8(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public /* synthetic */ ff8(int i) {
        this.a = i;
    }

    @Override // defpackage.psf
    public b00 i(long j, b00 b00Var, b00 b00Var2, b00 b00Var3) {
        return b00Var3;
    }
}
