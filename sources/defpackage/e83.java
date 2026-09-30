package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e83 {
    public final boolean a;
    public final boolean b;

    public e83(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static e83 a(e83 e83Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = e83Var.a;
        }
        if ((i & 2) != 0) {
            z2 = e83Var.b;
        }
        e83Var.getClass();
        return new e83(z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e83)) {
            return false;
        }
        e83 e83Var = (e83) obj;
        return this.a == e83Var.a && this.b == e83Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "DailyFortuneReminderSelection(today=" + this.a + ", tomorrow=" + this.b + ")";
    }
}
