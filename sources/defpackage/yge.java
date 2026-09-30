package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yge {
    public final ks a;
    public final long b;

    public yge(ks ksVar, long j) {
        this.a = ksVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yge) {
            yge ygeVar = (yge) obj;
            if (this.a != ygeVar.a) {
                return false;
            }
            long j = ygeVar.b;
            int i = y72.l;
            if (faf.a(this.b, j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = y72.l;
        return Long.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        return "TarotBoxThumbnail(image=" + this.a + ", themeColor=" + y72.h(this.b) + ")";
    }
}
