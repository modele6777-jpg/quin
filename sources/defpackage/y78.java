package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class y78 implements nyc {
    public final nyc a;

    public y78(nyc nycVar) {
        this.a = nycVar;
    }

    @Override // defpackage.nyc
    public final int d(String str) {
        str.getClass();
        Integer numD = c5e.D(str);
        if (numD != null) {
            return numD.intValue();
        }
        qc0.j(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // defpackage.nyc
    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y78)) {
            return false;
        }
        y78 y78Var = (y78) obj;
        return pa7.t(this.a, y78Var.a) && pa7.t(a(), y78Var.a());
    }

    @Override // defpackage.nyc
    public final String f(int i) {
        return String.valueOf(i);
    }

    @Override // defpackage.nyc
    public final iec g() {
        return g5e.d;
    }

    @Override // defpackage.nyc
    public final List h(int i) {
        if (i >= 0) {
            return pu4.a;
        }
        ho7.v(ub3.n(i, "Illegal index ", ", "), a(), " expects only non-negative indices");
        return null;
    }

    public final int hashCode() {
        return a().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.nyc
    public final nyc i(int i) {
        if (i >= 0) {
            return this.a;
        }
        ho7.v(ub3.n(i, "Illegal index ", ", "), a(), " expects only non-negative indices");
        return null;
    }

    @Override // defpackage.nyc
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        ho7.v(ub3.n(i, "Illegal index ", ", "), a(), " expects only non-negative indices");
        return false;
    }

    public final String toString() {
        return a() + '(' + this.a + ')';
    }
}
