package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import defpackage.hcc;
import defpackage.hzb;
import defpackage.je9;
import defpackage.njg;
import defpackage.ub3;
import defpackage.v4;
import defpackage.w84;
import defpackage.ym8;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class Status extends v4 implements hzb, ReflectedParcelable {
    public final int a;
    public final String b;
    public final PendingIntent c;
    public final ConnectionResult d;
    public static final Status e = new Status(0, null, null, null);
    public static final Status f = new Status(14, null, null, null);
    public static final Status g = new Status(8, null, null, null);
    public static final Status v = new Status(15, null, null, null);
    public static final Status w = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new njg(22);

    public Status(int i, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.a = i;
        this.b = str;
        this.c = pendingIntent;
        this.d = connectionResult;
    }

    public final boolean c() {
        return this.a <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.a == status.a && ym8.w(this.b, status.b) && ym8.w(this.c, status.c) && ym8.w(this.d, status.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    public final String toString() {
        w84 w84Var = new w84(this);
        String strH = this.b;
        if (strH == null) {
            int i = this.a;
            switch (i) {
                case -1:
                    strH = "SUCCESS_CACHE";
                    break;
                case 0:
                    strH = "SUCCESS";
                    break;
                case 1:
                case 9:
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                default:
                    strH = ub3.h(i, "unknown status code: ", new StringBuilder(String.valueOf(i).length() + 21));
                    break;
                case 2:
                    strH = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    strH = "SERVICE_DISABLED";
                    break;
                case 4:
                    strH = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    strH = "INVALID_ACCOUNT";
                    break;
                case 6:
                    strH = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    strH = "NETWORK_ERROR";
                    break;
                case 8:
                    strH = "INTERNAL_ERROR";
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    strH = "DEVELOPER_ERROR";
                    break;
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    strH = "ERROR";
                    break;
                case 14:
                    strH = "INTERRUPTED";
                    break;
                case 15:
                    strH = "TIMEOUT";
                    break;
                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                    strH = "CANCELED";
                    break;
                case 17:
                    strH = "API_NOT_CONNECTED";
                    break;
                case 18:
                    strH = "DEAD_CLIENT";
                    break;
                case 19:
                    strH = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    strH = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    strH = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    strH = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        w84Var.G0(strH, "statusCode");
        w84Var.G0(this.c, "resolution");
        return w84Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.z(parcel, 1, 4);
        parcel.writeInt(this.a);
        hcc.v(parcel, 2, this.b);
        hcc.u(parcel, 3, this.c, i);
        hcc.u(parcel, 4, this.d, i);
        hcc.C(parcel, iB);
    }

    @Override // defpackage.hzb
    public final Status a() {
        return this;
    }
}
