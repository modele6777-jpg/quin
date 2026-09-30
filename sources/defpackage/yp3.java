package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yp3 implements aq3 {
    public final yc4 a;
    public final String b;
    public final ya2 c;

    public yp3(yc4 yc4Var, String str, za2 za2Var) {
        str.getClass();
        this.a = yc4Var;
        this.b = str;
        this.c = za2Var;
    }

    @Override // defpackage.aq3
    public final ya2 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp3)) {
            return false;
        }
        yp3 yp3Var = (yp3) obj;
        return this.a.equals(yp3Var.a) && pa7.t(this.b, yp3Var.b) && pa7.t(this.c, yp3Var.c);
    }

    public final int hashCode() {
        int iC = ub3.c(this.a.hashCode() * 31, 31, this.b);
        ya2 ya2Var = this.c;
        return iC + (ya2Var == null ? 0 : ya2Var.hashCode());
    }

    public final String toString() {
        return "Snapshot(value=" + this.a + ", fallbackAccountId=" + this.b + ", completion=" + this.c + ")";
    }
}
