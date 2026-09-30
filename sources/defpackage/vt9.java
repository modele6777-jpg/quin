package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vt9 {
    public final int a;

    public /* synthetic */ vt9(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vt9) {
            return this.a == ((vt9) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "PENDING";
        }
        if (i == 1) {
            return "AVAILABLE";
        }
        if (i == 2) {
            return "UNAVAILABLE";
        }
        switch (i) {
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return "ERROR_OUTPUT_FAILED";
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return "ERROR_OUTPUT_ABORTED";
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return "ERROR_OUTPUT_MISSING";
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return "ERROR_OUTPUT_DROPPED";
            default:
                return tec.k("OutputStatus(value=", i, ')');
        }
    }
}
