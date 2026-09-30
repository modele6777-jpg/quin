package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d1e implements c1e {
    public final xh0 a = new xh0(0);

    public final boolean h(int i) {
        return (this.a.get() & i) != 0;
    }

    public final void i(int i) {
        xh0 xh0Var;
        int i2;
        do {
            xh0Var = this.a;
            i2 = xh0Var.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!xh0Var.compareAndSet(i2, i2 | i));
    }
}
