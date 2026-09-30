package defpackage;

import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vng {
    public static final vng c = new vng();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final mjg a = new mjg(1);

    /* JADX WARN: Code duplicated, block: B:138:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:140:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:143:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:144:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:185:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:203:0x0418  */
    /* JADX WARN: Code duplicated, block: B:204:0x041b  */
    /* JADX WARN: Code duplicated, block: B:207:0x0420  */
    /* JADX WARN: Code duplicated, block: B:208:0x0423  */
    /* JADX WARN: Code duplicated, block: B:210:0x0426  */
    /* JADX WARN: Code duplicated, block: B:211:0x0429  */
    public final yng a(Class cls) {
        yng rngVar;
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int iCharAt4;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        char cCharAt;
        int i5;
        int i6;
        char cCharAt2;
        int i7;
        char cCharAt3;
        int i8;
        char cCharAt4;
        int i9;
        char cCharAt5;
        int i10;
        char cCharAt6;
        int i11;
        char cCharAt7;
        Object[] objArr;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i17;
        int i18;
        Field fieldZ;
        int i19;
        int i20;
        char cCharAt8;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Object obj;
        Field fieldZ2;
        int i29;
        Object obj2;
        Field fieldZ3;
        int i30;
        char cCharAt9;
        int i31;
        int i32;
        char cCharAt10;
        int i33;
        int i34;
        char cCharAt11;
        int i35;
        char cCharAt12;
        ConcurrentHashMap concurrentHashMap = this.b;
        Object obj3 = concurrentHashMap.get(cls);
        if (obj3 != null) {
            return (yng) obj3;
        }
        m8c m8cVar = zng.a;
        if (!omg.class.isAssignableFrom(cls)) {
            int i36 = slg.a;
        }
        xng xngVarL = ((vrb) this.a.a).l(cls);
        int i37 = 0;
        if ((xngVarL.d & 2) == 2) {
            int i38 = slg.a;
            m8c m8cVar2 = zng.a;
            uzd uzdVar = img.a;
            rngVar = new rng(m8cVar2, xngVarL.a);
        } else {
            int i39 = slg.a;
            int i40 = sng.a;
            int i41 = eng.a;
            m8c m8cVar3 = zng.a;
            uzd uzdVar2 = xngVarL.a() + (-1) != 1 ? img.a : null;
            int i42 = ing.a;
            int[] iArr2 = qng.k;
            if (!(xngVarL instanceof xng)) {
                r3.f();
                return null;
            }
            String str = xngVarL.b;
            int length = str.length();
            if (str.charAt(0) >= 55296) {
                int i43 = 1;
                while (true) {
                    i = i43 + 1;
                    if (str.charAt(i43) < 55296) {
                        break;
                    }
                    i43 = i;
                }
            } else {
                i = 1;
            }
            int i44 = i + 1;
            int iCharAt5 = str.charAt(i);
            if (iCharAt5 >= 55296) {
                int i45 = iCharAt5 & 8191;
                int i46 = 13;
                while (true) {
                    i35 = i44 + 1;
                    cCharAt12 = str.charAt(i44);
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt12 & 8191) << i46;
                    i46 += 13;
                    i44 = i35;
                }
                iCharAt5 = i45 | (cCharAt12 << i46);
                i44 = i35;
            }
            if (iCharAt5 == 0) {
                iCharAt = 0;
                iCharAt2 = 0;
                iCharAt3 = 0;
                iCharAt4 = 0;
                i2 = 0;
                iArr = qng.k;
                i3 = 0;
            } else {
                int i47 = i44 + 1;
                int iCharAt6 = str.charAt(i44);
                if (iCharAt6 >= 55296) {
                    int i48 = iCharAt6 & 8191;
                    int i49 = 13;
                    while (true) {
                        i11 = i47 + 1;
                        cCharAt7 = str.charAt(i47);
                        if (cCharAt7 < 55296) {
                            break;
                        }
                        i48 |= (cCharAt7 & 8191) << i49;
                        i49 += 13;
                        i47 = i11;
                    }
                    iCharAt6 = i48 | (cCharAt7 << i49);
                    i47 = i11;
                }
                int i50 = i47 + 1;
                int iCharAt7 = str.charAt(i47);
                if (iCharAt7 >= 55296) {
                    int i51 = iCharAt7 & 8191;
                    int i52 = 13;
                    while (true) {
                        i10 = i50 + 1;
                        cCharAt6 = str.charAt(i50);
                        if (cCharAt6 < 55296) {
                            break;
                        }
                        i51 |= (cCharAt6 & 8191) << i52;
                        i52 += 13;
                        i50 = i10;
                    }
                    iCharAt7 = i51 | (cCharAt6 << i52);
                    i50 = i10;
                }
                int i53 = i50 + 1;
                iCharAt = str.charAt(i50);
                if (iCharAt >= 55296) {
                    int i54 = iCharAt & 8191;
                    int i55 = 13;
                    while (true) {
                        i9 = i53 + 1;
                        cCharAt5 = str.charAt(i53);
                        if (cCharAt5 < 55296) {
                            break;
                        }
                        i54 |= (cCharAt5 & 8191) << i55;
                        i55 += 13;
                        i53 = i9;
                    }
                    iCharAt = i54 | (cCharAt5 << i55);
                    i53 = i9;
                }
                int i56 = i53 + 1;
                iCharAt2 = str.charAt(i53);
                if (iCharAt2 >= 55296) {
                    int i57 = iCharAt2 & 8191;
                    int i58 = 13;
                    while (true) {
                        i8 = i56 + 1;
                        cCharAt4 = str.charAt(i56);
                        if (cCharAt4 < 55296) {
                            break;
                        }
                        i57 |= (cCharAt4 & 8191) << i58;
                        i58 += 13;
                        i56 = i8;
                    }
                    iCharAt2 = i57 | (cCharAt4 << i58);
                    i56 = i8;
                }
                int i59 = i56 + 1;
                int iCharAt8 = str.charAt(i56);
                if (iCharAt8 >= 55296) {
                    int i60 = iCharAt8 & 8191;
                    int i61 = 13;
                    while (true) {
                        i7 = i59 + 1;
                        cCharAt3 = str.charAt(i59);
                        if (cCharAt3 < 55296) {
                            break;
                        }
                        i60 |= (cCharAt3 & 8191) << i61;
                        i61 += 13;
                        i59 = i7;
                    }
                    iCharAt8 = i60 | (cCharAt3 << i61);
                    i59 = i7;
                }
                int i62 = i59 + 1;
                iCharAt3 = str.charAt(i59);
                if (iCharAt3 >= 55296) {
                    int i63 = iCharAt3 & 8191;
                    int i64 = 13;
                    while (true) {
                        i6 = i62 + 1;
                        cCharAt2 = str.charAt(i62);
                        if (cCharAt2 < 55296) {
                            break;
                        }
                        i63 |= (cCharAt2 & 8191) << i64;
                        i64 += 13;
                        i62 = i6;
                    }
                    iCharAt3 = i63 | (cCharAt2 << i64);
                    i62 = i6;
                }
                int i65 = i62 + 1;
                if (str.charAt(i62) >= 55296) {
                    do {
                        i5 = i65;
                        i65 = i5 + 1;
                    } while (str.charAt(i5) >= 55296);
                }
                int i66 = i65;
                int i67 = i66 + 1;
                iCharAt4 = str.charAt(i66);
                if (iCharAt4 >= 55296) {
                    int i68 = iCharAt4 & 8191;
                    int i69 = i67;
                    int i70 = 13;
                    while (true) {
                        i4 = i69 + 1;
                        cCharAt = str.charAt(i69);
                        if (cCharAt < 55296) {
                            break;
                        }
                        i68 |= (cCharAt & 8191) << i70;
                        i70 += 13;
                        i69 = i4;
                    }
                    iCharAt4 = i68 | (cCharAt << i70);
                    i67 = i4;
                }
                i2 = iCharAt6 + iCharAt6 + iCharAt7;
                int i71 = iCharAt8;
                iArr = new int[iCharAt4 + iCharAt3 + iCharAt6];
                i3 = i71;
                i37 = iCharAt6;
                i44 = i67;
            }
            Unsafe unsafe = qng.l;
            Object[] objArr2 = xngVarL.c;
            Class<?> cls2 = xngVarL.a.getClass();
            int i72 = iCharAt3 + iCharAt4;
            int i73 = i37;
            int i74 = i3 + i3;
            int[] iArr3 = new int[i3 * 3];
            Object[] objArr3 = new Object[i74];
            int i75 = i72;
            int i76 = iCharAt4;
            int i77 = 0;
            int i78 = 0;
            while (i44 < length) {
                int i79 = i44 + 1;
                int iCharAt9 = str.charAt(i44);
                int i80 = length;
                if (iCharAt9 >= 55296) {
                    int i81 = iCharAt9 & 8191;
                    int i82 = i79;
                    int i83 = 13;
                    while (true) {
                        i34 = i82 + 1;
                        cCharAt11 = str.charAt(i82);
                        objArr = objArr3;
                        if (cCharAt11 < 55296) {
                            break;
                        }
                        i81 |= (cCharAt11 & 8191) << i83;
                        i83 += 13;
                        i82 = i34;
                        objArr3 = objArr;
                    }
                    iCharAt9 = i81 | (cCharAt11 << i83);
                    i12 = i34;
                } else {
                    objArr = objArr3;
                    i12 = i79;
                }
                int i84 = i12 + 1;
                int iCharAt10 = str.charAt(i12);
                if (iCharAt10 >= 55296) {
                    int i85 = iCharAt10 & 8191;
                    int i86 = i84;
                    int i87 = 13;
                    while (true) {
                        i32 = i86 + 1;
                        cCharAt10 = str.charAt(i86);
                        i33 = i85;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i85 = i33 | ((cCharAt10 & 8191) << i87);
                        i87 += 13;
                        i86 = i32;
                    }
                    iCharAt10 = i33 | (cCharAt10 << i87);
                    i13 = i32;
                } else {
                    i13 = i84;
                }
                Object[] objArr4 = objArr2;
                if ((iCharAt10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                    iArr[i78] = i77;
                    i78++;
                }
                int i88 = iCharAt10 & 255;
                int i89 = iCharAt9;
                int i90 = iCharAt10 & 2048;
                if (i88 >= 51) {
                    int i91 = i13 + 1;
                    int iCharAt11 = str.charAt(i13);
                    if (iCharAt11 >= 55296) {
                        int i92 = iCharAt11 & 8191;
                        int i93 = i91;
                        int i94 = 13;
                        while (true) {
                            i30 = i93 + 1;
                            cCharAt9 = str.charAt(i93);
                            i31 = i92;
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i92 = i31 | ((cCharAt9 & 8191) << i94);
                            i94 += 13;
                            i93 = i30;
                        }
                        iCharAt11 = i31 | (cCharAt9 << i94);
                        i25 = i30;
                    } else {
                        i25 = i91;
                    }
                    int i95 = iCharAt11;
                    int i96 = i88 - 51;
                    i17 = i25;
                    if (i96 == 9 || i96 == 17) {
                        i26 = i2 + 1;
                        int i97 = i77 / 3;
                        objArr[i97 + i97 + 1] = objArr4[i2];
                    } else {
                        if (i96 != 12) {
                            i27 = i90;
                        } else if (xngVarL.a() == 1 || i90 != 0) {
                            i26 = i2 + 1;
                            int i98 = i77 / 3;
                            objArr[i98 + i98 + 1] = objArr4[i2];
                        } else {
                            i27 = 0;
                        }
                        i28 = i95 + i95;
                        obj = objArr4[i28];
                        int i99 = i27;
                        if (obj instanceof Field) {
                            fieldZ2 = (Field) obj;
                        } else {
                            fieldZ2 = qng.z((String) obj, cls2);
                            objArr4[i28] = fieldZ2;
                            iArr[i75] = i77;
                            i75++;
                        }
                        int i100 = iCharAt;
                        i14 = iCharAt2;
                        int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZ2);
                        i29 = i28 + 1;
                        obj2 = objArr4[i29];
                        if (obj2 instanceof Field) {
                            fieldZ3 = (Field) obj2;
                        } else {
                            fieldZ3 = qng.z((String) obj2, cls2);
                            objArr4[i29] = fieldZ3;
                        }
                        i15 = i100;
                        i16 = i99;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZ3);
                        iArr3 = iArr3;
                        i18 = iObjectFieldOffset3;
                    }
                    i2 = i26;
                    i27 = i90;
                    i28 = i95 + i95;
                    obj = objArr4[i28];
                    int i910 = i27;
                    if (obj instanceof Field) {
                        fieldZ2 = (Field) obj;
                    } else {
                        fieldZ2 = qng.z((String) obj, cls2);
                        objArr4[i28] = fieldZ2;
                        iArr[i75] = i77;
                        i75++;
                    }
                    int i101 = iCharAt;
                    i14 = iCharAt2;
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZ2);
                    i29 = i28 + 1;
                    obj2 = objArr4[i29];
                    if (obj2 instanceof Field) {
                        fieldZ3 = (Field) obj2;
                    } else {
                        fieldZ3 = qng.z((String) obj2, cls2);
                        objArr4[i29] = fieldZ3;
                    }
                    i15 = i101;
                    i16 = i910;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZ3);
                    iArr3 = iArr3;
                    i18 = iObjectFieldOffset4;
                } else {
                    int i102 = iCharAt;
                    i14 = iCharAt2;
                    int i103 = i2 + 1;
                    Field fieldZ4 = qng.z((String) objArr4[i2], cls2);
                    i15 = i102;
                    if (i88 == 9 || i88 == 17) {
                        int i104 = i77 / 3;
                        objArr[i104 + i104 + 1] = fieldZ4.getType();
                    } else {
                        if (i88 != 27) {
                            if (i88 == 49) {
                                i2 += 2;
                                i21 = 1;
                            } else if (i88 == 12 || i88 == 30 || i88 == 44) {
                                iArr3 = iArr3;
                                if (xngVarL.a() == 1 || i90 != 0) {
                                    i2 += 2;
                                    int i105 = i77 / 3;
                                    objArr[i105 + i105 + 1] = objArr4[i103];
                                    i16 = i90;
                                } else {
                                    i2 = i103;
                                    i16 = 0;
                                }
                            } else if (i88 == 50) {
                                int i106 = i2 + 2;
                                i76++;
                                iArr[i76] = i77;
                                int i107 = i77 / 3;
                                int i108 = i107 + i107;
                                objArr[i108] = objArr4[i103];
                                if (i90 != 0) {
                                    objArr[i108 + 1] = objArr4[i106];
                                    i2 += 3;
                                    i16 = i90;
                                } else {
                                    i2 = i106;
                                    i16 = 0;
                                }
                                iArr3 = iArr3;
                            }
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZ4);
                            iObjectFieldOffset2 = 1048575;
                            if ((iCharAt10 & 4096) != 0 || i88 > 17) {
                                i17 = i13;
                                i18 = iObjectFieldOffset;
                            } else {
                                int i109 = i13 + 1;
                                int iCharAt12 = str.charAt(i13);
                                if (iCharAt12 >= 55296) {
                                    int i110 = iCharAt12 & 8191;
                                    int i111 = 13;
                                    while (true) {
                                        i20 = i109 + 1;
                                        cCharAt8 = str.charAt(i109);
                                        if (cCharAt8 < 55296) {
                                            break;
                                        }
                                        i110 |= (cCharAt8 & 8191) << i111;
                                        i111 += 13;
                                        i109 = i20;
                                    }
                                    iCharAt12 = i110 | (cCharAt8 << i111);
                                    i109 = i20;
                                }
                                int i112 = (iCharAt12 / 32) + i73 + i73;
                                Object obj4 = objArr4[i112];
                                str = str;
                                if (obj4 instanceof Field) {
                                    fieldZ = (Field) obj4;
                                } else {
                                    fieldZ = qng.z((String) obj4, cls2);
                                    objArr4[i112] = fieldZ;
                                }
                                i88 = i88;
                                i19 = iCharAt12 % 32;
                                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZ);
                                i18 = iObjectFieldOffset;
                                i17 = i109;
                            }
                            int i113 = i77 + 1;
                            iArr3[i77] = i89;
                            int i114 = i77 + 2;
                            if ((iCharAt10 & 512) != 0) {
                                i22 = 536870912;
                            } else {
                                i22 = 0;
                            }
                            if ((iCharAt10 & 256) != 0) {
                                i23 = 268435456;
                            } else {
                                i23 = 0;
                            }
                            if (i16 != 0) {
                                i24 = Integer.MIN_VALUE;
                            } else {
                                i24 = 0;
                            }
                            iArr3[i113] = (i88 << 20) | i23 | i22 | i24 | i18;
                            i77 += 3;
                            iArr3[i114] = (i19 << 20) | iObjectFieldOffset2;
                            objArr2 = objArr4;
                            length = i80;
                            objArr3 = objArr;
                            iCharAt = i15;
                            iArr3 = iArr3;
                            str = str;
                            i44 = i17;
                            iCharAt2 = i14;
                        } else {
                            i21 = 1;
                            i2 += 2;
                        }
                        int i115 = i77 / 3;
                        objArr[i115 + i115 + i21] = objArr4[i103];
                        i16 = i90;
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZ4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt10 & 4096) != 0) {
                        }
                        i17 = i13;
                        i18 = iObjectFieldOffset;
                    }
                    i2 = i103;
                    i16 = i90;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZ4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt10 & 4096) != 0) {
                    }
                    i17 = i13;
                    i18 = iObjectFieldOffset;
                }
                i19 = 0;
                int i116 = i77 + 1;
                iArr3[i77] = i89;
                int i117 = i77 + 2;
                if ((iCharAt10 & 512) != 0) {
                    i22 = 536870912;
                } else {
                    i22 = 0;
                }
                if ((iCharAt10 & 256) != 0) {
                    i23 = 268435456;
                } else {
                    i23 = 0;
                }
                if (i16 != 0) {
                    i24 = Integer.MIN_VALUE;
                } else {
                    i24 = 0;
                }
                iArr3[i116] = (i88 << 20) | i23 | i22 | i24 | i18;
                i77 += 3;
                iArr3[i117] = (i19 << 20) | iObjectFieldOffset2;
                objArr2 = objArr4;
                length = i80;
                objArr3 = objArr;
                iCharAt = i15;
                iArr3 = iArr3;
                str = str;
                i44 = i17;
                iCharAt2 = i14;
            }
            rngVar = new qng(iArr3, objArr3, iCharAt, iCharAt2, xngVarL.a, iArr, iCharAt4, i72, m8cVar3, uzdVar2);
        }
        yng yngVar = (yng) concurrentHashMap.putIfAbsent(cls, rngVar);
        return yngVar != null ? yngVar : rngVar;
    }
}
