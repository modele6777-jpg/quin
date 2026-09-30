package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wf7 {
    public static final wf7 f = new wf7(null, false);
    public final vj9 a;
    public final h69 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public wf7(vj9 vj9Var, h69 h69Var, boolean z, boolean z2, boolean z3) {
        this.a = vj9Var;
        this.b = h69Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf7)) {
            return false;
        }
        wf7 wf7Var = (wf7) obj;
        return this.a == wf7Var.a && this.b == wf7Var.b && this.c == wf7Var.c && this.d == wf7Var.d && this.e == wf7Var.e;
    }

    public final int hashCode() {
        vj9 vj9Var = this.a;
        int iHashCode = (vj9Var == null ? 0 : vj9Var.hashCode()) * 31;
        h69 h69Var = this.b;
        return Boolean.hashCode(this.e) + ub3.d(ub3.d((iHashCode + (h69Var != null ? h69Var.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "JavaTypeQualifiers(nullability=" + this.a + ", mutability=" + this.b + ", definitelyNotNull=" + this.c + ", isNullabilityQualifierForWarning=" + this.d + ", isMutabilityQualifierForWarning=" + this.e + ')';
    }

    public /* synthetic */ wf7(vj9 vj9Var, boolean z) {
        this(vj9Var, null, z, false, false);
    }
}
