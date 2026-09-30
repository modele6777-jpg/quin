package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ci6 {
    public final fs4 a;
    public final long b;
    public final long c;

    public ci6(fs4 fs4Var, long j, long j2) {
        this.a = fs4Var;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci6)) {
            return false;
        }
        ci6 ci6Var = (ci6) obj;
        return this.a.equals(ci6Var.a) && hl9.c(this.b, ci6Var.b) && Float.compare(0.48f, 0.48f) == 0 && hl9.c(this.c, ci6Var.c) && Float.compare(0.0f, 0.0f) == 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ub3.a(0.0f, ib8.b(ub3.a(0.48f, ib8.b(this.a.hashCode() * 31, 31, this.b), 31), 31, this.c), 31);
    }

    public final String toString() {
        String strI = hl9.i(this.b);
        String strI2 = hl9.i(this.c);
        StringBuilder sb = new StringBuilder("LinearGradient(easing=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(strI);
        sb.append(", startIntensity=0.48, end=");
        return ks0.l(sb, strI2, ", endIntensity=0.0, preferPerformance=false)");
    }
}
