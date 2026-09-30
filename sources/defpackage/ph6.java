package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ph6 implements nyc {
    public final String a;
    public final nyc b;
    public final nyc c;

    public ph6(String str, nyc nycVar, nyc nycVar2) {
        this.a = str;
        this.b = nycVar;
        this.c = nycVar2;
    }

    @Override // defpackage.nyc
    public final String a() {
        return this.a;
    }

    @Override // defpackage.nyc
    public final int d(String str) {
        str.getClass();
        Integer numD = c5e.D(str);
        if (numD != null) {
            return numD.intValue();
        }
        qc0.j(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override // defpackage.nyc
    public final int e() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph6)) {
            return false;
        }
        ph6 ph6Var = (ph6) obj;
        return this.a.equals(ph6Var.a) && this.b.equals(ph6Var.b) && this.c.equals(ph6Var.c);
    }

    @Override // defpackage.nyc
    public final String f(int i) {
        return String.valueOf(i);
    }

    @Override // defpackage.nyc
    public final iec g() {
        return g5e.e;
    }

    @Override // defpackage.nyc
    public final List h(int i) {
        if (i >= 0) {
            return pu4.a;
        }
        qc0.o(ks0.l(ub3.n(i, "Illegal index ", ", "), this.a, " expects only non-negative indices"));
        return null;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // defpackage.nyc
    public final nyc i(int i) {
        if (i < 0) {
            qc0.o(ks0.l(ub3.n(i, "Illegal index ", ", "), this.a, " expects only non-negative indices"));
            return null;
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.b;
        }
        if (i2 == 1) {
            return this.c;
        }
        qc0.p("Unreached");
        return null;
    }

    @Override // defpackage.nyc
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        qc0.o(ks0.l(ub3.n(i, "Illegal index ", ", "), this.a, " expects only non-negative indices"));
        return false;
    }

    public final String toString() {
        return this.a + '(' + this.b + ", " + this.c + ')';
    }
}
