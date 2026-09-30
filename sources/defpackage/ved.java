package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ved implements iea {
    public final long a;
    public final l27 b;

    public ved(long j, l27 l27Var) {
        this.a = j;
        this.b = l27Var;
    }

    public final ibb a(long j, float f) {
        long j2 = this.a;
        List listI = t72.I(new y72(y72.b(j2, 0.0f)), new y72(j2), new y72(y72.b(j2, 0.0f)));
        long jP = ynb.p(0.0f, 0.0f);
        float fMax = Math.max(ald.d(j), ald.b(j)) * f * 2.0f;
        return new ibb(listI, null, jP, fMax < 0.01f ? 0.01f : fMax);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ved)) {
            return false;
        }
        ved vedVar = (ved) obj;
        long j = vedVar.a;
        int i = y72.l;
        return faf.a(this.a, j) && this.b.equals(vedVar.b) && Float.compare(0.6f, 0.6f) == 0;
    }

    public final int hashCode() {
        int i = y72.l;
        return Float.hashCode(0.6f) + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shimmer(highlightColor=");
        ks0.s(this.a, ", animationSpec=", sb);
        sb.append(this.b);
        sb.append(", progressForMaxAlpha=0.6)");
        return sb.toString();
    }
}
