package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ac4 extends bc4 {
    public final long a;
    public final String b;
    public final int c;
    public final boolean d;
    public final String e;
    public final w57 f;
    public final w57 g;

    public ac4(long j, String str, int i, boolean z, String str2, w57 w57Var, w57 w57Var2) {
        str.getClass();
        str2.getClass();
        w57Var.getClass();
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = z;
        this.e = str2;
        this.f = w57Var;
        this.g = w57Var2;
    }

    @Override // defpackage.bc4
    public final w57 a() {
        return this.f;
    }

    @Override // defpackage.bc4
    public final w57 b() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac4)) {
            return false;
        }
        ac4 ac4Var = (ac4) obj;
        return this.a == ac4Var.a && pa7.t(this.b, ac4Var.b) && this.c == ac4Var.c && this.d == ac4Var.d && pa7.t(this.e, ac4Var.e) && pa7.t(this.f, ac4Var.f) && pa7.t(this.g, ac4Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ub3.c(ub3.d(ub3.b(this.c, ub3.c(Long.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e)) * 31;
        w57 w57Var = this.g;
        return iHashCode + (w57Var == null ? 0 : w57Var.hashCode());
    }

    public final String toString() {
        return "QuickDecision(dbId=" + this.a + ", cardKey=" + this.b + ", cardTitleRes=" + this.c + ", isReversed=" + this.d + ", answer=" + this.e + ", createAt=" + this.f + ", drawnAt=" + this.g + ")";
    }
}
