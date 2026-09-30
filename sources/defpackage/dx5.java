package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dx5 {
    public static final dx5 c = new dx5("");
    public final ex5 a;
    public transient dx5 b;

    public dx5(String str) {
        str.getClass();
        this.a = new ex5(this, str);
    }

    public final dx5 a(t99 t99Var) {
        t99Var.getClass();
        return new dx5(this.a.a(t99Var), this);
    }

    public final dx5 b() {
        dx5 dx5Var = this.b;
        if (dx5Var != null) {
            return dx5Var;
        }
        ex5 ex5Var = this.a;
        if (ex5Var.c()) {
            qc0.p("root");
            return null;
        }
        dx5 dx5Var2 = new dx5(ex5Var.e());
        this.b = dx5Var2;
        return dx5Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dx5) {
            return pa7.t(this.a, ((dx5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public dx5(ex5 ex5Var) {
        this.a = ex5Var;
    }

    public dx5(ex5 ex5Var, dx5 dx5Var) {
        this.a = ex5Var;
        this.b = dx5Var;
    }
}
