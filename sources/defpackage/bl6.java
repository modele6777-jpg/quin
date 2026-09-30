package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bl6 {
    public final pk6 a;
    public final nk6 b;
    public final c93 c;

    public bl6(pk6 pk6Var, nk6 nk6Var, c93 c93Var) {
        this.a = pk6Var;
        this.b = nk6Var;
        this.c = c93Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl6)) {
            return false;
        }
        bl6 bl6Var = (bl6) obj;
        return this.a.equals(bl6Var.a) && this.b.equals(bl6Var.b) && this.c.equals(bl6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ub3.a(this.b.a, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "HistoryTokenGroup(empty=" + this.a + ", historyContainer=" + this.b + ", dailyFortune=" + this.c + ")";
    }
}
