package defpackage;

import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class du8 implements gfc {
    public static final int[] n = new int[0];
    public static final Unsafe o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final vt8 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final xe9 j;
    public final m78 k;
    public final aff l;
    public final tl8 m;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new c2(2));
        } catch (Throwable unused) {
            unsafe = null;
        }
        o = unsafe;
    }

    public du8(int[] iArr, Object[] objArr, int i, int i2, vt8 vt8Var, int[] iArr2, int i3, int i4, xe9 xe9Var, m78 m78Var, aff affVar, s85 s85Var, tl8 tl8Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = vt8Var instanceof v56;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = xe9Var;
        this.k = m78Var;
        this.l = affVar;
        this.e = vt8Var;
        this.m = tl8Var;
    }

    public static Field F(String str, Class cls) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbP = tec.p("Field ", str, " for ");
            sbP.append(cls.getName());
            sbP.append(" not found. Known fields are ");
            sbP.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbP.toString());
        }
    }

    public static int I(int i) {
        return (i & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof v56) {
            return ((v56) obj).f();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x026b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0272  */
    /* JADX WARN: Code duplicated, block: B:129:0x0288  */
    /* JADX WARN: Code duplicated, block: B:130:0x028b  */
    public static du8 w(idb idbVar, xe9 xe9Var, m78 m78Var, aff affVar, s85 s85Var, tl8 tl8Var) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        int i17;
        int i18;
        int i19;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i20;
        int i21;
        int iObjectFieldOffset3;
        Field fieldF;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        int i25;
        Object obj;
        Field fieldF2;
        int i26;
        Object obj2;
        Field fieldF3;
        int i27;
        char cCharAt10;
        int i28;
        int i29;
        char cCharAt11;
        int i30;
        char cCharAt12;
        int i31;
        char cCharAt13;
        if (!(idbVar instanceof idb)) {
            r3.f();
            return null;
        }
        String str = idbVar.b;
        int length = str.length();
        char c = 55296;
        if (str.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i = i32 + 1;
                if (str.charAt(i32) < 55296) {
                    break;
                }
                i32 = i;
            }
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int iCharAt2 = str.charAt(i);
        if (iCharAt2 >= 55296) {
            int i34 = iCharAt2 & 8191;
            int i35 = 13;
            while (true) {
                i31 = i33 + 1;
                cCharAt13 = str.charAt(i33);
                if (cCharAt13 < 55296) {
                    break;
                }
                i34 |= (cCharAt13 & 8191) << i35;
                i35 += 13;
                i33 = i31;
            }
            iCharAt2 = i34 | (cCharAt13 << i35);
            i33 = i31;
        }
        if (iCharAt2 == 0) {
            i3 = 0;
            i6 = 0;
            iCharAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = n;
            i4 = 0;
        } else {
            int i36 = i33 + 1;
            int iCharAt3 = str.charAt(i33);
            if (iCharAt3 >= 55296) {
                int i37 = iCharAt3 & 8191;
                int i38 = 13;
                while (true) {
                    i15 = i36 + 1;
                    cCharAt8 = str.charAt(i36);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt8 & 8191) << i38;
                    i38 += 13;
                    i36 = i15;
                }
                iCharAt3 = i37 | (cCharAt8 << i38);
                i36 = i15;
            }
            int i39 = i36 + 1;
            int iCharAt4 = str.charAt(i36);
            if (iCharAt4 >= 55296) {
                int i40 = iCharAt4 & 8191;
                int i41 = 13;
                while (true) {
                    i14 = i39 + 1;
                    cCharAt7 = str.charAt(i39);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt7 & 8191) << i41;
                    i41 += 13;
                    i39 = i14;
                }
                iCharAt4 = i40 | (cCharAt7 << i41);
                i39 = i14;
            }
            int i42 = i39 + 1;
            int iCharAt5 = str.charAt(i39);
            if (iCharAt5 >= 55296) {
                int i43 = iCharAt5 & 8191;
                int i44 = 13;
                while (true) {
                    i13 = i42 + 1;
                    cCharAt6 = str.charAt(i42);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt6 & 8191) << i44;
                    i44 += 13;
                    i42 = i13;
                }
                iCharAt5 = i43 | (cCharAt6 << i44);
                i42 = i13;
            }
            int i45 = i42 + 1;
            int iCharAt6 = str.charAt(i42);
            if (iCharAt6 >= 55296) {
                int i46 = iCharAt6 & 8191;
                int i47 = 13;
                while (true) {
                    i12 = i45 + 1;
                    cCharAt5 = str.charAt(i45);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt5 & 8191) << i47;
                    i47 += 13;
                    i45 = i12;
                }
                iCharAt6 = i46 | (cCharAt5 << i47);
                i45 = i12;
            }
            int i48 = i45 + 1;
            iCharAt = str.charAt(i45);
            if (iCharAt >= 55296) {
                int i49 = iCharAt & 8191;
                int i50 = 13;
                while (true) {
                    i11 = i48 + 1;
                    cCharAt4 = str.charAt(i48);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt4 & 8191) << i50;
                    i50 += 13;
                    i48 = i11;
                }
                iCharAt = i49 | (cCharAt4 << i50);
                i48 = i11;
            }
            int i51 = i48 + 1;
            int iCharAt7 = str.charAt(i48);
            if (iCharAt7 >= 55296) {
                int i52 = iCharAt7 & 8191;
                int i53 = 13;
                while (true) {
                    i10 = i51 + 1;
                    cCharAt3 = str.charAt(i51);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt3 & 8191) << i53;
                    i53 += 13;
                    i51 = i10;
                }
                iCharAt7 = i52 | (cCharAt3 << i53);
                i51 = i10;
            }
            int i54 = i51 + 1;
            int iCharAt8 = str.charAt(i51);
            if (iCharAt8 >= 55296) {
                int i55 = iCharAt8 & 8191;
                int i56 = 13;
                while (true) {
                    i9 = i54 + 1;
                    cCharAt2 = str.charAt(i54);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt2 & 8191) << i56;
                    i56 += 13;
                    i54 = i9;
                }
                iCharAt8 = i55 | (cCharAt2 << i56);
                i54 = i9;
            }
            int i57 = i54 + 1;
            int iCharAt9 = str.charAt(i54);
            if (iCharAt9 >= 55296) {
                int i58 = iCharAt9 & 8191;
                int i59 = 13;
                while (true) {
                    i8 = i57 + 1;
                    cCharAt = str.charAt(i57);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i58 |= (cCharAt & 8191) << i59;
                    i59 += 13;
                    i57 = i8;
                }
                iCharAt9 = i58 | (cCharAt << i59);
                i57 = i8;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i60 = (iCharAt3 * 2) + iCharAt4;
            int i61 = iCharAt7;
            i2 = iCharAt5;
            i3 = i61;
            i4 = iCharAt3;
            i33 = i57;
            iArr = iArr2;
            i5 = iCharAt6;
            i6 = i60;
            i7 = iCharAt9;
        }
        Object[] objArr = idbVar.c;
        Class<?> cls = idbVar.a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt * 2];
        int i62 = i7 + i3;
        int i63 = i62;
        int i64 = i7;
        int i65 = 0;
        int i66 = 0;
        while (i33 < length) {
            int i67 = i33 + 1;
            int iCharAt10 = str.charAt(i33);
            if (iCharAt10 >= c) {
                int i68 = iCharAt10 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i30 = i69 + 1;
                    cCharAt12 = str.charAt(i69);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i68 |= (cCharAt12 & 8191) << i70;
                    i70 += 13;
                    i69 = i30;
                }
                iCharAt10 = i68 | (cCharAt12 << i70);
                i16 = i30;
            } else {
                i16 = i67;
            }
            int i71 = i16 + 1;
            int iCharAt11 = str.charAt(i16);
            if (iCharAt11 >= c) {
                int i72 = iCharAt11 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i29 = i73 + 1;
                    cCharAt11 = str.charAt(i73);
                    i17 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i72 |= (cCharAt11 & 8191) << i74;
                    i74 += 13;
                    i73 = i29;
                    length = i17;
                }
                iCharAt11 = i72 | (cCharAt11 << i74);
                i18 = i29;
            } else {
                i17 = length;
                i18 = i71;
            }
            int i75 = iCharAt11 & 255;
            int i76 = iCharAt10;
            if ((iCharAt11 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                iArr[i65] = i66;
                i65++;
            }
            int i77 = i4;
            Unsafe unsafe = o;
            if (i75 >= 51) {
                int i78 = i18 + 1;
                int iCharAt12 = str.charAt(i18);
                if (iCharAt12 >= 55296) {
                    int i79 = iCharAt12 & 8191;
                    int i80 = i78;
                    int i81 = 13;
                    while (true) {
                        i27 = i80 + 1;
                        cCharAt10 = str.charAt(i80);
                        i28 = i79;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i79 = i28 | ((cCharAt10 & 8191) << i81);
                        i81 += 13;
                        i80 = i27;
                    }
                    iCharAt12 = i28 | (cCharAt10 << i81);
                    i23 = i27;
                } else {
                    i23 = i78;
                }
                int i82 = iCharAt12;
                int i83 = i75 - 51;
                int i84 = i23;
                if (i83 == 9 || i83 == 17) {
                    i24 = i6 + 1;
                    objArr2[((i66 / 3) * 2) + 1] = objArr[i6];
                } else {
                    if (i83 == 12 && (kv2.a(idbVar.a(), 1) || (iCharAt11 & 2048) != 0)) {
                        i24 = i6 + 1;
                        objArr2[((i66 / 3) * 2) + 1] = objArr[i6];
                    }
                    i25 = i82 * 2;
                    obj = objArr[i25];
                    if (obj instanceof Field) {
                        fieldF2 = (Field) obj;
                    } else {
                        fieldF2 = F((String) obj, cls);
                        objArr[i25] = fieldF2;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF2);
                    i26 = i25 + 1;
                    obj2 = objArr[i26];
                    if (obj2 instanceof Field) {
                        fieldF3 = (Field) obj2;
                    } else {
                        fieldF3 = F((String) obj2, cls);
                        objArr[i26] = fieldF3;
                    }
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldF3);
                    objArr2 = objArr2;
                    i20 = i84;
                    i21 = 0;
                }
                i6 = i24;
                i25 = i82 * 2;
                obj = objArr[i25];
                if (obj instanceof Field) {
                    fieldF2 = (Field) obj;
                } else {
                    fieldF2 = F((String) obj, cls);
                    objArr[i25] = fieldF2;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF2);
                i26 = i25 + 1;
                obj2 = objArr[i26];
                if (obj2 instanceof Field) {
                    fieldF3 = (Field) obj2;
                } else {
                    fieldF3 = F((String) obj2, cls);
                    objArr[i26] = fieldF3;
                }
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldF3);
                objArr2 = objArr2;
                i20 = i84;
                i21 = 0;
            } else {
                int i85 = i6 + 1;
                Field fieldF4 = F((String) objArr[i6], cls);
                if (i75 == 9 || i75 == 17) {
                    i19 = i85;
                    objArr2[((i66 / 3) * 2) + 1] = fieldF4.getType();
                } else {
                    if (i75 == 27 || i75 == 49) {
                        i22 = i6 + 2;
                        objArr2[((i66 / 3) * 2) + 1] = objArr[i85];
                    } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                        i19 = i85;
                        if (idbVar.a() == 1 || (iCharAt11 & 2048) != 0) {
                            i22 = i6 + 2;
                            objArr2[((i66 / 3) * 2) + 1] = objArr[i19];
                        }
                    } else if (i75 == 50) {
                        int i86 = i64 + 1;
                        iArr[i64] = i66;
                        int i87 = (i66 / 3) * 2;
                        i19 = i6 + 2;
                        objArr2[i87] = objArr[i85];
                        if ((iCharAt11 & 2048) != 0) {
                            objArr2[i87 + 1] = objArr[i19];
                            i19 = i6 + 3;
                        }
                        i64 = i86;
                    } else {
                        i19 = i85;
                    }
                    i19 = i22;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                if ((iCharAt11 & 4096) == 0 || i75 > 17) {
                    iObjectFieldOffset2 = 1048575;
                    i20 = i18;
                    i21 = 0;
                } else {
                    int i88 = i18 + 1;
                    int iCharAt13 = str.charAt(i18);
                    if (iCharAt13 >= 55296) {
                        int i89 = iCharAt13 & 8191;
                        int i90 = 13;
                        while (true) {
                            i20 = i88 + 1;
                            cCharAt9 = str.charAt(i88);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i89 |= (cCharAt9 & 8191) << i90;
                            i90 += 13;
                            i88 = i20;
                        }
                        iCharAt13 = i89 | (cCharAt9 << i90);
                    } else {
                        i20 = i88;
                    }
                    int i91 = (iCharAt13 / 32) + (i77 * 2);
                    Object obj3 = objArr[i91];
                    if (obj3 instanceof Field) {
                        fieldF = (Field) obj3;
                    } else {
                        fieldF = F((String) obj3, cls);
                        objArr[i91] = fieldF;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF);
                    i21 = iCharAt13 % 32;
                }
                if (i75 < 18 || i75 > 49) {
                    iObjectFieldOffset3 = iObjectFieldOffset2;
                } else {
                    iArr[i63] = iObjectFieldOffset;
                    iObjectFieldOffset3 = iObjectFieldOffset2;
                    i63++;
                }
                i6 = i19;
            }
            int i92 = i66 + 1;
            iArr3[i66] = i76;
            int i93 = i66 + 2;
            String str2 = str;
            iArr3[i92] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i75 << 20) | iObjectFieldOffset;
            i66 += 3;
            iArr3[i93] = (i21 << 20) | iObjectFieldOffset3;
            objArr2 = objArr2;
            str = str2;
            i33 = i20;
            length = i17;
            i4 = i77;
            iArr3 = iArr3;
            i62 = i62;
            c = 55296;
        }
        return new du8(iArr3, objArr2, i2, i5, idbVar.a, iArr, i7, i62, xe9Var, m78Var, affVar, s85Var, tl8Var);
    }

    public static long x(int i) {
        return i & 1048575;
    }

    public static int y(long j, Object obj) {
        return ((Integer) xff.h(j, obj)).intValue();
    }

    public static long z(long j, Object obj) {
        return ((Long) xff.h(j, obj)).longValue();
    }

    public final int A(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final void B(Object obj, long j, i72 i72Var, gfc gfcVar, p85 p85Var) throws ya7.a {
        int iZ;
        this.k.getClass();
        o87 o87VarA = m78.a(j, obj);
        h72 h72Var = i72Var.a;
        int i = i72Var.b;
        if ((i & 7) != 3) {
            throw ya7.c();
        }
        do {
            v56 v56VarD = gfcVar.d();
            i72Var.b(v56VarD, gfcVar, p85Var);
            gfcVar.b(v56VarD);
            ((x0b) o87VarA).add(v56VarD);
            if (h72Var.c() || i72Var.d != 0) {
                return;
            } else {
                iZ = h72Var.z();
            }
        } while (iZ == i);
        i72Var.d = iZ;
    }

    public final void C(Object obj, int i, i72 i72Var, gfc gfcVar, p85 p85Var) throws ya7 {
        int iZ;
        this.k.getClass();
        o87 o87VarA = m78.a(i & 1048575, obj);
        h72 h72Var = i72Var.a;
        int i2 = i72Var.b;
        if ((i2 & 7) != 2) {
            throw ya7.c();
        }
        do {
            v56 v56VarD = gfcVar.d();
            i72Var.c(v56VarD, gfcVar, p85Var);
            gfcVar.b(v56VarD);
            ((x0b) o87VarA).add(v56VarD);
            if (h72Var.c() || i72Var.d != 0) {
                return;
            } else {
                iZ = h72Var.z();
            }
        } while (iZ == i2);
        i72Var.d = iZ;
    }

    public final void D(int i, i72 i72Var, Object obj) throws ya7.a {
        h72 h72Var = i72Var.a;
        if ((536870912 & i) != 0) {
            i72Var.w(2);
            xff.o(i & 1048575, obj, h72Var.y());
        } else if (!this.f) {
            xff.o(i & 1048575, obj, i72Var.e());
        } else {
            i72Var.w(2);
            xff.o(i & 1048575, obj, h72Var.x());
        }
    }

    public final void E(int i, i72 i72Var, Object obj) throws ya7.a {
        boolean z = (536870912 & i) != 0;
        m78 m78Var = this.k;
        if (z) {
            m78Var.getClass();
            i72Var.s(m78.a(i & 1048575, obj), true);
        } else {
            m78Var.getClass();
            i72Var.s(m78.a(i & 1048575, obj), false);
        }
    }

    public final void G(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        xff.m(j, obj, (1 << (i2 >>> 20)) | xff.f(j, obj));
    }

    public final void H(int i, Object obj, int i2) {
        xff.m(this.a[i2 + 2] & 1048575, obj, i);
    }

    public final int J(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // defpackage.gfc
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!p(obj)) {
            qc0.j(ks0.j(obj, "Mutating immutable message: "));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                lfc.k(this.l, obj, obj2);
                return;
            }
            int iJ = J(i);
            long j = 1048575 & iJ;
            int i2 = iArr[i];
            switch (I(iJ)) {
                case 0:
                    if (!o(i, obj2)) {
                        obj3 = obj;
                    } else {
                        vff vffVar = xff.c;
                        obj3 = obj;
                        vffVar.g(obj3, j, vffVar.c(j, obj2));
                        G(i, obj3);
                    }
                    break;
                case 1:
                    if (o(i, obj2)) {
                        vff vffVar2 = xff.c;
                        vffVar2.h(obj, j, vffVar2.d(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (o(i, obj2)) {
                        xff.n(j, obj, xff.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (o(i, obj2)) {
                        xff.n(j, obj, xff.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (o(i, obj2)) {
                        xff.m(j, obj, xff.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (o(i, obj2)) {
                        xff.n(j, obj, xff.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (o(i, obj2)) {
                        xff.m(j, obj, xff.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (o(i, obj2)) {
                        vff vffVar3 = xff.c;
                        vffVar3.e(obj, j, vffVar3.a(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (o(i, obj2)) {
                        xff.o(j, obj, xff.h(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    s(i, obj, obj2);
                    obj3 = obj;
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    if (o(i, obj2)) {
                        xff.o(j, obj, xff.h(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    if (o(i, obj2)) {
                        xff.m(j, obj, xff.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (o(i, obj2)) {
                        xff.m(j, obj, xff.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    if (o(i, obj2)) {
                        xff.m(j, obj, xff.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (o(i, obj2)) {
                        xff.n(j, obj, xff.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (o(i, obj2)) {
                        xff.m(j, obj, xff.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                    if (o(i, obj2)) {
                        xff.n(j, obj, xff.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    s(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case z7c.f /* 48 */:
                case 49:
                    this.k.getClass();
                    o87 o87VarD = (o87) xff.h(j, obj);
                    o87 o87Var = (o87) xff.h(j, obj2);
                    int i3 = ((x0b) o87VarD).c;
                    int i4 = ((x0b) o87Var).c;
                    if (i3 > 0 && i4 > 0) {
                        if (!((x0b) o87VarD).a) {
                            o87VarD = ((x0b) o87VarD).d(i4 + i3);
                        }
                        ((x0b) o87VarD).addAll(o87Var);
                    }
                    if (i3 > 0) {
                        o87Var = o87VarD;
                    }
                    xff.o(j, obj, o87Var);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = lfc.a;
                    Object objH = xff.h(j, obj);
                    Object objH2 = xff.h(j, obj2);
                    this.m.getClass();
                    xff.o(j, obj, tl8.a(objH, objH2));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (q(i2, obj2, i)) {
                        xff.o(j, obj, xff.h(j, obj2));
                        H(i2, obj, i);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    t(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (q(i2, obj2, i)) {
                        xff.o(j, obj, xff.h(j, obj2));
                        H(i2, obj, i);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    t(i, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:43:0x008e A[SYNTHETIC] */
    @Override // defpackage.gfc
    public final void b(Object obj) {
        if (p(obj)) {
            if (obj instanceof v56) {
                v56 v56Var = (v56) obj;
                v56Var.j(Integer.MAX_VALUE);
                v56Var.memoizedHashCode = 0;
                v56Var.g();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iJ = J(i);
                long j = 1048575 & iJ;
                int I = I(iJ);
                Unsafe unsafe = o;
                if (I != 9) {
                    if (I != 60 && I != 68) {
                        switch (I) {
                            case 17:
                                if (o(i, obj)) {
                                    m(i).b(unsafe.getObject(obj, j));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case z7c.f /* 48 */:
                            case 49:
                                this.k.getClass();
                                x0b x0bVar = (x0b) ((o87) xff.h(j, obj));
                                if (x0bVar.a) {
                                    x0bVar.a = false;
                                }
                                break;
                            case 50:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.m.getClass();
                                    ((rl8) object).d();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (q(iArr[i], obj, i)) {
                        m(i).b(unsafe.getObject(obj, j));
                    }
                } else if (o(i, obj)) {
                    m(i).b(unsafe.getObject(obj, j));
                }
            }
            ((eff) this.l).getClass();
            cff cffVar = ((v56) obj).unknownFields;
            if (cffVar.e) {
                cffVar.e = false;
            }
        }
    }

    @Override // defpackage.gfc
    public final boolean c(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.h) {
            int i6 = this.g[i5];
            int[] iArr = this.a;
            int i7 = iArr[i6];
            int iJ = J(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = o.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                int i11 = i4;
                i = i3;
                i2 = i11;
            }
            if ((268435456 & iJ) == 0 || n(i6, i, i2, i10, obj)) {
                int I = I(iJ);
                if (I != 9 && I != 17) {
                    if (I != 27) {
                        if (I == 60 || I == 68) {
                            if (!q(i7, obj, i6) || m(i6).c(xff.h(iJ & 1048575, obj))) {
                                i5++;
                                i3 = i;
                                i4 = i2;
                            }
                        } else if (I != 49) {
                            if (I != 50) {
                                continue;
                            } else {
                                Object objH = xff.h(iJ & 1048575, obj);
                                this.m.getClass();
                                rl8 rl8Var = (rl8) objH;
                                if (rl8Var.isEmpty()) {
                                    continue;
                                } else {
                                    if (((y9g) ((ml8) this.b[(i6 / 3) * 2]).a.c).a() != bag.MESSAGE) {
                                        continue;
                                    } else {
                                        gfc gfcVarA = null;
                                        for (Object obj2 : rl8Var.values()) {
                                            if (gfcVarA == null) {
                                                gfcVarA = v0b.c.a(obj2.getClass());
                                            }
                                            if (!gfcVarA.c(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) xff.h(iJ & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        gfc gfcVarM = m(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (gfcVarM.c(list.get(i12))) {
                            }
                        }
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                } else if (!n(i6, i, i2, i10, obj) || m(i6).c(xff.h(iJ & 1048575, obj))) {
                    i5++;
                    i3 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.gfc
    public final v56 d() {
        this.j.getClass();
        return ((v56) this.e).h();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    @Override // defpackage.gfc
    public final boolean e(v56 v56Var, v56 v56Var2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zL = true;
            if (i < length) {
                int iJ = J(i);
                long j = iJ & 1048575;
                switch (I(iJ)) {
                    case 0:
                        if (!j(v56Var, v56Var2, i)) {
                            zL = false;
                        } else {
                            vff vffVar = xff.c;
                            if (Double.doubleToLongBits(vffVar.c(j, v56Var)) != Double.doubleToLongBits(vffVar.c(j, v56Var2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 1:
                        if (!j(v56Var, v56Var2, i)) {
                            zL = false;
                        } else {
                            vff vffVar2 = xff.c;
                            if (Float.floatToIntBits(vffVar2.d(j, v56Var)) != Float.floatToIntBits(vffVar2.d(j, v56Var2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 2:
                        if (!j(v56Var, v56Var2, i) || xff.g(j, v56Var) != xff.g(j, v56Var2)) {
                            zL = false;
                        }
                        break;
                    case 3:
                        if (!j(v56Var, v56Var2, i) || xff.g(j, v56Var) != xff.g(j, v56Var2)) {
                            zL = false;
                        }
                        break;
                    case 4:
                        if (!j(v56Var, v56Var2, i) || xff.f(j, v56Var) != xff.f(j, v56Var2)) {
                            zL = false;
                        }
                        break;
                    case 5:
                        if (!j(v56Var, v56Var2, i) || xff.g(j, v56Var) != xff.g(j, v56Var2)) {
                            zL = false;
                        }
                        break;
                    case 6:
                        if (!j(v56Var, v56Var2, i) || xff.f(j, v56Var) != xff.f(j, v56Var2)) {
                            zL = false;
                        }
                        break;
                    case 7:
                        if (!j(v56Var, v56Var2, i)) {
                            zL = false;
                        } else {
                            vff vffVar3 = xff.c;
                            if (vffVar3.a(j, v56Var) != vffVar3.a(j, v56Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 8:
                        if (!j(v56Var, v56Var2, i) || !lfc.l(xff.h(j, v56Var), xff.h(j, v56Var2))) {
                            zL = false;
                        }
                        break;
                    case 9:
                        if (!j(v56Var, v56Var2, i) || !lfc.l(xff.h(j, v56Var), xff.h(j, v56Var2))) {
                            zL = false;
                        }
                        break;
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        if (!j(v56Var, v56Var2, i) || !lfc.l(xff.h(j, v56Var), xff.h(j, v56Var2))) {
                            zL = false;
                        }
                        break;
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        if (!j(v56Var, v56Var2, i) || xff.f(j, v56Var) != xff.f(j, v56Var2)) {
                            zL = false;
                        }
                        break;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        if (!j(v56Var, v56Var2, i) || xff.f(j, v56Var) != xff.f(j, v56Var2)) {
                            zL = false;
                        }
                        break;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        if (!j(v56Var, v56Var2, i) || xff.f(j, v56Var) != xff.f(j, v56Var2)) {
                            zL = false;
                        }
                        break;
                    case 14:
                        if (!j(v56Var, v56Var2, i) || xff.g(j, v56Var) != xff.g(j, v56Var2)) {
                            zL = false;
                        }
                        break;
                    case 15:
                        if (!j(v56Var, v56Var2, i) || xff.f(j, v56Var) != xff.f(j, v56Var2)) {
                            zL = false;
                        }
                        break;
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        if (!j(v56Var, v56Var2, i) || xff.g(j, v56Var) != xff.g(j, v56Var2)) {
                            zL = false;
                        }
                        break;
                    case 17:
                        if (!j(v56Var, v56Var2, i) || !lfc.l(xff.h(j, v56Var), xff.h(j, v56Var2))) {
                            zL = false;
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case z7c.f /* 48 */:
                    case 49:
                        zL = lfc.l(xff.h(j, v56Var), xff.h(j, v56Var2));
                        break;
                    case 50:
                        zL = lfc.l(xff.h(j, v56Var), xff.h(j, v56Var2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j2 = iArr[i + 2] & 1048575;
                        if (xff.f(j2, v56Var) != xff.f(j2, v56Var2) || !lfc.l(xff.h(j, v56Var), xff.h(j, v56Var2))) {
                            zL = false;
                        }
                        break;
                }
                if (zL) {
                    i += 3;
                }
            } else {
                eff effVar = (eff) this.l;
                effVar.getClass();
                cff cffVar = v56Var.unknownFields;
                effVar.getClass();
                if (cffVar.equals(v56Var2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:160:0x07ee A[Catch: all -> 0x04e0, TryCatch #0 {all -> 0x04e0, blocks: (B:158:0x07e9, B:160:0x07ee, B:161:0x07f3, B:114:0x04db, B:117:0x04e3, B:118:0x04fb, B:119:0x0513, B:120:0x052b, B:121:0x0543, B:122:0x055b, B:123:0x0573, B:124:0x058b, B:125:0x05a3, B:126:0x05cb, B:127:0x05e9, B:128:0x0607, B:129:0x0626, B:130:0x0645, B:131:0x0666, B:132:0x0684, B:133:0x069d, B:134:0x06c5, B:135:0x06d6, B:136:0x06f6, B:137:0x0715, B:138:0x0734, B:139:0x0752, B:140:0x0770, B:141:0x078d, B:142:0x07ad, B:148:0x07cd), top: B:179:0x07e9 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x07fd A[LOOP:2: B:164:0x07fb->B:165:0x07fd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:171:0x0814 A[LOOP:3: B:170:0x0812->B:171:0x0814, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x081e  */
    /* JADX WARN: Code duplicated, block: B:208:0x07f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.gfc
    public final void f(Object obj, i72 i72Var, p85 p85Var) throws Throwable {
        int[] iArr;
        int i;
        int i2;
        i72 i72Var2;
        p85 p85Var2;
        int i3;
        du8 du8Var = this;
        Object obj2 = obj;
        i72 i72Var3 = i72Var;
        p85 p85Var3 = p85Var;
        p85Var3.getClass();
        if (!p(obj2)) {
            qc0.j(ks0.j(obj2, "Mutating immutable message: "));
            return;
        }
        aff affVar = du8Var.l;
        int[] iArr2 = du8Var.g;
        int i4 = du8Var.i;
        int i5 = du8Var.h;
        cff cffVarA = null;
        while (true) {
            try {
                int iA = i72Var3.a();
                int iA2 = du8Var.A(iA);
                if (iA2 >= 0) {
                    int iJ = du8Var.J(iA2);
                    try {
                        try {
                            int I = I(iJ);
                            Unsafe unsafe = o;
                            m78 m78Var = du8Var.k;
                            switch (I) {
                                case 0:
                                    iArr = iArr2;
                                    i2 = i4;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    long jX = x(iJ);
                                    i72Var2.w(1);
                                    try {
                                        try {
                                            xff.c.g(obj, jX, i72Var2.a.m());
                                            obj2 = obj;
                                            du8Var.G(iA2, obj2);
                                        } catch (ya7.a unused) {
                                            obj2 = obj;
                                            try {
                                                affVar.getClass();
                                                if (cffVarA == null) {
                                                    cffVarA = affVar.a(obj2);
                                                }
                                                if (!affVar.b(0, i72Var2, cffVarA)) {
                                                    i3 = i2;
                                                    while (i5 < i3) {
                                                        du8Var.k(iArr[i5], obj2, cffVarA);
                                                        i5++;
                                                    }
                                                    if (cffVarA == null) {
                                                        return;
                                                    }
                                                    ((v56) obj2).unknownFields = cffVarA;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                i = i2;
                                                while (i5 < i) {
                                                    du8Var.k(iArr[i5], obj2, cffVarA);
                                                    i5++;
                                                }
                                                if (cffVarA != null) {
                                                    ((eff) affVar).getClass();
                                                    ((v56) obj2).unknownFields = cffVarA;
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            obj2 = obj;
                                            i = i2;
                                            while (i5 < i) {
                                                du8Var.k(iArr[i5], obj2, cffVarA);
                                                i5++;
                                            }
                                            if (cffVarA != null) {
                                                ((eff) affVar).getClass();
                                                ((v56) obj2).unknownFields = cffVarA;
                                            }
                                            throw th;
                                        }
                                    } catch (ya7.a unused2) {
                                        obj2 = obj;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        obj2 = obj;
                                    }
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 1:
                                    iArr = iArr2;
                                    i2 = i4;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    long jX2 = x(iJ);
                                    i72Var2.w(5);
                                    xff.c.h(obj2, jX2, i72Var2.a.q());
                                    du8Var.G(iA2, obj2);
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 2:
                                    iArr = iArr2;
                                    i2 = i4;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    long jX3 = x(iJ);
                                    i72Var2.w(0);
                                    xff.n(jX3, obj2, i72Var2.a.s());
                                    du8Var.G(iA2, obj2);
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 3:
                                    iArr = iArr2;
                                    i2 = i4;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    long jX4 = x(iJ);
                                    i72Var2.w(0);
                                    xff.n(jX4, obj2, i72Var2.a.B());
                                    du8Var.G(iA2, obj2);
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 4:
                                    iArr = iArr2;
                                    i2 = i4;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    long jX5 = x(iJ);
                                    i72Var2.w(0);
                                    xff.m(jX5, obj2, i72Var2.a.r());
                                    du8Var.G(iA2, obj2);
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 5:
                                    iArr = iArr2;
                                    i2 = i4;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    long jX6 = x(iJ);
                                    i72Var2.w(1);
                                    xff.n(jX6, obj2, i72Var2.a.p());
                                    du8Var.G(iA2, obj2);
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 6:
                                    iArr = iArr2;
                                    i2 = i4;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    long jX7 = x(iJ);
                                    i72Var2.w(5);
                                    xff.m(jX7, obj2, i72Var2.a.o());
                                    du8Var.G(iA2, obj2);
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 7:
                                    iArr = iArr2;
                                    i2 = i4;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    long jX8 = x(iJ);
                                    i72Var2.w(0);
                                    xff.c.e(obj2, jX8, i72Var2.a.k());
                                    du8Var.G(iA2, obj2);
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 8:
                                    iArr = iArr2;
                                    i2 = i4;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    du8Var.D(iJ, i72Var2, obj2);
                                    du8Var.G(iA2, obj2);
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 9:
                                    du8Var = du8Var;
                                    iArr = iArr2;
                                    i2 = i4;
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    vt8 vt8Var = (vt8) du8Var.u(iA2, obj2);
                                    gfc gfcVarM = du8Var.m(iA2);
                                    i72Var2.w(2);
                                    i72Var2.c(vt8Var, gfcVarM, p85Var2);
                                    unsafe.putObject(obj2, du8Var.J(iA2) & 1048575, vt8Var);
                                    du8Var.G(iA2, obj2);
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    xff.o(x(iJ), obj2, i72Var2.e());
                                    du8Var.G(iA2, obj2);
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    long jX9 = x(iJ);
                                    i72Var2.w(0);
                                    xff.m(jX9, obj2, i72Var2.a.A());
                                    du8Var.G(iA2, obj2);
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    i72Var2.w(0);
                                    int iN = i72Var2.a.n();
                                    du8Var.l(iA2);
                                    xff.m(x(iJ), obj2, iN);
                                    du8Var.G(iA2, obj2);
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    long jX10 = x(iJ);
                                    i72Var2.w(5);
                                    xff.m(jX10, obj2, i72Var2.a.t());
                                    du8Var.G(iA2, obj2);
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 14:
                                    iArr = iArr2;
                                    i2 = i4;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    long jX11 = x(iJ);
                                    i72Var2.w(1);
                                    xff.n(jX11, obj2, i72Var2.a.u());
                                    du8Var.G(iA2, obj2);
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 15:
                                    iArr = iArr2;
                                    i2 = i4;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    long jX12 = x(iJ);
                                    i72Var2.w(0);
                                    xff.m(jX12, obj2, i72Var2.a.v());
                                    du8Var.G(iA2, obj2);
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    long jX13 = x(iJ);
                                    i72Var2.w(0);
                                    xff.n(jX13, obj2, i72Var2.a.w());
                                    du8Var.G(iA2, obj2);
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 17:
                                    du8Var = du8Var;
                                    iArr = iArr2;
                                    i2 = i4;
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    vt8 vt8Var2 = (vt8) du8Var.u(iA2, obj2);
                                    gfc gfcVarM2 = du8Var.m(iA2);
                                    i72Var2.w(3);
                                    i72Var2.b(vt8Var2, gfcVarM2, p85Var2);
                                    unsafe.putObject(obj2, du8Var.J(iA2) & 1048575, vt8Var2);
                                    du8Var.G(iA2, obj2);
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 18:
                                    iArr = iArr2;
                                    i2 = i4;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    long jX14 = x(iJ);
                                    m78Var.getClass();
                                    i72Var2.g(m78.a(jX14, obj2));
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 19:
                                    iArr = iArr2;
                                    i2 = i4;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    long jX15 = x(iJ);
                                    m78Var.getClass();
                                    i72Var2.l(m78.a(jX15, obj2));
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 20:
                                    iArr = iArr2;
                                    i2 = i4;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    long jX16 = x(iJ);
                                    m78Var.getClass();
                                    i72Var2.n(m78.a(jX16, obj2));
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 21:
                                    iArr = iArr2;
                                    i2 = i4;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    long jX17 = x(iJ);
                                    m78Var.getClass();
                                    i72Var2.u(m78.a(jX17, obj2));
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 22:
                                    iArr = iArr2;
                                    i2 = i4;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    long jX18 = x(iJ);
                                    m78Var.getClass();
                                    i72Var2.m(m78.a(jX18, obj2));
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 23:
                                    iArr = iArr2;
                                    i2 = i4;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    long jX19 = x(iJ);
                                    m78Var.getClass();
                                    i72Var2.k(m78.a(jX19, obj2));
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 24:
                                    iArr = iArr2;
                                    i2 = i4;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    long jX20 = x(iJ);
                                    m78Var.getClass();
                                    i72Var2.j(m78.a(jX20, obj2));
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 25:
                                    iArr = iArr2;
                                    i2 = i4;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    long jX21 = x(iJ);
                                    m78Var.getClass();
                                    i72Var2.d(m78.a(jX21, obj2));
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 26:
                                    iArr = iArr2;
                                    i2 = i4;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    try {
                                        du8Var.E(iJ, i72Var2, obj2);
                                    } catch (ya7.a unused3) {
                                        affVar.getClass();
                                        if (cffVarA == null) {
                                            cffVarA = affVar.a(obj2);
                                        }
                                        if (!affVar.b(0, i72Var2, cffVarA)) {
                                            i3 = i2;
                                            while (i5 < i3) {
                                                du8Var.k(iArr[i5], obj2, cffVarA);
                                                i5++;
                                            }
                                            if (cffVarA == null) {
                                                return;
                                            }
                                            ((v56) obj2).unknownFields = cffVarA;
                                        }
                                    }
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 27:
                                    iArr = iArr2;
                                    i2 = i4;
                                    try {
                                        du8Var.C(obj2, iJ, i72Var3, du8Var.m(iA2), p85Var);
                                        i72Var2 = i72Var3;
                                        p85Var2 = p85Var;
                                        du8Var = du8Var;
                                    } catch (ya7.a unused4) {
                                        i72Var2 = i72Var3;
                                        p85Var2 = p85Var;
                                        du8Var = du8Var;
                                        affVar.getClass();
                                        if (cffVarA == null) {
                                            cffVarA = affVar.a(obj2);
                                        }
                                        if (!affVar.b(0, i72Var2, cffVarA)) {
                                            i3 = i2;
                                            while (i5 < i3) {
                                                du8Var.k(iArr[i5], obj2, cffVarA);
                                                i5++;
                                            }
                                            if (cffVarA == null) {
                                                return;
                                            }
                                            ((v56) obj2).unknownFields = cffVarA;
                                        }
                                    }
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 28:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX22 = x(iJ);
                                    m78Var.getClass();
                                    i72Var3.f(m78.a(jX22, obj2));
                                    p85Var2 = p85Var;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 29:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX23 = x(iJ);
                                    m78Var.getClass();
                                    i72Var3.t(m78.a(jX23, obj2));
                                    p85Var2 = p85Var;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 30:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX24 = x(iJ);
                                    m78Var.getClass();
                                    o87 o87VarA = m78.a(jX24, obj2);
                                    i72Var3.h(o87VarA);
                                    du8Var.l(iA2);
                                    lfc.j(obj2, iA, o87VarA, cffVarA, affVar);
                                    p85Var2 = p85Var;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 31:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX25 = x(iJ);
                                    m78Var.getClass();
                                    i72Var3.o(m78.a(jX25, obj2));
                                    p85Var2 = p85Var;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX26 = x(iJ);
                                    m78Var.getClass();
                                    i72Var3.p(m78.a(jX26, obj2));
                                    p85Var2 = p85Var;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 33:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX27 = x(iJ);
                                    m78Var.getClass();
                                    i72Var3.q(m78.a(jX27, obj2));
                                    p85Var2 = p85Var;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 34:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX28 = x(iJ);
                                    m78Var.getClass();
                                    i72Var3.r(m78.a(jX28, obj2));
                                    p85Var2 = p85Var;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 35:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX29 = x(iJ);
                                    m78Var.getClass();
                                    i72Var3.g(m78.a(jX29, obj2));
                                    p85Var2 = p85Var;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 36:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX30 = x(iJ);
                                    m78Var.getClass();
                                    i72Var3.l(m78.a(jX30, obj2));
                                    p85Var2 = p85Var;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 37:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX31 = x(iJ);
                                    m78Var.getClass();
                                    i72Var3.n(m78.a(jX31, obj2));
                                    p85Var2 = p85Var;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 38:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX32 = x(iJ);
                                    m78Var.getClass();
                                    i72Var3.u(m78.a(jX32, obj2));
                                    p85Var2 = p85Var;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 39:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX33 = x(iJ);
                                    m78Var.getClass();
                                    i72Var3.m(m78.a(jX33, obj2));
                                    p85Var2 = p85Var;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 40:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX34 = x(iJ);
                                    m78Var.getClass();
                                    i72Var3.k(m78.a(jX34, obj2));
                                    p85Var2 = p85Var;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 41:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX35 = x(iJ);
                                    m78Var.getClass();
                                    i72Var3.j(m78.a(jX35, obj2));
                                    p85Var2 = p85Var;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 42:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX36 = x(iJ);
                                    m78Var.getClass();
                                    i72Var3.d(m78.a(jX36, obj2));
                                    p85Var2 = p85Var;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 43:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX37 = x(iJ);
                                    m78Var.getClass();
                                    i72Var3.t(m78.a(jX37, obj2));
                                    p85Var2 = p85Var;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 44:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX38 = x(iJ);
                                    m78Var.getClass();
                                    o87 o87VarA2 = m78.a(jX38, obj2);
                                    i72Var3.h(o87VarA2);
                                    du8Var.l(iA2);
                                    lfc.j(obj2, iA, o87VarA2, cffVarA, affVar);
                                    p85Var2 = p85Var;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 45:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX39 = x(iJ);
                                    m78Var.getClass();
                                    i72Var3.o(m78.a(jX39, obj2));
                                    p85Var2 = p85Var;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 46:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX40 = x(iJ);
                                    m78Var.getClass();
                                    i72Var3.p(m78.a(jX40, obj2));
                                    p85Var2 = p85Var;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 47:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX41 = x(iJ);
                                    m78Var.getClass();
                                    i72Var3.q(m78.a(jX41, obj2));
                                    p85Var2 = p85Var;
                                    du8Var = du8Var;
                                    i72Var2 = i72Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case z7c.f /* 48 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    try {
                                        long jX42 = x(iJ);
                                        m78Var.getClass();
                                        i72Var3.r(m78.a(jX42, obj2));
                                        p85Var2 = p85Var;
                                        du8Var = du8Var;
                                        i72Var2 = i72Var3;
                                    } catch (ya7.a unused5) {
                                        p85Var2 = p85Var;
                                        du8Var = du8Var;
                                        i72Var2 = i72Var3;
                                        affVar.getClass();
                                        if (cffVarA == null) {
                                            cffVarA = affVar.a(obj2);
                                        }
                                        if (!affVar.b(0, i72Var2, cffVarA)) {
                                            i3 = i2;
                                            while (i5 < i3) {
                                                du8Var.k(iArr[i5], obj2, cffVarA);
                                                i5++;
                                            }
                                            if (cffVarA == null) {
                                                return;
                                            }
                                            ((v56) obj2).unknownFields = cffVarA;
                                        }
                                    }
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 49:
                                    iArr = iArr2;
                                    i2 = i4;
                                    obj2 = obj;
                                    try {
                                        du8Var.B(obj2, x(iJ), i72Var, du8Var.m(iA2), p85Var);
                                        i72Var3 = i72Var;
                                        p85Var2 = p85Var;
                                        du8Var = du8Var;
                                        i72Var2 = i72Var3;
                                    } catch (ya7.a unused6) {
                                        p85Var2 = p85Var;
                                        du8Var = du8Var;
                                        i72Var2 = i72Var;
                                        affVar.getClass();
                                        if (cffVarA == null) {
                                            cffVarA = affVar.a(obj2);
                                        }
                                        if (!affVar.b(0, i72Var2, cffVarA)) {
                                            i3 = i2;
                                            while (i5 < i3) {
                                                du8Var.k(iArr[i5], obj2, cffVarA);
                                                i5++;
                                            }
                                            if (cffVarA == null) {
                                                return;
                                            }
                                            ((v56) obj2).unknownFields = cffVarA;
                                        }
                                    }
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 50:
                                    iArr = iArr2;
                                    i2 = i4;
                                    try {
                                        du8Var.r(obj2, iA2, du8Var.b[(iA2 / 3) * 2], p85Var3, i72Var3);
                                        obj2 = obj;
                                        i72Var2 = i72Var;
                                        p85Var2 = p85Var;
                                        du8Var = du8Var;
                                    } catch (ya7.a unused7) {
                                        obj2 = obj;
                                        i72Var2 = i72Var;
                                        p85Var2 = p85Var;
                                        du8Var = du8Var;
                                        affVar.getClass();
                                        if (cffVarA == null) {
                                            cffVarA = affVar.a(obj2);
                                        }
                                        if (!affVar.b(0, i72Var2, cffVarA)) {
                                            i3 = i2;
                                            while (i5 < i3) {
                                                du8Var.k(iArr[i5], obj2, cffVarA);
                                                i5++;
                                            }
                                            if (cffVarA == null) {
                                                return;
                                            }
                                            ((v56) obj2).unknownFields = cffVarA;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        obj2 = obj;
                                        du8Var = du8Var;
                                        i = i2;
                                        while (i5 < i) {
                                            du8Var.k(iArr[i5], obj2, cffVarA);
                                            i5++;
                                        }
                                        if (cffVarA != null) {
                                            ((eff) affVar).getClass();
                                            ((v56) obj2).unknownFields = cffVarA;
                                        }
                                        throw th;
                                    }
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 51:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX43 = x(iJ);
                                    i72Var3.w(1);
                                    xff.o(jX43, obj2, Double.valueOf(i72Var3.a.m()));
                                    du8Var.H(iA, obj2, iA2);
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 52:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX44 = x(iJ);
                                    i72Var3.w(5);
                                    xff.o(jX44, obj2, Float.valueOf(i72Var3.a.q()));
                                    du8Var.H(iA, obj2, iA2);
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 53:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX45 = x(iJ);
                                    i72Var3.w(0);
                                    xff.o(jX45, obj2, Long.valueOf(i72Var3.a.s()));
                                    du8Var.H(iA, obj2, iA2);
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 54:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX46 = x(iJ);
                                    i72Var3.w(0);
                                    xff.o(jX46, obj2, Long.valueOf(i72Var3.a.B()));
                                    du8Var.H(iA, obj2, iA2);
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 55:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX47 = x(iJ);
                                    i72Var3.w(0);
                                    xff.o(jX47, obj2, Integer.valueOf(i72Var3.a.r()));
                                    du8Var.H(iA, obj2, iA2);
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 56:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX48 = x(iJ);
                                    i72Var3.w(1);
                                    xff.o(jX48, obj2, Long.valueOf(i72Var3.a.p()));
                                    du8Var.H(iA, obj2, iA2);
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 57:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX49 = x(iJ);
                                    i72Var3.w(5);
                                    xff.o(jX49, obj2, Integer.valueOf(i72Var3.a.o()));
                                    du8Var.H(iA, obj2, iA2);
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 58:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX50 = x(iJ);
                                    i72Var3.w(0);
                                    xff.o(jX50, obj2, Boolean.valueOf(i72Var3.a.k()));
                                    du8Var.H(iA, obj2, iA2);
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 59:
                                    iArr = iArr2;
                                    i2 = i4;
                                    du8Var.D(iJ, i72Var3, obj2);
                                    du8Var.H(iA, obj2, iA2);
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 60:
                                    iArr = iArr2;
                                    i2 = i4;
                                    vt8 vt8Var3 = (vt8) du8Var.v(iA, obj2, iA2);
                                    gfc gfcVarM3 = du8Var.m(iA2);
                                    i72Var3.w(2);
                                    i72Var3.c(vt8Var3, gfcVarM3, p85Var3);
                                    unsafe.putObject(obj2, du8Var.J(iA2) & 1048575, vt8Var3);
                                    du8Var.H(iA, obj2, iA2);
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 61:
                                    iArr = iArr2;
                                    i2 = i4;
                                    xff.o(x(iJ), obj2, i72Var3.e());
                                    du8Var.H(iA, obj2, iA2);
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 62:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX51 = x(iJ);
                                    i72Var3.w(0);
                                    xff.o(jX51, obj2, Integer.valueOf(i72Var3.a.A()));
                                    du8Var.H(iA, obj2, iA2);
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 63:
                                    iArr = iArr2;
                                    i2 = i4;
                                    i72Var3.w(0);
                                    int iN2 = i72Var3.a.n();
                                    du8Var.l(iA2);
                                    xff.o(x(iJ), obj2, Integer.valueOf(iN2));
                                    du8Var.H(iA, obj2, iA2);
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX52 = x(iJ);
                                    i72Var3.w(5);
                                    xff.o(jX52, obj2, Integer.valueOf(i72Var3.a.t()));
                                    du8Var.H(iA, obj2, iA2);
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 65:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX53 = x(iJ);
                                    i72Var3.w(1);
                                    xff.o(jX53, obj2, Long.valueOf(i72Var3.a.u()));
                                    du8Var.H(iA, obj2, iA2);
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 66:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX54 = x(iJ);
                                    i72Var3.w(0);
                                    xff.o(jX54, obj2, Integer.valueOf(i72Var3.a.v()));
                                    du8Var.H(iA, obj2, iA2);
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 67:
                                    iArr = iArr2;
                                    i2 = i4;
                                    long jX55 = x(iJ);
                                    i72Var3.w(0);
                                    xff.o(jX55, obj2, Long.valueOf(i72Var3.a.w()));
                                    du8Var.H(iA, obj2, iA2);
                                    i72Var2 = i72Var3;
                                    p85Var2 = p85Var3;
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                case 68:
                                    try {
                                        vt8 vt8Var4 = (vt8) du8Var.v(iA, obj2, iA2);
                                        gfc gfcVarM4 = du8Var.m(iA2);
                                        i72Var3.w(3);
                                        i72Var3.b(vt8Var4, gfcVarM4, p85Var3);
                                        iArr = iArr2;
                                        i2 = i4;
                                        try {
                                            try {
                                                unsafe.putObject(obj2, du8Var.J(iA2) & 1048575, vt8Var4);
                                                du8Var.H(iA, obj2, iA2);
                                                i72Var2 = i72Var3;
                                                p85Var2 = p85Var3;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                du8Var = du8Var;
                                                i = i2;
                                                while (i5 < i) {
                                                    du8Var.k(iArr[i5], obj2, cffVarA);
                                                    i5++;
                                                }
                                                if (cffVarA != null) {
                                                    ((eff) affVar).getClass();
                                                    ((v56) obj2).unknownFields = cffVarA;
                                                }
                                                throw th;
                                            }
                                        } catch (ya7.a unused8) {
                                            i72Var2 = i72Var3;
                                            p85Var2 = p85Var3;
                                            affVar.getClass();
                                            if (cffVarA == null) {
                                                cffVarA = affVar.a(obj2);
                                            }
                                            if (!affVar.b(0, i72Var2, cffVarA)) {
                                                i3 = i2;
                                                while (i5 < i3) {
                                                    du8Var.k(iArr[i5], obj2, cffVarA);
                                                    i5++;
                                                }
                                                if (cffVarA == null) {
                                                    return;
                                                }
                                                ((v56) obj2).unknownFields = cffVarA;
                                            }
                                        }
                                    } catch (ya7.a unused9) {
                                        iArr = iArr2;
                                        i2 = i4;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        iArr = iArr2;
                                        i2 = i4;
                                    }
                                    i72Var3 = i72Var2;
                                    p85Var3 = p85Var2;
                                    iArr2 = iArr;
                                    i4 = i2;
                                    du8Var = du8Var;
                                    break;
                                default:
                                    if (cffVarA == null) {
                                        cffVarA = affVar.a(obj2);
                                    }
                                    if (affVar.b(0, i72Var3, cffVarA)) {
                                        iArr = iArr2;
                                        i2 = i4;
                                        i72Var2 = i72Var3;
                                        p85Var2 = p85Var3;
                                        i72Var3 = i72Var2;
                                        p85Var3 = p85Var2;
                                        iArr2 = iArr;
                                        i4 = i2;
                                        du8Var = du8Var;
                                    } else {
                                        while (i5 < i4) {
                                            du8Var.k(iArr2[i5], obj2, cffVarA);
                                            i5++;
                                        }
                                        if (cffVarA == null) {
                                            return;
                                        }
                                    }
                                    break;
                            }
                        } catch (ya7.a unused10) {
                            iArr = iArr2;
                            i2 = i4;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        du8Var = du8Var;
                        iArr = iArr2;
                        i2 = i4;
                    }
                } else if (iA == Integer.MAX_VALUE) {
                    while (i5 < i4) {
                        du8Var.k(iArr2[i5], obj2, cffVarA);
                        i5++;
                    }
                    if (cffVarA == null) {
                        return;
                    } else {
                        ((eff) affVar).getClass();
                    }
                } else {
                    affVar.getClass();
                    if (cffVarA == null) {
                        cffVarA = affVar.a(obj2);
                    }
                    if (!affVar.b(0, i72Var3, cffVarA)) {
                        while (i5 < i4) {
                            du8Var.k(iArr2[i5], obj2, cffVarA);
                            i5++;
                        }
                        if (cffVarA == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th8) {
                th = th8;
                du8Var = du8Var;
                iArr = iArr2;
                i = i4;
            }
        }
        ((v56) obj2).unknownFields = cffVarA;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d7 A[PHI: r3
  0x00d7: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x01f0, B:41:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.gfc
    public final int g(v56 v56Var) {
        int i;
        int iB;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iJ = J(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iJ;
            int i6 = 1237;
            int iHashCode = 37;
            switch (I(iJ)) {
                case 0:
                    i = i3 * 53;
                    iB = r87.b(Double.doubleToLongBits(xff.c.c(j, v56Var)));
                    i3 = iB + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iB = Float.floatToIntBits(xff.c.d(j, v56Var));
                    i3 = iB + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iB = r87.b(xff.g(j, v56Var));
                    i3 = iB + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iB = r87.b(xff.g(j, v56Var));
                    i3 = iB + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iB = xff.f(j, v56Var);
                    i3 = iB + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iB = r87.b(xff.g(j, v56Var));
                    i3 = iB + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iB = xff.f(j, v56Var);
                    i3 = iB + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zA = xff.c.a(j, v56Var);
                    Charset charset = r87.a;
                    if (zA) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iB = ((String) xff.h(j, v56Var)).hashCode();
                    i3 = iB + i;
                    break;
                case 9:
                    Object objH = xff.h(j, v56Var);
                    if (objH != null) {
                        iHashCode = objH.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    i = i3 * 53;
                    iB = xff.h(j, v56Var).hashCode();
                    i3 = iB + i;
                    break;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    i = i3 * 53;
                    iB = xff.f(j, v56Var);
                    i3 = iB + i;
                    break;
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    i = i3 * 53;
                    iB = xff.f(j, v56Var);
                    i3 = iB + i;
                    break;
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    i = i3 * 53;
                    iB = xff.f(j, v56Var);
                    i3 = iB + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iB = r87.b(xff.g(j, v56Var));
                    i3 = iB + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iB = xff.f(j, v56Var);
                    i3 = iB + i;
                    break;
                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                    i = i3 * 53;
                    iB = r87.b(xff.g(j, v56Var));
                    i3 = iB + i;
                    break;
                case 17:
                    Object objH2 = xff.h(j, v56Var);
                    if (objH2 != null) {
                        iHashCode = objH2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case z7c.f /* 48 */:
                case 49:
                    i = i3 * 53;
                    iB = xff.h(j, v56Var).hashCode();
                    i3 = iB + i;
                    break;
                case 50:
                    i = i3 * 53;
                    iB = xff.h(j, v56Var).hashCode();
                    i3 = iB + i;
                    break;
                case 51:
                    if (q(i5, v56Var, i4)) {
                        i = i3 * 53;
                        iB = r87.b(Double.doubleToLongBits(((Double) xff.h(j, v56Var)).doubleValue()));
                        i3 = iB + i;
                    }
                    break;
                case 52:
                    if (q(i5, v56Var, i4)) {
                        i = i3 * 53;
                        iB = Float.floatToIntBits(((Float) xff.h(j, v56Var)).floatValue());
                        i3 = iB + i;
                    }
                    break;
                case 53:
                    if (q(i5, v56Var, i4)) {
                        i = i3 * 53;
                        iB = r87.b(z(j, v56Var));
                        i3 = iB + i;
                    }
                    break;
                case 54:
                    if (q(i5, v56Var, i4)) {
                        i = i3 * 53;
                        iB = r87.b(z(j, v56Var));
                        i3 = iB + i;
                    }
                    break;
                case 55:
                    if (q(i5, v56Var, i4)) {
                        i = i3 * 53;
                        iB = y(j, v56Var);
                        i3 = iB + i;
                    }
                    break;
                case 56:
                    if (q(i5, v56Var, i4)) {
                        i = i3 * 53;
                        iB = r87.b(z(j, v56Var));
                        i3 = iB + i;
                    }
                    break;
                case 57:
                    if (q(i5, v56Var, i4)) {
                        i = i3 * 53;
                        iB = y(j, v56Var);
                        i3 = iB + i;
                    }
                    break;
                case 58:
                    if (q(i5, v56Var, i4)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) xff.h(j, v56Var)).booleanValue();
                        Charset charset2 = r87.a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (q(i5, v56Var, i4)) {
                        i = i3 * 53;
                        iB = ((String) xff.h(j, v56Var)).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 60:
                    if (q(i5, v56Var, i4)) {
                        i = i3 * 53;
                        iB = xff.h(j, v56Var).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 61:
                    if (q(i5, v56Var, i4)) {
                        i = i3 * 53;
                        iB = xff.h(j, v56Var).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 62:
                    if (q(i5, v56Var, i4)) {
                        i = i3 * 53;
                        iB = y(j, v56Var);
                        i3 = iB + i;
                    }
                    break;
                case 63:
                    if (q(i5, v56Var, i4)) {
                        i = i3 * 53;
                        iB = y(j, v56Var);
                        i3 = iB + i;
                    }
                    break;
                case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                    if (q(i5, v56Var, i4)) {
                        i = i3 * 53;
                        iB = y(j, v56Var);
                        i3 = iB + i;
                    }
                    break;
                case 65:
                    if (q(i5, v56Var, i4)) {
                        i = i3 * 53;
                        iB = r87.b(z(j, v56Var));
                        i3 = iB + i;
                    }
                    break;
                case 66:
                    if (q(i5, v56Var, i4)) {
                        i = i3 * 53;
                        iB = y(j, v56Var);
                        i3 = iB + i;
                    }
                    break;
                case 67:
                    if (q(i5, v56Var, i4)) {
                        i = i3 * 53;
                        iB = r87.b(z(j, v56Var));
                        i3 = iB + i;
                    }
                    break;
                case 68:
                    if (q(i5, v56Var, i4)) {
                        i = i3 * 53;
                        iB = xff.h(j, v56Var).hashCode();
                        i3 = iB + i;
                    }
                    break;
            }
        }
        ((eff) this.l).getClass();
        return v56Var.unknownFields.hashCode() + (i3 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:88:0x01d6  */
    @Override // defpackage.gfc
    public final int h(v56 v56Var) {
        int i;
        int iH;
        int iH2;
        int iH3;
        int iJ;
        int iH4;
        int iJ2;
        int iH5;
        int iH6;
        int iH7;
        int iA;
        int i2;
        int iF;
        int iH8;
        int iA2;
        int iC;
        int iH9;
        int size;
        int i3;
        int iH10;
        int iH11;
        int size2;
        int iH12;
        int i4;
        int iA3;
        int iH13;
        int iH14;
        int iJ3;
        int iH15;
        int iJ4;
        int i5;
        du8 du8Var = this;
        v56 v56Var2 = v56Var;
        int i6 = 0;
        int i7 = 0;
        int iF2 = 0;
        int i8 = 1048575;
        while (true) {
            int[] iArr = du8Var.a;
            if (i6 >= iArr.length) {
                ((eff) du8Var.l).getClass();
                return v56Var2.unknownFields.b() + iF2;
            }
            int iJ5 = du8Var.J(i6);
            int I = I(iJ5);
            int i9 = iArr[i6];
            int i10 = iArr[i6 + 2];
            int i11 = i10 & 1048575;
            Unsafe unsafe = o;
            if (I <= 17) {
                if (i11 != i8) {
                    i7 = i11 == 1048575 ? 0 : unsafe.getInt(v56Var2, i11);
                    i8 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            long j = iJ5 & 1048575;
            if (I >= cd5.a.a()) {
                cd5.b.a();
            }
            switch (I) {
                case 0:
                    if (du8Var.n(i6, i8, i7, i, v56Var2)) {
                        iH = m72.h(i9);
                        iC = iH + 8;
                        iF2 += iC;
                    }
                    break;
                case 1:
                    if (du8Var.n(i6, i8, i7, i, v56Var2)) {
                        iH2 = m72.h(i9);
                        iH6 = iH2 + 4;
                        iF2 += iH6;
                    }
                    du8Var = this;
                    v56Var2 = v56Var;
                    break;
                case 2:
                    if (du8Var.n(i6, i8, i7, i, v56Var2)) {
                        long j2 = unsafe.getLong(v56Var2, j);
                        iH3 = m72.h(i9);
                        iJ = m72.j(j2);
                        iF2 += iJ + iH3;
                    }
                    du8Var = this;
                    break;
                case 3:
                    if (du8Var.n(i6, i8, i7, i, v56Var2)) {
                        long j3 = unsafe.getLong(v56Var2, j);
                        iH3 = m72.h(i9);
                        iJ = m72.j(j3);
                        iF2 += iJ + iH3;
                    }
                    du8Var = this;
                    break;
                case 4:
                    if (du8Var.n(i6, i8, i7, i, v56Var2)) {
                        int i12 = unsafe.getInt(v56Var2, j);
                        iH4 = m72.h(i9);
                        iJ2 = m72.j(i12);
                        iF = iJ2 + iH4;
                        iF2 += iF;
                    }
                    du8Var = this;
                    break;
                case 5:
                    if (du8Var.n(i6, i8, i7, i, v56Var2)) {
                        iH5 = m72.h(i9);
                        iH6 = iH5 + 8;
                        iF2 += iH6;
                    }
                    du8Var = this;
                    v56Var2 = v56Var;
                    break;
                case 6:
                    if (du8Var.n(i6, i8, i7, i, v56Var2)) {
                        iH2 = m72.h(i9);
                        iH6 = iH2 + 4;
                        iF2 += iH6;
                    }
                    du8Var = this;
                    v56Var2 = v56Var;
                    break;
                case 7:
                    if (du8Var.n(i6, i8, i7, i, v56Var2)) {
                        iH6 = m72.h(i9) + 1;
                        iF2 += iH6;
                    }
                    du8Var = this;
                    v56Var2 = v56Var;
                    break;
                case 8:
                    if (du8Var.n(i6, i8, i7, i, v56Var2)) {
                        Object object = unsafe.getObject(v56Var2, j);
                        iF2 = (object instanceof b71 ? m72.f(i9, (b71) object) : m72.g((String) object) + m72.h(i9)) + iF2;
                    }
                    du8Var = this;
                    break;
                case 9:
                    if (du8Var.n(i6, i8, i7, i, v56Var2)) {
                        Object object2 = unsafe.getObject(v56Var2, j);
                        gfc gfcVarM = du8Var.m(i6);
                        Class cls = lfc.a;
                        iH7 = m72.h(i9);
                        iA = ((j3) ((vt8) object2)).a(gfcVarM);
                        i2 = m72.i(iA);
                        i5 = i2 + iA + iH7;
                        iF2 += i5;
                    }
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    if (du8Var.n(i6, i8, i7, i, v56Var2)) {
                        iF = m72.f(i9, (b71) unsafe.getObject(v56Var2, j));
                        iF2 += iF;
                    }
                    du8Var = this;
                    break;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    if (du8Var.n(i6, i8, i7, i, v56Var2)) {
                        int i13 = unsafe.getInt(v56Var2, j);
                        iH4 = m72.h(i9);
                        iJ2 = m72.i(i13);
                        iF = iJ2 + iH4;
                        iF2 += iF;
                    }
                    du8Var = this;
                    break;
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (du8Var.n(i6, i8, i7, i, v56Var2)) {
                        int i14 = unsafe.getInt(v56Var2, j);
                        iH4 = m72.h(i9);
                        iJ2 = m72.j(i14);
                        iF = iJ2 + iH4;
                        iF2 += iF;
                    }
                    du8Var = this;
                    break;
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    if (du8Var.n(i6, i8, i7, i, v56Var2)) {
                        iH2 = m72.h(i9);
                        iH6 = iH2 + 4;
                        iF2 += iH6;
                    }
                    du8Var = this;
                    v56Var2 = v56Var;
                    break;
                case 14:
                    if (du8Var.n(i6, i8, i7, i, v56Var2)) {
                        iH5 = m72.h(i9);
                        iH6 = iH5 + 8;
                        iF2 += iH6;
                    }
                    du8Var = this;
                    v56Var2 = v56Var;
                    break;
                case 15:
                    if (du8Var.n(i6, i8, i7, i, v56Var2)) {
                        int i15 = unsafe.getInt(v56Var2, j);
                        iH4 = m72.h(i9);
                        iJ2 = m72.i((i15 >> 31) ^ (i15 << 1));
                        iF = iJ2 + iH4;
                        iF2 += iF;
                    }
                    du8Var = this;
                    break;
                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                    if (du8Var.n(i6, i8, i7, i, v56Var2)) {
                        long j4 = unsafe.getLong(v56Var2, j);
                        iH3 = m72.h(i9);
                        iJ = m72.j((j4 << 1) ^ (j4 >> 63));
                        iF2 += iJ + iH3;
                    }
                    du8Var = this;
                    break;
                case 17:
                    if (du8Var.n(i6, i8, i7, i, v56Var2)) {
                        vt8 vt8Var = (vt8) unsafe.getObject(v56Var2, j);
                        gfc gfcVarM2 = du8Var.m(i6);
                        iH8 = m72.h(i9) * 2;
                        iA2 = ((j3) vt8Var).a(gfcVarM2);
                        iC = iA2 + iH8;
                        iF2 += iC;
                    }
                    break;
                case 18:
                    iC = lfc.c(i9, (List) unsafe.getObject(v56Var2, j));
                    iF2 += iC;
                    break;
                case 19:
                    iC = lfc.b(i9, (List) unsafe.getObject(v56Var2, j));
                    iF2 += iC;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(v56Var2, j);
                    Class cls2 = lfc.a;
                    if (list.size() == 0) {
                        iH9 = 0;
                    } else {
                        iH9 = (m72.h(i9) * list.size()) + lfc.e(list);
                    }
                    iF2 += iH9;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(v56Var2, j);
                    Class cls3 = lfc.a;
                    size = list2.size();
                    if (size == 0) {
                        iH9 = 0;
                    } else {
                        i3 = lfc.i(list2);
                        iH10 = m72.h(i9);
                        iH9 = (iH10 * size) + i3;
                    }
                    iF2 += iH9;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(v56Var2, j);
                    Class cls4 = lfc.a;
                    size = list3.size();
                    if (size == 0) {
                        iH9 = 0;
                    } else {
                        i3 = lfc.d(list3);
                        iH10 = m72.h(i9);
                        iH9 = (iH10 * size) + i3;
                    }
                    iF2 += iH9;
                    break;
                case 23:
                    iC = lfc.c(i9, (List) unsafe.getObject(v56Var2, j));
                    iF2 += iC;
                    break;
                case 24:
                    iC = lfc.b(i9, (List) unsafe.getObject(v56Var2, j));
                    iF2 += iC;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(v56Var2, j);
                    Class cls5 = lfc.a;
                    int size3 = list4.size();
                    iF2 += size3 == 0 ? 0 : (m72.h(i9) + 1) * size3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(v56Var2, j);
                    Class cls6 = lfc.a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iH9 = 0;
                    } else {
                        iH9 = m72.h(i9) * size4;
                        for (int i16 = 0; i16 < size4; i16++) {
                            Object obj = list5.get(i16);
                            if (obj instanceof b71) {
                                int size5 = ((b71) obj).size();
                                iH9 = m72.i(size5) + size5 + iH9;
                            } else {
                                iH9 = m72.g((String) obj) + iH9;
                            }
                        }
                    }
                    iF2 += iH9;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(v56Var2, j);
                    gfc gfcVarM3 = du8Var.m(i6);
                    Class cls7 = lfc.a;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iH11 = 0;
                    } else {
                        iH11 = m72.h(i9) * size6;
                        for (int i17 = 0; i17 < size6; i17++) {
                            int iA4 = ((j3) ((vt8) list6.get(i17))).a(gfcVarM3);
                            iH11 += m72.i(iA4) + iA4;
                        }
                    }
                    iF2 += iH11;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(v56Var2, j);
                    Class cls8 = lfc.a;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iH9 = 0;
                    } else {
                        iH9 = m72.h(i9) * size7;
                        for (int i18 = 0; i18 < list7.size(); i18++) {
                            int size8 = ((b71) list7.get(i18)).size();
                            iH9 += m72.i(size8) + size8;
                        }
                    }
                    iF2 += iH9;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(v56Var2, j);
                    Class cls9 = lfc.a;
                    size = list8.size();
                    if (size == 0) {
                        iH9 = 0;
                    } else {
                        i3 = lfc.h(list8);
                        iH10 = m72.h(i9);
                        iH9 = (iH10 * size) + i3;
                    }
                    iF2 += iH9;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(v56Var2, j);
                    Class cls10 = lfc.a;
                    size = list9.size();
                    if (size == 0) {
                        iH9 = 0;
                    } else {
                        i3 = lfc.a(list9);
                        iH10 = m72.h(i9);
                        iH9 = (iH10 * size) + i3;
                    }
                    iF2 += iH9;
                    break;
                case 31:
                    iC = lfc.b(i9, (List) unsafe.getObject(v56Var2, j));
                    iF2 += iC;
                    break;
                case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                    iC = lfc.c(i9, (List) unsafe.getObject(v56Var2, j));
                    iF2 += iC;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(v56Var2, j);
                    Class cls11 = lfc.a;
                    size = list10.size();
                    if (size == 0) {
                        iH9 = 0;
                    } else {
                        i3 = lfc.f(list10);
                        iH10 = m72.h(i9);
                        iH9 = (iH10 * size) + i3;
                    }
                    iF2 += iH9;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(v56Var2, j);
                    Class cls12 = lfc.a;
                    size = list11.size();
                    if (size == 0) {
                        iH9 = 0;
                    } else {
                        i3 = lfc.g(list11);
                        iH10 = m72.h(i9);
                        iH9 = (iH10 * size) + i3;
                    }
                    iF2 += iH9;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(v56Var2, j);
                    Class cls13 = lfc.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iH12 = m72.h(i9);
                        i4 = m72.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(v56Var2, j);
                    Class cls14 = lfc.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iH12 = m72.h(i9);
                        i4 = m72.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 37:
                    size2 = lfc.e((List) unsafe.getObject(v56Var2, j));
                    if (size2 > 0) {
                        iH12 = m72.h(i9);
                        i4 = m72.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 38:
                    size2 = lfc.i((List) unsafe.getObject(v56Var2, j));
                    if (size2 > 0) {
                        iH12 = m72.h(i9);
                        i4 = m72.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 39:
                    size2 = lfc.d((List) unsafe.getObject(v56Var2, j));
                    if (size2 > 0) {
                        iH12 = m72.h(i9);
                        i4 = m72.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(v56Var2, j);
                    Class cls15 = lfc.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iH12 = m72.h(i9);
                        i4 = m72.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(v56Var2, j);
                    Class cls16 = lfc.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iH12 = m72.h(i9);
                        i4 = m72.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(v56Var2, j);
                    Class cls17 = lfc.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iH12 = m72.h(i9);
                        i4 = m72.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 43:
                    size2 = lfc.h((List) unsafe.getObject(v56Var2, j));
                    if (size2 > 0) {
                        iH12 = m72.h(i9);
                        i4 = m72.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 44:
                    size2 = lfc.a((List) unsafe.getObject(v56Var2, j));
                    if (size2 > 0) {
                        iH12 = m72.h(i9);
                        i4 = m72.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(v56Var2, j);
                    Class cls18 = lfc.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iH12 = m72.h(i9);
                        i4 = m72.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(v56Var2, j);
                    Class cls19 = lfc.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iH12 = m72.h(i9);
                        i4 = m72.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 47:
                    size2 = lfc.f((List) unsafe.getObject(v56Var2, j));
                    if (size2 > 0) {
                        iH12 = m72.h(i9);
                        i4 = m72.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case z7c.f /* 48 */:
                    size2 = lfc.g((List) unsafe.getObject(v56Var2, j));
                    if (size2 > 0) {
                        iH12 = m72.h(i9);
                        i4 = m72.i(size2);
                        iF2 += i4 + iH12 + size2;
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(v56Var2, j);
                    gfc gfcVarM4 = du8Var.m(i6);
                    Class cls20 = lfc.a;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        iA3 = 0;
                    } else {
                        iA3 = 0;
                        for (int i19 = 0; i19 < size9; i19++) {
                            iA3 += ((j3) ((vt8) list19.get(i19))).a(gfcVarM4) + (m72.h(i9) * 2);
                        }
                    }
                    iF2 += iA3;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(v56Var2, j);
                    Object obj2 = du8Var.b[(i6 / 3) * 2];
                    du8Var.m.getClass();
                    rl8 rl8Var = (rl8) object3;
                    ml8 ml8Var = (ml8) obj2;
                    if (rl8Var.isEmpty()) {
                        iH9 = 0;
                    } else {
                        iH9 = 0;
                        for (Map.Entry entry : rl8Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            ml8Var.getClass();
                            int iH16 = m72.h(i9);
                            int iA5 = ml8.a(ml8Var.a, key, value);
                            iH9 += m72.i(iA5) + iA5 + iH16;
                        }
                    }
                    iF2 += iH9;
                    break;
                case 51:
                    if (du8Var.q(i9, v56Var2, i6)) {
                        iH = m72.h(i9);
                        iC = iH + 8;
                        iF2 += iC;
                    }
                    break;
                case 52:
                    if (du8Var.q(i9, v56Var2, i6)) {
                        iH13 = m72.h(i9);
                        iC = iH13 + 4;
                        iF2 += iC;
                    }
                    break;
                case 53:
                    if (du8Var.q(i9, v56Var2, i6)) {
                        long jZ = z(j, v56Var2);
                        iH14 = m72.h(i9);
                        iJ3 = m72.j(jZ);
                        i5 = iJ3 + iH14;
                        iF2 += i5;
                    }
                    break;
                case 54:
                    if (du8Var.q(i9, v56Var2, i6)) {
                        long jZ2 = z(j, v56Var2);
                        iH14 = m72.h(i9);
                        iJ3 = m72.j(jZ2);
                        i5 = iJ3 + iH14;
                        iF2 += i5;
                    }
                    break;
                case 55:
                    if (du8Var.q(i9, v56Var2, i6)) {
                        int iY = y(j, v56Var2);
                        iH15 = m72.h(i9);
                        iJ4 = m72.j(iY);
                        iC = iJ4 + iH15;
                        iF2 += iC;
                    }
                    break;
                case 56:
                    if (du8Var.q(i9, v56Var2, i6)) {
                        iH = m72.h(i9);
                        iC = iH + 8;
                        iF2 += iC;
                    }
                    break;
                case 57:
                    if (du8Var.q(i9, v56Var2, i6)) {
                        iH13 = m72.h(i9);
                        iC = iH13 + 4;
                        iF2 += iC;
                    }
                    break;
                case 58:
                    if (du8Var.q(i9, v56Var2, i6)) {
                        iC = m72.h(i9) + 1;
                        iF2 += iC;
                    }
                    break;
                case 59:
                    if (du8Var.q(i9, v56Var2, i6)) {
                        Object object4 = unsafe.getObject(v56Var2, j);
                        iF2 = (object4 instanceof b71 ? m72.f(i9, (b71) object4) : m72.g((String) object4) + m72.h(i9)) + iF2;
                    }
                    break;
                case 60:
                    if (du8Var.q(i9, v56Var2, i6)) {
                        Object object5 = unsafe.getObject(v56Var2, j);
                        gfc gfcVarM5 = du8Var.m(i6);
                        Class cls21 = lfc.a;
                        iH7 = m72.h(i9);
                        iA = ((j3) ((vt8) object5)).a(gfcVarM5);
                        i2 = m72.i(iA);
                        i5 = i2 + iA + iH7;
                        iF2 += i5;
                    }
                    break;
                case 61:
                    if (du8Var.q(i9, v56Var2, i6)) {
                        iC = m72.f(i9, (b71) unsafe.getObject(v56Var2, j));
                        iF2 += iC;
                    }
                    break;
                case 62:
                    if (du8Var.q(i9, v56Var2, i6)) {
                        int iY2 = y(j, v56Var2);
                        iH15 = m72.h(i9);
                        iJ4 = m72.i(iY2);
                        iC = iJ4 + iH15;
                        iF2 += iC;
                    }
                    break;
                case 63:
                    if (du8Var.q(i9, v56Var2, i6)) {
                        int iY3 = y(j, v56Var2);
                        iH15 = m72.h(i9);
                        iJ4 = m72.j(iY3);
                        iC = iJ4 + iH15;
                        iF2 += iC;
                    }
                    break;
                case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                    if (du8Var.q(i9, v56Var2, i6)) {
                        iH13 = m72.h(i9);
                        iC = iH13 + 4;
                        iF2 += iC;
                    }
                    break;
                case 65:
                    if (du8Var.q(i9, v56Var2, i6)) {
                        iH = m72.h(i9);
                        iC = iH + 8;
                        iF2 += iC;
                    }
                    break;
                case 66:
                    if (du8Var.q(i9, v56Var2, i6)) {
                        int iY4 = y(j, v56Var2);
                        iH15 = m72.h(i9);
                        iJ4 = m72.i((iY4 >> 31) ^ (iY4 << 1));
                        iC = iJ4 + iH15;
                        iF2 += iC;
                    }
                    break;
                case 67:
                    if (du8Var.q(i9, v56Var2, i6)) {
                        long jZ3 = z(j, v56Var2);
                        iH14 = m72.h(i9);
                        iJ3 = m72.j((jZ3 << 1) ^ (jZ3 >> 63));
                        i5 = iJ3 + iH14;
                        iF2 += i5;
                    }
                    break;
                case 68:
                    if (du8Var.q(i9, v56Var2, i6)) {
                        vt8 vt8Var2 = (vt8) unsafe.getObject(v56Var2, j);
                        gfc gfcVarM6 = du8Var.m(i6);
                        iH8 = m72.h(i9) * 2;
                        iA2 = ((j3) vt8Var2).a(gfcVarM6);
                        iC = iA2 + iH8;
                        iF2 += iC;
                    }
                    break;
            }
            i6 += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gfc
    public final void i(Object obj, kd9 kd9Var) throws IOException {
        int i;
        int i2;
        boolean z;
        du8 du8Var = this;
        kd9Var.getClass();
        m72 m72Var = (m72) kd9Var.b;
        int[] iArr = du8Var.a;
        int length = iArr.length;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int iJ = du8Var.J(i5);
            int i7 = iArr[i5];
            int I = I(iJ);
            Unsafe unsafe = o;
            if (I <= 17) {
                int i8 = iArr[i5 + 2];
                i = 1;
                int i9 = i8 & i3;
                if (i9 != i4) {
                    i6 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
                    i4 = i9;
                }
                i2 = 1 << (i8 >>> 20);
            } else {
                i = 1;
                i2 = 0;
            }
            long j = iJ & i3;
            switch (I) {
                case 0:
                    if (du8Var.n(i5, i4, i6, i2, obj)) {
                        m72Var.t(i7, Double.doubleToRawLongBits(xff.c.c(j, obj)));
                    }
                    break;
                case 1:
                    if (du8Var.n(i5, i4, i6, i2, obj)) {
                        m72Var.r(i7, Float.floatToRawIntBits(xff.c.d(j, obj)));
                    }
                    du8Var = this;
                    break;
                case 2:
                    if (du8Var.n(i5, i4, i6, i2, obj)) {
                        m72Var.E(i7, unsafe.getLong(obj, j));
                    }
                    du8Var = this;
                    break;
                case 3:
                    if (du8Var.n(i5, i4, i6, i2, obj)) {
                        m72Var.E(i7, unsafe.getLong(obj, j));
                    }
                    du8Var = this;
                    break;
                case 4:
                    if (du8Var.n(i5, i4, i6, i2, obj)) {
                        m72Var.v(i7, unsafe.getInt(obj, j));
                    }
                    du8Var = this;
                    break;
                case 5:
                    if (du8Var.n(i5, i4, i6, i2, obj)) {
                        m72Var.t(i7, unsafe.getLong(obj, j));
                    }
                    du8Var = this;
                    break;
                case 6:
                    if (du8Var.n(i5, i4, i6, i2, obj)) {
                        m72Var.r(i7, unsafe.getInt(obj, j));
                    }
                    du8Var = this;
                    break;
                case 7:
                    if (du8Var.n(i5, i4, i6, i2, obj)) {
                        m72Var.o(i7, xff.c.a(j, obj));
                    }
                    du8Var = this;
                    break;
                case 8:
                    if (du8Var.n(i5, i4, i6, i2, obj)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            m72Var.z(i7, (String) object);
                        } else {
                            m72Var.p(i7, (b71) object);
                        }
                    }
                    du8Var = this;
                    break;
                case 9:
                    if (du8Var.n(i5, i4, i6, i2, obj)) {
                        m72Var.y(i7, (vt8) unsafe.getObject(obj, j), du8Var.m(i5));
                    }
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    if (du8Var.n(i5, i4, i6, i2, obj)) {
                        m72Var.p(i7, (b71) unsafe.getObject(obj, j));
                    }
                    du8Var = this;
                    break;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    if (du8Var.n(i5, i4, i6, i2, obj)) {
                        m72Var.C(i7, unsafe.getInt(obj, j));
                    }
                    du8Var = this;
                    break;
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (du8Var.n(i5, i4, i6, i2, obj)) {
                        m72Var.v(i7, unsafe.getInt(obj, j));
                    }
                    du8Var = this;
                    break;
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    if (du8Var.n(i5, i4, i6, i2, obj)) {
                        m72Var.r(i7, unsafe.getInt(obj, j));
                    }
                    du8Var = this;
                    break;
                case 14:
                    if (du8Var.n(i5, i4, i6, i2, obj)) {
                        m72Var.t(i7, unsafe.getLong(obj, j));
                    }
                    du8Var = this;
                    break;
                case 15:
                    if (du8Var.n(i5, i4, i6, i2, obj)) {
                        int i10 = unsafe.getInt(obj, j);
                        m72Var.C(i7, (i10 >> 31) ^ (i10 << 1));
                    }
                    du8Var = this;
                    break;
                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                    if (du8Var.n(i5, i4, i6, i2, obj)) {
                        long j2 = unsafe.getLong(obj, j);
                        m72Var.E(i7, (j2 >> 63) ^ (j2 << 1));
                    }
                    du8Var = this;
                    break;
                case 17:
                    if (du8Var.n(i5, i4, i6, i2, obj)) {
                        kd9Var.N(i7, unsafe.getObject(obj, j), du8Var.m(i5));
                    }
                    break;
                case 18:
                    lfc.n(iArr[i5], (List) unsafe.getObject(obj, j), kd9Var, false);
                    break;
                case 19:
                    lfc.r(iArr[i5], (List) unsafe.getObject(obj, j), kd9Var, false);
                    break;
                case 20:
                    lfc.t(iArr[i5], (List) unsafe.getObject(obj, j), kd9Var, false);
                    break;
                case 21:
                    lfc.z(iArr[i5], (List) unsafe.getObject(obj, j), kd9Var, false);
                    break;
                case 22:
                    lfc.s(iArr[i5], (List) unsafe.getObject(obj, j), kd9Var, false);
                    break;
                case 23:
                    lfc.q(iArr[i5], (List) unsafe.getObject(obj, j), kd9Var, false);
                    break;
                case 24:
                    lfc.p(iArr[i5], (List) unsafe.getObject(obj, j), kd9Var, false);
                    break;
                case 25:
                    lfc.m(iArr[i5], (List) unsafe.getObject(obj, j), kd9Var, false);
                    break;
                case 26:
                    int i11 = iArr[i5];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = lfc.a;
                    if (list != null && !list.isEmpty()) {
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            m72Var.z(i11, (String) list.get(i12));
                        }
                    }
                    break;
                case 27:
                    int i13 = iArr[i5];
                    List list2 = (List) unsafe.getObject(obj, j);
                    gfc gfcVarM = du8Var.m(i5);
                    Class cls2 = lfc.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i14 = 0; i14 < list2.size(); i14++) {
                            m72Var.y(i13, (vt8) list2.get(i14), gfcVarM);
                        }
                    }
                    break;
                case 28:
                    int i15 = iArr[i5];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = lfc.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i16 = 0; i16 < list3.size(); i16++) {
                            m72Var.p(i15, (b71) list3.get(i16));
                        }
                    }
                    break;
                case 29:
                    z = false;
                    lfc.y(iArr[i5], (List) unsafe.getObject(obj, j), kd9Var, false);
                    break;
                case 30:
                    z = false;
                    lfc.o(iArr[i5], (List) unsafe.getObject(obj, j), kd9Var, false);
                    break;
                case 31:
                    z = false;
                    lfc.u(iArr[i5], (List) unsafe.getObject(obj, j), kd9Var, false);
                    break;
                case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                    z = false;
                    lfc.v(iArr[i5], (List) unsafe.getObject(obj, j), kd9Var, false);
                    break;
                case 33:
                    z = false;
                    lfc.w(iArr[i5], (List) unsafe.getObject(obj, j), kd9Var, false);
                    break;
                case 34:
                    z = false;
                    lfc.x(iArr[i5], (List) unsafe.getObject(obj, j), kd9Var, false);
                    break;
                case 35:
                    lfc.n(iArr[i5], (List) unsafe.getObject(obj, j), kd9Var, i);
                    break;
                case 36:
                    lfc.r(iArr[i5], (List) unsafe.getObject(obj, j), kd9Var, i);
                    break;
                case 37:
                    lfc.t(iArr[i5], (List) unsafe.getObject(obj, j), kd9Var, i);
                    break;
                case 38:
                    lfc.z(iArr[i5], (List) unsafe.getObject(obj, j), kd9Var, i);
                    break;
                case 39:
                    lfc.s(iArr[i5], (List) unsafe.getObject(obj, j), kd9Var, i);
                    break;
                case 40:
                    lfc.q(iArr[i5], (List) unsafe.getObject(obj, j), kd9Var, i);
                    break;
                case 41:
                    lfc.p(iArr[i5], (List) unsafe.getObject(obj, j), kd9Var, i);
                    break;
                case 42:
                    lfc.m(iArr[i5], (List) unsafe.getObject(obj, j), kd9Var, i);
                    break;
                case 43:
                    lfc.y(iArr[i5], (List) unsafe.getObject(obj, j), kd9Var, i);
                    break;
                case 44:
                    lfc.o(iArr[i5], (List) unsafe.getObject(obj, j), kd9Var, i);
                    break;
                case 45:
                    lfc.u(iArr[i5], (List) unsafe.getObject(obj, j), kd9Var, i);
                    break;
                case 46:
                    lfc.v(iArr[i5], (List) unsafe.getObject(obj, j), kd9Var, i);
                    break;
                case 47:
                    lfc.w(iArr[i5], (List) unsafe.getObject(obj, j), kd9Var, i);
                    break;
                case z7c.f /* 48 */:
                    lfc.x(iArr[i5], (List) unsafe.getObject(obj, j), kd9Var, true);
                    break;
                case 49:
                    int i17 = iArr[i5];
                    List list4 = (List) unsafe.getObject(obj, j);
                    gfc gfcVarM2 = du8Var.m(i5);
                    Class cls4 = lfc.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i18 = 0; i18 < list4.size(); i18++) {
                            kd9Var.N(i17, list4.get(i18), gfcVarM2);
                        }
                    }
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        int i19 = 2;
                        Object obj2 = du8Var.b[(i5 / 3) * 2];
                        du8Var.m.getClass();
                        gg7 gg7Var = ((ml8) obj2).a;
                        for (Map.Entry entry : ((rl8) object2).entrySet()) {
                            m72Var.B(i7, i19);
                            m72Var.D(ml8.a(gg7Var, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            yc5.b(m72Var, (y9g) gg7Var.b, i, key);
                            i19 = 2;
                            yc5.b(m72Var, (y9g) gg7Var.c, 2, value);
                            i = 1;
                        }
                    }
                    break;
                case 51:
                    if (du8Var.q(i7, obj, i5)) {
                        m72Var.t(i7, Double.doubleToRawLongBits(((Double) xff.h(j, obj)).doubleValue()));
                    }
                    break;
                case 52:
                    if (du8Var.q(i7, obj, i5)) {
                        m72Var.r(i7, Float.floatToRawIntBits(((Float) xff.h(j, obj)).floatValue()));
                    }
                    break;
                case 53:
                    if (du8Var.q(i7, obj, i5)) {
                        m72Var.E(i7, z(j, obj));
                    }
                    break;
                case 54:
                    if (du8Var.q(i7, obj, i5)) {
                        m72Var.E(i7, z(j, obj));
                    }
                    break;
                case 55:
                    if (du8Var.q(i7, obj, i5)) {
                        m72Var.v(i7, y(j, obj));
                    }
                    break;
                case 56:
                    if (du8Var.q(i7, obj, i5)) {
                        m72Var.t(i7, z(j, obj));
                    }
                    break;
                case 57:
                    if (du8Var.q(i7, obj, i5)) {
                        m72Var.r(i7, y(j, obj));
                    }
                    break;
                case 58:
                    if (du8Var.q(i7, obj, i5)) {
                        m72Var.o(i7, ((Boolean) xff.h(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (du8Var.q(i7, obj, i5)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            m72Var.z(i7, (String) object3);
                        } else {
                            m72Var.p(i7, (b71) object3);
                        }
                    }
                    break;
                case 60:
                    if (du8Var.q(i7, obj, i5)) {
                        m72Var.y(i7, (vt8) unsafe.getObject(obj, j), du8Var.m(i5));
                    }
                    break;
                case 61:
                    if (du8Var.q(i7, obj, i5)) {
                        m72Var.p(i7, (b71) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (du8Var.q(i7, obj, i5)) {
                        m72Var.C(i7, y(j, obj));
                    }
                    break;
                case 63:
                    if (du8Var.q(i7, obj, i5)) {
                        m72Var.v(i7, y(j, obj));
                    }
                    break;
                case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                    if (du8Var.q(i7, obj, i5)) {
                        m72Var.r(i7, y(j, obj));
                    }
                    break;
                case 65:
                    if (du8Var.q(i7, obj, i5)) {
                        m72Var.t(i7, z(j, obj));
                    }
                    break;
                case 66:
                    if (du8Var.q(i7, obj, i5)) {
                        int iY = y(j, obj);
                        m72Var.C(i7, (iY >> 31) ^ (iY << 1));
                    }
                    break;
                case 67:
                    if (du8Var.q(i7, obj, i5)) {
                        long jZ = z(j, obj);
                        m72Var.E(i7, (jZ << i) ^ (jZ >> 63));
                    }
                    break;
                case 68:
                    if (du8Var.q(i7, obj, i5)) {
                        kd9Var.N(i7, unsafe.getObject(obj, j), du8Var.m(i5));
                    }
                    break;
                default:
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
        ((eff) du8Var.l).getClass();
        ((v56) obj).unknownFields.d(kd9Var);
    }

    public final boolean j(v56 v56Var, v56 v56Var2, int i) {
        return o(i, v56Var) == o(i, v56Var2);
    }

    public final void k(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (xff.h(J(i) & 1048575, obj) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        if (this.b[((i / 3) * 2) + 1] == null) {
            return;
        }
        r3.f();
    }

    public final gfc m(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        gfc gfcVar = (gfc) objArr[i2];
        if (gfcVar != null) {
            return gfcVar;
        }
        gfc gfcVarA = v0b.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = gfcVarA;
        return gfcVarA;
    }

    public final boolean n(int i, int i2, int i3, int i4, Object obj) {
        if (i2 == 1048575) {
            return o(i, obj);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f1 A[RETURN] */
    public final boolean o(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            if (((1 << (i2 >>> 20)) & xff.f(j, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iJ = J(i);
        long j2 = iJ & 1048575;
        switch (I(iJ)) {
            case 0:
                if (Double.doubleToRawLongBits(xff.c.c(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(xff.c.d(j2, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (xff.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (xff.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (xff.f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (xff.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (xff.f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return xff.c.a(j2, obj);
            case 8:
                Object objH = xff.h(j2, obj);
                if (objH instanceof String) {
                    return !((String) objH).isEmpty();
                }
                if (objH instanceof b71) {
                    return !b71.a.equals(objH);
                }
                cva.s();
                return false;
            case 9:
                if (xff.h(j2, obj) != null) {
                    return true;
                }
                return false;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return !b71.a.equals(xff.h(j2, obj));
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (xff.f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                if (xff.f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                if (xff.f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (xff.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (xff.f(j2, obj) != 0) {
                    return true;
                }
                return false;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                if (xff.g(j2, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (xff.h(j2, obj) != null) {
                    return true;
                }
                return false;
            default:
                cva.s();
                return false;
        }
    }

    public final boolean q(int i, Object obj, int i2) {
        return xff.f((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void r(Object obj, int i, Object obj2, p85 p85Var, i72 i72Var) throws ya7.a {
        long J = J(i) & 1048575;
        Object objH = xff.h(J, obj);
        tl8 tl8Var = this.m;
        if (objH == null) {
            tl8Var.getClass();
            objH = rl8.a.e();
            xff.o(J, obj, objH);
        } else {
            tl8Var.getClass();
            if (!((rl8) objH).c()) {
                Object objE = rl8.a.e();
                tl8.a(objE, objH);
                xff.o(J, obj, objE);
                objH = objE;
            }
        }
        tl8Var.getClass();
        rl8 rl8Var = (rl8) objH;
        gg7 gg7Var = ((ml8) obj2).a;
        i72Var.w(2);
        h72 h72Var = i72Var.a;
        int iJ = h72Var.j(h72Var.A());
        Object obj3 = gg7Var.d;
        Object objI = "";
        Object objI2 = obj3;
        while (true) {
            try {
                int iA = i72Var.a();
                if (iA == Integer.MAX_VALUE || h72Var.c()) {
                    break;
                }
                if (iA == 1) {
                    objI = i72Var.i((y9g) gg7Var.b, null, null);
                } else if (iA != 2) {
                    try {
                        if (!i72Var.x()) {
                            throw new ya7("Unable to parse map entry.");
                        }
                    } catch (ya7.a unused) {
                        if (!i72Var.x()) {
                            throw new ya7("Unable to parse map entry.");
                        }
                    }
                } else {
                    objI2 = i72Var.i((y9g) gg7Var.c, obj3.getClass(), p85Var);
                }
            } catch (Throwable th) {
                h72Var.h(iJ);
                throw th;
            }
        }
        rl8Var.put(objI, objI2);
        h72Var.h(iJ);
    }

    public final void s(int i, Object obj, Object obj2) {
        if (o(i, obj2)) {
            long J = J(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, J);
            if (object == null) {
                cva.m("Source subfield ", this.a[i], " is present but null: ", obj2);
                return;
            }
            gfc gfcVarM = m(i);
            if (!o(i, obj)) {
                if (p(object)) {
                    v56 v56VarD = gfcVarM.d();
                    gfcVarM.a(v56VarD, object);
                    unsafe.putObject(obj, J, v56VarD);
                } else {
                    unsafe.putObject(obj, J, object);
                }
                G(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!p(object2)) {
                v56 v56VarD2 = gfcVarM.d();
                gfcVarM.a(v56VarD2, object2);
                unsafe.putObject(obj, J, v56VarD2);
                object2 = v56VarD2;
            }
            gfcVarM.a(object2, object);
        }
    }

    public final void t(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (q(i2, obj2, i)) {
            long J = J(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, J);
            if (object == null) {
                cva.m("Source subfield ", iArr[i], " is present but null: ", obj2);
                return;
            }
            gfc gfcVarM = m(i);
            if (!q(i2, obj, i)) {
                if (p(object)) {
                    v56 v56VarD = gfcVarM.d();
                    gfcVarM.a(v56VarD, object);
                    unsafe.putObject(obj, J, v56VarD);
                } else {
                    unsafe.putObject(obj, J, object);
                }
                H(i2, obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!p(object2)) {
                v56 v56VarD2 = gfcVarM.d();
                gfcVarM.a(v56VarD2, object2);
                unsafe.putObject(obj, J, v56VarD2);
                object2 = v56VarD2;
            }
            gfcVarM.a(object2, object);
        }
    }

    public final Object u(int i, Object obj) {
        gfc gfcVarM = m(i);
        long J = J(i) & 1048575;
        if (!o(i, obj)) {
            return gfcVarM.d();
        }
        Object object = o.getObject(obj, J);
        if (p(object)) {
            return object;
        }
        v56 v56VarD = gfcVarM.d();
        if (object != null) {
            gfcVarM.a(v56VarD, object);
        }
        return v56VarD;
    }

    public final Object v(int i, Object obj, int i2) {
        gfc gfcVarM = m(i2);
        if (!q(i, obj, i2)) {
            return gfcVarM.d();
        }
        Object object = o.getObject(obj, J(i2) & 1048575);
        if (p(object)) {
            return object;
        }
        v56 v56VarD = gfcVarM.d();
        if (object != null) {
            gfcVarM.a(v56VarD, object);
        }
        return v56VarD;
    }
}
