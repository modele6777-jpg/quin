package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ca9 {
    public final ub9 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public ca9(ub9 ub9Var, boolean z, boolean z2) {
        if (!ub9Var.a && z) {
            qc0.o(ub9Var.b().concat(" does not allow nullable values"));
            throw null;
        }
        this.a = ub9Var;
        this.b = z;
        this.c = z2;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ca9.class != obj.getClass()) {
            return false;
        }
        ca9 ca9Var = (ca9) obj;
        return this.b == ca9Var.b && this.c == ca9Var.c && this.a.equals(ca9Var.a);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(job.a.b(ca9.class).r());
        sb.append(" Type: " + this.a);
        sb.append(" Nullable: " + this.b);
        if (this.c) {
            sb.append(" DefaultValue: null");
        }
        return sb.toString();
    }
}
