package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dhe {
    public final long a;
    public final cge b;
    public final bhe c;

    public dhe(long j, cge cgeVar, bhe bheVar) {
        bheVar.getClass();
        this.a = j;
        this.b = cgeVar;
        this.c = bheVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhe)) {
            return false;
        }
        dhe dheVar = (dhe) obj;
        return this.a == dheVar.a && this.b.equals(dheVar.b) && pa7.t(this.c, dheVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "TarotBoxThumbnailCacheLease(id=" + this.a + ", pose=" + this.b + ", cache=" + this.c + ")";
    }
}
