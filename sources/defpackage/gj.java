package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gj implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public gj(List list, int i) {
        this.a = i;
        switch (i) {
            case 19:
                zdf zdfVar = zdf.a;
                this.b = list;
                break;
            default:
                ycf ycfVar = ycf.a;
                this.b = list;
                break;
        }
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                list.get(((Number) obj).intValue());
                return null;
            case 1:
                list.get(((Number) obj).intValue());
                return null;
            case 2:
                list.get(((Number) obj).intValue());
                return null;
            case 3:
                list.get(((Number) obj).intValue());
                return null;
            case 4:
                list.get(((Number) obj).intValue());
                return null;
            case 5:
                list.get(((Number) obj).intValue());
                return null;
            case 6:
                list.get(((Number) obj).intValue());
                return null;
            case 7:
                list.get(((Number) obj).intValue());
                return null;
            case 8:
                list.get(((Number) obj).intValue());
                return null;
            case 9:
                list.get(((Number) obj).intValue());
                return null;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                list.get(((Number) obj).intValue());
                return null;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                list.get(((Number) obj).intValue());
                return null;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                list.get(((Number) obj).intValue());
                return null;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                list.get(((Number) obj).intValue());
                return null;
            case 14:
                list.get(((Number) obj).intValue());
                return null;
            case 15:
                String str = (String) list.get(((Number) obj).intValue());
                str.getClass();
                return str;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                list.get(((Number) obj).intValue());
                return null;
            case 17:
                return ycf.a.get(list.get(((Number) obj).intValue()));
            case 18:
                list.get(((Number) obj).intValue());
                return null;
            case 19:
                return zdf.a.get(list.get(((Number) obj).intValue()));
            case 20:
                list.get(((Number) obj).intValue());
                return null;
            default:
                list.get(((Number) obj).intValue());
                return null;
        }
    }

    public gj(ule uleVar, List list) {
        this.a = 15;
        this.b = list;
    }

    public /* synthetic */ gj(int i, List list, boolean z) {
        this.a = i;
        this.b = list;
    }
}
