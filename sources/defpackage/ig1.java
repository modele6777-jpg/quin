package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ig1 {
    public final String a;

    public static void a(String str) {
        str.getClass();
        if (v4e.Q(str)) {
            qc0.j("CameraId cannot be null or blank!");
        }
    }

    public static String b(String str) {
        return ub3.i("CameraId-", str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ig1) {
            return pa7.t(this.a, ((ig1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b(this.a);
    }
}
