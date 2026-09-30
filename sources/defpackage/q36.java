package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface q36 extends wj5 {
    static /* synthetic */ wj5 d(q36 q36Var, pv2 pv2Var, int i, i41 i41Var, int i2) {
        if ((i2 & 1) != 0) {
            pv2Var = nu4.a;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            i41Var = i41.a;
        }
        return q36Var.c(pv2Var, i, i41Var);
    }

    wj5 c(pv2 pv2Var, int i, i41 i41Var);
}
