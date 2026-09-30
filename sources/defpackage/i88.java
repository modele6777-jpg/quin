package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i88 {
    public final float a;
    public final float b;
    public final float c;

    public i88(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i88)) {
            return false;
        }
        i88 i88Var = (i88) obj;
        return yi4.b(this.a, i88Var.a) && yi4.b(this.b, i88Var.b) && yi4.b(this.c, i88Var.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + ub3.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        String strC = yi4.c(this.a);
        String strC2 = yi4.c(this.b);
        return ks0.l(ib8.o("ListTokens(contentPadding=", strC, ", itemSpacing=", strC2, ", pagePadding="), yi4.c(this.c), ")");
    }
}
