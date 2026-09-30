package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ok1 {
    public final boolean a;
    public final boolean b;

    public ok1(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok1)) {
            return false;
        }
        ok1 ok1Var = (ok1) obj;
        return this.a == ok1Var.a && this.b == ok1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ValidationCriteria(checkBack=" + this.a + ", checkFront=" + this.b + ')';
    }
}
