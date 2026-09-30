package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ft1 {
    public final int a;
    public final et1 b;
    public final x16 c;

    public ft1(int i, et1 et1Var, x16 x16Var) {
        et1Var.getClass();
        x16Var.getClass();
        this.a = i;
        this.b = et1Var;
        this.c = x16Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft1)) {
            return false;
        }
        ft1 ft1Var = (ft1) obj;
        return this.a == ft1Var.a && this.b == ft1Var.b && pa7.t(this.c, ft1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "CardReturnTransition(cardIndex=" + this.a + ", phase=" + this.b + ", onFinished=" + this.c + ")";
    }
}
