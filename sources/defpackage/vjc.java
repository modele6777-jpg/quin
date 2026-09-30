package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vjc {
    public final long a;
    public final int b;

    public vjc(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjc)) {
            return false;
        }
        vjc vjcVar = (vjc) obj;
        return hl9.c(this.a, vjcVar.a) && this.b == vjcVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SeasonalDebugTapInfo(position=" + hl9.i(this.a) + ", detectedCardIndex=" + this.b + ")";
    }
}
