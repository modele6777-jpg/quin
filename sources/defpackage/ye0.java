package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ye0 implements pc5 {
    public final /* synthetic */ int a;
    public final qhf b;
    public final as9 c;

    public /* synthetic */ ye0(qhf qhfVar, as9 as9Var, int i) {
        this.a = i;
        this.b = qhfVar;
        this.c = as9Var;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0329  */
    /* JADX WARN: Code duplicated, block: B:128:0x0331  */
    /* JADX WARN: Code duplicated, block: B:132:0x0337  */
    /* JADX WARN: Code duplicated, block: B:134:0x033a  */
    /* JADX WARN: Code duplicated, block: B:136:0x033d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x033f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0342  */
    /* JADX WARN: Code duplicated, block: B:140:0x034a  */
    /* JADX WARN: Code duplicated, block: B:143:0x034f A[ADDED_TO_REGION, LOOP:2: B:143:0x034f->B:147:0x035d, LOOP_START, PHI: r14
  0x034f: PHI (r14v17 int) = (r14v14 int), (r14v18 int) binds: [B:141:0x034c, B:147:0x035d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:144:0x0351  */
    /* JADX WARN: Code duplicated, block: B:147:0x035d A[LOOP:2: B:143:0x034f->B:147:0x035d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:154:0x0379  */
    /* JADX WARN: Code duplicated, block: B:155:0x0383  */
    /* JADX WARN: Code duplicated, block: B:157:0x0387  */
    /* JADX WARN: Code duplicated, block: B:160:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:162:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:164:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:193:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:204:0x0334 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x038e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0360 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0073  */
    @Override // defpackage.pc5
    public final Object a(pv4 pv4Var) throws XmlPullParserException, IOException {
        String mimeTypeFromExtension;
        int iN;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Integer numD;
        String mimeTypeFromExtension2;
        Drawable drawable;
        int i10 = this.a;
        char c = '\f';
        zb3 zb3Var = zb3.c;
        qhf qhfVar = this.b;
        as9 as9Var = this.c;
        String mimeTypeFromExtension3 = null;
        switch (i10) {
            case 0:
                String strD0 = s72.D0(s72.r0(afc.f(qhfVar), 1), "/", null, null, null, 62);
                ptd ptdVar = new ptd(new yhb(z5c.K(as9Var.a.getAssets().open(strD0))), as9Var.f, new re0(strD0));
                if (v4e.Q(strD0)) {
                    mimeTypeFromExtension = null;
                } else {
                    String strK0 = v4e.k0(v4e.k0(strD0, '#'), '?');
                    String strG0 = v4e.g0('.', v4e.g0('/', strK0, strK0), "");
                    if (v4e.Q(strG0)) {
                        mimeTypeFromExtension = null;
                    } else {
                        String lowerCase = strG0.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        mimeTypeFromExtension = (String) rv8.a.get(lowerCase);
                        if (mimeTypeFromExtension == null) {
                            mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                        }
                    }
                }
                return new otd(ptdVar, mimeTypeFromExtension, zb3Var);
            case 1:
                String str = qhfVar.a;
                int iO = v4e.O(str, ";base64,", 0, false, 6);
                if (iO == -1 || (iN = v4e.N(str, ':', 0, 6)) == -1) {
                    ho7.w(qhfVar, "invalid data uri: ");
                } else {
                    String strSubstring = str.substring(iN + 1, iO);
                    gt0 gt0Var = it0.c;
                    int i11 = 8;
                    int i12 = iO + 8;
                    int length = str.length();
                    gt0Var.getClass();
                    boolean z2 = gt0Var.b;
                    y7h.o(i12, length, str.length());
                    byte[] bytes = str.substring(i12, length).getBytes(ox1.d);
                    bytes.getClass();
                    int length2 = bytes.length;
                    y7h.o(0, length2, bytes.length);
                    int i13 = -2;
                    if (length2 == 0) {
                        strSubstring = strSubstring;
                        i3 = 0;
                    } else if (length2 != 1) {
                        if (z2) {
                            i2 = length2;
                            int i14 = 0;
                            while (true) {
                                char c2 = c;
                                if (i14 < length2) {
                                    int i15 = kt0.a[bytes[i14] & 255];
                                    if (i15 < 0) {
                                        if (i15 == -2) {
                                            i2 -= length2 - i14;
                                        } else {
                                            i2--;
                                        }
                                    }
                                    i14++;
                                    c = c2;
                                }
                            }
                        } else {
                            if (bytes[length2 - 1] == 61) {
                                i2 = length2 - 1;
                                if (bytes[length2 - 2] == 61) {
                                    i2 = length2 - 2;
                                }
                            } else {
                                i = length2;
                            }
                            i3 = (int) ((((long) i) * 6) / 8);
                        }
                        i = i2;
                        i3 = (int) ((((long) i) * 6) / 8);
                    } else {
                        qc0.j(tec.e(length2, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "));
                    }
                    byte[] bArr = new byte[i3];
                    int[] iArr = gt0Var.a ? kt0.b : kt0.a;
                    int i16 = -8;
                    int i17 = 0;
                    int i18 = 0;
                    int i19 = 0;
                    int i20 = -8;
                    while (true) {
                        int i21 = i11;
                        if (i17 >= length2) {
                            i4 = i13;
                            z = false;
                        } else if (i20 != i16 || (i9 = i17 + 3) >= length2) {
                            i5 = bytes[i17] & 255;
                            i6 = iArr[i5];
                            if (i6 < 0) {
                                i17++;
                                i19 = (i19 << 6) | i6;
                                i7 = i20 + 6;
                                if (i7 >= 0) {
                                    bArr[i18] = (byte) (i19 >>> i7);
                                    i19 &= (1 << i7) - 1;
                                    i20 -= 2;
                                    i18++;
                                } else {
                                    i20 = i7;
                                }
                                i16 = -8;
                                i11 = 8;
                            } else if (i6 == -2) {
                                if (i20 != -8) {
                                    qc0.j(tec.e(i17, "Redundant pad character at index "));
                                } else if (i20 == -6) {
                                    i17++;
                                    z = true;
                                    i4 = -2;
                                } else if (i20 != -4) {
                                    i8 = i17 + 1;
                                    if (z2) {
                                        while (i8 < length2) {
                                            if (kt0.a[bytes[i8] & 255] != -1) {
                                                i8++;
                                            }
                                        }
                                    }
                                    if (i8 == length2 && bytes[i8] == 61) {
                                        i17 = i8 + 1;
                                        z = true;
                                        i4 = -2;
                                    } else {
                                        qc0.j(tec.e(i8, "Missing one pad character at index "));
                                    }
                                } else if (i20 == -2) {
                                    i17++;
                                    z = true;
                                    i4 = -2;
                                } else {
                                    qc0.p("Unreachable");
                                }
                            } else {
                                if (z2) {
                                    tq.o(i21);
                                    String string = Integer.toString(i5, i21);
                                    string.getClass();
                                    throw new IllegalArgumentException("Invalid symbol '" + ((char) i5) + "'(" + string + ") at index " + i17);
                                }
                                i17++;
                                i11 = i21;
                                i16 = -8;
                            }
                            i13 = -2;
                        } else {
                            int i22 = i17 + 4;
                            int i23 = (iArr[bytes[i17] & 255] << 18) | (iArr[bytes[i17 + 1] & 255] << 12) | (iArr[bytes[i17 + 2] & 255] << 6) | iArr[bytes[i9] & 255];
                            if (i23 >= 0) {
                                bArr[i18] = (byte) (i23 >> 16);
                                int i24 = i18 + 2;
                                bArr[i18 + 1] = (byte) (i23 >> 8);
                                i18 += 3;
                                bArr[i24] = (byte) i23;
                                i11 = i21;
                                i17 = i22;
                                i16 = -8;
                            } else {
                                i5 = bytes[i17] & 255;
                                i6 = iArr[i5];
                                if (i6 < 0) {
                                    i17++;
                                    i19 = (i19 << 6) | i6;
                                    i7 = i20 + 6;
                                    if (i7 >= 0) {
                                        bArr[i18] = (byte) (i19 >>> i7);
                                        i19 &= (1 << i7) - 1;
                                        i20 -= 2;
                                        i18++;
                                    } else {
                                        i20 = i7;
                                    }
                                    i16 = -8;
                                    i11 = 8;
                                } else if (i6 == -2) {
                                    if (i20 != -8) {
                                        qc0.j(tec.e(i17, "Redundant pad character at index "));
                                    } else if (i20 == -6) {
                                        i17++;
                                        z = true;
                                        i4 = -2;
                                    } else if (i20 != -4) {
                                        i8 = i17 + 1;
                                        if (z2) {
                                            while (i8 < length2) {
                                                if (kt0.a[bytes[i8] & 255] != -1) {
                                                    i8++;
                                                }
                                            }
                                        }
                                        if (i8 == length2) {
                                        }
                                        qc0.j(tec.e(i8, "Missing one pad character at index "));
                                    } else if (i20 == -2) {
                                        i17++;
                                        z = true;
                                        i4 = -2;
                                    } else {
                                        qc0.p("Unreachable");
                                    }
                                } else {
                                    if (z2) {
                                        tq.o(i21);
                                        String string2 = Integer.toString(i5, i21);
                                        string2.getClass();
                                        throw new IllegalArgumentException("Invalid symbol '" + ((char) i5) + "'(" + string2 + ") at index " + i17);
                                    }
                                    i17++;
                                    i11 = i21;
                                    i16 = -8;
                                }
                            }
                            i13 = -2;
                        }
                    }
                    if (i20 == i4) {
                        qc0.j("The last unit of input does not have enough bits");
                    } else if (i20 != -8 && !z) {
                        qc0.j("The padding option is set to PRESENT, but the input is not properly padded");
                    } else if (i19 == 0) {
                        if (z2) {
                            while (i17 < length2) {
                                if (kt0.a[bytes[i17] & 255] == -1) {
                                    i17++;
                                }
                            }
                        }
                        if (i17 < length2) {
                            int i25 = bytes[i17] & 255;
                            StringBuilder sb = new StringBuilder("Symbol '");
                            sb.append((char) i25);
                            sb.append("'(");
                            tq.o(8);
                            String string3 = Integer.toString(i25, 8);
                            string3.getClass();
                            sb.append(string3);
                            sb.append(") at index ");
                            qc0.j(tec.g(i17 - 1, " is prohibited after the pad character", sb));
                        } else {
                            if (i18 == i3) {
                                f41 f41Var = new f41();
                                f41Var.g1(bArr, i3);
                                return new otd(rxg.i(f41Var, as9Var.f), strSubstring, zb3.b);
                            }
                            qc0.p("Check failed.");
                        }
                    } else {
                        qc0.j("The pad bits must be zeros");
                    }
                }
                return null;
            case 2:
                String str2 = e1a.b;
                String strE = afc.e(qhfVar);
                if (strE == null) {
                    qc0.p("filePath == null");
                    return null;
                }
                e1a e1aVarR = y25.r(strE);
                kd5 kd5VarG = rxg.g(e1aVarR, as9Var.f, null, null, 28);
                String strG1 = v4e.g0('.', e1aVarR.b(), "");
                if (!v4e.Q(strG1)) {
                    String lowerCase2 = strG1.toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    mimeTypeFromExtension3 = (String) rv8.a.get(lowerCase2);
                    if (mimeTypeFromExtension3 == null) {
                        mimeTypeFromExtension3 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase2);
                    }
                }
                return new otd(kd5VarG, mimeTypeFromExtension3, zb3Var);
            case 3:
                String str3 = qhfVar.e;
                if (str3 == null) {
                    str3 = "";
                }
                int iN2 = v4e.N(str3, '!', 0, 6);
                if (iN2 == -1) {
                    ho7.w(qhfVar, "Invalid jar:file URI: ");
                    return null;
                }
                String str4 = e1a.b;
                e1a e1aVarR2 = y25.r(str3.substring(0, iN2));
                e1a e1aVarR3 = y25.r(str3.substring(iN2 + 1, str3.length()));
                zd5 zd5Var = as9Var.f;
                zd5Var.getClass();
                kd5 kd5VarG2 = rxg.g(e1aVarR3, gdc.i(e1aVarR2, zd5Var, new n8g(12)), null, null, 28);
                String strG2 = v4e.g0('.', e1aVarR3.b(), "");
                if (!v4e.Q(strG2)) {
                    String lowerCase3 = strG2.toLowerCase(Locale.ROOT);
                    lowerCase3.getClass();
                    mimeTypeFromExtension3 = (String) rv8.a.get(lowerCase3);
                    if (mimeTypeFromExtension3 == null) {
                        mimeTypeFromExtension3 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase3);
                    }
                }
                return new otd(kd5VarG2, mimeTypeFromExtension3, zb3Var);
            default:
                String str5 = qhfVar.d;
                if (str5 != null) {
                    if (v4e.Q(str5)) {
                        str5 = null;
                    }
                    if (str5 != null) {
                        String str6 = (String) s72.H0(afc.f(qhfVar));
                        if (str6 == null || (numD = c5e.D(str6)) == null) {
                            yg5.r(qhfVar, "Invalid android.resource URI: ");
                            return null;
                        }
                        int iIntValue = numD.intValue();
                        Context context = as9Var.a;
                        Resources resources = str5.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(str5);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(iIntValue, typedValue, true);
                        String string4 = typedValue.string.toString();
                        if (v4e.Q(string4)) {
                            mimeTypeFromExtension2 = null;
                        } else {
                            String strK1 = v4e.k0(v4e.k0(string4, '#'), '?');
                            String strG3 = v4e.g0('.', v4e.g0('/', strK1, strK1), "");
                            if (v4e.Q(strG3)) {
                                mimeTypeFromExtension2 = null;
                            } else {
                                String lowerCase4 = strG3.toLowerCase(Locale.ROOT);
                                lowerCase4.getClass();
                                mimeTypeFromExtension2 = (String) rv8.a.get(lowerCase4);
                                if (mimeTypeFromExtension2 == null) {
                                    mimeTypeFromExtension2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase4);
                                }
                            }
                        }
                        if (!pa7.t(mimeTypeFromExtension2, "text/xml")) {
                            return new otd(new ptd(new yhb(z5c.K(resources.openRawResource(iIntValue, new TypedValue()))), as9Var.f, new dyb(str5, iIntValue)), mimeTypeFromExtension2, zb3Var);
                        }
                        if (str5.equals(context.getPackageName())) {
                            drawable = x57.T(context, iIntValue);
                            if (drawable == null) {
                                ho7.j(tec.e(iIntValue, "Invalid resource ID: "));
                                return null;
                            }
                        } else {
                            XmlResourceParser xml = resources.getXml(iIntValue);
                            int next = xml.next();
                            while (next != 2 && next != 1) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found.");
                            }
                            Resources.Theme theme = context.getTheme();
                            ThreadLocal threadLocal = hyb.a;
                            drawable = resources.getDrawable(iIntValue, theme);
                            if (drawable == null) {
                                ho7.j(tec.e(iIntValue, "Invalid resource ID: "));
                                return null;
                            }
                        }
                        Bitmap.Config[] configArr = erf.a;
                        boolean z3 = drawable instanceof VectorDrawable;
                        if (z3) {
                            drawable = new BitmapDrawable(context.getResources(), kj0.Z(drawable, (Bitmap.Config) b21.A(as9Var, yw6.b), as9Var.b, as9Var.c, (ykd) b21.A(as9Var, vw6.b), as9Var.d == bpa.b));
                        }
                        return new tv6(y7h.k(drawable), z3, zb3Var);
                    }
                }
                yg5.r(qhfVar, "Invalid android.resource URI: ");
                return null;
        }
    }
}
