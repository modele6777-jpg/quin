package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mr7 {
    public final t09 a;
    public final u57 b;

    public mr7(t09 t09Var, u57 u57Var) {
        this.a = t09Var;
        this.b = u57Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr7)) {
            return false;
        }
        mr7 mr7Var = (mr7) obj;
        return this.a.equals(mr7Var.a) && this.b.equals(mr7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "KoinDefinition(module=" + this.a + ", factory=" + this.b + ')';
    }
}
