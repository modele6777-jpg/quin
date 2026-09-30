package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gng {
    public final psd a;

    public gng(log logVar, log logVar2, Object obj) {
        this.a = new psd(logVar, logVar2, obj);
    }

    public static void a(gmg gmgVar, psd psdVar, Object obj, Object obj2) {
        jmg.b(gmgVar, (log) psdVar.b, 1, obj);
        jmg.b(gmgVar, (log) psdVar.d, 2, obj2);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x011b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0123  */
    /* JADX WARN: Code duplicated, block: B:46:0x0127  */
    /* JADX WARN: Code duplicated, block: B:47:0x0137  */
    /* JADX WARN: Code duplicated, block: B:48:0x0148  */
    /* JADX WARN: Code duplicated, block: B:49:0x014f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0157  */
    /* JADX WARN: Code duplicated, block: B:53:0x015b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0168  */
    /* JADX WARN: Code duplicated, block: B:55:0x0175  */
    /* JADX WARN: Code duplicated, block: B:56:0x0181  */
    /* JADX WARN: Code duplicated, block: B:58:0x0185  */
    /* JADX WARN: Code duplicated, block: B:60:0x0193  */
    /* JADX WARN: Code duplicated, block: B:61:0x019b  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:70:0x01df  */
    /* JADX WARN: Code duplicated, block: B:71:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:73:0x0201  */
    /* JADX WARN: Code duplicated, block: B:74:0x0208  */
    public static int b(psd psdVar, Object obj, Object obj2) {
        int iB;
        int iB2;
        int iA;
        int i;
        int iA2;
        int iB3;
        int iA3;
        log logVar = (log) psdVar.b;
        log logVar2 = (log) psdVar.d;
        int i2 = jmg.c;
        int iB4 = 8;
        int iA4 = gmg.a(8);
        log logVar3 = log.b;
        if (logVar == logVar3) {
            iA4 += iA4;
        }
        mog mogVar = mog.a;
        switch (logVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iB = 8;
                i = iB + iA4;
                iA2 = gmg.a(16);
                if (logVar2 == logVar3) {
                    iA2 += iA2;
                }
                switch (logVar2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = gmg.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = kog.b((String) obj2);
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((omg) ((qlg) obj2)).k();
                        return iB4 + iA2 + i;
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        iB3 = ((omg) ((qlg) obj2)).k();
                        iA3 = gmg.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        iB4 = gmg.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof qmg) {
                            iB4 = gmg.b(((qmg) obj2).b());
                        } else {
                            iB4 = gmg.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        int iIntValue = ((Integer) obj2).intValue();
                        iB4 = gmg.a((iIntValue >> 31) ^ (iIntValue + iIntValue));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue = ((Long) obj2).longValue();
                        iB4 = gmg.b((jLongValue >> 63) ^ (jLongValue + jLongValue));
                        return iB4 + iA2 + i;
                    default:
                        ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 1:
                ((Float) obj).getClass();
                iB = 4;
                i = iB + iA4;
                iA2 = gmg.a(16);
                if (logVar2 == logVar3) {
                    iA2 += iA2;
                }
                switch (logVar2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = gmg.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = kog.b((String) obj2);
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((omg) ((qlg) obj2)).k();
                        return iB4 + iA2 + i;
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        iB3 = ((omg) ((qlg) obj2)).k();
                        iA3 = gmg.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        iB4 = gmg.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof qmg) {
                            iB4 = gmg.b(((qmg) obj2).b());
                        } else {
                            iB4 = gmg.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        int iIntValue2 = ((Integer) obj2).intValue();
                        iB4 = gmg.a((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue2 = ((Long) obj2).longValue();
                        iB4 = gmg.b((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
                        return iB4 + iA2 + i;
                    default:
                        ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 2:
                iB = gmg.b(((Long) obj).longValue());
                i = iB + iA4;
                iA2 = gmg.a(16);
                if (logVar2 == logVar3) {
                    iA2 += iA2;
                }
                switch (logVar2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = gmg.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = kog.b((String) obj2);
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((omg) ((qlg) obj2)).k();
                        return iB4 + iA2 + i;
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        iB3 = ((omg) ((qlg) obj2)).k();
                        iA3 = gmg.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        iB4 = gmg.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof qmg) {
                            iB4 = gmg.b(((qmg) obj2).b());
                        } else {
                            iB4 = gmg.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        int iIntValue3 = ((Integer) obj2).intValue();
                        iB4 = gmg.a((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue3 = ((Long) obj2).longValue();
                        iB4 = gmg.b((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                        return iB4 + iA2 + i;
                    default:
                        ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 3:
                iB = gmg.b(((Long) obj).longValue());
                i = iB + iA4;
                iA2 = gmg.a(16);
                if (logVar2 == logVar3) {
                    iA2 += iA2;
                }
                switch (logVar2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = gmg.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = kog.b((String) obj2);
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((omg) ((qlg) obj2)).k();
                        return iB4 + iA2 + i;
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        iB3 = ((omg) ((qlg) obj2)).k();
                        iA3 = gmg.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        iB4 = gmg.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof qmg) {
                            iB4 = gmg.b(((qmg) obj2).b());
                        } else {
                            iB4 = gmg.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        int iIntValue4 = ((Integer) obj2).intValue();
                        iB4 = gmg.a((iIntValue4 >> 31) ^ (iIntValue4 + iIntValue4));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue4 = ((Long) obj2).longValue();
                        iB4 = gmg.b((jLongValue4 >> 63) ^ (jLongValue4 + jLongValue4));
                        return iB4 + iA2 + i;
                    default:
                        ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 4:
                iB = gmg.b(((Integer) obj).intValue());
                i = iB + iA4;
                iA2 = gmg.a(16);
                if (logVar2 == logVar3) {
                    iA2 += iA2;
                }
                switch (logVar2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = gmg.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = kog.b((String) obj2);
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((omg) ((qlg) obj2)).k();
                        return iB4 + iA2 + i;
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        iB3 = ((omg) ((qlg) obj2)).k();
                        iA3 = gmg.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        iB4 = gmg.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof qmg) {
                            iB4 = gmg.b(((qmg) obj2).b());
                        } else {
                            iB4 = gmg.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        int iIntValue5 = ((Integer) obj2).intValue();
                        iB4 = gmg.a((iIntValue5 >> 31) ^ (iIntValue5 + iIntValue5));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue5 = ((Long) obj2).longValue();
                        iB4 = gmg.b((jLongValue5 >> 63) ^ (jLongValue5 + jLongValue5));
                        return iB4 + iA2 + i;
                    default:
                        ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 5:
                ((Long) obj).getClass();
                iB = 8;
                i = iB + iA4;
                iA2 = gmg.a(16);
                if (logVar2 == logVar3) {
                    iA2 += iA2;
                }
                switch (logVar2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = gmg.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = kog.b((String) obj2);
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((omg) ((qlg) obj2)).k();
                        return iB4 + iA2 + i;
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        iB3 = ((omg) ((qlg) obj2)).k();
                        iA3 = gmg.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        iB4 = gmg.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof qmg) {
                            iB4 = gmg.b(((qmg) obj2).b());
                        } else {
                            iB4 = gmg.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        int iIntValue6 = ((Integer) obj2).intValue();
                        iB4 = gmg.a((iIntValue6 >> 31) ^ (iIntValue6 + iIntValue6));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue6 = ((Long) obj2).longValue();
                        iB4 = gmg.b((jLongValue6 >> 63) ^ (jLongValue6 + jLongValue6));
                        return iB4 + iA2 + i;
                    default:
                        ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 6:
                ((Integer) obj).getClass();
                iB = 4;
                i = iB + iA4;
                iA2 = gmg.a(16);
                if (logVar2 == logVar3) {
                    iA2 += iA2;
                }
                switch (logVar2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = gmg.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = kog.b((String) obj2);
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((omg) ((qlg) obj2)).k();
                        return iB4 + iA2 + i;
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        iB3 = ((omg) ((qlg) obj2)).k();
                        iA3 = gmg.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        iB4 = gmg.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof qmg) {
                            iB4 = gmg.b(((qmg) obj2).b());
                        } else {
                            iB4 = gmg.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        int iIntValue7 = ((Integer) obj2).intValue();
                        iB4 = gmg.a((iIntValue7 >> 31) ^ (iIntValue7 + iIntValue7));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue7 = ((Long) obj2).longValue();
                        iB4 = gmg.b((jLongValue7 >> 63) ^ (jLongValue7 + jLongValue7));
                        return iB4 + iA2 + i;
                    default:
                        ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 7:
                ((Boolean) obj).getClass();
                iB = 1;
                i = iB + iA4;
                iA2 = gmg.a(16);
                if (logVar2 == logVar3) {
                    iA2 += iA2;
                }
                switch (logVar2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = gmg.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = kog.b((String) obj2);
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((omg) ((qlg) obj2)).k();
                        return iB4 + iA2 + i;
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        iB3 = ((omg) ((qlg) obj2)).k();
                        iA3 = gmg.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        iB4 = gmg.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof qmg) {
                            iB4 = gmg.b(((qmg) obj2).b());
                        } else {
                            iB4 = gmg.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        int iIntValue8 = ((Integer) obj2).intValue();
                        iB4 = gmg.a((iIntValue8 >> 31) ^ (iIntValue8 + iIntValue8));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue8 = ((Long) obj2).longValue();
                        iB4 = gmg.b((jLongValue8 >> 63) ^ (jLongValue8 + jLongValue8));
                        return iB4 + iA2 + i;
                    default:
                        ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 8:
                if (obj instanceof xlg) {
                    iB2 = ((xlg) obj).c();
                    iA = gmg.a(iB2);
                } else {
                    iB2 = kog.b((String) obj);
                    iA = gmg.a(iB2);
                }
                iB = iB2 + iA;
                i = iB + iA4;
                iA2 = gmg.a(16);
                if (logVar2 == logVar3) {
                    iA2 += iA2;
                }
                switch (logVar2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = gmg.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = kog.b((String) obj2);
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((omg) ((qlg) obj2)).k();
                        return iB4 + iA2 + i;
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        iB3 = ((omg) ((qlg) obj2)).k();
                        iA3 = gmg.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        iB4 = gmg.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof qmg) {
                            iB4 = gmg.b(((qmg) obj2).b());
                        } else {
                            iB4 = gmg.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        int iIntValue9 = ((Integer) obj2).intValue();
                        iB4 = gmg.a((iIntValue9 >> 31) ^ (iIntValue9 + iIntValue9));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue9 = ((Long) obj2).longValue();
                        iB4 = gmg.b((jLongValue9 >> 63) ^ (jLongValue9 + jLongValue9));
                        return iB4 + iA2 + i;
                    default:
                        ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 9:
                iB = ((omg) ((qlg) obj)).k();
                i = iB + iA4;
                iA2 = gmg.a(16);
                if (logVar2 == logVar3) {
                    iA2 += iA2;
                }
                switch (logVar2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = gmg.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = kog.b((String) obj2);
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((omg) ((qlg) obj2)).k();
                        return iB4 + iA2 + i;
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        iB3 = ((omg) ((qlg) obj2)).k();
                        iA3 = gmg.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        iB4 = gmg.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof qmg) {
                            iB4 = gmg.b(((qmg) obj2).b());
                        } else {
                            iB4 = gmg.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        int iIntValue10 = ((Integer) obj2).intValue();
                        iB4 = gmg.a((iIntValue10 >> 31) ^ (iIntValue10 + iIntValue10));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue10 = ((Long) obj2).longValue();
                        iB4 = gmg.b((jLongValue10 >> 63) ^ (jLongValue10 + jLongValue10));
                        return iB4 + iA2 + i;
                    default:
                        ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                iB2 = ((omg) ((qlg) obj)).k();
                iA = gmg.a(iB2);
                iB = iB2 + iA;
                i = iB + iA4;
                iA2 = gmg.a(16);
                if (logVar2 == logVar3) {
                    iA2 += iA2;
                }
                switch (logVar2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = gmg.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = kog.b((String) obj2);
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((omg) ((qlg) obj2)).k();
                        return iB4 + iA2 + i;
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        iB3 = ((omg) ((qlg) obj2)).k();
                        iA3 = gmg.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        iB4 = gmg.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof qmg) {
                            iB4 = gmg.b(((qmg) obj2).b());
                        } else {
                            iB4 = gmg.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        int iIntValue11 = ((Integer) obj2).intValue();
                        iB4 = gmg.a((iIntValue11 >> 31) ^ (iIntValue11 + iIntValue11));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue11 = ((Long) obj2).longValue();
                        iB4 = gmg.b((jLongValue11 >> 63) ^ (jLongValue11 + jLongValue11));
                        return iB4 + iA2 + i;
                    default:
                        ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (obj instanceof xlg) {
                    iB2 = ((xlg) obj).c();
                    iA = gmg.a(iB2);
                } else {
                    iB2 = ((byte[]) obj).length;
                    iA = gmg.a(iB2);
                }
                iB = iB2 + iA;
                i = iB + iA4;
                iA2 = gmg.a(16);
                if (logVar2 == logVar3) {
                    iA2 += iA2;
                }
                switch (logVar2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = gmg.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = kog.b((String) obj2);
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((omg) ((qlg) obj2)).k();
                        return iB4 + iA2 + i;
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        iB3 = ((omg) ((qlg) obj2)).k();
                        iA3 = gmg.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        iB4 = gmg.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof qmg) {
                            iB4 = gmg.b(((qmg) obj2).b());
                        } else {
                            iB4 = gmg.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        int iIntValue12 = ((Integer) obj2).intValue();
                        iB4 = gmg.a((iIntValue12 >> 31) ^ (iIntValue12 + iIntValue12));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue12 = ((Long) obj2).longValue();
                        iB4 = gmg.b((jLongValue12 >> 63) ^ (jLongValue12 + jLongValue12));
                        return iB4 + iA2 + i;
                    default:
                        ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                iB = gmg.a(((Integer) obj).intValue());
                i = iB + iA4;
                iA2 = gmg.a(16);
                if (logVar2 == logVar3) {
                    iA2 += iA2;
                }
                switch (logVar2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = gmg.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = kog.b((String) obj2);
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((omg) ((qlg) obj2)).k();
                        return iB4 + iA2 + i;
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        iB3 = ((omg) ((qlg) obj2)).k();
                        iA3 = gmg.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        iB4 = gmg.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof qmg) {
                            iB4 = gmg.b(((qmg) obj2).b());
                        } else {
                            iB4 = gmg.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        int iIntValue13 = ((Integer) obj2).intValue();
                        iB4 = gmg.a((iIntValue13 >> 31) ^ (iIntValue13 + iIntValue13));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue13 = ((Long) obj2).longValue();
                        iB4 = gmg.b((jLongValue13 >> 63) ^ (jLongValue13 + jLongValue13));
                        return iB4 + iA2 + i;
                    default:
                        ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                iB = obj instanceof qmg ? gmg.b(((qmg) obj).b()) : gmg.b(((Integer) obj).intValue());
                i = iB + iA4;
                iA2 = gmg.a(16);
                if (logVar2 == logVar3) {
                    iA2 += iA2;
                }
                switch (logVar2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = gmg.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = kog.b((String) obj2);
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((omg) ((qlg) obj2)).k();
                        return iB4 + iA2 + i;
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        iB3 = ((omg) ((qlg) obj2)).k();
                        iA3 = gmg.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        iB4 = gmg.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof qmg) {
                            iB4 = gmg.b(((qmg) obj2).b());
                        } else {
                            iB4 = gmg.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        int iIntValue14 = ((Integer) obj2).intValue();
                        iB4 = gmg.a((iIntValue14 >> 31) ^ (iIntValue14 + iIntValue14));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue14 = ((Long) obj2).longValue();
                        iB4 = gmg.b((jLongValue14 >> 63) ^ (jLongValue14 + jLongValue14));
                        return iB4 + iA2 + i;
                    default:
                        ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 14:
                ((Integer) obj).getClass();
                iB = 4;
                i = iB + iA4;
                iA2 = gmg.a(16);
                if (logVar2 == logVar3) {
                    iA2 += iA2;
                }
                switch (logVar2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = gmg.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = kog.b((String) obj2);
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((omg) ((qlg) obj2)).k();
                        return iB4 + iA2 + i;
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        iB3 = ((omg) ((qlg) obj2)).k();
                        iA3 = gmg.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        iB4 = gmg.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof qmg) {
                            iB4 = gmg.b(((qmg) obj2).b());
                        } else {
                            iB4 = gmg.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        int iIntValue15 = ((Integer) obj2).intValue();
                        iB4 = gmg.a((iIntValue15 >> 31) ^ (iIntValue15 + iIntValue15));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue15 = ((Long) obj2).longValue();
                        iB4 = gmg.b((jLongValue15 >> 63) ^ (jLongValue15 + jLongValue15));
                        return iB4 + iA2 + i;
                    default:
                        ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 15:
                ((Long) obj).getClass();
                iB = 8;
                i = iB + iA4;
                iA2 = gmg.a(16);
                if (logVar2 == logVar3) {
                    iA2 += iA2;
                }
                switch (logVar2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = gmg.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = kog.b((String) obj2);
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((omg) ((qlg) obj2)).k();
                        return iB4 + iA2 + i;
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        iB3 = ((omg) ((qlg) obj2)).k();
                        iA3 = gmg.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        iB4 = gmg.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof qmg) {
                            iB4 = gmg.b(((qmg) obj2).b());
                        } else {
                            iB4 = gmg.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        int iIntValue16 = ((Integer) obj2).intValue();
                        iB4 = gmg.a((iIntValue16 >> 31) ^ (iIntValue16 + iIntValue16));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue16 = ((Long) obj2).longValue();
                        iB4 = gmg.b((jLongValue16 >> 63) ^ (jLongValue16 + jLongValue16));
                        return iB4 + iA2 + i;
                    default:
                        ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                int iIntValue17 = ((Integer) obj).intValue();
                iB = gmg.a((iIntValue17 >> 31) ^ (iIntValue17 + iIntValue17));
                i = iB + iA4;
                iA2 = gmg.a(16);
                if (logVar2 == logVar3) {
                    iA2 += iA2;
                }
                switch (logVar2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = gmg.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = kog.b((String) obj2);
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((omg) ((qlg) obj2)).k();
                        return iB4 + iA2 + i;
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        iB3 = ((omg) ((qlg) obj2)).k();
                        iA3 = gmg.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        iB4 = gmg.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof qmg) {
                            iB4 = gmg.b(((qmg) obj2).b());
                        } else {
                            iB4 = gmg.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        int iIntValue18 = ((Integer) obj2).intValue();
                        iB4 = gmg.a((iIntValue18 >> 31) ^ (iIntValue18 + iIntValue18));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue17 = ((Long) obj2).longValue();
                        iB4 = gmg.b((jLongValue17 >> 63) ^ (jLongValue17 + jLongValue17));
                        return iB4 + iA2 + i;
                    default:
                        ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 17:
                long jLongValue18 = ((Long) obj).longValue();
                iB = gmg.b((jLongValue18 >> 63) ^ (jLongValue18 + jLongValue18));
                i = iB + iA4;
                iA2 = gmg.a(16);
                if (logVar2 == logVar3) {
                    iA2 += iA2;
                }
                switch (logVar2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 2:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 3:
                        iB4 = gmg.b(((Long) obj2).longValue());
                        return iB4 + iA2 + i;
                    case 4:
                        iB4 = gmg.b(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iB4 = 1;
                        return iB4 + iA2 + i;
                    case 8:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = kog.b((String) obj2);
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case 9:
                        iB4 = ((omg) ((qlg) obj2)).k();
                        return iB4 + iA2 + i;
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        iB3 = ((omg) ((qlg) obj2)).k();
                        iA3 = gmg.a(iB3);
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        if (obj2 instanceof xlg) {
                            iB3 = ((xlg) obj2).c();
                            iA3 = gmg.a(iB3);
                        } else {
                            iB3 = ((byte[]) obj2).length;
                            iA3 = gmg.a(iB3);
                        }
                        iB4 = iA3 + iB3;
                        return iB4 + iA2 + i;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        iB4 = gmg.a(((Integer) obj2).intValue());
                        return iB4 + iA2 + i;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        if (obj2 instanceof qmg) {
                            iB4 = gmg.b(((qmg) obj2).b());
                        } else {
                            iB4 = gmg.b(((Integer) obj2).intValue());
                        }
                        return iB4 + iA2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB4 = 4;
                        return iB4 + iA2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iB4 + iA2 + i;
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        int iIntValue19 = ((Integer) obj2).intValue();
                        iB4 = gmg.a((iIntValue19 >> 31) ^ (iIntValue19 + iIntValue19));
                        return iB4 + iA2 + i;
                    case 17:
                        long jLongValue19 = ((Long) obj2).longValue();
                        iB4 = gmg.b((jLongValue19 >> 63) ^ (jLongValue19 + jLongValue19));
                        return iB4 + iA2 + i;
                    default:
                        ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            default:
                ho7.n("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }
}
