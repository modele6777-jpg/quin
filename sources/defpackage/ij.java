package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ij {
    public final n07 a;
    public final Set b;
    public final boolean c;

    public ij(n07 n07Var, Set set, boolean z) {
        this.a = n07Var;
        this.b = set;
        this.c = z;
    }

    public final boolean a() {
        n07 n07Var = this.a;
        return (n07Var.g() != hj.CurrentDecks || v4e.Q(n07Var.y()) || this.b.isEmpty() || this.c) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij)) {
            return false;
        }
        ij ijVar = (ij) obj;
        return this.a.equals(ijVar.a) && this.b.equals(ijVar.b) && this.c == ijVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AllDecksOffer(product=");
        sb.append(this.a);
        sb.append(", currentDecks=");
        sb.append(this.b);
        sb.append(", alreadyPurchased=");
        return ub3.m(sb, this.c, ")");
    }
}
