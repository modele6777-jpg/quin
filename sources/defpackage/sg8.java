package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface sg8 {
    bv7 a(bv7 bv7Var);

    default long c(bv7 bv7Var, bv7 bv7Var2) {
        bv7 bv7VarA = a(bv7Var);
        bv7 bv7VarA2 = a(bv7Var2);
        if (bv7VarA instanceof og8) {
            return ((og8) bv7VarA).O(bv7VarA2, 0L, true);
        }
        return bv7VarA2 instanceof og8 ? ((og8) bv7VarA2).O(bv7VarA, 0L, true) ^ (-9223372034707292160L) : bv7VarA.O(bv7VarA, 0L, true);
    }
}
