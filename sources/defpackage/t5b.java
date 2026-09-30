package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t5b implements u5b {
    public final List a;
    public final int b;
    public final int c;

    public t5b(List list, int i) {
        int size = list.size();
        list.getClass();
        this.a = list;
        this.b = i;
        this.c = size;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5b)) {
            return false;
        }
        t5b t5bVar = (t5b) obj;
        return pa7.t(this.a, t5bVar.a) && this.b == t5bVar.b && this.c == t5bVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ub3.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(questions=");
        sb.append(this.a);
        sb.append(", currentIndex=");
        sb.append(this.b);
        sb.append(", total=");
        return tec.g(this.c, ")", sb);
    }
}
