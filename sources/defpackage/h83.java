package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h83 {
    public final e83 a;
    public final int b;
    public final int c;

    public h83(e83 e83Var, int i, int i2) {
        this.a = e83Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h83)) {
            return false;
        }
        h83 h83Var = (h83) obj;
        return this.a.equals(h83Var.a) && this.b == h83Var.b && this.c == h83Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ub3.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DailyFortuneReminderSubmissionSnapshot(selection=");
        sb.append(this.a);
        sb.append(", hour=");
        sb.append(this.b);
        sb.append(", minute=");
        return tec.g(this.c, ")", sb);
    }
}
