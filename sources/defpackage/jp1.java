package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jp1 {
    public final long a;
    public final float b;
    public final v6c c;
    public final v6c d;
    public final float e;
    public final float f;
    public final float g;

    public jp1(long j, float f, v6c v6cVar, v6c v6cVar2, float f2, float f3, float f4) {
        this.a = j;
        this.b = f;
        this.c = v6cVar;
        this.d = v6cVar2;
        this.e = f2;
        this.f = f3;
        this.g = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp1)) {
            return false;
        }
        jp1 jp1Var = (jp1) obj;
        return hl9.c(this.a, jp1Var.a) && Float.compare(this.b, jp1Var.b) == 0 && this.c.equals(jp1Var.c) && this.d.equals(jp1Var.d) && Float.compare(this.e, jp1Var.e) == 0 && Float.compare(this.f, jp1Var.f) == 0 && Float.compare(this.g, jp1Var.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + ub3.a(this.f, ub3.a(this.e, (this.d.hashCode() + ((this.c.hashCode() + ub3.a(this.b, Long.hashCode(this.a) * 31, 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        String strI = hl9.i(this.a);
        StringBuilder sb = new StringBuilder("CardBounds(centerOffset=");
        sb.append(strI);
        sb.append(", offsetAdjustment=");
        sb.append(this.b);
        sb.append(", shuffleRect=");
        sb.append(this.c);
        sb.append(", initialRect=");
        sb.append(this.d);
        sb.append(", cardWidthPx=");
        ks0.w(sb, this.e, ", cardHeightPx=", this.f, ", stackScale=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
