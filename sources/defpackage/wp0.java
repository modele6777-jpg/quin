package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wp0 {
    public final is4 a;
    public final is4 b;
    public final int c;
    public final ArrayList d;

    public wp0(is4 is4Var, is4 is4Var2, int i, ArrayList arrayList) {
        this.a = is4Var;
        this.b = is4Var2;
        this.c = i;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wp0) {
            wp0 wp0Var = (wp0) obj;
            if (this.a == wp0Var.a && this.b == wp0Var.b && this.c == wp0Var.c && this.d.equals(wp0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        return "In{edge=" + this.a + ", postviewEdge=" + this.b + ", inputFormat=" + this.c + ", outputFormats=" + this.d + "}";
    }
}
