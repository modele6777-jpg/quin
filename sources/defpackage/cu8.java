package defpackage;

import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cu8 implements ffc {
    public static final int[] j = new int[0];
    public static final Unsafe k;
    public final int[] a;
    public final Object[] b;
    public final tt8 c;
    public final int[] d;
    public final int e;
    public final we9 f;
    public final l78 g;
    public final zef h;
    public final sl8 i;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new c2(1));
        } catch (Throwable unused) {
            unsafe = null;
        }
        k = unsafe;
    }

    public cu8(int[] iArr, Object[] objArr, tt8 tt8Var, int[] iArr2, int i, we9 we9Var, l78 l78Var, zef zefVar, r85 r85Var, sl8 sl8Var) {
        this.a = iArr;
        this.b = objArr;
        this.d = iArr2;
        this.e = i;
        this.f = we9Var;
        this.g = l78Var;
        this.h = zefVar;
        this.c = tt8Var;
        this.i = sl8Var;
    }

    public static boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof t56) {
            return ((t56) obj).l();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0235  */
    /* JADX WARN: Code duplicated, block: B:124:0x023a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0252  */
    /* JADX WARN: Code duplicated, block: B:128:0x0255  */
    /* JADX WARN: Code duplicated, block: B:165:0x0315  */
    /* JADX WARN: Code duplicated, block: B:181:0x0364  */
    /* JADX WARN: Code duplicated, block: B:184:0x0372  */
    public static cu8 q(hdb hdbVar, we9 we9Var, l78 l78Var, zef zefVar, r85 r85Var, sl8 sl8Var) {
        int i;
        int iCharAt;
        int iCharAt2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        char cCharAt;
        int i6;
        char cCharAt2;
        int i7;
        char cCharAt3;
        int i8;
        char cCharAt4;
        int i9;
        int i10;
        int i11;
        char cCharAt5;
        int i12;
        char cCharAt6;
        int i13;
        int i14;
        int i15;
        int i16;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i17;
        int i18;
        int iObjectFieldOffset3;
        int i19;
        Field fieldT;
        int i20;
        char cCharAt7;
        int i21;
        int i22;
        int i23;
        int i24;
        Object obj;
        Field fieldT2;
        int i25;
        Object obj2;
        Field fieldT3;
        int i26;
        char cCharAt8;
        int i27;
        char cCharAt9;
        int i28;
        char cCharAt10;
        int i29;
        char cCharAt11;
        if (!(hdbVar instanceof hdb)) {
            r3.f();
            return null;
        }
        String str = hdbVar.b;
        int length = str.length();
        char c = 55296;
        if (str.charAt(0) >= 55296) {
            int i30 = 1;
            while (true) {
                i = i30 + 1;
                if (str.charAt(i30) < 55296) {
                    break;
                }
                i30 = i;
            }
        } else {
            i = 1;
        }
        int i31 = i + 1;
        int iCharAt3 = str.charAt(i);
        if (iCharAt3 >= 55296) {
            int i32 = iCharAt3 & 8191;
            int i33 = 13;
            while (true) {
                i29 = i31 + 1;
                cCharAt11 = str.charAt(i31);
                if (cCharAt11 < 55296) {
                    break;
                }
                i32 |= (cCharAt11 & 8191) << i33;
                i33 += 13;
                i31 = i29;
            }
            iCharAt3 = i32 | (cCharAt11 << i33);
            i31 = i29;
        }
        if (iCharAt3 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            i3 = 0;
            i4 = 0;
            iArr = j;
            i2 = 0;
        } else {
            int i34 = i31 + 1;
            int iCharAt4 = str.charAt(i31);
            if (iCharAt4 >= 55296) {
                int i35 = iCharAt4 & 8191;
                int i36 = 13;
                while (true) {
                    i12 = i34 + 1;
                    cCharAt6 = str.charAt(i34);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i35 |= (cCharAt6 & 8191) << i36;
                    i36 += 13;
                    i34 = i12;
                }
                iCharAt4 = i35 | (cCharAt6 << i36);
                i34 = i12;
            }
            int i37 = i34 + 1;
            int iCharAt5 = str.charAt(i34);
            if (iCharAt5 >= 55296) {
                int i38 = iCharAt5 & 8191;
                int i39 = 13;
                while (true) {
                    i11 = i37 + 1;
                    cCharAt5 = str.charAt(i37);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i38 |= (cCharAt5 & 8191) << i39;
                    i39 += 13;
                    i37 = i11;
                }
                iCharAt5 = i38 | (cCharAt5 << i39);
                i37 = i11;
            }
            int i40 = i37 + 1;
            if (str.charAt(i37) >= 55296) {
                while (true) {
                    i10 = i40 + 1;
                    if (str.charAt(i40) < 55296) {
                        break;
                    }
                    i40 = i10;
                }
                i40 = i10;
            }
            int i41 = i40 + 1;
            if (str.charAt(i40) >= 55296) {
                while (true) {
                    i9 = i41 + 1;
                    if (str.charAt(i41) < 55296) {
                        break;
                    }
                    i41 = i9;
                }
                i41 = i9;
            }
            int i42 = i41 + 1;
            iCharAt = str.charAt(i41);
            if (iCharAt >= 55296) {
                int i43 = iCharAt & 8191;
                int i44 = 13;
                while (true) {
                    i8 = i42 + 1;
                    cCharAt4 = str.charAt(i42);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt4 & 8191) << i44;
                    i44 += 13;
                    i42 = i8;
                }
                iCharAt = i43 | (cCharAt4 << i44);
                i42 = i8;
            }
            int i45 = i42 + 1;
            iCharAt2 = str.charAt(i42);
            if (iCharAt2 >= 55296) {
                int i46 = iCharAt2 & 8191;
                int i47 = 13;
                while (true) {
                    i7 = i45 + 1;
                    cCharAt3 = str.charAt(i45);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt3 & 8191) << i47;
                    i47 += 13;
                    i45 = i7;
                }
                iCharAt2 = i46 | (cCharAt3 << i47);
                i45 = i7;
            }
            int i48 = i45 + 1;
            int iCharAt6 = str.charAt(i45);
            if (iCharAt6 >= 55296) {
                int i49 = iCharAt6 & 8191;
                int i50 = 13;
                while (true) {
                    i6 = i48 + 1;
                    cCharAt2 = str.charAt(i48);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt2 & 8191) << i50;
                    i50 += 13;
                    i48 = i6;
                }
                iCharAt6 = i49 | (cCharAt2 << i50);
                i48 = i6;
            }
            int i51 = i48 + 1;
            int iCharAt7 = str.charAt(i48);
            if (iCharAt7 >= 55296) {
                int i52 = iCharAt7 & 8191;
                int i53 = 13;
                while (true) {
                    i5 = i51 + 1;
                    cCharAt = str.charAt(i51);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i52 |= (cCharAt & 8191) << i53;
                    i53 += 13;
                    i51 = i5;
                }
                iCharAt7 = i52 | (cCharAt << i53);
                i51 = i5;
            }
            int i54 = (iCharAt4 * 2) + iCharAt5;
            i2 = iCharAt4;
            i31 = i51;
            iArr = new int[iCharAt7 + iCharAt2 + iCharAt6];
            i3 = i54;
            i4 = iCharAt7;
        }
        Object[] objArr = hdbVar.c;
        Class<?> cls = hdbVar.a.getClass();
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt * 2];
        int i55 = iCharAt2 + i4;
        int i56 = i4;
        int i57 = 0;
        int i58 = 0;
        while (i31 < length) {
            int i59 = i31 + 1;
            int iCharAt8 = str.charAt(i31);
            if (iCharAt8 >= c) {
                int i60 = iCharAt8 & 8191;
                int i61 = i59;
                int i62 = 13;
                while (true) {
                    i28 = i61 + 1;
                    cCharAt10 = str.charAt(i61);
                    if (cCharAt10 < c) {
                        break;
                    }
                    i60 |= (cCharAt10 & 8191) << i62;
                    i62 += 13;
                    i61 = i28;
                }
                iCharAt8 = i60 | (cCharAt10 << i62);
                i13 = i28;
            } else {
                i13 = i59;
            }
            int i63 = i13 + 1;
            int iCharAt9 = str.charAt(i13);
            if (iCharAt9 >= c) {
                int i64 = iCharAt9 & 8191;
                int i65 = i63;
                int i66 = 13;
                while (true) {
                    i27 = i65 + 1;
                    cCharAt9 = str.charAt(i65);
                    if (cCharAt9 < c) {
                        break;
                    }
                    i64 |= (cCharAt9 & 8191) << i66;
                    i66 += 13;
                    i65 = i27;
                }
                iCharAt9 = i64 | (cCharAt9 << i66);
                i14 = i27;
            } else {
                i14 = i63;
            }
            int i67 = iCharAt9 & 255;
            int i68 = length;
            if ((iCharAt9 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                iArr[i57] = i58;
                i57++;
            }
            int[] iArr3 = iArr2;
            Unsafe unsafe = k;
            if (i67 >= 51) {
                int i69 = i14 + 1;
                int iCharAt10 = str.charAt(i14);
                char c2 = 55296;
                if (iCharAt10 >= 55296) {
                    int i70 = iCharAt10 & 8191;
                    int i71 = i69;
                    int i72 = 13;
                    while (true) {
                        i26 = i71 + 1;
                        cCharAt8 = str.charAt(i71);
                        if (cCharAt8 < c2) {
                            break;
                        }
                        i70 |= (cCharAt8 & 8191) << i72;
                        i72 += 13;
                        i71 = i26;
                        c2 = 55296;
                    }
                    iCharAt10 = i70 | (cCharAt8 << i72);
                    i22 = i26;
                } else {
                    i22 = i69;
                }
                int i73 = i22;
                int i74 = i67 - 51;
                if (i74 == 9 || i74 == 17) {
                    i23 = i3 + 1;
                    objArr2[((i58 / 3) * 2) + 1] = objArr[i3];
                } else {
                    if (i74 == 12 && (kv2.a(hdbVar.a(), 1) || (iCharAt9 & 2048) != 0)) {
                        i23 = i3 + 1;
                        objArr2[((i58 / 3) * 2) + 1] = objArr[i3];
                    }
                    i24 = iCharAt10 * 2;
                    obj = objArr[i24];
                    if (obj instanceof Field) {
                        fieldT2 = (Field) obj;
                    } else {
                        fieldT2 = t((String) obj, cls);
                        objArr[i24] = fieldT2;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldT2);
                    i25 = i24 + 1;
                    obj2 = objArr[i25];
                    if (obj2 instanceof Field) {
                        fieldT3 = (Field) obj2;
                    } else {
                        fieldT3 = t((String) obj2, cls);
                        objArr[i25] = fieldT3;
                    }
                    str = str;
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldT3);
                    i16 = i3;
                    i19 = iObjectFieldOffset4;
                    i31 = i73;
                    i18 = 0;
                    i15 = i2;
                    iCharAt9 = iCharAt9;
                }
                i3 = i23;
                i24 = iCharAt10 * 2;
                obj = objArr[i24];
                if (obj instanceof Field) {
                    fieldT2 = (Field) obj;
                } else {
                    fieldT2 = t((String) obj, cls);
                    objArr[i24] = fieldT2;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldT2);
                i25 = i24 + 1;
                obj2 = objArr[i25];
                if (obj2 instanceof Field) {
                    fieldT3 = (Field) obj2;
                } else {
                    fieldT3 = t((String) obj2, cls);
                    objArr[i25] = fieldT3;
                }
                str = str;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldT3);
                i16 = i3;
                i19 = iObjectFieldOffset5;
                i31 = i73;
                i18 = 0;
                i15 = i2;
                iCharAt9 = iCharAt9;
            } else {
                int i75 = i3 + 1;
                Field fieldT4 = t((String) objArr[i3], cls);
                if (i67 == 9 || i67 == 17) {
                    i15 = i2;
                    objArr2[((i58 / 3) * 2) + 1] = fieldT4.getType();
                } else {
                    if (i67 == 27 || i67 == 49) {
                        i15 = i2;
                        i21 = i3 + 2;
                        objArr2[((i58 / 3) * 2) + 1] = objArr[i75];
                    } else if (i67 == 12 || i67 == 30 || i67 == 44) {
                        i15 = i2;
                        if (hdbVar.a() == 1 || (iCharAt9 & 2048) != 0) {
                            i21 = i3 + 2;
                            objArr2[((i58 / 3) * 2) + 1] = objArr[i75];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldT4);
                        if ((iCharAt9 & 4096) != 0 || i67 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i17 = i14;
                            i18 = 0;
                        } else {
                            i17 = i14 + 1;
                            int iCharAt11 = str.charAt(i14);
                            if (iCharAt11 >= 55296) {
                                int i76 = iCharAt11 & 8191;
                                int i77 = 13;
                                while (true) {
                                    i20 = i17 + 1;
                                    cCharAt7 = str.charAt(i17);
                                    if (cCharAt7 < 55296) {
                                        break;
                                    }
                                    i76 |= (cCharAt7 & 8191) << i77;
                                    i77 += 13;
                                    i17 = i20;
                                }
                                iCharAt11 = i76 | (cCharAt7 << i77);
                                i17 = i20;
                            }
                            int i78 = (iCharAt11 / 32) + (i15 * 2);
                            Object obj3 = objArr[i78];
                            if (obj3 instanceof Field) {
                                fieldT = (Field) obj3;
                            } else {
                                fieldT = t((String) obj3, cls);
                                objArr[i78] = fieldT;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldT);
                            i18 = iCharAt11 % 32;
                        }
                        int i79 = iObjectFieldOffset2;
                        if (i67 >= 18 && i67 <= 49) {
                            iArr[i55] = iObjectFieldOffset;
                            i55++;
                        }
                        iObjectFieldOffset3 = i79;
                        i19 = iObjectFieldOffset;
                        i31 = i17;
                    } else {
                        if (i67 == 50) {
                            int i80 = i56 + 1;
                            iArr[i56] = i58;
                            int i81 = (i58 / 3) * 2;
                            int i82 = i3 + 2;
                            objArr2[i81] = objArr[i75];
                            if ((iCharAt9 & 2048) != 0) {
                                i16 = i3 + 3;
                                objArr2[i81 + 1] = objArr[i82];
                                i15 = i2;
                                i56 = i80;
                            } else {
                                i16 = i82;
                                i56 = i80;
                                i15 = i2;
                            }
                        } else {
                            i15 = i2;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldT4);
                        if ((iCharAt9 & 4096) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i17 = i14;
                            i18 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i17 = i14;
                            i18 = 0;
                        }
                        int i710 = iObjectFieldOffset2;
                        if (i67 >= 18) {
                            iArr[i55] = iObjectFieldOffset;
                            i55++;
                        }
                        iObjectFieldOffset3 = i710;
                        i19 = iObjectFieldOffset;
                        i31 = i17;
                    }
                    i16 = i21;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldT4);
                    if ((iCharAt9 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i17 = i14;
                        i18 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i17 = i14;
                        i18 = 0;
                    }
                    int i711 = iObjectFieldOffset2;
                    if (i67 >= 18) {
                        iArr[i55] = iObjectFieldOffset;
                        i55++;
                    }
                    iObjectFieldOffset3 = i711;
                    i19 = iObjectFieldOffset;
                    i31 = i17;
                }
                i16 = i75;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldT4);
                if ((iCharAt9 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i17 = i14;
                    i18 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i17 = i14;
                    i18 = 0;
                }
                int i712 = iObjectFieldOffset2;
                if (i67 >= 18) {
                    iArr[i55] = iObjectFieldOffset;
                    i55++;
                }
                iObjectFieldOffset3 = i712;
                i19 = iObjectFieldOffset;
                i31 = i17;
            }
            int i83 = i58 + 1;
            iArr3[i58] = iCharAt8;
            int i84 = i58 + 2;
            int i85 = iObjectFieldOffset3;
            iArr3[i83] = ((iCharAt9 & 256) != 0 ? 268435456 : 0) | ((iCharAt9 & 512) != 0 ? 536870912 : 0) | ((iCharAt9 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i67 << 20) | i19;
            i58 += 3;
            iArr3[i84] = (i18 << 20) | i85;
            length = i68;
            i2 = i15;
            i3 = i16;
            iArr2 = iArr3;
            str = str;
            c = 55296;
        }
        return new cu8(iArr2, objArr2, hdbVar.a, iArr, i4, we9Var, l78Var, zefVar, r85Var, sl8Var);
    }

    public static int r(long j2, Object obj) {
        return ((Integer) wff.j(j2, obj)).intValue();
    }

    public static long s(long j2, Object obj) {
        return ((Long) wff.j(j2, obj)).longValue();
    }

    public static Field t(String str, Class cls) {
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

    public static int v(int i) {
        return (i & 267386880) >>> 20;
    }

    @Override // defpackage.ffc
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!m(obj)) {
            qc0.j(ks0.j(obj, "Mutating immutable message: "));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                kfc.j(this.h, obj, obj2);
                return;
            }
            int iW = w(i);
            long j2 = iW & 1048575;
            int i2 = iArr[i];
            switch (v(iW)) {
                case 0:
                    obj3 = obj;
                    if (l(i, obj2)) {
                        vff vffVar = wff.c;
                        vffVar.g(obj3, j2, vffVar.c(j2, obj2));
                        u(i, obj3);
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 1:
                    obj3 = obj;
                    if (l(i, obj2)) {
                        vff vffVar2 = wff.c;
                        vffVar2.h(obj3, j2, vffVar2.d(j2, obj2));
                        u(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 2:
                    obj3 = obj;
                    if (l(i, obj2)) {
                        wff.c.b.putLong(obj3, j2, wff.i(j2, obj2));
                        u(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 3:
                    obj3 = obj;
                    if (l(i, obj2)) {
                        wff.c.b.putLong(obj3, j2, wff.i(j2, obj2));
                        u(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 4:
                    obj3 = obj;
                    if (l(i, obj2)) {
                        wff.o(j2, obj3, wff.h(j2, obj2));
                        u(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 5:
                    obj3 = obj;
                    if (l(i, obj2)) {
                        wff.c.b.putLong(obj3, j2, wff.i(j2, obj2));
                        u(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 6:
                    obj3 = obj;
                    if (l(i, obj2)) {
                        wff.o(j2, obj3, wff.h(j2, obj2));
                        u(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 7:
                    obj3 = obj;
                    if (l(i, obj2)) {
                        vff vffVar3 = wff.c;
                        vffVar3.e(obj3, j2, vffVar3.a(j2, obj2));
                        u(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 8:
                    obj3 = obj;
                    if (l(i, obj2)) {
                        wff.p(j2, obj3, wff.j(j2, obj2));
                        u(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 9:
                    obj3 = obj;
                    o(i, obj3, obj2);
                    continue;
                    i += 3;
                    obj = obj3;
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    obj3 = obj;
                    if (l(i, obj2)) {
                        wff.p(j2, obj3, wff.j(j2, obj2));
                        u(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    obj3 = obj;
                    if (l(i, obj2)) {
                        wff.o(j2, obj3, wff.h(j2, obj2));
                        u(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    obj3 = obj;
                    if (l(i, obj2)) {
                        wff.o(j2, obj3, wff.h(j2, obj2));
                        u(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    obj3 = obj;
                    if (l(i, obj2)) {
                        wff.o(j2, obj3, wff.h(j2, obj2));
                        u(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 14:
                    obj3 = obj;
                    if (l(i, obj2)) {
                        wff.c.b.putLong(obj3, j2, wff.i(j2, obj2));
                        u(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 15:
                    obj3 = obj;
                    if (l(i, obj2)) {
                        wff.o(j2, obj3, wff.h(j2, obj2));
                        u(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                    if (l(i, obj2)) {
                        obj3 = obj;
                        wff.c.b.putLong(obj3, j2, wff.i(j2, obj2));
                        u(i, obj3);
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 17:
                    o(i, obj, obj2);
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
                    this.g.b(j2, obj, obj2);
                    break;
                case 50:
                    Class cls = kfc.a;
                    Object objJ = wff.j(j2, obj);
                    Object objJ2 = wff.j(j2, obj2);
                    this.i.getClass();
                    ql8 ql8VarG = (ql8) objJ;
                    ql8 ql8Var = (ql8) objJ2;
                    if (!ql8Var.isEmpty()) {
                        if (!ql8VarG.d()) {
                            ql8VarG = ql8VarG.g();
                        }
                        ql8VarG.c();
                        if (!ql8Var.isEmpty()) {
                            ql8VarG.putAll(ql8Var);
                        }
                    }
                    wff.p(j2, obj, ql8VarG);
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
                    if (n(i2, obj2, i)) {
                        wff.p(j2, obj, wff.j(j2, obj2));
                        wff.o(iArr[i + 2] & 1048575, obj, i2);
                    }
                    break;
                case 60:
                    p(i, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (n(i2, obj2, i)) {
                        wff.p(j2, obj, wff.j(j2, obj2));
                        wff.o(iArr[i + 2] & 1048575, obj, i2);
                    }
                    break;
                case 68:
                    p(i, obj, obj2);
                    break;
            }
            obj3 = obj;
            i += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080 A[SYNTHETIC] */
    @Override // defpackage.ffc
    public final void b(Object obj) {
        if (m(obj)) {
            if (obj instanceof t56) {
                t56 t56Var = (t56) obj;
                t56Var.p(Integer.MAX_VALUE);
                t56Var.memoizedHashCode = 0;
                t56Var.m();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iW = w(i);
                long j2 = 1048575 & iW;
                int iV = v(iW);
                Unsafe unsafe = k;
                if (iV != 9) {
                    if (iV != 60 && iV != 68) {
                        switch (iV) {
                            case 17:
                                if (l(i, obj)) {
                                    j(i).b(unsafe.getObject(obj, j2));
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
                                this.g.a(j2, obj);
                                break;
                            case 50:
                                Object object = unsafe.getObject(obj, j2);
                                if (object != null) {
                                    this.i.getClass();
                                    ((ql8) object).e();
                                    unsafe.putObject(obj, j2, object);
                                }
                                break;
                        }
                    } else if (n(iArr[i], obj, i)) {
                        j(i).b(unsafe.getObject(obj, j2));
                    }
                } else if (l(i, obj)) {
                    j(i).b(unsafe.getObject(obj, j2));
                }
            }
            ((dff) this.h).getClass();
            bff bffVar = ((t56) obj).unknownFields;
            if (bffVar.e) {
                bffVar.e = false;
            }
        }
    }

    @Override // defpackage.ffc
    public final boolean c(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.e) {
            int i6 = this.d[i5];
            int[] iArr = this.a;
            int i7 = iArr[i6];
            int iW = w(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = k.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                int i11 = i4;
                i = i3;
                i2 = i11;
            }
            if ((268435456 & iW) == 0 || k(i6, i, i2, i10, obj)) {
                int iV = v(iW);
                if (iV != 9 && iV != 17) {
                    if (iV != 27) {
                        if (iV == 60 || iV == 68) {
                            if (!n(i7, obj, i6) || j(i6).c(wff.j(iW & 1048575, obj))) {
                                i5++;
                                i3 = i;
                                i4 = i2;
                            }
                        } else if (iV != 49) {
                            if (iV != 50) {
                                continue;
                            } else {
                                Object objJ = wff.j(iW & 1048575, obj);
                                this.i.getClass();
                                ql8 ql8Var = (ql8) objJ;
                                if (ql8Var.isEmpty()) {
                                    continue;
                                } else {
                                    if (((w9g) ((ll8) this.b[(i6 / 3) * 2]).a.c).a() != z9g.MESSAGE) {
                                        continue;
                                    } else {
                                        ffc ffcVarA = null;
                                        for (Object obj2 : ql8Var.values()) {
                                            if (ffcVarA == null) {
                                                ffcVarA = u0b.c.a(obj2.getClass());
                                            }
                                            if (!ffcVarA.c(obj2)) {
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
                    List list = (List) wff.j(iW & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        ffc ffcVarJ = j(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (ffcVarJ.c(list.get(i12))) {
                            }
                        }
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                } else if (!k(i6, i, i2, i10, obj) || j(i6).c(wff.j(iW & 1048575, obj))) {
                    i5++;
                    i3 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.ffc
    public final t56 d() {
        this.f.getClass();
        return (t56) ((t56) this.c).i(4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:130:0x032c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0339  */
    /* JADX WARN: Code duplicated, block: B:136:0x034b  */
    /* JADX WARN: Code duplicated, block: B:137:0x035c  */
    /* JADX WARN: Code duplicated, block: B:139:0x0365  */
    /* JADX WARN: Code duplicated, block: B:141:0x036e  */
    /* JADX WARN: Code duplicated, block: B:143:0x0372  */
    /* JADX WARN: Code duplicated, block: B:144:0x037e  */
    /* JADX WARN: Code duplicated, block: B:145:0x038a  */
    /* JADX WARN: Code duplicated, block: B:146:0x0396  */
    /* JADX WARN: Code duplicated, block: B:148:0x039a  */
    /* JADX WARN: Code duplicated, block: B:150:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:151:0x03af  */
    /* JADX WARN: Code duplicated, block: B:152:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:153:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:155:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:156:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:157:0x03db  */
    /* JADX WARN: Code duplicated, block: B:158:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:159:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:160:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:161:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:162:0x0406  */
    /* JADX WARN: Code duplicated, block: B:163:0x0411  */
    /* JADX WARN: Code duplicated, block: B:164:0x0418  */
    /* JADX WARN: Code duplicated, block: B:220:0x05ca A[PHI: r19 r24
  0x05ca: PHI (r19v35 int) = 
  (r19v21 int)
  (r19v22 int)
  (r19v23 int)
  (r19v27 int)
  (r19v29 int)
  (r19v30 int)
  (r19v31 int)
  (r19v34 int)
  (r19v36 int)
 binds: [B:288:0x07b2, B:284:0x0794, B:280:0x0776, B:254:0x06cc, B:240:0x065e, B:236:0x0642, B:232:0x0626, B:225:0x05ea, B:219:0x05c8] A[DONT_GENERATE, DONT_INLINE]
  0x05ca: PHI (r24v19 int) = 
  (r24v2 int)
  (r24v3 int)
  (r24v4 int)
  (r24v8 int)
  (r24v10 int)
  (r24v11 int)
  (r24v12 int)
  (r24v16 int)
  (r24v20 int)
 binds: [B:288:0x07b2, B:284:0x0794, B:280:0x0776, B:254:0x06cc, B:240:0x065e, B:236:0x0642, B:232:0x0626, B:225:0x05ea, B:219:0x05c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:364:0x0335 A[SYNTHETIC] */
    @Override // defpackage.ffc
    public final int e(t56 t56Var) {
        int i;
        int iC;
        int iC2;
        int iC3;
        int iE;
        int iC4;
        int iA;
        int iC5;
        int iC6;
        int iB;
        int iC7;
        int i2;
        int iC8;
        int size;
        int i3;
        int iC9;
        int iC10;
        int size2;
        int iC11;
        int iG;
        int iA2;
        int iE2;
        int size3;
        int iD;
        int i4;
        w9g w9gVar;
        int iC12;
        int iE3;
        int size4;
        int iD2;
        int iC13;
        int iC14;
        int iC15;
        int iE4;
        int iC16;
        int iA3;
        int iC17;
        int iB2;
        cu8 cu8Var = this;
        t56 t56Var2 = t56Var;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int iA4 = 0;
        while (true) {
            int[] iArr = cu8Var.a;
            if (i7 >= iArr.length) {
                ((dff) cu8Var.h).getClass();
                return t56Var2.unknownFields.a() + iA4;
            }
            int iW = cu8Var.w(i7);
            int iV = v(iW);
            int i9 = iArr[i7];
            int i10 = iArr[i7 + 2];
            int i11 = i10 & i5;
            int i12 = 1;
            Unsafe unsafe = k;
            if (iV <= 17) {
                if (i11 != i6) {
                    i8 = i11 == i5 ? 0 : unsafe.getInt(t56Var2, i11);
                    i6 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            long j2 = iW & i5;
            if (iV >= bd5.a.a()) {
                bd5.b.a();
            }
            char c = '?';
            switch (iV) {
                case 0:
                    if (cu8Var.k(i7, i6, i8, i, t56Var2)) {
                        iC = j72.c(i9) + 8;
                        iA4 += iC;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 1:
                    if (cu8Var.k(i7, i6, i8, i, t56Var2)) {
                        iC2 = j72.c(i9);
                        iC6 = iC2 + 4;
                        iA4 += iC6;
                    }
                    cu8Var = this;
                    t56Var2 = t56Var;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 2:
                    if (cu8Var.k(i7, i6, i8, i, t56Var2)) {
                        long j3 = unsafe.getLong(t56Var2, j2);
                        iC3 = j72.c(i9);
                        iE = j72.e(j3);
                        iA4 += iE + iC3;
                    }
                    cu8Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 3:
                    if (cu8Var.k(i7, i6, i8, i, t56Var2)) {
                        long j4 = unsafe.getLong(t56Var2, j2);
                        iC3 = j72.c(i9);
                        iE = j72.e(j4);
                        iA4 += iE + iC3;
                    }
                    cu8Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 4:
                    if (cu8Var.k(i7, i6, i8, i, t56Var2)) {
                        int i13 = unsafe.getInt(t56Var2, j2);
                        iC4 = j72.c(i9);
                        iA = j72.a(i13);
                        iA4 += iA + iC4;
                    }
                    cu8Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 5:
                    if (cu8Var.k(i7, i6, i8, i, t56Var2)) {
                        iC5 = j72.c(i9);
                        iC6 = iC5 + 8;
                        iA4 += iC6;
                    }
                    cu8Var = this;
                    t56Var2 = t56Var;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 6:
                    if (cu8Var.k(i7, i6, i8, i, t56Var2)) {
                        iC2 = j72.c(i9);
                        iC6 = iC2 + 4;
                        iA4 += iC6;
                    }
                    cu8Var = this;
                    t56Var2 = t56Var;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 7:
                    if (cu8Var.k(i7, i6, i8, i, t56Var2)) {
                        iC6 = j72.c(i9) + 1;
                        iA4 += iC6;
                    }
                    cu8Var = this;
                    t56Var2 = t56Var;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 8:
                    if (cu8Var.k(i7, i6, i8, i, t56Var2)) {
                        Object object = unsafe.getObject(t56Var2, j2);
                        if (object instanceof y61) {
                            int iC18 = j72.c(i9);
                            int size5 = ((y61) object).size();
                            iB = ib8.a(size5, size5, iC18, iA4);
                        } else {
                            iB = j72.b((String) object) + j72.c(i9) + iA4;
                        }
                        iA4 = iB;
                    }
                    cu8Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 9:
                    if (cu8Var.k(i7, i6, i8, i, t56Var2)) {
                        Object object2 = unsafe.getObject(t56Var2, j2);
                        ffc ffcVarJ = cu8Var.j(i7);
                        Class cls = kfc.a;
                        int iC19 = j72.c(i9);
                        int iG2 = ((h3) ((tt8) object2)).g(ffcVarJ);
                        iA4 = ib8.a(iG2, iG2, iC19, iA4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    if (cu8Var.k(i7, i6, i8, i, t56Var2)) {
                        y61 y61Var = (y61) unsafe.getObject(t56Var2, j2);
                        int iC20 = j72.c(i9);
                        int size6 = y61Var.size();
                        iA4 = ib8.a(size6, size6, iC20, iA4);
                    }
                    cu8Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    if (cu8Var.k(i7, i6, i8, i, t56Var2)) {
                        int i14 = unsafe.getInt(t56Var2, j2);
                        iC4 = j72.c(i9);
                        iA = j72.d(i14);
                        iA4 += iA + iC4;
                    }
                    cu8Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (cu8Var.k(i7, i6, i8, i, t56Var2)) {
                        int i15 = unsafe.getInt(t56Var2, j2);
                        iC4 = j72.c(i9);
                        iA = j72.a(i15);
                        iA4 += iA + iC4;
                    }
                    cu8Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    if (cu8Var.k(i7, i6, i8, i, t56Var2)) {
                        iC2 = j72.c(i9);
                        iC6 = iC2 + 4;
                        iA4 += iC6;
                    }
                    cu8Var = this;
                    t56Var2 = t56Var;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 14:
                    if (cu8Var.k(i7, i6, i8, i, t56Var2)) {
                        iC5 = j72.c(i9);
                        iC6 = iC5 + 8;
                        iA4 += iC6;
                    }
                    cu8Var = this;
                    t56Var2 = t56Var;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 15:
                    if (cu8Var.k(i7, i6, i8, i, t56Var2)) {
                        int i16 = unsafe.getInt(t56Var2, j2);
                        iC4 = j72.c(i9);
                        iA = j72.d((i16 >> 31) ^ (i16 << 1));
                        iA4 += iA + iC4;
                    }
                    cu8Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                    if (cu8Var.k(i7, i6, i8, i, t56Var2)) {
                        long j5 = unsafe.getLong(t56Var2, j2);
                        iC3 = j72.c(i9);
                        iE = j72.e((j5 >> 63) ^ (j5 << 1));
                        iA4 += iE + iC3;
                    }
                    cu8Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 17:
                    if (cu8Var.k(i7, i6, i8, i, t56Var2)) {
                        iC = ((h3) ((tt8) unsafe.getObject(t56Var2, j2))).g(cu8Var.j(i7)) + (j72.c(i9) * 2);
                        iA4 += iC;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 18:
                    iC7 = kfc.c(i9, (List) unsafe.getObject(t56Var2, j2));
                    iA4 += iC7;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 19:
                    iC7 = kfc.b(i9, (List) unsafe.getObject(t56Var2, j2));
                    iA4 += iC7;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 20:
                    i6 = i6;
                    i2 = 0;
                    List list = (List) unsafe.getObject(t56Var2, j2);
                    Class cls2 = kfc.a;
                    if (list.size() == 0) {
                        iC8 = i2;
                    } else {
                        iC8 = (j72.c(i9) * list.size()) + kfc.e(list);
                    }
                    iA4 += iC8;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 21:
                    i6 = i6;
                    i2 = 0;
                    List list2 = (List) unsafe.getObject(t56Var2, j2);
                    Class cls3 = kfc.a;
                    size = list2.size();
                    if (size == 0) {
                        iC8 = i2;
                    } else {
                        i3 = kfc.i(list2);
                        iC9 = j72.c(i9);
                        iC8 = (iC9 * size) + i3;
                    }
                    iA4 += iC8;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 22:
                    i6 = i6;
                    i2 = 0;
                    List list3 = (List) unsafe.getObject(t56Var2, j2);
                    Class cls4 = kfc.a;
                    size = list3.size();
                    if (size == 0) {
                        iC8 = i2;
                    } else {
                        i3 = kfc.d(list3);
                        iC9 = j72.c(i9);
                        iC8 = (iC9 * size) + i3;
                    }
                    iA4 += iC8;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 23:
                    iC7 = kfc.c(i9, (List) unsafe.getObject(t56Var2, j2));
                    iA4 += iC7;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 24:
                    iC7 = kfc.b(i9, (List) unsafe.getObject(t56Var2, j2));
                    iA4 += iC7;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 25:
                    i6 = i6;
                    List list4 = (List) unsafe.getObject(t56Var2, j2);
                    Class cls5 = kfc.a;
                    int size7 = list4.size();
                    iA4 += size7 == 0 ? 0 : (j72.c(i9) + 1) * size7;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 26:
                    i6 = i6;
                    i2 = 0;
                    List list5 = (List) unsafe.getObject(t56Var2, j2);
                    Class cls6 = kfc.a;
                    int size8 = list5.size();
                    if (size8 == 0) {
                        iC8 = i2;
                    } else {
                        iC8 = j72.c(i9) * size8;
                        if (list5 instanceof v18) {
                            v18 v18Var = (v18) list5;
                            for (int i17 = 0; i17 < size8; i17++) {
                                Object objP0 = v18Var.p0(i17);
                                if (objP0 instanceof y61) {
                                    int size9 = ((y61) objP0).size();
                                    iC8 = j72.d(size9) + size9 + iC8;
                                } else {
                                    iC8 = j72.b((String) objP0) + iC8;
                                }
                            }
                        } else {
                            for (int i18 = 0; i18 < size8; i18++) {
                                Object obj = list5.get(i18);
                                if (obj instanceof y61) {
                                    int size10 = ((y61) obj).size();
                                    iC8 = j72.d(size10) + size10 + iC8;
                                } else {
                                    iC8 = j72.b((String) obj) + iC8;
                                }
                            }
                        }
                    }
                    iA4 += iC8;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 27:
                    i6 = i6;
                    List list6 = (List) unsafe.getObject(t56Var2, j2);
                    ffc ffcVarJ2 = cu8Var.j(i7);
                    Class cls7 = kfc.a;
                    int size11 = list6.size();
                    if (size11 == 0) {
                        iC10 = 0;
                    } else {
                        iC10 = j72.c(i9) * size11;
                        for (int i19 = 0; i19 < size11; i19++) {
                            int iG3 = ((h3) ((tt8) list6.get(i19))).g(ffcVarJ2);
                            iC10 += j72.d(iG3) + iG3;
                        }
                    }
                    iA4 += iC10;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 28:
                    i6 = i6;
                    i2 = 0;
                    List list7 = (List) unsafe.getObject(t56Var2, j2);
                    Class cls8 = kfc.a;
                    int size12 = list7.size();
                    if (size12 == 0) {
                        iC8 = i2;
                    } else {
                        iC8 = j72.c(i9) * size12;
                        for (int i20 = 0; i20 < list7.size(); i20++) {
                            int size13 = ((y61) list7.get(i20)).size();
                            iC8 += j72.d(size13) + size13;
                        }
                    }
                    iA4 += iC8;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 29:
                    i6 = i6;
                    i2 = 0;
                    List list8 = (List) unsafe.getObject(t56Var2, j2);
                    Class cls9 = kfc.a;
                    size = list8.size();
                    if (size == 0) {
                        iC8 = i2;
                    } else {
                        i3 = kfc.h(list8);
                        iC9 = j72.c(i9);
                        iC8 = (iC9 * size) + i3;
                    }
                    iA4 += iC8;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 30:
                    i6 = i6;
                    i2 = 0;
                    List list9 = (List) unsafe.getObject(t56Var2, j2);
                    Class cls10 = kfc.a;
                    size = list9.size();
                    if (size == 0) {
                        iC8 = i2;
                    } else {
                        i3 = kfc.a(list9);
                        iC9 = j72.c(i9);
                        iC8 = (iC9 * size) + i3;
                    }
                    iA4 += iC8;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 31:
                    iC7 = kfc.b(i9, (List) unsafe.getObject(t56Var2, j2));
                    iA4 += iC7;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                    iC7 = kfc.c(i9, (List) unsafe.getObject(t56Var2, j2));
                    iA4 += iC7;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 33:
                    i6 = i6;
                    i2 = 0;
                    List list10 = (List) unsafe.getObject(t56Var2, j2);
                    Class cls11 = kfc.a;
                    size = list10.size();
                    if (size == 0) {
                        iC8 = i2;
                    } else {
                        i3 = kfc.f(list10);
                        iC9 = j72.c(i9);
                        iC8 = (iC9 * size) + i3;
                    }
                    iA4 += iC8;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 34:
                    i6 = i6;
                    i2 = 0;
                    List list11 = (List) unsafe.getObject(t56Var2, j2);
                    Class cls12 = kfc.a;
                    size = list11.size();
                    if (size == 0) {
                        iC8 = i2;
                    } else {
                        i3 = kfc.g(list11);
                        iC9 = j72.c(i9);
                        iC8 = (iC9 * size) + i3;
                    }
                    iA4 += iC8;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 35:
                    i6 = i6;
                    List list12 = (List) unsafe.getObject(t56Var2, j2);
                    Class cls13 = kfc.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iC11 = j72.c(i9);
                        iA4 = ib8.a(size2, iC11, size2, iA4);
                    }
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 36:
                    i6 = i6;
                    List list13 = (List) unsafe.getObject(t56Var2, j2);
                    Class cls14 = kfc.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iC11 = j72.c(i9);
                        iA4 = ib8.a(size2, iC11, size2, iA4);
                    }
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 37:
                    i6 = i6;
                    size2 = kfc.e((List) unsafe.getObject(t56Var2, j2));
                    if (size2 > 0) {
                        iC11 = j72.c(i9);
                        iA4 = ib8.a(size2, iC11, size2, iA4);
                    }
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 38:
                    i6 = i6;
                    size2 = kfc.i((List) unsafe.getObject(t56Var2, j2));
                    if (size2 > 0) {
                        iC11 = j72.c(i9);
                        iA4 = ib8.a(size2, iC11, size2, iA4);
                    }
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 39:
                    i6 = i6;
                    size2 = kfc.d((List) unsafe.getObject(t56Var2, j2));
                    if (size2 > 0) {
                        iC11 = j72.c(i9);
                        iA4 = ib8.a(size2, iC11, size2, iA4);
                    }
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 40:
                    i6 = i6;
                    List list14 = (List) unsafe.getObject(t56Var2, j2);
                    Class cls15 = kfc.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iC11 = j72.c(i9);
                        iA4 = ib8.a(size2, iC11, size2, iA4);
                    }
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 41:
                    i6 = i6;
                    List list15 = (List) unsafe.getObject(t56Var2, j2);
                    Class cls16 = kfc.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iC11 = j72.c(i9);
                        iA4 = ib8.a(size2, iC11, size2, iA4);
                    }
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 42:
                    i6 = i6;
                    List list16 = (List) unsafe.getObject(t56Var2, j2);
                    Class cls17 = kfc.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iC11 = j72.c(i9);
                        iA4 = ib8.a(size2, iC11, size2, iA4);
                    }
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 43:
                    i6 = i6;
                    size2 = kfc.h((List) unsafe.getObject(t56Var2, j2));
                    if (size2 > 0) {
                        iC11 = j72.c(i9);
                        iA4 = ib8.a(size2, iC11, size2, iA4);
                    }
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 44:
                    i6 = i6;
                    size2 = kfc.a((List) unsafe.getObject(t56Var2, j2));
                    if (size2 > 0) {
                        iC11 = j72.c(i9);
                        iA4 = ib8.a(size2, iC11, size2, iA4);
                    }
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 45:
                    i6 = i6;
                    List list17 = (List) unsafe.getObject(t56Var2, j2);
                    Class cls18 = kfc.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iC11 = j72.c(i9);
                        iA4 = ib8.a(size2, iC11, size2, iA4);
                    }
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 46:
                    i6 = i6;
                    List list18 = (List) unsafe.getObject(t56Var2, j2);
                    Class cls19 = kfc.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iC11 = j72.c(i9);
                        iA4 = ib8.a(size2, iC11, size2, iA4);
                    }
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 47:
                    i6 = i6;
                    size2 = kfc.f((List) unsafe.getObject(t56Var2, j2));
                    if (size2 > 0) {
                        iC11 = j72.c(i9);
                        iA4 = ib8.a(size2, iC11, size2, iA4);
                    }
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case z7c.f /* 48 */:
                    i6 = i6;
                    size2 = kfc.g((List) unsafe.getObject(t56Var2, j2));
                    if (size2 > 0) {
                        iC11 = j72.c(i9);
                        iA4 = ib8.a(size2, iC11, size2, iA4);
                    }
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 49:
                    i6 = i6;
                    List list19 = (List) unsafe.getObject(t56Var2, j2);
                    ffc ffcVarJ3 = cu8Var.j(i7);
                    Class cls20 = kfc.a;
                    int size14 = list19.size();
                    if (size14 == 0) {
                        iG = 0;
                    } else {
                        iG = 0;
                        for (int i21 = 0; i21 < size14; i21++) {
                            iG += ((h3) ((tt8) list19.get(i21))).g(ffcVarJ3) + (j72.c(i9) * 2);
                        }
                    }
                    iA4 += iG;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(t56Var2, j2);
                    Object obj2 = cu8Var.b[(i7 / 3) * 2];
                    cu8Var.i.getClass();
                    ql8 ql8Var = (ql8) object3;
                    ll8 ll8Var = (ll8) obj2;
                    if (ql8Var.isEmpty()) {
                        iA2 = 0;
                    } else {
                        iA2 = 0;
                        for (Map.Entry entry : ql8Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            ll8Var.getClass();
                            int iC21 = j72.c(i9);
                            gg7 gg7Var = ll8Var.a;
                            char c2 = c;
                            w9g w9gVar2 = (w9g) gg7Var.b;
                            int i22 = wc5.c;
                            int iC22 = j72.c(i12);
                            int i23 = i12;
                            n9g n9gVar = w9g.c;
                            if (w9gVar2 == n9gVar) {
                                iC22 *= 2;
                            }
                            int i24 = i6;
                            switch (w9gVar2.ordinal()) {
                                case 0:
                                    ((Double) key).getClass();
                                    iE2 = 8;
                                    i4 = iE2 + iC22;
                                    w9gVar = (w9g) gg7Var.c;
                                    iC12 = j72.c(2);
                                    if (w9gVar == n9gVar) {
                                        iC12 *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i25 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i25, i25, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i26 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i26, i26, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i27 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i27, i27, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i28 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i28, i28, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = j72.a(((Integer) value).intValue());
                                            int i29 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i29, i29, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i210 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i210, i210, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i211 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211, i211, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i212 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i212, i212, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = j72.b((String) value);
                                            }
                                            int i213 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i213, i213, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((t56) ((tt8) value)).g(null);
                                            int i214 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i214, i214, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size4 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size4);
                                            iE3 = size4 + iD2;
                                            int i215 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i215, i215, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = j72.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i216 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i216, i216, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE3 = j72.d(((Integer) value).intValue());
                                            int i217 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i217, i217, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE3 = j72.a(((k87) value).a());
                                            } else {
                                                iE3 = j72.a(((Integer) value).intValue());
                                            }
                                            int i218 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i218, i218, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i219 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i219, i219, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i2110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2110, i2110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue = ((Integer) value).intValue();
                                            iE3 = j72.d((iIntValue >> 31) ^ (iIntValue << 1));
                                            int i2111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111, i2111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue = ((Long) value).longValue();
                                            iE3 = j72.e((jLongValue << i23) ^ (jLongValue >> c2));
                                            int i2112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2112, i2112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 1:
                                    ((Float) key).getClass();
                                    iE2 = 4;
                                    i4 = iE2 + iC22;
                                    w9gVar = (w9g) gg7Var.c;
                                    iC12 = j72.c(2);
                                    if (w9gVar == n9gVar) {
                                        iC12 *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i2113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2113, i2113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i2114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2114, i2114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i2115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2115, i2115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i2116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2116, i2116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = j72.a(((Integer) value).intValue());
                                            int i2117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2117, i2117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i2118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2118, i2118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i2119 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2119, i2119, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i21110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21110, i21110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = j72.b((String) value);
                                            }
                                            int i21111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111, i21111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((t56) ((tt8) value)).g(null);
                                            int i21112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21112, i21112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size4 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size4);
                                            iE3 = size4 + iD2;
                                            int i21113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21113, i21113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = j72.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i21114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21114, i21114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE3 = j72.d(((Integer) value).intValue());
                                            int i21115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21115, i21115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE3 = j72.a(((k87) value).a());
                                            } else {
                                                iE3 = j72.a(((Integer) value).intValue());
                                            }
                                            int i21116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21116, i21116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i21117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21117, i21117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i21118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21118, i21118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue2 = ((Integer) value).intValue();
                                            iE3 = j72.d((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                                            int i21119 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21119, i21119, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue2 = ((Long) value).longValue();
                                            iE3 = j72.e((jLongValue2 << i23) ^ (jLongValue2 >> c2));
                                            int i211110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211110, i211110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 2:
                                    iE2 = j72.e(((Long) key).longValue());
                                    i4 = iE2 + iC22;
                                    w9gVar = (w9g) gg7Var.c;
                                    iC12 = j72.c(2);
                                    if (w9gVar == n9gVar) {
                                        iC12 *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i211111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111, i211111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i211112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211112, i211112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i211113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211113, i211113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i211114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211114, i211114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = j72.a(((Integer) value).intValue());
                                            int i211115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211115, i211115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i211116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211116, i211116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i211117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211117, i211117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i211118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211118, i211118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = j72.b((String) value);
                                            }
                                            int i211119 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211119, i211119, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((t56) ((tt8) value)).g(null);
                                            int i2111110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111110, i2111110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size4 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size4);
                                            iE3 = size4 + iD2;
                                            int i2111111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111, i2111111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = j72.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i2111112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111112, i2111112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE3 = j72.d(((Integer) value).intValue());
                                            int i2111113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111113, i2111113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE3 = j72.a(((k87) value).a());
                                            } else {
                                                iE3 = j72.a(((Integer) value).intValue());
                                            }
                                            int i2111114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111114, i2111114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i2111115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111115, i2111115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i2111116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111116, i2111116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue3 = ((Integer) value).intValue();
                                            iE3 = j72.d((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                                            int i2111117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111117, i2111117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue3 = ((Long) value).longValue();
                                            iE3 = j72.e((jLongValue3 << i23) ^ (jLongValue3 >> c2));
                                            int i2111118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111118, i2111118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 3:
                                    iE2 = j72.e(((Long) key).longValue());
                                    i4 = iE2 + iC22;
                                    w9gVar = (w9g) gg7Var.c;
                                    iC12 = j72.c(2);
                                    if (w9gVar == n9gVar) {
                                        iC12 *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i2111119 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111119, i2111119, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i21111110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111110, i21111110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i21111111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111, i21111111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i21111112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111112, i21111112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = j72.a(((Integer) value).intValue());
                                            int i21111113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111113, i21111113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i21111114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111114, i21111114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i21111115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111115, i21111115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i21111116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111116, i21111116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = j72.b((String) value);
                                            }
                                            int i21111117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111117, i21111117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((t56) ((tt8) value)).g(null);
                                            int i21111118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111118, i21111118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size4 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size4);
                                            iE3 = size4 + iD2;
                                            int i21111119 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111119, i21111119, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = j72.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i211111110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111110, i211111110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE3 = j72.d(((Integer) value).intValue());
                                            int i211111111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111, i211111111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE3 = j72.a(((k87) value).a());
                                            } else {
                                                iE3 = j72.a(((Integer) value).intValue());
                                            }
                                            int i211111112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111112, i211111112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i211111113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111113, i211111113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i211111114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111114, i211111114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue4 = ((Integer) value).intValue();
                                            iE3 = j72.d((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                                            int i211111115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111115, i211111115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue4 = ((Long) value).longValue();
                                            iE3 = j72.e((jLongValue4 << i23) ^ (jLongValue4 >> c2));
                                            int i211111116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111116, i211111116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 4:
                                    iE2 = j72.a(((Integer) key).intValue());
                                    i4 = iE2 + iC22;
                                    w9gVar = (w9g) gg7Var.c;
                                    iC12 = j72.c(2);
                                    if (w9gVar == n9gVar) {
                                        iC12 *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i211111117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111117, i211111117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i211111118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111118, i211111118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i211111119 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111119, i211111119, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i2111111110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111110, i2111111110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = j72.a(((Integer) value).intValue());
                                            int i2111111111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111, i2111111111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i2111111112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111112, i2111111112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i2111111113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111113, i2111111113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i2111111114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111114, i2111111114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = j72.b((String) value);
                                            }
                                            int i2111111115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111115, i2111111115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((t56) ((tt8) value)).g(null);
                                            int i2111111116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111116, i2111111116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size4 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size4);
                                            iE3 = size4 + iD2;
                                            int i2111111117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111117, i2111111117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = j72.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i2111111118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111118, i2111111118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE3 = j72.d(((Integer) value).intValue());
                                            int i2111111119 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111119, i2111111119, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE3 = j72.a(((k87) value).a());
                                            } else {
                                                iE3 = j72.a(((Integer) value).intValue());
                                            }
                                            int i21111111110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111110, i21111111110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i21111111111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111, i21111111111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i21111111112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111112, i21111111112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue5 = ((Integer) value).intValue();
                                            iE3 = j72.d((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                                            int i21111111113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111113, i21111111113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue5 = ((Long) value).longValue();
                                            iE3 = j72.e((jLongValue5 << i23) ^ (jLongValue5 >> c2));
                                            int i21111111114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111114, i21111111114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 5:
                                    ((Long) key).getClass();
                                    iE2 = 8;
                                    i4 = iE2 + iC22;
                                    w9gVar = (w9g) gg7Var.c;
                                    iC12 = j72.c(2);
                                    if (w9gVar == n9gVar) {
                                        iC12 *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i21111111115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111115, i21111111115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i21111111116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111116, i21111111116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i21111111117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111117, i21111111117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i21111111118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111118, i21111111118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = j72.a(((Integer) value).intValue());
                                            int i21111111119 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111119, i21111111119, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i211111111110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111110, i211111111110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i211111111111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111, i211111111111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i211111111112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111112, i211111111112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = j72.b((String) value);
                                            }
                                            int i211111111113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111113, i211111111113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((t56) ((tt8) value)).g(null);
                                            int i211111111114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111114, i211111111114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size4 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size4);
                                            iE3 = size4 + iD2;
                                            int i211111111115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111115, i211111111115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = j72.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i211111111116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111116, i211111111116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE3 = j72.d(((Integer) value).intValue());
                                            int i211111111117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111117, i211111111117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE3 = j72.a(((k87) value).a());
                                            } else {
                                                iE3 = j72.a(((Integer) value).intValue());
                                            }
                                            int i211111111118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111118, i211111111118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i211111111119 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111119, i211111111119, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i2111111111110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111110, i2111111111110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue6 = ((Integer) value).intValue();
                                            iE3 = j72.d((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                                            int i2111111111111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111, i2111111111111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue6 = ((Long) value).longValue();
                                            iE3 = j72.e((jLongValue6 << i23) ^ (jLongValue6 >> c2));
                                            int i2111111111112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111112, i2111111111112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 6:
                                    ((Integer) key).getClass();
                                    iE2 = 4;
                                    i4 = iE2 + iC22;
                                    w9gVar = (w9g) gg7Var.c;
                                    iC12 = j72.c(2);
                                    if (w9gVar == n9gVar) {
                                        iC12 *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i2111111111113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111113, i2111111111113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i2111111111114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111114, i2111111111114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i2111111111115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111115, i2111111111115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i2111111111116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111116, i2111111111116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = j72.a(((Integer) value).intValue());
                                            int i2111111111117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111117, i2111111111117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i2111111111118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111118, i2111111111118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i2111111111119 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111119, i2111111111119, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i21111111111110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111110, i21111111111110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = j72.b((String) value);
                                            }
                                            int i21111111111111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111, i21111111111111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((t56) ((tt8) value)).g(null);
                                            int i21111111111112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111112, i21111111111112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size4 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size4);
                                            iE3 = size4 + iD2;
                                            int i21111111111113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111113, i21111111111113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = j72.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i21111111111114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111114, i21111111111114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE3 = j72.d(((Integer) value).intValue());
                                            int i21111111111115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111115, i21111111111115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE3 = j72.a(((k87) value).a());
                                            } else {
                                                iE3 = j72.a(((Integer) value).intValue());
                                            }
                                            int i21111111111116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111116, i21111111111116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i21111111111117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111117, i21111111111117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i21111111111118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111118, i21111111111118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue7 = ((Integer) value).intValue();
                                            iE3 = j72.d((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                                            int i21111111111119 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111119, i21111111111119, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue7 = ((Long) value).longValue();
                                            iE3 = j72.e((jLongValue7 << i23) ^ (jLongValue7 >> c2));
                                            int i211111111111110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111110, i211111111111110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 7:
                                    ((Boolean) key).getClass();
                                    iE2 = i23;
                                    i4 = iE2 + iC22;
                                    w9gVar = (w9g) gg7Var.c;
                                    iC12 = j72.c(2);
                                    if (w9gVar == n9gVar) {
                                        iC12 *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i211111111111111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111, i211111111111111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i211111111111112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111112, i211111111111112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i211111111111113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111113, i211111111111113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i211111111111114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111114, i211111111111114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = j72.a(((Integer) value).intValue());
                                            int i211111111111115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111115, i211111111111115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i211111111111116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111116, i211111111111116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i211111111111117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111117, i211111111111117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i211111111111118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111118, i211111111111118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = j72.b((String) value);
                                            }
                                            int i211111111111119 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111119, i211111111111119, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((t56) ((tt8) value)).g(null);
                                            int i2111111111111110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111110, i2111111111111110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size4 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size4);
                                            iE3 = size4 + iD2;
                                            int i2111111111111111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111, i2111111111111111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = j72.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i2111111111111112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111112, i2111111111111112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE3 = j72.d(((Integer) value).intValue());
                                            int i2111111111111113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111113, i2111111111111113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE3 = j72.a(((k87) value).a());
                                            } else {
                                                iE3 = j72.a(((Integer) value).intValue());
                                            }
                                            int i2111111111111114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111114, i2111111111111114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i2111111111111115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111115, i2111111111111115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i2111111111111116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111116, i2111111111111116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue8 = ((Integer) value).intValue();
                                            iE3 = j72.d((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                                            int i2111111111111117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111117, i2111111111111117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue8 = ((Long) value).longValue();
                                            iE3 = j72.e((jLongValue8 << i23) ^ (jLongValue8 >> c2));
                                            int i2111111111111118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111118, i2111111111111118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 8:
                                    if (key instanceof y61) {
                                        size3 = ((y61) key).size();
                                        iD = j72.d(size3);
                                        iE2 = size3 + iD;
                                    } else {
                                        iE2 = j72.b((String) key);
                                    }
                                    i4 = iE2 + iC22;
                                    w9gVar = (w9g) gg7Var.c;
                                    iC12 = j72.c(2);
                                    if (w9gVar == n9gVar) {
                                        iC12 *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i2111111111111119 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111119, i2111111111111119, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i21111111111111110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111110, i21111111111111110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i21111111111111111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111, i21111111111111111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i21111111111111112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111112, i21111111111111112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = j72.a(((Integer) value).intValue());
                                            int i21111111111111113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111113, i21111111111111113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i21111111111111114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111114, i21111111111111114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i21111111111111115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111115, i21111111111111115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i21111111111111116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111116, i21111111111111116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = j72.b((String) value);
                                            }
                                            int i21111111111111117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111117, i21111111111111117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((t56) ((tt8) value)).g(null);
                                            int i21111111111111118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111118, i21111111111111118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size4 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size4);
                                            iE3 = size4 + iD2;
                                            int i21111111111111119 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111119, i21111111111111119, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = j72.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i211111111111111110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111110, i211111111111111110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE3 = j72.d(((Integer) value).intValue());
                                            int i211111111111111111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111, i211111111111111111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE3 = j72.a(((k87) value).a());
                                            } else {
                                                iE3 = j72.a(((Integer) value).intValue());
                                            }
                                            int i211111111111111112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111112, i211111111111111112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i211111111111111113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111113, i211111111111111113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i211111111111111114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111114, i211111111111111114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue9 = ((Integer) value).intValue();
                                            iE3 = j72.d((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                                            int i211111111111111115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111115, i211111111111111115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue9 = ((Long) value).longValue();
                                            iE3 = j72.e((jLongValue9 << i23) ^ (jLongValue9 >> c2));
                                            int i211111111111111116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111116, i211111111111111116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 9:
                                    iE2 = ((t56) ((tt8) key)).g(null);
                                    i4 = iE2 + iC22;
                                    w9gVar = (w9g) gg7Var.c;
                                    iC12 = j72.c(2);
                                    if (w9gVar == n9gVar) {
                                        iC12 *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i211111111111111117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111117, i211111111111111117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i211111111111111118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111118, i211111111111111118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i211111111111111119 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111119, i211111111111111119, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i2111111111111111110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111110, i2111111111111111110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = j72.a(((Integer) value).intValue());
                                            int i2111111111111111111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111, i2111111111111111111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i2111111111111111112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111112, i2111111111111111112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i2111111111111111113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111113, i2111111111111111113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i2111111111111111114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111114, i2111111111111111114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = j72.b((String) value);
                                            }
                                            int i2111111111111111115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111115, i2111111111111111115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((t56) ((tt8) value)).g(null);
                                            int i2111111111111111116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111116, i2111111111111111116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size4 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size4);
                                            iE3 = size4 + iD2;
                                            int i2111111111111111117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111117, i2111111111111111117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = j72.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i2111111111111111118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111118, i2111111111111111118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE3 = j72.d(((Integer) value).intValue());
                                            int i2111111111111111119 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111119, i2111111111111111119, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE3 = j72.a(((k87) value).a());
                                            } else {
                                                iE3 = j72.a(((Integer) value).intValue());
                                            }
                                            int i21111111111111111110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111110, i21111111111111111110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i21111111111111111111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111, i21111111111111111111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i21111111111111111112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111112, i21111111111111111112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue10 = ((Integer) value).intValue();
                                            iE3 = j72.d((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                                            int i21111111111111111113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111113, i21111111111111111113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue10 = ((Long) value).longValue();
                                            iE3 = j72.e((jLongValue10 << i23) ^ (jLongValue10 >> c2));
                                            int i21111111111111111114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111114, i21111111111111111114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                    size3 = ((t56) ((tt8) key)).g(null);
                                    iD = j72.d(size3);
                                    iE2 = size3 + iD;
                                    i4 = iE2 + iC22;
                                    w9gVar = (w9g) gg7Var.c;
                                    iC12 = j72.c(2);
                                    if (w9gVar == n9gVar) {
                                        iC12 *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i21111111111111111115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111115, i21111111111111111115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i21111111111111111116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111116, i21111111111111111116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i21111111111111111117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111117, i21111111111111111117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i21111111111111111118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111118, i21111111111111111118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = j72.a(((Integer) value).intValue());
                                            int i21111111111111111119 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111119, i21111111111111111119, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i211111111111111111110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111110, i211111111111111111110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i211111111111111111111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111, i211111111111111111111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i211111111111111111112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111112, i211111111111111111112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = j72.b((String) value);
                                            }
                                            int i211111111111111111113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111113, i211111111111111111113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((t56) ((tt8) value)).g(null);
                                            int i211111111111111111114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111114, i211111111111111111114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size4 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size4);
                                            iE3 = size4 + iD2;
                                            int i211111111111111111115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111115, i211111111111111111115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = j72.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i211111111111111111116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111116, i211111111111111111116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE3 = j72.d(((Integer) value).intValue());
                                            int i211111111111111111117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111117, i211111111111111111117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE3 = j72.a(((k87) value).a());
                                            } else {
                                                iE3 = j72.a(((Integer) value).intValue());
                                            }
                                            int i211111111111111111118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111118, i211111111111111111118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i211111111111111111119 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111119, i211111111111111111119, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i2111111111111111111110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111110, i2111111111111111111110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue11 = ((Integer) value).intValue();
                                            iE3 = j72.d((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                                            int i2111111111111111111111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111, i2111111111111111111111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue11 = ((Long) value).longValue();
                                            iE3 = j72.e((jLongValue11 << i23) ^ (jLongValue11 >> c2));
                                            int i2111111111111111111112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111112, i2111111111111111111112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                    if (key instanceof y61) {
                                        size3 = ((y61) key).size();
                                        iD = j72.d(size3);
                                    } else {
                                        size3 = ((byte[]) key).length;
                                        iD = j72.d(size3);
                                    }
                                    iE2 = size3 + iD;
                                    i4 = iE2 + iC22;
                                    w9gVar = (w9g) gg7Var.c;
                                    iC12 = j72.c(2);
                                    if (w9gVar == n9gVar) {
                                        iC12 *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i2111111111111111111113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111113, i2111111111111111111113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i2111111111111111111114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111114, i2111111111111111111114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i2111111111111111111115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111115, i2111111111111111111115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i2111111111111111111116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111116, i2111111111111111111116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = j72.a(((Integer) value).intValue());
                                            int i2111111111111111111117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111117, i2111111111111111111117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i2111111111111111111118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111118, i2111111111111111111118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i2111111111111111111119 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111119, i2111111111111111111119, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i21111111111111111111110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111110, i21111111111111111111110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = j72.b((String) value);
                                            }
                                            int i21111111111111111111111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111, i21111111111111111111111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((t56) ((tt8) value)).g(null);
                                            int i21111111111111111111112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111112, i21111111111111111111112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size4 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size4);
                                            iE3 = size4 + iD2;
                                            int i21111111111111111111113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111113, i21111111111111111111113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = j72.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i21111111111111111111114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111114, i21111111111111111111114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE3 = j72.d(((Integer) value).intValue());
                                            int i21111111111111111111115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111115, i21111111111111111111115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE3 = j72.a(((k87) value).a());
                                            } else {
                                                iE3 = j72.a(((Integer) value).intValue());
                                            }
                                            int i21111111111111111111116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111116, i21111111111111111111116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i21111111111111111111117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111117, i21111111111111111111117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i21111111111111111111118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111118, i21111111111111111111118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue12 = ((Integer) value).intValue();
                                            iE3 = j72.d((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                                            int i21111111111111111111119 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111119, i21111111111111111111119, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue12 = ((Long) value).longValue();
                                            iE3 = j72.e((jLongValue12 << i23) ^ (jLongValue12 >> c2));
                                            int i211111111111111111111110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111110, i211111111111111111111110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                    iE2 = j72.d(((Integer) key).intValue());
                                    i4 = iE2 + iC22;
                                    w9gVar = (w9g) gg7Var.c;
                                    iC12 = j72.c(2);
                                    if (w9gVar == n9gVar) {
                                        iC12 *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i211111111111111111111111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111, i211111111111111111111111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i211111111111111111111112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111112, i211111111111111111111112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i211111111111111111111113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111113, i211111111111111111111113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i211111111111111111111114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111114, i211111111111111111111114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = j72.a(((Integer) value).intValue());
                                            int i211111111111111111111115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111115, i211111111111111111111115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i211111111111111111111116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111116, i211111111111111111111116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i211111111111111111111117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111117, i211111111111111111111117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i211111111111111111111118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111118, i211111111111111111111118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = j72.b((String) value);
                                            }
                                            int i211111111111111111111119 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111119, i211111111111111111111119, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((t56) ((tt8) value)).g(null);
                                            int i2111111111111111111111110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111110, i2111111111111111111111110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size4 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size4);
                                            iE3 = size4 + iD2;
                                            int i2111111111111111111111111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111111, i2111111111111111111111111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = j72.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i2111111111111111111111112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111112, i2111111111111111111111112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE3 = j72.d(((Integer) value).intValue());
                                            int i2111111111111111111111113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111113, i2111111111111111111111113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE3 = j72.a(((k87) value).a());
                                            } else {
                                                iE3 = j72.a(((Integer) value).intValue());
                                            }
                                            int i2111111111111111111111114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111114, i2111111111111111111111114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i2111111111111111111111115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111115, i2111111111111111111111115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i2111111111111111111111116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111116, i2111111111111111111111116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue13 = ((Integer) value).intValue();
                                            iE3 = j72.d((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                                            int i2111111111111111111111117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111117, i2111111111111111111111117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue13 = ((Long) value).longValue();
                                            iE3 = j72.e((jLongValue13 << i23) ^ (jLongValue13 >> c2));
                                            int i2111111111111111111111118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111118, i2111111111111111111111118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                    iE2 = key instanceof k87 ? j72.a(((k87) key).a()) : j72.a(((Integer) key).intValue());
                                    i4 = iE2 + iC22;
                                    w9gVar = (w9g) gg7Var.c;
                                    iC12 = j72.c(2);
                                    if (w9gVar == n9gVar) {
                                        iC12 *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i2111111111111111111111119 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111119, i2111111111111111111111119, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i21111111111111111111111110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111110, i21111111111111111111111110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i21111111111111111111111111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111111, i21111111111111111111111111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i21111111111111111111111112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111112, i21111111111111111111111112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = j72.a(((Integer) value).intValue());
                                            int i21111111111111111111111113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111113, i21111111111111111111111113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i21111111111111111111111114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111114, i21111111111111111111111114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i21111111111111111111111115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111115, i21111111111111111111111115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i21111111111111111111111116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111116, i21111111111111111111111116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = j72.b((String) value);
                                            }
                                            int i21111111111111111111111117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111117, i21111111111111111111111117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((t56) ((tt8) value)).g(null);
                                            int i21111111111111111111111118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111118, i21111111111111111111111118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size4 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size4);
                                            iE3 = size4 + iD2;
                                            int i21111111111111111111111119 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111119, i21111111111111111111111119, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = j72.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i211111111111111111111111110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111110, i211111111111111111111111110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE3 = j72.d(((Integer) value).intValue());
                                            int i211111111111111111111111111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111111, i211111111111111111111111111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE3 = j72.a(((k87) value).a());
                                            } else {
                                                iE3 = j72.a(((Integer) value).intValue());
                                            }
                                            int i211111111111111111111111112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111112, i211111111111111111111111112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i211111111111111111111111113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111113, i211111111111111111111111113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i211111111111111111111111114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111114, i211111111111111111111111114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue14 = ((Integer) value).intValue();
                                            iE3 = j72.d((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                                            int i211111111111111111111111115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111115, i211111111111111111111111115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue14 = ((Long) value).longValue();
                                            iE3 = j72.e((jLongValue14 << i23) ^ (jLongValue14 >> c2));
                                            int i211111111111111111111111116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111116, i211111111111111111111111116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 14:
                                    ((Integer) key).getClass();
                                    iE2 = 4;
                                    i4 = iE2 + iC22;
                                    w9gVar = (w9g) gg7Var.c;
                                    iC12 = j72.c(2);
                                    if (w9gVar == n9gVar) {
                                        iC12 *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i211111111111111111111111117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111117, i211111111111111111111111117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i211111111111111111111111118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111118, i211111111111111111111111118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i211111111111111111111111119 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111119, i211111111111111111111111119, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i2111111111111111111111111110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111111110, i2111111111111111111111111110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = j72.a(((Integer) value).intValue());
                                            int i2111111111111111111111111111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111111111, i2111111111111111111111111111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i2111111111111111111111111112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111111112, i2111111111111111111111111112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i2111111111111111111111111113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111111113, i2111111111111111111111111113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i2111111111111111111111111114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111111114, i2111111111111111111111111114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = j72.b((String) value);
                                            }
                                            int i2111111111111111111111111115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111111115, i2111111111111111111111111115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((t56) ((tt8) value)).g(null);
                                            int i2111111111111111111111111116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111111116, i2111111111111111111111111116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size4 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size4);
                                            iE3 = size4 + iD2;
                                            int i2111111111111111111111111117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111111117, i2111111111111111111111111117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = j72.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i2111111111111111111111111118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111111118, i2111111111111111111111111118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE3 = j72.d(((Integer) value).intValue());
                                            int i2111111111111111111111111119 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111111119, i2111111111111111111111111119, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE3 = j72.a(((k87) value).a());
                                            } else {
                                                iE3 = j72.a(((Integer) value).intValue());
                                            }
                                            int i21111111111111111111111111110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111111110, i21111111111111111111111111110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i21111111111111111111111111111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111111111, i21111111111111111111111111111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i21111111111111111111111111112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111111112, i21111111111111111111111111112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue15 = ((Integer) value).intValue();
                                            iE3 = j72.d((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                                            int i21111111111111111111111111113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111111113, i21111111111111111111111111113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue15 = ((Long) value).longValue();
                                            iE3 = j72.e((jLongValue15 << i23) ^ (jLongValue15 >> c2));
                                            int i21111111111111111111111111114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111111114, i21111111111111111111111111114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 15:
                                    ((Long) key).getClass();
                                    iE2 = 8;
                                    i4 = iE2 + iC22;
                                    w9gVar = (w9g) gg7Var.c;
                                    iC12 = j72.c(2);
                                    if (w9gVar == n9gVar) {
                                        iC12 *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i21111111111111111111111111115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111111115, i21111111111111111111111111115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i21111111111111111111111111116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111111116, i21111111111111111111111111116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i21111111111111111111111111117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111111117, i21111111111111111111111111117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i21111111111111111111111111118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111111118, i21111111111111111111111111118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = j72.a(((Integer) value).intValue());
                                            int i21111111111111111111111111119 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111111119, i21111111111111111111111111119, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i211111111111111111111111111110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111111110, i211111111111111111111111111110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i211111111111111111111111111111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111111111, i211111111111111111111111111111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i211111111111111111111111111112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111111112, i211111111111111111111111111112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = j72.b((String) value);
                                            }
                                            int i211111111111111111111111111113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111111113, i211111111111111111111111111113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((t56) ((tt8) value)).g(null);
                                            int i211111111111111111111111111114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111111114, i211111111111111111111111111114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size4 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size4);
                                            iE3 = size4 + iD2;
                                            int i211111111111111111111111111115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111111115, i211111111111111111111111111115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = j72.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i211111111111111111111111111116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111111116, i211111111111111111111111111116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE3 = j72.d(((Integer) value).intValue());
                                            int i211111111111111111111111111117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111111117, i211111111111111111111111111117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE3 = j72.a(((k87) value).a());
                                            } else {
                                                iE3 = j72.a(((Integer) value).intValue());
                                            }
                                            int i211111111111111111111111111118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111111118, i211111111111111111111111111118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i211111111111111111111111111119 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111111119, i211111111111111111111111111119, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i2111111111111111111111111111110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111111111110, i2111111111111111111111111111110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue16 = ((Integer) value).intValue();
                                            iE3 = j72.d((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                                            int i2111111111111111111111111111111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111111111111, i2111111111111111111111111111111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue16 = ((Long) value).longValue();
                                            iE3 = j72.e((jLongValue16 << i23) ^ (jLongValue16 >> c2));
                                            int i2111111111111111111111111111112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111111111112, i2111111111111111111111111111112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                    int iIntValue17 = ((Integer) key).intValue();
                                    iE2 = j72.d((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                                    i4 = iE2 + iC22;
                                    w9gVar = (w9g) gg7Var.c;
                                    iC12 = j72.c(2);
                                    if (w9gVar == n9gVar) {
                                        iC12 *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i2111111111111111111111111111113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111111111113, i2111111111111111111111111111113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i2111111111111111111111111111114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111111111114, i2111111111111111111111111111114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i2111111111111111111111111111115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111111111115, i2111111111111111111111111111115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i2111111111111111111111111111116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111111111116, i2111111111111111111111111111116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = j72.a(((Integer) value).intValue());
                                            int i2111111111111111111111111111117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111111111117, i2111111111111111111111111111117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i2111111111111111111111111111118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111111111118, i2111111111111111111111111111118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i2111111111111111111111111111119 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111111111119, i2111111111111111111111111111119, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i21111111111111111111111111111110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111111111110, i21111111111111111111111111111110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = j72.b((String) value);
                                            }
                                            int i21111111111111111111111111111111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111111111111, i21111111111111111111111111111111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((t56) ((tt8) value)).g(null);
                                            int i21111111111111111111111111111112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111111111112, i21111111111111111111111111111112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size4 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size4);
                                            iE3 = size4 + iD2;
                                            int i21111111111111111111111111111113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111111111113, i21111111111111111111111111111113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = j72.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i21111111111111111111111111111114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111111111114, i21111111111111111111111111111114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE3 = j72.d(((Integer) value).intValue());
                                            int i21111111111111111111111111111115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111111111115, i21111111111111111111111111111115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE3 = j72.a(((k87) value).a());
                                            } else {
                                                iE3 = j72.a(((Integer) value).intValue());
                                            }
                                            int i21111111111111111111111111111116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111111111116, i21111111111111111111111111111116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i21111111111111111111111111111117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111111111117, i21111111111111111111111111111117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i21111111111111111111111111111118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111111111118, i21111111111111111111111111111118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue18 = ((Integer) value).intValue();
                                            iE3 = j72.d((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                                            int i21111111111111111111111111111119 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i21111111111111111111111111111119, i21111111111111111111111111111119, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue17 = ((Long) value).longValue();
                                            iE3 = j72.e((jLongValue17 << i23) ^ (jLongValue17 >> c2));
                                            int i211111111111111111111111111111110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111111111110, i211111111111111111111111111111110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                case 17:
                                    long jLongValue18 = ((Long) key).longValue();
                                    iE2 = j72.e((jLongValue18 << i23) ^ (jLongValue18 >> c2));
                                    i4 = iE2 + iC22;
                                    w9gVar = (w9g) gg7Var.c;
                                    iC12 = j72.c(2);
                                    if (w9gVar == n9gVar) {
                                        iC12 *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE3 = 8;
                                            int i211111111111111111111111111111111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111111111111, i211111111111111111111111111111111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE3 = 4;
                                            int i211111111111111111111111111111112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111111111112, i211111111111111111111111111111112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 2:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i211111111111111111111111111111113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111111111113, i211111111111111111111111111111113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 3:
                                            iE3 = j72.e(((Long) value).longValue());
                                            int i211111111111111111111111111111114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111111111114, i211111111111111111111111111111114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 4:
                                            iE3 = j72.a(((Integer) value).intValue());
                                            int i211111111111111111111111111111115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111111111115, i211111111111111111111111111111115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i211111111111111111111111111111116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111111111116, i211111111111111111111111111111116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i211111111111111111111111111111117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111111111117, i211111111111111111111111111111117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE3 = i23;
                                            int i211111111111111111111111111111118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111111111118, i211111111111111111111111111111118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                                iE3 = size4 + iD2;
                                            } else {
                                                iE3 = j72.b((String) value);
                                            }
                                            int i211111111111111111111111111111119 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i211111111111111111111111111111119, i211111111111111111111111111111119, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 9:
                                            iE3 = ((t56) ((tt8) value)).g(null);
                                            int i2111111111111111111111111111111110 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111111111111110, i2111111111111111111111111111111110, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size4 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size4);
                                            iE3 = size4 + iD2;
                                            int i2111111111111111111111111111111111 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111111111111111, i2111111111111111111111111111111111, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size4 = ((y61) value).size();
                                                iD2 = j72.d(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                iD2 = j72.d(size4);
                                            }
                                            iE3 = size4 + iD2;
                                            int i2111111111111111111111111111111112 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111111111111112, i2111111111111111111111111111111112, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE3 = j72.d(((Integer) value).intValue());
                                            int i2111111111111111111111111111111113 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111111111111113, i2111111111111111111111111111111113, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE3 = j72.a(((k87) value).a());
                                            } else {
                                                iE3 = j72.a(((Integer) value).intValue());
                                            }
                                            int i2111111111111111111111111111111114 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111111111111114, i2111111111111111111111111111111114, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE3 = 4;
                                            int i2111111111111111111111111111111115 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111111111111115, i2111111111111111111111111111111115, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE3 = 8;
                                            int i2111111111111111111111111111111116 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111111111111116, i2111111111111111111111111111111116, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue19 = ((Integer) value).intValue();
                                            iE3 = j72.d((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                                            int i2111111111111111111111111111111117 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111111111111117, i2111111111111111111111111111111117, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        case 17:
                                            long jLongValue19 = ((Long) value).longValue();
                                            iE3 = j72.e((jLongValue19 << i23) ^ (jLongValue19 >> c2));
                                            int i2111111111111111111111111111111118 = iE3 + iC12 + i4;
                                            iA2 = ib8.a(i2111111111111111111111111111111118, i2111111111111111111111111111111118, iC21, iA2);
                                            c = c2;
                                            i12 = i23;
                                            i6 = i24;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            return 0;
                                    }
                                    break;
                                default:
                                    ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                    return 0;
                            }
                        }
                    }
                    i6 = i6;
                    iA4 += iA2;
                    i6 = i6;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 51:
                    if (cu8Var.n(i9, t56Var2, i7)) {
                        iC13 = j72.c(i9);
                        iC17 = iC13 + 8;
                        iA4 += iC17;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 52:
                    if (cu8Var.n(i9, t56Var2, i7)) {
                        iC14 = j72.c(i9);
                        iC17 = iC14 + 4;
                        iA4 += iC17;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 53:
                    if (cu8Var.n(i9, t56Var2, i7)) {
                        long jS = s(j2, t56Var2);
                        iC15 = j72.c(i9);
                        iE4 = j72.e(jS);
                        iA4 += iE4 + iC15;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 54:
                    if (cu8Var.n(i9, t56Var2, i7)) {
                        long jS2 = s(j2, t56Var2);
                        iC15 = j72.c(i9);
                        iE4 = j72.e(jS2);
                        iA4 += iE4 + iC15;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 55:
                    if (cu8Var.n(i9, t56Var2, i7)) {
                        int iR = r(j2, t56Var2);
                        iC16 = j72.c(i9);
                        iA3 = j72.a(iR);
                        iC17 = iA3 + iC16;
                        iA4 += iC17;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 56:
                    if (cu8Var.n(i9, t56Var2, i7)) {
                        iC13 = j72.c(i9);
                        iC17 = iC13 + 8;
                        iA4 += iC17;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 57:
                    if (cu8Var.n(i9, t56Var2, i7)) {
                        iC14 = j72.c(i9);
                        iC17 = iC14 + 4;
                        iA4 += iC17;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 58:
                    if (cu8Var.n(i9, t56Var2, i7)) {
                        iC17 = j72.c(i9) + 1;
                        iA4 += iC17;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 59:
                    if (cu8Var.n(i9, t56Var2, i7)) {
                        Object object4 = unsafe.getObject(t56Var2, j2);
                        if (object4 instanceof y61) {
                            int iC23 = j72.c(i9);
                            int size15 = ((y61) object4).size();
                            iB2 = ib8.a(size15, size15, iC23, iA4);
                        } else {
                            iB2 = j72.b((String) object4) + j72.c(i9) + iA4;
                        }
                        iA4 = iB2;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 60:
                    if (cu8Var.n(i9, t56Var2, i7)) {
                        Object object5 = unsafe.getObject(t56Var2, j2);
                        ffc ffcVarJ4 = cu8Var.j(i7);
                        Class cls21 = kfc.a;
                        int iC24 = j72.c(i9);
                        int iG4 = ((h3) ((tt8) object5)).g(ffcVarJ4);
                        iA4 = ib8.a(iG4, iG4, iC24, iA4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 61:
                    if (cu8Var.n(i9, t56Var2, i7)) {
                        y61 y61Var2 = (y61) unsafe.getObject(t56Var2, j2);
                        int iC25 = j72.c(i9);
                        int size16 = y61Var2.size();
                        iA4 = ib8.a(size16, size16, iC25, iA4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 62:
                    if (cu8Var.n(i9, t56Var2, i7)) {
                        int iR2 = r(j2, t56Var2);
                        iC16 = j72.c(i9);
                        iA3 = j72.d(iR2);
                        iC17 = iA3 + iC16;
                        iA4 += iC17;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 63:
                    if (cu8Var.n(i9, t56Var2, i7)) {
                        int iR3 = r(j2, t56Var2);
                        iC16 = j72.c(i9);
                        iA3 = j72.a(iR3);
                        iC17 = iA3 + iC16;
                        iA4 += iC17;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                    if (cu8Var.n(i9, t56Var2, i7)) {
                        iC14 = j72.c(i9);
                        iC17 = iC14 + 4;
                        iA4 += iC17;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 65:
                    if (cu8Var.n(i9, t56Var2, i7)) {
                        iC13 = j72.c(i9);
                        iC17 = iC13 + 8;
                        iA4 += iC17;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 66:
                    if (cu8Var.n(i9, t56Var2, i7)) {
                        int iR4 = r(j2, t56Var2);
                        iC16 = j72.c(i9);
                        iA3 = j72.d((iR4 >> 31) ^ (iR4 << 1));
                        iC17 = iA3 + iC16;
                        iA4 += iC17;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 67:
                    if (cu8Var.n(i9, t56Var2, i7)) {
                        long jS3 = s(j2, t56Var2);
                        iC15 = j72.c(i9);
                        iE4 = j72.e((jS3 << 1) ^ (jS3 >> 63));
                        iA4 += iE4 + iC15;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 68:
                    if (cu8Var.n(i9, t56Var2, i7)) {
                        iC17 = ((h3) ((tt8) unsafe.getObject(t56Var2, j2))).g(cu8Var.j(i7)) + (j72.c(i9) * 2);
                        iA4 += iC17;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                default:
                    i7 += 3;
                    i5 = 1048575;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d7 A[PHI: r3
  0x00d7: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x01f0, B:41:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.ffc
    public final int f(t56 t56Var) {
        int i;
        int iA;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iW = w(i4);
            int i5 = iArr[i4];
            long j2 = 1048575 & iW;
            int i6 = 1237;
            int iHashCode = 37;
            switch (v(iW)) {
                case 0:
                    i = i3 * 53;
                    iA = p87.a(Double.doubleToLongBits(wff.c.c(j2, t56Var)));
                    i3 = iA + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iA = Float.floatToIntBits(wff.c.d(j2, t56Var));
                    i3 = iA + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iA = p87.a(wff.i(j2, t56Var));
                    i3 = iA + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iA = p87.a(wff.i(j2, t56Var));
                    i3 = iA + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iA = wff.h(j2, t56Var);
                    i3 = iA + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iA = p87.a(wff.i(j2, t56Var));
                    i3 = iA + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iA = wff.h(j2, t56Var);
                    i3 = iA + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zA = wff.c.a(j2, t56Var);
                    Charset charset = p87.a;
                    if (zA) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iA = ((String) wff.j(j2, t56Var)).hashCode();
                    i3 = iA + i;
                    break;
                case 9:
                    Object objJ = wff.j(j2, t56Var);
                    if (objJ != null) {
                        iHashCode = objJ.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    i = i3 * 53;
                    iA = wff.j(j2, t56Var).hashCode();
                    i3 = iA + i;
                    break;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    i = i3 * 53;
                    iA = wff.h(j2, t56Var);
                    i3 = iA + i;
                    break;
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    i = i3 * 53;
                    iA = wff.h(j2, t56Var);
                    i3 = iA + i;
                    break;
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    i = i3 * 53;
                    iA = wff.h(j2, t56Var);
                    i3 = iA + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iA = p87.a(wff.i(j2, t56Var));
                    i3 = iA + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iA = wff.h(j2, t56Var);
                    i3 = iA + i;
                    break;
                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                    i = i3 * 53;
                    iA = p87.a(wff.i(j2, t56Var));
                    i3 = iA + i;
                    break;
                case 17:
                    Object objJ2 = wff.j(j2, t56Var);
                    if (objJ2 != null) {
                        iHashCode = objJ2.hashCode();
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
                    iA = wff.j(j2, t56Var).hashCode();
                    i3 = iA + i;
                    break;
                case 50:
                    i = i3 * 53;
                    iA = wff.j(j2, t56Var).hashCode();
                    i3 = iA + i;
                    break;
                case 51:
                    if (n(i5, t56Var, i4)) {
                        i = i3 * 53;
                        iA = p87.a(Double.doubleToLongBits(((Double) wff.j(j2, t56Var)).doubleValue()));
                        i3 = iA + i;
                    }
                    break;
                case 52:
                    if (n(i5, t56Var, i4)) {
                        i = i3 * 53;
                        iA = Float.floatToIntBits(((Float) wff.j(j2, t56Var)).floatValue());
                        i3 = iA + i;
                    }
                    break;
                case 53:
                    if (n(i5, t56Var, i4)) {
                        i = i3 * 53;
                        iA = p87.a(s(j2, t56Var));
                        i3 = iA + i;
                    }
                    break;
                case 54:
                    if (n(i5, t56Var, i4)) {
                        i = i3 * 53;
                        iA = p87.a(s(j2, t56Var));
                        i3 = iA + i;
                    }
                    break;
                case 55:
                    if (n(i5, t56Var, i4)) {
                        i = i3 * 53;
                        iA = r(j2, t56Var);
                        i3 = iA + i;
                    }
                    break;
                case 56:
                    if (n(i5, t56Var, i4)) {
                        i = i3 * 53;
                        iA = p87.a(s(j2, t56Var));
                        i3 = iA + i;
                    }
                    break;
                case 57:
                    if (n(i5, t56Var, i4)) {
                        i = i3 * 53;
                        iA = r(j2, t56Var);
                        i3 = iA + i;
                    }
                    break;
                case 58:
                    if (n(i5, t56Var, i4)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) wff.j(j2, t56Var)).booleanValue();
                        Charset charset2 = p87.a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (n(i5, t56Var, i4)) {
                        i = i3 * 53;
                        iA = ((String) wff.j(j2, t56Var)).hashCode();
                        i3 = iA + i;
                    }
                    break;
                case 60:
                    if (n(i5, t56Var, i4)) {
                        i = i3 * 53;
                        iA = wff.j(j2, t56Var).hashCode();
                        i3 = iA + i;
                    }
                    break;
                case 61:
                    if (n(i5, t56Var, i4)) {
                        i = i3 * 53;
                        iA = wff.j(j2, t56Var).hashCode();
                        i3 = iA + i;
                    }
                    break;
                case 62:
                    if (n(i5, t56Var, i4)) {
                        i = i3 * 53;
                        iA = r(j2, t56Var);
                        i3 = iA + i;
                    }
                    break;
                case 63:
                    if (n(i5, t56Var, i4)) {
                        i = i3 * 53;
                        iA = r(j2, t56Var);
                        i3 = iA + i;
                    }
                    break;
                case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                    if (n(i5, t56Var, i4)) {
                        i = i3 * 53;
                        iA = r(j2, t56Var);
                        i3 = iA + i;
                    }
                    break;
                case 65:
                    if (n(i5, t56Var, i4)) {
                        i = i3 * 53;
                        iA = p87.a(s(j2, t56Var));
                        i3 = iA + i;
                    }
                    break;
                case 66:
                    if (n(i5, t56Var, i4)) {
                        i = i3 * 53;
                        iA = r(j2, t56Var);
                        i3 = iA + i;
                    }
                    break;
                case 67:
                    if (n(i5, t56Var, i4)) {
                        i = i3 * 53;
                        iA = p87.a(s(j2, t56Var));
                        i3 = iA + i;
                    }
                    break;
                case 68:
                    if (n(i5, t56Var, i4)) {
                        i = i3 * 53;
                        iA = wff.j(j2, t56Var).hashCode();
                        i3 = iA + i;
                    }
                    break;
            }
        }
        ((dff) this.h).getClass();
        return t56Var.unknownFields.hashCode() + (i3 * 53);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:120:0x0338  */
    /* JADX WARN: Code duplicated, block: B:125:0x0345  */
    /* JADX WARN: Code duplicated, block: B:126:0x0359  */
    /* JADX WARN: Code duplicated, block: B:127:0x036a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0373  */
    /* JADX WARN: Code duplicated, block: B:131:0x037c  */
    /* JADX WARN: Code duplicated, block: B:133:0x0380  */
    /* JADX WARN: Code duplicated, block: B:134:0x038c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0398  */
    /* JADX WARN: Code duplicated, block: B:136:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:138:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:140:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:141:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:142:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:143:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:145:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:146:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:147:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:148:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:149:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:150:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:151:0x040a  */
    /* JADX WARN: Code duplicated, block: B:152:0x0415  */
    /* JADX WARN: Code duplicated, block: B:153:0x0420  */
    /* JADX WARN: Code duplicated, block: B:154:0x0427  */
    /* JADX WARN: Code duplicated, block: B:16:0x0052 A[PHI: r2 r3
  0x0052: PHI (r2v79 int) = 
  (r2v2 int)
  (r2v2 int)
  (r2v2 int)
  (r2v2 int)
  (r2v2 int)
  (r2v36 int)
  (r2v2 int)
  (r2v2 int)
  (r2v2 int)
  (r2v2 int)
  (r2v2 int)
  (r2v2 int)
  (r2v2 int)
  (r2v2 int)
  (r2v2 int)
  (r2v2 int)
  (r2v2 int)
  (r2v2 int)
  (r2v2 int)
  (r2v2 int)
  (r2v2 int)
  (r2v2 int)
  (r2v2 int)
  (r2v2 int)
  (r2v2 int)
  (r2v2 int)
  (r2v2 int)
  (r2v2 int)
  (r2v2 int)
  (r2v2 int)
  (r2v2 int)
  (r2v2 int)
  (r2v2 int)
  (r2v2 int)
  (r2v2 int)
 binds: [B:15:0x004f, B:256:0x07d9, B:257:0x07db, B:230:0x0735, B:231:0x0737, B:157:0x044f, B:73:0x01c5, B:74:0x01c7, B:70:0x01a8, B:71:0x01aa, B:68:0x0198, B:61:0x016f, B:58:0x015c, B:59:0x015e, B:55:0x0149, B:56:0x014b, B:52:0x012f, B:53:0x0131, B:46:0x010d, B:50:0x0121, B:49:0x0117, B:43:0x00fa, B:44:0x00fc, B:40:0x00e6, B:41:0x00e8, B:38:0x00d6, B:34:0x00c0, B:31:0x00ae, B:32:0x00b0, B:28:0x009b, B:29:0x009d, B:26:0x0087, B:21:0x006b, B:18:0x0059, B:19:0x005b] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r3v101 int) = 
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v68 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
  (r3v2 int)
 binds: [B:15:0x004f, B:256:0x07d9, B:257:0x07db, B:230:0x0735, B:231:0x0737, B:157:0x044f, B:73:0x01c5, B:74:0x01c7, B:70:0x01a8, B:71:0x01aa, B:68:0x0198, B:61:0x016f, B:58:0x015c, B:59:0x015e, B:55:0x0149, B:56:0x014b, B:52:0x012f, B:53:0x0131, B:46:0x010d, B:50:0x0121, B:49:0x0117, B:43:0x00fa, B:44:0x00fc, B:40:0x00e6, B:41:0x00e8, B:38:0x00d6, B:34:0x00c0, B:31:0x00ae, B:32:0x00b0, B:28:0x009b, B:29:0x009d, B:26:0x0087, B:21:0x006b, B:18:0x0059, B:19:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:236:0x0760  */
    /* JADX WARN: Code duplicated, block: B:293:0x0341 A[SYNTHETIC] */
    @Override // defpackage.ffc
    public final void g(Object obj, kb6 kb6Var) throws k72 {
        int i;
        int i2;
        int i3;
        int iE;
        int size;
        int iD;
        int iG;
        int i4;
        int iC;
        int iE2;
        int size2;
        int iD2;
        boolean z;
        cu8 cu8Var = this;
        kb6Var.getClass();
        j72 j72Var = (j72) kb6Var.b;
        int[] iArr = cu8Var.a;
        int length = iArr.length;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int iW = cu8Var.w(i7);
            int i9 = iArr[i7];
            int iV = v(iW);
            Unsafe unsafe = k;
            if (iV <= 17) {
                int i10 = iArr[i7 + 2];
                int i11 = i10 & i5;
                if (i11 != i6) {
                    i8 = i11 == i5 ? 0 : unsafe.getInt(obj, i11);
                    i6 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            long j2 = iW & i5;
            int i12 = 2;
            switch (iV) {
                case 0:
                    if (cu8Var.k(i7, i6, i8, i, obj)) {
                        long jDoubleToRawLongBits = Double.doubleToRawLongBits(wff.c.c(j2, obj));
                        j72Var.m(i9, 1);
                        j72Var.j(jDoubleToRawLongBits);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 1:
                    if (cu8Var.k(i7, i6, i8, i, obj)) {
                        int iFloatToRawIntBits = Float.floatToRawIntBits(wff.c.d(j2, obj));
                        j72Var.m(i9, 5);
                        j72Var.i(iFloatToRawIntBits);
                    }
                    cu8Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 2:
                    if (cu8Var.k(i7, i6, i8, i, obj)) {
                        long j3 = unsafe.getLong(obj, j2);
                        j72Var.m(i9, 0);
                        j72Var.o(j3);
                    }
                    cu8Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 3:
                    if (cu8Var.k(i7, i6, i8, i, obj)) {
                        long j4 = unsafe.getLong(obj, j2);
                        j72Var.m(i9, 0);
                        j72Var.o(j4);
                    }
                    cu8Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 4:
                    if (cu8Var.k(i7, i6, i8, i, obj)) {
                        int i13 = unsafe.getInt(obj, j2);
                        j72Var.m(i9, 0);
                        j72Var.k(i13);
                    }
                    cu8Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 5:
                    if (cu8Var.k(i7, i6, i8, i, obj)) {
                        long j5 = unsafe.getLong(obj, j2);
                        j72Var.m(i9, 1);
                        j72Var.j(j5);
                    }
                    cu8Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 6:
                    if (cu8Var.k(i7, i6, i8, i, obj)) {
                        int i14 = unsafe.getInt(obj, j2);
                        j72Var.m(i9, 5);
                        j72Var.i(i14);
                    }
                    cu8Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 7:
                    if (cu8Var.k(i7, i6, i8, i, obj)) {
                        boolean zA = wff.c.a(j2, obj);
                        j72Var.m(i9, 0);
                        j72Var.f(zA ? (byte) 1 : (byte) 0);
                    }
                    cu8Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 8:
                    if (cu8Var.k(i7, i6, i8, i, obj)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            j72Var.m(i9, 2);
                            j72Var.l((String) object);
                        } else {
                            j72Var.m(i9, 2);
                            j72Var.h((y61) object);
                        }
                    }
                    cu8Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 9:
                    if (cu8Var.k(i7, i6, i8, i, obj)) {
                        kb6Var.u(i9, unsafe.getObject(obj, j2), cu8Var.j(i7));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    if (cu8Var.k(i7, i6, i8, i, obj)) {
                        y61 y61Var = (y61) unsafe.getObject(obj, j2);
                        j72Var.m(i9, 2);
                        j72Var.h(y61Var);
                    }
                    cu8Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    if (cu8Var.k(i7, i6, i8, i, obj)) {
                        int i15 = unsafe.getInt(obj, j2);
                        j72Var.m(i9, 0);
                        j72Var.n(i15);
                    }
                    cu8Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (cu8Var.k(i7, i6, i8, i, obj)) {
                        int i16 = unsafe.getInt(obj, j2);
                        j72Var.m(i9, 0);
                        j72Var.k(i16);
                    }
                    cu8Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    if (cu8Var.k(i7, i6, i8, i, obj)) {
                        int i17 = unsafe.getInt(obj, j2);
                        j72Var.m(i9, 5);
                        j72Var.i(i17);
                    }
                    cu8Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 14:
                    if (cu8Var.k(i7, i6, i8, i, obj)) {
                        long j6 = unsafe.getLong(obj, j2);
                        j72Var.m(i9, 1);
                        j72Var.j(j6);
                    }
                    cu8Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 15:
                    if (cu8Var.k(i7, i6, i8, i, obj)) {
                        int i18 = unsafe.getInt(obj, j2);
                        j72Var.m(i9, 0);
                        j72Var.n((i18 >> 31) ^ (i18 << 1));
                    }
                    cu8Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                    if (cu8Var.k(i7, i6, i8, i, obj)) {
                        long j7 = unsafe.getLong(obj, j2);
                        j72Var.m(i9, 0);
                        j72Var.o((j7 >> 63) ^ (j7 << 1));
                    }
                    cu8Var = this;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 17:
                    if (cu8Var.k(i7, i6, i8, i, obj)) {
                        kb6Var.t(i9, unsafe.getObject(obj, j2), cu8Var.j(i7));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 18:
                    kfc.m(iArr[i7], (List) unsafe.getObject(obj, j2), kb6Var, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 19:
                    kfc.q(iArr[i7], (List) unsafe.getObject(obj, j2), kb6Var, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 20:
                    kfc.s(iArr[i7], (List) unsafe.getObject(obj, j2), kb6Var, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 21:
                    kfc.y(iArr[i7], (List) unsafe.getObject(obj, j2), kb6Var, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 22:
                    kfc.r(iArr[i7], (List) unsafe.getObject(obj, j2), kb6Var, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 23:
                    kfc.p(iArr[i7], (List) unsafe.getObject(obj, j2), kb6Var, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 24:
                    kfc.o(iArr[i7], (List) unsafe.getObject(obj, j2), kb6Var, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 25:
                    kfc.l(iArr[i7], (List) unsafe.getObject(obj, j2), kb6Var, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 26:
                    i2 = i6;
                    i3 = i8;
                    int i19 = iArr[i7];
                    List list = (List) unsafe.getObject(obj, j2);
                    Class cls = kfc.a;
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof v18) {
                            v18 v18Var = (v18) list;
                            for (int i20 = 0; i20 < list.size(); i20++) {
                                Object objP0 = v18Var.p0(i20);
                                if (objP0 instanceof String) {
                                    j72Var.m(i19, 2);
                                    j72Var.l((String) objP0);
                                } else {
                                    j72Var.m(i19, 2);
                                    j72Var.h((y61) objP0);
                                }
                            }
                        } else {
                            for (int i21 = 0; i21 < list.size(); i21++) {
                                String str = (String) list.get(i21);
                                j72Var.m(i19, 2);
                                j72Var.l(str);
                            }
                        }
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 27:
                    i2 = i6;
                    i3 = i8;
                    int i22 = iArr[i7];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    ffc ffcVarJ = cu8Var.j(i7);
                    Class cls2 = kfc.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i23 = 0; i23 < list2.size(); i23++) {
                            kb6Var.u(i22, list2.get(i23), ffcVarJ);
                        }
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 28:
                    i2 = i6;
                    i3 = i8;
                    int i24 = iArr[i7];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    Class cls3 = kfc.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i25 = 0; i25 < list3.size(); i25++) {
                            y61 y61Var2 = (y61) list3.get(i25);
                            j72Var.m(i24, 2);
                            j72Var.h(y61Var2);
                        }
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 29:
                    kfc.x(iArr[i7], (List) unsafe.getObject(obj, j2), kb6Var, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 30:
                    kfc.n(iArr[i7], (List) unsafe.getObject(obj, j2), kb6Var, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 31:
                    kfc.t(iArr[i7], (List) unsafe.getObject(obj, j2), kb6Var, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                    kfc.u(iArr[i7], (List) unsafe.getObject(obj, j2), kb6Var, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 33:
                    kfc.v(iArr[i7], (List) unsafe.getObject(obj, j2), kb6Var, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 34:
                    kfc.w(iArr[i7], (List) unsafe.getObject(obj, j2), kb6Var, false);
                    i6 = i6;
                    i8 = i8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 35:
                    i2 = i6;
                    i3 = i8;
                    kfc.m(iArr[i7], (List) unsafe.getObject(obj, j2), kb6Var, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 36:
                    i2 = i6;
                    i3 = i8;
                    kfc.q(iArr[i7], (List) unsafe.getObject(obj, j2), kb6Var, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 37:
                    i2 = i6;
                    i3 = i8;
                    kfc.s(iArr[i7], (List) unsafe.getObject(obj, j2), kb6Var, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 38:
                    i2 = i6;
                    i3 = i8;
                    kfc.y(iArr[i7], (List) unsafe.getObject(obj, j2), kb6Var, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 39:
                    i2 = i6;
                    i3 = i8;
                    kfc.r(iArr[i7], (List) unsafe.getObject(obj, j2), kb6Var, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 40:
                    i2 = i6;
                    i3 = i8;
                    kfc.p(iArr[i7], (List) unsafe.getObject(obj, j2), kb6Var, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 41:
                    i2 = i6;
                    i3 = i8;
                    kfc.o(iArr[i7], (List) unsafe.getObject(obj, j2), kb6Var, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 42:
                    i2 = i6;
                    i3 = i8;
                    kfc.l(iArr[i7], (List) unsafe.getObject(obj, j2), kb6Var, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 43:
                    i2 = i6;
                    i3 = i8;
                    kfc.x(iArr[i7], (List) unsafe.getObject(obj, j2), kb6Var, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 44:
                    i2 = i6;
                    i3 = i8;
                    kfc.n(iArr[i7], (List) unsafe.getObject(obj, j2), kb6Var, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 45:
                    i2 = i6;
                    i3 = i8;
                    kfc.t(iArr[i7], (List) unsafe.getObject(obj, j2), kb6Var, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 46:
                    i2 = i6;
                    i3 = i8;
                    kfc.u(iArr[i7], (List) unsafe.getObject(obj, j2), kb6Var, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 47:
                    i2 = i6;
                    i3 = i8;
                    kfc.v(iArr[i7], (List) unsafe.getObject(obj, j2), kb6Var, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case z7c.f /* 48 */:
                    i2 = i6;
                    i3 = i8;
                    kfc.w(iArr[i7], (List) unsafe.getObject(obj, j2), kb6Var, true);
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 49:
                    i2 = i6;
                    i3 = i8;
                    int i26 = iArr[i7];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    ffc ffcVarJ2 = cu8Var.j(i7);
                    Class cls4 = kfc.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i27 = 0; i27 < list4.size(); i27++) {
                            kb6Var.t(i26, list4.get(i27), ffcVarJ2);
                        }
                    }
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j2);
                    if (object2 != null) {
                        Object obj2 = cu8Var.b[(i7 / 3) * 2];
                        cu8Var.i.getClass();
                        gg7 gg7Var = ((ll8) obj2).a;
                        w9g w9gVar = (w9g) gg7Var.c;
                        w9g w9gVar2 = (w9g) gg7Var.b;
                        for (Map.Entry entry : ((ql8) object2).entrySet()) {
                            j72Var.m(i9, i12);
                            Object key = entry.getKey();
                            int i28 = i12;
                            Object value = entry.getValue();
                            int i29 = wc5.c;
                            int iC2 = j72.c(1);
                            int i30 = i6;
                            n9g n9gVar = w9g.c;
                            if (w9gVar2 == n9gVar) {
                                iC2 *= 2;
                            }
                            int i31 = i8;
                            switch (w9gVar2.ordinal()) {
                                case 0:
                                    ((Double) key).getClass();
                                    iE = 8;
                                    i4 = iE + iC2;
                                    iC = j72.c(i28);
                                    if (w9gVar == n9gVar) {
                                        iC *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key2 = entry.getKey();
                                            Object value2 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key2);
                                            wc5.b(j72Var, w9gVar, i28, value2);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key3 = entry.getKey();
                                            Object value3 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key3);
                                            wc5.b(j72Var, w9gVar, i28, value3);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key4 = entry.getKey();
                                            Object value4 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key4);
                                            wc5.b(j72Var, w9gVar, i28, value4);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key5 = entry.getKey();
                                            Object value5 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key5);
                                            wc5.b(j72Var, w9gVar, i28, value5);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = j72.a(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key6 = entry.getKey();
                                            Object value6 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key6);
                                            wc5.b(j72Var, w9gVar, i28, value6);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key7 = entry.getKey();
                                            Object value7 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key7);
                                            wc5.b(j72Var, w9gVar, i28, value7);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key8 = entry.getKey();
                                            Object value8 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key8);
                                            wc5.b(j72Var, w9gVar, i28, value8);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key9 = entry.getKey();
                                            Object value9 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key9);
                                            wc5.b(j72Var, w9gVar, i28, value9);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = j72.b((String) value);
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key10 = entry.getKey();
                                            Object value10 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key10);
                                            wc5.b(j72Var, w9gVar, i28, value10);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((t56) ((tt8) value)).g(null);
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11 = entry.getKey();
                                            Object value11 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11);
                                            wc5.b(j72Var, w9gVar, i28, value11);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size2 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size2);
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key12 = entry.getKey();
                                            Object value12 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key12);
                                            wc5.b(j72Var, w9gVar, i28, value12);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = j72.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key13 = entry.getKey();
                                            Object value13 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key13);
                                            wc5.b(j72Var, w9gVar, i28, value13);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE2 = j72.d(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key14 = entry.getKey();
                                            Object value14 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key14);
                                            wc5.b(j72Var, w9gVar, i28, value14);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE2 = j72.a(((k87) value).a());
                                            } else {
                                                iE2 = j72.a(((Integer) value).intValue());
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key15 = entry.getKey();
                                            Object value15 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key15);
                                            wc5.b(j72Var, w9gVar, i28, value15);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key16 = entry.getKey();
                                            Object value16 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key16);
                                            wc5.b(j72Var, w9gVar, i28, value16);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key17 = entry.getKey();
                                            Object value17 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key17);
                                            wc5.b(j72Var, w9gVar, i28, value17);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue = ((Integer) value).intValue();
                                            iE2 = j72.d((iIntValue >> 31) ^ (iIntValue << 1));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key18 = entry.getKey();
                                            Object value18 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key18);
                                            wc5.b(j72Var, w9gVar, i28, value18);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue = ((Long) value).longValue();
                                            iE2 = j72.e((jLongValue << 1) ^ (jLongValue >> 63));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key19 = entry.getKey();
                                            Object value19 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key19);
                                            wc5.b(j72Var, w9gVar, i28, value19);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 1:
                                    ((Float) key).getClass();
                                    iE = 4;
                                    i4 = iE + iC2;
                                    iC = j72.c(i28);
                                    if (w9gVar == n9gVar) {
                                        iC *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key110 = entry.getKey();
                                            Object value110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key110);
                                            wc5.b(j72Var, w9gVar, i28, value110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111 = entry.getKey();
                                            Object value111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111);
                                            wc5.b(j72Var, w9gVar, i28, value111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key112 = entry.getKey();
                                            Object value112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key112);
                                            wc5.b(j72Var, w9gVar, i28, value112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key113 = entry.getKey();
                                            Object value113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key113);
                                            wc5.b(j72Var, w9gVar, i28, value113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = j72.a(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key114 = entry.getKey();
                                            Object value114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key114);
                                            wc5.b(j72Var, w9gVar, i28, value114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key115 = entry.getKey();
                                            Object value115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key115);
                                            wc5.b(j72Var, w9gVar, i28, value115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key116 = entry.getKey();
                                            Object value116 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key116);
                                            wc5.b(j72Var, w9gVar, i28, value116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key117 = entry.getKey();
                                            Object value117 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key117);
                                            wc5.b(j72Var, w9gVar, i28, value117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = j72.b((String) value);
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key118 = entry.getKey();
                                            Object value118 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key118);
                                            wc5.b(j72Var, w9gVar, i28, value118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((t56) ((tt8) value)).g(null);
                                            j72Var.n(iE2 + iC + i4);
                                            Object key119 = entry.getKey();
                                            Object value119 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key119);
                                            wc5.b(j72Var, w9gVar, i28, value119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size2 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size2);
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1110 = entry.getKey();
                                            Object value1110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1110);
                                            wc5.b(j72Var, w9gVar, i28, value1110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = j72.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111 = entry.getKey();
                                            Object value1111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111);
                                            wc5.b(j72Var, w9gVar, i28, value1111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE2 = j72.d(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1112 = entry.getKey();
                                            Object value1112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1112);
                                            wc5.b(j72Var, w9gVar, i28, value1112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE2 = j72.a(((k87) value).a());
                                            } else {
                                                iE2 = j72.a(((Integer) value).intValue());
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1113 = entry.getKey();
                                            Object value1113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1113);
                                            wc5.b(j72Var, w9gVar, i28, value1113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1114 = entry.getKey();
                                            Object value1114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1114);
                                            wc5.b(j72Var, w9gVar, i28, value1114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1115 = entry.getKey();
                                            Object value1115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1115);
                                            wc5.b(j72Var, w9gVar, i28, value1115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue2 = ((Integer) value).intValue();
                                            iE2 = j72.d((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1116 = entry.getKey();
                                            Object value1116 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1116);
                                            wc5.b(j72Var, w9gVar, i28, value1116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue2 = ((Long) value).longValue();
                                            iE2 = j72.e((jLongValue2 << 1) ^ (jLongValue2 >> 63));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1117 = entry.getKey();
                                            Object value1117 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1117);
                                            wc5.b(j72Var, w9gVar, i28, value1117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 2:
                                    iE = j72.e(((Long) key).longValue());
                                    i4 = iE + iC2;
                                    iC = j72.c(i28);
                                    if (w9gVar == n9gVar) {
                                        iC *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1118 = entry.getKey();
                                            Object value1118 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1118);
                                            wc5.b(j72Var, w9gVar, i28, value1118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1119 = entry.getKey();
                                            Object value1119 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1119);
                                            wc5.b(j72Var, w9gVar, i28, value1119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11110 = entry.getKey();
                                            Object value11110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11110);
                                            wc5.b(j72Var, w9gVar, i28, value11110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111 = entry.getKey();
                                            Object value11111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111);
                                            wc5.b(j72Var, w9gVar, i28, value11111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = j72.a(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11112 = entry.getKey();
                                            Object value11112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11112);
                                            wc5.b(j72Var, w9gVar, i28, value11112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11113 = entry.getKey();
                                            Object value11113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11113);
                                            wc5.b(j72Var, w9gVar, i28, value11113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11114 = entry.getKey();
                                            Object value11114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11114);
                                            wc5.b(j72Var, w9gVar, i28, value11114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11115 = entry.getKey();
                                            Object value11115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11115);
                                            wc5.b(j72Var, w9gVar, i28, value11115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = j72.b((String) value);
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11116 = entry.getKey();
                                            Object value11116 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11116);
                                            wc5.b(j72Var, w9gVar, i28, value11116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((t56) ((tt8) value)).g(null);
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11117 = entry.getKey();
                                            Object value11117 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11117);
                                            wc5.b(j72Var, w9gVar, i28, value11117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size2 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size2);
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11118 = entry.getKey();
                                            Object value11118 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11118);
                                            wc5.b(j72Var, w9gVar, i28, value11118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = j72.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11119 = entry.getKey();
                                            Object value11119 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11119);
                                            wc5.b(j72Var, w9gVar, i28, value11119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE2 = j72.d(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111110 = entry.getKey();
                                            Object value111110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111110);
                                            wc5.b(j72Var, w9gVar, i28, value111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE2 = j72.a(((k87) value).a());
                                            } else {
                                                iE2 = j72.a(((Integer) value).intValue());
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111 = entry.getKey();
                                            Object value111111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111);
                                            wc5.b(j72Var, w9gVar, i28, value111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111112 = entry.getKey();
                                            Object value111112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111112);
                                            wc5.b(j72Var, w9gVar, i28, value111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111113 = entry.getKey();
                                            Object value111113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111113);
                                            wc5.b(j72Var, w9gVar, i28, value111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue3 = ((Integer) value).intValue();
                                            iE2 = j72.d((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111114 = entry.getKey();
                                            Object value111114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111114);
                                            wc5.b(j72Var, w9gVar, i28, value111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue3 = ((Long) value).longValue();
                                            iE2 = j72.e((jLongValue3 << 1) ^ (jLongValue3 >> 63));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111115 = entry.getKey();
                                            Object value111115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111115);
                                            wc5.b(j72Var, w9gVar, i28, value111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 3:
                                    iE = j72.e(((Long) key).longValue());
                                    i4 = iE + iC2;
                                    iC = j72.c(i28);
                                    if (w9gVar == n9gVar) {
                                        iC *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111116 = entry.getKey();
                                            Object value111116 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111116);
                                            wc5.b(j72Var, w9gVar, i28, value111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111117 = entry.getKey();
                                            Object value111117 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111117);
                                            wc5.b(j72Var, w9gVar, i28, value111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111118 = entry.getKey();
                                            Object value111118 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111118);
                                            wc5.b(j72Var, w9gVar, i28, value111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111119 = entry.getKey();
                                            Object value111119 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111119);
                                            wc5.b(j72Var, w9gVar, i28, value111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = j72.a(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111110 = entry.getKey();
                                            Object value1111110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111110);
                                            wc5.b(j72Var, w9gVar, i28, value1111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111 = entry.getKey();
                                            Object value1111111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111);
                                            wc5.b(j72Var, w9gVar, i28, value1111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111112 = entry.getKey();
                                            Object value1111112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111112);
                                            wc5.b(j72Var, w9gVar, i28, value1111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111113 = entry.getKey();
                                            Object value1111113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111113);
                                            wc5.b(j72Var, w9gVar, i28, value1111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = j72.b((String) value);
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111114 = entry.getKey();
                                            Object value1111114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111114);
                                            wc5.b(j72Var, w9gVar, i28, value1111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((t56) ((tt8) value)).g(null);
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111115 = entry.getKey();
                                            Object value1111115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111115);
                                            wc5.b(j72Var, w9gVar, i28, value1111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size2 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size2);
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111116 = entry.getKey();
                                            Object value1111116 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111116);
                                            wc5.b(j72Var, w9gVar, i28, value1111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = j72.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111117 = entry.getKey();
                                            Object value1111117 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111117);
                                            wc5.b(j72Var, w9gVar, i28, value1111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE2 = j72.d(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111118 = entry.getKey();
                                            Object value1111118 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111118);
                                            wc5.b(j72Var, w9gVar, i28, value1111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE2 = j72.a(((k87) value).a());
                                            } else {
                                                iE2 = j72.a(((Integer) value).intValue());
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111119 = entry.getKey();
                                            Object value1111119 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111119);
                                            wc5.b(j72Var, w9gVar, i28, value1111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111110 = entry.getKey();
                                            Object value11111110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111110);
                                            wc5.b(j72Var, w9gVar, i28, value11111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111 = entry.getKey();
                                            Object value11111111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111);
                                            wc5.b(j72Var, w9gVar, i28, value11111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue4 = ((Integer) value).intValue();
                                            iE2 = j72.d((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111112 = entry.getKey();
                                            Object value11111112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111112);
                                            wc5.b(j72Var, w9gVar, i28, value11111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue4 = ((Long) value).longValue();
                                            iE2 = j72.e((jLongValue4 << 1) ^ (jLongValue4 >> 63));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111113 = entry.getKey();
                                            Object value11111113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111113);
                                            wc5.b(j72Var, w9gVar, i28, value11111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 4:
                                    iE = j72.a(((Integer) key).intValue());
                                    i4 = iE + iC2;
                                    iC = j72.c(i28);
                                    if (w9gVar == n9gVar) {
                                        iC *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111114 = entry.getKey();
                                            Object value11111114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111114);
                                            wc5.b(j72Var, w9gVar, i28, value11111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111115 = entry.getKey();
                                            Object value11111115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111115);
                                            wc5.b(j72Var, w9gVar, i28, value11111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111116 = entry.getKey();
                                            Object value11111116 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111116);
                                            wc5.b(j72Var, w9gVar, i28, value11111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111117 = entry.getKey();
                                            Object value11111117 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111117);
                                            wc5.b(j72Var, w9gVar, i28, value11111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = j72.a(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111118 = entry.getKey();
                                            Object value11111118 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111118);
                                            wc5.b(j72Var, w9gVar, i28, value11111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111119 = entry.getKey();
                                            Object value11111119 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111119);
                                            wc5.b(j72Var, w9gVar, i28, value11111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111110 = entry.getKey();
                                            Object value111111110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111110);
                                            wc5.b(j72Var, w9gVar, i28, value111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111 = entry.getKey();
                                            Object value111111111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111);
                                            wc5.b(j72Var, w9gVar, i28, value111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = j72.b((String) value);
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111112 = entry.getKey();
                                            Object value111111112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111112);
                                            wc5.b(j72Var, w9gVar, i28, value111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((t56) ((tt8) value)).g(null);
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111113 = entry.getKey();
                                            Object value111111113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111113);
                                            wc5.b(j72Var, w9gVar, i28, value111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size2 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size2);
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111114 = entry.getKey();
                                            Object value111111114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111114);
                                            wc5.b(j72Var, w9gVar, i28, value111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = j72.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111115 = entry.getKey();
                                            Object value111111115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111115);
                                            wc5.b(j72Var, w9gVar, i28, value111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE2 = j72.d(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111116 = entry.getKey();
                                            Object value111111116 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111116);
                                            wc5.b(j72Var, w9gVar, i28, value111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE2 = j72.a(((k87) value).a());
                                            } else {
                                                iE2 = j72.a(((Integer) value).intValue());
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111117 = entry.getKey();
                                            Object value111111117 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111117);
                                            wc5.b(j72Var, w9gVar, i28, value111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111118 = entry.getKey();
                                            Object value111111118 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111118);
                                            wc5.b(j72Var, w9gVar, i28, value111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111119 = entry.getKey();
                                            Object value111111119 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111119);
                                            wc5.b(j72Var, w9gVar, i28, value111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue5 = ((Integer) value).intValue();
                                            iE2 = j72.d((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111110 = entry.getKey();
                                            Object value1111111110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111110);
                                            wc5.b(j72Var, w9gVar, i28, value1111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue5 = ((Long) value).longValue();
                                            iE2 = j72.e((jLongValue5 << 1) ^ (jLongValue5 >> 63));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111 = entry.getKey();
                                            Object value1111111111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 5:
                                    ((Long) key).getClass();
                                    iE = 8;
                                    i4 = iE + iC2;
                                    iC = j72.c(i28);
                                    if (w9gVar == n9gVar) {
                                        iC *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111112 = entry.getKey();
                                            Object value1111111112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111112);
                                            wc5.b(j72Var, w9gVar, i28, value1111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111113 = entry.getKey();
                                            Object value1111111113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111113);
                                            wc5.b(j72Var, w9gVar, i28, value1111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111114 = entry.getKey();
                                            Object value1111111114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111114);
                                            wc5.b(j72Var, w9gVar, i28, value1111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111115 = entry.getKey();
                                            Object value1111111115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111115);
                                            wc5.b(j72Var, w9gVar, i28, value1111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = j72.a(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111116 = entry.getKey();
                                            Object value1111111116 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111116);
                                            wc5.b(j72Var, w9gVar, i28, value1111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111117 = entry.getKey();
                                            Object value1111111117 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111117);
                                            wc5.b(j72Var, w9gVar, i28, value1111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111118 = entry.getKey();
                                            Object value1111111118 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111118);
                                            wc5.b(j72Var, w9gVar, i28, value1111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111119 = entry.getKey();
                                            Object value1111111119 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111119);
                                            wc5.b(j72Var, w9gVar, i28, value1111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = j72.b((String) value);
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111110 = entry.getKey();
                                            Object value11111111110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111110);
                                            wc5.b(j72Var, w9gVar, i28, value11111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((t56) ((tt8) value)).g(null);
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111 = entry.getKey();
                                            Object value11111111111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size2 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size2);
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111112 = entry.getKey();
                                            Object value11111111112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111112);
                                            wc5.b(j72Var, w9gVar, i28, value11111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = j72.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111113 = entry.getKey();
                                            Object value11111111113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111113);
                                            wc5.b(j72Var, w9gVar, i28, value11111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE2 = j72.d(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111114 = entry.getKey();
                                            Object value11111111114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111114);
                                            wc5.b(j72Var, w9gVar, i28, value11111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE2 = j72.a(((k87) value).a());
                                            } else {
                                                iE2 = j72.a(((Integer) value).intValue());
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111115 = entry.getKey();
                                            Object value11111111115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111115);
                                            wc5.b(j72Var, w9gVar, i28, value11111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111116 = entry.getKey();
                                            Object value11111111116 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111116);
                                            wc5.b(j72Var, w9gVar, i28, value11111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111117 = entry.getKey();
                                            Object value11111111117 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111117);
                                            wc5.b(j72Var, w9gVar, i28, value11111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue6 = ((Integer) value).intValue();
                                            iE2 = j72.d((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111118 = entry.getKey();
                                            Object value11111111118 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111118);
                                            wc5.b(j72Var, w9gVar, i28, value11111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue6 = ((Long) value).longValue();
                                            iE2 = j72.e((jLongValue6 << 1) ^ (jLongValue6 >> 63));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111119 = entry.getKey();
                                            Object value11111111119 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111119);
                                            wc5.b(j72Var, w9gVar, i28, value11111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 6:
                                    ((Integer) key).getClass();
                                    iE = 4;
                                    i4 = iE + iC2;
                                    iC = j72.c(i28);
                                    if (w9gVar == n9gVar) {
                                        iC *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111110 = entry.getKey();
                                            Object value111111111110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111110);
                                            wc5.b(j72Var, w9gVar, i28, value111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111 = entry.getKey();
                                            Object value111111111111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111112 = entry.getKey();
                                            Object value111111111112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111112);
                                            wc5.b(j72Var, w9gVar, i28, value111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111113 = entry.getKey();
                                            Object value111111111113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111113);
                                            wc5.b(j72Var, w9gVar, i28, value111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = j72.a(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111114 = entry.getKey();
                                            Object value111111111114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111114);
                                            wc5.b(j72Var, w9gVar, i28, value111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111115 = entry.getKey();
                                            Object value111111111115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111115);
                                            wc5.b(j72Var, w9gVar, i28, value111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111116 = entry.getKey();
                                            Object value111111111116 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111116);
                                            wc5.b(j72Var, w9gVar, i28, value111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111117 = entry.getKey();
                                            Object value111111111117 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111117);
                                            wc5.b(j72Var, w9gVar, i28, value111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = j72.b((String) value);
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111118 = entry.getKey();
                                            Object value111111111118 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111118);
                                            wc5.b(j72Var, w9gVar, i28, value111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((t56) ((tt8) value)).g(null);
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111119 = entry.getKey();
                                            Object value111111111119 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111119);
                                            wc5.b(j72Var, w9gVar, i28, value111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size2 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size2);
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111110 = entry.getKey();
                                            Object value1111111111110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111110);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = j72.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111 = entry.getKey();
                                            Object value1111111111111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE2 = j72.d(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111112 = entry.getKey();
                                            Object value1111111111112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111112);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE2 = j72.a(((k87) value).a());
                                            } else {
                                                iE2 = j72.a(((Integer) value).intValue());
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111113 = entry.getKey();
                                            Object value1111111111113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111113);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111114 = entry.getKey();
                                            Object value1111111111114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111114);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111115 = entry.getKey();
                                            Object value1111111111115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111115);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue7 = ((Integer) value).intValue();
                                            iE2 = j72.d((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111116 = entry.getKey();
                                            Object value1111111111116 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111116);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue7 = ((Long) value).longValue();
                                            iE2 = j72.e((jLongValue7 << 1) ^ (jLongValue7 >> 63));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111117 = entry.getKey();
                                            Object value1111111111117 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111117);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 7:
                                    ((Boolean) key).getClass();
                                    iE = 1;
                                    i4 = iE + iC2;
                                    iC = j72.c(i28);
                                    if (w9gVar == n9gVar) {
                                        iC *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111118 = entry.getKey();
                                            Object value1111111111118 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111118);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111119 = entry.getKey();
                                            Object value1111111111119 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111119);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111110 = entry.getKey();
                                            Object value11111111111110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111110);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111 = entry.getKey();
                                            Object value11111111111111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = j72.a(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111112 = entry.getKey();
                                            Object value11111111111112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111112);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111113 = entry.getKey();
                                            Object value11111111111113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111113);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111114 = entry.getKey();
                                            Object value11111111111114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111114);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111115 = entry.getKey();
                                            Object value11111111111115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111115);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = j72.b((String) value);
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111116 = entry.getKey();
                                            Object value11111111111116 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111116);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((t56) ((tt8) value)).g(null);
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111117 = entry.getKey();
                                            Object value11111111111117 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111117);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size2 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size2);
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111118 = entry.getKey();
                                            Object value11111111111118 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111118);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = j72.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111119 = entry.getKey();
                                            Object value11111111111119 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111119);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE2 = j72.d(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111110 = entry.getKey();
                                            Object value111111111111110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111110);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE2 = j72.a(((k87) value).a());
                                            } else {
                                                iE2 = j72.a(((Integer) value).intValue());
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111 = entry.getKey();
                                            Object value111111111111111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111112 = entry.getKey();
                                            Object value111111111111112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111112);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111113 = entry.getKey();
                                            Object value111111111111113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111113);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue8 = ((Integer) value).intValue();
                                            iE2 = j72.d((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111114 = entry.getKey();
                                            Object value111111111111114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111114);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue8 = ((Long) value).longValue();
                                            iE2 = j72.e((jLongValue8 << 1) ^ (jLongValue8 >> 63));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111115 = entry.getKey();
                                            Object value111111111111115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111115);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 8:
                                    if (key instanceof y61) {
                                        size = ((y61) key).size();
                                        iD = j72.d(size);
                                        iE = size + iD;
                                    } else {
                                        iE = j72.b((String) key);
                                    }
                                    i4 = iE + iC2;
                                    iC = j72.c(i28);
                                    if (w9gVar == n9gVar) {
                                        iC *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111116 = entry.getKey();
                                            Object value111111111111116 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111116);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111117 = entry.getKey();
                                            Object value111111111111117 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111117);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111118 = entry.getKey();
                                            Object value111111111111118 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111118);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111119 = entry.getKey();
                                            Object value111111111111119 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111119);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = j72.a(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111110 = entry.getKey();
                                            Object value1111111111111110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111110);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111 = entry.getKey();
                                            Object value1111111111111111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111112 = entry.getKey();
                                            Object value1111111111111112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111112);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111113 = entry.getKey();
                                            Object value1111111111111113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111113);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = j72.b((String) value);
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111114 = entry.getKey();
                                            Object value1111111111111114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111114);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((t56) ((tt8) value)).g(null);
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111115 = entry.getKey();
                                            Object value1111111111111115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111115);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size2 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size2);
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111116 = entry.getKey();
                                            Object value1111111111111116 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111116);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = j72.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111117 = entry.getKey();
                                            Object value1111111111111117 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111117);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE2 = j72.d(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111118 = entry.getKey();
                                            Object value1111111111111118 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111118);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE2 = j72.a(((k87) value).a());
                                            } else {
                                                iE2 = j72.a(((Integer) value).intValue());
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111119 = entry.getKey();
                                            Object value1111111111111119 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111119);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111110 = entry.getKey();
                                            Object value11111111111111110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111110);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111 = entry.getKey();
                                            Object value11111111111111111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue9 = ((Integer) value).intValue();
                                            iE2 = j72.d((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111112 = entry.getKey();
                                            Object value11111111111111112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111112);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue9 = ((Long) value).longValue();
                                            iE2 = j72.e((jLongValue9 << 1) ^ (jLongValue9 >> 63));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111113 = entry.getKey();
                                            Object value11111111111111113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111113);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 9:
                                    iG = ((t56) ((tt8) key)).g(null);
                                    iE = iG;
                                    i4 = iE + iC2;
                                    iC = j72.c(i28);
                                    if (w9gVar == n9gVar) {
                                        iC *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111114 = entry.getKey();
                                            Object value11111111111111114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111114);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111115 = entry.getKey();
                                            Object value11111111111111115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111115);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111116 = entry.getKey();
                                            Object value11111111111111116 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111116);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111117 = entry.getKey();
                                            Object value11111111111111117 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111117);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = j72.a(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111118 = entry.getKey();
                                            Object value11111111111111118 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111118);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111119 = entry.getKey();
                                            Object value11111111111111119 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111119);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111110 = entry.getKey();
                                            Object value111111111111111110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111110);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111 = entry.getKey();
                                            Object value111111111111111111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = j72.b((String) value);
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111112 = entry.getKey();
                                            Object value111111111111111112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111112);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((t56) ((tt8) value)).g(null);
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111113 = entry.getKey();
                                            Object value111111111111111113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111113);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size2 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size2);
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111114 = entry.getKey();
                                            Object value111111111111111114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111114);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = j72.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111115 = entry.getKey();
                                            Object value111111111111111115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111115);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE2 = j72.d(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111116 = entry.getKey();
                                            Object value111111111111111116 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111116);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE2 = j72.a(((k87) value).a());
                                            } else {
                                                iE2 = j72.a(((Integer) value).intValue());
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111117 = entry.getKey();
                                            Object value111111111111111117 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111117);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111118 = entry.getKey();
                                            Object value111111111111111118 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111118);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111119 = entry.getKey();
                                            Object value111111111111111119 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111119);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue10 = ((Integer) value).intValue();
                                            iE2 = j72.d((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111110 = entry.getKey();
                                            Object value1111111111111111110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111110);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue10 = ((Long) value).longValue();
                                            iE2 = j72.e((jLongValue10 << 1) ^ (jLongValue10 >> 63));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111 = entry.getKey();
                                            Object value1111111111111111111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                    int iG2 = ((t56) ((tt8) key)).g(null);
                                    iG = j72.d(iG2) + iG2;
                                    iE = iG;
                                    i4 = iE + iC2;
                                    iC = j72.c(i28);
                                    if (w9gVar == n9gVar) {
                                        iC *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111112 = entry.getKey();
                                            Object value1111111111111111112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111112);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111113 = entry.getKey();
                                            Object value1111111111111111113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111113);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111114 = entry.getKey();
                                            Object value1111111111111111114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111114);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111115 = entry.getKey();
                                            Object value1111111111111111115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111115);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = j72.a(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111116 = entry.getKey();
                                            Object value1111111111111111116 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111116);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111117 = entry.getKey();
                                            Object value1111111111111111117 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111117);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111118 = entry.getKey();
                                            Object value1111111111111111118 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111118);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111119 = entry.getKey();
                                            Object value1111111111111111119 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111119);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = j72.b((String) value);
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111110 = entry.getKey();
                                            Object value11111111111111111110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111110);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((t56) ((tt8) value)).g(null);
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111 = entry.getKey();
                                            Object value11111111111111111111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size2 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size2);
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111112 = entry.getKey();
                                            Object value11111111111111111112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111112);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = j72.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111113 = entry.getKey();
                                            Object value11111111111111111113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111113);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE2 = j72.d(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111114 = entry.getKey();
                                            Object value11111111111111111114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111114);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE2 = j72.a(((k87) value).a());
                                            } else {
                                                iE2 = j72.a(((Integer) value).intValue());
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111115 = entry.getKey();
                                            Object value11111111111111111115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111115);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111116 = entry.getKey();
                                            Object value11111111111111111116 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111116);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111117 = entry.getKey();
                                            Object value11111111111111111117 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111117);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue11 = ((Integer) value).intValue();
                                            iE2 = j72.d((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111118 = entry.getKey();
                                            Object value11111111111111111118 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111118);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue11 = ((Long) value).longValue();
                                            iE2 = j72.e((jLongValue11 << 1) ^ (jLongValue11 >> 63));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111119 = entry.getKey();
                                            Object value11111111111111111119 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111119);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                    if (key instanceof y61) {
                                        size = ((y61) key).size();
                                        iD = j72.d(size);
                                    } else {
                                        size = ((byte[]) key).length;
                                        iD = j72.d(size);
                                    }
                                    iE = size + iD;
                                    i4 = iE + iC2;
                                    iC = j72.c(i28);
                                    if (w9gVar == n9gVar) {
                                        iC *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111110 = entry.getKey();
                                            Object value111111111111111111110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111110);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111112 = entry.getKey();
                                            Object value111111111111111111112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111112);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111113 = entry.getKey();
                                            Object value111111111111111111113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111113);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = j72.a(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111114 = entry.getKey();
                                            Object value111111111111111111114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111114);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111115 = entry.getKey();
                                            Object value111111111111111111115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111115);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111116 = entry.getKey();
                                            Object value111111111111111111116 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111116);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111117 = entry.getKey();
                                            Object value111111111111111111117 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111117);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = j72.b((String) value);
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111118 = entry.getKey();
                                            Object value111111111111111111118 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111118);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((t56) ((tt8) value)).g(null);
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111119 = entry.getKey();
                                            Object value111111111111111111119 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111119);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size2 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size2);
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111110);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = j72.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE2 = j72.d(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111112);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE2 = j72.a(((k87) value).a());
                                            } else {
                                                iE2 = j72.a(((Integer) value).intValue());
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111113);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111114);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111115);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue12 = ((Integer) value).intValue();
                                            iE2 = j72.d((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111116 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111116);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue12 = ((Long) value).longValue();
                                            iE2 = j72.e((jLongValue12 << 1) ^ (jLongValue12 >> 63));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111117 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111117);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                    iE = j72.d(((Integer) key).intValue());
                                    i4 = iE + iC2;
                                    iC = j72.c(i28);
                                    if (w9gVar == n9gVar) {
                                        iC *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111118 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111118);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111119 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111119);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111110);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = j72.a(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111112);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111113);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111114);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111115);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = j72.b((String) value);
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111116 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111116);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((t56) ((tt8) value)).g(null);
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111117 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111117);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size2 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size2);
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111118 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111118);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = j72.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111119 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111119);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE2 = j72.d(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111110);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE2 = j72.a(((k87) value).a());
                                            } else {
                                                iE2 = j72.a(((Integer) value).intValue());
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111111);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111112);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111113);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue13 = ((Integer) value).intValue();
                                            iE2 = j72.d((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111114);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue13 = ((Long) value).longValue();
                                            iE2 = j72.e((jLongValue13 << 1) ^ (jLongValue13 >> 63));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111115);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                    iE = key instanceof k87 ? j72.a(((k87) key).a()) : j72.a(((Integer) key).intValue());
                                    i4 = iE + iC2;
                                    iC = j72.c(i28);
                                    if (w9gVar == n9gVar) {
                                        iC *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111116 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111116);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111117 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111117);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111118 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111118);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111119 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111119);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = j72.a(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111110);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111111);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111112);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111113);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = j72.b((String) value);
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111114);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((t56) ((tt8) value)).g(null);
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111115);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size2 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size2);
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111116 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111116);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = j72.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111117 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111117);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE2 = j72.d(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111118 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111118);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE2 = j72.a(((k87) value).a());
                                            } else {
                                                iE2 = j72.a(((Integer) value).intValue());
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111119 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111119);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111110);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111111);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue14 = ((Integer) value).intValue();
                                            iE2 = j72.d((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111112);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue14 = ((Long) value).longValue();
                                            iE2 = j72.e((jLongValue14 << 1) ^ (jLongValue14 >> 63));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111113);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 14:
                                    ((Integer) key).getClass();
                                    iE = 4;
                                    i4 = iE + iC2;
                                    iC = j72.c(i28);
                                    if (w9gVar == n9gVar) {
                                        iC *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111114);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111115);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111116 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111116);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111117 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111117);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = j72.a(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111118 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111118);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111119 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111119);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111111110);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111111111);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = j72.b((String) value);
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111111112);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((t56) ((tt8) value)).g(null);
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111111113);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size2 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size2);
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111111114);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = j72.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111111115);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE2 = j72.d(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111111116 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111111116);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE2 = j72.a(((k87) value).a());
                                            } else {
                                                iE2 = j72.a(((Integer) value).intValue());
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111111117 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111111117);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111111118 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111111118);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111111119 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111111119);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue15 = ((Integer) value).intValue();
                                            iE2 = j72.d((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111111110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111111110);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue15 = ((Long) value).longValue();
                                            iE2 = j72.e((jLongValue15 << 1) ^ (jLongValue15 >> 63));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111111111);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 15:
                                    ((Long) key).getClass();
                                    iE = 8;
                                    i4 = iE + iC2;
                                    iC = j72.c(i28);
                                    if (w9gVar == n9gVar) {
                                        iC *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111111112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111111112);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111111113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111111113);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111111114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111111114);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111111115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111111115);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = j72.a(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111111116 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111111116);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111111117 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111111117);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111111118 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111111118);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111111119 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111111119);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = j72.b((String) value);
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111111110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111111110);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((t56) ((tt8) value)).g(null);
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111111111);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size2 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size2);
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111111112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111111112);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = j72.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111111113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111111113);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE2 = j72.d(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111111114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111111114);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE2 = j72.a(((k87) value).a());
                                            } else {
                                                iE2 = j72.a(((Integer) value).intValue());
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111111115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111111115);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111111116 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111111116);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111111117 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111111117);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue16 = ((Integer) value).intValue();
                                            iE2 = j72.d((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111111118 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111111118);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue16 = ((Long) value).longValue();
                                            iE2 = j72.e((jLongValue16 << 1) ^ (jLongValue16 >> 63));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111111119 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111111119);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                    int iIntValue17 = ((Integer) key).intValue();
                                    iG = j72.d((iIntValue17 << 1) ^ (iIntValue17 >> 31));
                                    iE = iG;
                                    i4 = iE + iC2;
                                    iC = j72.c(i28);
                                    if (w9gVar == n9gVar) {
                                        iC *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111111110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111111111110);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111111111111);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111111112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111111111112);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111111113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111111111113);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = j72.a(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111111114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111111111114);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111111115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111111111115);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111111111116 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111111111116);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111111111117 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111111111117);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = j72.b((String) value);
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111111111118 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111111111118);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((t56) ((tt8) value)).g(null);
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111111111119 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111111111119);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size2 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size2);
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111111111110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111111111110);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = j72.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111111111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111111111111);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE2 = j72.d(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111111111112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111111111112);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE2 = j72.a(((k87) value).a());
                                            } else {
                                                iE2 = j72.a(((Integer) value).intValue());
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111111111113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111111111113);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111111111114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111111111114);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111111111115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111111111115);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue18 = ((Integer) value).intValue();
                                            iE2 = j72.d((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111111111116 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111111111116);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue17 = ((Long) value).longValue();
                                            iE2 = j72.e((jLongValue17 << 1) ^ (jLongValue17 >> 63));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111111111117 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111111111117);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                case 17:
                                    long jLongValue18 = ((Long) key).longValue();
                                    iG = j72.e((jLongValue18 << 1) ^ (jLongValue18 >> 63));
                                    iE = iG;
                                    i4 = iE + iC2;
                                    iC = j72.c(i28);
                                    if (w9gVar == n9gVar) {
                                        iC *= 2;
                                    }
                                    switch (w9gVar.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111111111118 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111111111118);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key1111111111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111111111119 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key1111111111111111111111111111119);
                                            wc5.b(j72Var, w9gVar, i28, value1111111111111111111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 2:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111111111110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111111111110);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 3:
                                            iE2 = j72.e(((Long) value).longValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111111111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111111111111);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 4:
                                            iE2 = j72.a(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111111111112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111111111112);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111111111113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111111111113);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111111111114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111111111114);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iE2 = 1;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111111111115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111111111115);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 8:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                                iE2 = size2 + iD2;
                                            } else {
                                                iE2 = j72.b((String) value);
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111111111116 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111111111116);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111111111116);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 9:
                                            iE2 = ((t56) ((tt8) value)).g(null);
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111111111117 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111111111117);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111111111117);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                            size2 = ((t56) ((tt8) value)).g(null);
                                            iD2 = j72.d(size2);
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111111111118 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111111111118);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111111111118);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            if (value instanceof y61) {
                                                size2 = ((y61) value).size();
                                                iD2 = j72.d(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                iD2 = j72.d(size2);
                                            }
                                            iE2 = size2 + iD2;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key11111111111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111111111119 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key11111111111111111111111111111119);
                                            wc5.b(j72Var, w9gVar, i28, value11111111111111111111111111111119);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                            iE2 = j72.d(((Integer) value).intValue());
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111111111110 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111111111111110);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111111111111110);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            if (value instanceof k87) {
                                                iE2 = j72.a(((k87) value).a());
                                            } else {
                                                iE2 = j72.a(((Integer) value).intValue());
                                            }
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111111111 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111111111111111);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111111111111111);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iE2 = 4;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111111111112 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111111111111112);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111111111111112);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iE2 = 8;
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111111111113 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111111111111113);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111111111111113);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                            int iIntValue19 = ((Integer) value).intValue();
                                            iE2 = j72.d((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111111111114 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111111111111114);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111111111111114);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        case 17:
                                            long jLongValue19 = ((Long) value).longValue();
                                            iE2 = j72.e((jLongValue19 << 1) ^ (jLongValue19 >> 63));
                                            j72Var.n(iE2 + iC + i4);
                                            Object key111111111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111111111115 = entry.getValue();
                                            wc5.b(j72Var, w9gVar2, 1, key111111111111111111111111111111115);
                                            wc5.b(j72Var, w9gVar, i28, value111111111111111111111111111111115);
                                            i12 = i28;
                                            i6 = i30;
                                            i8 = i31;
                                            break;
                                        default:
                                            ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                            break;
                                    }
                                    break;
                                default:
                                    ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                                    break;
                            }
                        }
                    }
                    i2 = i6;
                    i3 = i8;
                    i6 = i2;
                    i8 = i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 51:
                    if (cu8Var.n(i9, obj, i7)) {
                        long jDoubleToRawLongBits2 = Double.doubleToRawLongBits(((Double) wff.j(j2, obj)).doubleValue());
                        j72Var.m(i9, 1);
                        j72Var.j(jDoubleToRawLongBits2);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 52:
                    if (cu8Var.n(i9, obj, i7)) {
                        int iFloatToRawIntBits2 = Float.floatToRawIntBits(((Float) wff.j(j2, obj)).floatValue());
                        j72Var.m(i9, 5);
                        j72Var.i(iFloatToRawIntBits2);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 53:
                    if (cu8Var.n(i9, obj, i7)) {
                        long jS = s(j2, obj);
                        j72Var.m(i9, 0);
                        j72Var.o(jS);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 54:
                    if (cu8Var.n(i9, obj, i7)) {
                        long jS2 = s(j2, obj);
                        j72Var.m(i9, 0);
                        j72Var.o(jS2);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 55:
                    if (cu8Var.n(i9, obj, i7)) {
                        int iR = r(j2, obj);
                        j72Var.m(i9, 0);
                        j72Var.k(iR);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 56:
                    if (cu8Var.n(i9, obj, i7)) {
                        long jS3 = s(j2, obj);
                        j72Var.m(i9, 1);
                        j72Var.j(jS3);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 57:
                    if (cu8Var.n(i9, obj, i7)) {
                        int iR2 = r(j2, obj);
                        j72Var.m(i9, 5);
                        j72Var.i(iR2);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 58:
                    if (cu8Var.n(i9, obj, i7)) {
                        boolean zBooleanValue = ((Boolean) wff.j(j2, obj)).booleanValue();
                        j72Var.m(i9, 0);
                        j72Var.f(zBooleanValue ? (byte) 1 : (byte) 0);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 59:
                    if (cu8Var.n(i9, obj, i7)) {
                        Object object3 = unsafe.getObject(obj, j2);
                        if (object3 instanceof String) {
                            j72Var.m(i9, 2);
                            j72Var.l((String) object3);
                        } else {
                            j72Var.m(i9, 2);
                            j72Var.h((y61) object3);
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 60:
                    if (cu8Var.n(i9, obj, i7)) {
                        kb6Var.u(i9, unsafe.getObject(obj, j2), cu8Var.j(i7));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 61:
                    if (cu8Var.n(i9, obj, i7)) {
                        y61 y61Var3 = (y61) unsafe.getObject(obj, j2);
                        j72Var.m(i9, 2);
                        j72Var.h(y61Var3);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 62:
                    if (cu8Var.n(i9, obj, i7)) {
                        int iR3 = r(j2, obj);
                        j72Var.m(i9, 0);
                        j72Var.n(iR3);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 63:
                    if (cu8Var.n(i9, obj, i7)) {
                        int iR4 = r(j2, obj);
                        j72Var.m(i9, 0);
                        j72Var.k(iR4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                    if (cu8Var.n(i9, obj, i7)) {
                        int iR5 = r(j2, obj);
                        j72Var.m(i9, 5);
                        j72Var.i(iR5);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 65:
                    if (cu8Var.n(i9, obj, i7)) {
                        long jS4 = s(j2, obj);
                        j72Var.m(i9, 1);
                        j72Var.j(jS4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 66:
                    z = false;
                    if (cu8Var.n(i9, obj, i7)) {
                        int iR6 = r(j2, obj);
                        j72Var.m(i9, 0);
                        j72Var.n((iR6 >> 31) ^ (iR6 << 1));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 67:
                    if (cu8Var.n(i9, obj, i7)) {
                        long jS5 = s(j2, obj);
                        z = false;
                        j72Var.m(i9, 0);
                        j72Var.o((jS5 >> 63) ^ (jS5 << 1));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 68:
                    if (cu8Var.n(i9, obj, i7)) {
                        kb6Var.t(i9, unsafe.getObject(obj, j2), cu8Var.j(i7));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                default:
                    i7 += 3;
                    i5 = 1048575;
                    break;
            }
            return;
        }
        ((dff) cu8Var.h).getClass();
        ((t56) obj).unknownFields.b(kb6Var);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    @Override // defpackage.ffc
    public final boolean h(t56 t56Var, t56 t56Var2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zK = true;
            if (i < length) {
                int iW = w(i);
                long j2 = iW & 1048575;
                switch (v(iW)) {
                    case 0:
                        if (!i(t56Var, t56Var2, i)) {
                            zK = false;
                        } else {
                            vff vffVar = wff.c;
                            if (Double.doubleToLongBits(vffVar.c(j2, t56Var)) != Double.doubleToLongBits(vffVar.c(j2, t56Var2))) {
                                zK = false;
                            }
                        }
                        break;
                    case 1:
                        if (!i(t56Var, t56Var2, i)) {
                            zK = false;
                        } else {
                            vff vffVar2 = wff.c;
                            if (Float.floatToIntBits(vffVar2.d(j2, t56Var)) != Float.floatToIntBits(vffVar2.d(j2, t56Var2))) {
                                zK = false;
                            }
                        }
                        break;
                    case 2:
                        if (!i(t56Var, t56Var2, i) || wff.i(j2, t56Var) != wff.i(j2, t56Var2)) {
                            zK = false;
                        }
                        break;
                    case 3:
                        if (!i(t56Var, t56Var2, i) || wff.i(j2, t56Var) != wff.i(j2, t56Var2)) {
                            zK = false;
                        }
                        break;
                    case 4:
                        if (!i(t56Var, t56Var2, i) || wff.h(j2, t56Var) != wff.h(j2, t56Var2)) {
                            zK = false;
                        }
                        break;
                    case 5:
                        if (!i(t56Var, t56Var2, i) || wff.i(j2, t56Var) != wff.i(j2, t56Var2)) {
                            zK = false;
                        }
                        break;
                    case 6:
                        if (!i(t56Var, t56Var2, i) || wff.h(j2, t56Var) != wff.h(j2, t56Var2)) {
                            zK = false;
                        }
                        break;
                    case 7:
                        if (!i(t56Var, t56Var2, i)) {
                            zK = false;
                        } else {
                            vff vffVar3 = wff.c;
                            if (vffVar3.a(j2, t56Var) != vffVar3.a(j2, t56Var2)) {
                                zK = false;
                            }
                        }
                        break;
                    case 8:
                        if (!i(t56Var, t56Var2, i) || !kfc.k(wff.j(j2, t56Var), wff.j(j2, t56Var2))) {
                            zK = false;
                        }
                        break;
                    case 9:
                        if (!i(t56Var, t56Var2, i) || !kfc.k(wff.j(j2, t56Var), wff.j(j2, t56Var2))) {
                            zK = false;
                        }
                        break;
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        if (!i(t56Var, t56Var2, i) || !kfc.k(wff.j(j2, t56Var), wff.j(j2, t56Var2))) {
                            zK = false;
                        }
                        break;
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        if (!i(t56Var, t56Var2, i) || wff.h(j2, t56Var) != wff.h(j2, t56Var2)) {
                            zK = false;
                        }
                        break;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        if (!i(t56Var, t56Var2, i) || wff.h(j2, t56Var) != wff.h(j2, t56Var2)) {
                            zK = false;
                        }
                        break;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        if (!i(t56Var, t56Var2, i) || wff.h(j2, t56Var) != wff.h(j2, t56Var2)) {
                            zK = false;
                        }
                        break;
                    case 14:
                        if (!i(t56Var, t56Var2, i) || wff.i(j2, t56Var) != wff.i(j2, t56Var2)) {
                            zK = false;
                        }
                        break;
                    case 15:
                        if (!i(t56Var, t56Var2, i) || wff.h(j2, t56Var) != wff.h(j2, t56Var2)) {
                            zK = false;
                        }
                        break;
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        if (!i(t56Var, t56Var2, i) || wff.i(j2, t56Var) != wff.i(j2, t56Var2)) {
                            zK = false;
                        }
                        break;
                    case 17:
                        if (!i(t56Var, t56Var2, i) || !kfc.k(wff.j(j2, t56Var), wff.j(j2, t56Var2))) {
                            zK = false;
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
                        zK = kfc.k(wff.j(j2, t56Var), wff.j(j2, t56Var2));
                        break;
                    case 50:
                        zK = kfc.k(wff.j(j2, t56Var), wff.j(j2, t56Var2));
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
                        long j3 = iArr[i + 2] & 1048575;
                        if (wff.h(j3, t56Var) != wff.h(j3, t56Var2) || !kfc.k(wff.j(j2, t56Var), wff.j(j2, t56Var2))) {
                            zK = false;
                        }
                        break;
                }
                if (zK) {
                    i += 3;
                }
            } else {
                dff dffVar = (dff) this.h;
                dffVar.getClass();
                bff bffVar = t56Var.unknownFields;
                dffVar.getClass();
                if (bffVar.equals(t56Var2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean i(t56 t56Var, t56 t56Var2, int i) {
        return l(i, t56Var) == l(i, t56Var2);
    }

    public final ffc j(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        ffc ffcVar = (ffc) objArr[i2];
        if (ffcVar != null) {
            return ffcVar;
        }
        ffc ffcVarA = u0b.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = ffcVarA;
        return ffcVarA;
    }

    public final boolean k(int i, int i2, int i3, int i4, Object obj) {
        if (i2 == 1048575) {
            return l(i, obj);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f1 A[RETURN] */
    public final boolean l(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = i2 & 1048575;
        if (j2 != 1048575) {
            if (((1 << (i2 >>> 20)) & wff.h(j2, obj)) != 0) {
                return true;
            }
            return false;
        }
        int iW = w(i);
        long j3 = iW & 1048575;
        switch (v(iW)) {
            case 0:
                if (Double.doubleToRawLongBits(wff.c.c(j3, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(wff.c.d(j3, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (wff.i(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (wff.i(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (wff.h(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (wff.i(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (wff.h(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return wff.c.a(j3, obj);
            case 8:
                Object objJ = wff.j(j3, obj);
                if (objJ instanceof String) {
                    return !((String) objJ).isEmpty();
                }
                if (objJ instanceof y61) {
                    return !y61.a.equals(objJ);
                }
                cva.s();
                return false;
            case 9:
                if (wff.j(j3, obj) != null) {
                    return true;
                }
                return false;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return !y61.a.equals(wff.j(j3, obj));
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (wff.h(j3, obj) != 0) {
                    return true;
                }
                return false;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                if (wff.h(j3, obj) != 0) {
                    return true;
                }
                return false;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                if (wff.h(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (wff.i(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (wff.h(j3, obj) != 0) {
                    return true;
                }
                return false;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                if (wff.i(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (wff.j(j3, obj) != null) {
                    return true;
                }
                return false;
            default:
                cva.s();
                return false;
        }
    }

    public final boolean n(int i, Object obj, int i2) {
        return wff.h((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void o(int i, Object obj, Object obj2) {
        if (l(i, obj2)) {
            long jW = w(i) & 1048575;
            Unsafe unsafe = k;
            Object object = unsafe.getObject(obj2, jW);
            if (object == null) {
                cva.m("Source subfield ", this.a[i], " is present but null: ", obj2);
                return;
            }
            ffc ffcVarJ = j(i);
            if (!l(i, obj)) {
                if (m(object)) {
                    t56 t56VarD = ffcVarJ.d();
                    ffcVarJ.a(t56VarD, object);
                    unsafe.putObject(obj, jW, t56VarD);
                } else {
                    unsafe.putObject(obj, jW, object);
                }
                u(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jW);
            if (!m(object2)) {
                t56 t56VarD2 = ffcVarJ.d();
                ffcVarJ.a(t56VarD2, object2);
                unsafe.putObject(obj, jW, t56VarD2);
                object2 = t56VarD2;
            }
            ffcVarJ.a(object2, object);
        }
    }

    public final void p(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (n(i2, obj2, i)) {
            long jW = w(i) & 1048575;
            Unsafe unsafe = k;
            Object object = unsafe.getObject(obj2, jW);
            if (object == null) {
                cva.m("Source subfield ", iArr[i], " is present but null: ", obj2);
                return;
            }
            ffc ffcVarJ = j(i);
            if (!n(i2, obj, i)) {
                if (m(object)) {
                    t56 t56VarD = ffcVarJ.d();
                    ffcVarJ.a(t56VarD, object);
                    unsafe.putObject(obj, jW, t56VarD);
                } else {
                    unsafe.putObject(obj, jW, object);
                }
                wff.o(iArr[i + 2] & 1048575, obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, jW);
            if (!m(object2)) {
                t56 t56VarD2 = ffcVarJ.d();
                ffcVarJ.a(t56VarD2, object2);
                unsafe.putObject(obj, jW, t56VarD2);
                object2 = t56VarD2;
            }
            ffcVarJ.a(object2, object);
        }
    }

    public final void u(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = 1048575 & i2;
        if (j2 == 1048575) {
            return;
        }
        wff.o(j2, obj, (1 << (i2 >>> 20)) | wff.h(j2, obj));
    }

    public final int w(int i) {
        return this.a[i + 1];
    }
}
