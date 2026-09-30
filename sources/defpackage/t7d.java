package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t7d implements r7d {
    public final List a;
    public final xw9 b;
    public final float c;
    public final a26 d;

    public t7d(List list, bx9 bx9Var, float f, x8d x8dVar, int i) {
        bx9Var = (i & 2) != 0 ? new bx9(0.0f, 0.0f, 0.0f, 0.0f) : bx9Var;
        f = (i & 4) != 0 ? 0.0f : f;
        x8dVar = (i & 16) != 0 ? null : x8dVar;
        this.a = list;
        this.b = bx9Var;
        this.c = f;
        this.d = x8dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7d)) {
            return false;
        }
        t7d t7dVar = (t7d) obj;
        return this.a.equals(t7dVar.a) && this.b.equals(t7dVar.b) && yi4.b(this.c, t7dVar.c) && pa7.t(this.d, t7dVar.d);
    }

    public final int hashCode() {
        int iA = ub3.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 961);
        a26 a26Var = this.d;
        return iA + (a26Var == null ? 0 : a26Var.hashCode());
    }

    public final String toString() {
        return "ShareDocumentRow(cells=" + this.a + ", padding=" + this.b + ", spacing=" + yi4.c(this.c) + ", background=null, foreground=" + this.d + ")";
    }
}
