package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l7d {
    public final yof a;
    public final wc4 b;
    public final List c;
    public final List d;

    public l7d(yof yofVar, wc4 wc4Var, List list, c78 c78Var) {
        yofVar.getClass();
        wc4Var.getClass();
        c78Var.getClass();
        this.a = yofVar;
        this.b = wc4Var;
        this.c = list;
        this.d = c78Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7d)) {
            return false;
        }
        l7d l7dVar = (l7d) obj;
        return pa7.t(this.a, l7dVar.a) && pa7.t(this.b, l7dVar.b) && this.c.equals(l7dVar.c) && this.d.equals(l7dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + tec.a((this.b.a.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "Success(userProfileInfo=" + this.a + ", data=" + this.b + ", extraCards=" + this.c + ", followUpEntries=" + this.d + ")";
    }
}
