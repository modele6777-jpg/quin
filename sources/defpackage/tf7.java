package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tf7 {
    public final t8f a;
    public final uf7 b;
    public final boolean c;
    public final boolean d;
    public final Set e;
    public final tjd f;

    public /* synthetic */ tf7(t8f t8fVar, boolean z, boolean z2, Set set, int i) {
        this(t8fVar, uf7.a, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : set, null);
    }

    public static tf7 a(tf7 tf7Var, uf7 uf7Var, boolean z, Set set, tjd tjdVar, int i) {
        t8f t8fVar = tf7Var.a;
        if ((i & 2) != 0) {
            uf7Var = tf7Var.b;
        }
        uf7 uf7Var2 = uf7Var;
        if ((i & 4) != 0) {
            z = tf7Var.c;
        }
        boolean z2 = z;
        boolean z3 = tf7Var.d;
        if ((i & 16) != 0) {
            set = tf7Var.e;
        }
        Set set2 = set;
        if ((i & 32) != 0) {
            tjdVar = tf7Var.f;
        }
        tf7Var.getClass();
        t8fVar.getClass();
        uf7Var2.getClass();
        return new tf7(t8fVar, uf7Var2, z2, z3, set2, tjdVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tf7)) {
            return false;
        }
        tf7 tf7Var = (tf7) obj;
        return pa7.t(tf7Var.f, this.f) && tf7Var.a == this.a && tf7Var.b == this.b && tf7Var.c == this.c && tf7Var.d == this.d;
    }

    public final int hashCode() {
        tjd tjdVar = this.f;
        int iHashCode = tjdVar != null ? tjdVar.hashCode() : 0;
        int iHashCode2 = this.a.hashCode() + (iHashCode * 31) + iHashCode;
        int iHashCode3 = this.b.hashCode() + (iHashCode2 * 31) + iHashCode2;
        int i = (iHashCode3 * 31) + (this.c ? 1 : 0) + iHashCode3;
        return (i * 31) + (this.d ? 1 : 0) + i;
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.a + ", flexibility=" + this.b + ", isRaw=" + this.c + ", isForAnnotationParameter=" + this.d + ", visitedTypeParameters=" + this.e + ", defaultType=" + this.f + ')';
    }

    public tf7(t8f t8fVar, uf7 uf7Var, boolean z, boolean z2, Set set, tjd tjdVar) {
        this.a = t8fVar;
        this.b = uf7Var;
        this.c = z;
        this.d = z2;
        this.e = set;
        this.f = tjdVar;
    }
}
