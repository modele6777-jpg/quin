package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lb0 implements Comparable {
    public static final rob d = new rob("^\\s*(\\d+)\\.(\\d+)\\.(\\d+)");
    public final int a;
    public final int b;
    public final int c;

    public lb0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        lb0 lb0Var = (lb0) obj;
        lb0Var.getClass();
        a26[] a26VarArr = {ib0.a, jb0.a, kb0.a};
        for (int i = 0; i < 3; i++) {
            a26 a26Var = a26VarArr[i];
            int iM = i7h.m((Comparable) a26Var.d(this), (Comparable) a26Var.d(lb0Var));
            if (iM != 0) {
                return iM;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb0)) {
            return false;
        }
        lb0 lb0Var = (lb0) obj;
        return this.a == lb0Var.a && this.b == lb0Var.b && this.c == lb0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ub3.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return tec.g(this.c, ")", ib8.n(this.a, this.b, "AppVersion(major=", ", minor=", ", patch="));
    }
}
