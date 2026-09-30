package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ata {
    public final int a;
    public final long b;

    public ata(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ata)) {
            return false;
        }
        ata ataVar = (ata) obj;
        if (this.a != ataVar.a) {
            return false;
        }
        long j = ataVar.b;
        int i = y72.l;
        return faf.a(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        int i = y72.l;
        return Long.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        return "PremiumCardVisuals(backgroundRes=" + this.a + ", panelColor=" + y72.h(this.b) + ")";
    }
}
