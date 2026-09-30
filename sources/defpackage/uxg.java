package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class uxg {
    public static final uxg b = new uxg(0);
    public static final uxg c = new uxg(1);
    public static final uxg d = new uxg(2);
    public static final uxg e = new uxg(3);
    public static final uxg f = new uxg(4);
    public static final uxg g = new uxg(5);
    public static final uxg h = new uxg(6);
    public static final uxg i = new uxg(7);
    public static final uxg j = new uxg(8);
    public final /* synthetic */ int a;

    public /* synthetic */ uxg(int i2) {
        this.a = i2;
    }

    public final boolean a(int i2) {
        j6h j6hVar;
        switch (this.a) {
            case 0:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        return true;
                    default:
                        return false;
                }
            case 1:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    case 14:
                    case 15:
                        break;
                    default:
                        switch (i2) {
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
                                break;
                            default:
                                return false;
                        }
                        break;
                }
                return true;
            case 2:
                return z5h.b(i2) != null;
            case 3:
                if (i2 == 0) {
                    j6hVar = j6h.BROADCAST_ACTION_UNSPECIFIED;
                } else if (i2 == 1) {
                    j6hVar = j6h.PURCHASES_UPDATED_ACTION;
                } else if (i2 == 2) {
                    j6hVar = j6h.LOCAL_PURCHASES_UPDATED_ACTION;
                } else if (i2 == 3) {
                    j6hVar = j6h.ALTERNATIVE_BILLING_ACTION;
                } else if (i2 != 4) {
                    j6hVar = i2 != 5 ? null : j6h.PLAY_BILLING_ACTIVITY_CREATED_ACTION;
                } else {
                    j6hVar = j6h.IN_APP_BILLING_RESULT_UPDATE_ACTION;
                }
                return j6hVar != null;
            case 4:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 5:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                        return true;
                    case 14:
                    case 15:
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                    default:
                        return false;
                }
            case 6:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            case 7:
                return i2 == 0 || i2 == 1;
            default:
                return i2 == 0 || i2 == 1;
        }
    }
}
