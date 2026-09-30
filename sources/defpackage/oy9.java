package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oy9 {
    public final tt a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public oy9(tt ttVar, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = ttVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final hkb a(hkb hkbVar) {
        return hkbVar.k((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f)) & 4294967295L));
    }

    public final long b(long j, boolean z) {
        if (z) {
            long j2 = eue.b;
            if (eue.c(j, j2)) {
                return j2;
            }
        }
        int i = eue.c;
        int i2 = this.b;
        return u3c.b(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    public final hkb c(hkb hkbVar) {
        float f = -this.f;
        return hkbVar.k((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return mh3.o(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oy9) {
            oy9 oy9Var = (oy9) obj;
            if (this.a == oy9Var.a && this.b == oy9Var.b && this.c == oy9Var.c && this.d == oy9Var.d && this.e == oy9Var.e && Float.compare(this.f, oy9Var.f) == 0 && Float.compare(this.g, oy9Var.g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + ub3.a(this.f, ub3.b(this.e, ub3.b(this.d, ub3.b(this.c, ub3.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        ub3.u(sb, this.c, ", startLineIndex=", this.d, ", endLineIndex=");
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
