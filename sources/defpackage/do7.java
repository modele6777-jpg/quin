package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class do7 {
    public static final do7 c = new do7(null, null);
    public final io7 a;
    public final yn7 b;

    public do7(yn7 yn7Var, io7 io7Var) {
        String str;
        this.a = io7Var;
        this.b = yn7Var;
        if ((io7Var == null) == (yn7Var == null)) {
            return;
        }
        if (io7Var == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + io7Var + " requires type to be specified.";
        }
        qc0.o(str);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof do7)) {
            return false;
        }
        do7 do7Var = (do7) obj;
        return this.a == do7Var.a && pa7.t(this.b, do7Var.b);
    }

    public final int hashCode() {
        io7 io7Var = this.a;
        int iHashCode = (io7Var == null ? 0 : io7Var.hashCode()) * 31;
        yn7 yn7Var = this.b;
        return iHashCode + (yn7Var != null ? yn7Var.hashCode() : 0);
    }

    public final String toString() {
        io7 io7Var = this.a;
        int i = io7Var == null ? -1 : co7.a[io7Var.ordinal()];
        if (i == -1) {
            return "*";
        }
        yn7 yn7Var = this.b;
        if (i == 1) {
            return String.valueOf(yn7Var);
        }
        if (i == 2) {
            return "in " + yn7Var;
        }
        if (i != 3) {
            ap.c();
            return null;
        }
        return "out " + yn7Var;
    }
}
