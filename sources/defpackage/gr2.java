package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gr2 implements ir2 {
    public final List a;
    public final List b;
    public final String c;

    public gr2(String str, List list, List list2) {
        list2.getClass();
        str.getClass();
        this.a = list;
        this.b = list2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr2)) {
            return false;
        }
        gr2 gr2Var = (gr2) obj;
        return this.a.equals(gr2Var.a) && pa7.t(this.b, gr2Var.b) && pa7.t(this.c, gr2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + tec.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhysicalDeckReading(cards=");
        sb.append(this.a);
        sb.append(", patterns=");
        sb.append(this.b);
        sb.append(", question=");
        return ks0.l(sb, this.c, ")");
    }
}
