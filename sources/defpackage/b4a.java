package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b4a {
    public final int a;
    public final List b;
    public final boolean c;

    public b4a(int i, List list, boolean z) {
        this.a = i;
        this.b = list;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4a)) {
            return false;
        }
        b4a b4aVar = (b4a) obj;
        return this.a == b4aVar.a && this.b.equals(b4aVar.b) && this.c == b4aVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + tec.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaywallBenefitGroup(title=");
        sb.append(this.a);
        sb.append(", benefits=");
        sb.append(this.b);
        sb.append(", included=");
        return ub3.m(sb, this.c, ")");
    }
}
