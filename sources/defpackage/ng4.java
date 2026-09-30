package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ng4 {
    public final String a;
    public final float b;
    public final long c;

    public ng4(String str, float f) {
        long jD = abg.d(2291960296L);
        str.getClass();
        this.a = str;
        this.b = f;
        this.c = jD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng4)) {
            return false;
        }
        ng4 ng4Var = (ng4) obj;
        if (!pa7.t(this.a, ng4Var.a) || Float.compare(this.b, ng4Var.b) != 0) {
            return false;
        }
        long j = ng4Var.c;
        int i = y72.l;
        return faf.a(this.c, j);
    }

    public final int hashCode() {
        int iA = ub3.a(this.b, this.a.hashCode() * 31, 31);
        int i = y72.l;
        return Long.hashCode(this.c) + iA;
    }

    public final String toString() {
        String strH = y72.h(this.c);
        StringBuilder sb = new StringBuilder("DomainDimension(name=");
        sb.append(this.a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append(", color=");
        return ks0.l(sb, strH, ")");
    }
}
