package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m7a implements o7a {
    public final e8d a;

    public m7a(e8d e8dVar) {
        this.a = e8dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m7a) && this.a == ((m7a) obj).a;
    }

    @Override // defpackage.o7a
    public final e8d getFormat() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Save(format=" + this.a + ")";
    }
}
