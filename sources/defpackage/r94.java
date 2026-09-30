package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r94 implements AutoCloseable {
    public final p94 a;
    public boolean b;
    public final /* synthetic */ x94 c;

    public r94(x94 x94Var, p94 p94Var) {
        this.c = x94Var;
        this.a = p94Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        x94 x94Var = this.c;
        synchronized (x94Var.v) {
            p94 p94Var = this.a;
            int i = p94Var.h - 1;
            p94Var.h = i;
            if (i == 0 && p94Var.f) {
                x94Var.R(p94Var);
            }
        }
    }
}
