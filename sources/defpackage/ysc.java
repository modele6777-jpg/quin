package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ysc {
    public static final ysc c;
    public static final ysc d;
    public final long a;
    public final long b;

    static {
        ysc yscVar = new ysc(0L, 0L);
        new ysc(Long.MAX_VALUE, Long.MAX_VALUE);
        c = new ysc(Long.MAX_VALUE, 0L);
        new ysc(0L, Long.MAX_VALUE);
        d = yscVar;
    }

    public ysc(long j, long j2) {
        pa7.A(j >= 0);
        pa7.A(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ysc.class == obj.getClass()) {
            ysc yscVar = (ysc) obj;
            if (this.a == yscVar.a && this.b == yscVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
