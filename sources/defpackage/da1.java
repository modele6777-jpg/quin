package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class da1 {
    public final dx5 a;
    public final t99 b;

    static {
        t99 t99Var = sud.f;
        dx5 dx5Var = dx5.c;
        cn1.V(t99Var);
    }

    public da1(dx5 dx5Var, t99 t99Var) {
        dx5Var.getClass();
        this.a = dx5Var;
        this.b = t99Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da1)) {
            return false;
        }
        da1 da1Var = (da1) obj;
        return this.a.equals(da1Var.a) && this.b.equals(da1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 527) * 961);
    }

    public final String toString() {
        return c5e.z(this.a.a.a, '.', '/') + "/" + this.b;
    }
}
