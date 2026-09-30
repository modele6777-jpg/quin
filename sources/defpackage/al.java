package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class al implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ h36 b;

    public /* synthetic */ al(h36 h36Var, int i) {
        this.a = i;
        this.b = h36Var;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i = this.a;
        h36 h36Var = this.b;
        switch (i) {
            case 0:
                ((gl) h36Var).z(obj, obj2);
                break;
            case 1:
                ((gl) h36Var).z(obj, obj2);
                break;
            case 2:
                ((gl) h36Var).z(obj, obj2);
                break;
            case 3:
                ((gl) h36Var).z(obj, obj2);
                break;
            case 4:
                ((gl) h36Var).z(obj, obj2);
                break;
            case 5:
                ((gl) h36Var).z(obj, obj2);
                break;
            case 6:
                ((gl) h36Var).z(obj, obj2);
                break;
            case 7:
                ((gl) h36Var).z(obj, obj2);
                break;
            case 8:
                ((gl) h36Var).z(obj, obj2);
                break;
            case 9:
                ((gl) h36Var).z(obj, obj2);
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((gl) h36Var).z(obj, obj2);
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((v5c) h36Var).z(obj, obj2);
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((v5c) h36Var).z(obj, obj2);
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((v5c) h36Var).z(obj, obj2);
                break;
            case 14:
                ((v5c) h36Var).z(obj, obj2);
                break;
            case 15:
                ((v5c) h36Var).z(obj, obj2);
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((v5c) h36Var).z(obj, obj2);
                break;
            default:
                ((v5c) h36Var).z(obj, obj2);
                break;
        }
    }
}
