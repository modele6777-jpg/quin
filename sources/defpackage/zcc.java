package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zcc implements u48, AutoCloseable {
    public final String a;
    public final ycc b;
    public boolean c;

    public zcc(String str, ycc yccVar) {
        this.a = str;
        this.b = yccVar;
    }

    public final void b(vea veaVar, h48 h48Var) {
        veaVar.getClass();
        h48Var.getClass();
        if (this.c) {
            qc0.p("Already attached to lifecycleOwner");
            return;
        }
        this.c = true;
        h48Var.a(this);
        veaVar.A(this.a, (pb2) this.b.b.f);
    }

    @Override // defpackage.u48
    public final void h(x48 x48Var, f48 f48Var) {
        if (f48Var == f48.ON_DESTROY) {
            this.c = false;
            x48Var.k().b(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
