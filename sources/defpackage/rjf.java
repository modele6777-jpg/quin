package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rjf {
    public final int a;
    public final ya2 b;

    public rjf(int i, za2 za2Var) {
        za2Var.getClass();
        this.a = i;
        this.b = za2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rjf)) {
            return false;
        }
        rjf rjfVar = (rjf) obj;
        return this.a == rjfVar.a && this.b.equals(rjfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "RequestSignal(requestNo=" + this.a + ", signal=" + this.b + ')';
    }
}
