package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y27 implements z27 {
    public final String a;
    public final List b;
    public final List c;

    public y27(String str, List list, List list2) {
        str.getClass();
        list2.getClass();
        this.a = str;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y27)) {
            return false;
        }
        y27 y27Var = (y27) obj;
        return pa7.t(this.a, y27Var.a) && this.b.equals(y27Var.b) && pa7.t(this.c, y27Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + tec.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhysicalDeckReadingConversation(question=");
        sb.append(this.a);
        sb.append(", cards=");
        sb.append(this.b);
        sb.append(", patternData=");
        return ks0.n(sb, this.c, ")");
    }
}
