package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ru7 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ru7(int i, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = i < 291 && !(z2 && z);
    }

    public static ru7 a(ru7 ru7Var, int i, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            i = ru7Var.a;
        }
        boolean z2 = (i2 & 2) != 0 ? ru7Var.b : true;
        if ((i2 & 4) != 0) {
            z = ru7Var.c;
        }
        boolean z3 = ru7Var.d;
        ru7Var.getClass();
        return new ru7(i, z2, z, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru7)) {
            return false;
        }
        ru7 ru7Var = (ru7) obj;
        return this.a == ru7Var.a && this.b == ru7Var.b && this.c == ru7Var.c && this.d == ru7Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ub3.d(ub3.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "LaunchState(lastVersion=" + this.a + ", isAdIdReportEnable=" + this.b + ", isCrashReportEnable=" + this.c + ", isSignIn=" + this.d + ")";
    }
}
