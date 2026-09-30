package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class di4 {
    public final kg4 a;
    public final float b;

    public di4(kg4 kg4Var, float f) {
        this.a = kg4Var;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di4)) {
            return false;
        }
        di4 di4Var = (di4) obj;
        return this.a == di4Var.a && Float.compare(this.b, di4Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DomainScore(domain=" + this.a + ", score=" + this.b + ")";
    }
}
