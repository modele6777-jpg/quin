package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ji6 {
    public static final ji6 f = new ji6(0.0f, 29, 0);
    public final long a;
    public final List b;
    public final float c;
    public final float d;
    public final li6 e;

    /* JADX WARN: Illegal instructions before constructor call */
    public ji6(long j, li6 li6Var, float f2, li6 li6Var2, int i) {
        float f3 = (i & 8) != 0 ? -1.0f : 0.15f;
        li6 li6Var3 = (i & 16) != 0 ? li6.d : li6Var2;
        li6Var3.getClass();
        this(j, t72.J(li6Var), f2, f3, li6Var3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji6)) {
            return false;
        }
        ji6 ji6Var = (ji6) obj;
        long j = ji6Var.a;
        int i = y72.l;
        return faf.a(this.a, j) && pa7.t(this.b, ji6Var.b) && yi4.b(this.c, ji6Var.c) && Float.compare(this.d, ji6Var.d) == 0 && pa7.t(this.e, ji6Var.e);
    }

    public final int hashCode() {
        int i = y72.l;
        return this.e.hashCode() + ub3.a(this.d, ub3.a(this.c, tec.a(Long.hashCode(this.a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        return "HazeStyle(backgroundColor=" + y72.h(this.a) + ", tints=" + this.b + ", blurRadius=" + yi4.c(this.c) + ", noiseFactor=" + this.d + ", fallbackTint=" + this.e + ")";
    }

    public ji6(long j, List list, float f2, float f3, li6 li6Var) {
        li6Var.getClass();
        this.a = j;
        this.b = list;
        this.c = f2;
        this.d = f3;
        this.e = li6Var;
    }

    public ji6(float f2, int i, long j) {
        this((i & 1) != 0 ? y72.k : j, pu4.a, (i & 4) != 0 ? Float.NaN : f2, -1.0f, li6.d);
    }
}
