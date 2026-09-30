package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o4d {
    public static final o4d d;
    public final long a;
    public final long b;
    public final float c;

    static {
        d = new o4d((7 & 1) != 0 ? abg.d(4278190080L) : 0L, 0L, (7 & 4) != 0 ? 0.0f : 1.0f);
    }

    public o4d(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4d)) {
            return false;
        }
        o4d o4dVar = (o4d) obj;
        long j = o4dVar.a;
        int i = y72.l;
        return faf.a(this.a, j) && hl9.c(this.b, o4dVar.b) && this.c == o4dVar.c;
    }

    public final int hashCode() {
        int i = y72.l;
        return Float.hashCode(this.c) + ib8.b(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("Shadow(color=", y72.h(this.a), ", offset=", hl9.i(this.b), ", blurRadius=");
        sbO.append(this.c);
        sbO.append(")");
        return sbO.toString();
    }
}
