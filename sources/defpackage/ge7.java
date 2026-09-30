package defpackage;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ge7 {
    public final dag a;
    public final Collection b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ge7(dag dagVar, Collection collection, int i) {
        this(dagVar, collection, dagVar.a == vj9.c, (i & 8) == 0, (i & 16) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge7)) {
            return false;
        }
        ge7 ge7Var = (ge7) obj;
        return pa7.t(this.a, ge7Var.a) && pa7.t(this.b, ge7Var.b) && this.c == ge7Var.c && this.d == ge7Var.d && this.e == ge7Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ub3.d(ub3.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.a + ", qualifierApplicabilityTypes=" + this.b + ", definitelyNotNull=" + this.c + ", preferQualifierOverBound=" + this.d + ", preferQualifierOverSupertype=" + this.e + ')';
    }

    public ge7(dag dagVar, Collection collection, boolean z, boolean z2, boolean z3) {
        collection.getClass();
        this.a = dagVar;
        this.b = collection;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }
}
