package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u82 implements bte {
    public final long a;

    public u82(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        j37.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.bte
    public final float a() {
        return y72.c(this.a);
    }

    @Override // defpackage.bte
    public final long b() {
        return this.a;
    }

    @Override // defpackage.bte
    public final b41 c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u82)) {
            return false;
        }
        long j = ((u82) obj).a;
        int i = y72.l;
        return faf.a(this.a, j);
    }

    public final int hashCode() {
        int i = y72.l;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return ib8.j("ColorStyle(value=", y72.h(this.a), ")");
    }
}
