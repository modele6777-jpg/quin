package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dh9 {
    public final String a;
    public final String b;
    public final yic c;

    static {
        yic yicVar = yic.c;
    }

    public dh9(String str, String str2, yic yicVar) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = yicVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh9)) {
            return false;
        }
        dh9 dh9Var = (dh9) obj;
        return pa7.t(this.a, dh9Var.a) && pa7.t(this.b, dh9Var.b) && pa7.t(this.c, dh9Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        yic yicVar = this.c;
        return iHashCode2 + (yicVar != null ? yicVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("NotificationClickPayload(triggeredBy=", this.a, ", pushId=", this.b, ", campaign=");
        sbO.append(this.c);
        sbO.append(")");
        return sbO.toString();
    }
}
