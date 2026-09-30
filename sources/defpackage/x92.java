package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x92 {
    public final String a;
    public final List b;

    public x92(String str, List list) {
        str.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x92)) {
            return false;
        }
        x92 x92Var = (x92) obj;
        return pa7.t(this.a, x92Var.a) && this.b.equals(x92Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ComicsSection(title=" + this.a + ", list=" + this.b + ")";
    }
}
