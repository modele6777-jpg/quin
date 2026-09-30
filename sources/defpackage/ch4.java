package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ch4 extends fh4 {
    public final m40 b;
    public final Throwable c;

    public ch4(m40 m40Var, Throwable th) {
        super(m40Var);
        this.b = m40Var;
        this.c = th;
    }

    @Override // defpackage.fh4
    public final m40 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch4)) {
            return false;
        }
        ch4 ch4Var = (ch4) obj;
        return this.b == ch4Var.b && pa7.t(this.c, ch4Var.c);
    }

    public final int hashCode() {
        m40 m40Var = this.b;
        int iHashCode = (m40Var == null ? 0 : m40Var.hashCode()) * 31;
        Throwable th = this.c;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "Error(completedStatus=" + this.b + ", error=" + this.c + ")";
    }
}
