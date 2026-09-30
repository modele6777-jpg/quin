package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vh9 {
    public final boolean a;
    public final String b;

    public vh9(boolean z, String str) {
        str.getClass();
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh9)) {
            return false;
        }
        vh9 vh9Var = (vh9) obj;
        return this.a == vh9Var.a && pa7.t(this.b, vh9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "NotificationPermissionResult(isGranted=" + this.a + ", source=" + this.b + ")";
    }
}
