package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r3a {
    public final List a;
    public final Map b;
    public final boolean c;

    public r3a(Map map, boolean z, List list) {
        this.a = list;
        this.b = map;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3a)) {
            return false;
        }
        r3a r3aVar = (r3a) obj;
        return this.a.equals(r3aVar.a) && this.b.equals(r3aVar.b) && this.c == r3aVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ib8.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentShowedProduct(flex=");
        sb.append(this.a);
        sb.append(", subscriptions=");
        sb.append(this.b);
        sb.append(", loaded=");
        return ub3.m(sb, this.c, ")");
    }
}
