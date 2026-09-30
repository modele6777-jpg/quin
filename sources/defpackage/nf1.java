package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nf1 {
    public final int a;

    public static String a(int i) {
        String str;
        StringBuilder sb = new StringBuilder("CameraError(");
        if (i == 0) {
            str = "ERROR_UNDETERMINED";
        } else if (i == 1) {
            str = "ERROR_CAMERA_IN_USE";
        } else if (i == 2) {
            str = "ERROR_CAMERA_LIMIT_EXCEEDED";
        } else if (i == 3) {
            str = "ERROR_CAMERA_DISABLED";
        } else if (i == 4) {
            str = "ERROR_CAMERA_DEVICE";
        } else if (i == 5) {
            str = "ERROR_CAMERA_SERVICE";
        } else if (i == 6) {
            str = "ERROR_CAMERA_DISCONNECTED";
        } else if (i == 7) {
            str = "ERROR_ILLEGAL_ARGUMENT_EXCEPTION";
        } else if (i == 8) {
            str = "ERROR_SECURITY_EXCEPTION";
        } else if (i == 9) {
            str = "ERROR_GRAPH_CONFIG";
        } else if (i == 10) {
            str = "ERROR_DO_NOT_DISTURB_ENABLED";
        } else if (i == 11) {
            str = "ERROR_UNKNOWN_EXCEPTION";
        } else if (i == 12) {
            str = "ERROR_CAMERA_OPENER";
        } else {
            str = i == 13 ? "ERROR_CAMERA_OPEN_TIMEOUT" : "ERROR_UNKNOWN";
        }
        return ub3.l(sb, str, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nf1) {
            return this.a == ((nf1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
