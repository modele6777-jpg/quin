package defpackage;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i35 {
    public static final Pattern b = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern c = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern d = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final ArrayList e;
    public final ArrayList a;

    static {
        g35 g35Var = new g35(0);
        g35Var.b = 0;
        e = Collections.list(g35Var);
    }

    public i35() {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        g35 g35Var = new g35(1);
        g35Var.b = 0;
        this.a = Collections.list(g35Var);
    }

    public static Pair a(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair pairA = a(strArrSplit[0]);
            if (((Integer) pairA.first).intValue() == 2) {
                return pairA;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair pairA2 = a(strArrSplit[i]);
                int iIntValue = (((Integer) pairA2.first).equals(pairA.first) || ((Integer) pairA2.second).equals(pairA.first)) ? ((Integer) pairA.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairA.second).intValue() == -1 || !(((Integer) pairA2.first).equals(pairA.second) || ((Integer) pairA2.second).equals(pairA.second))) ? -1 : ((Integer) pairA.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairA = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairA = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairA;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j = Long.parseLong(str);
                    if (j < 0 || j > 65535) {
                        return j < 0 ? new Pair(9, -1) : new Pair(4, -1);
                    }
                    return new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    Double.parseDouble(str);
                    return new Pair(12, -1);
                }
            } catch (NumberFormatException unused2) {
                return new Pair(2, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j2 = (long) Double.parseDouble(strArrSplit2[0]);
                long j3 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j2 >= 0 && j3 >= 0) {
                    if (j2 <= 2147483647L && j3 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public final void b(String str, String str2, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Map) it.next()).containsKey(str)) {
                return;
            }
        }
        c(str, str2, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0318  */
    /* JADX WARN: Code duplicated, block: B:104:0x0329 A[LOOP:9: B:102:0x0326->B:104:0x0329, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x0342  */
    /* JADX WARN: Code duplicated, block: B:109:0x0353 A[LOOP:10: B:107:0x0350->B:109:0x0353, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x0375 A[LOOP:11: B:111:0x0373->B:112:0x0375, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x038d  */
    /* JADX WARN: Code duplicated, block: B:115:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:117:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:119:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:122:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:61:0x0176  */
    /* JADX WARN: Code duplicated, block: B:65:0x017f  */
    /* JADX WARN: Code duplicated, block: B:68:0x018a A[LOOP:1: B:66:0x0187->B:68:0x018a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x01ae A[LOOP:2: B:70:0x01ac->B:71:0x01ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01df A[LOOP:3: B:76:0x01dc->B:78:0x01df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x022b A[LOOP:4: B:80:0x0229->B:81:0x022b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x024d  */
    /* JADX WARN: Code duplicated, block: B:86:0x025d A[LOOP:5: B:84:0x025a->B:86:0x025d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x0281 A[LOOP:6: B:88:0x027f->B:89:0x0281, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x0299  */
    /* JADX WARN: Code duplicated, block: B:94:0x02a9 A[LOOP:7: B:92:0x02a6->B:94:0x02a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x02f5 A[LOOP:8: B:96:0x02f3->B:97:0x02f5, LOOP_END] */
    public final void c(String str, String str2, List list) {
        int i;
        ByteOrder byteOrder;
        int i2;
        f35 f35Var;
        int i3;
        String[] strArrSplit;
        int length;
        int[] iArr;
        int i4;
        ByteBuffer byteBufferWrap;
        int i5;
        String[] strArrSplit2;
        long[] jArr;
        int i6;
        int i7;
        String[] strArrSplit3;
        int length2;
        w21[] w21VarArr;
        int i8;
        int i9;
        ByteBuffer byteBufferWrap2;
        int i10;
        String[] strArrSplit4;
        int length3;
        int[] iArr2;
        int i11;
        ByteBuffer byteBufferWrap3;
        int i12;
        String[] strArrSplit5;
        int length4;
        w21[] w21VarArr2;
        int i13;
        ByteBuffer byteBufferWrap4;
        int i14;
        String[] strArrSplit6;
        int length5;
        double[] dArr;
        int i15;
        ByteBuffer byteBufferWrap5;
        int i16;
        String str3 = str;
        String strReplaceAll = str2;
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && strReplaceAll != null) {
            boolean zFind = c.matcher(strReplaceAll).find();
            boolean zFind2 = d.matcher(strReplaceAll).find();
            if (strReplaceAll.length() != 19 || (!zFind && !zFind2)) {
                b21.W("ExifData", "Invalid value for " + str3 + " : " + strReplaceAll);
                return;
            }
            if (zFind2) {
                strReplaceAll = strReplaceAll.replaceAll("-", ":");
            }
        }
        if ("ISOSpeedRatings".equals(str3)) {
            str3 = "PhotographicSensitivity";
        }
        String str4 = str3;
        int i17 = 3;
        int i18 = 2;
        int i19 = 1;
        if (strReplaceAll != null && k35.d.contains(str4)) {
            if (str4.equals("GPSTimeStamp")) {
                Matcher matcher = b.matcher(strReplaceAll);
                if (!matcher.find()) {
                    b21.W("ExifData", "Invalid value for " + str4 + " : " + strReplaceAll);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                String strGroup = matcher.group(1);
                strGroup.getClass();
                sb.append(Integer.parseInt(strGroup));
                sb.append("/1,");
                String strGroup2 = matcher.group(2);
                strGroup2.getClass();
                sb.append(Integer.parseInt(strGroup2));
                sb.append("/1,");
                String strGroup3 = matcher.group(3);
                strGroup3.getClass();
                sb.append(Integer.parseInt(strGroup3));
                sb.append("/1");
                strReplaceAll = sb.toString();
            } else {
                try {
                    strReplaceAll = ((long) (Double.parseDouble(strReplaceAll) * 10000.0d)) + "/10000";
                } catch (NumberFormatException e2) {
                    b21.X("ExifData", ub3.k("Invalid value for ", str4, " : ", strReplaceAll), e2);
                    return;
                }
            }
        }
        int i20 = 0;
        int i21 = 0;
        while (true) {
            v35[] v35VarArr = k35.b;
            if (i21 >= 4) {
                return;
            }
            v35 v35Var = (v35) ((HashMap) e.get(i21)).get(str4);
            if (v35Var != null) {
                int i22 = v35Var.d;
                int i23 = v35Var.c;
                if (strReplaceAll != null) {
                    Pair pairA = a(strReplaceAll);
                    int i24 = -1;
                    if (i23 != ((Integer) pairA.first).intValue() && i23 != ((Integer) pairA.second).intValue()) {
                        if (i22 != -1 && (i22 == ((Integer) pairA.first).intValue() || i22 == ((Integer) pairA.second).intValue())) {
                            switch (i22) {
                                case 1:
                                    i = i17;
                                    byteOrder = byteOrder2;
                                    Map map = (Map) list.get(i21);
                                    Charset charset = f35.d;
                                    i2 = i19;
                                    if (strReplaceAll.length() == i2) {
                                        i20 = 0;
                                        if (strReplaceAll.charAt(0) < '0') {
                                        }
                                        map.put(str4, f35Var);
                                    } else {
                                        i20 = 0;
                                    }
                                    byte[] bytes = strReplaceAll.getBytes(f35.d);
                                    f35Var = new f35(bytes, i2, bytes.length);
                                    map.put(str4, f35Var);
                                    break;
                                case 2:
                                case 7:
                                    i = i17;
                                    byteOrder = byteOrder2;
                                    i3 = i19;
                                    Map map2 = (Map) list.get(i21);
                                    Charset charset2 = f35.d;
                                    byte[] bytes2 = strReplaceAll.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(f35.d);
                                    i18 = 2;
                                    map2.put(str4, new f35(bytes2, 2, bytes2.length));
                                    i20 = 0;
                                    i2 = i3;
                                    break;
                                case 3:
                                    int i25 = i17;
                                    i3 = i19;
                                    byteOrder = byteOrder2;
                                    strArrSplit = strReplaceAll.split(",", -1);
                                    length = strArrSplit.length;
                                    iArr = new int[length];
                                    for (i4 = 0; i4 < strArrSplit.length; i4++) {
                                        iArr[i4] = Integer.parseInt(strArrSplit[i4]);
                                    }
                                    Map map3 = (Map) list.get(i21);
                                    byteBufferWrap = ByteBuffer.wrap(new byte[f35.f[i25] * length]);
                                    byteBufferWrap.order(byteOrder);
                                    for (i5 = 0; i5 < length; i5++) {
                                        byteBufferWrap.putShort((short) iArr[i5]);
                                    }
                                    i = i25;
                                    map3.put(str4, new f35(byteBufferWrap.array(), i, length));
                                    i20 = 0;
                                    i18 = 2;
                                    i2 = i3;
                                    break;
                                case 4:
                                    i3 = i19;
                                    byteOrder = byteOrder2;
                                    strArrSplit2 = strReplaceAll.split(",", -1);
                                    jArr = new long[strArrSplit2.length];
                                    for (i6 = 0; i6 < strArrSplit2.length; i6++) {
                                        jArr[i6] = Long.parseLong(strArrSplit2[i6]);
                                    }
                                    ((Map) list.get(i21)).put(str4, f35.b(jArr, byteOrder));
                                    i = i17;
                                    i20 = 0;
                                    i18 = 2;
                                    i2 = i3;
                                    break;
                                case 5:
                                    i3 = i19;
                                    i7 = -1;
                                    strArrSplit3 = strReplaceAll.split(",", -1);
                                    length2 = strArrSplit3.length;
                                    w21VarArr = new w21[length2];
                                    i8 = i20;
                                    while (i8 < strArrSplit3.length) {
                                        String[] strArrSplit7 = strArrSplit3[i8].split("/", i7);
                                        w21VarArr[i8] = new w21((long) Double.parseDouble(strArrSplit7[i20]), (long) Double.parseDouble(strArrSplit7[i3]), 2, (byte) 0);
                                        i8++;
                                        byteOrder2 = byteOrder2;
                                        length2 = length2;
                                        i7 = -1;
                                        i20 = 0;
                                    }
                                    byteOrder = byteOrder2;
                                    i9 = length2;
                                    Map map4 = (Map) list.get(i21);
                                    byteBufferWrap2 = ByteBuffer.wrap(new byte[f35.f[5] * i9]);
                                    byteBufferWrap2.order(byteOrder);
                                    for (i10 = 0; i10 < i9; i10++) {
                                        w21 w21Var = w21VarArr[i10];
                                        byteBufferWrap2.putInt((int) w21Var.b);
                                        byteBufferWrap2.putInt((int) w21Var.c);
                                    }
                                    map4.put(str4, new f35(byteBufferWrap2.array(), 5, i9));
                                    i = i17;
                                    i20 = 0;
                                    i18 = 2;
                                    i2 = i3;
                                    break;
                                case 9:
                                    int i26 = i17;
                                    i3 = i19;
                                    strArrSplit4 = strReplaceAll.split(",", -1);
                                    length3 = strArrSplit4.length;
                                    iArr2 = new int[length3];
                                    for (i11 = i20; i11 < strArrSplit4.length; i11++) {
                                        iArr2[i11] = Integer.parseInt(strArrSplit4[i11]);
                                    }
                                    Map map5 = (Map) list.get(i21);
                                    byteBufferWrap3 = ByteBuffer.wrap(new byte[f35.f[9] * length3]);
                                    byteBufferWrap3.order(byteOrder2);
                                    for (i12 = i20; i12 < length3; i12++) {
                                        byteBufferWrap3.putInt(iArr2[i12]);
                                    }
                                    map5.put(str4, new f35(byteBufferWrap3.array(), 9, length3));
                                    i = i26;
                                    byteOrder = byteOrder2;
                                    i2 = i3;
                                    break;
                                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                    i3 = i19;
                                    strArrSplit5 = strReplaceAll.split(",", -1);
                                    length4 = strArrSplit5.length;
                                    w21VarArr2 = new w21[length4];
                                    i13 = i20;
                                    while (i13 < strArrSplit5.length) {
                                        String[] strArrSplit8 = strArrSplit5[i13].split("/", i24);
                                        w21VarArr2[i13] = new w21((long) Double.parseDouble(strArrSplit8[i20]), (long) Double.parseDouble(strArrSplit8[i3]), 2, (byte) 0);
                                        i13++;
                                        i17 = i17;
                                        strReplaceAll = strReplaceAll;
                                        i24 = -1;
                                    }
                                    int i27 = i17;
                                    String str5 = strReplaceAll;
                                    Map map6 = (Map) list.get(i21);
                                    byteBufferWrap4 = ByteBuffer.wrap(new byte[f35.f[10] * length4]);
                                    byteBufferWrap4.order(byteOrder2);
                                    for (i14 = i20; i14 < length4; i14++) {
                                        w21 w21Var2 = w21VarArr2[i14];
                                        byteBufferWrap4.putInt((int) w21Var2.b);
                                        byteBufferWrap4.putInt((int) w21Var2.c);
                                    }
                                    map6.put(str4, new f35(byteBufferWrap4.array(), 10, length4));
                                    i = i27;
                                    strReplaceAll = str5;
                                    byteOrder = byteOrder2;
                                    i2 = i3;
                                    break;
                                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                    strArrSplit6 = strReplaceAll.split(",", -1);
                                    length5 = strArrSplit6.length;
                                    dArr = new double[length5];
                                    for (i15 = i20; i15 < strArrSplit6.length; i15++) {
                                        dArr[i15] = Double.parseDouble(strArrSplit6[i15]);
                                    }
                                    Map map7 = (Map) list.get(i21);
                                    byteBufferWrap5 = ByteBuffer.wrap(new byte[f35.f[12] * length5]);
                                    byteBufferWrap5.order(byteOrder2);
                                    i16 = i20;
                                    while (i16 < length5) {
                                        double[] dArr2 = dArr;
                                        byteBufferWrap5.putDouble(dArr2[i16]);
                                        i16++;
                                        i19 = i19;
                                        dArr = dArr2;
                                    }
                                    i3 = i19;
                                    map7.put(str4, new f35(byteBufferWrap5.array(), 12, length5));
                                    i = i17;
                                    byteOrder = byteOrder2;
                                    i2 = i3;
                                    break;
                            }
                        } else if (i23 == i19 || i23 == 7 || i23 == i18) {
                            i22 = i23;
                            switch (i22) {
                                case 1:
                                    i = i17;
                                    byteOrder = byteOrder2;
                                    Map map8 = (Map) list.get(i21);
                                    Charset charset3 = f35.d;
                                    i2 = i19;
                                    if (strReplaceAll.length() == i2) {
                                        i20 = 0;
                                        if (strReplaceAll.charAt(0) < '0') {
                                        }
                                        map8.put(str4, f35Var);
                                    } else {
                                        i20 = 0;
                                    }
                                    byte[] bytes3 = strReplaceAll.getBytes(f35.d);
                                    f35Var = new f35(bytes3, i2, bytes3.length);
                                    map8.put(str4, f35Var);
                                    break;
                                case 2:
                                case 7:
                                    i = i17;
                                    byteOrder = byteOrder2;
                                    i3 = i19;
                                    Map map9 = (Map) list.get(i21);
                                    Charset charset4 = f35.d;
                                    byte[] bytes4 = strReplaceAll.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(f35.d);
                                    i18 = 2;
                                    map9.put(str4, new f35(bytes4, 2, bytes4.length));
                                    i20 = 0;
                                    i2 = i3;
                                    break;
                                case 3:
                                    int i28 = i17;
                                    i3 = i19;
                                    byteOrder = byteOrder2;
                                    strArrSplit = strReplaceAll.split(",", -1);
                                    length = strArrSplit.length;
                                    iArr = new int[length];
                                    while (i4 < strArrSplit.length) {
                                        iArr[i4] = Integer.parseInt(strArrSplit[i4]);
                                    }
                                    Map map10 = (Map) list.get(i21);
                                    byteBufferWrap = ByteBuffer.wrap(new byte[f35.f[i28] * length]);
                                    byteBufferWrap.order(byteOrder);
                                    while (i5 < length) {
                                        byteBufferWrap.putShort((short) iArr[i5]);
                                    }
                                    i = i28;
                                    map10.put(str4, new f35(byteBufferWrap.array(), i, length));
                                    i20 = 0;
                                    i18 = 2;
                                    i2 = i3;
                                    break;
                                case 4:
                                    i3 = i19;
                                    byteOrder = byteOrder2;
                                    strArrSplit2 = strReplaceAll.split(",", -1);
                                    jArr = new long[strArrSplit2.length];
                                    while (i6 < strArrSplit2.length) {
                                        jArr[i6] = Long.parseLong(strArrSplit2[i6]);
                                    }
                                    ((Map) list.get(i21)).put(str4, f35.b(jArr, byteOrder));
                                    i = i17;
                                    i20 = 0;
                                    i18 = 2;
                                    i2 = i3;
                                    break;
                                case 5:
                                    i3 = i19;
                                    i7 = -1;
                                    strArrSplit3 = strReplaceAll.split(",", -1);
                                    length2 = strArrSplit3.length;
                                    w21VarArr = new w21[length2];
                                    i8 = i20;
                                    while (i8 < strArrSplit3.length) {
                                        String[] strArrSplit9 = strArrSplit3[i8].split("/", i7);
                                        w21VarArr[i8] = new w21((long) Double.parseDouble(strArrSplit9[i20]), (long) Double.parseDouble(strArrSplit9[i3]), 2, (byte) 0);
                                        i8++;
                                        byteOrder2 = byteOrder2;
                                        length2 = length2;
                                        i7 = -1;
                                        i20 = 0;
                                    }
                                    byteOrder = byteOrder2;
                                    i9 = length2;
                                    Map map11 = (Map) list.get(i21);
                                    byteBufferWrap2 = ByteBuffer.wrap(new byte[f35.f[5] * i9]);
                                    byteBufferWrap2.order(byteOrder);
                                    while (i10 < i9) {
                                        w21 w21Var3 = w21VarArr[i10];
                                        byteBufferWrap2.putInt((int) w21Var3.b);
                                        byteBufferWrap2.putInt((int) w21Var3.c);
                                    }
                                    map11.put(str4, new f35(byteBufferWrap2.array(), 5, i9));
                                    i = i17;
                                    i20 = 0;
                                    i18 = 2;
                                    i2 = i3;
                                    break;
                                case 9:
                                    int i29 = i17;
                                    i3 = i19;
                                    strArrSplit4 = strReplaceAll.split(",", -1);
                                    length3 = strArrSplit4.length;
                                    iArr2 = new int[length3];
                                    while (i11 < strArrSplit4.length) {
                                        iArr2[i11] = Integer.parseInt(strArrSplit4[i11]);
                                    }
                                    Map map12 = (Map) list.get(i21);
                                    byteBufferWrap3 = ByteBuffer.wrap(new byte[f35.f[9] * length3]);
                                    byteBufferWrap3.order(byteOrder2);
                                    while (i12 < length3) {
                                        byteBufferWrap3.putInt(iArr2[i12]);
                                    }
                                    map12.put(str4, new f35(byteBufferWrap3.array(), 9, length3));
                                    i = i29;
                                    byteOrder = byteOrder2;
                                    i2 = i3;
                                    break;
                                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                    i3 = i19;
                                    strArrSplit5 = strReplaceAll.split(",", -1);
                                    length4 = strArrSplit5.length;
                                    w21VarArr2 = new w21[length4];
                                    i13 = i20;
                                    while (i13 < strArrSplit5.length) {
                                        String[] strArrSplit10 = strArrSplit5[i13].split("/", i24);
                                        w21VarArr2[i13] = new w21((long) Double.parseDouble(strArrSplit10[i20]), (long) Double.parseDouble(strArrSplit10[i3]), 2, (byte) 0);
                                        i13++;
                                        i17 = i17;
                                        strReplaceAll = strReplaceAll;
                                        i24 = -1;
                                    }
                                    int i210 = i17;
                                    String str6 = strReplaceAll;
                                    Map map13 = (Map) list.get(i21);
                                    byteBufferWrap4 = ByteBuffer.wrap(new byte[f35.f[10] * length4]);
                                    byteBufferWrap4.order(byteOrder2);
                                    while (i14 < length4) {
                                        w21 w21Var4 = w21VarArr2[i14];
                                        byteBufferWrap4.putInt((int) w21Var4.b);
                                        byteBufferWrap4.putInt((int) w21Var4.c);
                                    }
                                    map13.put(str4, new f35(byteBufferWrap4.array(), 10, length4));
                                    i = i210;
                                    strReplaceAll = str6;
                                    byteOrder = byteOrder2;
                                    i2 = i3;
                                    break;
                                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                    strArrSplit6 = strReplaceAll.split(",", -1);
                                    length5 = strArrSplit6.length;
                                    dArr = new double[length5];
                                    while (i15 < strArrSplit6.length) {
                                        dArr[i15] = Double.parseDouble(strArrSplit6[i15]);
                                    }
                                    Map map14 = (Map) list.get(i21);
                                    byteBufferWrap5 = ByteBuffer.wrap(new byte[f35.f[12] * length5]);
                                    byteBufferWrap5.order(byteOrder2);
                                    i16 = i20;
                                    while (i16 < length5) {
                                        double[] dArr3 = dArr;
                                        byteBufferWrap5.putDouble(dArr3[i16]);
                                        i16++;
                                        i19 = i19;
                                        dArr = dArr3;
                                    }
                                    i3 = i19;
                                    map14.put(str4, new f35(byteBufferWrap5.array(), 12, length5));
                                    i = i17;
                                    byteOrder = byteOrder2;
                                    i2 = i3;
                                    break;
                            }
                        }
                    } else {
                        i22 = i23;
                        switch (i22) {
                            case 1:
                                i = i17;
                                byteOrder = byteOrder2;
                                Map map15 = (Map) list.get(i21);
                                Charset charset5 = f35.d;
                                i2 = i19;
                                if (strReplaceAll.length() == i2) {
                                    i20 = 0;
                                    if (strReplaceAll.charAt(0) < '0' && strReplaceAll.charAt(0) <= '1') {
                                        byte[] bArr = new byte[i2];
                                        bArr[0] = (byte) (strReplaceAll.charAt(0) - '0');
                                        f35Var = new f35(bArr, i2, i2);
                                    }
                                    map15.put(str4, f35Var);
                                } else {
                                    i20 = 0;
                                }
                                byte[] bytes5 = strReplaceAll.getBytes(f35.d);
                                f35Var = new f35(bytes5, i2, bytes5.length);
                                map15.put(str4, f35Var);
                                break;
                            case 2:
                            case 7:
                                i = i17;
                                byteOrder = byteOrder2;
                                i3 = i19;
                                Map map16 = (Map) list.get(i21);
                                Charset charset6 = f35.d;
                                byte[] bytes6 = strReplaceAll.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(f35.d);
                                i18 = 2;
                                map16.put(str4, new f35(bytes6, 2, bytes6.length));
                                i20 = 0;
                                i2 = i3;
                                break;
                            case 3:
                                int i211 = i17;
                                i3 = i19;
                                byteOrder = byteOrder2;
                                strArrSplit = strReplaceAll.split(",", -1);
                                length = strArrSplit.length;
                                iArr = new int[length];
                                while (i4 < strArrSplit.length) {
                                    iArr[i4] = Integer.parseInt(strArrSplit[i4]);
                                }
                                Map map17 = (Map) list.get(i21);
                                byteBufferWrap = ByteBuffer.wrap(new byte[f35.f[i211] * length]);
                                byteBufferWrap.order(byteOrder);
                                while (i5 < length) {
                                    byteBufferWrap.putShort((short) iArr[i5]);
                                }
                                i = i211;
                                map17.put(str4, new f35(byteBufferWrap.array(), i, length));
                                i20 = 0;
                                i18 = 2;
                                i2 = i3;
                                break;
                            case 4:
                                i3 = i19;
                                byteOrder = byteOrder2;
                                strArrSplit2 = strReplaceAll.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                while (i6 < strArrSplit2.length) {
                                    jArr[i6] = Long.parseLong(strArrSplit2[i6]);
                                }
                                ((Map) list.get(i21)).put(str4, f35.b(jArr, byteOrder));
                                i = i17;
                                i20 = 0;
                                i18 = 2;
                                i2 = i3;
                                break;
                            case 5:
                                i3 = i19;
                                i7 = -1;
                                strArrSplit3 = strReplaceAll.split(",", -1);
                                length2 = strArrSplit3.length;
                                w21VarArr = new w21[length2];
                                i8 = i20;
                                while (i8 < strArrSplit3.length) {
                                    String[] strArrSplit11 = strArrSplit3[i8].split("/", i7);
                                    w21VarArr[i8] = new w21((long) Double.parseDouble(strArrSplit11[i20]), (long) Double.parseDouble(strArrSplit11[i3]), 2, (byte) 0);
                                    i8++;
                                    byteOrder2 = byteOrder2;
                                    length2 = length2;
                                    i7 = -1;
                                    i20 = 0;
                                }
                                byteOrder = byteOrder2;
                                i9 = length2;
                                Map map18 = (Map) list.get(i21);
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[f35.f[5] * i9]);
                                byteBufferWrap2.order(byteOrder);
                                while (i10 < i9) {
                                    w21 w21Var5 = w21VarArr[i10];
                                    byteBufferWrap2.putInt((int) w21Var5.b);
                                    byteBufferWrap2.putInt((int) w21Var5.c);
                                }
                                map18.put(str4, new f35(byteBufferWrap2.array(), 5, i9));
                                i = i17;
                                i20 = 0;
                                i18 = 2;
                                i2 = i3;
                                break;
                            case 9:
                                int i212 = i17;
                                i3 = i19;
                                strArrSplit4 = strReplaceAll.split(",", -1);
                                length3 = strArrSplit4.length;
                                iArr2 = new int[length3];
                                while (i11 < strArrSplit4.length) {
                                    iArr2[i11] = Integer.parseInt(strArrSplit4[i11]);
                                }
                                Map map19 = (Map) list.get(i21);
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[f35.f[9] * length3]);
                                byteBufferWrap3.order(byteOrder2);
                                while (i12 < length3) {
                                    byteBufferWrap3.putInt(iArr2[i12]);
                                }
                                map19.put(str4, new f35(byteBufferWrap3.array(), 9, length3));
                                i = i212;
                                byteOrder = byteOrder2;
                                i2 = i3;
                                break;
                            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                i3 = i19;
                                strArrSplit5 = strReplaceAll.split(",", -1);
                                length4 = strArrSplit5.length;
                                w21VarArr2 = new w21[length4];
                                i13 = i20;
                                while (i13 < strArrSplit5.length) {
                                    String[] strArrSplit12 = strArrSplit5[i13].split("/", i24);
                                    w21VarArr2[i13] = new w21((long) Double.parseDouble(strArrSplit12[i20]), (long) Double.parseDouble(strArrSplit12[i3]), 2, (byte) 0);
                                    i13++;
                                    i17 = i17;
                                    strReplaceAll = strReplaceAll;
                                    i24 = -1;
                                }
                                int i213 = i17;
                                String str7 = strReplaceAll;
                                Map map110 = (Map) list.get(i21);
                                byteBufferWrap4 = ByteBuffer.wrap(new byte[f35.f[10] * length4]);
                                byteBufferWrap4.order(byteOrder2);
                                while (i14 < length4) {
                                    w21 w21Var6 = w21VarArr2[i14];
                                    byteBufferWrap4.putInt((int) w21Var6.b);
                                    byteBufferWrap4.putInt((int) w21Var6.c);
                                }
                                map110.put(str4, new f35(byteBufferWrap4.array(), 10, length4));
                                i = i213;
                                strReplaceAll = str7;
                                byteOrder = byteOrder2;
                                i2 = i3;
                                break;
                            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                strArrSplit6 = strReplaceAll.split(",", -1);
                                length5 = strArrSplit6.length;
                                dArr = new double[length5];
                                while (i15 < strArrSplit6.length) {
                                    dArr[i15] = Double.parseDouble(strArrSplit6[i15]);
                                }
                                Map map111 = (Map) list.get(i21);
                                byteBufferWrap5 = ByteBuffer.wrap(new byte[f35.f[12] * length5]);
                                byteBufferWrap5.order(byteOrder2);
                                i16 = i20;
                                while (i16 < length5) {
                                    double[] dArr4 = dArr;
                                    byteBufferWrap5.putDouble(dArr4[i16]);
                                    i16++;
                                    i19 = i19;
                                    dArr = dArr4;
                                }
                                i3 = i19;
                                map111.put(str4, new f35(byteBufferWrap5.array(), 12, length5));
                                i = i17;
                                byteOrder = byteOrder2;
                                i2 = i3;
                                break;
                        }
                    }
                } else {
                    ((Map) list.get(i21)).remove(str4);
                }
                i = i17;
                byteOrder = byteOrder2;
                i2 = i19;
            } else {
                i = i17;
                byteOrder = byteOrder2;
                i2 = i19;
            }
            i21++;
            i19 = i2;
            i17 = i;
            byteOrder2 = byteOrder;
        }
    }

    public final void d(int i) {
        int i2;
        if (i == 0) {
            i2 = 1;
        } else if (i == 90) {
            i2 = 6;
        } else if (i == 180) {
            i2 = 3;
        } else if (i != 270) {
            b21.W("ExifData", "Unexpected orientation value: " + i + ". Must be one of 0, 90, 180, 270.");
            i2 = 0;
        } else {
            i2 = 8;
        }
        c("Orientation", String.valueOf(i2), this.a);
    }
}
