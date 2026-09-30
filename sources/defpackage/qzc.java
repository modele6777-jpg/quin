package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qzc implements Runnable {
    public final a58 a;
    public final f48 b;
    public boolean c;

    public qzc(a58 a58Var, f48 f48Var) {
        f48Var.getClass();
        this.a = a58Var;
        this.b = f48Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            return;
        }
        this.a.e(this.b);
        this.c = true;
    }
}
