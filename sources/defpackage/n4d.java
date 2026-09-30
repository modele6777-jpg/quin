package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n4d {
    public final float a;
    public final float b;
    public final long c;
    public final int d;
    public final long e;
    public final b41 f;
    public final float g;

    public n4d(float f, float f2, long j, long j2, b41 b41Var, float f3, int i) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = i;
        if (b41Var instanceof dtd) {
            this.e = ((dtd) b41Var).a;
            this.f = null;
        } else {
            this.e = j2;
            this.f = b41Var;
        }
        this.g = mh3.n(f3, 0.0f, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n4d) {
            n4d n4dVar = (n4d) obj;
            if (yi4.b(this.a, n4dVar.a) && yi4.b(this.b, n4dVar.b) && this.c == n4dVar.c && this.g == n4dVar.g && this.d == n4dVar.d) {
                long j = n4dVar.e;
                int i = y72.l;
                if (faf.a(this.e, j) && pa7.t(this.f, n4dVar.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iB = ub3.b(this.d, ub3.a(this.g, ib8.b(ub3.a(this.b, Float.hashCode(this.a) * 31, 31), 31, this.c), 31), 31);
        int i = y72.l;
        int iB2 = ib8.b(iB, 31, this.e);
        b41 b41Var = this.f;
        return iB2 + (b41Var != null ? b41Var.hashCode() : 0);
    }

    public final String toString() {
        String strC = yi4.c(this.a);
        String strC2 = yi4.c(this.b);
        String strC3 = aj4.c(this.c);
        String strZ = kn2.Z(this.d);
        String strH = y72.h(this.e);
        StringBuilder sbO = ib8.o("Shadow(radius=", strC, ", spread=", strC2, ", offset=");
        sbO.append(strC3);
        sbO.append(", alpha=");
        sbO.append(this.g);
        sbO.append(", blendMode=");
        ub3.v(sbO, strZ, ", color=", strH, ", brush=");
        sbO.append(this.f);
        sbO.append(")");
        return sbO.toString();
    }

    public n4d(float f, long j, float f2, long j2, int i) {
        this(f, j, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0L : j2, (i & 16) != 0 ? 1.0f : 0.6f, 3);
    }

    public n4d(float f, long j, float f2, long j2, float f3, int i) {
        this(f, f2, j2, j == 16 ? y72.b : j, null, f3, i);
    }

    public n4d(dtd dtdVar) {
        this(24.0f, 0.0f, 0L, y72.b, dtdVar, 1.0f, 3);
    }
}
