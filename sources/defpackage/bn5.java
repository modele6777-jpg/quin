package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bn5 {
    public final void a(tn8 tn8Var, tn8 tn8Var2, long j) {
        long jY = kj0.Y(j, hw7.a);
        if (tn8Var != null) {
            int iN = tn8Var.n(kl2.g(jY));
            new o67(o67.a(iN, tn8Var.V(iN)));
        }
        if (tn8Var2 != null) {
            int iN2 = tn8Var2.n(kl2.g(jY));
            new o67(o67.a(iN2, tn8Var2.V(iN2)));
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bn5);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ub3.b(0, an5.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + an5.a + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
