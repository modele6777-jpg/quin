package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
public final class jxe {
    public static final ixe Companion = new ixe();
    public final long a;
    public final long b;
    public final long c;

    public /* synthetic */ jxe(int i, long j, long j2, long j3) {
        if (1 != (i & 1)) {
            an1.R(i, 1, hxe.a.e());
            throw null;
        }
        this.a = j;
        this.b = (i & 2) == 0 ? j * 1000 : j2;
        if ((i & 4) == 0) {
            this.c = j / 1000;
        } else {
            this.c = j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jxe) && this.a == ((jxe) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "Time(ms=" + this.a + ')';
    }

    public jxe(long j) {
        this.a = j;
        this.b = j * 1000;
        this.c = j / 1000;
    }
}
