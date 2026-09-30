package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ei9 {
    public final String a;
    public final String b;
    public final Integer c;

    public ei9(String str, String str2, Integer num) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei9)) {
            return false;
        }
        ei9 ei9Var = (ei9) obj;
        return pa7.t(this.a, ei9Var.a) && pa7.t(this.b, ei9Var.b) && pa7.t(this.c, ei9Var.c);
    }

    public final int hashCode() {
        int iC = ub3.c(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return iC + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("NotificationPermissionTrackingContext(legacyPathway=", this.a, ", resultPathway=", this.b, ", touchpointId=");
        sbO.append(this.c);
        sbO.append(")");
        return sbO.toString();
    }
}
