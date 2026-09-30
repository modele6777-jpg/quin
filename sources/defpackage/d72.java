package defpackage;

import android.R;
import android.util.Pair;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d72 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {"", "A", "B", "C"};
    public static final Pattern c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = {b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)};
        String str = pqf.a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    public static Pair b(rr5 rr5Var) {
        boolean z;
        c72 c72VarD = d(rr5Var);
        if (c72VarD == null || !(z = c72VarD.c)) {
            return null;
        }
        pa7.J(z);
        Integer numValueOf = Integer.valueOf(c72VarD.a);
        pa7.J(z);
        return new Pair(numValueOf, Integer.valueOf(c72VarD.b));
    }

    public static c72 c(String str, String[] strArr, e82 e82Var) {
        int i;
        Integer numValueOf = null;
        if (strArr.length < 4) {
            ks0.v("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = c.matcher(strArr[1]);
        if (!matcher.matches()) {
            ks0.v("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        String strGroup = matcher.group(1);
        boolean zEquals = "1".equals(strGroup);
        byte b2 = 6;
        c72 c72Var = c72.d;
        if (zEquals) {
            i = 1;
        } else {
            if (!"2".equals(strGroup)) {
                ks0.v("Unknown HEVC profile string: ", strGroup, "CodecSpecificDataUtil");
                return c72Var;
            }
            i = (e82Var == null || e82Var.c != 6) ? 2 : 4096;
        }
        String str2 = strArr[3];
        str2.getClass();
        switch (str2.hashCode()) {
            case 70821:
                b2 = !str2.equals("H30") ? (byte) -1 : (byte) 0;
                break;
            case 70914:
                b2 = !str2.equals("H60") ? (byte) -1 : (byte) 1;
                break;
            case 70917:
                b2 = !str2.equals("H63") ? (byte) -1 : (byte) 2;
                break;
            case 71007:
                b2 = !str2.equals("H90") ? (byte) -1 : (byte) 3;
                break;
            case 71010:
                b2 = !str2.equals("H93") ? (byte) -1 : (byte) 4;
                break;
            case 74665:
                b2 = !str2.equals("L30") ? (byte) -1 : (byte) 5;
                break;
            case 74758:
                if (!str2.equals("L60")) {
                    b2 = -1;
                }
                break;
            case 74761:
                b2 = !str2.equals("L63") ? (byte) -1 : (byte) 7;
                break;
            case 74851:
                b2 = !str2.equals("L90") ? (byte) -1 : (byte) 8;
                break;
            case 74854:
                b2 = !str2.equals("L93") ? (byte) -1 : (byte) 9;
                break;
            case 2193639:
                b2 = !str2.equals("H120") ? (byte) -1 : (byte) 10;
                break;
            case 2193642:
                b2 = !str2.equals("H123") ? (byte) -1 : (byte) 11;
                break;
            case 2193732:
                b2 = !str2.equals("H150") ? (byte) -1 : (byte) 12;
                break;
            case 2193735:
                b2 = !str2.equals("H153") ? (byte) -1 : (byte) 13;
                break;
            case 2193738:
                b2 = !str2.equals("H156") ? (byte) -1 : (byte) 14;
                break;
            case 2193825:
                b2 = !str2.equals("H180") ? (byte) -1 : (byte) 15;
                break;
            case 2193828:
                b2 = !str2.equals("H183") ? (byte) -1 : (byte) 16;
                break;
            case 2193831:
                b2 = !str2.equals("H186") ? (byte) -1 : (byte) 17;
                break;
            case 2312803:
                b2 = !str2.equals("L120") ? (byte) -1 : (byte) 18;
                break;
            case 2312806:
                b2 = !str2.equals("L123") ? (byte) -1 : (byte) 19;
                break;
            case 2312896:
                b2 = !str2.equals("L150") ? (byte) -1 : (byte) 20;
                break;
            case 2312899:
                b2 = !str2.equals("L153") ? (byte) -1 : (byte) 21;
                break;
            case 2312902:
                b2 = !str2.equals("L156") ? (byte) -1 : (byte) 22;
                break;
            case 2312989:
                b2 = !str2.equals("L180") ? (byte) -1 : (byte) 23;
                break;
            case 2312992:
                b2 = !str2.equals("L183") ? (byte) -1 : (byte) 24;
                break;
            case 2312995:
                b2 = !str2.equals("L186") ? (byte) -1 : (byte) 25;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                numValueOf = 2;
                break;
            case 1:
                numValueOf = 8;
                break;
            case 2:
                numValueOf = 32;
                break;
            case 3:
                numValueOf = Integer.valueOf(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                break;
            case 4:
                numValueOf = 512;
                break;
            case 5:
                numValueOf = 1;
                break;
            case 6:
                numValueOf = 4;
                break;
            case 7:
                numValueOf = 16;
                break;
            case 8:
                numValueOf = 64;
                break;
            case 9:
                numValueOf = 256;
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                numValueOf = 2048;
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                numValueOf = Integer.valueOf(UserMetadata.MAX_INTERNAL_KEY_SIZE);
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                numValueOf = 32768;
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                numValueOf = 131072;
                break;
            case 14:
                numValueOf = 524288;
                break;
            case 15:
                numValueOf = 2097152;
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                numValueOf = 8388608;
                break;
            case 17:
                numValueOf = 33554432;
                break;
            case 18:
                numValueOf = Integer.valueOf(UserMetadata.MAX_ATTRIBUTE_SIZE);
                break;
            case 19:
                numValueOf = 4096;
                break;
            case 20:
                numValueOf = 16384;
                break;
            case 21:
                numValueOf = 65536;
                break;
            case 22:
                numValueOf = 262144;
                break;
            case 23:
                numValueOf = 1048576;
                break;
            case 24:
                numValueOf = 4194304;
                break;
            case 25:
                numValueOf = 16777216;
                break;
        }
        if (numValueOf != null) {
            return new c72(i, numValueOf.intValue(), true);
        }
        xo1.V("CodecSpecificDataUtil", "Unknown HEVC level string: ".concat(str2));
        return c72Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:154:0x0243  */
    /* JADX WARN: Code duplicated, block: B:17:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:230:0x032e  */
    /* JADX WARN: Code duplicated, block: B:411:0x0585  */
    /* JADX WARN: Code duplicated, block: B:413:0x058b  */
    /* JADX WARN: Code duplicated, block: B:509:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:80:0x0159  */
    /* JADX WARN: Code duplicated, block: B:880:0x0b59  */
    public static c72 d(rr5 rr5Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        byte b2;
        Integer num;
        Integer numValueOf = Integer.valueOf(UserMetadata.MAX_ATTRIBUTE_SIZE);
        Integer numValueOf2 = Integer.valueOf(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        String str = rr5Var.l;
        String str2 = rr5Var.l;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        boolean zEquals = "video/dolby-vision".equals(rr5Var.p);
        c72 c72Var = c72.d;
        if (zEquals) {
            if (strArrSplit.length < 3) {
                ks0.v("Ignoring malformed Dolby Vision codec string: ", str2, "CodecSpecificDataUtil");
                return null;
            }
            Matcher matcher = c.matcher(strArrSplit[1]);
            if (!matcher.matches()) {
                ks0.v("Ignoring malformed Dolby Vision codec string: ", str2, "CodecSpecificDataUtil");
                return null;
            }
            String strGroup = matcher.group(1);
            strGroup.getClass();
            switch (strGroup) {
                case "00":
                    num = 1;
                    break;
                case "01":
                    num = 2;
                    break;
                case "02":
                    num = 4;
                    break;
                case "03":
                    num = 8;
                    break;
                case "04":
                    num = 16;
                    break;
                case "05":
                    num = 32;
                    break;
                case "06":
                    num = 64;
                    break;
                case "07":
                    num = numValueOf2;
                    break;
                case "08":
                    num = 256;
                    break;
                case "09":
                    num = 512;
                    break;
                case "10":
                    num = numValueOf;
                    break;
                default:
                    num = null;
                    break;
            }
            if (num == null) {
                xo1.V("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: ".concat(strGroup));
                return c72Var;
            }
            String str3 = strArrSplit[2];
            str3.getClass();
            switch (str3) {
                case "01":
                    numValueOf = 1;
                    break;
                case "02":
                    numValueOf = 2;
                    break;
                case "03":
                    numValueOf = 4;
                    break;
                case "04":
                    numValueOf = 8;
                    break;
                case "05":
                    numValueOf = 16;
                    break;
                case "06":
                    numValueOf = 32;
                    break;
                case "07":
                    numValueOf = 64;
                    break;
                case "08":
                    numValueOf = numValueOf2;
                    break;
                case "09":
                    numValueOf = 256;
                    break;
                case "10":
                    numValueOf = 512;
                    break;
                case "11":
                    break;
                case "12":
                    numValueOf = 2048;
                    break;
                case "13":
                    numValueOf = 4096;
                    break;
                default:
                    numValueOf = null;
                    break;
            }
            if (numValueOf != null) {
                return new c72(num.intValue(), numValueOf.intValue(), true);
            }
            xo1.V("CodecSpecificDataUtil", "Unknown Dolby Vision level string: ".concat(str3));
            return null;
        }
        String str4 = strArrSplit[0];
        str4.getClass();
        switch (str4) {
            case "ac-4":
                int i19 = 8;
                if (strArrSplit.length != 4) {
                    ks0.v("Ignoring malformed AC-4 codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i20 = Integer.parseInt(strArrSplit[1]);
                    int i21 = Integer.parseInt(strArrSplit[2]);
                    int i22 = Integer.parseInt(strArrSplit[3]);
                    if (i20 != 0) {
                        if (i20 != 1) {
                            if (i20 != 2) {
                                i = -1;
                            } else if (i21 == 1) {
                                i = 1026;
                            } else if (i21 == 2) {
                                i = 1028;
                            } else {
                                i = -1;
                            }
                        } else if (i21 == 0) {
                            i = 513;
                        } else if (i21 == 1) {
                            i = 514;
                        } else {
                            i = -1;
                        }
                    } else if (i21 == 0) {
                        i = 257;
                    } else {
                        i = -1;
                    }
                    if (i == -1) {
                        xo1.V("CodecSpecificDataUtil", "Unknown AC-4 profile: " + i20 + "." + i21);
                        return c72Var;
                    }
                    if (i22 == 0) {
                        i19 = 1;
                    } else if (i22 == 1) {
                        i19 = 2;
                    } else if (i22 == 2) {
                        i19 = 4;
                    } else if (i22 != 3) {
                        i19 = i22 != 4 ? -1 : 16;
                    }
                    if (i19 != -1) {
                        return new c72(i, i19, true);
                    }
                    kv2.w(i22, "Unknown AC-4 level: ", "CodecSpecificDataUtil");
                    return c72Var;
                } catch (NumberFormatException unused) {
                    ks0.v("Ignoring malformed AC-4 codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
            case "apv1":
                if (strArrSplit.length < 4) {
                    ks0.v("Ignoring malformed APV codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i23 = Integer.parseInt(strArrSplit[1].substring(4));
                    int i24 = Integer.parseInt(strArrSplit[2].substring(4));
                    int i25 = Integer.parseInt(strArrSplit[3].substring(4));
                    if (i23 == 33) {
                        i2 = 1;
                    } else {
                        if (i23 != 44) {
                            kv2.w(i23, "Unrecognized APV profile: ", "CodecSpecificDataUtil");
                            return c72Var;
                        }
                        i2 = 8192;
                    }
                    switch (i24) {
                        case 30:
                            if (i25 == 0) {
                                i3 = 257;
                            } else if (i25 == 1) {
                                i3 = 258;
                            } else if (i25 == 2) {
                                i3 = 260;
                            } else if (i25 == 3) {
                                i3 = 264;
                            } else {
                                kv2.w(i25, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                i3 = -1;
                            }
                            break;
                        case 33:
                            if (i25 == 0) {
                                i3 = 513;
                            } else if (i25 == 1) {
                                i3 = 514;
                            } else if (i25 == 2) {
                                i3 = 516;
                            } else if (i25 == 3) {
                                i3 = 520;
                            } else {
                                kv2.w(i25, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                i3 = -1;
                            }
                            break;
                        case 60:
                            if (i25 == 0) {
                                i3 = 1025;
                            } else if (i25 == 1) {
                                i3 = 1026;
                            } else if (i25 == 2) {
                                i3 = 1028;
                            } else if (i25 == 3) {
                                i3 = 1032;
                            } else {
                                kv2.w(i25, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                i3 = -1;
                            }
                            break;
                        case 63:
                            if (i25 == 0) {
                                i3 = 2049;
                            } else if (i25 == 1) {
                                i3 = 2050;
                            } else if (i25 == 2) {
                                i3 = 2052;
                            } else if (i25 == 3) {
                                i3 = 2056;
                            } else {
                                kv2.w(i25, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                i3 = -1;
                            }
                            break;
                        case 90:
                            if (i25 == 0) {
                                i3 = 4097;
                            } else if (i25 == 1) {
                                i3 = 4098;
                            } else if (i25 == 2) {
                                i3 = 4100;
                            } else if (i25 == 3) {
                                i3 = 4104;
                            } else {
                                kv2.w(i25, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                i3 = -1;
                            }
                            break;
                        case 93:
                            if (i25 == 0) {
                                i3 = 8193;
                            } else if (i25 == 1) {
                                i3 = 8194;
                            } else if (i25 == 2) {
                                i3 = 8196;
                            } else if (i25 == 3) {
                                i3 = 8200;
                            } else {
                                kv2.w(i25, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                i3 = -1;
                            }
                            break;
                        case 120:
                            if (i25 == 0) {
                                i3 = 16385;
                            } else if (i25 == 1) {
                                i3 = 16386;
                            } else if (i25 == 2) {
                                i3 = 16388;
                            } else if (i25 == 3) {
                                i3 = 16392;
                            } else {
                                kv2.w(i25, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                i3 = -1;
                            }
                            break;
                        case 123:
                            if (i25 == 0) {
                                i3 = 32769;
                            } else if (i25 == 1) {
                                i3 = 32770;
                            } else if (i25 == 2) {
                                i3 = 32772;
                            } else if (i25 == 3) {
                                i3 = 32776;
                            } else {
                                kv2.w(i25, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                i3 = -1;
                            }
                            break;
                        case 150:
                            if (i25 == 0) {
                                i3 = 65537;
                            } else if (i25 == 1) {
                                i3 = 65538;
                            } else if (i25 == 2) {
                                i3 = 65540;
                            } else if (i25 == 3) {
                                i3 = 65544;
                            } else {
                                kv2.w(i25, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                i3 = -1;
                            }
                            break;
                        case 153:
                            if (i25 == 0) {
                                i3 = 131073;
                            } else if (i25 == 1) {
                                i3 = 131074;
                            } else if (i25 == 2) {
                                i3 = 131076;
                            } else if (i25 == 3) {
                                i3 = 131080;
                            } else {
                                kv2.w(i25, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                i3 = -1;
                            }
                            break;
                        case 180:
                            if (i25 == 0) {
                                i3 = 262145;
                            } else if (i25 == 1) {
                                i3 = 262146;
                            } else if (i25 == 2) {
                                i3 = 262148;
                            } else if (i25 == 3) {
                                i3 = 262152;
                            } else {
                                kv2.w(i25, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                i3 = -1;
                            }
                            break;
                        case 183:
                            if (i25 == 0) {
                                i3 = 524289;
                            } else if (i25 == 1) {
                                i3 = 524290;
                            } else if (i25 == 2) {
                                i3 = 524292;
                            } else if (i25 == 3) {
                                i3 = 524296;
                            } else {
                                kv2.w(i25, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                i3 = -1;
                            }
                            break;
                        case 210:
                            if (i25 == 0) {
                                i3 = 1048577;
                            } else if (i25 == 1) {
                                i3 = 1048578;
                            } else if (i25 == 2) {
                                i3 = 1048580;
                            } else if (i25 == 3) {
                                i3 = 1048584;
                            } else {
                                kv2.w(i25, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                i3 = -1;
                            }
                            break;
                        case 213:
                            if (i25 == 0) {
                                i3 = 2097153;
                            } else if (i25 == 1) {
                                i3 = 2097154;
                            } else if (i25 == 2) {
                                i3 = 2097156;
                            } else if (i25 == 3) {
                                i3 = 2097160;
                            } else {
                                kv2.w(i25, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                i3 = -1;
                            }
                            break;
                        default:
                            kv2.w(i24, "Unrecognized APV level index: ", "CodecSpecificDataUtil");
                            i3 = -1;
                            break;
                    }
                    return i3 == -1 ? c72Var : new c72(i2, i3, true);
                } catch (NumberFormatException e) {
                    xo1.W("CodecSpecificDataUtil", "Ignoring malformed APV codec string: " + str2, e);
                    return null;
                }
            case "av01":
                e82 e82Var = rr5Var.H;
                if (strArrSplit.length < 4) {
                    ks0.v("Ignoring malformed AV1 codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i26 = Integer.parseInt(strArrSplit[1]);
                    int i27 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                    int i28 = Integer.parseInt(strArrSplit[3]);
                    if (i26 != 0) {
                        kv2.w(i26, "Unknown AV1 profile: ", "CodecSpecificDataUtil");
                        return c72Var;
                    }
                    int i29 = 8;
                    if (i28 != 8 && i28 != 10) {
                        kv2.w(i28, "Unknown AV1 bit depth: ", "CodecSpecificDataUtil");
                        return c72Var;
                    }
                    int i30 = i28 == 8 ? 1 : (e82Var == null || !(e82Var.d != null || (i4 = e82Var.c) == 7 || i4 == 6)) ? 2 : 4096;
                    switch (i27) {
                        case 0:
                            i29 = 1;
                            break;
                        case 1:
                            i29 = 2;
                            break;
                        case 2:
                            i29 = 4;
                            break;
                        case 3:
                            break;
                        case 4:
                            i29 = 16;
                            break;
                        case 5:
                            i29 = 32;
                            break;
                        case 6:
                            i29 = 64;
                            break;
                        case 7:
                            i29 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                            break;
                        case 8:
                            i29 = 256;
                            break;
                        case 9:
                            i29 = 512;
                            break;
                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                            i29 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                            break;
                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                            i29 = 2048;
                            break;
                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                            i29 = 4096;
                            break;
                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                            i29 = 8192;
                            break;
                        case 14:
                            i29 = 16384;
                            break;
                        case 15:
                            i29 = 32768;
                            break;
                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                            i29 = 65536;
                            break;
                        case 17:
                            i29 = 131072;
                            break;
                        case 18:
                            i29 = 262144;
                            break;
                        case 19:
                            i29 = 524288;
                            break;
                        case 20:
                            i29 = 1048576;
                            break;
                        case 21:
                            i29 = 2097152;
                            break;
                        case 22:
                            i29 = 4194304;
                            break;
                        case 23:
                            i29 = 8388608;
                            break;
                        default:
                            i29 = -1;
                            break;
                    }
                    if (i29 != -1) {
                        return new c72(i30, i29, true);
                    }
                    kv2.w(i27, "Unknown AV1 level: ", "CodecSpecificDataUtil");
                    return c72Var;
                } catch (NumberFormatException unused2) {
                    ks0.v("Ignoring malformed AV1 codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
            case "avc1":
            case "avc2":
                if (strArrSplit.length < 2) {
                    ks0.v("Ignoring malformed AVC codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    if (strArrSplit[1].length() == 6) {
                        i5 = 16;
                        i6 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                        i7 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                    } else {
                        i5 = 16;
                        if (strArrSplit.length < 3) {
                            xo1.V("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str2);
                            return null;
                        }
                        i6 = Integer.parseInt(strArrSplit[1]);
                        i7 = Integer.parseInt(strArrSplit[2]);
                    }
                    if (i6 == 66) {
                        i8 = 1;
                    } else if (i6 == 77) {
                        i8 = 2;
                    } else if (i6 == 88) {
                        i8 = 4;
                    } else if (i6 == 100) {
                        i8 = 8;
                    } else if (i6 == 110) {
                        i8 = i5;
                    } else if (i6 != 122) {
                        i8 = i6 != 244 ? -1 : 64;
                    } else {
                        i8 = 32;
                    }
                    if (i8 == -1) {
                        kv2.w(i6, "Unknown AVC profile: ", "CodecSpecificDataUtil");
                        return c72Var;
                    }
                    switch (i7) {
                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                            i5 = 1;
                            i9 = -1;
                            break;
                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                            i9 = -1;
                            i5 = 4;
                            break;
                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                            i9 = -1;
                            i5 = 8;
                            break;
                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                            i9 = -1;
                            break;
                        default:
                            switch (i7) {
                                case 20:
                                    i9 = -1;
                                    i5 = 32;
                                    break;
                                case 21:
                                    i9 = -1;
                                    i5 = 64;
                                    break;
                                case 22:
                                    i9 = -1;
                                    i5 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                                    break;
                                default:
                                    switch (i7) {
                                        case 30:
                                            i9 = -1;
                                            i5 = 256;
                                            break;
                                        case 31:
                                            i9 = -1;
                                            i5 = 512;
                                            break;
                                        case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                                            i9 = -1;
                                            i5 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                                            break;
                                        default:
                                            switch (i7) {
                                                case 40:
                                                    i9 = -1;
                                                    i5 = 2048;
                                                    break;
                                                case 41:
                                                    i9 = -1;
                                                    i5 = 4096;
                                                    break;
                                                case 42:
                                                    i5 = 8192;
                                                    i9 = -1;
                                                    break;
                                                default:
                                                    switch (i7) {
                                                        case 50:
                                                            i5 = 16384;
                                                            i9 = -1;
                                                            break;
                                                        case 51:
                                                            i5 = 32768;
                                                            i9 = -1;
                                                            break;
                                                        case 52:
                                                            i5 = 65536;
                                                            i9 = -1;
                                                            break;
                                                        default:
                                                            i9 = -1;
                                                            i5 = -1;
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    if (i5 != i9) {
                        return new c72(i8, i5, true);
                    }
                    kv2.w(i7, "Unknown AVC level: ", "CodecSpecificDataUtil");
                    return c72Var;
                } catch (NumberFormatException unused3) {
                    ks0.v("Ignoring malformed AVC codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
            case "hev1":
            case "hvc1":
                return c(str2, strArrSplit, rr5Var.H);
            case "iamf":
                if (strArrSplit.length < 4) {
                    ks0.v("Ignoring malformed IAMF codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i31 = Integer.parseInt(strArrSplit[1]);
                    String str5 = strArrSplit[3];
                    str5.getClass();
                    switch (str5) {
                        case "Opus":
                            if (i31 != 0) {
                                if (i31 == 1) {
                                    i10 = R.id.checkbox;
                                } else if (i31 == 2) {
                                    i10 = R.string.copy;
                                } else {
                                    kv2.w(i31, "Unrecognized IAMF Opus profile: ", "CodecSpecificDataUtil");
                                    i10 = -1;
                                }
                                break;
                            } else {
                                i10 = R.attr.label;
                                break;
                            }
                            break;
                        case "fLaC":
                            if (i31 != 0) {
                                if (i31 == 1) {
                                    i10 = R.id.empty;
                                } else if (i31 == 2) {
                                    i10 = R.string.defaultVoiceMailAlphaTag;
                                } else {
                                    kv2.w(i31, "Unrecognized IAMF FLAC profile: ", "CodecSpecificDataUtil");
                                    i10 = -1;
                                }
                                break;
                            } else {
                                i10 = R.attr.manageSpaceActivity;
                                break;
                            }
                            break;
                        case "ipcm":
                            if (i31 != 0) {
                                if (i31 == 1) {
                                    i10 = R.id.icon2;
                                } else if (i31 == 2) {
                                    i10 = R.string.httpErrorUnsupportedScheme;
                                } else {
                                    kv2.w(i31, "Unrecognized IAMF PCM profile: ", "CodecSpecificDataUtil");
                                    i10 = -1;
                                }
                                break;
                            } else {
                                i10 = R.attr.writePermission;
                                break;
                            }
                            break;
                        case "mp4a":
                            if (i31 != 0) {
                                if (i31 == 1) {
                                    i10 = R.id.content;
                                } else if (i31 == 2) {
                                    i10 = R.string.copyUrl;
                                } else {
                                    kv2.w(i31, "Unrecognized IAMF AAC profile: ", "CodecSpecificDataUtil");
                                    i10 = -1;
                                }
                                break;
                            } else {
                                i10 = R.attr.icon;
                                break;
                            }
                            break;
                        default:
                            xo1.V("CodecSpecificDataUtil", "Unrecognized codec identifier for IAMF auxiliary profile: ".concat(str5));
                            i10 = -1;
                            break;
                    }
                    return i10 == -1 ? c72Var : new c72(i10, 0, true);
                } catch (NumberFormatException e2) {
                    xo1.W("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: " + strArrSplit[1], e2);
                    return null;
                }
            case "mp4a":
                if (strArrSplit.length != 3) {
                    ks0.v("Ignoring malformed MP4A codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    if ("audio/mp4a-latm".equals(qv8.d(Integer.parseInt(strArrSplit[1], 16)))) {
                        int i32 = Integer.parseInt(strArrSplit[2]);
                        int i33 = 17;
                        if (i32 == 17) {
                            i11 = -1;
                        } else {
                            if (i32 != 20) {
                                i33 = 23;
                                if (i32 != 23) {
                                    i33 = 29;
                                    if (i32 != 29) {
                                        i33 = 39;
                                        if (i32 != 39) {
                                            i33 = 42;
                                            if (i32 != 42) {
                                                switch (i32) {
                                                    case 1:
                                                        i33 = 1;
                                                        break;
                                                    case 2:
                                                        i11 = -1;
                                                        i33 = 2;
                                                        break;
                                                    case 3:
                                                        i33 = 3;
                                                        break;
                                                    case 4:
                                                        i11 = -1;
                                                        i33 = 4;
                                                        break;
                                                    case 5:
                                                        i33 = 5;
                                                        break;
                                                    case 6:
                                                        i11 = -1;
                                                        i33 = 6;
                                                        break;
                                                    default:
                                                        i11 = -1;
                                                        i33 = -1;
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                i33 = 20;
                            }
                            i11 = -1;
                        }
                        if (i33 != i11) {
                            return new c72(i33, 0, true);
                        }
                        xo1.V("CodecSpecificDataUtil", "Unrecognized MP4A profile: " + i33);
                        return c72Var;
                    }
                } catch (NumberFormatException unused4) {
                    ks0.v("Ignoring malformed MP4A codec string: ", str2, "CodecSpecificDataUtil");
                }
                return null;
            case "s263":
                if (strArrSplit.length < 3) {
                    ks0.v("Ignoring malformed H263 codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i34 = Integer.parseInt(strArrSplit[1]);
                    int i35 = Integer.parseInt(strArrSplit[2]);
                    switch (i34) {
                        case 0:
                            i12 = 1;
                            break;
                        case 1:
                            i12 = 2;
                            break;
                        case 2:
                            i12 = 4;
                            break;
                        case 3:
                            i12 = 8;
                            break;
                        case 4:
                            i12 = 16;
                            break;
                        case 5:
                            i12 = 32;
                            break;
                        case 6:
                            i12 = 64;
                            break;
                        case 7:
                            i12 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                            break;
                        case 8:
                            i12 = 256;
                            break;
                        default:
                            i12 = -1;
                            break;
                    }
                    if (i12 == -1) {
                        kv2.w(i34, "Unknown H263 profile: ", "CodecSpecificDataUtil");
                        return c72Var;
                    }
                    if (i35 == 10) {
                        i13 = 1;
                        i14 = -1;
                    } else if (i35 == 20) {
                        i14 = -1;
                        i13 = 2;
                    } else if (i35 == 30) {
                        i14 = -1;
                        i13 = 4;
                    } else if (i35 == 40) {
                        i14 = -1;
                        i13 = 8;
                    } else if (i35 == 45) {
                        i14 = -1;
                        i13 = 16;
                    } else if (i35 == 50) {
                        i14 = -1;
                        i13 = 32;
                    } else if (i35 == 60) {
                        i14 = -1;
                        i13 = 64;
                    } else if (i35 != 70) {
                        i14 = -1;
                        i13 = -1;
                    } else {
                        i14 = -1;
                        i13 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    if (i13 != i14) {
                        return new c72(i12, i13, true);
                    }
                    kv2.w(i35, "Unknown H263 level: ", "CodecSpecificDataUtil");
                    return c72Var;
                } catch (NumberFormatException unused5) {
                    ks0.v("Ignoring malformed H263 codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
            case "vp09":
                if (strArrSplit.length < 3) {
                    ks0.v("Ignoring malformed VP9 codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i36 = Integer.parseInt(strArrSplit[1]);
                    int i37 = Integer.parseInt(strArrSplit[2]);
                    if (i36 == 0) {
                        i15 = 1;
                    } else if (i36 == 1) {
                        i15 = 2;
                    } else if (i36 != 2) {
                        i15 = i36 != 3 ? -1 : 8;
                    } else {
                        i15 = 4;
                    }
                    if (i15 == -1) {
                        kv2.w(i36, "Unknown VP9 profile: ", "CodecSpecificDataUtil");
                        return c72Var;
                    }
                    if (i37 != 10) {
                        if (i37 == 11) {
                            i17 = -1;
                            i16 = 2;
                        } else if (i37 == 20) {
                            i17 = -1;
                            i16 = 4;
                        } else if (i37 == 21) {
                            i17 = -1;
                            i16 = 8;
                        } else if (i37 == 30) {
                            i17 = -1;
                            i16 = 16;
                        } else if (i37 == 31) {
                            i17 = -1;
                            i16 = 32;
                        } else if (i37 == 40) {
                            i17 = -1;
                            i16 = 64;
                        } else if (i37 == 41) {
                            i17 = -1;
                            i16 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                        } else if (i37 == 50) {
                            i17 = -1;
                            i16 = 256;
                        } else if (i37 != 51) {
                            switch (i37) {
                                case 60:
                                    i17 = -1;
                                    i16 = 2048;
                                    break;
                                case 61:
                                    i17 = -1;
                                    i16 = 4096;
                                    break;
                                case 62:
                                    i16 = 8192;
                                    break;
                                default:
                                    i17 = -1;
                                    i16 = -1;
                                    break;
                            }
                        } else {
                            i17 = -1;
                            i16 = 512;
                        }
                        if (i16 == i17) {
                            return new c72(i15, i16, true);
                        }
                        kv2.w(i37, "Unknown VP9 level: ", "CodecSpecificDataUtil");
                        return c72Var;
                    }
                    i16 = 1;
                    i17 = -1;
                    if (i16 == i17) {
                        return new c72(i15, i16, true);
                    }
                    kv2.w(i37, "Unknown VP9 level: ", "CodecSpecificDataUtil");
                    return c72Var;
                } catch (NumberFormatException unused6) {
                    ks0.v("Ignoring malformed VP9 codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
            case "vvc1":
            case "vvi1":
                e82 e82Var2 = rr5Var.H;
                if (strArrSplit.length < 3) {
                    ks0.v("Ignoring malformed VVC codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i38 = Integer.parseInt(strArrSplit[1]);
                    if (i38 == 1) {
                        i18 = (e82Var2 == null || e82Var2.c != 6) ? (e82Var2 == null || e82Var2.e != 8) ? 2 : 1 : 4096;
                    } else {
                        if (i38 != 65) {
                            xo1.V("CodecSpecificDataUtil", "Unknown VVC profile IDC: " + strArrSplit[1]);
                            return c72Var;
                        }
                        i18 = 4;
                    }
                    String str6 = strArrSplit[2];
                    str6.getClass();
                    switch (str6.hashCode()) {
                        case 70918:
                            if (!str6.equals("H64")) {
                                b2 = -1;
                            } else {
                                b2 = 0;
                            }
                            break;
                        case 70921:
                            if (!str6.equals("H67")) {
                                b2 = -1;
                            } else {
                                b2 = 1;
                            }
                            break;
                        case 70976:
                            if (!str6.equals("H80")) {
                                b2 = -1;
                            } else {
                                b2 = 2;
                            }
                            break;
                        case 70979:
                            if (!str6.equals("H83")) {
                                b2 = -1;
                            }
                            break;
                        case 70982:
                            if (!str6.equals("H86")) {
                                b2 = -1;
                            } else {
                                b2 = 4;
                            }
                            break;
                        case 71013:
                            if (!str6.equals("H96")) {
                                b2 = -1;
                            } else {
                                b2 = 5;
                            }
                            break;
                        case 74609:
                            if (!str6.equals("L16")) {
                                b2 = -1;
                            } else {
                                b2 = 6;
                            }
                            break;
                        case 74667:
                            if (!str6.equals("L32")) {
                                b2 = -1;
                            } else {
                                b2 = 7;
                            }
                            break;
                        case 74670:
                            if (!str6.equals("L35")) {
                                b2 = -1;
                            } else {
                                b2 = 8;
                            }
                            break;
                        case 74704:
                            if (!str6.equals("L48")) {
                                b2 = -1;
                            } else {
                                b2 = 9;
                            }
                            break;
                        case 74728:
                            if (!str6.equals("L51")) {
                                b2 = -1;
                            } else {
                                b2 = 10;
                            }
                            break;
                        case 74762:
                            if (!str6.equals("L64")) {
                                b2 = -1;
                            } else {
                                b2 = 11;
                            }
                            break;
                        case 74765:
                            if (!str6.equals("L67")) {
                                b2 = -1;
                            } else {
                                b2 = 12;
                            }
                            break;
                        case 74820:
                            if (!str6.equals("L80")) {
                                b2 = -1;
                            }
                            break;
                        case 74823:
                            if (!str6.equals("L83")) {
                                b2 = -1;
                            }
                            break;
                        case 74826:
                            if (!str6.equals("L86")) {
                                b2 = -1;
                            }
                            break;
                        case 74857:
                            if (!str6.equals("L96")) {
                                b2 = -1;
                            } else {
                                b2 = 16;
                            }
                            break;
                        case 2193610:
                            if (!str6.equals("H112")) {
                                b2 = -1;
                            }
                            break;
                        case 2193647:
                            if (!str6.equals("H128")) {
                                b2 = -1;
                            }
                            break;
                        case 2193705:
                            if (!str6.equals("H144")) {
                                b2 = -1;
                            }
                            break;
                        case 2312774:
                            if (!str6.equals("L112")) {
                                b2 = -1;
                            } else {
                                b2 = 20;
                            }
                            break;
                        case 2312811:
                            if (!str6.equals("L128")) {
                                b2 = -1;
                            }
                            break;
                        case 2312869:
                            if (!str6.equals("L144")) {
                                b2 = -1;
                            }
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        case 0:
                            numValueOf = 64;
                            break;
                        case 1:
                            numValueOf = 256;
                            break;
                        case 2:
                            break;
                        case 3:
                            numValueOf = 4096;
                            break;
                        case 4:
                            numValueOf = 16384;
                            break;
                        case 5:
                            numValueOf = 65536;
                            break;
                        case 6:
                            numValueOf = 1;
                            break;
                        case 7:
                            numValueOf = 2;
                            break;
                        case 8:
                            numValueOf = 4;
                            break;
                        case 9:
                            numValueOf = 8;
                            break;
                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                            numValueOf = 16;
                            break;
                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                            numValueOf = 32;
                            break;
                        case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                            numValueOf = numValueOf2;
                            break;
                        case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                            numValueOf = 512;
                            break;
                        case 14:
                            numValueOf = 2048;
                            break;
                        case 15:
                            numValueOf = Integer.valueOf(UserMetadata.MAX_INTERNAL_KEY_SIZE);
                            break;
                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                            numValueOf = 32768;
                            break;
                        case 17:
                            numValueOf = 262144;
                            break;
                        case 18:
                            numValueOf = 1048576;
                            break;
                        case 19:
                            numValueOf = 4194304;
                            break;
                        case 20:
                            numValueOf = 131072;
                            break;
                        case 21:
                            numValueOf = 524288;
                            break;
                        case 22:
                            numValueOf = 2097152;
                            break;
                        default:
                            numValueOf = null;
                            break;
                    }
                    if (numValueOf != null) {
                        return new c72(i18, numValueOf.intValue(), true);
                    }
                    xo1.V("CodecSpecificDataUtil", "Unknown VVC level string: ".concat(str6));
                    return c72Var;
                } catch (NumberFormatException unused7) {
                    ks0.v("Ignoring malformed VVC codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
            default:
                return null;
        }
    }
}
