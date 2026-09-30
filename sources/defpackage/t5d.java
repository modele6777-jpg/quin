package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t5d {
    public final y6c a;
    public final y6c b;
    public final y6c c;

    public t5d() {
        y6c y6cVarB = a7c.b(4.0f);
        y6c y6cVarB2 = a7c.b(4.0f);
        y6c y6cVarB3 = a7c.b(0.0f);
        this.a = y6cVarB;
        this.b = y6cVarB2;
        this.c = y6cVarB3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5d)) {
            return false;
        }
        t5d t5dVar = (t5d) obj;
        return this.a.equals(t5dVar.a) && this.b.equals(t5dVar.b) && this.c.equals(t5dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(small=" + this.a + ", medium=" + this.b + ", large=" + this.c + ")";
    }
}
