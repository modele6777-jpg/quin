package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l62 {
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    public l62(String str, boolean z, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l62)) {
            return false;
        }
        l62 l62Var = (l62) obj;
        return pa7.t(this.a, l62Var.a) && this.b == l62Var.b && pa7.t(this.c, l62Var.c) && pa7.t(this.d, l62Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + tec.a(ub3.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "CloudPage(nextCursor=" + this.a + ", hasMore=" + this.b + ", divinationChatIds=" + this.c + ", quickDecisionChatIds=" + this.d + ")";
    }
}
