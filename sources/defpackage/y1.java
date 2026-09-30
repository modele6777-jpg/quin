package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y1 implements Runnable {
    public final f2 a;
    public final m88 b;

    public y1(f2 f2Var, m88 m88Var) {
        this.a = f2Var;
        this.b = m88Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a != this) {
            return;
        }
        if (f2.f.m(this.a, this, f2.i(this.b))) {
            f2.f(this.a, false);
        }
    }
}
