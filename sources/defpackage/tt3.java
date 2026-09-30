package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tt3 implements Comparable {
    public final boolean a;
    public final boolean b;

    public tt3(rr5 rr5Var, int i) {
        this.a = (rr5Var.e & 1) != 0;
        this.b = hu0.n(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        tt3 tt3Var = (tt3) obj;
        return ta2.a.c(this.b, tt3Var.b).c(this.a, tt3Var.a).e();
    }
}
