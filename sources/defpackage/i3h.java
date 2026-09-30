package defpackage;

import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i3h {
    public static final i3h b = new i3h();
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX WARN: Code duplicated, block: B:149:0x030e  */
    /* JADX WARN: Code duplicated, block: B:151:0x0313  */
    /* JADX WARN: Code duplicated, block: B:154:0x0331  */
    /* JADX WARN: Code duplicated, block: B:155:0x0334  */
    /* JADX WARN: Code duplicated, block: B:210:0x0463  */
    public final s3h a(Class cls) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        char cCharAt;
        int i14;
        int i15;
        char cCharAt2;
        int i16;
        char cCharAt3;
        int i17;
        char cCharAt4;
        int i18;
        char cCharAt5;
        int i19;
        char cCharAt6;
        int i20;
        char cCharAt7;
        s3h a3hVar;
        int i21;
        int i22;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i23;
        int i24;
        int i25;
        int i26;
        Field fieldB;
        int i27;
        char cCharAt8;
        int i28;
        int i29;
        int i30;
        int i31;
        Object obj;
        Field fieldB2;
        int i32;
        Object obj2;
        Field fieldB3;
        int i33;
        char cCharAt9;
        int i34;
        int i35;
        char cCharAt10;
        int i36;
        int i37;
        char cCharAt11;
        int i38;
        int i39;
        char cCharAt12;
        ConcurrentHashMap concurrentHashMap = this.a;
        Object obj3 = concurrentHashMap.get(cls);
        if (obj3 != null) {
            return (s3h) obj3;
        }
        mwg mwgVar = v3h.a;
        if (!l0h.class.isAssignableFrom(cls)) {
            int i40 = hyg.a;
        }
        int i41 = hyg.a;
        if (!l0h.class.isAssignableFrom(cls)) {
            qc0.j("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            q3h q3hVar = (q3h) l0h.m(cls.asSubclass(l0h.class)).j(3);
            int iCharAt2 = 0;
            if ((q3hVar.d & 2) == 2) {
                a3hVar = new c3h(v3h.a, q3hVar.a);
            } else {
                mwg mwgVar2 = v3h.a;
                nwg nwgVar = q3hVar.a() + (-1) != 1 ? qzg.a : null;
                Unsafe unsafe = a3h.j;
                if (unsafe == null) {
                    ho7.n("Lite gencode is primarily intended for Android use and uses sun.misc.Unsafe which is not available in the current environment. To run in this environment, you may need to switch to standard gencode.");
                    return null;
                }
                if (!(q3hVar instanceof q3h)) {
                    r3.f();
                    return null;
                }
                String str = q3hVar.b;
                int length = str.length();
                if (str.charAt(0) >= 55296) {
                    int i42 = 1;
                    while (true) {
                        i = i42 + 1;
                        if (str.charAt(i42) < 55296) {
                            break;
                        }
                        i42 = i;
                    }
                } else {
                    i = 1;
                }
                int i43 = i + 1;
                int iCharAt3 = str.charAt(i);
                if (iCharAt3 >= 55296) {
                    int i44 = iCharAt3 & 8191;
                    int i45 = 13;
                    while (true) {
                        i39 = i43 + 1;
                        cCharAt12 = str.charAt(i43);
                        if (cCharAt12 < 55296) {
                            break;
                        }
                        i44 |= (cCharAt12 & 8191) << i45;
                        i45 += 13;
                        i43 = i39;
                    }
                    iCharAt3 = i44 | (cCharAt12 << i45);
                    i43 = i39;
                }
                if (iCharAt3 == 0) {
                    iArr = a3h.i;
                    i10 = 0;
                    i8 = 0;
                    i9 = 0;
                    iCharAt = 0;
                    i11 = 0;
                    i6 = i43;
                    i12 = 0;
                } else {
                    int i46 = i43 + 1;
                    int iCharAt4 = str.charAt(i43);
                    if (iCharAt4 >= 55296) {
                        int i47 = iCharAt4 & 8191;
                        int i48 = 13;
                        while (true) {
                            i20 = i46 + 1;
                            cCharAt7 = str.charAt(i46);
                            if (cCharAt7 < 55296) {
                                break;
                            }
                            i47 |= (cCharAt7 & 8191) << i48;
                            i48 += 13;
                            i46 = i20;
                        }
                        iCharAt4 = i47 | (cCharAt7 << i48);
                        i46 = i20;
                    }
                    int i49 = i46 + 1;
                    int iCharAt5 = str.charAt(i46);
                    if (iCharAt5 >= 55296) {
                        int i50 = iCharAt5 & 8191;
                        int i51 = 13;
                        while (true) {
                            i19 = i49 + 1;
                            cCharAt6 = str.charAt(i49);
                            if (cCharAt6 < 55296) {
                                break;
                            }
                            i50 |= (cCharAt6 & 8191) << i51;
                            i51 += 13;
                            i49 = i19;
                        }
                        iCharAt5 = i50 | (cCharAt6 << i51);
                        i49 = i19;
                    }
                    int i52 = i49 + 1;
                    iCharAt = str.charAt(i49);
                    if (iCharAt >= 55296) {
                        int i53 = iCharAt & 8191;
                        int i54 = i52;
                        int i55 = 13;
                        while (true) {
                            i18 = i54 + 1;
                            cCharAt5 = str.charAt(i54);
                            if (cCharAt5 < 55296) {
                                break;
                            }
                            i53 |= (cCharAt5 & 8191) << i55;
                            i55 += 13;
                            i54 = i18;
                        }
                        iCharAt = i53 | (cCharAt5 << i55);
                        i2 = i18;
                    } else {
                        i2 = i52;
                    }
                    int i56 = i2 + 1;
                    int iCharAt6 = str.charAt(i2);
                    if (iCharAt6 >= 55296) {
                        int i57 = iCharAt6 & 8191;
                        int i58 = i56;
                        int i59 = 13;
                        while (true) {
                            i17 = i58 + 1;
                            cCharAt4 = str.charAt(i58);
                            if (cCharAt4 < 55296) {
                                break;
                            }
                            i57 |= (cCharAt4 & 8191) << i59;
                            i59 += 13;
                            i58 = i17;
                        }
                        iCharAt6 = i57 | (cCharAt4 << i59);
                        i3 = i17;
                    } else {
                        i3 = i56;
                    }
                    int i60 = i3 + 1;
                    iCharAt2 = str.charAt(i3);
                    if (iCharAt2 >= 55296) {
                        int i61 = iCharAt2 & 8191;
                        int i62 = i60;
                        int i63 = 13;
                        while (true) {
                            i16 = i62 + 1;
                            cCharAt3 = str.charAt(i62);
                            if (cCharAt3 < 55296) {
                                break;
                            }
                            i61 |= (cCharAt3 & 8191) << i63;
                            i63 += 13;
                            i62 = i16;
                        }
                        iCharAt2 = i61 | (cCharAt3 << i63);
                        i4 = i16;
                    } else {
                        i4 = i60;
                    }
                    int i64 = i4 + 1;
                    int iCharAt7 = str.charAt(i4);
                    if (iCharAt7 >= 55296) {
                        int i65 = iCharAt7 & 8191;
                        int i66 = i64;
                        int i67 = 13;
                        while (true) {
                            i15 = i66 + 1;
                            cCharAt2 = str.charAt(i66);
                            if (cCharAt2 < 55296) {
                                break;
                            }
                            i65 |= (cCharAt2 & 8191) << i67;
                            i67 += 13;
                            i66 = i15;
                        }
                        iCharAt7 = i65 | (cCharAt2 << i67);
                        i5 = i15;
                    } else {
                        i5 = i64;
                    }
                    int i68 = i5 + 1;
                    if (str.charAt(i5) >= 55296) {
                        do {
                            i14 = i68;
                            i68 = i14 + 1;
                        } while (str.charAt(i14) >= 55296);
                    }
                    int i69 = i68;
                    i6 = i69 + 1;
                    int iCharAt8 = str.charAt(i69);
                    if (iCharAt8 >= 55296) {
                        int i70 = iCharAt8 & 8191;
                        int i71 = i6;
                        int i72 = 13;
                        while (true) {
                            i13 = i71 + 1;
                            cCharAt = str.charAt(i71);
                            i7 = iCharAt6;
                            if (cCharAt < 55296) {
                                break;
                            }
                            i70 |= (cCharAt & 8191) << i72;
                            i72 += 13;
                            i71 = i13;
                            iCharAt6 = i7;
                        }
                        iCharAt8 = i70 | (cCharAt << i72);
                        i6 = i13;
                    } else {
                        i7 = iCharAt6;
                    }
                    i8 = iCharAt4 + iCharAt4 + iCharAt5;
                    iArr = new int[iCharAt8 + iCharAt7 + iCharAt4];
                    int i73 = iCharAt7;
                    i9 = iCharAt8;
                    i10 = i73;
                    i11 = iCharAt4;
                    i12 = i7;
                }
                Object[] objArr = q3hVar.c;
                Class<?> cls2 = q3hVar.a.getClass();
                int i74 = i10 + i9;
                int i75 = iCharAt2;
                int[] iArr2 = new int[i75 * 3];
                Object[] objArr2 = new Object[i75 + i75];
                int i76 = i6;
                int i77 = i9;
                int i78 = i74;
                int i79 = 0;
                int i80 = 0;
                while (i76 < length) {
                    int i81 = i76 + 1;
                    int iCharAt9 = str.charAt(i76);
                    int i82 = length;
                    if (iCharAt9 >= 55296) {
                        int i83 = iCharAt9 & 8191;
                        int i84 = i81;
                        int i85 = 13;
                        while (true) {
                            i37 = i84 + 1;
                            cCharAt11 = str.charAt(i84);
                            i38 = i83;
                            if (cCharAt11 < 55296) {
                                break;
                            }
                            i83 = i38 | ((cCharAt11 & 8191) << i85);
                            i85 += 13;
                            i84 = i37;
                        }
                        iCharAt9 = i38 | (cCharAt11 << i85);
                        i21 = i37;
                    } else {
                        i21 = i81;
                    }
                    int i86 = i21 + 1;
                    int iCharAt10 = str.charAt(i21);
                    int i87 = iCharAt9;
                    if (iCharAt10 >= 55296) {
                        int i88 = iCharAt10 & 8191;
                        int i89 = i86;
                        int i90 = 13;
                        while (true) {
                            i35 = i89 + 1;
                            cCharAt10 = str.charAt(i89);
                            i36 = i88;
                            if (cCharAt10 < 55296) {
                                break;
                            }
                            i88 = i36 | ((cCharAt10 & 8191) << i90);
                            i90 += 13;
                            i89 = i35;
                        }
                        iCharAt10 = i36 | (cCharAt10 << i90);
                        i22 = i35;
                    } else {
                        i22 = i86;
                    }
                    int[] iArr3 = iArr2;
                    if ((iCharAt10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                        iArr[i80] = i79;
                        i80++;
                    }
                    int i91 = iCharAt10 & 255;
                    int i92 = i12;
                    int i93 = iCharAt10 & 2048;
                    if (i91 >= 51) {
                        int i94 = i22 + 1;
                        int iCharAt11 = str.charAt(i22);
                        if (iCharAt11 >= 55296) {
                            int i95 = iCharAt11 & 8191;
                            int i96 = i94;
                            int i97 = 13;
                            while (true) {
                                i33 = i96 + 1;
                                cCharAt9 = str.charAt(i96);
                                i34 = i95;
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i95 = i34 | ((cCharAt9 & 8191) << i97);
                                i97 += 13;
                                i96 = i33;
                            }
                            iCharAt11 = i34 | (cCharAt9 << i97);
                            i28 = i33;
                        } else {
                            i28 = i94;
                        }
                        int i98 = iCharAt11;
                        int i99 = i91 - 51;
                        i23 = i28;
                        if (i99 == 9 || i99 == 17) {
                            i29 = i8 + 1;
                            int i100 = i79 / 3;
                            objArr2[i100 + i100 + 1] = objArr[i8];
                        } else {
                            if (i99 != 12) {
                                i30 = i93;
                            } else if (q3hVar.a() == 1 || i93 != 0) {
                                i29 = i8 + 1;
                                int i101 = i79 / 3;
                                objArr2[i101 + i101 + 1] = objArr[i8];
                            } else {
                                i30 = 0;
                            }
                            i31 = i98 + i98;
                            obj = objArr[i31];
                            int i102 = i30;
                            if (obj instanceof Field) {
                                fieldB2 = (Field) obj;
                            } else {
                                fieldB2 = a3h.B((String) obj, cls2);
                                objArr[i31] = fieldB2;
                                iArr[i78] = i79;
                                i78++;
                            }
                            int i103 = i8;
                            int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldB2);
                            i32 = i31 + 1;
                            obj2 = objArr[i32];
                            if (obj2 instanceof Field) {
                                fieldB3 = (Field) obj2;
                            } else {
                                fieldB3 = a3h.B((String) obj2, cls2);
                                objArr[i32] = fieldB3;
                            }
                            int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldB3);
                            i9 = i9;
                            i25 = i102;
                            i8 = i103;
                            i26 = 0;
                            iObjectFieldOffset2 = iObjectFieldOffset4;
                            iArr = iArr;
                            i24 = iObjectFieldOffset3;
                        }
                        i8 = i29;
                        i30 = i93;
                        i31 = i98 + i98;
                        obj = objArr[i31];
                        int i104 = i30;
                        if (obj instanceof Field) {
                            fieldB2 = (Field) obj;
                        } else {
                            fieldB2 = a3h.B((String) obj, cls2);
                            objArr[i31] = fieldB2;
                            iArr[i78] = i79;
                            i78++;
                        }
                        int i105 = i8;
                        int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldB2);
                        i32 = i31 + 1;
                        obj2 = objArr[i32];
                        if (obj2 instanceof Field) {
                            fieldB3 = (Field) obj2;
                        } else {
                            fieldB3 = a3h.B((String) obj2, cls2);
                            objArr[i32] = fieldB3;
                        }
                        int iObjectFieldOffset6 = (int) unsafe.objectFieldOffset(fieldB3);
                        i9 = i9;
                        i25 = i104;
                        i8 = i105;
                        i26 = 0;
                        iObjectFieldOffset2 = iObjectFieldOffset6;
                        iArr = iArr;
                        i24 = iObjectFieldOffset5;
                    } else {
                        int i106 = i8 + 1;
                        Field fieldB4 = a3h.B((String) objArr[i8], cls2);
                        int i107 = i8;
                        if (i91 == 9 || i91 == 17) {
                            int i108 = i79 / 3;
                            objArr2[i108 + i108 + 1] = fieldB4.getType();
                        } else {
                            if (i91 == 27 || i91 == 49) {
                                i8 = i107 + 2;
                                int i109 = i79 / 3;
                                objArr2[i109 + i109 + 1] = objArr[i106];
                                i9 = i9;
                            } else if (i91 == 12 || i91 == 30 || i91 == 44) {
                                iArr = iArr;
                                if (q3hVar.a() == 1 || i93 != 0) {
                                    i8 = i107 + 2;
                                    int i110 = i79 / 3;
                                    objArr2[i110 + i110 + 1] = objArr[i106];
                                    i9 = i9;
                                } else {
                                    i9 = i9;
                                    i8 = i106;
                                    i93 = 0;
                                }
                            } else if (i91 == 50) {
                                i8 = i107 + 2;
                                i77++;
                                iArr[i77] = i79;
                                int i111 = i79 / 3;
                                int i112 = i111 + i111;
                                objArr2[i112] = objArr[i106];
                                if (i93 != 0) {
                                    objArr2[i112 + 1] = objArr[i8];
                                    i8 = i107 + 3;
                                } else {
                                    i93 = 0;
                                }
                                iArr = iArr;
                            }
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldB4);
                            iObjectFieldOffset2 = 1048575;
                            if ((iCharAt10 & 4096) != 0 || i91 > 17) {
                                i23 = i22;
                                i24 = iObjectFieldOffset;
                                i25 = i93;
                                i26 = 0;
                            } else {
                                int i113 = i22 + 1;
                                int iCharAt12 = str.charAt(i22);
                                if (iCharAt12 >= 55296) {
                                    int i114 = iCharAt12 & 8191;
                                    int i115 = 13;
                                    while (true) {
                                        i27 = i113 + 1;
                                        cCharAt8 = str.charAt(i113);
                                        if (cCharAt8 < 55296) {
                                            break;
                                        }
                                        i114 |= (cCharAt8 & 8191) << i115;
                                        i115 += 13;
                                        i113 = i27;
                                    }
                                    iCharAt12 = i114 | (cCharAt8 << i115);
                                    i113 = i27;
                                }
                                int i116 = (iCharAt12 / 32) + i11 + i11;
                                Object obj4 = objArr[i116];
                                if (obj4 instanceof Field) {
                                    fieldB = (Field) obj4;
                                } else {
                                    fieldB = a3h.B((String) obj4, cls2);
                                    objArr[i116] = fieldB;
                                }
                                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldB);
                                i26 = iCharAt12 % 32;
                                i24 = iObjectFieldOffset;
                                i23 = i113;
                                i25 = i93;
                            }
                        }
                        i9 = i9;
                        i8 = i106;
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldB4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt10 & 4096) != 0) {
                            i23 = i22;
                            i24 = iObjectFieldOffset;
                            i25 = i93;
                            i26 = 0;
                        } else {
                            i23 = i22;
                            i24 = iObjectFieldOffset;
                            i25 = i93;
                            i26 = 0;
                        }
                    }
                    int i117 = i79 + 1;
                    iArr3[i79] = i87;
                    int i118 = i79 + 2;
                    int i119 = i26;
                    iArr3[i117] = ((iCharAt10 & 512) != 0 ? 536870912 : 0) | ((iCharAt10 & 256) != 0 ? 268435456 : 0) | (i25 != 0 ? Integer.MIN_VALUE : 0) | (i91 << 20) | i24;
                    i79 += 3;
                    iArr3[i118] = (i119 << 20) | iObjectFieldOffset2;
                    length = i82;
                    i9 = i9;
                    iArr2 = iArr3;
                    i12 = i92;
                    iArr = iArr;
                    cls2 = cls2;
                    str = str;
                    i76 = i23;
                }
                a3hVar = new a3h(iArr2, objArr2, iCharAt, i12, q3hVar.a, iArr, i9, i74, mwgVar2, nwgVar);
            }
            s3h s3hVar = (s3h) concurrentHashMap.putIfAbsent(cls, a3hVar);
            return s3hVar != null ? s3hVar : a3hVar;
        } catch (Exception e) {
            cva.q("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }
}
