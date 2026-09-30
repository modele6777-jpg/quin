package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mj9 {
    public final int a;
    public final d83 b;

    public mj9(int i, d83 d83Var) {
        this.a = i;
        this.b = d83Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj9)) {
            return false;
        }
        mj9 mj9Var = (mj9) obj;
        return this.a == mj9Var.a && this.b == mj9Var.b;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        d83 d83Var = this.b;
        return iHashCode + (d83Var == null ? 0 : d83Var.hashCode());
    }

    public final String toString() {
        return "NotificationTouchpointPrompt(touchpointId=" + this.a + ", promptMode=" + this.b + ")";
    }
}
